fun main() {
    val largeStr = """
    {
        "firstName": "John",
        "lastName": "Smith",
        "age": 35,
        "phoneNumbers": [
            {
                "type": "mobile",
                "number": "123 567-7890"
            }
        ]
    }""".trimIndent()
    print(largeStr)
}