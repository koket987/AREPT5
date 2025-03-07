# Gestor de Propiedades Inmobiliarias

Este proyecto es un sistema de gestión de propiedades inmobiliarias que permite agregar, listar y eliminar propiedades a través de una API REST, con una interfaz web sencilla.

## Características
- **CRUD de propiedades**: Crear, Leer, Actualizar y Eliminar propiedades.
- **Interfaz web**: Formulario para agregar propiedades y listado en tiempo real.
- **API REST**: Backend en Java con Spring Boot.
- **Base de datos MySQL**: Almacena la información de las propiedades.

## Arquitectura del Sistema
El sistema se compone de tres partes principales:
- **Frontend**: Aplicación web en HTML, CSS y JavaScript, conectada a la API mediante `fetch`.
- **Backend**: Servidor REST en Java con Spring Boot que maneja las peticiones.
- **Base de datos**: MySQL almacena la información de las propiedades.

### Flujo de Trabajo
1. El usuario ingresa una nueva propiedad en el formulario web.
2. El frontend envía los datos al backend mediante una petición `POST`.
3. El backend guarda la información en MySQL y devuelve la lista actualizada.
4. El frontend muestra la lista de propiedades en la interfaz.

## Diseño de Clases
Las principales clases del sistema son:
- `Property`: Representa una propiedad inmobiliaria.
- `PropertyController`: Maneja las peticiones HTTP.
- `PropertyService`: Contiene la lógica de negocio.
- `PropertyRepository`: Interactúa con la base de datos.


## Despliegue en AWS

### Requisitos Previos
- Cuenta en AWS
- Instancia EC2 con Java y MySQL instalados
- Configurar la base de datos con:
```sql
CREATE DATABASE propertydb;
CREATE USER 'arep'@'%' IDENTIFIED BY 'Arep2025@#';
GRANT ALL PRIVILEGES ON propertydb.* TO 'arep'@'%';
FLUSH PRIVILEGES;
```

### Pasos de Despliegue
1. **Subir el proyecto a AWS**
```bash
scp -i key.pem target/app.jar ec2-user@IP_EC2:/home/ec2-user/
```
2. **Conectar a la instancia EC2**
```bash
ssh -i key.pem ec2-user@IP_EC2
```
3. **Ejecutar la aplicación**
```bash
java -jar /home/ec2-user/app.jar &
```
4. **Acceder a la aplicación**
```bash
http://EC2_PUBLIC_IP:8080/properties
```

## Capturas de Pantalla
### Listado de Propiedades

![Imagen de WhatsApp 2025-03-05 a las 19 38 27_385d12b4](https://github.com/user-attachments/assets/980795fe-9f10-4cad-9a20-f554e89b337d)


## Tecnologías Utilizadas
- **Java 11** (Spring Boot para el backend)
- **MySQL** (Almacenamiento de datos)
- **HTML, CSS, JavaScript** (Frontend)
- **AWS EC2** (Despliegue)

## Autores
- **Santiago** - Desarrollador Principal

## Licencia
Este proyecto está bajo la Licencia MIT.

## Agradecimientos
A la comunidad de desarrolladores de código abierto y a los recursos en línea por su documentación.

