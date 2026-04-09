package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952bm implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13459a;

    /* renamed from: b, reason: collision with root package name */
    public final C1811ri f13460b;

    public /* synthetic */ C0952bm(C1811ri c1811ri, int i) {
        this.f13459a = i;
        this.f13460b = c1811ri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13459a) {
            case 0:
                return new BinderC0897am(this.f13460b.a());
            default:
                return new C1763qn(this.f13460b.a());
        }
    }
}
