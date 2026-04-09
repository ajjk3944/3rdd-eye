package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cd {

    /* renamed from: lh, reason: collision with root package name */
    private static final HashMap<Class<?>, Class<?>> f7631lh;
    public static final Class<?>[] ouw;
    private static Map<String, Method> vt = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        f7631lh = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        ouw = new Class[0];
    }

    public static int ouw(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int ouw(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
