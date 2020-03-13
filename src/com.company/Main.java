public class Main {

    public static void main(String[] args) {
	// write your code here

        Variable factorial = (n) -> {
            int a = 1;
            for (int i = 1;  i<=n; i++){
                  a = a * i;
            }
            return a;
      };
     int b = factorial.findFactorial(5);
        System.out.println(b);

        Root root = (n,i) -> Math.pow( n, 1.0 / i );

        System.out.println(root.root(81,4));
}

}
