public class Abstraction {
    public static void main(String[] args) {
        int arr[] = {45,22,89,16,90,33};
        int mini = arr[0];
        int maxi = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>maxi)
            {
                maxi= arr[i];
                arr[i]++;


            }
            if(arr[i]<mini)
            {
                mini= arr[i];
                arr[i]++;
            }


        }
        System.out.println("Maximum "+maxi);
        System.out.println("Mini "+ mini);
    }


}
