package utilities;

import java.util.ArrayList;
import java.util.Collection;
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
		for(int i = 0; i < _keys.size(); i++)
		{
			if(_keys.get(i).equals(key))
			{
				return _values.get(i);
			}
		}
		return null;
	}
	@Override
	public Value put(Key key, Value value) {
		_keys.add(key);
		_values.add(value);
		return null;
	}
	@Override
	public Value remove(Object key) {
		if(_keys.contains(key))
		{
			for(int i = 0; i < _keys.size(); i++)
			{
				if(_keys.get(i).equals(key))
				{
					_keys.remove(i);
				}
			}
		}
		return null;
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
		Set<Key> _keysSet = new Set<Key>();
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
		Set<Entry<Key, Value>> _setEntry = new Set<Entry<Key, Value>>();
		for(int i = 0; i < _keys.size(); i++)
		{
			for(int x = 0; x < _values.size(); x++)
			{
				_setEntry.add(_keys.get(i), _values.get(x));
			}
		}
	}

}
