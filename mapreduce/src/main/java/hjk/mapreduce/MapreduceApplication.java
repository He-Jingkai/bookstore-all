package hjk.mapreduce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapreduceApplication {
    public static void main(String[] args) throws Exception {
        Log4jConfig.initLog();
        SpringApplication.run(MapreduceApplication.class, args);

        /*无skip*/
        String[] mapreduceArgs = {"C:/Users/hjk02/bookstore/mapreduce/src/data","C:/Users/hjk02/bookstore/mapreduce/src/out"};
        WordCount.main(mapreduceArgs);

        /*有skip*/
//        String[] mapreduceArgsSKIP = {"C:/Users/hjk02/bookstore/mapreduce/src/data","C:/Users/hjk02/bookstore/mapreduce/src/outskip","-skip","C:\\Users\\hjk02\\bookstore\\mapreduce\\src\\skip\\skip.txt"};
//        WordCount.main(mapreduceArgsSKIP);
    }

}
