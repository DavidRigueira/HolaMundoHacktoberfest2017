#condicional switch
#no existe

#condicional while
c=0
while c<=5:
    c=c+1
    print('c vale '+str(c) )

#break
c=0
while c<=5:
    c+=1
    if(c==3):
        print('rompemos el bucle ')
        break
    print(c)

#continue
c=0
while c<=5:
    c+=1
    if c==3:
        print('Saltamos un paso del bucle')
        continue
    print(c)
