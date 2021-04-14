package org.example.composite;

abstract class FileSystemElement {

    private String name;

    public FileSystemElement(String name) {
        this.name = name;
    }

    abstract void print();

    public String getName() {
        return name;
    }

    public boolean rename(String newName) {
        this.name = newName;
        return true;
    }

    public boolean moveTo(FileSystemElement element) {
        if (element instanceof Directory) {
            ((Directory) element).add(this);
            //usunac z obecnego directory

            return true;
        } else {
            System.out.printf("Unable to move %s to %s file.", this.name, element);
            return false;
        }
    }
}
