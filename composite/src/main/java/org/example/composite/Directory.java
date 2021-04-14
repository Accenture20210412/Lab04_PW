package org.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Directory extends FileSystemElement{

    private List<FileSystemElement> dirElements = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public boolean remove(FileSystemElement element) {
        if (dirElements.contains(element)) {
            dirElements.remove(element);
            return true;
        } else {
            System.out.printf("%s does not exist in directory %s.%n", element, super.getName());
            return false;
        }
    }


    @Override
    public void print() { //should iterate over all elements
        dirElements.forEach(System.out::println);
    }

    public void add(FileSystemElement element) {
        dirElements.add(element);
    }

    @Override
    public String toString() {
        return String.format("%s", super.getName());
    }

    public void printAllHierarchy() {
        int count = 0;
        for (int i = 0; i < dirElements.size(); i++) {
            if (dirElements.get(i) instanceof File) {
                System.out.println(dirElements.get(i));
            } else {
                count+=4;
                System.out.println(dirElements.get(i));
                Directory dir = (Directory) dirElements.get(i);
                dir.printAllHierarchy();
            }
        }
    }
}
