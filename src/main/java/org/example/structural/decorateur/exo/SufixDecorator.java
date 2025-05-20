package org.example.structural.decorateur.exo;

public class SufixDecorator  extends TextDecorator{
    public SufixDecorator(Text text) {
        super(text);
    }

    @Override
    public String Transform() {
        return super.Transform()+" Encore du texte on adore !";
    }
}
