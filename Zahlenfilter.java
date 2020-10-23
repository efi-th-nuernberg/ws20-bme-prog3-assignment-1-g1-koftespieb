class Zahlenfilter{

  public static void main(String[] args) {
    zahlenfilter();
  }

  public static void zahlenfilter(){
    for(int i = 0; i < 200; i++)
    {
      if(i%5 == 0 && i != 0)
      {
        System.out.println(i +" ist durch 5 Teilbar!\n");
      }
      if(i%10 == 9)
      {
        System.out.println(i +" endet auf 9!\n");
      }
      if((i+(i-1)) %3 == 0)
      {
        System.out.println(i + " und " + (i-1) + " addiert ergeben " +(i+(i-1)) +" und " +(i+(i-1))+ " ist durch 3 teilbar\n");
      }
    }
  }
}