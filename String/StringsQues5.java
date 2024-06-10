package String;
/*

 * String compression 
 * "aaabbsss" => "a3b2s3"
 * "qqweeee"  => "q2we4"

 */
public class StringsQues5 {
    public static String stringCompression(String str){
        StringBuilder sb=new StringBuilder("");
        Integer count;
        for(int i=0; i<str.length(); i++){
            count=1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }     
            sb.append(str.charAt(i)); 
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1="aaabbsss";
        String str2="qqweeee";
        System.out.println(stringCompression(str1));
        System.out.println(stringCompression(str2));
    }
}
