package org.example.composite;

public interface FileSystemElement {

    public boolean rename(String newName);
    public boolean remove(FileSystemElement element);

    //dodać ścieżkę docelową w parametrach
    public boolean move();
    public void print();
    public void add(FileSystemElement element);
}
