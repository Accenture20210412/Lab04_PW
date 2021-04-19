package org.example.composite;

import java.lang.reflect.Field;

public class Runner {

    public static void main(String[] args) {
        Directory directoryA = new Directory("A");
        Directory directoryB = new Directory("B");
        Directory directoryC = new Directory("C");
        Directory directoryD = new Directory("D");

        File f1doc = new File("f1.doc");
        File f1txt = new File("f1.txt");
        File f2xls = new File("f2.xls");
        File f4mov = new File("f4.mov");
        File f5m2t = new File("f5.m2t");
        File f6c = new File("f6.c");
        File abctxt = new File("abc.txt");
        File documentodt = new File("document.odt");

        directoryA.add(f1doc);
        directoryA.add(f1txt);
        directoryA.add(f2xls);
        directoryA.add(directoryB);
        directoryA.add(directoryC);

        directoryB.add(f4mov);
        directoryB.add(f5m2t);
        directoryB.add(f6c);

        directoryC.add(abctxt);
        directoryC.add(directoryD);

        directoryD.add(documentodt);
        
        f5m2t.rename("f52.m2t");
        directoryA.remove(f1txt);
        documentodt.moveTo(directoryB);

        directoryA.printAllHierarchy();
    }
}
