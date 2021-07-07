# FIFO: En las colas el primero en entrar es el primero en salir
# recuerdan a las colas del supermercado

from collections import deque

cola = deque() # me crea una cola vacia
cola = deque( ['ana', 'juan', 'miguel'] )

# para añadir a la cola (se añade al final de la lista)
cola.append('rosa')
print(cola) #deque(['ana', 'juan', 'miguel', 'rosa'])

#para quitar (nos devuelve el primer elemento de la cola 'ana')
cola.popleft()
print(cola) #deque(['juan', 'miguel', 'rosa'])

print( type(cola) ) # <class 'collection.deque' >

