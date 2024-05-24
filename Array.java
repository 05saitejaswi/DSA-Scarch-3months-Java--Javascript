public class ArrayExamples{
  public static void main(String[] args){
    String[] weekdays =new String[7];
    System.out.println(weekdays);
  }
}

import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    // some string of array name of weekdays which contains string of 7 elements 
    String[] weekdays =new String[7];
    // will print the default value 
    System.out.println(Arrays.toString(weekdays));
    weekdays[0]="Monday";
        System.out.println(Arrays.toString(weekdays));
    weekdays=new String[] {"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
            System.out.println(Arrays.toString(weekdays));
// iterate through array with days 
for(String day: weekdays){
    System.out.println("weekday = "+day);
}
//iterating through the index 0,1..
for(int i=0;i<=weekdays.length;i++){
    System.out.println("weekday = "+weekdays);
}
//iterating through the index 0,1..
for(int i=0;i<weekdays.length;i++){
    weekdays[i]=weekdays[i].toUpperCase();
}
        System.out.println(Arrays.toString(weekdays));

  }
}
