package maze.cli;

import java.util.Scanner;

public class Input {
    public static char getPlayerMove(){
        char ch = '0';
        Scanner s = new Scanner(System.in);
        try {
            ch = s.findInLine("[lrud]").charAt(0);
            //System.out.println(ch);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //s.close();
        return ch;
    }
}
