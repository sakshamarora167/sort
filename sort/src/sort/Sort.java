package sort;


import java.util.Scanner;

public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input the size of list : ");
        int size = s.nextInt();
        int dyn_size=size;
        int list[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the number");
            list[i]=s.nextInt();
        }
        for(int i=0;i<size;i++){
            for (int j=0;j<dyn_size-1;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j+1];
                    list[j+1]=list[j];
                    list[j]=temp;
                }
            }
            dyn_size-=i;
        }
        System.out.println(java.util.Arrays.toString(list));
    }
    
    
}
