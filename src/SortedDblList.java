import java.io.Serializable;
import java.util.Iterator;



public class SortedDblList<T extends Comparable> implements Serializable,Iterable<T>
{
	private int size;
	private DoublyNode<T> head = null;
	
	public int getSize()
	{
		return size;
	}
	
	public boolean add(T element)
	{
		boolean added = false;
		DoublyNode<T> cursor = head;
		DoublyNode<T> newNode = new DoublyNode<T>(element);
		
		if (element == null)
		{
			return added;
		}
		
		boolean loop = true;
		if(head == null)
		{
			head = newNode;
			added = true;
			size++;
			return added;
		}
		
		while(loop)
		{
			System.out.println("while");
			int comparison = cursor.getValue().compareTo(element);
			
			if(comparison == 0)
			{
				System.out.println(" = 0");
				return added;
			}
			
			else if(comparison > 0)
			{
				System.out.println(">0");
				newNode.setNext(cursor);
				
				if(cursor.hasPrev())
				{
					System.out.println("has prev");
					newNode.setPrev(cursor.getPrev());
					cursor.getPrev().setNext(newNode);
					added = true;
					size++;
					return added;
				}
				else
				{
					System.out.println("no prev");
					newNode.setNext(cursor);
					cursor.setPrev(newNode);
					head = newNode;
					added = true;
					size++;
					return added;
				}
			}
			else
			{
				System.out.println("< 0");
				cursor = cursor.getNext();
			}
		}
		return added;
	}
		
	public T get(int index) throws IndexOutOfBoundsException
	{
		DoublyNode<T> node = head;
		if(index < 0 || index > getSize())
		{
			throw new IndexOutOfBoundsException("Linked List");
		}
		else
		{
			for(int i = 0; i < index;i++)
			{
				node = node.getNext();
			}
			return node.getValue();
		}
		
	}
	
	public boolean remove(Object element)
	{
		DoublyNode<T> node = head;
		if(node == null)
		{
			return false;
		}
		else 
		{
			while(node != null)
			{
				if(node.getValue().equals(element)){
					if(node.hasPrev())
					{
						node.getPrev().setNext(node.getNext());
						size--;
						return true;
					}
					else
					{
						head = node.getNext();
						size--;
						return true;
					}
				}
				else
				{
					node = node.getNext();
				}
			}
		}
		return false;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public SortedDblList merge(SortedDblList<T> other)
	{
		SortedDblList merged = this;
		for(Object i : other)
		{
			merged.add((Comparable) i);
		}
		return merged;
	}
	
	public boolean isPrefix(SortedDblList<T> other)
	{
		if(this.getSize() > other.getSize())
		{
			return false;
		}
		else
		{
			for(int i = 0; i < this.getSize();i++)
			{
				if(this.get(i).compareTo(other.get(i)) != 0)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public void printList()
	{
		System.out.println("printList");
		String result = "";
	    DoublyNode<T> current = head;
	    while (current != null)
	    {
	        result += "" + current.getValue().toString() + "\n";
	        current = current.getNext();
	    }
	   System.out.println(result);
	}
	
	public int indexOf(Object obj)
	{
		int index = -1;
		for(T element : this)
		{
			if(element.equals(obj))
			{
				return ++index;
			}
			else
			{
				index++;
			}
		}
		return index;
	}

	@Override
	public Iterator<T> iterator()
	{
		return null;
	}
	
		
	
}
