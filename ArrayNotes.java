package arraynotes;

/**
 *
 * @author 802967
 */
public class ArrayNotes {

    public static void main(String[] args) {
        //create an array with literal
        int[] favNums = {17, 36, 18,20,4,7,-85,15,7,31,11,9,1,0,23};
        //use one value in array
        System.out.println(favNums[6]);
        //changes one value
        favNums[0]=37;
        System.out.println(favNums[0]);
        
        //displays all values in an array
        for (int i = 0; i<favNums.length;i++) {
            System.out.print(favNums[i]+" ");
        }
        System.out.println(" ");
        
        //creates an empty array
        int[] randoms = new int[10];
        //use loop to fill all spots
        for (int i = 0; i<randoms.length; i++) {
        randoms[i] = (int)(Math.random()*100);
        System.out.print(randoms[i]+" ");
        }
        
        // for (int i = 0; 0<randoms.length; i++) {
    
         }
    }
    

