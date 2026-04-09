package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745Ti implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11427a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f11428b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f11429c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f11430d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f11431e;

    public C0745Ti(C0540Hh c0540Hh, C0642Nh c0642Nh, C1799rN c1799rN, C1799rN c1799rN2) {
        this.f11427a = 12;
        this.f11431e = c0540Hh;
        this.f11430d = c0642Nh;
        this.f11428b = c1799rN;
        this.f11429c = c1799rN2;
    }

    public C1120er a() {
        return new C1120er((Mu) this.f11428b.c(), (ID) this.f11429c.c(), (InterfaceC1064dq) this.f11431e.c(), (InterfaceC1282hq) ((InterfaceC1853sN) this.f11430d).c(), 0);
    }

    public Ps b() {
        Context contextA = ((C0540Hh) this.f11428b).a();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new Ps(contextA, c0623Mf, ((C2123xN) this.f11431e).c(), (Xu) this.f11429c.c(), (C0784Vn) this.f11430d.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f11427a) {
            case 0:
                Mu mu = (Mu) this.f11428b.c();
                ID id = (ID) this.f11429c.c();
                C1377jf c1377jf = (C1377jf) this.f11431e;
                return new C1120er(mu, id, ((C0902ar) this.f11430d).a(), new C1712pq(0, (Context) c1377jf.f14966b.c(), (C0761Uh) c1377jf.f14967c.f16902a), 0);
            case 1:
                Mu mu2 = (Mu) this.f11428b.c();
                ID id2 = (ID) this.f11429c.c();
                C1377jf c1377jf2 = (C1377jf) this.f11431e;
                return new C1120er(mu2, id2, ((C0902ar) this.f11430d).a(), new C2035vq((Context) c1377jf2.f14966b.c(), (C0795Wh) c1377jf2.f14967c.f16902a), 0);
            case 2:
                Mu mu3 = (Mu) this.f11428b.c();
                ID id3 = (ID) this.f11429c.c();
                C1377jf c1377jf3 = (C1377jf) this.f11431e;
                return new C1120er(mu3, id3, ((C0902ar) this.f11430d).a(), new C1712pq(1, (Context) c1377jf3.f14966b.c(), (C0893ai) c1377jf3.f14967c.f16902a), 0);
            case 3:
                C0427An c0427An = (C0427An) this.f11428b.c();
                C1547mn c1547mn = (C1547mn) ((C0850Zl) this.f11431e).f12948b.f15174c;
                Cr.v(c1547mn);
                C0694Qi c0694Qi = (C0694Qi) this.f11429c.c();
                C0816Xl c0816Xl = (C0816Xl) ((C0527Gl) this.f11430d).f8437b.c();
                Cr.v(c0816Xl);
                return new C0443Bm(c0427An, c1547mn, c0694Qi, c0816Xl);
            case 4:
                return new BinderC1171fn(((C0540Hh) this.f11428b).a(), ((C1811ri) this.f11429c).a(), ((C2031vm) this.f11431e).a(), (C1278hm) ((C0922bA) this.f11430d).c());
            case 5:
                return new BinderC1225gn((String) ((C2190yj) this.f11429c).f17749b.f14824d, (C1278hm) ((C0922bA) this.f11431e).c(), ((C1811ri) this.f11430d).a(), (C0784Vn) this.f11428b.c());
            case 6:
                Mu mu4 = (Mu) this.f11428b.c();
                ID id4 = (ID) this.f11429c.c();
                C1377jf c1377jf4 = (C1377jf) this.f11431e;
                return new C1120er(mu4, id4, ((C0902ar) this.f11430d).a(), new C1712pq(2, (Context) c1377jf4.f14966b.c(), (C1002ci) c1377jf4.f14967c.f16902a), 0);
            case 7:
                return new C0802Wo((C0785Vo) this.f11428b.c(), (C0784Vn) this.f11429c.c(), ((C0540Hh) this.f11431e).a(), ((C0489Eh) this.f11430d).c());
            case 8:
                return new BinderC0718Rp(((C0540Hh) this.f11431e).a(), (C0633Mp) this.f11428b.c(), (u2.n) this.f11429c.c(), (C0784Vn) this.f11430d.c());
            case 9:
                return a();
            case 10:
                return new C1120er((Mu) this.f11428b.c(), (ID) this.f11429c.c(), (N9) ((C1336ir) this.f11431e).f14809b.f14592b, new L6(26, (C0893ai) ((C1440ko) this.f11430d).f15278b.f16902a), 1);
            case 11:
                return b();
            case 12:
                return new Yu(((C0540Hh) this.f11431e).a(), ((C0642Nh) this.f11430d).a(), (C0546Hn) this.f11428b.c(), new W9(15), (C0421Ah) this.f11429c.c());
            case 13:
                return new Iv((Nv) this.f11428b.c(), ((C0591Kh) this.f11431e).a(), ((C0540Hh) this.f11430d).a(), (Q2.a) this.f11429c.c());
            default:
                return new C2205yy(C1799rN.b((C2123xN) this.f11429c), C1799rN.b((C2123xN) this.f11431e), (ExecutorService) ((C1907tN) this.f11430d).f16902a, C1799rN.b(this.f11428b));
        }
    }

    public C0745Ti(C0540Hh c0540Hh, C1799rN c1799rN, InterfaceC2069wN interfaceC2069wN, C1799rN c1799rN2) {
        this.f11427a = 8;
        this.f11431e = c0540Hh;
        this.f11428b = c1799rN;
        this.f11429c = interfaceC2069wN;
        this.f11430d = c1799rN2;
    }

    public C0745Ti(C1799rN c1799rN, C0591Kh c0591Kh, C0540Hh c0540Hh, C1799rN c1799rN2) {
        this.f11427a = 13;
        this.f11428b = c1799rN;
        this.f11431e = c0591Kh;
        this.f11430d = c0540Hh;
        this.f11429c = c1799rN2;
    }

    public /* synthetic */ C0745Ti(InterfaceC1853sN interfaceC1853sN, InterfaceC1853sN interfaceC1853sN2, InterfaceC1853sN interfaceC1853sN3, C1799rN c1799rN, int i) {
        this.f11427a = i;
        this.f11429c = interfaceC1853sN;
        this.f11431e = interfaceC1853sN2;
        this.f11430d = interfaceC1853sN3;
        this.f11428b = c1799rN;
    }

    public /* synthetic */ C0745Ti(InterfaceC2069wN interfaceC2069wN, InterfaceC1853sN interfaceC1853sN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, int i) {
        this.f11427a = i;
        this.f11428b = interfaceC2069wN;
        this.f11431e = interfaceC1853sN;
        this.f11429c = interfaceC2069wN2;
        this.f11430d = interfaceC2069wN3;
    }

    public /* synthetic */ C0745Ti(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC1853sN interfaceC1853sN, int i) {
        this.f11427a = i;
        this.f11428b = interfaceC2069wN;
        this.f11429c = interfaceC2069wN2;
        this.f11431e = interfaceC2069wN3;
        this.f11430d = interfaceC1853sN;
    }
}
