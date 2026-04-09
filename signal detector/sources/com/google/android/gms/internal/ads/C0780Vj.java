package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780Vj implements s2.k {

    /* renamed from: b, reason: collision with root package name */
    public final Xt f12072b;

    /* renamed from: c, reason: collision with root package name */
    public final Qt f12073c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.a f12074d;

    /* renamed from: e, reason: collision with root package name */
    public final C0784Vn f12075e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f12076f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12071a = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final C1555mv f12077g = C1609nv.A();

    /* renamed from: h, reason: collision with root package name */
    public boolean f12078h = false;
    public boolean i = false;

    public C0780Vj(Xt xt, Qt qt, Q2.a aVar, C0784Vn c0784Vn, ScheduledExecutorService scheduledExecutorService) {
        this.f12072b = xt;
        this.f12073c = qt;
        this.f12074d = aVar;
        this.f12075e = c0784Vn;
        this.f12076f = scheduledExecutorService;
    }

    @Override // s2.k
    public final void I0() {
        b(9);
    }

    @Override // s2.k
    public final void K1() {
        b(5);
    }

    @Override // s2.k
    public final void N2() {
        b(7);
    }

    @Override // s2.k
    public final void R1() {
        b(6);
    }

    public final void a() {
        synchronized (this.f12071a) {
            try {
                C0784Vn c0784Vn = this.f12075e;
                String str = ((St) this.f12072b.f12510b.f15174c).f11269b;
                String strEncodeToString = Base64.encodeToString(((C1609nv) this.f12077g.d()).b(), 1);
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.de)).booleanValue()) {
                    C0697Ql c0697QlA = c0784Vn.a();
                    c0697QlA.r("action", "pclma");
                    c0697QlA.r("pclmd", strEncodeToString);
                    c0697QlA.r("gqi", str);
                    c0697QlA.x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.f12071a) {
            try {
                if (!this.i && this.f12078h) {
                    C1555mv c1555mv = this.f12077g;
                    Qu quA = Ru.A();
                    quA.b();
                    ((Ru) quA.f13551b).C(i);
                    this.f12074d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    quA.b();
                    ((Ru) quA.f13551b).B(jCurrentTimeMillis);
                    Ru ru = (Ru) quA.d();
                    c1555mv.b();
                    ((C1609nv) c1555mv.f13551b).B(ru);
                    if (i == 10) {
                        a();
                        this.i = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // s2.k
    public final void d1() {
        b(10);
    }

    @Override // s2.k
    public final void g() {
    }

    @Override // s2.k
    public final void h0() {
        b(4);
    }

    @Override // s2.k
    public final void j2() {
    }

    @Override // s2.k
    public final void k0(int i) {
    }

    @Override // s2.k
    public final void n1() {
        b(3);
    }

    @Override // s2.k
    public final void x1() {
        b(8);
    }
}
