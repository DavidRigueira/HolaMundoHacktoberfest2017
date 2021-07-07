# las pilas recuerdan a una lata de pringles

#En este ejemplo el 8 sería la parte de arriba de la lata de pringles
pila=[2,6,4,8]

#añadir al final de la pila (en la parte de arriba)
pila.append(5)
print(pila)  # [2, 6, 4, 8, 5]

#quitamos un elemento tambien de la parte de arriba de la lista
pila.pop() 
print(pila) # [2, 6, 4, 8]

# si no hay elemento e intento hacer pop, dará fallo

# las pilas no son más que listas
print( type(pila) )  # <class 'list'> 
