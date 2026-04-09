package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1652ok implements InterfaceC1223gl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16051a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16039b = new C1652ok(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16040c = new C1652ok(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16041d = new C1652ok(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16042e = new C1652ok(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16043f = new C1652ok(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16044g = new C1652ok(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16045h = new C1652ok(6);
    public static final /* synthetic */ C1652ok i = new C1652ok(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16046j = new C1652ok(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16047k = new C1652ok(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16048l = new C1652ok(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16049m = new C1652ok(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16050n = new C1652ok(12);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16024C = new C1652ok(13);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16025D = new C1652ok(14);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16026E = new C1652ok(15);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16027F = new C1652ok(16);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16028G = new C1652ok(17);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16029H = new C1652ok(18);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16030I = new C1652ok(19);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16031J = new C1652ok(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16032K = new C1652ok(21);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16033L = new C1652ok(22);
    public static final /* synthetic */ C1652ok M = new C1652ok(23);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16034N = new C1652ok(24);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16035O = new C1652ok(25);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16036P = new C1652ok(26);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16037Q = new C1652ok(27);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C1652ok f16038R = new C1652ok(28);

    public /* synthetic */ C1652ok(int i3) {
        this.f16051a = i3;
    }

    private final void a(Object obj) {
        BinderC1982ur binderC1982ur = (BinderC1982ur) ((InterfaceC0645Nk) obj);
        synchronized (binderC1982ur) {
            try {
                if (!binderC1982ur.f17177b.d()) {
                    C1715pt c1715pt = binderC1982ur.f17177b;
                    c1715pt.f16243h.H1(c1715pt.f16244j.a());
                    return;
                }
                C0905au c0905au = binderC1982ur.f17181f;
                q2.d1 d1VarF = c0905au.f13242b;
                C0830Yi c0830Yi = binderC1982ur.i;
                if (c0830Yi != null && c0905au.f13256q) {
                    d1VarF = C1476lN.f(binderC1982ur.f17176a, Collections.singletonList(c0830Yi.f12656o));
                }
                binderC1982ur.K3(d1VarF);
                c0905au.f13255p = true;
                try {
                    binderC1982ur.L3(c0905au.f13241a);
                } catch (RemoteException unused) {
                    u2.k.h("Failed to refresh the banner ad.");
                }
                binderC1982ur.f17181f.f13255p = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public final void mo4b(Object obj) {
        switch (this.f16051a) {
            case 0:
                ((InterfaceC1598nk) obj).b();
                return;
            case 1:
                ((InterfaceC1813rk) obj).f(AbstractC1984ut.A(11, null, null));
                return;
            case 2:
                ((InterfaceC1921tk) obj).z();
                return;
            case 3:
                ((InterfaceC1382jk) obj).v();
                return;
            case 4:
                ((InterfaceC1382jk) obj).N();
                return;
            case 5:
                ((InterfaceC1382jk) obj).b();
                return;
            case 6:
                ((InterfaceC1382jk) obj).d();
                return;
            case 7:
                ((InterfaceC1382jk) obj).I();
                return;
            case 8:
                ((InterfaceC0441Bk) obj).e();
                return;
            case 9:
                ((E2.a) obj).c();
                return;
            case 10:
                ((InterfaceC0526Gk) obj).i();
                return;
            case 11:
                ((s2.k) obj).n1();
                return;
            case 12:
                ((s2.k) obj).K1();
                return;
            case 13:
                ((s2.k) obj).h0();
                return;
            case 14:
                ((s2.k) obj).j2();
                return;
            case 15:
                ((s2.k) obj).N2();
                return;
            case 16:
                ((s2.k) obj).x1();
                return;
            case 17:
                ((s2.k) obj).R1();
                return;
            case 18:
                ((s2.k) obj).I0();
                return;
            case 19:
                ((s2.k) obj).d1();
                return;
            case 20:
                ((s2.k) obj).g();
                return;
            case 21:
                ((InterfaceC0628Mk) obj).k();
                return;
            case 22:
                BinderC1982ur binderC1982ur = (BinderC1982ur) ((InterfaceC0645Nk) obj);
                synchronized (binderC1982ur) {
                    C1715pt c1715pt = binderC1982ur.f17177b;
                    if (c1715pt.d()) {
                        c1715pt.c();
                        return;
                    } else {
                        c1715pt.e();
                        return;
                    }
                }
            case 23:
                a(obj);
                return;
            case 24:
                ((InterfaceC0798Wk) obj).a();
                return;
            case 25:
                ((InterfaceC0832Yk) obj).s();
                return;
            case 26:
                ((InterfaceC0832Yk) obj).c();
                return;
            case 27:
                ((InterfaceC1005cl) obj).p();
                return;
            case 28:
                ((InterfaceC1169fl) obj).a();
                return;
            default:
                ((InterfaceC1545ml) obj).F("MalformedJson");
                return;
        }
    }
}
