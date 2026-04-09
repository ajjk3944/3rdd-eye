package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static int f21418a = 504;

    /* renamed from: b, reason: collision with root package name */
    public static String f21419b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f21420c = "";

    /* renamed from: d, reason: collision with root package name */
    static boolean f21421d;

    /* renamed from: e, reason: collision with root package name */
    private static long f21422e;

    /* renamed from: f, reason: collision with root package name */
    private static Context f21423f;

    public static void a(Context context, String str) {
        if (f21423f == null) {
            f21423f = context;
        }
        int i4 = f21418a;
        if (i4 == 102 || i4 == 202 || i4 == 200) {
            return;
        }
        f21422e = System.currentTimeMillis();
        f21421d = false;
        f21419b = str;
        f21418a = FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f21423f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f21418a = FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f21420c)) {
                f21420c = (String) com.pgl.ssdk.ces.a.meta(303, f21423f, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f21420c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f21423f, bArr);
    }
}
