package ejercicios.ej2;

import java.util.ArrayList;

/** Grupo secuencial indexado de vectores (implementado con un arraylist)
 * (Implementación alternativa a GrupoVectoresArray)
 */
public class GrupoVectores {
	// TODO Definir atributos
	ArrayList<Vector2D> vector2d;
	
	/** Crea un grupo de vectores
	 */
	public GrupoVectores() {
		// TODO codificar este método
		vector2d = new ArrayList<Vector2D>();
	}
	
	/** Devuelve el número de vectores guardados en este grupo
	 * @return	Número actual de vectores
	 */
	public int size() {
		// TODO codificar este método
		return vector2d.size();
	}
	
	/** Devuelve el vector situado en una posición dada
	 * @param indice	Su posición
	 * @return	El vector situado en esa posición
	 * @throws IndexOutOfBoundsException	Error generado si la posición no existe
	 */
	public Vector2D get( int indice ) throws IndexOutOfBoundsException {
		// TODO codificar este método
		return vector2d.get(indice);
	}
	
	/** Añade un nuevo vector al final del grupo
	 * @param vec	Vector nuevo
	 */
	public void anyadir( Vector2D vec ) {
		// TODO codificar este método
		vector2d.add(vec);
	}
	
	/** Inserta un vector en el grupo (moviendo el resto de vectores de acuerdo al nuevo).
	 * Esta operación es errónea si el vector es nulo o si el índice está fuera de rango (menor que 0 o mayor que el size())
	 * @param indice	Posición en la que se va a insertar
	 * @param vec	Vector nuevo
	 * @return	true si la inserción ha sido correcta, false si no se ha podido hacer
	 */
	public boolean insertar( int indice, Vector2D vec ) {
		// TODO codificar este método	
		if(vec == null || indice > size()) return false;
		
		vector2d.add(indice, vec);
	
		return true;
	}
	
	/** Borra un vector del grupo
	 * @param indice	Posición del elemento que queremos borrar
	 */
	public void borrar( int indice ) {
		// TODO codificar este método
		vector2d.remove(indice);
	}
	
	@Override
	public String toString() {
		String string = new String();
		// TODO codificar este método
		for(int i = 0; i < size(); i++)
		{
			string += "Vector[" + i + "] = ";
			string += vector2d.get(i).toString() + "\n";
			
		}
		return "";
	}
	
}
