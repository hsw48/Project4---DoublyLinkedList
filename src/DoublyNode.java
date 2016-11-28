import java.io.Serializable;
import java.util.Iterator;



public class DoublyNode<T> implements Serializable, Iterable<T>
{
	private T data;
	private DoublyNode<T> prev = null;
	private DoublyNode<T> next = null;
	
	public DoublyNode(T data)
	{
		this.data = data;
	}
	
	public T getValue()
	{
		return data;
	}
	public void setValue(T value)
	{
		data = value;
	}
	public DoublyNode<T> getNext()
	{
		return next;
	}
	public void setNext(DoublyNode<T> node)
	{
		next = node;
	}
	public DoublyNode<T> getPrev()
	{
		return prev;
	}
	public void setPrev(DoublyNode<T> node)
	{
		prev = node;
	}
	public boolean hasNext()
	{
		return this.next != null;
	}
	public boolean hasPrev()
	{
		return this.prev != null;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
