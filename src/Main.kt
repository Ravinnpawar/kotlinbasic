fun main(args: Array<String>) {
    println("Hello world!")
    var name :String?=null
    val age :Int
    val student=Students("AS123","AJAY","MTECH",80)

    name="aabs"
    age = 10

    println("Roll Number= ${student.rollNumber} \nName=${student.name} \nSTD= ${student.std}  \nMarks= ${student.marks}" )
}