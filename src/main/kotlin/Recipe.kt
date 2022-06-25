data class Recipe(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
) {

    fun res(a: Any, b: Any) {
        println(a.equals(b))
    }
}

//вторичный конструктор
class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
    }
}

fun findRecipes(
    title: String = "",
    ingredient: String = "",
    isVegetarian: Boolean = false,
    difficulty: String = ""
): Array<Recipe> {
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}

//Перегрузка функций

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun addNumbers(a: Int, b: Int, c: String): String {
    return (a + b).toString() + " $c"
}

fun addNumbers(a: Double, b: Double, c: Double, e: Int): Double {
    return (a + b + c) * e
}

fun main(args: Array<String>) {

    val r1 = Recipe("Thai Curry", "Chicken", false)
    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chicken", false)
    val r3 = r1.copy(title = "Chicken Bhuna")

    //функции hashCode() и toString()
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")

    //сравнение объектов данных
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")

    //TODO дестуктуризация объектов данных - разобраться
    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("title is $title and vegetarian is $vegetarian")
    val (t, m, v, d) = r2
    println("$t $m $v $d")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    //Перегрузка функций
    println(addNumbers(2, 5))
    println(addNumbers(2, 5, "string"))
    println(addNumbers(1.6, 7.3, 5.6, 7))
}


//@JvmOverloads
@JvmOverloads fun myFun(str: String = ""){
}

class Foo @JvmOverloads constructor(i: Int = 0){
}