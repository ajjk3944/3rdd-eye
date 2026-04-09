package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private static final long f24577a = (long) (Math.floor(Math.random() * 4294967295L) + 1);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24578b = 0;

    private static String a(String str, Map map) {
        if (map == null) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            Uri uri = Uri.parse("?" + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            for (String str2 : uri.getQueryParameterNames()) {
                builderBuildUpon.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        String string = builderBuildUpon.build().toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    public static final ArrayList a(a8 adResponse, Map map) {
        ux1 ux1Var;
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        List<String> listL = adResponse.l();
        List<Long> listF = adResponse.f();
        List<Integer> listQ = adResponse.q();
        ArrayList arrayList = new ArrayList();
        if (listL != null && listF != null && listQ != null) {
            int size = listL.size();
            int i = 0;
            while (i < size) {
                String url = a(listL.get(i), map);
                long jLongValue = listF.size() > i ? listF.get(i).longValue() : 0L;
                int iIntValue = listQ.size() > i ? listQ.get(i).intValue() : 0;
                kotlin.jvm.internal.l.f(url, "url");
                if (y9.q.b0(url, "/rtbcount/", false)) {
                    ux1Var = ux1.f34242c;
                } else if (y9.q.b0(url, "/count/", false)) {
                    ux1Var = ux1.f34241b;
                } else {
                    ux1Var = ux1.f34243d;
                }
                arrayList.add(new tx1(iIntValue, jLongValue, ux1Var, url));
                i++;
            }
        }
        return arrayList;
    }

    public static Bitmap a(String data) {
        kotlin.jvm.internal.l.f(data, "data");
        try {
            String strSubstring = data.substring(y9.q.g0(data, StringUtils.COMMA, 0, false, 6) + 1);
            kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
            if (strSubstring.length() <= 0) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final <T> String a(T t10) {
        String string = t10 != null ? t10.toString() : null;
        return string == null ? "" : string;
    }

    public static boolean a(lo loVar) {
        return loVar == null || loVar.a();
    }

    public static final boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            return fj2.a(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long a() {
        return f24577a;
    }
}
