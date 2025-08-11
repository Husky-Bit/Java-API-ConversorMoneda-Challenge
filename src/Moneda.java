// Este record representa la estructura principal que mapea la respuesta JSON completa de la API
// La API devuelve un objeto JSON que contiene una propiedad llamada "conversion_rates" que a su vez
// es un objeto con las tasas de cambio para diferentes monedas
// Por eso, aca se guarda un solo campo llamado conversion_rates que es de tipo ConversionRates
// que representa ese objeto anidado con las tasas
public record Moneda(
    ConversionRates conversion_rates
) {}
