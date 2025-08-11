# Conversor de Moneda en Java

Este es un programa de consola en Java que convierte valores entre diferentes monedas utilizando datos en tiempo real de la API de ExchangeRate.

## Funcionalidad
- Convierte entre USD, ARS, BRL y COP.
- Muestra un menú con las opciones disponibles.
- Consulta las tasas de cambio en internet y realiza el cálculo automáticamente.

## Archivos principales
- **App.java** → Clase principal con el menú y lógica del programa.
- **ConsultaMoneda.java** → Clase que consulta la API y devuelve los datos.
- **Moneda.java** → Record que contiene el objeto `ConversionRates`.
- **ConversionRates.java** → Record con las tasas de cada moneda.

## Ejemplo de uso
```
1) Dolar >>> Peso Argentino
2) Peso Argentino >>> Dolar
...
Elija una opcion valida: 1
Ingrese el monto en USD: 10
El valor 10.0 [USD] corresponde a 8117.5 [ARS]
```

## Requisitos
- Tener **Java 17** o superior.
- Conexión a internet para acceder a la API.
- La librería **Gson** agregada al proyecto.

---
Challenge practico de programación en Java para AluraLATAM.
