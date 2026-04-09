package com.mbridge.msdk.preload;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {
    public void a(Map<String, Object> map) {
    }

    public void b(Map<String, Object> map) {
    }

    public void a(Map<String, Object> map, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            com.mbridge.msdk.mbnative.service.a.class.getMethod("preload", Map.class, Integer.TYPE).invoke(com.mbridge.msdk.mbnative.service.a.class.newInstance(), map, Integer.valueOf(i10));
        } catch (Exception unused) {
        }
    }
}
