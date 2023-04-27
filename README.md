# EX02 - API Clinica dental

### 1. Introducción

En el presente proyecto del Bootcamp Full Stack correspondiente a la parte Spring Framework se espera que el alumno demuestre todos los conocimientos adquiridos en desarrollo de APIs. 

### 2. Descripción

Desde el departamento de producto nos piden crear el backend correspondiente al sistema de gestión de citas para una Clínica Dental.

![image](https://user-images.githubusercontent.com/62121921/233947608-7c7f507c-cef3-4de8-b0ae-70e285b62a45.png)


Para ello el cliente deberá ser capaz de registrarse en la aplicación, hacer login & logout y acceder a su área de cliente, todo ello visualmente desde el navegador.(*** en este punto el registro y login no son necesarios) En su área de cliente deberá poder ver una lista de las citas que tiene a futuro, crear citas, modificarlas y anularlas.

También existirá una zona de usuario con sus datos personales, que solo podrá ver él mismo. Además, los dentistas deberán poder registrarse como profesionales, hacer login y logout y ver todas las citas y clientes registrados.

Teniendo en cuenta los requisitos, llegamos a la conclusión de que este sería el mínimo de endpoints convenientes:

1. Perfil de usuario
2. Modificación de datos del perfil
3. Creación de citas
4. Modificación de citas
5. Anulación de citas
6. Ver todas las citas que tengo como cliente (solo las propias)
7. Ver todas las citas existentes (como dentista)
8. Ver todos los clientes registrados (como dentista)

**EXTRAS**

1. Ver una cita en detalle
2. Elegir médico en la cita
3. Como médico, poder ver solo mis citas
4. Añadir tipos de intervención / consulta a las citas

En esta primera fase de proyecto el alumno ha de realizar una  API REST completa,   con   Spring Framework,   que   cumpla   con   los   requisitos   anteriormente planteados. 

Deﬁne los endpoints necesarios para que el backend pueda cumplir con lo establecido, nutriendo las diferentes vistas de frontend. 

Además de de lo mencionado anteriormente el alumno ha de incluir la siguiente funcionalidad: 

- Mysql
- JPA
- Relaciones necesarias
- CRUD de los diferentes modelos.
- Excelente Readme (IMPORTANTE). 


# Clientes

### Listar todos los clientes

**GET** ``` localhost:8181/api/clientes ```

### Añadir clientes

**POST** ```localhost:8181/api/clientes```

```
{
    "dni": "12345678A",
    "nombre": "Nombre Cliente",
    "apellido": "Apellido Cliente"
}
```

### Listar clientes por id

**GET** ```localhost:8181/api/clientes/{id}```

```
localhost:8181/api/clientes/1
```

### Actualizar clientes

**PUT** ```localhost:8181/api/clientes/{id}```

```
localhost:8181/api/clientes/1
```

```
{
    "dni": "12345678A",
    "nombre": "Nombre Cliente",
    "apellido": "Apellido Cliente"
}
```

### Eliminar clientes

**DELETE** ```localhost:8181/api/clientes/{id}```

```
localhost:8181/api/clientes/1
```

### Listar todos los citas como cliente (propias)

**GET** ``` localhost:8181/api/citas/cliente/{id} ```

```
localhost:8181/api/citas/cliente/1
```

# Dentistas

### Listar todos los dentistas

**GET** ``` localhost:8181/api/dentistas ```

### Añadir dentistas

**POST** ```localhost:8181/api/dentistas```

```
{
    "dni": "12345678A",
    "nombre": "Nombre Dentista",
    "apellido": "Apellido Dentista"
}
```

### Listar dentistas por id

**GET** ```localhost:8181/api/dentistas/{id}```

```
localhost:8181/api/dentistas/1
```

### Actualizar dentistas

**PUT** ```localhost:8181/api/dentistas/{id}```

```
localhost:8181/api/dentistas/1
```

```
{
    "dni": "12345678A",
    "nombre": "Nombre Dentista",
    "apellido": "Apellido Dentista"
}
```

### Eliminar dentistas

**DELETE** ```localhost:8181/api/dentistas/{id}```

```
localhost:8181/api/dentistas/1
```

### Listar todos los citas (como dentista)

**GET** ``` localhost:8181/api/dentistas/citas ```

### Listar todos los clientes (como dentista)

**GET** ``` localhost:8181/api/dentistas/clientes ```


# Citas

### Listar todos los citas

**GET** ``` localhost:8181/api/citas ```

### Añadir citas

**POST** ```localhost:8181/api/citas```

```
{

"id": 1,
  "cliente": {
    "dni": "12345678A",
    "nombre": "Nombre Cliente",
    "apellido": "Apellido Cliente"
  },
  "dentista": {
    "dni": "12345678A",
    "nombre": "Nombre Dentista",
    "apellido": "Apellido Dentista"
  },
  "fecha_hora": "2023-01-01T18:00:00"
  
}
```

### Listar citas por id

**GET** ```localhost:8181/api/citas/{id}```

```
localhost:8181/api/clientes/1
```

### Actualizar citas

**PUT** ```localhost:8181/api/citas/{id}```

```
localhost:8181/api/citas/1
```

```
{

"id": 1,
  "cliente": {
    "dni": "12345678A",
    "nombre": "Nombre Cliente",
    "apellido": "Apellido Cliente"
  },
  "dentista": {
    "dni": "12345678A",
    "nombre": "Nombre Dentista",
    "apellido": "Apellido Dentista"
  },
  "fecha_hora": "2023-01-01T18:00:00"
  
}
```

### Eliminar citas

**DELETE** ```localhost:8181/api/citas/{id}```

```
localhost:8181/api/citas/1
```

