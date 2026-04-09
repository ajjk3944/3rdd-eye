package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class y01 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f35576e = new a(0);

    /* renamed from: f, reason: collision with root package name */
    private static volatile y01 f35577f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f35578a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f35579b = true;

    /* renamed from: c, reason: collision with root package name */
    private final C4098e1 f35580c = new C4098e1();

    /* renamed from: d, reason: collision with root package name */
    private final og1 f35581d = new og1();

    public static final class a {
        private a() {
        }

        public final y01 a() {
            y01 y01Var;
            y01 y01Var2 = y01.f35577f;
            if (y01Var2 != null) {
                return y01Var2;
            }
            synchronized (this) {
                y01Var = y01.f35577f;
                if (y01Var == null) {
                    y01Var = new y01();
                    y01.f35577f = y01Var;
                }
            }
            return y01Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public final void a(Context context) throws oo0 {
        kotlin.jvm.internal.l.f(context, "context");
        if (this.f35579b) {
            synchronized (this.f35578a) {
                try {
                    if (this.f35579b) {
                        if (ba.a(context)) {
                            this.f35580c.a(context);
                            this.f35581d.getClass();
                            og1.a(context);
                        }
                        this.f35579b = false;
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
