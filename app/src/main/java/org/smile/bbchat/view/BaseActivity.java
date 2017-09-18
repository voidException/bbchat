package org.smile.bbchat.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;


public abstract class BaseActivity extends Activity {
    protected Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        return super.onKeyDown(keyCode, event);
    }

    /**
     * 绑定控件id
     */
    protected abstract void initControl();

    /**
     * 初始化控件
     */
}
