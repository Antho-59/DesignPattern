package org.example.structural.decorateur.exo;

public class PlainText implements Text{
    @Override
    public String Transform(String input) {
        return input;
    }
}
