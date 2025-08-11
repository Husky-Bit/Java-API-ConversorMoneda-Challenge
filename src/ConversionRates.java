// Este record representa el objeto anidado dentro del JSON que contiene las tasas de conversion
// Cada campo es una moneda con su tasa respecto a la moneda base de la consulta (ejemplo USD)
// Uso tipo double para tener mejor precision en los valores
// Este record esta separado para reflejar la estructura anidada del JSON y para mantener el codigo limpio y organizado
public record ConversionRates(
    double USD,
    double ARS,
    double BRL,
    double COP
) {}
