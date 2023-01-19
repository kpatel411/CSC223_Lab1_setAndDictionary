package utilities;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParallelArrayDictionary <Key, Value> implements Map <Key, Value>
{
	// Parallel array-based implementation
	protected ArraySet<Key>		_keys;
	protected ArrayList<Value>	_values;
	
	//stuff from unimplemented import
	
	
	public ParallelArrayDictionary()
	{
		_keys = new ArraySet<Key>();
		_values = new ArrayList<Value>();
	}
	
	public ParallelArrayDictionary(Map <? extends Key, Value> m)
	{
		this(); 
	}
	
	@Override
	public int size() {
		int numSize = _keys.size();
		return numSize;
	}
	@Override
	public boolean isEmpty() {
		if(_keys.size() == 0)
		{
			return true;
		}
		return false;
	}
	@Override
	public boolean containsKey(Object key) {
		for(int i = 0; i < _keys.size(); i++)
		{
			if(_keys.get(i).equals(key))
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean containsValue(Object value) {
		for(int i = 0; i < _values.size(); i++)
		{
			if(_values.get(i).equals(value))
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public Value get(Object key) {
		if(_values.isEmpty()) return null;
		return _values.get(_keys.indexOf(key));
	}
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
	@Override
	public Value remove(Object key) {
		if(_values.isEmpty()) { return null; }
 		return _values.remove(_keys.indexOf(key));
	}
	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		ArraySet<Key> _newKeys = new ArraySet<Key>();
		ArrayList<Value> _newValues = new ArrayList<Value>();
		for(int i = 0; i < _keys.size(); i++)
		{
			_newKeys.add(_keys.get(i));
		}
		for(int i = 0; i < _values.size(); i++)
		{
			_newValues.add(_values.get(i));
		}
	}
	@Override
	public void clear() {
		_keys.clear();
		_values.clear();
	}
	@Override
	public Set<Key> keySet() {
		Set<Key> _keysSet = new HashSet<Key>();
		for(int i = 0; i < _keys.size(); i++)
		{
			_keysSet.add(_keys.get(i));
		}
		return _keysSet;
	}
	@Override
	public Collection<Value> values() {
		Collection<Value> _valuesCollection = new ArrayList<Value>();
		for(int i = 0; i <_values.size(); i++)
		{
			_valuesCollection.add(_values.get(i));
		}
		return _valuesCollection;
	}
	@Override
	public Set<Entry<Key, Value>> entrySet() {
		Key k = _keys.get(0);
		Value v = _values.get(0);
		Set<Entry<Key, Value>> _setEntry = (Set<Entry<Key, Value>>) new AbstractMap.SimpleEntry<Key, Value>(k,v);
		for(int i = 0; i < _keys.size(); i++)
		{
			k = _keys.get(i);
			v = _values.get(i);
			((Map<Key, Value>) _setEntry).put(k,v);
		}
		return _setEntry;
	}

}
