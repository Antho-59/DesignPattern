package org.example.structural.decorateur.exo;

import java.util.Scanner;

public class PrefixDecorator extends TextDecorator {
    public PrefixDecorator(Text text) {
        super(text);
    }

    @Override
    public String Transform() {
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        return (string+" ")+super.Transform();
    }
}
