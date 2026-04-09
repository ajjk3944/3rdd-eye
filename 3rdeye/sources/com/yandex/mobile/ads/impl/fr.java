package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public interface fr {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27430a = a.f27431a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27431a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Object f27432b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private static volatile fr f27433c;

        private a() {
        }

        public static fr a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            if (f27433c == null) {
                synchronized (f27432b) {
                    try {
                        if (f27433c == null) {
                            f27433c = new gr(es0.a(context, "YadPreferenceFile"), new b60(), new pa(), new g6());
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            fr frVar = f27433c;
            if (frVar != null) {
                return frVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    du1 a();

    void a(du1 du1Var);
}
