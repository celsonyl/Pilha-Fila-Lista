package com.celso;

public class Pilha {

    private NoPilha refNoPilha;

    public Pilha() {
        this.refNoPilha = null;
    }

    public void push(NoPilha novoNoPilha) {
        NoPilha refAux = refNoPilha;
        refNoPilha = novoNoPilha;
        refNoPilha.setRef(refAux);
    }

    public NoPilha pop() {
        if (!this.isEmpty()) {
            NoPilha noPilhaPoped = refNoPilha;
            refNoPilha = refNoPilha.getRef();
            return noPilhaPoped;
        }
        return null;
    }

    public NoPilha top() {
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

        NoPilha noPilhaAux = refNoPilha;
        while (true) {
            if (noPilhaAux != null) {
                stringRetono += "[No {dados = " + noPilhaAux.getDado() + "}]\n";
                noPilhaAux = noPilhaAux.getRef();
            } else {
                break;
            }
        }
        stringRetono += "----------\n";
        return stringRetono;
    }
}
