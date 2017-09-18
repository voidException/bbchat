package org.smile.bbchat.view;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.smile.bbchat.R;
import org.smile.bbchat.Test.LinkifySpannableUtils;
import org.smile.bbchat.dialog.DialogThridUtils;
import org.smile.bbchat.dialog.WeiboDialogUtils;

public class RegisterActivity extends AppCompatActivity {

    private  Dialog mWeiboDialog;
    private  Dialog mDialog;
    private TextView  myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        myTextView=(TextView)findViewById(R.id.et_textemail);
        //mWeiboDialog = WeiboDialogUtils.createLoadingDialog(RegisterActivity.this, "加载中...");
        //mDialog = DialogThridUtils.showWaitDialog(RegisterActivity.this, "加载中...", false, true);
        //setEmojiToTextView();
        // LinkifySpannableUtils.getInstance().setSpan(RegisterActivity.this,myTextView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //使用系统的返回<-

        SpannableString spannableString = new SpannableString("设置文字的前景色为淡蓝色");
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.parseColor("#0099EE"));
        spannableString.setSpan(colorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        myTextView.setText(spannableString);

        SpannableString spannableString2 = new SpannableString("设置文字的背景色为淡绿色");
        BackgroundColorSpan colorSpan2 = new BackgroundColorSpan(Color.parseColor("#AC00FF30"));
        spannableString2.setSpan(colorSpan2, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        myTextView.setText(spannableString2);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setEmojiToTextView(){
        int unicodeJoy = 0x1F602;
        String emojiString = getEmojiStringByUnicode(unicodeJoy);
        myTextView.setText(emojiString);
    }

    private String getEmojiStringByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }
}
