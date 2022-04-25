import java.util.Arrays; 

public class SortString 
{ 
    public static void main(String[] args) 
    { 
        String originalString = "The details of java programing"; 
        String sortedString = "";
       
        char tempString[] = originalString.toCharArray(); 
       
        Arrays.sort(tempString); 
        
        sortedString = new String(tempString); 
        System.out.println("Original String : " + originalString); 
        System.out.println("Sorted String : " + sortedString); 
    } 
} 