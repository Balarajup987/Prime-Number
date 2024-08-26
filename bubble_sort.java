import java.util.Scanner;

public class bubble_sort {
//linear searching                    //take input
    public static int takeinput(String str){
        Scanner myObj=new Scanner(System.in);        
        System.out.println(str);
        int n=myObj.nextInt();
        return n;
    }
    public static int[] takearray(){                        //take array
        int len=takeinput("enter the length:");
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
                arr[i]=takeinput("enter data at "+" "+i);
            }
        return arr;
    }

    public static void print(int arr[]){            //print array
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){     //for passes
            int count=0;
            for(int j=0;j<arr.length-1-i;j++){   //for comparisons
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        int arr[]=takearray();
        print(arr);
        bubble_sort(arr);
        System.out.println("array after sorting:");
        print(arr);
    }
}
