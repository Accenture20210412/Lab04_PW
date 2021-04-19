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
    public void print() { // iterates over all elements
        dirElements.forEach(System.out::println);
    }

    @Override
    void print(String indentString) {
        System.out.printf("%s+%s%n", indentString, this.getName());
        for (FileSystemElement f : dirElements) {
            f.print(indentString+"     ");
        }
    }

    void printAllHierarchy() {
        print("");
    }

    public void add(FileSystemElement element) {
        dirElements.add(element);
        element.setParent(this);
    }

    @Override
    public String toString() {
        return String.format("%s", super.getName());
    }

}
