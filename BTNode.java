
public class BTNode<E> implements BTPosition<E> 
{
	private E element;
	private BTPosition<E> Right, Left, Parent;
	
	public BTNode()
	{
		this.element = null;
		this.Right = null;
		this.Left = null;
		this.Parent = null;
	}
	
	public BTNode(E element, BTPosition<E> Right, BTPosition<E> Left, BTPosition<E> Parent)
	{
		this.element = element;
		this.Right = Right;
		this.Left = Left;
		this.Parent = Parent;
	}
	
	public E getElement()
	{
		return element;
	}
	
	public void setElement(E elem)
	{
		element = elem;
	}
	
	public BTPosition<E> getLeft()
	{
		return Left;
	}
	
	public BTPosition<E> getRight()
	{
		return Right;
	}
	
	public BTPosition<E> getParent()
	{
		return Parent;
	}
	
	public void setLeft(BTPosition<E> Ltree)
	{
		Left = Ltree;
	}

	public void setRight(BTPosition<E> Rtree)
	{
		Right = Rtree;
	}
	
	public void setParent(BTPosition<E> Ptree)
	{
		Parent = Ptree;
	}
}
