
public interface BTPosition<E> 
{
	public E getElement();
	
	public void setElement(E elem);
	
	public BTPosition<E> getLeft();
	
	public BTPosition<E> getRight();
	
	public BTPosition<E> getParent();
	
	public void setLeft(BTPosition<E> Ltree);

	public void setRight(BTPosition<E> Rtree);
	
	public void setParent(BTPosition<E> Ptree);
}
