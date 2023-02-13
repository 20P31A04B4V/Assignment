import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class uniqueNumber {
    public static void isuniqueNum(int[] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()==1)
            System.out.println("unique number: "+ entry.getKey());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        isuniqueNum(arr);
        sc.close();
        

        
        
    }
    
}
