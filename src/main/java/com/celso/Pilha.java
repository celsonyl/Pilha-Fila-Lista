package com.celso;

public class Pilha {

    private No refNoPilha;

    public Pilha() {
        this.refNoPilha = null;
    }

    public void push(No novoNo) {
        No refAux = refNoPilha;
        refNoPilha = novoNo;
        refNoPilha.setRef(refAux);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoPilha;
            refNoPilha = refNoPilha.getRef();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return refNoPilha;
    }

    public boolean isEmpty() {
        return refNoPilha == null;
    }

    @Override
    public String toString() {
        String stringRetono = "----------\n";
        stringRetono += "   Pilha\n";
        stringRetono += "----------\n";

        No noAux = refNoPilha;
        while (true) {
            if (noAux != null) {
                stringRetono += "[No {dados = " + noAux.getDado() + "}]\n";
                noAux = noAux.getRef();
            } else {
                break;
            }
        }
        stringRetono += "----------\n";
        return stringRetono;
    }
}
