package com.celso.PilhaFilaListaArv;

import com.celso.No.BinNo;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(this.raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }

    //------Exibir em Ordem---------------------------------------------------------
    public void exibirEmOrdem() {
        System.out.println("\n Exibindo em Order:");
        exibirEmOrdem(this.raiz);
    }

    private void exibirEmOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirEmOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ",");
            exibirEmOrdem(atual.getNoDir());
        }
    }
    //-------------------------------------------------------------------------------

    //----Exibir Pós Ordem-----------------------------------------------------------
    public void exibirPosOrdem() {
        System.out.println("\n Exibindo Pós Order:");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ",");
        }
    }
    //-------------------------------------------------------------------------------

    //----Exibir Pré Ordem-----------------------------------------------------------
    public void exibirPreOrdem() {
        System.out.println("\n Exibindo Pós Order:");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.println(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
    //--------------------------------------------------------------------------------

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;

                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {
                System.out.println("Conteudo não encontrado. IF");
            }


        } catch (NullPointerException exception) {
            System.out.println("Conteudo não encontrado. Catch");
        }
    }
}
