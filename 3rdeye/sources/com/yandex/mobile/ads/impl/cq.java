package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public interface cq {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25747a = a.f25748a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static volatile eq f25749b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f25748a = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final Object f25750c = new Object();

        private a() {
        }

        public static cq a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            if (f25749b == null) {
                synchronized (f25750c) {
                    try {
                        if (f25749b == null) {
                            f25749b = dq.a(context);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            eq eqVar = f25749b;
            if (eqVar != null) {
                return eqVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    String a();

    String b();

    String c();
}
