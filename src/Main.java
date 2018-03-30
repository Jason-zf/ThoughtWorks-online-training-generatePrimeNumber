import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Prime prime=new Prime();
        List<String> out = prime.GeneratePrime(101, 200);
        for (int i=0;i<out.size();++i) {
            System.out.print(out.get(i) + " ");
        }
    }
}
