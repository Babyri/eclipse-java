
public class Estudiante {
//	constructores
	public Estudiante() {
		
	}
	public Estudiante(float notamedia, int id, int edad) {
		
	}
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getNumeroDeNotas() {
		return numeroDeNotas;
	}
	public void setNumeroDeNotas(int numeroDeNotas) {
		this.numeroDeNotas = numeroDeNotas;
	}
	public int getSumadeNotas() {
		return sumadeNotas;
	}
	public void setSumadeNotas(int sumadeNotas) {
		this.sumadeNotas = sumadeNotas;
	}
	public float getNotamedia() {
		return notamedia;
	}
	public void setNotamedia(float notamedia) {
		this.notamedia = notamedia;
	}

	//	atributos
	int id;
	int edad;
	int telefono;
	int numeroDeNotas;
	int sumadeNotas;
	float notamedia;
//	metodos
	void mostrarInfo() {}
	void agregarNuevaNota () {}

}
