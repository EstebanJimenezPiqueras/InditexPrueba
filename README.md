# Prueba Técnica - API de Precios

## Autor
**Esteban Jiménez Piqueras**

## Descripción
Este proyecto es una API REST desarrollada en **Spring Boot** que permite consultar el precio aplicable a un producto en una fecha determinada.  

Los datos se cargan automáticamente desde un archivo `data.sql`, aunque hubo problemas iniciales con esta carga y se solucionó configurándolo mediante una clase de inicialización.

## Tecnologías utilizadas
- **Java 23**
- **Spring Boot**
- **H2 Database**
- **Maven**
- **JUnit 5**
- **MapStruct**

## Endpoint

### Obtener precio de un producto

**URL:**  GET http://localhost:8080/api/prices/getPrice?productId=35455&brandId=1&applicationDate=2020-06-14T16:00:00


**Parámetros:**
- `productId` (Integer): ID del producto.
- `brandId` (Integer): ID de la cadena (marca).
- `applicationDate` (LocalDateTime): Fecha y hora de consulta en formato `yyyy-MM-dd'T'HH:mm:ss`.

**Respuesta esperada (Ejemplo JSON):**
```json
{
    "productId": 35455,
    "brandId": 1,
    "priceList": 2,
    "applicationDate": "2020-06-14T16:00:00",
    "price": 25.45,
    "currency": "EUR"
}
```
## Configuración
**Base de datos en memoria (H2)**
El proyecto utiliza una base de datos H2 en memoria para pruebas. Se ha configurado para que los datos se carguen automáticamente al iniciar la aplicación.
**Datos de acceso a la consola H2:**
- `URL` : http://localhost:8080/h2-console.
- `JDBC URL` : jdbc:h2:mem:testdb.
- `Usuario` : sa.
- `Contraseña` : password.

## Pruebas
El proyecto cuenta con pruebas unitarias y de integración en JUnit 5 para validar la lógica de negocio y la correcta exposición del endpoint REST.

**Casos de prueba implementados**
1. Consulta a las 10:00 del 14 de junio de 2020 → Producto 35455, Marca 1 (ZARA).
2. Consulta a las 16:00 del 14 de junio de 2020 → Producto 35455, Marca 1 (ZARA).
3. Consulta a las 21:00 del 14 de junio de 2020 → Producto 35455, Marca 1 (ZARA).
4. Consulta a las 10:00 del 15 de junio de 2020 → Producto 35455, Marca 1 (ZARA).
5. Consulta a las 21:00 del 16 de junio de 2020 → Producto 35455, Marca 1 (ZARA).
