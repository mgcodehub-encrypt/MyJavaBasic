public class FindFirstThreeLargeNumber {

    public static void main(String[] args) {
        int[] arr = {23,13,43,33,66,77,0,2,5,10};

        int firstLargeNumber=0;
        int secondLargeNumber=0;

        int thirdLargeNumber=0;


        for(int i=0;i<arr.length;i++){

            if(arr[i]>firstLargeNumber){
                thirdLargeNumber=secondLargeNumber;
                secondLargeNumber=firstLargeNumber;
                firstLargeNumber=arr[i];
            }else if(arr[i]>secondLargeNumber && arr[i]!=firstLargeNumber){
                thirdLargeNumber=secondLargeNumber;
                secondLargeNumber=arr[i];
            }else if(arr[i]>thirdLargeNumber && arr[i]!=secondLargeNumber && arr[i]!=firstLargeNumber){
                thirdLargeNumber=arr[i];
            }
        }
        System.out.println(firstLargeNumber);
        System.out.println(secondLargeNumber);
        System.out.println(thirdLargeNumber);
        System.out.println("Hello World");
    }
}
