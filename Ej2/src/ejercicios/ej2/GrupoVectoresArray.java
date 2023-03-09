package ejercicios.ej2;

import java.util.Iterator;

/** Grupo secuencial indexado de vectores (implementado con un array)
 */
public class GrupoVectoresArray {

	// TODO añadir atributos
	Vector2D[] vector2d;
	int vector_num;
	
	/** Crea un grupo de vectores
	 * @param tamanyo	Tamaño máximo (número de vectores que cabrán)
	 */
	public GrupoVectoresArray( int tamanyo ) {
		// TODO codificar este método
		vector2d = new Vector2D[tamanyo];
		vector_num = 0;
	}
	
	/** Crea un grupo de vectores con tamaño máximo 20
	 */
	public GrupoVectoresArray() {
		// TODO codificar este método
		vector2d = new Vector2D[20];
		vector_num = 0;
	}
	
	/** Devuelve el número de vectores guardados en este grupo
	 * @return	Número actual de vectores
	 */
	public int size() {
		// TODO codificar este método
		return vector_num;
	}
	
	/** Devuelve el vector situado en una posición dada
	 * @param indice	Su posición
	 * @return	El vector situado en esa posición
	 * @throws IndexOutOfBoundsException	Error generado si la posición no existe
	 */
	public Vector2D get( int indice ) throws IndexOutOfBoundsException {
		// TODO codificar este método	
		return vector2d[indice];
	}
	
	/** Añade un nuevo vector al final del grupo. Si el grupo ya está lleno, no se añade
	 * @param vec	Vector nuevo
	 */
	public void anyadir( Vector2D vec ) {
		// TODO codificar este método
		vector2d[vector_num] = vec;
		vector_num++;
	}
	
	/** Inserta un vector en el grupo (moviendo el resto de vectores de acuerdo al nuevo).
	 * Esta operación es errónea si el índice está fuera de rango (menor que 0 o mayor que el size())
	 * @param indice	Posición en la que se va a insertar
	 * @param vec	Vector nuevo
	 * @return	true si la inserción ha sido correcta, false si no se ha podido hacer
	 */
	public boolean insertar( int indice, Vector2D vec ) {
		// TODO codificar este método
		if(indice > size() || indice < 0 || vec == null)
			return false;
		
		for( int i  = size(); i < indice; i--)
		{
			vector2d[i+1] = vector2d[i];
		}
		vector2d[indice] = vec;
		vector_num++;
		return true;
	}
	
	/** Borra un vector del grupo
	 * @param indice	Posición del elemento que queremos borrar
	 */
	public void borrar( int indice ) {
		// TODO codificar este método
		for( int i  = indice; i < size(); i++)
		{
			vector2d[i] = vector2d[i+1];
		}
		vector2d[size()] = null;
		vector_num--;
		
	}
	
	@Override
	public String toString() {
		String string = new String();
		// TODO codificar este método
		for(int i = 0; i < size(); i++)
		{
			string += "Vector[" + i + "] = ";
			string += "x: "+ vector2d[i].getX() + ", " + "y: "+ vector2d[i].getY()+ "\n";
		}
		return "";
	}
	
}
