package hahah;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    @Test
    public void fileopt() throws IOException {
        FileInputStream inputStream = new FileInputStream("input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str = null;
        ArrayList<String> arrayList = new ArrayList<String>();
        while((str = bufferedReader.readLine()) != null)
        {
            System.out.println(str);
            arrayList.add(str);
        }

        //close
        inputStream.close();
        bufferedReader.close();
        Collections.sort(arrayList);
        File file;
        FileOutputStream fileOutputStream = new FileOutputStream("out.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
        for(String s:arrayList){
            bufferedWriter.write(s+"\n");
        }
        bufferedWriter.close();
    }


}
