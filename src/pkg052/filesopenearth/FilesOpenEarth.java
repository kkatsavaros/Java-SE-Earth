package pkg052.filesopenearth;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FilesOpenEarth {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {  
        
        //FileReader fr= new FileReader("Kavala.txt");        
        FileReader fr= new FileReader("A Journey into the Interior of the Earth.txt");        
        BufferedReader br=new BufferedReader(fr); //κληρονομικότητα.        
        //System.out.println(br.ready());         
        
        if(br.ready()){
            System.out.println("Το αρχείο άνοιξε.");
        }
        
        
        // Bάζω το αρχείο σε ένα String, all 
        String line=null;
        String all="";
        while ( (line=br.readLine())!=null){
            all=all.concat(line);
        }     
        
        all=all.toUpperCase();
        all=all.replace(",","");
        all=all.replace("?","");
        all=all.replace(".","");
        all=all.replace(";","");
        all=all.replace("[","");
        all=all.replace("]","");
        all=all.replace("(","");
        all=all.replace(")","");
        all=all.replace("!","");    
        all=all.replace("\"","");   
        //all=all.replace("'","");   
        
        
        // Το κόβω σε κάθε space και βάζω κάθε λέξη σε μία θέση πίνακα.
        String[] pinakas=all.split("\\s+");

        int lengthOfThePinakas;
        lengthOfThePinakas=pinakas.length;
        System.out.println("\nΥπάρχουν "+ lengthOfThePinakas +" λέξεις.");        
        
        // ----------------------------------------------------------------------
        // Απάντηση στο 1ο ερώτημα.
        Scanner input=new Scanner(System.in);  
        String userInput;
        System.out.println("Γράψε μια λέξη για να σου γράψω πόσες φορές εμφανίζεται : ");
        userInput=input.next();
        userInput=userInput.toUpperCase();
        
        int count=0;
        for (String element : pinakas) {
             if(element.equals(userInput)){
                count++;
             }
        }
        
        System.out.println("");
        System.out.println("H λέξη: "+ userInput +"  Υπάρχει "+count+" φορές σε σύνολο "
                + lengthOfThePinakas +" λέξεων.");
        // ----------------------------------------------------------------------
                    
        // ----------------------------------------------------------------------
        // Απάντηση στο 2ο ερώτημα.
        CaclulateHowManyTimesWordsAre.countFreq(pinakas, lengthOfThePinakas); 
        // ----------------------------------------------------------------------
        
        br.close();        
    }
    
}
