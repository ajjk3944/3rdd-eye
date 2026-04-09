package com.applovin.impl;

import com.applovin.impl.d6;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class i6 extends i5 {
    private final WeakReference g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f4293h;

    public i6(s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.g = new WeakReference(s4Var);
        this.f4293h = obj;
    }

    public static void a(long j, s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        if (j <= 0) {
            return;
        }
        kVar.q0().a(new i6(s4Var, obj, str, kVar), d6.b.TIMEOUT, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        s4 s4Var = (s4) this.g.get();
        if (s4Var == null || s4Var.d()) {
            return;
        }
        this.f4287a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4287a.O().d(this.f4288b, "Attempting to timeout pending task " + s4Var.c() + " with " + this.f4293h);
        }
        s4Var.c(this.f4293h);
    }
}
