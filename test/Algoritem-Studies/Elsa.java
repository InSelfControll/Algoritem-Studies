package com.studies;

public class Elsa {

  boolean b = true;
  int a = 10;
  double d = 20.0000009;
  long l = 20;
  char x = 'x';
  String s = "Hey hey hey";
  float f = 20.2f;

  public boolean number() {
    if (a != 20 || a < 20) {
      System.out.println(a);
      return b;
    } else {
      System.out.println(a);
      return false;
    }
  }
  
  public static void main(String[] args) {

    boolean bi = false;
    int[] ai = new int[100];
    double di = 25.0000009;
    long li = 20;
    char xi = 'a';
    String[] si = new String[100];
    float fi = 20.2f;

    System.out.println(bi);
    System.out.println(li);
    System.out.println(di);
    System.out.println(ai.length);
    System.out.println(si.length);
    System.out.println(fi);
    System.out.println(xi);

    /*
    System.out.println(b);
    System.out.println(l);
    System.out.println(d);
    System.out.println(a);
    System.out.println(s);
    System.out.println(f);
    System.out.println(x);*/
  }
}
