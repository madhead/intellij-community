// "Replace with collect" "true-preview"
import java.util.*;
import java.util.stream.Collectors;

public class Collect {
  class Person {
    String getName() {
      return "";
    }
  }

  void collectNames(List<Person> persons){
    Set<String> names = persons.stream().map(Person::getName).collect(Collectors.toSet());
      /*valuable comment*/
  }
}
