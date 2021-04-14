package org.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Directory implements FileSystemElement{

    private String name;
    private List<FileSystemElement> dirElements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public boolean rename(String newName) {
        this.name = newName;
        return true;
    }

    @Override
    public boolean remove(FileSystemElement element) {
        if (dirElements.contains(element)) {
            dirElements.remove(element);
            return true;
        } else {
            System.out.printf("%s does not exist in directory %s.%n", element, name);
            return false;
        }
    }

    @Override
    public boolean move() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void print() { //should iterate over all elements
        dirElements.forEach(System.out::println);
    }

    @Override
    public void add(FileSystemElement element) {
        dirElements.add(element);
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
