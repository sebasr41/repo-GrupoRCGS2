# Programación Visual -TP6: Conexión a Base de Datos & Spring Data JPA

**Objetivo de aprendizaje:**

* Uso de application.properties para definir una conexión a una BD.
* Creación de un esquema de BD
* ORM (Mapeo Objeto Relacional) utilizando anotaciones.

### Integrantes del grupo RCGS:

| Nombre y apellido:       | LU   | Usuario GitHub |
| ------------------------ | ---- | -------------- |
| Benicio Roxana           | 3215 |    @3215U            |
| Rojas Rafael Sebastian   | 4292 |    @sebasr41            |
| Michel Orlando Cristian  | 4155 |    @mike47k            |
| Mamani Gabriel Alejandro | 4148 |    @gam98            |

### Puntos del trabajo práctico:

1. Continuando con el desarrollo del proyecto del **TP N° 5**. Realice la organización y división de tareas para poder modificar el proyecto con los nuevos requerimientos.

2. Crear un nuevo repositorio donde se almacenará el proyecto del TP N° 5 completo.

3. Agregue las dependencias necesarias en el archivo pom.xml:
   * Spring Data JPA
   * MySqlDriver
   
4. Agregar en el archivo **application.properties** las siguientes propiedades, los valores para alguna de las propiedades dependerán del motor de base de datos seleccionado (mysql, postgresql, etc)

   ```java
   # url para la conexión a la base de datos Mysql
   spring.datasource.url = jdbc:mysql://localhost:3306/bd_tracking?serverTimezone=UTC
   # usuario que se conecta a la bd
   spring.datasource.username = root
   # password del usuario que se conecta a la bd 
   spring.datasource.password = root
   #log para mostrar las sentencias sql que ejecuta jpa  
   spring.jpa.show-sql = true
   #definicion de mysql dialect
   spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
   #iniciar el esquema
   spring.jpa.generate-ddl = true
   #permite realizar la creación eliminación de tablas
   spring.jpa.hibernate.ddl-auto = create-drop
   #spring.jpa.hibernate.ddl-auto = update
   ```

5. Por cada una de las clases correspondientes al paquete **model**, realizar el mapeo utilizando anotaciones pertenecientes al paquete **javax.persistence** (@Entity, @Table)

6. En cada clase indicar el nombre de la tabla (en plural) con la cual se mapeará, el nombre debe estar en mayúsculas.

7. En cada clase se debe indicar que atributo será la clave primaria (@Id)

8. Por cada atributo indicar el nombre de la columna (@Column).

9. Realice el mapeo de la relación detectada entre las clases Compra y Producto. Verifique que la construcción de la tabla compras realmente puede guardar el dato correspondiente del producto (clave foránea).
