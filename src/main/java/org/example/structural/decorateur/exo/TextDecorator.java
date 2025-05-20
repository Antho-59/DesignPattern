package org.example.structural.decorateur.exo;

public abstract   class TextDecorator implements Text {

protected Text text;

    public TextDecorator  (Text text) {
        this.text=text;
    }

    @Override
    public String Transform() {
        return text.Transform();
    }
}
