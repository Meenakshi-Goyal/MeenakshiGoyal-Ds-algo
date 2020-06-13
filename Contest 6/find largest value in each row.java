import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class BT{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        ArrayList arl = new ArrayList();
        int n = sc.nextInt();
        int reel=n;
        for(int i = 0 ; i<n;i++){
            String a= in.nextLine();
            if(a.equals(null))
                arl.add(null);
            else
                arl.add(a);
        }
        int count=0;
        int j=0;
        int p=0;
        LinkedList ls = new LinkedList();
        while(count!=n){
            int max=0;
            int check;
            int i=1;
            while(i<=Math.pow(2,p) && reel>0){
                count++;
                if(arl.get(j).equals("null"))
                    check=0;
                else
                    check=Integer.parseInt(arl.get(j).toString());
                max = max > check  ? max:check;
                reel--;
                i++;
                j++;
            }
            p++;
            ls.add(max);
        }
        System.out.println(ls);
    }
}
