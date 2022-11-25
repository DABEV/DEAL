package mx.edu.utez.deal.model

data class CategoryService(
    override var id: String?,
    override var name: String,
    override var icon: String?,
) : Catalog(id, name, icon)