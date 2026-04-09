package com.yandex.mobile.ads.impl;

import android.os.Build;

/* loaded from: classes3.dex */
public final class r32 implements o82 {
    @Override // com.yandex.mobile.ads.impl.o82
    public final String a() {
        String property;
        String property2 = null;
        try {
            property = System.getProperty("http.agent");
        } catch (Exception unused) {
            fp0.b(new Object[0]);
            property = null;
        }
        if (property != null && property.length() != 0) {
            return property;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dalvik/");
        try {
            property2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
            fp0.b(new Object[0]);
        }
        if (property2 == null || property2.length() == 0) {
            property2 = "1.0.0";
        }
        sb.append(property2);
        sb.append(" (Linux; U; Android ");
        String str = Build.VERSION.RELEASE;
        if (str.length() == 0) {
            str = "1.0";
        }
        sb.append(str);
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            kotlin.jvm.internal.l.c(str2);
            if (str2.length() > 0) {
                sb.append("; ");
                sb.append(str2);
            }
        }
        String str3 = Build.ID;
        kotlin.jvm.internal.l.c(str3);
        if (str3.length() > 0) {
            sb.append(" Build/");
            sb.append(str3);
        }
        sb.append(")");
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }
}
