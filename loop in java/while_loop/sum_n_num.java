

import java.util.Scanner;


public class sum_n_num {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int num=1;

        while(n>0){
            num=num+n;
            n--;

        }

        System.out.println(num);

    }
}
