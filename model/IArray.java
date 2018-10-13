package model;

public interface IArray <T> {
	
public abstract boolean add(T coisa);
	
	public abstract void clear();
	
	public abstract boolean contains(T coisa);
	
	public abstract T get(int posicao);
	
	public abstract boolean isEmpty();
	
	public abstract T remove (int posicao);
	
	public abstract boolean remove(T coisa);
	
	public abstract int size();
}
