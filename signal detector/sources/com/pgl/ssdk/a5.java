package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static int f19542a = 504;

    /* renamed from: b, reason: collision with root package name */
    public static String f19543b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f19544c = "";

    /* renamed from: d, reason: collision with root package name */
    static boolean f19545d;

    /* renamed from: e, reason: collision with root package name */
    private static long f19546e;

    /* renamed from: f, reason: collision with root package name */
    private static Context f19547f;

    public static void a(Context context, String str) {
        if (f19547f == null) {
            f19547f = context;
        }
        int i = f19542a;
        if (i == 102 || i == 202 || i == 200) {
            return;
        }
        f19546e = System.currentTimeMillis();
        f19545d = false;
        f19543b = str;
        f19542a = 102;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f19547f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f19542a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f19544c)) {
                f19544c = (String) com.pgl.ssdk.ces.a.meta(303, f19547f, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19544c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f19547f, bArr);
    }
}
