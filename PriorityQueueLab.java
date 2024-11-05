// import statements
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.LinkedList;
public class PriorityQueueLab {
    public static void main(String[] args){
        PriorityQueue<Integer> pqNums = new PriorityQueue<>();
        File file = new File("RandIntegers.txt");
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
            pqNums.add(Integer.parseInt(scan.nextLine()));
            }
        }
        catch(FileNotFoundException e){
            System.out.println("No File Found");
        }
        while(!pqNums.isEmpty()){
            System.out.println(pqNums.remove());
        }
        }
    
    }
  


