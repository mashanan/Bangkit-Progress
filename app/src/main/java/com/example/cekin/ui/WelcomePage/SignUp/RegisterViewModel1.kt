import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cekin.Logic.Retrofit.ApiConfig
import com.example.cekin.ui.WelcomePage.SignUp.RegisterResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.MediaType
import okhttp3.RequestBody
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RegisterViewModel : ViewModel() {


    fun register(username: String, email: String, password: String, confirmPassword: String) {
        try {
            val client = ApiConfig.getApiService().register(username, email, password, confirmPassword)
            client.enqueue(object : Callback<RegisterResponse> {
                override fun onResponse(call: Call<RegisterResponse>, response: Response<RegisterResponse>) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            Log.d("coba2", "berhasil")
                        }
                    } else {
                        // Handle error response
                    }
                }

                override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {

                    Log.e(TAG, "onFailure: ${t.message}")
                }
            })
        } catch (e: Exception) {

            Log.e(TAG, "Exception: ${e.message}")
        }
    }



}