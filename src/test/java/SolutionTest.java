import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  private final Solution sol = new Solution(":;");
  @Test
  void encodeAndDecodeExample1() {
    List<String> input = List.of("lint","code","love","you");
    assertEquals(List.of("lint","code","love","you"), sol.decode(sol.encode(input)));
  }

  @Test
  void encodeAndDecodeExample2() {
    List<String> input = List.of("we", "say", ":", "yes");
    assertEquals(List.of("we", "say", ":", "yes"), sol.decode(sol.encode(input)));
  }
}