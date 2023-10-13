package com.projeto.huffmandocapiroto;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class huffman {
    Map<Character, String> cdMap = new HashMap<>();
    Map<String, Character> dcMap = new HashMap<>();

    public String pulltree(NoH raiz){
        StringBuilder tree = new StringBuilder();
        serializer(raiz, tree);
        return tree.toString();
        
    }


    public String codificar(String s) {

        char[] chars = s.toCharArray();
        Map<Character, Integer> freqMap = new HashMap<>();
        PriorityQueue<NoH>heap = new PriorityQueue<>();

        for (char c : chars) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        for (char c : freqMap.keySet()) {
            NoH no = new NoH(c, freqMap.get(c));
            heap.add(no);
        }
        NoH raiz = buildTree(heap);
        buildCodes(raiz, "");
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(cdMap.get(c));
        }
        return pulltree(raiz) + "++" + sb.toString();
    }

    private NoH buildTree(PriorityQueue<NoH> heap) {
        while (heap.size() > 1) {
            NoH no1 = heap.poll();
            NoH no2 = heap.poll();
            NoH no = new NoH('\0', no1.freq + no2.freq);
            no.esq = no1;
            no.dir = no2;
            heap.add(no);
        }
        return heap.poll();
    }

    private void buildCodes(NoH raiz, String string) {
        if (raiz == null) {
            return;
        }
        if(raiz.c != '\0'){
            cdMap.put(raiz.c, string);
            dcMap.put(string, raiz.c);
        }
        buildCodes(raiz.esq, string + '0');
        buildCodes(raiz.dir, string + '1');
    }

    public String decodificar(String cd1){
        String dc = null;
        if(cd1 != null){
            int gaptree = cd1.indexOf("++");
            String tree = cd1.substring(0, gaptree);
            String cod = cd1.substring(gaptree + 1);

            NoH raiz = pushtree(tree);
            dc = decodeTree(raiz, cod);
        }
        return dc;
    }

    public void serializer(NoH no, StringBuilder sb){
        if(no == null){
            sb.append('%');
            return;
        }
        sb.append(no.c);
        serializer(no.esq, sb);
        serializer(no.dir, sb);
    }
    public NoH pushtree(String tree){
        Queue<Character> q = new LinkedList<>();
        for(char c : tree.toCharArray()){
            q.offer(c);
        }
        return unserializer(q);
    }

    public NoH unserializer(Queue<Character> q){
        char c = q.poll();
        if(c == '%'){
            return null;
        }
        NoH no = new NoH(c, 0);
        no.esq = unserializer(q);
        no.dir = unserializer(q);
        return no; 
    }
    public String decodeTree (NoH raiz, String db){
            StringBuilder sb = new StringBuilder();
            NoH no = raiz;
            for(char c : db.toCharArray()){
                if(c == '0' && no != null){
                    no = no.esq;
                }else if (c == '1' && no != null){
                    no = no.dir;
                }
                if(no != null && no.c != '\0'){
                    sb.append(no.c);
                    no = raiz;
                }
            }
            return sb.toString();
    }
}
