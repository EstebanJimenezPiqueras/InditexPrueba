# Prueba Inditex : realizada por Esteban Jimenez Piqueras

* El microservicio esta con la version java 23 , ya que no tenia ninguna en mi ordenador personal y he añadido la ultima, tampoco se ha especificado que version habia que utilizar.
  
* He utilizado mappstruck para hacer el mapper del Price al PriceDto pero no he podido utilizarlo con lombook, ya que por algun motivo no me cogia los @Getter @Setter, he tenido que añadir manualmente los getters y setters en los modelos, es algo que se me ha quedado pendiente de revisar.
* Configuracion H2 es la siguiente :
  *jdbc:h2:~/testdb
  *sa
  *password
