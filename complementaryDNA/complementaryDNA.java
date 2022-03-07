import java.util.HashMap;
import java.util.stream.Collectors;
public class DnaStrand {
  private static HashMap<Character, Character> map = new HashMap<>(4);
  static {map.put('A', 'T'); map.put('T', 'A'); map.put('C', 'G'); map.put('G', 'C');}
  public static String makeComplement(String dna) {
    return dna.chars().mapToObj(c -> String.valueOf(map.get((char)c))).collect(Collectors.joining());
  }
}
