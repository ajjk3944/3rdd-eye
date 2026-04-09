package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058dj implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13795a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C2190yj f13796b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f13797c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f13798d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f13799e;

    public C1058dj(C1431kf c1431kf, C1799rN c1799rN, C0642Nh c0642Nh, C2190yj c2190yj, C1113ek c1113ek) {
        this.f13797c = c1799rN;
        this.f13798d = c0642Nh;
        this.f13796b = c2190yj;
        this.f13799e = c1113ek;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13795a) {
            case 0:
                return new C1922tl(new C0949bj((Context) this.f13797c.c(), ((C0642Nh) this.f13798d).a(), this.f13796b.a(), ((C1113ek) this.f13799e).a(), 0), AbstractC0640Nf.f10011g);
            case 1:
                return new C1435kj(this.f13796b.a(), (C1867sk) this.f13797c.c(), (C0509Fk) this.f13798d.c(), (C0594Kk) this.f13799e.c());
            default:
                return new C1922tl(new C0949bj((Context) this.f13797c.c(), ((C0642Nh) this.f13798d).a(), this.f13796b.a(), ((C1113ek) this.f13799e).a(), 1), AbstractC0640Nf.f10011g);
        }
    }

    public C1058dj(C2190yj c2190yj, C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3) {
        this.f13796b = c2190yj;
        this.f13797c = c1799rN;
        this.f13798d = c1799rN2;
        this.f13799e = c1799rN3;
    }

    public C1058dj(C1799rN c1799rN, C0642Nh c0642Nh, C2190yj c2190yj, C1113ek c1113ek) {
        this.f13797c = c1799rN;
        this.f13798d = c0642Nh;
        this.f13796b = c2190yj;
        this.f13799e = c1113ek;
    }
}
