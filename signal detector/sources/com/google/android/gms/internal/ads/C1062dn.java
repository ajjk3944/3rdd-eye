package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062dn implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13803a;

    /* renamed from: b, reason: collision with root package name */
    public final C2190yj f13804b;

    /* renamed from: c, reason: collision with root package name */
    public final C0922bA f13805c;

    /* renamed from: d, reason: collision with root package name */
    public final C1811ri f13806d;

    public /* synthetic */ C1062dn(C2190yj c2190yj, C0922bA c0922bA, C1811ri c1811ri, int i) {
        this.f13803a = i;
        this.f13804b = c2190yj;
        this.f13805c = c0922bA;
        this.f13806d = c1811ri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13803a) {
            case 0:
                return new BinderC1007cn((String) this.f13804b.f17749b.f14824d, (C1278hm) this.f13805c.c(), this.f13806d.a());
            default:
                return new BinderC1116en((String) this.f13804b.f17749b.f14824d, (C1278hm) this.f13805c.c(), this.f13806d.a());
        }
    }
}
