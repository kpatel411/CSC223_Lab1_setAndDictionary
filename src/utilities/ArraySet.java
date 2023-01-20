/**
* In this class, we use ArraySet to to create a list with sets of data in it. The class includes basic implemented methods that 
* return values based on size and position and includes functionality to create the list and return values given objects within
* the list. 
*
* @author <Khushi Patel>
* @date <01/18/2023>
*/
package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

public class ArraySet <E> implements List<E>, Set<E> //wrote in list and set w/ generic and imported arrayList and arraySet
{

	protected ArrayList<E> _list;
	// TODO Auto-generated constructor stub
	//default constructor
	public ArraySet()
	{
		_list = new ArrayList<E>();
	}
	
	//takes collection constructor 
	public ArraySet(Collection<? extends E> c)
	{
		//creating the array list from defined IVs above
		this(); 		
		// Add all
		for (E e: c) {
			add(e);
		}
	}

	@Override
	//Adds element to list, if it doesn't contain the element
	public boolean add(E e) {
		
		if (_list.contains(e)) return false;
		
		_list.add(e);
		return true;
	}

	@Override
	//Adds all elements with the set together
	public boolean addAll(Collection<? extends E> c) {
		if (_list.contains(c)) return false;
		
		_list.addAll(c);
		return true;
	}
	@Override
	//Returns number of elements in the list
	public int size() {
		// TODO Auto-generated method stub
		return _list.size();
	}

	@Override
	//returns t or f if list is empty
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return _list.isEmpty();
	}

	@Override
	//checks to see if an oject is in list, return t or f
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return _list.contains(o);
	}

	@Override
	//simply iterating through the list
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return _list.iterator();
	}

	@Override
	//returns the values in the list
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return _list.toArray();
	}

	@Override
	//returns the values in the list based on type a
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return _list.toArray(a);
	}

	@Override
	//removes a particular object 
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return _list.remove(o);
	}

	@Override
	//checks to see if everything in collection type is in the list
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return _list.containsAll(c);
	}


	@Override
	//adds values based on index value in the collection
	public boolean addAll(int index, Collection<? extends E> c) { 
		// TODO Auto-generated method stub
		//case for when there is nothing found
		if (index == -1) {
			_list.contains(c); 
			return false;
		}
		 
		_list.addAll(index, c);
		 return true;
	}

	@Override
	//remove everything with the list collection
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return _list.removeAll(c);
	}

	@Override
	//retain all within the list collection
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
			return _list.retainAll(c);
	}

	@Override
	//clear the whole list
	public void clear() {
		_list.clear();
	}

	@Override
	//find and return a value at index
	public E get(int index) {
		return _list.get(index);
	}

	@Override
	//find index then assigns element value to it
	public E set(int index, E element) {
			return	_list.set(index, element);
	}

	@Override
	//add an element at specific index
	public void add(int index, E element) {
		_list.add(index, element);
	}

	@Override
	//remove element at particular index
	public E remove(int index) {
		_list.remove(index);
		return null;
	}

	@Override
	//turns the index of a particular object by running through whole list
	public int indexOf(Object o) {
		return _list.indexOf(o);
	}

	@Override
	//return the index of last object in the list
	public int lastIndexOf(Object o) {
		return _list.lastIndexOf(o);
	}

	@Override
	//traverses entire list
	public ListIterator<E> listIterator() {
		_list.listIterator();
		return null;
	}

	@Override
	//traverses based on index
	public ListIterator<E> listIterator(int index) {
		_list.listIterator(index);
		return null;
	}

	@Override
	//makes a mini list inside the list based on varied index values
	public List<E> subList(int fromIndex, int toIndex) {
		List<E> newList = _list.subList(fromIndex, toIndex);
		return newList;
	}

	@Override
	//traverses elements and partitions list
	public Spliterator<E> spliterator() {
		return List.super.spliterator();
	}

}
