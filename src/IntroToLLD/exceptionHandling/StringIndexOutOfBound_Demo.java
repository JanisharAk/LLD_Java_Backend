package IntroToLLD.exceptionHandling;

public class StringIndexOutOfBound_Demo {
    public static void main(String[] args) {
        try{
            String str = "abdwkc"; //length == 6
            char ch = str.charAt(8);
            System.out.println(ch);// as ch is asking for 8
        }
        catch( StringIndexOutOfBoundsException e ){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
