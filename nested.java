public class nested{
  public static void main(String[] args){
    int r = 5;
    for (int i = 1; i <= r; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 1; i <= r; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    for (int i = 1; i <= r; ++i) {
      for (int v = 0; v<i;v++){
        System.out.print(" ");
      }
      for (int j = 5; j >= i; --j) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 1; i <= r; ++i) {
      for (int v = 6; v>i;--v){
        System.out.print(" ");
      }
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}