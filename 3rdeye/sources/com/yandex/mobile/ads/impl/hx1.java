package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public interface hx1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28410a = a.f28411a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static volatile ix1 f28412b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f28411a = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final Object f28413c = new Object();

        private a() {
        }

        public static hx1 a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            if (f28412b == null) {
                synchronized (f28413c) {
                    try {
                        if (f28412b == null) {
                            f28412b = new ix1(es0.a(context, "YadPreferenceFile"));
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ix1 ix1Var = f28412b;
            if (ix1Var != null) {
                return ix1Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    String a();

    void a(String str);
}
