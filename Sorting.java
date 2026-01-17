public class Sorting{
   
    /*  INDEX FOR SORTING 

    1)  To print Array 
    2)  Bubble Sort 
    3)  Selection Sort 
    4)  Insertion Sort
    5)  Code to print All Subset
    
    */
    



     // to print array

    public static void print(int arr[]){
        for(int i = 0 ; i < arr.length ;i++){
            System.out.print(arr[i]+ "  ");
        }
    }


    

    // bubble sort on array 
    public static void bubbleSort(int arr[]){
        for(int i = 0 ; i < arr.length-1 ;i++){
            for(int j = 0 ; j < arr.length -1-i;j++){
   if(arr[j] > arr[j+1]){
    int a = arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=a;
}
            }
        }
    }



   

    // selection sort
    public static void selectiionSort(int arr[]){
        for(int i = 0 ; i <arr.length -1;i++){
            int min=i;
            for(int j = i +1; j <arr.length ;j++){
               if(arr[j]< arr[min]){
                min=j;
               }
            }
            int a = arr[i];
            arr[i]=arr[min];
            arr[min]=a;
        }
    }



  // insertion sort
    public static void insertionSort(int arr[]){

        for(int i = 0 ; i <arr.length -1;i++){
            int curr=i;
int j=i+1;
           while(j>0){
               if(arr[j]> arr[curr]){
break;               }else{
 int a = arr[j];
            arr[j]=arr[curr];
            arr[curr]=a;
            j--;
            curr--;
}
            }
           
        }
    }




    // code to print all subset
    public static void subset(int arr[]){
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = i ; j < arr.length ;j++){
                for(int k = i ; k <=j ;k++){
                    System.out.print(arr[k]+ "  ");
                }
                System.out.println("");
            }
        }
    }



   
    public static void main(String[] args){
      int arr[]={2,11,3,4,5,1,6,7,0,8};
      bubbleSort(arr);
      print(arr);
   
   
}
}