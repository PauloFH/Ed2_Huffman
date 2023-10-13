package com.projeto.huffmandocapiroto;

public class NoH  implements Comparable<NoH>{
    char c;
    int freq;
    NoH esq;
    NoH dir;

    public NoH(char c, int freq) {
        this.c = c;
        this.freq = freq;
    }


    @Override
    public int compareTo(NoH arg0){
        return this.freq - arg0.freq;
    }

    
}
