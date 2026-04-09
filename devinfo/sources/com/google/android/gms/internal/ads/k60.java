package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements c80 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13067a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k60 f13044b = new k60(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k60 f13045c = new k60(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k60 f13046d = new k60(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k60 f13047e = new k60(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k60 f13048f = new k60(4);
    public static final /* synthetic */ k60 g = new k60(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k60 f13049h = new k60(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k60 f13050i = new k60(7);
    public static final /* synthetic */ k60 j = new k60(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k60 f13051k = new k60(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k60 f13052l = new k60(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k60 f13053m = new k60(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k60 f13054n = new k60(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ k60 f13055o = new k60(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ k60 f13056p = new k60(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ k60 f13057q = new k60(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ k60 f13058r = new k60(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ k60 f13059s = new k60(17);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ k60 f13060t = new k60(18);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ k60 f13061u = new k60(19);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k60 f13062v = new k60(20);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ k60 f13063w = new k60(21);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ k60 f13064x = new k60(22);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ k60 f13065y = new k60(23);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ k60 f13066z = new k60(24);
    public static final /* synthetic */ k60 A = new k60(25);
    public static final /* synthetic */ k60 B = new k60(26);
    public static final /* synthetic */ k60 C = new k60(27);
    public static final /* synthetic */ k60 D = new k60(29);

    public /* synthetic */ k60(int i4) {
        this.f13067a = i4;
    }

    private final void a(Object obj) {
        rk0 rk0Var = (rk0) ((i70) obj);
        synchronized (rk0Var) {
            try {
                if (!rk0Var.f15678b.d()) {
                    to0 to0Var = rk0Var.f15678b;
                    to0Var.f16902h.v1(to0Var.j.a());
                    return;
                }
                gq0 gq0Var = rk0Var.f15682f;
                va.c3 c3VarF = gq0Var.f11577b;
                u30 u30Var = rk0Var.f15684i;
                if (u30Var != null && gq0Var.f11590q) {
                    c3VarF = yr1.f(rk0Var.f15677a, Collections.singletonList(u30Var.f17045o));
                }
                rk0Var.h4(c3VarF);
                gq0Var.f11589p = true;
                try {
                    rk0Var.i4(gq0Var.f11576a);
                } catch (RemoteException unused) {
                    za.i.h("Failed to refresh the banner ad.");
                }
                rk0Var.f15682f.f11589p = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public final void mo162c(Object obj) {
        switch (this.f13067a) {
            case 0:
                ((n60) obj).b(yo0.A(11, null, null));
                return;
            case 1:
                ((p60) obj).n();
                return;
            case 2:
                ((g60) obj).j();
                return;
            case 3:
                ((g60) obj).E();
                return;
            case 4:
                ((g60) obj).c();
                return;
            case 5:
                ((g60) obj).d();
                return;
            case 6:
                ((g60) obj).v();
                return;
            case 7:
                ((w60) obj).e();
                return;
            case 8:
                ((jb.a) obj).f();
                return;
            case 9:
                ((b70) obj).B1();
                return;
            case 10:
                ((xa.l) obj).g1();
                return;
            case 11:
                ((xa.l) obj).a2();
                return;
            case 12:
                ((xa.l) obj).T();
                return;
            case 13:
                ((xa.l) obj).D2();
                return;
            case 14:
                ((xa.l) obj).h3();
                return;
            case 15:
                ((xa.l) obj).u1();
                return;
            case 16:
                ((xa.l) obj).k2();
                return;
            case 17:
                ((xa.l) obj).r0();
                return;
            case 18:
                ((xa.l) obj).U0();
                return;
            case 19:
                ((xa.l) obj).z1();
                return;
            case 20:
                ((h70) obj).D1();
                return;
            case 21:
                rk0 rk0Var = (rk0) ((i70) obj);
                synchronized (rk0Var) {
                    to0 to0Var = rk0Var.f15678b;
                    if (to0Var.d()) {
                        to0Var.c();
                        return;
                    } else {
                        to0Var.e();
                        return;
                    }
                }
            case 22:
                a(obj);
                return;
            case 23:
                ((r70) obj).a();
                return;
            case 24:
                ((t70) obj).r();
                return;
            case 25:
                ((t70) obj).f();
                return;
            case 26:
                ((y70) obj).H1();
                return;
            case 27:
                ((b80) obj).a();
                return;
            case 28:
                ((j80) obj).q("MalformedJson");
                return;
            default:
                ((j80) obj).c();
                return;
        }
    }
}
