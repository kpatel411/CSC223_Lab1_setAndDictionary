package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

public class ArraySet <E> implements List<E>, Set<E> //wrote in list and set w/ generics and imported arrayList and arraySet
{

	protected ArrayList<E> _list;
	// TODO Auto-generated constructor stub
	//default
	//takes collection
	public ArraySet()
	{
		_list = new ArrayList<E>();
	}
	
	public ArraySet(Collection<? extends E> c)
	{
		this(); //creating the arraylist
		// Add all
		for (E e: c) {
			add(e);
		}
	}

	//Adds element to list if it doesn't contain the element
	@Override
	public boolean add(E e) {
		
		if (_list.contains(e)) return false;
		
		_list.add(e);
		return true;
	}

	//Adds all elements to the set
	@Override
	public boolean addAll(Collection<? extends E> c) {
		if (_list.contains(c)) return false;
		
		_list.addAll(c);
		return true;
	}
	//Returns number of elements in the list
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return _list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return _list.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return _list.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return _list.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return _list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return _list.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return _list.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return _list.containsAll(c);
	}


	@Override
	public boolean addAll(int index, Collection<? extends E> c) { /////////see INDEX ISSUE
		// TODO Auto-generated method stub
		if (index == -1) {
			_list.contains(c); 
			return false;
		}
		 
		_list.addAll(index, c);
		 return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return _list.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
			return _list.retainAll(c);
	}

	@Override
	public void clear() {
		_list.clear();
	}

	@Override
	public E get(int index) {
		for (int i = 0; i < _list.size(); i++)
		{
			if (i == index)
			{
				return _list.get(index);
			}
		}
		return null;
	}

	@Override
	public E set(int index, E element) {
		for (int i = 0; i <_list.size(); i++)
		{
			if (i == index)
			{
				_list.set(index, element);
			}
		}
		return null;
	}

	@Override
	public void add(int index, E element) {
		_list.add(index, element);
	}

	@Override
	public E remove(int index) {
		_list.remove(index);
		return null;
	}

	@Override
	public int indexOf(Object o) {
		if(_list.contains(o))
		{
			for(int i = 0; i < _list.size(); i++)
			{
				if(_list.get(i).equals(o))
				{
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		if(_list.contains(o))
		{
			for (int i = _list.size()-1; i >= 0; i--)
			{
				if(_list.get(i).equals(o))
				{
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		_list.listIterator();
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		_list.listIterator(index);
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		List<E> newList = _list.subList(fromIndex, toIndex);
		return newList;
	}

	@Override
	public Spliterator<E> spliterator() {
		return List.super.spliterator();
	}

}
