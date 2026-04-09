package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5002ug implements InterfaceC4900qg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41765a;

    /* renamed from: b, reason: collision with root package name */
    public final Gi f41766b;

    /* renamed from: c, reason: collision with root package name */
    public final C4666hf f41767c;

    /* renamed from: d, reason: collision with root package name */
    public final C4530c8 f41768d;

    /* renamed from: e, reason: collision with root package name */
    public final Cg f41769e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f41770f;

    public C5002ug(Gi gi, C4666hf c4666hf, Handler handler) {
        this(gi, c4666hf, handler, c4666hf.s());
    }

    public final void a() {
        if (this.f41765a) {
            return;
        }
        Gi gi = this.f41766b;
        Eg eg = new Eg(this.f41770f, this);
        gi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", eg);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4("", "", 4098, 0, anonymousInstance);
        c4681i4.f41055m = bundle;
        C4475a5 c4475a5 = gi.f39538a;
        gi.a(Gi.a(c4681i4, c4475a5), c4475a5, 1, null);
    }

    public C5002ug(Gi gi, C4666hf c4666hf, Handler handler, boolean z10) {
        this(gi, c4666hf, handler, z10, new C4530c8(z10), new Cg());
    }

    public C5002ug(Gi gi, C4666hf c4666hf, Handler handler, boolean z10, C4530c8 c4530c8, Cg cg) {
        this.f41766b = gi;
        this.f41767c = c4666hf;
        this.f41765a = z10;
        this.f41768d = c4530c8;
        this.f41769e = cg;
        this.f41770f = handler;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4900qg
    public final void a(C5102yg c5102yg) {
        String str = c5102yg == null ? null : c5102yg.f42142a;
        if (this.f41765a) {
            return;
        }
        synchronized (this) {
            C4530c8 c4530c8 = this.f41768d;
            this.f41769e.getClass();
            c4530c8.f40617d = Cg.a(str);
            c4530c8.a();
        }
    }

    public final synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            C4530c8 c4530c8 = this.f41768d;
            c4530c8.f40616c = deferredDeeplinkParametersListener;
            if (c4530c8.f40614a) {
                c4530c8.a(1);
            } else {
                c4530c8.a();
            }
            this.f41767c.u();
        } catch (Throwable th) {
            this.f41767c.u();
            throw th;
        }
    }

    public final synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            C4530c8 c4530c8 = this.f41768d;
            c4530c8.f40615b = deferredDeeplinkListener;
            if (c4530c8.f40614a) {
                c4530c8.a(1);
            } else {
                c4530c8.a();
            }
            this.f41767c.u();
        } catch (Throwable th) {
            this.f41767c.u();
            throw th;
        }
    }
}
