import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface StringChecker {
  boolean checkString(String s);
}

class ListExamples {

  static List<String> result = new ArrayList<>();

  static List<String> filter(List<String> list, StringChecker sc) {
    if (list.size() == 0) {
      return list;
    }
    result.clear();
    for (String s : list) {
      if (sc.checkString(s)) {
        result.add(s);
      }
    }
    return result;
  }

  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < list1.size(); i++) {
      result.add(list1.get(i));
    }
    for (int i = 0; i < list2.size(); i++) {
      result.add(list2.get(i));
    }
    Collections.sort(result);
    return result;
  }
}
