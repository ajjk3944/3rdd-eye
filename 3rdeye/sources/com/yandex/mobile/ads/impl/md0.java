package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import b9.C1992A;
import com.yandex.mobile.ads.impl.C4242z0;

/* loaded from: classes3.dex */
public final class md0 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f30353a;

    /* renamed from: b, reason: collision with root package name */
    private final ld0 f30354b;

    public /* synthetic */ md0(vu1 vu1Var) {
        this(vu1Var, vu1Var.c(), new ld0(vu1Var.e()));
    }

    public final Object a(Context context, C4236y0 adActivityData) {
        Object objA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adActivityData, "adActivityData");
        long jA = hi0.a();
        Intent intentA = this.f30354b.a(context, jA);
        C4242z0 c4242z0A = C4242z0.a.a();
        c4242z0A.a(jA, adActivityData);
        try {
            context.startActivity(intentA);
            objA = C1992A.f18074a;
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Throwable thA = b9.m.a(objA);
        if (thA != null) {
            c4242z0A.a(jA);
            uo0.a("Failed to show Fullscreen Ad. Exception: " + thA, new Object[0]);
            this.f30353a.reportError("Failed to show Fullscreen Ad", thA);
        }
        return objA;
    }

    public md0(vu1 sdkEnvironmentModule, mp1 reporter, ld0 intentCreator) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(intentCreator, "intentCreator");
        this.f30353a = reporter;
        this.f30354b = intentCreator;
    }
}
