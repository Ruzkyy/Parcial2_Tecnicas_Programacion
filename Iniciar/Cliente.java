package Iniciar;
import java.util.Scanner;
public class Cliente {
    Scanner lector = new Scanner(System.in);

        private String nombre ;
        private String direccion ;
        private String listapedidos ;

        public Cliente(String nombre, String direccion, String ) {
            this.direccion = direccion;
            this.nombre = nombre;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }


    }
