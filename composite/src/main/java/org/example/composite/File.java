package org.example.composite;

public class File extends FileSystemElement{

    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(super.getName());
    }

    @Override
    public String toString() {
        return String.format("%s", super.getName());
    }
}
