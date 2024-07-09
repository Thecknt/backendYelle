# Titulo del Proyecto: backend Yelle Codo a Codo 2024 Equipo 10

## Estructura del Proyecto

El proyecto sigue la siguiente estructura:

- **Model**: Contiene las entidades que representan los datos de la aplicación.
- **Service**: Contiene la lógica de negocio y las reglas de la aplicación.
- **Controller**: Gestiona las solicitudes HTTP y las respuestas.
- **Repository**: Interactúa con la base de datos utilizando JPA.

## Tecnologías Utilizadas

- **Java 22**
- **Spring Boot 3.3.1**
- **JPA**
- **MySQL**

## Características

- **Arquitectura MVC**: Separación clara de las responsabilidades de la aplicación.
- **JPA**: Para la persistencia y manipulación de los datos.
- **MySQL**: Base de datos utilizada para almacenar la información.
- **CORS**: Se permiten conexiones de cualquier ruta.

## Requisitos

- **Java 22**: Asegúrate de tener instalada la versión 22 de Java.
- **MySQL**: Configura una base de datos MySQL para el proyecto.

## Configuración

1. Clona el repositorio:
    ```bash
    git clone https://github.com/Thecknt/backendYelle.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd proyecto-backend-yelle
    ```
3. Configura la conexión a la base de datos en el archivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    ```
4. Ejecuta el proyecto:
    ```bash
    ./mvnw spring-boot:run
    ```

## Uso

Una vez que el proyecto esté en ejecución, podrás acceder a los diferentes endpoints definidos en los controladores para interactuar con la aplicación.

## Contribuir

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b nueva-funcionalidad`).
3. Realiza tus cambios y haz commit de ellos (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube tus cambios (`git push origin nueva-funcionalidad`).
5. Crea un nuevo Pull Request.
