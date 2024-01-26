public class Main {
    public static void main(String[] args) {
        System.out.println(10*20+"book");
        System.out.println("book" + 10*20);
    }

    public static void fizzBuzz(int n) {
        for(int i=0;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

    }
}