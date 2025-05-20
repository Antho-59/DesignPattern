package org.example.structural.decorateur.exo;

public class PrefixDecorator extends TextDecorator {
    public PrefixDecorator(Text text) {
        super(text);
    }

    @Override
    public String Transform() {
        return " Du texte avant le "+super.Transform();
    }
}
