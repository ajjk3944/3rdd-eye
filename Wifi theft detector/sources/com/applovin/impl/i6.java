package com.applovin.impl;

import com.applovin.impl.d6;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class i6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f6224g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f6225h;

    public i6(s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f6224g = new WeakReference(s4Var);
        this.f6225h = obj;
    }

    public static void a(long j10, s4 s4Var, Object obj, String str, com.applovin.impl.sdk.k kVar) {
        if (j10 <= 0) {
            return;
        }
        kVar.q0().a(new i6(s4Var, obj, str, kVar), d6.b.TIMEOUT, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        s4 s4Var = (s4) this.f6224g.get();
        if (s4Var == null || s4Var.d()) {
            return;
        }
        this.f6218a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6218a.O().d(this.f6219b, "Attempting to timeout pending task " + s4Var.c() + " with " + this.f6225h);
        }
        s4Var.c(this.f6225h);
    }
}
