package com.celso.No;

public class NoListaDupla<T> {

    private T counteudo;
    private NoListaDupla<T> noProx;
    private NoListaDupla<T> noPrevio;

    public NoListaDupla(T counteudo) {
        this.counteudo = counteudo;
    }

    public T getCounteudo() {
        return counteudo;
    }

    public void setCounteudo(T counteudo) {
        this.counteudo = counteudo;
    }

    public NoListaDupla<T> getNoProx() {
        return noProx;
    }

    public void setNoProx(NoListaDupla<T> noProx) {
        this.noProx = noProx;
    }

    public NoListaDupla<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoListaDupla<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoListaDupla{" + " counteudo = " + counteudo +
                " }";
    }
}
