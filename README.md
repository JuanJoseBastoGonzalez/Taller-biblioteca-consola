# 📚 Taller Biblioteca Consola - Proyecto Java

![Java](https://img.shields.io/badge/Java-17%252B-blue)
![Maven](https://img.shields.io/badge/Maven-3.8.4-red)
![License](https://img.shields.io/badge/License-MIT-green)

Proyecto de sistema de gestión bibliotecaria desarrollado en Java con interfaz gráfica Swing.

## 👨‍💻 Autor

- **Juan José Basto González**
- [GitHub](https://github.com/JuanJoseBastoGonzalez)
- [LinkedIn](https://www.linkedin.com/in/juan-jose-basto-gonzalez-49945023a/)

## 🚀 Características principales

- Gestión completa de usuarios y libros
- Préstamos y devoluciones de libros
- Interfaz gráfica intuitiva con Swing
- Persistencia en memoria (listas)
- Patrón Singleton para la clase Biblioteca

## 🛠️ Tecnologías utilizadas

- Java 17
- Maven
- Swing (GUI)
- JUnit (pruebas unitarias)

## 📦 Estructura del proyecto

Copy

```
Taller-biblioteca-consola/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── mycompany/
│   │   │           └── taller/
│   │   │               └── biblioteca/
│   │   │                   ├── consola/
│   │   │                   │   ├── Biblioteca.java
│   │   │                   │   ├── Libro.java
│   │   │                   │   ├── Usuario.java
│   │   │                   │   ├── CrearUsuario.java
│   │   │                   │   ├── CrearLibro.java
│   │   │                   │   ├── PrestarLibro.java
│   │   │                   │   └── DevolverLibro.java
│   │   │                   └── TallerBibliotecaConsola.java
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── mycompany/
│   │               └── taller/
│   │                   └── biblioteca/
│   │                       └── consola/
│   │                           └── BibliotecaTest.java
├── pom.xml
└── README.md
```

## ⚙️ Configuración

### Requisitos

- JDK 17+
- Maven 3.8.4+

### Instalación

1. Clona el repositorio:

bash

Copy

```
git clone https://github.com/JuanJoseBastoGonzalez/Taller-biblioteca-consola.git
```

1. Compila el proyecto:

bash

Copy

```
mvn clean install
```

1. Ejecuta la aplicación:

bash

Copy

```
mvn exec:java
```

## 🖥️ Uso

La aplicación presenta un menú gráfico con las siguientes opciones:

1. Crear usuario
2. Agregar libro
3. Prestar libro
4. Devolver libro
5. Listar usuarios
6. Listar libros

## 📝 Licencia

Este proyecto está bajo la licencia MIT. Ver el archivo [LICENSE](https://LICENSE) para más detalles.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor abre un issue o envía un pull request.

## 📬 Contacto

Para cualquier consulta, puedes contactarme a través de:

- GitHub: [JuanJoseBastoGonzalez](https://github.com/JuanJoseBastoGonzalez)
- LinkedIn: [Juan José Basto González](https://www.linkedin.com/in/juan-jose-basto-gonzalez-49945023a/)