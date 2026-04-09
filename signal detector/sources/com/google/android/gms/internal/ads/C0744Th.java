package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Th, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744Th {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11421a;

    /* renamed from: b, reason: collision with root package name */
    public final C0710Rh f11422b;

    /* renamed from: c, reason: collision with root package name */
    public Ct f11423c;

    /* renamed from: d, reason: collision with root package name */
    public C1822rt f11424d;

    /* renamed from: e, reason: collision with root package name */
    public C1277hl f11425e;

    /* renamed from: f, reason: collision with root package name */
    public C0895ak f11426f;

    public /* synthetic */ C0744Th(C0710Rh c0710Rh, int i) {
        this.f11421a = i;
        this.f11422b = c0710Rh;
    }

    public C0761Uh a() {
        Cr.A(this.f11425e, C1277hl.class);
        Cr.A(this.f11426f, C0895ak.class);
        return new C0761Uh(this.f11422b, new C1437kl(19), this.f11425e, this.f11426f, new Nx(23), this.f11423c, this.f11424d);
    }

    public C1002ci b() {
        Cr.A(this.f11425e, C1277hl.class);
        Cr.A(this.f11426f, C0895ak.class);
        return new C1002ci(this.f11422b, new C1437kl(19), this.f11425e, this.f11426f, new Nx(23), this.f11423c, this.f11424d);
    }

    public final /* bridge */ Object c() {
        switch (this.f11421a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
