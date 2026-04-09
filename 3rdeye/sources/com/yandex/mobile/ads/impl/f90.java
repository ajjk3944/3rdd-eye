package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* loaded from: classes3.dex */
public final class f90 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27245a;

    /* renamed from: b, reason: collision with root package name */
    private final mp1 f27246b;

    /* renamed from: c, reason: collision with root package name */
    private final tz1 f27247c;

    public /* synthetic */ f90(Context context, mp1 mp1Var) {
        this(context, mp1Var, new tz1());
    }

    public final e90 a(q20 clickHandler) {
        kotlin.jvm.internal.l.f(clickHandler, "clickHandler");
        sz1 sz1Var = new sz1(this.f27246b);
        tz1 tz1Var = this.f27247c;
        Context context = this.f27245a;
        tz1Var.getClass();
        return new e90(new ContextThemeWrapper(this.f27245a, R.style.Div), tz1.a(context, sz1Var, clickHandler), sz1Var);
    }

    public f90(Context appContext, mp1 reporter, tz1 sliderDivConfigurationCreator) {
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(sliderDivConfigurationCreator, "sliderDivConfigurationCreator");
        this.f27245a = appContext;
        this.f27246b = reporter;
        this.f27247c = sliderDivConfigurationCreator;
    }
}
