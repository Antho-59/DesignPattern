package org.example.structural.decorateur.exo;

import java.util.Scanner;

public class SufixDecorator  extends TextDecorator{
    public SufixDecorator(Text text) {
        super(text);
    }

    @Override
    public String Transform() {
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        return super.Transform()+(" "+string) ;
    }
}
