package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class pf0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f31724a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile ae0 f31725b;

    public static final ae0 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        if (f31725b == null) {
            synchronized (f31724a) {
                try {
                    if (f31725b == null) {
                        f31725b = new ae0(context, "com.huawei.hms.location.LocationServices");
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ae0 ae0Var = f31725b;
        if (ae0Var != null) {
            return ae0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
