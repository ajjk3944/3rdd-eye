package com.yandex.mobile.ads.impl;

import android.app.Activity;
import b9.C1992A;

/* renamed from: com.yandex.mobile.ads.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4181q0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4187r0 f31963a;

    public /* synthetic */ C4181q0(mp1 mp1Var) {
        this(mp1Var, new C4187r0(mp1Var));
    }

    public final void a(Activity activity, C4236y0 adActivityData) {
        Object objA;
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(adActivityData, "adActivityData");
        if (adActivityData.a() == null) {
            return;
        }
        try {
            activity.startActivityForResult(adActivityData.a(), 0);
            objA = C1992A.f18074a;
            this.f31963a.a(adActivityData);
            activity.finish();
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Throwable thA = b9.m.a(objA);
        if (thA != null) {
            this.f31963a.a(thA);
        }
    }

    public C4181q0(mp1 reporter, C4187r0 activityResultReporter) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(activityResultReporter, "activityResultReporter");
        this.f31963a = activityResultReporter;
    }
}
