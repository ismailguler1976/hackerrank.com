package guler.solutions;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionMap1 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myContacts = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myContacts.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(myContacts.containsKey(s)) {
            	System.out.println(s+"="+myContacts.get(s));
            } else {
            	System.out.println("Not found");
            }
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        in.close();
    }
}
