// 1. Write a program to count the occurrences of each word the text file provided. 
// A Journey into the Interior of the Earth.txt).
// 2. Allow the user to type a word and report how many times that word appeared in the book.
// 3. Report all words that appeared in the book at least 500 times, in alphabetical order.

package pkg052.filesopenearth;


import java.util.Map;
import java.util.TreeMap;


public class CaclulateHowManyTimesWordsAre {    
    
    static void countFreq(String pinakas[], int n) { 
        
        //Loop έτσι και αλλιώς.
        TreeMap<String, Integer> mp = new TreeMap<>();  
        
//        for(String element:pinakas){
//            System.out.println(element);
//        }
        
        //System.out.println("------>" + n);
        
        for (int i = 0; i < n; i++){ // Το μήκος του πίνακα.
        
            // Αν υπάρχει ήδη στον πίνακα αύξησε την value κατά 1
            if (mp.containsKey(pinakas[i])) { 
                mp.put(pinakas[i], mp.get(pinakas[i]) + 1); 
            }else{ 
            // Αν δεν υπάρχειυπάρχει ήδη στον πίνακα βάλτο και γράψε 1.
                mp.put(pinakas[i], 1); 
            } 
        }         
        System.out.println("");
        // Loopάρω και εμφανίζω.
        int count=0;
        for (Map.Entry<String, Integer> entry : mp.entrySet()) { 
            //System.out.println(count + " : "+ entry.getKey() + " => " + entry.getValue());
           
            
            if(entry.getValue() >500){
                System.out.println("Η λέξη "+ entry.getKey() + " εμφανίζεται  " 
                        + entry.getValue()+" φορές.");
            }
             count++;
        } 
        
        
        
     
        
    }
}
