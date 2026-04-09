package com.google.android.gms.internal.ads;

import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765Ul implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11775a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f11776b;

    /* renamed from: c, reason: collision with root package name */
    public final C1811ri f11777c;

    /* renamed from: d, reason: collision with root package name */
    public final C1004ck f11778d;

    /* renamed from: e, reason: collision with root package name */
    public final C1330il f11779e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f11780f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f11781g;

    public C0765Ul(InterfaceC2069wN interfaceC2069wN, C1811ri c1811ri, C1004ck c1004ck, C1330il c1330il, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3) {
        this.f11776b = interfaceC2069wN;
        this.f11777c = c1811ri;
        this.f11778d = c1004ck;
        this.f11779e = c1330il;
        this.f11780f = interfaceC2069wN2;
        this.f11781g = interfaceC2069wN3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f11775a) {
            case 0:
                C0710Rh c0710Rh = (C0710Rh) this.f11776b.c();
                C0895ak c0895akB = this.f11778d.f13665b.b();
                C1277hl c1277hl = this.f11779e.f14777b;
                C0697Ql c0697Ql = (C0697Ql) this.f11777c.f16599b;
                C0679Pk c0679PkC = ((C0796Wi) this.f11780f).c();
                C0702Qq c0702Qq = (C0702Qq) this.f11781g.c();
                C0710Rh c0710Rh2 = c0710Rh.f10986b;
                C0895ak c0895ak = new C0895ak(c0895akB);
                Nx nx = null;
                C1283hr c1283hr = new C1283hr(0, (Object) null);
                C0889ae c0889ae = new C0889ae(c0679PkC, 16, (Object) null);
                L6 l6 = new L6(13, (Object) null);
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8807p4)).booleanValue()) {
                    nx = new Nx(23);
                    nx.f10110b = c0702Qq;
                }
                Cr.A(c1277hl, C1277hl.class);
                if (nx == null) {
                    nx = new Nx(23);
                }
                Cr.A(c0697Ql, C0697Ql.class);
                InterfaceC1920tj interfaceC1920tj = (InterfaceC1920tj) new C0795Wh(c0710Rh2, l6, c0697Ql, new C1437kl(19), c1277hl, c0895ak, nx, c1283hr, c0889ae, null, null).f12296r.c();
                Cr.v(interfaceC1920tj);
                return interfaceC1920tj;
            default:
                return new C0600Kq((C0710Rh) this.f11776b.c(), (C0697Ql) this.f11777c.f16599b, this.f11778d.f13665b.b(), this.f11779e.f14777b, (C0702Qq) this.f11780f.c(), (C1228gq) this.f11781g.c());
        }
    }

    public C0765Ul(InterfaceC2069wN interfaceC2069wN, C1004ck c1004ck, C1330il c1330il, C1811ri c1811ri, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3) {
        this.f11776b = interfaceC2069wN;
        this.f11778d = c1004ck;
        this.f11779e = c1330il;
        this.f11777c = c1811ri;
        this.f11780f = interfaceC2069wN2;
        this.f11781g = interfaceC2069wN3;
    }
}
