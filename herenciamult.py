# java no lo permite, pero python si
# cuidado porque crea programas muy complejos de gestionar
# python da prioridad a las clases más a la izquierda en la declaración

class A:
    def __init__(self):
        print("creado el objeto A")

class B:
    def __init__(self):
        print("creado el objeto B")

class C(A , B):
    def __init__(self):
        super().__init__()
        print("creado el objeto C")


c=C()
