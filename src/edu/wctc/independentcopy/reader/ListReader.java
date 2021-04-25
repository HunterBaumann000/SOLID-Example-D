package edu.wctc.independentcopy.reader;

import edu.wctc.independentcopy.writer.Writer;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReader implements Reader {

    @Override
    public String readln() {
        ArrayList games = new ArrayList();

        games.add("Risk of Rain");
        games.add("Assassins Creed");
        games.add("Overwatch");
        games.add("R6S");
        games.add("Terraria");
        games.add("Minecraft");

        return games.toString();
    }
}
