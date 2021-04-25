package edu.wctc.independentcopy.writer;

public class ListWriter implements Writer{

    @Override
    public void writeln(String line) {
        System.out.println("Here's Your List:");
        System.out.println(line);
        System.out.println();
    }
}
