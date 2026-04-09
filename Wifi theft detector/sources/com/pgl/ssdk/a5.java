package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: classes3.dex */
public class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static int f19798a = 504;

    /* renamed from: b, reason: collision with root package name */
    public static String f19799b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f19800c = "";

    /* renamed from: d, reason: collision with root package name */
    static boolean f19801d;

    /* renamed from: e, reason: collision with root package name */
    private static long f19802e;

    /* renamed from: f, reason: collision with root package name */
    private static Context f19803f;

    public static void a(Context context, String str) {
        if (f19803f == null) {
            f19803f = context;
        }
        int i10 = f19798a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f19802e = System.currentTimeMillis();
        f19801d = false;
        f19799b = str;
        f19798a = 102;
        ar.b(new ao(context, Sdk$SDKError.Reason.MRAID_ERROR_VALUE, null));
    }

    public static void b() {
        Context context = f19803f;
        if (context != null) {
            ar.b(new ao(context, Sdk$SDKError.Reason.MRAID_ERROR_VALUE, null));
            f19798a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f19800c)) {
                f19800c = (String) com.pgl.ssdk.ces.a.meta(303, f19803f, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19800c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(Sdk$SDKError.Reason.INVALID_IFA_STATUS_VALUE, f19803f, bArr);
    }
}
