//Question 1)Define 10 if statements and 5 conditional expressions using the when keyword.
//1a Define 10 if statements

fun main(){
    var a :Int = 10
    var b :Int = 25
    if (a > b){
        println("$a is greater than $b ")
    }else{
        println("$a is not greater than $b")
    }
    var timeOfMonth : String = "August"
    if(timeOfMonth == "August"){
        println("Welcome to August")
    }else{
        println("This is not August")
    }
    var fullName ="Charles Akarekor"
    if (fullName == "Charles Akarekor") {
        println("This is Charles Akarekor")
    }else{
        println("This is not Charles Akarekor")
    }
    var fNum :Int = 10
    var sNum: Int = 12
    if(fNum == sNum){
        println("This is true")
    }else{
        println("This is false")
    }
    var cAnimal :String = "dog"
    var bAnimal: String = "cat"
    if(cAnimal < bAnimal){
        println("Dog comes first")
    }else{
        println("Cat comes first")
    }
    val c = 5
    val d = 10

    if (c < d) {
        println("Minimum is $c")
    }else{
        println("Minimum is $d")
    }
    if (c > d) {
        println("Maximum is $c")
    }else{
        println("Maximum is $d")
    }
    var animal:  String = "Lion"
    if(animal == "Cat" || animal == "Dog") {
        println("Animal is a domestic animal")
    }else{
        println("Animal is a wild animal")
    }
    var car:  String = "Lexus"
    if(car == "Honda") {
        println("This is not a toyota make")
    }else{
        println("This is a toyota make")
    }
    var day:  String = "Monday"
    if(day == "Monday") {
        println("Wear green")
    }else{
        println("Wear dark blue")
    }

    //Question 1B) 5 conditional expressions using the when keyword

    var timeOfDay : String ="Evening"
    var whatToWear : String = when(timeOfDay){
        "Morning" -> "Wear white jean shorts"
        "Afternoon" -> "Wear black jean shorts"
        "Evening" -> "Wear pink Jean shorts"
        else -> "Wear Trousers"
    }
    println (whatToWear)

    var timeOfWeek : String = "Wednesday"
    var whatToDo : String = when(timeOfWeek){
        "Monday" -> "Study HTML"
        "Tuesday" -> "Study CSS"
        "Wednesday" -> "Study Kotlin"
        else -> "Do Nothing"
    }
    println(whatToDo)
    var timeOfYear : String = "December"
    var activity: String = when{
        timeOfYear == "January" -> "Travel to England"
        timeOfYear == "August" -> "Celebrate my birthday"
        timeOfYear == "December" -> "Travel to Brazil"
        else -> "Stay in Nigeria"
    }
    println(activity)

    var foodClass :String = "Protein"
    var foodType : String = when(foodClass){
        "Carbonhydrates" -> "Rice, Yam"
        "Protein" -> "Meat , Fish"
        else -> "Not Protein"
    }
    println(foodType)

    var vehicle : String = "Honda"
    var vehicleType :String = when{
        vehicle == "Truck" -> "This is a semi-heavy vehicle"
        vehicle == "Mack 4" -> "This is a heavy vehicle"
        else -> "This is a passenger car"
    }
    println(vehicleType)

    // Question 2a) Define a loop which will print out 1 - 100.
    //2b) Also define a loop which will print out 1 - 10 to the console without printing out the numbers 4 and 5.
    for (z in 1..100){
        print(z)
    }
    for (x in 1 .. 10){
        if (x == 4){
            continue}
        if (x == 5){
            continue}
        println(x)
    }

//Question 3) Using a loop and the modulus operator, write a program which will print out only the even numbers
// between 10 and 20 and the odd numbers between 20 and 30: NB: Use only one loop
    var numbers: Array<Int> = arrayOf(10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30)
    var evenNumbers: Int =0
    var oddNumbers: Int=0

    for(evenNumbers in 10..20){
        if(evenNumbers % 2 ==0)
            println(evenNumbers)
    }
    for(oddNumbers in 20..30){
        if(oddNumbers % 2==1)
            println(oddNumbers)
    }

    // Question 4 )Define 5 Classes
    var aPerson: Person = Person(name = "Benjamin", age= 30,skinColour = "Black",phoneNum="08134552088")
    println(aPerson.getName())
    println(aPerson.getAge())
    println(aPerson.getSex())
    println(aPerson.getSkinColour())
    println(aPerson.getPhoneNum())

    var aAnimal: Animal =Animal(name1="lion",species="mammal", age1 = 2,typeOfFood = "flesh",sex1= "male")
    println(aAnimal.setName1())
    println(aAnimal.setSpecies())
    println(aAnimal.setAge1())
    println(aAnimal.setTypeOfFood())
    println(aAnimal.setSex1())

    var aFootballTeam: FootballTeam = FootballTeam(name ="Chelsea FC",dateCreated = "1905", league="Premier League",
        position = "4th",lastCupWon = "UCL")
    println(aFootballTeam.getName())
    println(aFootballTeam.getDateCreated())
    println(aFootballTeam.getLeague())
    println(aFootballTeam.getPosition())
    println(aFootballTeam.getLastCupWon())

    var aVehicle: Vehicle = Vehicle(name ="Toyota",type ="Venza",model =2005,countryOfOrigin = "Japan", colour= "White")
    println(aVehicle.setName())
    println(aVehicle.setType())
    println(aVehicle.setModel())
    println(aVehicle.setCountryOfOrigin())
    println(aVehicle.setColour())

    var aPhone : Phones = Phones(name = "Tecno",operatingSystem = "Android",model ="Camon 11",yearOfMake= 2005,
        countryOrigin = "China")
    println(aPhone.getName())
    println(aPhone.getOperatingSystem())
    println(aPhone.getModel())
    println(aPhone.getYearOfMake())
    println(aPhone.getCountryOrigin())

}

class Person{
    private var name : String = ""
    private var age :Int = 0
    private var sex :String =""
    private var skinColour : String =""
    private var phoneNum :String = ""
    constructor(name :String,
                age :Int = 0,
                sex :String ="",
                skinColour : String ="",
                phoneNum :String = ""){
        this.name= name
        this.age= age
        this.sex= sex
        this.skinColour= skinColour
        this.phoneNum= phoneNum
    }
    fun getName() : String{
        return this.name
    }
    fun getAge() : Int{
        return this.age
    }
    fun getSex() : String{
        return this.sex
    }
    fun getSkinColour() : String{
        return this.skinColour
    }
    fun getPhoneNum() : String{
        return this.phoneNum
    }


}
class Animal(){
    private var name1: String =""
    private var species: String =""
    private var age1: Int= 0
    private var typeOfFood:String = ""
    private var sex1: String =""
    constructor(name1 :String,
                species:String,
                age1:Int,
                typeOfFood:String,
                sex1:String) : this() {
        this.name1 =name1
        this.species = species
        this.age1 = age1
        this.typeOfFood=typeOfFood
        this.sex1= sex1
    }
    fun setName1(): String {
        return this.name1
    }
    fun setSpecies(): String {
        return this.species
    }
    fun setAge1(): Int {
        return this.age1
    }
    fun setTypeOfFood(): String {
        return this.typeOfFood
    }
    fun setSex1(): String {
        return this.sex1
    }

}
class FootballTeam{
    private var name:String = ""
    private var dateCreated: String = ""
    private var league: String = ""
    private var position: String = ""
    private var lastCupWon: String= ""
    constructor(name: String,
                dateCreated:String,
                league: String,
                position: String,
                lastCupWon: String){
        this.name = name
        this.dateCreated = dateCreated
        this.league = league
        this.position = position
        this.lastCupWon = lastCupWon
    }
    fun getName(): String{
        return this.name
    }
    fun getDateCreated(): String{
        return this.dateCreated
    }
    fun getLeague(): String{
        return this.league
    }
    fun getPosition(): String{
        return this.position
    }
    fun getLastCupWon(): String{
        return this.lastCupWon
    }
}


class Vehicle{
    private var name:String= ""
    private var type :String = ""
    private var model:Int = 0
    private var countryOfOrigin :String = ""
    private var colour: String = ""
    constructor(name: String,
                type :String,
                model : Int,
                countryOfOrigin:String,
                colour: String){
        this.name = name
        this.type = type
        this.model= model
        this.countryOfOrigin = countryOfOrigin
        this.colour = colour
    }
    fun setName(): String{
        return this.name
    }
    fun setType(): String {
        return this.type
    }
    fun setModel(): Int {
        return this.model
    }
    fun setCountryOfOrigin(): String {
        return this.countryOfOrigin
    }
    fun setColour(): String {
        return this.colour
    }

}

class Phones{
    private var name: String = ""
    private var operatingSystem : String = ""
    private var model : String = ""
    private var yearOfMake : Int = 0
    private var countryOrigin : String = ""

    constructor(name: String,
                operatingSystem :String,
                model : String,
                yearOfMake: Int,
                countryOrigin:String){
        this.name = name
        this.operatingSystem = operatingSystem
        this.model = model
        this.yearOfMake = yearOfMake
        this.countryOrigin= countryOrigin
    }
    fun getName(): String {
        return this.name
    }
    fun getOperatingSystem(): String {
        return this.operatingSystem
    }
    fun getModel(): String{
        return this.model
    }
    fun getYearOfMake(): Int{
        return this.yearOfMake
    }
    fun getCountryOrigin(): String{
        return this.countryOrigin
    }
}
