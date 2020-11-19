fun main() {
    var i=0
    var lista = listOf(Gato(2), Perro(20), Persona(89),Gato(3), Perro(15), Persona(79),Gato(3), Perro(25), Persona(99))
/*  var countPersonas= lista.filter{
        it is Persona
    }.size             Esto puede sustituir a un contador para saber cuantas
    personas hay el it is Persona es la condicion*/
    var countPersonas=0
    var pesoPersonas=0
    var countPerros=0
    var pesoPerros=0
    var countGatos=0
    var pesoGatos=0
   lista.forEach{
       when(it){
          is Persona ->{
              countPersonas++
              pesoPersonas += it.peso
          }
          is Perro ->{
              countPerros ++
              pesoPerros += it.peso
          }
          is Gato -> {
              countGatos++
              pesoGatos += it.peso
          }
       }
   }
    // Haz un ejercicio como output tenga:
    // El peso medio de los gatos es:
    // El peso medio de los perros es:
    // El peso medio de las personas es:
    println("El peso medio de las personas es = ${pesoPersonas/ countPersonas}")
    println("El peso medio de los gatos es = ${pesoGatos/ countGatos}")
    println("El peso medio de los perros es = ${pesoPerros/ countPerros}")
    /* if(it is Gato){
            it.peso
        }*/

}