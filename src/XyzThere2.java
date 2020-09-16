public class XyzThere2 {
  public boolean xyzThere(String str) {

    if (str.startsWith("xyz", 0)) {
      return true;
    }

    for (int i = 0; i < str.length() - 3; i++) {
      if (str.startsWith("xyz", i + 1) && str.charAt(i) != '.')  {
        return true;
      }
    }
    return false;
  }

}
