package com.vuzixaccessibility;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;

public class CalendarModule extends ReactContextBaseJavaModule{
    CalendarModule(ReactApplicationContext context){
        super(context);
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location){

    }
}