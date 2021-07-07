def cuadrado(numero=None):
    if numero is None:
        raise ValueError("El parametro no puede ser nulo")
    return numero ** 2


resultado = cuadrado(5)
print(resultado)

try:
    resultado = cuadrado()
    print(resultado)
except Exception as e:
    print("Error al calcular el cuadrado.", type(e).__name__)
