package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wf extends zf {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18006h;

    public wf(ff ffVar, zc zcVar, int i4) {
        super(ffVar, "bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", zcVar, i4, 61);
        this.f18006h = ffVar.f11128o.f9314a;
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        long jLongValue = ((Long) this.f19076e.invoke(null, this.f19072a.f11116a, Boolean.valueOf(this.f18006h))).longValue();
        zc zcVar = this.f19075d;
        synchronized (zcVar) {
            zcVar.b();
            ((md) zcVar.f14755b).b0(jLongValue);
        }
    }
}
