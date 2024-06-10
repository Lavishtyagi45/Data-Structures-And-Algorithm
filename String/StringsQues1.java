package String;
public class StringsQues1 {
    
    // Ques: Check if a sting is palindrome or not     O(n/2)

    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                // not palindrome
                return false;
            }
        }
        // palindrome
        return true;
    }

    //main function
    public static void main(String[] args) {
        String str="racecar";
        Boolean value=isPalindrome(str);
        if(value==true){
            System.out.println("String "+str+" is palindrome");
        }
        else{
            System.out.println("String "+str+" is not palindrome");
        }
    }
}
