package org.example.composite;

abstract class FileSystemElement {

    private String name;
    private Directory parent;

    public FileSystemElement(String name) {
        this.name = name;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public Directory getParent() {
        return parent;
    }

    abstract void print();
    abstract void print(String indentString);

    public String getName() {
        return name;
    }

    public boolean rename(String newName) {
        this.name = newName;
        return true;
    }

    public boolean moveTo(Directory element) {
        parent.remove(this);
        element.add(this);
        return true;
    }
}
