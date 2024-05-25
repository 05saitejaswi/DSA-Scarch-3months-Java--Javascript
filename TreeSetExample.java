import java.util.TreeSet;
import java.util.Set;
import java.util.Comparator;

public class TreeSetExample{
    public static void main(String[] args){
        //samllest first largest last
        Set<Integer> treeSet =new TreeSet<>();
        treeSet.add(2);
        treeSet.add(200);
        treeSet.add(300);
        treeSet.add(89);
        treeSet.add(500);
        System.out.println(treeSet);
        treeSet.add(1);
        System.out.println(treeSet);
        Set<String> wordSet=new TreeSet<>(Comparator.comparing(String::length));
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);
        wordSet.add("wolf");
        System.out.println(wordSet);

        
        
        
    }
}

// output:
// [2, 89, 200, 300, 500]
// [1, 2, 89, 200, 300, 500]
// [bear, tiger, giraffe]
// [bear, tiger, giraffe]
