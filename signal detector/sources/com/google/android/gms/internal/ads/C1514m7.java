package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514m7 extends AbstractCallableC1676p7 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15589h;

    public C1514m7(X6 x6, S5 s5, int i) {
        super(x6, "bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", s5, i, 61);
        this.f15589h = x6.f12388o.f11129a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        long jLongValue = ((Long) this.f16134e.invoke(null, this.f16130a.f12375a, Boolean.valueOf(this.f15589h))).longValue();
        S5 s5 = this.f16133d;
        synchronized (s5) {
            s5.b();
            ((C1136f6) s5.f13551b).b0(jLongValue);
        }
    }
}
