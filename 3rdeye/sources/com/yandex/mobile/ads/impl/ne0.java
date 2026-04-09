package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class ne0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile me0 f30849a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f30850b = new Object();

    public static final me0 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        if (f30849a == null) {
            synchronized (f30850b) {
                try {
                    if (f30849a == null) {
                        f30849a = new me0(es0.a(context, "YadPreferenceFile"));
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        me0 me0Var = f30849a;
        if (me0Var != null) {
            return me0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
