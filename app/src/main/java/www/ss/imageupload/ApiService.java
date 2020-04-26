package www.ss.imageupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    String URL = "http://192.168.1.107:8000/image/";

    @Multipart
    @POST("upload/")
    Call<RequestBody> uploadFile(@Part MultipartBody.Part file);
}
