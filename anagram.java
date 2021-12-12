import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner s =   new Scanner(System.in);
         String a = s.nextLine();
         String b = s.nextLine();
        boolean isAnagram = true;

        int al[] = new int[256];
        int bl[] = new int [256];
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(char c: a.toCharArray())
        {
            int index = (int) c;
            al[index]++;
        }
        for(char c: b.toCharArray()){
            int index = (int) c;
            bl[index]++;
        }
        for(int i=0;i<256;i++){
            if(al[i]!= bl[i]){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("anagram");

        }else
        {
            System.out.println("not anagram");  
        }

    }
    
}



//public class anagram {
//    public static void main(String[] args) {
//        
//        String a = "abb";
//        String b = "abb";
//        boolean isAnagram = true;
//
//        int al[] = new int[256];
//        for(char c: a.toCharArray())
//        {
//            int index = (int) c;
//            al[index]++; 
//        }
//        for(char c:b.toCharArray()){
//            int index = (int) c;
//            al[index]--;
//        }
//        for(int i=0;i<256;i++){
//            if(al[i]!=0) {
//                isAnagram = false;
//                break;
//            }
//        }
//        if(isAnagram){
//            System.out.println("anagram");
//
//        }else
//        {
//            System.out.println("not anagram");  
//        }
//
//    }
//    
//}
