package hashtable;

public interface INode<K> {
	K getkey();

	void setkey(K key);

	INode<K> getNext();

	void setNext(INode<K> next);
}
