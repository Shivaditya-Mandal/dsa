package backtracking;

public class find_subsets {
    public static void findAllSubsets(String str ,int i, String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");     
            }else{
                System.out.println(ans);
            }
            return;
        }
        findAllSubsets(str,i+1,ans+str.charAt(i)); // char chose yes
        findAllSubsets(str, i+1, ans); // char chose no

    }
    public static void main(String[] args) {
        String str ="abc";
        findAllSubsets(str, 0, "");
    }
}
