package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes3.dex */
public final class Ic extends C4940s5 implements InterfaceC4610fb, InterfaceC4584eb {

    /* renamed from: v, reason: collision with root package name */
    public final C5052wg f39625v;

    /* renamed from: w, reason: collision with root package name */
    public final Ag f39626w;

    /* renamed from: x, reason: collision with root package name */
    public final W6 f39627x;

    /* renamed from: y, reason: collision with root package name */
    public final C4809n3 f39628y;

    public Ic(Context context, C4544cm c4544cm, C4759l5 c4759l5, J4 j4, C5052wg c5052wg, W6 w62, AbstractC4889q5 abstractC4889q5) {
        this(context, c4759l5, c4544cm, j4, new C4677i0(), new TimePassedChecker(), new Kc(context, c4759l5, j4, abstractC4889q5, c4544cm, new Dc(w62), Ga.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ga.j().w(), Ga.j().k(), new C5073xc()), c5052wg, w62);
    }

    @Override // io.appmetrica.analytics.impl.C4940s5
    public final void B() {
        this.f39625v.a(this.f39626w);
    }

    public final boolean C() {
        boolean zOptBoolean;
        C4933ro c4933ro = this.f41617t;
        synchronized (c4933ro) {
            zOptBoolean = c4933ro.f41594a.a().optBoolean("referrer_handled", false);
        }
        return zOptBoolean;
    }

    @Override // io.appmetrica.analytics.impl.C4940s5, io.appmetrica.analytics.impl.InterfaceC4688ib, io.appmetrica.analytics.impl.Xa
    public final synchronized void a(J4 j4) {
        super.a(j4);
        this.f39627x.a(j4.i);
    }

    @Override // io.appmetrica.analytics.impl.C4940s5, io.appmetrica.analytics.impl.Xa
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MAIN;
    }

    @Override // io.appmetrica.analytics.impl.C4940s5, io.appmetrica.analytics.impl.InterfaceC4688ib, io.appmetrica.analytics.impl.Nl
    public final void a(C4544cm c4544cm) {
        super.a(c4544cm);
        this.f39628y.a(c4544cm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4584eb
    public final void a() {
        C4933ro c4933ro = this.f41617t;
        synchronized (c4933ro) {
            C4959so c4959so = c4933ro.f41594a;
            c4959so.a(c4959so.a().put("referrer_handled", true));
        }
    }

    public Ic(Context context, C4759l5 c4759l5, C4544cm c4544cm, J4 j4, C4677i0 c4677i0, TimePassedChecker timePassedChecker, Kc kc, C5052wg c5052wg, W6 w62) {
        super(context, c4759l5, c4677i0, timePassedChecker, kc, j4);
        this.f39625v = c5052wg;
        C4867p9 c4867p9J = j();
        c4867p9J.a(EnumC4997ub.EVENT_TYPE_REGULAR, new Sg(c4867p9J.b()));
        this.f39626w = kc.b(this);
        this.f39627x = w62;
        C4809n3 c4809n3A = kc.a(this);
        this.f39628y = c4809n3A;
        c4809n3A.a(c4544cm, j4.f39680m);
    }
}
