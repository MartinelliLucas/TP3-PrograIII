# TP3-PrograIII

Programacion III - Universidad Nacional de General Sarmiento
Trabajo Practico 3: La hora, referi!
El objetivo del trabajo practico es implementar un algoritmo goloso para asignar arbitros
a partidos de un campeonato, intentando maximizar la equidad de la asignacion. Se debera tambien implementar una aplicacion visual para ejecutar este algoritmo y visualizar sus
resultados.
Tenemos un campeonato con 2n equipos, de modo tal que en cada fecha se juegan n partidos
(cada equipo juega exactamente un partido por fecha). Como parte de los datos de entrada
tenemos el calendario de partidos. Tenemos ademas n arbitros. El problema consiste en
determinar quien sera el arbitro de cada partido, con el siguiente criterio. Para cada equipo i,
llamemos mi a la maxima cantidad de partidos de i con un mismo arbitro (es decir, si mi = 4
entonces el equipo i tiene a un mismoarbitro en cuatro partidos, y no tiene a ningun otro
arbitro en cinco o mas partidos). El objetivo es minimizar
P =1 2n X 2n i=1 mi
.
Se debera implementar una aplicacion visual con la siguiente funcionalidad.
1. Leer el calendario de partidos desde un archivo, cuyo formato queda a criterio del grupo.
Puede ser un archivo JSON, XML o de texto plano.
2. Mostrar el calendario de partidos en controles visuales adecuados.
3. Ejecutar el algoritmo goloso para asignar los arbitros. Por una cuestion de transparencia, los arbitros se denominan con los numeros de 1 a n en lugar de tener sus nombres.
4. Mostrar el resultado de la asignacion (es decir, que numero de arbitro estara a cargo de
cada partido).

Como objetivos opcionales no obligatorios, se pueden contemplar los siguientes elementos:
1. Mostrar estadısticas de la asignacion realizada (menor y mayor arbitro para cada equipo,
cantidad de equipos distintos de cada arbitro, etc.).
2. Una vez que se realizo la asignacion de numeros de arbitros a partidos, dar la posibilidad
de cargar los nombres de los n arbitros y hacer un sorteo para determinar a que arbitro
corresponde cada numero.
3. Permitir la edicion de la solucion obtenida por el algoritmo.
Condiciones de entrega: El trabajo practico se debe entregar por mail a los docentes
de la materia. Ademas del codigo, se debe incluir un documento en el que se describa la
implementacion y se detallen las decisiones tomadas durante el desarrollo. Todas las clases de
negocio deben incluir un conjunto adecuado de tests unitarios. El trabajo practico se puede
hacer en grupos de hasta tres personas.
Fecha de entrega: Martes 9 de noviembre.
