package String;
public class Strings {

    /*

     * Strings are immutable - only new string formed for any change,
       there will be no change in the existing string .

     * also know about few function like equals - return boolean value 
       if equal then return true , if not equal then return false
       it only checks the value of variable not the address of memory in stack and heap

     * a="hello"
       substring : b= a.substring(0,2);  // ending index excluded
       b="he"
     
    */

    //print letters of a String
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    //main function 
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="ABCD";
        String str2=new String("xyz");
        String str3=new String(arr);  //convert char array into String

        System.out.println("length of string : "+ str.length());    //length is a function in string
        
        //concatenation
        String str4=str+" "+str2+" "+str3;
        System.out.println(str4); 

        //print letters
        printletters(str4);

        String str5="Abc";
        String str6="Abc";
        String str7=new String("Abc");

        if(str5==str6){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        if(str5==str7){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
            /* 
             this is due to the concept of interning
             if new keyword initialize any value 
             it make another variable in heap memory
             (inspite of any previous value stored in heap)
             it gives address of new variable in stack 
            */
        }

        if(str5.equals(str7)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
