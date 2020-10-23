class Zahlenfilter{

  public static void main(String[] args) {
    zahlenfeld();
  }

  public static void zahlenfeld(){
    for(int i = 0; i < 200; i++)
    {
      System.out.println("Zahl ="+i);
      if(i%5 == 0 && i != 0)
      {
        System.out.println("Zahl ist durch 5 Teilbar!\n");
      }
      if(i%10 == 9)
      {
        System.out.println("Zahl endet auf 9!\n");
      }
      if((i+(i-1)) %3 == 0)
      {
        System.out.println("ZAHL und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar\n");
      }
    }
  }
}