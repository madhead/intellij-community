// "Replace with reduce()" "true-preview"

import java.util.*;

public class Main {
  public void testBitwiseAndReplacingInitializer() {
    int[] arr = new int[]{1, 2, 3, 4};
    int acc = -1;
    for <caret> (int i: arr) {
      acc &= i;
    }
  }
}