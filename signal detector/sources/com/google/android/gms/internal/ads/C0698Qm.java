package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import p2.C2771a;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0698Qm implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2.d1 f10694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qt f10695c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ St f10696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2771a f10697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054df f10698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f10699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f10700h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C0698Qm(Object obj, q2.d1 d1Var, Qt qt, St st, C2771a c2771a, InterfaceC1054df interfaceC1054df, String str, String str2, int i) {
        this.f10693a = i;
        this.i = obj;
        this.f10694b = d1Var;
        this.f10695c = qt;
        this.f10696d = st;
        this.f10697e = c2771a;
        this.f10698f = interfaceC1054df;
        this.f10699g = str;
        this.f10700h = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        C1280ho c1280ho;
        switch (this.f10693a) {
            case 0:
                C0732Sm c0732Sm = (C0732Sm) this.i;
                q2.d1 d1Var = this.f10694b;
                Qt qt = this.f10695c;
                St st = this.f10696d;
                C2771a c2771a = this.f10697e;
                InterfaceC1054df interfaceC1054df = this.f10698f;
                String str = this.f10699g;
                String str2 = this.f10700h;
                InterfaceC0828Yg interfaceC0828YgA = c0732Sm.f11235j.a(d1Var, qt, st);
                C2000v8 c2000v8 = new C2000v8(interfaceC0828YgA);
                C1601nn c1601nn = c0732Sm.f11237l.f16223a;
                C1649oh c1649ohL0 = interfaceC0828YgA.l0();
                E9 e9 = H9.Te;
                C2841s c2841s = C2841s.f23267e;
                c1649ohL0.u(c1601nn, c1601nn, c1601nn, c1601nn, c1601nn, false, null, !((Boolean) c2841s.f23270c.a(e9)).booleanValue() ? new C2771a(c0732Sm.f11227a, null) : c2771a, null, true != ((Boolean) c2841s.f23270c.a(e9)).booleanValue() ? null : interfaceC1054df, c0732Sm.f11240o, c0732Sm.f11239n, c0732Sm.f11238m, null, c1601nn, null, null, null, null, null, null, null);
                interfaceC0828YgA.g0("/getNativeAdViewSignals", AbstractC0449Cb.f7611n);
                interfaceC0828YgA.g0("/getNativeClickMeta", AbstractC0449Cb.f7612o);
                if (((Boolean) c2841s.f23270c.a(H9.G8)).booleanValue()) {
                    if (((Boolean) c2841s.f23270c.a(H9.I8)).booleanValue() && (c1280ho = c0732Sm.f11244s) != null) {
                        interfaceC0828YgA.g0("/onDeviceStorageEvent", new C1858sb(3, c1280ho));
                    }
                }
                C1649oh c1649ohL02 = interfaceC0828YgA.l0();
                synchronized (c1649ohL02.f16011d) {
                    c1649ohL02.f15993G = true;
                }
                interfaceC0828YgA.l0().f16014g = new C1056dh(c2000v8, 1);
                interfaceC0828YgA.B0(str, str2);
                return c2000v8;
            default:
                C0851Zm c0851Zm = (C0851Zm) this.i;
                q2.d1 d1Var2 = this.f10694b;
                Qt qt2 = this.f10695c;
                St st2 = this.f10696d;
                C2771a c2771a2 = this.f10697e;
                InterfaceC1054df interfaceC1054df2 = this.f10698f;
                String str3 = this.f10699g;
                String str4 = this.f10700h;
                InterfaceC0828Yg interfaceC0828YgA2 = c0851Zm.f12951c.a(d1Var2, qt2, st2);
                C2000v8 c2000v82 = new C2000v8(interfaceC0828YgA2);
                if (c0851Zm.f12949a.f13480b != null) {
                    c0851Zm.a(interfaceC0828YgA2, c2771a2, interfaceC1054df2);
                    interfaceC0828YgA2.f1(new T2.d(5, 0, 0));
                } else {
                    C1601nn c1601nn2 = c0851Zm.f12952d.f16223a;
                    C1649oh c1649ohL03 = interfaceC0828YgA2.l0();
                    E9 e92 = H9.Te;
                    C2841s c2841s2 = C2841s.f23267e;
                    c1649ohL03.u(c1601nn2, c1601nn2, c1601nn2, c1601nn2, c1601nn2, false, null, !((Boolean) c2841s2.f23270c.a(e92)).booleanValue() ? new C2771a(c0851Zm.f12953e, null) : c2771a2, null, true != ((Boolean) c2841s2.f23270c.a(e92)).booleanValue() ? null : interfaceC1054df2, c0851Zm.f12956h, c0851Zm.f12955g, c0851Zm.f12954f, null, c1601nn2, null, null, null, null, c0851Zm.f12957j, null, null);
                    C0851Zm.b(interfaceC0828YgA2);
                }
                interfaceC0828YgA2.l0().f16014g = new C0834Ym(c0851Zm, interfaceC0828YgA2, c2000v82, 0);
                interfaceC0828YgA2.B0(str3, str4);
                return c2000v82;
        }
    }
}
