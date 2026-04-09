package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4940s5 implements InterfaceC4688ib, Xa, InterfaceC5003uh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41599a;

    /* renamed from: b, reason: collision with root package name */
    public final C4759l5 f41600b;

    /* renamed from: c, reason: collision with root package name */
    public final Cif f41601c;

    /* renamed from: d, reason: collision with root package name */
    public final C4769lf f41602d;

    /* renamed from: e, reason: collision with root package name */
    public final C4555d7 f41603e;

    /* renamed from: f, reason: collision with root package name */
    public final Di f41604f;

    /* renamed from: g, reason: collision with root package name */
    public final C4867p9 f41605g;

    /* renamed from: h, reason: collision with root package name */
    public final C4651h0 f41606h;
    public final C4677i0 i;

    /* renamed from: j, reason: collision with root package name */
    public final Pk f41607j;

    /* renamed from: k, reason: collision with root package name */
    public final C4513bh f41608k;

    /* renamed from: l, reason: collision with root package name */
    public final C4531c9 f41609l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f41610m;

    /* renamed from: n, reason: collision with root package name */
    public final C9 f41611n;

    /* renamed from: o, reason: collision with root package name */
    public final C4811n5 f41612o;

    /* renamed from: p, reason: collision with root package name */
    public final I9 f41613p;

    /* renamed from: q, reason: collision with root package name */
    public final I3 f41614q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f41615r;

    /* renamed from: s, reason: collision with root package name */
    public final Ff f41616s;

    /* renamed from: t, reason: collision with root package name */
    public final C4933ro f41617t;

    /* renamed from: u, reason: collision with root package name */
    public final Hk f41618u;

    public C4940s5(Context context, C4544cm c4544cm, C4759l5 c4759l5, J4 j4, InterfaceC4952sh interfaceC4952sh, AbstractC4889q5 abstractC4889q5) {
        this(context, c4759l5, new C4677i0(), new TimePassedChecker(), new C5066x5(context, c4759l5, j4, abstractC4889q5, c4544cm, interfaceC4952sh, Ga.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ga.j().k(), new C4733k5()), j4);
    }

    public final boolean A() {
        C4544cm c4544cm;
        Ff ff = this.f41616s;
        ff.f40846h.a(ff.f40839a);
        boolean z10 = ((Cf) ff.c()).f39263d;
        C4513bh c4513bh = this.f41608k;
        synchronized (c4513bh) {
            c4544cm = c4513bh.f39562c.f40791a;
        }
        return !(z10 && c4544cm.f40655q);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4688ib, io.appmetrica.analytics.impl.Nl
    public final void a(Gl gl, C4544cm c4544cm) {
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final C4759l5 b() {
        return this.f41600b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C4651h0 c4651h0 = this.f41606h;
        synchronized (c4651h0) {
            c4651h0.f40981a = new Yc();
        }
        this.i.a(this.f41606h.a(), this.f41601c);
    }

    public final synchronized void e() {
        ((D5) this.f41613p).d();
    }

    public final I3 f() {
        return this.f41614q;
    }

    public final Cif g() {
        return this.f41601c;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final Context getContext() {
        return this.f41599a;
    }

    public final C4555d7 h() {
        return this.f41603e;
    }

    public final C4531c9 i() {
        return this.f41609l;
    }

    public final C4867p9 j() {
        return this.f41605g;
    }

    public final C9 k() {
        return this.f41611n;
    }

    public final I9 l() {
        return this.f41613p;
    }

    public final C5028vh m() {
        return (C5028vh) this.f41608k.a();
    }

    public final String n() {
        return this.f41601c.i();
    }

    public final PublicLogger o() {
        return this.f41610m;
    }

    public final C4769lf p() {
        return this.f41602d;
    }

    public final Hk q() {
        return this.f41618u;
    }

    public final Pk r() {
        return this.f41607j;
    }

    public final C4544cm s() {
        C4544cm c4544cm;
        C4513bh c4513bh = this.f41608k;
        synchronized (c4513bh) {
            c4544cm = c4513bh.f39562c.f40791a;
        }
        return c4544cm;
    }

    public final C4933ro t() {
        return this.f41617t;
    }

    public final void u() {
        C9 c92 = this.f41611n;
        int i = c92.f39242k;
        c92.f39244m = i;
        c92.f39233a.a(i).b();
    }

    public final void v() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        C4933ro c4933ro = this.f41617t;
        synchronized (c4933ro) {
            iOptInt = c4933ro.f41594a.a().optInt("last_migration_api_level", 0);
        }
        if (iOptInt < libraryApiLevel) {
            this.f41612o.getClass();
            Iterator it = E.u.G(new C4863p5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC4837o5) it.next()).a(iOptInt);
            }
            this.f41617t.b(libraryApiLevel);
        }
    }

    public final boolean w() {
        C5028vh c5028vh = (C5028vh) this.f41608k.a();
        return c5028vh.f41870n && c5028vh.isIdentifiersValid() && this.f41615r.didTimePassSeconds(this.f41611n.f39243l, c5028vh.f41875s, "need to check permissions");
    }

    public final boolean x() {
        C9 c92 = this.f41611n;
        return c92.f39244m < c92.f39242k && ((C5028vh) this.f41608k.a()).f41871o && ((C5028vh) this.f41608k.a()).isIdentifiersValid();
    }

    public final void y() {
        C4513bh c4513bh = this.f41608k;
        synchronized (c4513bh) {
            c4513bh.f39560a = null;
        }
    }

    public final boolean z() {
        C5028vh c5028vh = (C5028vh) this.f41608k.a();
        return c5028vh.f41870n && this.f41615r.didTimePassSeconds(this.f41611n.f39243l, c5028vh.f41876t, "should force send permissions");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4688ib
    public final void a(C4683i6 c4683i6) {
        String strA = AbstractC4512bg.a("Event received on service", EnumC4997ub.a(c4683i6.f41047d), c4683i6.getName(), c4683i6.getValue());
        if (strA != null) {
            this.f41610m.info(strA, new Object[0]);
        }
        String str = this.f41600b.f41171b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f41604f.a(c4683i6, new Ci());
    }

    public final void b(C4683i6 c4683i6) {
        this.f41606h.a(c4683i6.f41049f);
        C4625g0 c4625g0A = this.f41606h.a();
        C4677i0 c4677i0 = this.i;
        Cif cif = this.f41601c;
        synchronized (c4677i0) {
            if (c4625g0A.f40910b > cif.d().f40910b) {
                cif.a(c4625g0A).b();
                this.f41610m.info("Save new app environment for %s. Value: %s", this.f41600b, c4625g0A.f40909a);
            }
        }
    }

    public C4940s5(Context context, C4759l5 c4759l5, C4677i0 c4677i0, TimePassedChecker timePassedChecker, C5066x5 c5066x5, J4 j4) {
        this.f41599a = context.getApplicationContext();
        this.f41600b = c4759l5;
        this.i = c4677i0;
        this.f41615r = timePassedChecker;
        C4933ro c4933roF = c5066x5.f();
        this.f41617t = c4933roF;
        this.f41616s = Ga.j().s();
        C4513bh c4513bhA = c5066x5.a(this);
        this.f41608k = c4513bhA;
        PublicLogger publicLoggerA = c5066x5.d().a();
        this.f41610m = publicLoggerA;
        Cif cifA = c5066x5.e().a();
        this.f41601c = cifA;
        this.f41602d = Ga.j().x();
        C4651h0 c4651h0A = c4677i0.a(c4759l5, publicLoggerA, cifA);
        this.f41606h = c4651h0A;
        this.f41609l = c5066x5.a();
        C4555d7 c4555d7B = c5066x5.b(this);
        this.f41603e = c4555d7B;
        Fi fiD = c5066x5.d(this);
        this.f41612o = C5066x5.b();
        v();
        Pk pkA = C5066x5.a(this, c4933roF, new C4914r5(this));
        this.f41607j = pkA;
        publicLoggerA.info("Read app environment for component %s. Value: %s", c4759l5.toString(), c4651h0A.a().f40909a);
        Hk hkC = c5066x5.c();
        this.f41618u = hkC;
        this.f41611n = c5066x5.a(cifA, c4933roF, pkA, c4555d7B, c4651h0A, hkC, fiD);
        C4867p9 c4867p9C = C5066x5.c(this);
        this.f41605g = c4867p9C;
        this.f41604f = C5066x5.a(this, c4867p9C);
        this.f41614q = c5066x5.a(cifA);
        this.f41613p = c5066x5.a(fiD, c4555d7B, c4513bhA, j4, c4759l5, cifA);
        c4555d7B.e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4688ib, io.appmetrica.analytics.impl.Xa
    public synchronized void a(J4 j4) {
        try {
            this.f41608k.a(j4);
            if (Boolean.TRUE.equals(j4.f39676h)) {
                this.f41610m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(j4.f39676h)) {
                    this.f41610m.setEnabled(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4688ib, io.appmetrica.analytics.impl.Nl
    public synchronized void a(C4544cm c4544cm) {
        this.f41608k.a(c4544cm);
        ((D5) this.f41613p).e();
    }

    public void B() {
    }

    public final void a(String str) {
        this.f41601c.j(str).b();
    }
}
