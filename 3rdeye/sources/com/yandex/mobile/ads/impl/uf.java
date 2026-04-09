package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.k80;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class uf {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicBoolean f34046f = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final Context f34047a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f34048b;

    /* renamed from: c, reason: collision with root package name */
    private final ew1 f34049c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f34050d;

    /* renamed from: e, reason: collision with root package name */
    private final k80 f34051e;

    public /* synthetic */ uf(Context context, vu1 vu1Var) {
        this(context, vu1Var, ew1.a.a(), vu1Var.c(), k80.a.a(context));
    }

    public final void a() {
        du1 du1VarA = this.f34049c.a(this.f34047a);
        if (du1VarA == null || !du1VarA.w0() || f34046f.getAndSet(true)) {
            return;
        }
        for (i80 i80Var : this.f34051e.b()) {
            if (i80Var.d() != null) {
                h80 h80VarD = i80Var.d();
                new o80(this.f34047a, new C4072a3(i80Var.c(), this.f34048b), h80VarD).a(h80VarD.c());
            }
            this.f34051e.a(i80Var.f());
            long jCurrentTimeMillis = System.currentTimeMillis() - i80Var.f();
            LinkedHashMap linkedHashMapU = C2078B.u(i80Var.e());
            linkedHashMapU.put("interval", tp0.a(jCurrentTimeMillis));
            ip1.b reportType = ip1.b.f28787M;
            C4075b c4075bA = i80Var.a();
            kotlin.jvm.internal.l.f(reportType, "reportType");
            this.f34050d.a(new ip1(reportType.a(), C2078B.u(linkedHashMapU), c4075bA));
        }
        this.f34051e.a();
    }

    public uf(Context appContext, vu1 sdkEnvironmentModule, ew1 settings, mp1 metricaReporter, k80 falseClickDataStorage) {
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(settings, "settings");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(falseClickDataStorage, "falseClickDataStorage");
        this.f34047a = appContext;
        this.f34048b = sdkEnvironmentModule;
        this.f34049c = settings;
        this.f34050d = metricaReporter;
        this.f34051e = falseClickDataStorage;
    }
}
