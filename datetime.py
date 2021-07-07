import datetime
dt = datetime.datetime(2000,1,1)
print(dt)

# dt.year = 2017 # error no es escribible

dt = dt.replace(year=2017) # correcto, usando replace
print(dt)
