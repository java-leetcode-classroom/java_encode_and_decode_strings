import java.util.Arrays;
import java.util.List;

public class Solution {
  private final String sep;
  Solution(String sep) {
    this.sep = sep;
  }
  /*
   * @param strs: a list of strings
   * @return: encodes a list of strings to a single string.
   */
  public String encode(List<String> strs) {
    return String.join(this.sep, strs);
  }
  /*
   * @param str: A string
   * @return: dcodes a single string to a list of strings
   */
  public List<String> decode(String str) {
   return Arrays.asList(str.split(this.sep));
  }
}
