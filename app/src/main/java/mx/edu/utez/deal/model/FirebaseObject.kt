package mx.edu.utez.deal.model

open class FirebaseObject(open var id : String?) {
    open fun toMap() : MutableMap<String, Any?> {
        return mutableMapOf()
    }
}