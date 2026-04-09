package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class xmt {
    public static final Class<?>[] emc;
    private static final HashMap<Class<?>, Class<?>> xq;
    private static Map<String, Method> ypw = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        xq = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        emc = new Class[0];
    }

    public static int emc(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int emc(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
