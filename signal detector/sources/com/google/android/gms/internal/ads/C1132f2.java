package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132f2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14010a;

    /* renamed from: b, reason: collision with root package name */
    public int f14011b;

    /* renamed from: c, reason: collision with root package name */
    public int f14012c;

    /* renamed from: d, reason: collision with root package name */
    public long f14013d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14014e;

    /* renamed from: f, reason: collision with root package name */
    public final C2036vr f14015f;

    /* renamed from: g, reason: collision with root package name */
    public final C2036vr f14016g;

    /* renamed from: h, reason: collision with root package name */
    public int f14017h;
    public int i;

    public C1132f2(C2036vr c2036vr, C2036vr c2036vr2, boolean z6) throws P4 {
        this.f14016g = c2036vr;
        this.f14015f = c2036vr2;
        this.f14014e = z6;
        c2036vr2.E(12);
        this.f14010a = c2036vr2.h();
        c2036vr.E(12);
        this.i = c2036vr.h();
        AbstractC2022vd.i("first_chunk must be 1", c2036vr.b() == 1);
        this.f14011b = -1;
    }

    public final boolean a() {
        int i = this.f14011b + 1;
        this.f14011b = i;
        if (i == this.f14010a) {
            return false;
        }
        boolean z6 = this.f14014e;
        C2036vr c2036vr = this.f14015f;
        this.f14013d = z6 ? c2036vr.j() : c2036vr.P();
        if (this.f14011b == this.f14017h) {
            C2036vr c2036vr2 = this.f14016g;
            this.f14012c = c2036vr2.h();
            c2036vr2.G(4);
            int i3 = this.i - 1;
            this.i = i3;
            this.f14017h = i3 > 0 ? (-1) + c2036vr2.h() : -1;
        }
        return true;
    }
}
