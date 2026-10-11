package hash.hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashImp {

    static class HashMap<K, V> {

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;

        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {

            this.n = 0;

            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {

            int hc = key.hashCode();

            return Math.floorMod(hc, buckets.length);
        }

        private int SearchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            int di = 0;

            for (Node node : ll) {

                if (node.key.equals(key)) {
                    return di;
                }

                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {

            LinkedList<Node>[] oldBucket = buckets;

            buckets = new LinkedList[oldBucket.length * 2];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Reset the number of elements before reinserting
            n = 0;

            for (int i = 0; i < oldBucket.length; i++) {

                LinkedList<Node> l1 = oldBucket[i];

                while (!l1.isEmpty()) {

                    Node node = l1.remove();

                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {

            int bi = hashFunction(key);

            int di = SearchInLL(key, bi);

            if (di != -1) {

                Node node = buckets[bi].get(di);

                node.value = value;

            } else {

                buckets[bi].add(new Node(key, value));

                n++;
            }

            double lambda = (double) n / buckets.length;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {

            int bi = hashFunction(key);

            int di = SearchInLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V get(K key) {

            int bi = hashFunction(key);

            int di = SearchInLL(key, bi);

            if (di != -1) {

                Node node = buckets[bi].get(di);

                return node.value;

            } else {

                return null;
            }
        }

        public V remove(K key) {

            int bi = hashFunction(key);

            int di = SearchInLL(key, bi);

            if (di != -1) {

                Node node = buckets[bi].remove(di);

                n--;

                return node.value;
            }

            return null;
        }

        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {

                LinkedList<Node> ll = buckets[i];

                for (Node node : ll) {

                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {

            return n == 0;
        }

    } // HashMap class ends here

    public static void main(String args[]) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 80);
        hm.put("nepal", 50);

        ArrayList<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key);
        }
    }

} 