import java.util.ArrayList;
import java.util.List;

public class Prime {
    public List<String> GeneratePrime(int min, int max) {
        List<String> result = new ArrayList<>();
        for (int i=min;i<max;i++) {
            boolean flag=true;
            for (int j=2;j<=Math.sqrt(i);j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag==true) {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
