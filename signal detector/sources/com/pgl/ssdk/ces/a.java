package com.pgl.ssdk.ces;

import android.content.Context;

/* loaded from: classes.dex */
public final class a {
    public static native Object meta(int i, Context context, Object obj);

    public static Object njss(int i, Object obj) {
        try {
            b bVarE = b.e();
            if (bVarE != null) {
                return bVarE.a(i, obj);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
