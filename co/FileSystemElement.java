package co;

public interface FileSystemElement {

	public boolean rename(String newName);
	public boolean remove();

	//dodać ścieżkę docelową w parametrach
	public boolean move();
	public void print();
	public void add(FileSystemElement element);
	
}
