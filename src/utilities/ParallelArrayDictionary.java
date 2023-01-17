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
	
	protected ParallelArrayDictionary<Key, Value> _dictionary;
	
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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Value remove(Object key) {
		_dictionary.remove(key); 
		return null;
	}
	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		putAll(_dictionary);
	}
	@Override
	public void clear() {
		_dictionary.clear();
	}
	@Override
	public Set<Key> keySet() {
		_dictionary.keySet();
		return null;
	}
	@Override
	public Collection<Value> values() {
		_dictionary.values();
		return null;
	}
	@Override
	public Set<Entry<Key, Value>> entrySet() {
		_dictionary.entrySet();
		return null;
	}

}
