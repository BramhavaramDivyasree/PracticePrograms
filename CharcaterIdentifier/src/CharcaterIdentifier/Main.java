package CharcaterIdentifier;

import java.util.Scanner;

public class Main

{

public static void identifyCharacter(char ch)

{

 if(Character.isLowerCase(ch)&&isVowel(ch)) {
	 System.out.println("lower case vowel");
 }
 else if(Character.isUpperCase(ch)&&isVowel(ch)){
	 System.out.println("Upper case vowel");
	
 }
 else if (Character.isLowerCase(ch) && Character.isLetter(ch)) {
     System.out.println("Lower-case consonant");
 } else if (Character.isUpperCase(ch) && Character.isLetter(ch)) {
     System.out.println("Upper-case consonant");
 } else if (Character.isDigit(ch)) {
     System.out.println("Digit");
 } else {
     System.out.println("Special character");
 }

}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the Charcater");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
	

}
public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
}


