Algoritmo ruleta
	
	definir num, pares, impares,ceros Como Entero
	pares =0
	impares=0
	ceros=0
	n=15
	Para i=1 Hasta n Con Paso 1 Hacer
		num = Aleatorio(0,36)
		Escribir num
		
		Si num mod 2=0 Entonces
			pares=pares+num
		SiNo
			Si num mod 2= 1 Entonces
				impares = impares+num
			SiNo
				ceros= ceros+num
			Fin Si
		Fin Si
		
	Fin Para
	
	Escribir "pares " pares/100 "%"
	Escribir "impares " impares/100 "%"
	Escribir "ceros " ceros/100 "%"
	
FinAlgoritmo
