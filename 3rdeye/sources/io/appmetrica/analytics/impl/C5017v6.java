package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import b9.C1992A;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5017v6 extends C4487ah {

    /* renamed from: f, reason: collision with root package name */
    public final Context f41833f;

    /* renamed from: g, reason: collision with root package name */
    public final Gh f41834g;

    /* renamed from: h, reason: collision with root package name */
    public final J6 f41835h;
    public final R1 i;

    /* renamed from: j, reason: collision with root package name */
    public final G6 f41836j;

    public C5017v6(Context context, C4780m0 c4780m0, Wk wk, Gh gh) {
        super(c4780m0, wk, gh);
        this.f41833f = context;
        this.f41834g = gh;
        this.f41835h = C5065x4.l().i();
        this.i = C5065x4.l().f();
        this.f41836j = new G6(context);
    }

    @Override // io.appmetrica.analytics.impl.Ih
    public final synchronized void a() {
        try {
            if (this.f39641c) {
                return;
            }
            this.f39641c = true;
            String strB = this.f41835h.b();
            R1 r12 = this.i;
            Context context = this.f41833f;
            r12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (kotlin.jvm.internal.l.b(strB, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f41836j.a(this.f41834g);
            } else {
                this.f39639a.c();
                this.f39641c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ih
    public final boolean c() {
        this.f41836j.a(this.f41834g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ih, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return C1992A.f18074a;
    }
}
