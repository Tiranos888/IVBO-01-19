package Lab8;

import java.io.*;

public class TextChanger {
    public static void main(String[] args) {

        try (FileWriter changer=new FileWriter("C:\\Users\\Дупус\\Desktop\\test.txt",false);){
            for (String i:args){
                changer.append(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
