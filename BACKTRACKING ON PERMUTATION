public class Main{
    public static void findPermutation(String Str,String ans) {
        //base case
        if (Str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < Str.length(); i++) {
            char curr = Str.charAt(i);
          String NewStr= Str.substring(0, i) + Str.substring(i + 1);

            findPermutation(NewStr, ans + curr);
        }

    }
    public static void main(String[] args) {
String str="abc";
findPermutation(str,"");
    }
}
