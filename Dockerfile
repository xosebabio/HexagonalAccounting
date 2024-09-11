# Usamos la imagen oficial de MySQL
FROM mysql:9.0

# Establecemos variables de entorno para la configuración
ENV MYSQL_ROOT_PASSWORD=1234
ENV MYSQL_DATABASE=accounting

# Exponemos el puerto MySQL
EXPOSE 3306

# Iniciamos MySQL cuando se ejecute el contenedor
CMD ["mysqld"]