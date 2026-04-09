package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class x82 {

    /* renamed from: a, reason: collision with root package name */
    private final xa2 f35220a;

    /* renamed from: b, reason: collision with root package name */
    private final w82 f35221b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f35222c;

    /* renamed from: d, reason: collision with root package name */
    private final y82 f35223d;

    public /* synthetic */ x82(Context context) {
        this(context, new xa2(), new w82());
    }

    public final void a() {
        xa2 xa2Var = this.f35220a;
        Context context = this.f35222c;
        xa2Var.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        if (ba.a(context) && this.f35221b.a(this.f35222c)) {
            this.f35223d.getClass();
            y82.b();
        }
    }

    public x82(Context context, xa2 versionValidationNeedChecker, w82 validationErrorLogChecker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(versionValidationNeedChecker, "versionValidationNeedChecker");
        kotlin.jvm.internal.l.f(validationErrorLogChecker, "validationErrorLogChecker");
        this.f35220a = versionValidationNeedChecker;
        this.f35221b = validationErrorLogChecker;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f35222c = applicationContext;
        this.f35223d = new y82();
    }
}
