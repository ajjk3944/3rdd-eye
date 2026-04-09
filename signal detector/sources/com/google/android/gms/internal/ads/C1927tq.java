package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import q2.C2841s;
import t2.C2909E;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927tq implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16982a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f16983b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f16984c;

    /* renamed from: d, reason: collision with root package name */
    public final C1907tN f16985d;

    public /* synthetic */ C1927tq(C1799rN c1799rN, InterfaceC2069wN interfaceC2069wN, C1907tN c1907tN, int i) {
        this.f16982a = i;
        this.f16983b = c1799rN;
        this.f16984c = interfaceC2069wN;
        this.f16985d = c1907tN;
    }

    private final Bt b() {
        C0487Ef c0487EfS;
        Context context = (Context) this.f16985d.f16902a;
        C1554mu c1554mu = (C1554mu) this.f16983b.c();
        C2147xu c2147xu = (C2147xu) this.f16984c.c();
        E9 e9 = H9.b7;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            c0487EfS = p2.j.f22785C.f22795h.i().s();
        } else {
            C2909E c2909eI = p2.j.f22785C.f22795h.i();
            synchronized (c2909eI.f23548a) {
                c0487EfS = c2909eI.f23560n;
            }
        }
        boolean z6 = false;
        if (c0487EfS != null && c0487EfS.f7980j) {
            z6 = true;
        }
        if (((Integer) c2841s.f23270c.a(H9.r7)).intValue() > 0) {
            if (!((Boolean) c2841s.f23270c.a(H9.a7)).booleanValue() || z6) {
                C2093wu c2093wuA = c2147xu.a(EnumC1770qu.f16423c, context, c1554mu, new L6(28, new Rx(28)));
                C0889ae c0889ae = new C0889ae(new C1283hr());
                C1338iu c1338iu = c2093wuA.f17515a;
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                return new C1677p8(c0889ae, new C1338iu(c1338iu, c0623Mf), c2093wuA.f17516b, ((C1823ru) c1338iu.f14823c).f16642g, c0623Mf);
            }
        }
        return new C1283hr();
    }

    public Bt a() {
        C0487Ef c0487EfS;
        switch (this.f16982a) {
            case 6:
                return b();
            default:
                Context context = (Context) this.f16985d.f16902a;
                C1554mu c1554mu = (C1554mu) this.f16983b.c();
                C2147xu c2147xu = (C2147xu) this.f16984c.c();
                E9 e9 = H9.b7;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    c0487EfS = p2.j.f22785C.f22795h.i().s();
                } else {
                    C2909E c2909eI = p2.j.f22785C.f22795h.i();
                    synchronized (c2909eI.f23548a) {
                        c0487EfS = c2909eI.f23560n;
                    }
                }
                boolean z6 = false;
                if (c0487EfS != null && c0487EfS.f7980j) {
                    z6 = true;
                }
                if (((Integer) c2841s.f23270c.a(H9.d7)).intValue() > 0) {
                    if (!((Boolean) c2841s.f23270c.a(H9.a7)).booleanValue() || z6) {
                        C2093wu c2093wuA = c2147xu.a(EnumC1770qu.f16421a, context, c1554mu, new L6(28, new Rx(28)));
                        C0889ae c0889ae = new C0889ae(new C1283hr());
                        C1338iu c1338iu = c2093wuA.f17515a;
                        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                        return new C1677p8(c0889ae, new C1338iu(c1338iu, c0623Mf), c2093wuA.f17516b, ((C1823ru) c1338iu.f14823c).f16642g, c0623Mf);
                    }
                }
                return new C1283hr();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f16982a) {
            case 0:
                return new C1604nq((Context) this.f16983b.c(), (C0795Wh) this.f16985d.f16902a, (Executor) this.f16984c.c(), 1);
            case 1:
                Context context = (Context) this.f16983b.c();
                C2951a c2951aA = ((C0642Nh) this.f16984c).a();
                C0893ai c0893ai = (C0893ai) this.f16985d.f16902a;
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C2035vq(context, c2951aA, c0893ai, c0623Mf);
            case 2:
                return new C1604nq((Context) this.f16983b.c(), (C0693Qh) this.f16985d.f16902a, (Executor) this.f16984c.c(), 2);
            case 3:
                return new C2035vq((Context) this.f16983b.c(), (C0693Qh) this.f16985d.f16902a, ((C0642Nh) this.f16984c).a());
            case 4:
                return new C0770Uq((Context) this.f16983b.c(), (Executor) this.f16984c.c(), (C1002ci) this.f16985d.f16902a, 0);
            case 5:
                return new C0770Uq((Context) this.f16983b.c(), (Executor) this.f16984c.c(), (C1002ci) this.f16985d.f16902a, 1);
            case 6:
                return a();
            case 7:
                return a();
            case 8:
                InterfaceC1666oy interfaceC1666oy = ((Xx) this.f16985d.f16902a).X() ? (InterfaceC1666oy) C1799rN.b(this.f16983b).c() : (InterfaceC1666oy) C1799rN.b(this.f16984c).c();
                Cr.v(interfaceC1666oy);
                return interfaceC1666oy;
            case 9:
                return new C1882sz("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", (S5) this.f16985d.f16902a, (C1291hz) this.f16983b.c(), ((C1948uA) this.f16984c.c()).a(114), 1);
            default:
                return new C1882sz("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", (S5) this.f16985d.f16902a, (C1291hz) this.f16983b.c(), ((C1948uA) this.f16984c.c()).a(117), 0);
        }
    }

    public /* synthetic */ C1927tq(C1907tN c1907tN, C1799rN c1799rN, C1799rN c1799rN2, int i) {
        this.f16982a = i;
        this.f16985d = c1907tN;
        this.f16983b = c1799rN;
        this.f16984c = c1799rN2;
    }

    public /* synthetic */ C1927tq(InterfaceC2069wN interfaceC2069wN, C1907tN c1907tN, InterfaceC2069wN interfaceC2069wN2, int i) {
        this.f16982a = i;
        this.f16983b = interfaceC2069wN;
        this.f16985d = c1907tN;
        this.f16984c = interfaceC2069wN2;
    }
}
