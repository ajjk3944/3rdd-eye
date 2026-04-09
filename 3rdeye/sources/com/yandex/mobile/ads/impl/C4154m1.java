package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import b9.C1992A;
import com.yandex.mobile.ads.impl.C4242z0;

/* renamed from: com.yandex.mobile.ads.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4154m1 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f30149a;

    /* renamed from: b, reason: collision with root package name */
    private final C4174p0 f30150b;

    /* renamed from: c, reason: collision with root package name */
    private final C4147l1 f30151c;

    public /* synthetic */ C4154m1(C4072a3 c4072a3, a8 a8Var) {
        this(c4072a3, a8Var, c4072a3.q().c(), new C4174p0(a8Var, c4072a3), new C4147l1(c4072a3.q().e()));
    }

    public final void a(Context context, Intent intent) {
        Object objA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(intent, "intent");
        long jA = hi0.a();
        Intent intentA = this.f30151c.a(context, jA);
        C4236y0 c4236y0A = this.f30150b.a(intent);
        C4242z0 c4242z0A = C4242z0.a.a();
        c4242z0A.a(jA, c4236y0A);
        try {
            context.startActivity(intentA);
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Throwable thA = b9.m.a(objA);
        if (thA != null) {
            c4242z0A.a(jA);
            this.f30149a.reportError("Failed to launch AdActivity for result", thA);
        }
    }

    public C4154m1(C4072a3 adConfiguration, a8<?> adResponse, mp1 reporter, C4174p0 activityResultAdDataCreator, C4147l1 intentCreator) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(activityResultAdDataCreator, "activityResultAdDataCreator");
        kotlin.jvm.internal.l.f(intentCreator, "intentCreator");
        this.f30149a = reporter;
        this.f30150b = activityResultAdDataCreator;
        this.f30151c = intentCreator;
    }
}
