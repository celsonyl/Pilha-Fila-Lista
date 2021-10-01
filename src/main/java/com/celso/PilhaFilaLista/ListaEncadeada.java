package com.celso.PilhaFilaLista;

import com.celso.No.NoLista;

public class ListaEncadeada<T> {

    private NoLista<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public boolean isEmpty() {
        return refEntrada == null;
    }

    public int listSize() {
        int listSize = 0;

        NoLista<T> refAux = refEntrada;
        while (true) {
            if (refAux != null) {
                listSize++;

                if (refAux.getNoLista() != null) {
                    refAux = refAux.getNoLista();
                } else {
                    break;
                }

            } else {
                break;
            }
        }
        return listSize;
    }

    public void addList(T conteudo) {
        NoLista<T> newNo = new NoLista<T>(conteudo);
        if (this.isEmpty()) {
            refEntrada = newNo;
        }

        NoLista<T> noAux = refEntrada;
        for (int i = 0; i < this.listSize() - 1; i++) {
            noAux = noAux.getNoLista();
        }
        noAux.setNoLista(newNo);
    }

    public NoLista<T> getNoList(int index) {
        if (index >= this.listSize()) {
            throw new IndexOutOfBoundsException("Tamanho passado é maior que a lista. Tamanho da Lista: " + this.listSize() +
                    " Tamanho passado: " + index);
        }

        NoLista<T> noAux = refEntrada;
        NoLista<T> noReturn = null;

        for (int i = 0; i < this.listSize() - 1; i++) {
            noReturn = noAux;
            noAux = noAux.getNoLista();
        }
        return noReturn;
    }

    public T get(int index) {
        return getNoList(index).getConteudo();
    }

    public T removeNoList(int index) {
        NoLista<T> noRemove = this.getNoList(index);

        if (index == 0) {
            refEntrada = noRemove.getNoLista();
            return noRemove.getConteudo();
        }

        NoLista<T> no = getNoList(index - 1);
        no.setNoLista(noRemove.getNoLista());
        return noRemove.getConteudo();
    }
}