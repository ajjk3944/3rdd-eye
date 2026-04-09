package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g91 extends u81 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11410c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h91 f11411d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11412e;

    public g91(h91 h91Var, d81 d81Var) {
        this.f11411d = h91Var;
        this.f11412e = d81Var;
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final Object a() {
        int i4 = this.f11410c;
        Object obj = this.f11412e;
        switch (i4) {
            case 0:
                d81 d81Var = (d81) obj;
                vd.b bVarMo166b = d81Var.mo166b();
                if (bVarMo166b != null) {
                    return bVarMo166b;
                }
                throw new NullPointerException(al0.H("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", d81Var));
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final String c() {
        switch (this.f11410c) {
            case 0:
                return ((d81) this.f11412e).toString();
            default:
                return ((Callable) this.f11412e).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final boolean d() {
        switch (this.f11410c) {
        }
        return this.f11411d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final void e(Object obj) {
        switch (this.f11410c) {
            case 0:
                this.f11411d.n((vd.b) obj);
                break;
            default:
                this.f11411d.e(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.u81
    public final void f(Throwable th2) {
        switch (this.f11410c) {
            case 0:
                this.f11411d.f(th2);
                break;
            default:
                this.f11411d.f(th2);
                break;
        }
    }

    public g91(h91 h91Var, Callable callable) {
        this.f11411d = h91Var;
        callable.getClass();
        this.f11412e = callable;
    }
}
