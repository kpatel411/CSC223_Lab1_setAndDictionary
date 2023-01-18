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
		// TODO Auto-generated constructor stub
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
		Value val = _values.get(0);
		for(int i = 0; i < _keys.size(); i++)
		{
			if(_keys.get(i).equals(key))
			{
				val = _values.get(i);
			}
		}
		return val;
	}
	@Override
	public Value put(Key key, Value value) {
		if(_keys.isEmpty()) { return null; }
		if(_values.isEmpty()) { return null; }
		Value oldVal = null;
		for(int i = 0; i < _keys.size(); i++)
		{
			if(_values.get(i).equals(null))
			{
				return null;
			}
			else { oldVal = _values.get(i); }
			_values.set(i, value);
		}
		return oldVal;
	}
	@Override
	public Value remove(Object key) {
		if(_values.isEmpty()) { return null; } 
		Value oldVal = null;
		for(int i = 0; i < _keys.size(); i++)
		{
			if(_keys.get(i).equals(key))
			{
				if(_values.get(i).equals(null)) { return null; }
				else { oldVal = _values.get(i); }
				_values.remove(i);
			}
		}
		return oldVal;
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
