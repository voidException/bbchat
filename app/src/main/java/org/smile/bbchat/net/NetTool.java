package org.smile.bbchat.net;

/**
 * Created by aihaitao on 12/9/2017.
 */

import android.util.Log;

//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.smile.bbchat.UserLoginVo;
import org.smile.bbchat.bean.UserProfileRsp;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class NetTool {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try { //用client执行这个请求
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch (Exception e){
            Log.e("",e.getMessage());
            return null;
        }

    }

    public  static void post2(String url, String json) {
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json);
        final Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        try { //用client执行这个请求


            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    System.out.print("shibai");
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    //System.out.println("chenggong");
                    ///System.out.print(response.body().string().toString());

                    //Log.v("",response.body().string());
                    //Gson gson = new Gson();
                    Gson gson = new GsonBuilder()
                            .setDateFormat("yyyy-MM-dd HH:mm:ss")
                            .create();
                    UserProfileRsp userProfileRsp=gson.fromJson(response.body().string(),UserProfileRsp.class);
                    System.out.print(userProfileRsp.getData().getUseremail());
                    System.out.print(userProfileRsp.getData().getRegisterdate());

                }
            });

        }catch (Exception e){
            System.out.print(e.getMessage());
        }

    }



    public static void main(String[] args) throws IOException {
        NetTool example = new NetTool();


       // String  json1= com.alibaba.fastjson.JSON.toJSONString(userLoginVo);
       // String response = example.post("http://localhost:8080/glove/user/login.do", json1);
        Gson gson = new Gson();
        UserLoginVo userLoginVo=new UserLoginVo("alooge@126.com","123456");
        String  json1= gson.toJson(userLoginVo);
        post2("http://192.168.1.5:8080/glove/user/login.do", json1);

       // System.out.print(response.toString());

    }
}