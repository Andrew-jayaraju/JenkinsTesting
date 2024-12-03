public class StudentClass {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("This is project of Sum of all the elements of an Array");
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println(sum);
    }
}
