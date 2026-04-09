package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gi extends gx {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11525b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11526c;

    public gi(b5.i0 i0Var) {
        this.f11526c = i0Var;
    }

    @Override // com.google.android.gms.internal.ads.gx, java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        switch (this.f11525b) {
            case 0:
                ((b5.i0) this.f11526c).l();
                return this.f11625a.cancel(z3);
            default:
                return super.cancel(z3);
        }
    }

    public void e() {
        b(this.f11526c);
    }

    public gi(Object obj) {
        this.f11526c = obj;
    }
}
