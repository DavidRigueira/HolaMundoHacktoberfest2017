# La almohadilla con un espacio, crea un título, parecido al h1
## Con dos almohadillas sería como un h2
### Tres serían como un h3, y así hasta h6 como minimo.

Titulo 1 subrayado (con varios simbolos de igual)
===============================================

Titulo 2 sin subrayar (con varios guiones)
----------------------------------------------

Italica: *escrito entre asteriscos*
Negrita: **escrito entre dos asteriscos de cada lado**

__También se pueden usar dos barras bajas___

Tachado: ~~Con doble virgulilla~~ alt+126 o AltGr+4

## Listas numeradas:
1. Poner el número
2. Seguido de un punto
3. Luego un espacio
4. Y a continuación el texto

## Listas no numeradas
* Usamos un asterisco
* En cada elemento de la lista
* Luego el texto correspondiente
- Tambien se pueden usar guiones
- Para separar levemente la lista
+ El simbolo de suma
+ Tambien añade elementos a la lista

## Listas anidadas
1. Empieza con una lista normal
2. En este caso numerada
    * Tabulando creas el anidamiento
    * El solito
    - Respetando las reglas anteriores
3. Incluso puedes volver a tu lista

## Enlaces
[Ir a Google](http://www.google.es)

Puedo hacer referencia a una direccion http://www.xunta.es directamente en mi codigo

## Imágenes
![Texto alternativo para la imagen en caso de no tenerla](https://orig00.deviantart.net/e183/f/2012/286/1/f/gatete_by_maesesag-d5hovyr.jpg)

![Otra forma de hacerlo es poner tambien entre corchetes un identificador][gatete]

[gatete]:https://orig00.deviantart.net/e183/f/2012/286/1/f/gatete_by_maesesag-d5hovyr.jpg

# Highlighting de codigo
```Java
class Profesor 
{
        public static void main(String[] args)
        {
            //Se ponen tres comillas (las de al lado de la P) y el nombre del lenguaje a utilizar. Otras tres comillas para finalizar el segmento de codigo.
            System.out.println("Hola");
        }
}
```

## Tablas
|PROFESOR    |ALTURA  |EDAD |
|------------|--------|-----|
|Pepe        |180     |42   |
|Bea         |183     |43   |
|Jesus       |170     |50   |

### Alineado al centro o a la derecha
|PROFESOR    |ALTURA  |EDAD |
|------------|:------:|----:|
|Pepe        |180     |42   |
|Bea         |183     |43   |
|Jesus       |170     |50   |

## Blockquotes, citas textuales
> El blockquote es una cita textual.
>> Esto está dentro de un blockquote superior

## Código html en línea
<p>Esto es un párrafo</p>
<a href="www.google.es">Esto es un enlace</a>

```html
<p>Esto es un párrafo</p>
<a href="www.google.es">Esto es un enlace</a>
<p>Pero no se interpreta porque va como código</p>
```

## Líneas horizontales
Con tres asteriscos
***
Con guiones bajos
___

## Vídeos de Youtube
<a href="https://www.youtube.com/watch?v=wxL4ElboiuA"><img src="https://img.youtube.com/vi/v=wxL4ElboiuA/0.jpg" width="240" height="180" border="5"></a>

## Notas al pie
Se pueden crear notas al pie, haciendo lo siguiente [^nota1], esto solo funciona en VisualCode instalando una extensión.

[^nota1]: Aquí va el texto de la nota al pie.

## Funciones matemáticas


$$
\Gamma(z) = \int_0^\infty t^{z-1}e^{-t}dt\,.
$$

