package com.celso.No;

public class NoLista<T> {

    private T conteudo;
    private NoLista<T> noLista;

    public NoLista() {
        this.noLista = null;
    }

    public NoLista(T conteudo) {
        this.conteudo = conteudo;
        this.noLista = null;
    }

    public NoLista(T conteudo, NoLista<T> noLista) {
        this.conteudo = conteudo;
        this.noLista = noLista;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoLista<T> getNoLista() {
        return noLista;
    }

    public void setNoLista(NoLista<T> noLista) {
        this.noLista = noLista;
    }

    @Override
    public String toString() {
        return "NoLista { " + "conteudo = " + conteudo +
                " }";
    }

    public String toStringEncadeado() {
        String str = this.toString();

        if (noLista != null) {
            str += "->" + noLista;
        } else {
            str += "-> null";
        }
        return str;
    }
}