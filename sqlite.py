import sqlite3

conexion = sqlite3.connect('ejemplo.db')
cursor = conexion.cursor()

query= ' CREATE TABLE usuarios(id INTEGER PRIMARY KEY AUTOINCREMENT ,   \
nombre VARCHAR(100), edad INTEGER, email VARCHAR(255)  ) '
cursor.execute(query)
conexion.commit()
conexion.close()
