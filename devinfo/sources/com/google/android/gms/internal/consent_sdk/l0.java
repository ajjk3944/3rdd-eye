package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f19407a;

    public static p a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new p(strConcat, str2);
    }

    public static void b(int i4, int i10) {
        String strC;
        if (i4 < 0 || i4 >= i10) {
            if (i4 < 0) {
                strC = f0.c("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(je.u.r(i10, "negative size: "));
                }
                strC = f0.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void d(int i4, int i10) {
        if (i4 < 0 || i4 > i10) {
            throw new IndexOutOfBoundsException(g(i4, i10, "index"));
        }
    }

    public static void e(Context context, HashSet hashSet) {
        HashMap map;
        g0 g0Var = new g0(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = g0Var.f19361c;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            p pVarA = a(context, str);
            if (pVarA == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                String str2 = (String) pVarA.f19457a;
                if (!map.containsKey(str2)) {
                    map.put(str2, g0Var.f19360b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) map.get(str2)).remove((String) pVarA.f19458b);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }

    public static void f(int i4, int i10, int i11) {
        if (i4 < 0 || i10 < i4 || i10 > i11) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i11) ? g(i4, i11, "start index") : (i10 < 0 || i10 > i11) ? g(i10, i11, "end index") : f0.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i4)));
        }
    }

    public static String g(int i4, int i10, String str) {
        if (i4 < 0) {
            return f0.c("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i10 >= 0) {
            return f0.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(je.u.r(i10, "negative size: "));
    }
}
