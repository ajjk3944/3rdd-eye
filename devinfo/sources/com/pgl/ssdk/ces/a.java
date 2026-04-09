package com.pgl.ssdk.ces;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {
    public static native Object meta(int i4, Context context, Object obj);

    public static Object njss(int i4, Object obj) {
        try {
            b bVarE = b.e();
            if (bVarE != null) {
                return bVarE.a(i4, obj);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
