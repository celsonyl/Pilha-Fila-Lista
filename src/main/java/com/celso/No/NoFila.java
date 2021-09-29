package com.celso.No;

public class NoFila {

    private Object object;
    private NoFila refNoFila;

    public NoFila() {
    }

    public NoFila(Object object) {
        this.object = object;
        this.refNoFila = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NoFila getRefNoFila() {
        return refNoFila;
    }

    public void setRefNoFila(NoFila refNoFila) {
        this.refNoFila = refNoFila;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NoFila{");
        sb.append("object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
