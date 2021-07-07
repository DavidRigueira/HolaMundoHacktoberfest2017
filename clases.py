# self hace referencia al propio objeto, y sirve para diferneciar entre el ambito de clase
#y el ambito del método

class Galleta:
    chocolate=False

    def __init__(self):
        print('Acabas de crear una galleta')

    def untar_chocolate(self):
        # chocolate=True  #esto hace referencia a una variable de la función untar_chocolate
        self.chocolate = True

una_galleta = Galleta()
print(una_galleta.chocolate) # False
una_galleta.untar_chocolate()
print(una_galleta.chocolate) # True
