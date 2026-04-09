package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class ie1 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile he1 f28653a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f28654b = new Object();

    public static final he1 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        if (f28653a == null) {
            synchronized (f28654b) {
                try {
                    if (f28653a == null) {
                        f28653a = new he1(es0.a(context, "YadPreferenceFile"));
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        he1 he1Var = f28653a;
        if (he1Var != null) {
            return he1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
