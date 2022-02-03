import java.util.List;
import java.util.stream.Collectors;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int binaryVal = binaryVal = Integer.valueOf(binary.stream().map(x->x+"").collect(Collectors.joining()));
        int result = 0;
        int n = 1;
        while(binaryVal != 0) {
          result += (binaryVal % 10) * n;
          n *= 2;
          binaryVal /= 10;
        }
      return result;
    }
}
