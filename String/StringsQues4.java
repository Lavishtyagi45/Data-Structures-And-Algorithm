package String;
/*
 
 * for a given String convert each first letter
   of each word to UpperCase 

*/

public class StringsQues4 {
    public static void main(String[] args) {
        String str="hi, i am lavish tyagi";
        System.out.println(toUpperCase(str));

    }
    
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            ch= str.charAt(i);
            if(ch == ' ' && i < str.length()-1 ){
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    
}
