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
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Value get(Object key) {
		// TODO Auto-generated method stub
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
		return null;
	}
	@Override
	public Collection<Value> values() {
		Collection<Value> _valuesCollection = new Collection<Values>();
		{
			for(int i = 0; i <_values.size(); i++)
			{
				_valuesCollection.add(_values.get(i));
			}
		}
		return _valuesCollection;
	}
	@Override
	public Set<Entry<Key, Value>> entrySet() {
		Set<Entry<Key, Value>> _setEntry = new Set<Entry<Key, Value>>();
		{
			
		}
	}

}
