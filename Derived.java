public interface Derived<E> 
{
	
	public LinkedRBinaryTree<E> Dadd();
	
	public LinkedRBinaryTree<E> Dsoustraction();
	
	public LinkedRBinaryTree<E> Dmult();
	
	public LinkedRBinaryTree<E> Ddiv();
	
	public LinkedRBinaryTree<E> Dsin();
	
	public LinkedRBinaryTree<E> Dcos();
	
	/*
	 * Input : Un arbre de type LinkedRBinaryTree représentant une fonction à exposant.
	 * Output : La derive de cette arbre. 
	 */
	public LinkedRBinaryTree<E> Dfunction(LinkedRBinaryTree<E> Tree);

}
