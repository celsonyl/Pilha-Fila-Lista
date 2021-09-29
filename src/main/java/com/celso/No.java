package com.celso;

public class No {

    private int dado;
    private No ref = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRef() {
        return ref;
    }

    public void setRef(No ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("No{");
        sb.append("dado=").append(dado);
        sb.append('}');
        return sb.toString();
    }
}
