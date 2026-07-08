package tool;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public abstract class WordsExtracter {
     private static final Path path = Paths.get("src","main","resources","Nouns.txt");

     public static List<String> getLines(){
          List<String> wordsList = new ArrayList<>();

          try(BufferedReader br = new BufferedReader(new FileReader(path.toFile()))){
               while(br.ready()){
                    wordsList.add(br.readLine());
               }
          }catch (IOException e){
               System.out.println(e.getMessage());
          }
          return wordsList;
     }
}
