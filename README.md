# Titulo 1 <h1>
## Titulo 2 <h2>
### Titulo 3 <h3>

Titulo 1 subrayado
==================
Titulo 2 sin subrayar
---------------------


Italica: *hola* o _hola_

Negrita: **hola** o __hola__


Tachado: ~~hola~~

NOTA: Alt+126  o  AltGr+4 para pintar la ~ 

# Listas numeradas

1. Despertarme
2. Desayunar
2. Ir a clase

# Listas no numerdas
* Manzana
* Platano
* Pera
- Rapante
- Pez espada
- Pez gato
+ Ajos
+ Tomates
+ Lechugas

#Listas anidadas
1. Elemento 1
2. Elemento 2
    1. Sub elemento 1
    2. Sub elemento 2
* Sistemas operativos
    * Linux
    * Windows
        * Win 10
        * Win 95

# Enlaces
[Ir a google](http://www.google.es)


Puedo hacer referencia a una direccion directamente http://www.xunta.es en mi codigo


# Imagenes
![Logotipo gatito](https://icon-icons.com/icons2/365/PNG/256/kitten-icon_36975.png)



![Logotico gatito][logo]


[logo]:https://www.mundogato.net/wp-content/uploads/gif-de-gatitos-tiernos.gif



# Highlighting de codigo
```java
class Profesor{
    public static void main(String[] args){
        System.out.println("Hola");
    }
}
```

# Tablas
| PROFESOR  |  ALTURA | EDAD|
| -------   |  ------ | ----|
|Pepe       | 180     |42   |
|Bea        | 183     |43   |  
|Jesus      | 170     |50   |



| PROFESOR  |  ALTURA | EDAD|
| :------   |  :-----:| ---:|
|Pepe       | 180.5   |42   |
|Bea        | 183     |_43_ |  
|**Jesus**  | 170     |50   |


# Blockquotes
> El blockquote es una cita textual.
>> esto está dentro del blockquote

# codigo html en linea

<p style="text-align:center">Esto es un parafo</p>
<a href="www.google.es"> ir a google</a>

```
<p> Esto es un parrafo</p>
```


# lineas horizontales
con asteriscos
***
con guiones bajos 
___



# Videos de youtube
<a href="https://www.youtube.com/watch?v=OgIRAjnnJzI">
<img src="https://img.youtube.com/vi/OgIRAjnnJzI/0.jpg" width="240" height="180" border="5">
</a>


# Notas al pie
Se pueden crear notas al pie [^nota1], esto solo funciona en visual code instalando una extension

[^nota1]: Aqui va el texto de la nota al pie


# Funciones matemáticas



<script type="text/javascript" src="https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS_HTML"></script>



$$
\Gamma(z) = \int_0^\infty t^{z-1}e^{-t}dt\,.
$$


