package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class ce1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25614c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile ce1 f25615d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25616e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final le1 f25617a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25618b;

    public static final class a {
        public static ce1 a() {
            ce1 ce1Var;
            ce1 ce1Var2 = ce1.f25615d;
            if (ce1Var2 != null) {
                return ce1Var2;
            }
            synchronized (ce1.f25614c) {
                ce1Var = ce1.f25615d;
                if (ce1Var == null) {
                    ce1Var = new ce1();
                    ce1.f25615d = ce1Var;
                }
            }
            return ce1Var;
        }
    }

    public /* synthetic */ ce1() {
        this(new le1());
    }

    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        synchronized (f25614c) {
            try {
                if (this.f25617a.a(context) && !this.f25618b) {
                    oe1.a(context);
                    this.f25618b = true;
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ce1(le1 le1Var) {
        this.f25617a = le1Var;
    }
}
