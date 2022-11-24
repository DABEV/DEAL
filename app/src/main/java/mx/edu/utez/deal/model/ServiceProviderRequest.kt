package mx.edu.utez.deal.model

data class ServiceProviderRequest (
    var shortDescription: String,
    var requestId: String,
    var serviceProviderId: String,
    var serviceStatus: String,
    var stars: Int,
    var serviceProviderComments: String,
    var chat: MutableList<Message>
)