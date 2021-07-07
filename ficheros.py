fichero = open("fichero.txt",'r')
#leer fichero separado en lineas
lista_lineas = fichero.readlines()
fichero.close()

print(lista_lineas[0])  # primera linea
print(lista_lineas[1])  # segunda linea
print(lista_lineas[-1])  # ultima linea
# print(lista_lineas[2])  #  error el fichero solo tiene 2 lineas
len(lista_lineas) # cuantas lineas tiene el fichero
