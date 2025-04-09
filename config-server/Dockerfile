# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado al contenedor
COPY target/usuarios-servicio-0.0.1-SNAPSHOT.jar usuarios-servicio.jar

# Exponer el puerto en el que se ejecutará el microservicio
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "usuarios-servicio.jar"]