package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n7 {
    public static HashMap a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("&");
            sb.append(Uri.encode(str));
            sb.append("=");
            sb.append(Uri.encode(str2));
            if (sb.length() > 61440) {
                int i = um1.f34089b;
                um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return map2;
            }
            map2.put(str, str2);
        }
        return map2;
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            int i = um1.f34089b;
            um1.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }
}
