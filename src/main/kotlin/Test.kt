fun main() {
    val first: Test.First = Test.First()
//    val SuperTest.Third = SuperTest.Third()
}

abstract class SuperTest(val superTest: Int) {
    class Third
}

//содержание функций data класса

data class Test(val test: Int) : SuperTest(10) {
    class First
    class Second

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun toString(): String {
        return "Test()"
    }

    fun equalsData(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Test

        if (test != other.test) return false

        return true
    }

    fun hashCodeData(): Int {
        return test
    }

    fun toStringData(): String {
        return "Test(test=$test)"
    }
}