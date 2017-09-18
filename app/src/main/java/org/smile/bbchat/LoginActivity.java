package org.smile.bbchat;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import org.smile.bbchat.bean.UserProfileRsp;
import org.smile.bbchat.view.LineActivity;
import org.smile.bbchat.view.RegisterActivity;

import java.io.IOException;
import java.io.StringReader;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class LoginActivity extends Activity {
    private TextView txt_title;
    private ImageView img_back;
    private Button btn_login, btn_register,btn_twitter;
    private EditText et_usertel, et_password;
    public SharedPreferences sharedPreferences;
    public SharedPreferences.Editor editor; //

    private  String  userEmail="";
    private  String  userPasswd="";
    public static final MediaType JSON2 = MediaType.parse("application/json; charset=utf-8");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sharedPreferences=getSharedPreferences("org.smile.bbchat",MODE_PRIVATE);
        editor=sharedPreferences.edit(); //
        //获取用户输入的邮箱，密码
        txt_title = (TextView) findViewById(R.id.txt_title);
        txt_title.setText("登陆");
        img_back = (ImageView) findViewById(R.id.img_back);
        img_back.setVisibility(View.VISIBLE);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_register = (Button) findViewById(R.id.btn_qtlogin);
        btn_twitter=(Button) findViewById(R.id.btn_zhuye);
        et_usertel = (EditText) findViewById(R.id.et_usertel);
        et_password = (EditText) findViewById(R.id.et_password);

        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent intent=new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_twitter.setOnClickListener(new  View.OnClickListener(){
            @Override
            public  void onClick(View  view){
                Intent intent=new Intent(LoginActivity.this, LineActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //构造json字符串
                Gson gson = new Gson();
                UserLoginVo userLoginVo=new UserLoginVo("alooge@126.com","123456");
                String  json1= gson.toJson(userLoginVo);
                //发送网络请求
                post("http://192.168.1.5:8080/glove/user/login.do", json1);

            }
        });
    }

    public   void post(String url, String json) {
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON2, json);
        final Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        try { //用client执行这个请求

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    Log.v("",e.getMessage());
                    Log.v("","shibai");
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    Log.v("","chenggong");
                    // Log.v("",response.body().string());
                    Gson gson = new Gson();
                    final UserProfileRsp  userProfileRsp=gson.fromJson(response.body().string(),UserProfileRsp.class);
                   // Log.v("",userProfileRsp.getMsg());
                    // 在这里存储需要的数据
                    editor.putString("msg",userProfileRsp.getMsg());
                    editor.commit();
                    String msg=sharedPreferences.getString("msg","默认值为空");

                    Log.v("",msg);

                    LoginActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                        Toast.makeText(LoginActivity.this,String.valueOf(userProfileRsp.getMsg()), Toast.LENGTH_SHORT).show();
                        }

                    });



                }
            });

        }catch (Exception e){
            Log.e("",e.getMessage());
        }

    }
    //startLogin中，校验完毕userEmail和userPasswd后，发起网络请求，注意loading动画

}
