public class Main {

    public static void main(String[] args) {

        System.out.print("First 10 Square Numbers: ");
        square(1, 1);

        System.out.print("\nFirst 10 Cube Numbers: ");
        cube(1, 1);

        System.out.print("\nFirst 10 Fibonacci Numbers from 1: ");
        fibonacci(0, 1, 1);

        System.out.print("\nFirst 10 Prime Numbers: ");
        primenum(1, 1);

        System.out.print("\nFirst 10 Triangle Numbers: ");
        triangle(1, 1);

    }

    public static void square(int x, int n){

        while(n<=10){
            int square = x*x;
            System.out.print(square + " ");
            x++;
            n++;
        }

    }

    public static void cube(int x, int n){

        while(n<=10){
            int cube = x*x*x;
            System.out.print(cube + " ");
            x++;
            n++;
        }

    }

    public static void fibonacci(int x, int y, int n){

        while(n<=10){
            int sum = x+y;
            System.out.print(sum + " ");
            x = y;
            y = sum;
            n++;
        }

    }

    public static void primenum(int num, int n) {

        while(n<=10){
            while (num<=29) {
                num++;
                boolean notprime = false;
                int x = 1;
                while (x<=num/3) {
                    x++;
                    if (num%x==0) {
                        notprime = true;
                        break;
                    }
                }
                if (!notprime) {
                    System.out.print(num + " ");
                }
            }
            n++;
        }

    }

    public static void triangle(int x, int n){

        while(n<=10){
            int triangle = x+n;
            System.out.print(triangle-1 + " ");
            x = triangle;
            n++;
        }

    }

}
