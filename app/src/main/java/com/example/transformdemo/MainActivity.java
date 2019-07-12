package com.example.transformdemo;

import com.example.transformdemo.test.ApplicationLifecycleManager;
import com.example.transformdemo.test.Test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * @author: yjx
 * @desc: 1.该demo演示两种自定义gradle插件的方法，一种通过buildSrc的module，不需要上传到maven就可以apply plugin使用，
 *        另外一种方式可以写在单独的工程，上传到maven给别人使用
 *        2.在buildSrc中，演示了如何创建extentions
 *        3.在myplugin中，演示了transform api 和 javassist修改.class文件
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "test>>>>>>>>>>>>>>>>>>>>>>>>>>>>>start");
        new Test();
        Log.d(TAG, "test>>>>>>>>>>>>>>>>>>>>>>>>>>>>>end");

        ApplicationLifecycleManager.init();
    }
}
