package mx.edu.utez.deal.provider

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.CompletableDeferred

class FirebaseLoginProvider {
    companion object {
        private val TAG = FirebaseLoginProvider::class.java.toString()
        private val AUTH = FirebaseAuth.getInstance()

        suspend fun signInWithEmail(email: String, password: String): Boolean? {
            val response = CompletableDeferred<Boolean?>()

            try {
                AUTH.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener {
                        response.complete(it.isSuccessful)
                    }
            } catch (e: Exception) {
                Log.d(TAG, e.message!!)
                response.complete(false)
            }

            return response.await()
        }
    }
}