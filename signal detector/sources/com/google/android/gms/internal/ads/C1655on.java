package com.google.android.gms.internal.ads;

import j$.util.Objects;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1655on {

    /* renamed from: a, reason: collision with root package name */
    public final C1276hk f16052a;

    /* renamed from: b, reason: collision with root package name */
    public final C2191yk f16053b;

    /* renamed from: c, reason: collision with root package name */
    public final C0492Ek f16054c;

    /* renamed from: d, reason: collision with root package name */
    public final C0543Hk f16055d;

    /* renamed from: e, reason: collision with root package name */
    public final C0849Zk f16056e;

    /* renamed from: f, reason: collision with root package name */
    public final C2030vl f16057f;

    /* renamed from: g, reason: collision with root package name */
    public final C0784Vn f16058g;

    /* renamed from: h, reason: collision with root package name */
    public final C2202yv f16059h;
    public final C0633Mp i;

    /* renamed from: j, reason: collision with root package name */
    public final C2189yi f16060j;

    public C1655on(C1276hk c1276hk, C2191yk c2191yk, C0492Ek c0492Ek, C0543Hk c0543Hk, C0849Zk c0849Zk, C2030vl c2030vl, C0784Vn c0784Vn, C2202yv c2202yv, C0633Mp c0633Mp, C2189yi c2189yi) {
        this.f16052a = c1276hk;
        this.f16053b = c2191yk;
        this.f16054c = c0492Ek;
        this.f16055d = c0543Hk;
        this.f16056e = c0849Zk;
        this.f16057f = c2030vl;
        this.f16058g = c0784Vn;
        this.f16059h = c2202yv;
        this.i = c0633Mp;
        this.f16060j = c2189yi;
    }

    public final void a(C1709pn c1709pn, InterfaceC0828Yg interfaceC0828Yg) {
        C1601nn c1601nn = c1709pn.f16223a;
        C2191yk c2191yk = this.f16053b;
        Objects.requireNonNull(c2191yk);
        C1385jn c1385jn = new C1385jn(1, c2191yk);
        C1276hk c1276hk = this.f16052a;
        C0492Ek c0492Ek = this.f16054c;
        C0543Hk c0543Hk = this.f16055d;
        C0849Zk c0849Zk = this.f16056e;
        C2030vl c2030vl = this.f16057f;
        synchronized (c1601nn) {
            c1601nn.a(c1276hk, c0492Ek, c0543Hk, c0849Zk, c1385jn);
            c1601nn.f15814f = c2030vl;
        }
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.sb)).booleanValue() || interfaceC0828Yg == null || interfaceC0828Yg.l0() == null) {
            return;
        }
        C1649oh c1649ohL0 = interfaceC0828Yg.l0();
        C2189yi c2189yi = this.f16060j;
        C0633Mp c0633Mp = this.i;
        c1649ohL0.B(c2189yi, c0633Mp, this.f16059h);
        c1649ohL0.D(c2189yi, c0633Mp, this.f16058g);
    }
}
