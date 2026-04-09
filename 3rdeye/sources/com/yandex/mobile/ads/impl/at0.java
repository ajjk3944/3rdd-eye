package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class at0 {
    public static String a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return (String) a(context, bt0.f25388f.a());
    }

    public static ArrayList b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        String str = (String) a(context, bt0.f25389g.a());
        if (str == null) {
            return null;
        }
        List listR0 = y9.q.r0(str, new String[]{StringUtils.COMMA});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR0) {
            if (!y9.q.i0((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static Boolean c(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return (Boolean) a(context, bt0.f25386d.a());
    }

    public static boolean d(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Boolean bool = (Boolean) a(context, bt0.f25390h.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static boolean e(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Boolean bool = (Boolean) a(context, bt0.f25385c.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static Boolean f(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return (Boolean) a(context, bt0.f25387e.a());
    }

    public static boolean g(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Boolean bool = (Boolean) a(context, bt0.i.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                fp0.c(new Object[0]);
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        } catch (Throwable unused2) {
            fp0.c(new Object[0]);
        }
        return null;
    }
}
