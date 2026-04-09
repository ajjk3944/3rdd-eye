package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f12689a = new HashMap();

    public static void a(String str, boolean z10) {
        f12689a.put(str, Boolean.valueOf(z10));
    }

    public static void b(String str) {
        f12689a.remove(str);
    }

    public static boolean a(String str) {
        if (f12689a.containsKey(str)) {
            return f12689a.get(str).booleanValue();
        }
        return false;
    }
}
