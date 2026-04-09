package com.applovin.impl;

import com.applovin.impl.r5;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class w5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f21698g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f21699h;

    public w5(g4 g4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f21698g = new WeakReference(g4Var);
        this.f21699h = obj;
    }

    public static void a(long j4, g4 g4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        if (j4 <= 0) {
            return;
        }
        kVar.q0().a(new w5(g4Var, obj, str, kVar), r5.b.TIMEOUT, j4);
    }

    @Override // java.lang.Runnable
    public void run() {
        g4 g4Var = (g4) this.f21698g.get();
        if (g4Var == null || g4Var.c()) {
            return;
        }
        this.f21692a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21692a.O().d(this.f21693b, "Attempting to timeout pending task " + g4Var.b() + " with " + this.f21699h);
        }
        g4Var.a(this.f21699h);
    }
}
