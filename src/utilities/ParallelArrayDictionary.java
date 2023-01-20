/***
 * This class implements methods relating to a ParallelArray Dictionary
 */
package utilities;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * @param <Key>
 * @param <Value>
 */
public class ParallelArrayDictionary <Key, Value> implements Map <Key, Value>
{
	// Parallel array-based implementation
	protected ArraySet<Key>		_keys;
	protected ArrayList<Value>	_values;
	
	
	//constructor
	public ParallelArrayDictionary()
	{
		_keys = new ArraySet<Key>();
		_values = new ArrayList<Value>();
	}
	//constructor
	public ParallelArrayDictionary(Map <? extends Key, Value> m)
	{
		this(); 
	}
	
	/***
	 * This method returns the size of the ParallelArrayDictionary
	 * Input: none
	 * Output: int size
	 */
	@Override
	public int size() {
		return _keys.size();
	}
	
	/***
	 * This method returns true if the ParallelArrayDictionary is empty
	 * Input: none
	 * Output: true if empty; false if not empty
	 */
	@Override
	public boolean isEmpty() {
		return(_keys.size() == 0);
	}
	
	/***
	 * This method checks to see if the ParallelArrayDictionary contains a specified key
	 * Input: Object key
	 * Output: true if contains key; false if does not contain key
	 */
	@Override
	public boolean containsKey(Object key) {
		return _keys.contains(key);
	}
	
	/***
	 * This method checks to see if the ParallelArrayDictionary contains a specified value
	 * Input: Object value
	 * Output: true if contains value; false if does not contain value
	 */
	@Override
	public boolean containsValue(Object value) {
		return _keys.contains(value);
	}
	
	/***
	 * This method returns the value at a specified key
	 * Input: Object key
	 * Output: value at key; null if key is not mapped
	 */
	@Override
	public Value get(Object key) {
		int index = _keys.indexOf(key);
		if(index == -1) {
			return null;
		}
		return _values.get(index);
	}
	
	/***
	 * This method puts a key, value set in the ParallelArrayDictionary
	 * Input: Key key, Value value
	 * Output: if key was mapped to something: value that was mapped; if key was not mapped:
	 * null
	 */
	@Override
	public Value put(Key key, Value value) {
		Value oldVal = null;
		if(_keys.contains(key))
		{
			oldVal = _values.get(_keys.indexOf(key));
			_values.set(_keys.indexOf(key), value);
		}
		else
		{
			_keys.add(key);
			_values.add(value);
		}
		return oldVal;
	}
	
	/***
	 * This method removes a value from a specified key
	 * Input: Object key
	 * Output: if key was mapped: value that was mapped; if key was not mapped: null
	 */
	@Override
	public Value remove(Object key) {
		if(_values.isEmpty()) { return null; }
 		return _values.remove(_keys.indexOf(key));
	}
	
	/***
	 * This method puts all of the keys and values in the ParallelArrayDictionary into a new map
	 * Input: Map m
	 * Output: none
	 */
	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		for(Entry<? extends Key, ? extends Value> entry : m.entrySet())
		{
			put(entry.getKey(), entry.getValue());
		}
	}
	
	/***
	 * This method clears the ParallelArrayDictionary
	 * Input: none
	 * Output: none
	 */
	@Override
	public void clear() {
		_keys.clear();
		_values.clear();
	}
	
	/***
	 * This method puts all of the keys in a ParallelArrayDictionary into a new set
	 * Input: none
	 * Output: set of keys
	 */
	@Override
	public Set<Key> keySet() {
		return _keys;
	}
	
	/***
	 * This method puts all of the values in a ParallelArrayDictionary into a new collection
	 * Input: none
	 * Output: collection of values
	 */
	@Override
	public Collection<Value> values() {
		Collection<Value> _valuesCollection = new ArrayList<Value>();
		for(int i = 0; i <_values.size(); i++)
		{
			_valuesCollection.add(_values.get(i));
		}
		return _valuesCollection;
	}
	
	/***
	 * This method creates a set with all of the values and keys in a ParallelArrayDictionary
	 * Input: none
	 * Output: set of entries
	 */
	@Override
	public Set<Entry<Key, Value>> entrySet() {
		HashMap<Key, Value> _newMap = new HashMap<Key, Value>();
		for(int i = 0; i < _keys.size(); i++)
		{
			_newMap.put(_keys.get(i), _values.get(i));
		}
		return _newMap.entrySet();
	}

}
