import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class arrayListTest {

  @Test
  void testSum() {
    double sum = 0;
    ArrayList<Double> list = new ArrayList<>();
    list.add(5.0);
    list.add(5.0);
    for (int i = 0; i < list.size(); i++) {
      sum = sum + list.get(i);
    }
    System.out.println(sum);
  }

}
