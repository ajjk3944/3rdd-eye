package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class v82 {

    /* renamed from: a, reason: collision with root package name */
    private final z82 f34413a;

    /* renamed from: b, reason: collision with root package name */
    private final ew1 f34414b;

    /* renamed from: c, reason: collision with root package name */
    private final xa2 f34415c;

    /* renamed from: d, reason: collision with root package name */
    private final u82 f34416d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f34417e;

    public /* synthetic */ v82(Context context) {
        this(context, new z82(context), ew1.a.a(), new xa2(), new u82());
    }

    public final void a() {
        xa2 xa2Var = this.f34415c;
        Context context = this.f34417e;
        xa2Var.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        if (ba.a(context) && this.f34414b.j() && this.f34416d.a(this.f34417e)) {
            this.f34413a.a();
        }
    }

    public v82(Context context, z82 toastPresenter, ew1 sdkSettings, xa2 versionValidationNeedChecker, u82 validationErrorIndicatorChecker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(toastPresenter, "toastPresenter");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(versionValidationNeedChecker, "versionValidationNeedChecker");
        kotlin.jvm.internal.l.f(validationErrorIndicatorChecker, "validationErrorIndicatorChecker");
        this.f34413a = toastPresenter;
        this.f34414b = sdkSettings;
        this.f34415c = versionValidationNeedChecker;
        this.f34416d = validationErrorIndicatorChecker;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f34417e = applicationContext;
    }
}
