package com.celso.PilhaFilaListaArv;

import com.celso.No.NoListaCircular;

public class ListaCircular<T> {

    private NoListaCircular<T> cabeca;
    private NoListaCircular<T> back;
    private int tamList;

    public ListaCircular() {
        this.back = null;
        this.cabeca = null;
        this.tamList = 0;
    }

    public NoListaCircular<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("Lista está vazia");

        if (index == 0) {
            return this.back;
        }

        NoListaCircular<T> noAux = this.back;
        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getNoProximo();
        }
        return noAux;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void remove(int index) {
        if (index >= this.size())
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");

        NoListaCircular<T> noAux = back;

        if (index == 0) {
            this.back = this.back.getNoProximo();
            this.cabeca.setNoProximo(this.back);
        } else if (index == 1) {
            this.back.setNoProximo(this.back.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAux = noAux.getNoProximo();
            }
            noAux.setNoProximo(noAux.getNoProximo().getNoProximo());
        }
    }

    public void add(T conteudo) {
        NoListaCircular<T> novoNo = new NoListaCircular<>(conteudo);

        if (this.isEmpty()) {
            this.cabeca = novoNo;
            this.back = this.cabeca;
            this.cabeca.setNoProximo(back);
        } else {
            novoNo.setNoProximo(this.back);
            this.cabeca.setNoProximo(novoNo);
            this.back = novoNo;
        }

        this.tamList++;
    }

    public boolean isEmpty() {
        return this.tamList == 0;
    }

    public int size() {
        return this.tamList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoListaCircular<T> noAux = this.back;
        for (int i = 0; i < this.size(); i++) {
            sb.append("[No {conteudo = ").append(noAux.getConteudo()).append(" }]-->");
            noAux = noAux.getNoProximo();
        }

        if (this.size() != 0) {
            sb.append("Retorna");
        } else {
            sb.append("[]");
        }

        return sb.toString();
    }
}
