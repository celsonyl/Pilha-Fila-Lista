package com.celso.No;

public class NoPilha {

    private int dado;
    private NoPilha ref = null;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getRef() {
        return ref;
    }

    public void setRef(NoPilha ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "No{" + "dado=" + dado +
                '}';
    }
}
