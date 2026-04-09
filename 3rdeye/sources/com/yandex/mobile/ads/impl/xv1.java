package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class xv1 implements yi {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f35514a;

    public xv1(vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f35514a = sdkEnvironmentModule;
    }

    @Override // com.yandex.mobile.ads.impl.yi
    public final xi a(ti adViewController) {
        kotlin.jvm.internal.l.f(adViewController, "adViewController");
        vu1 vu1Var = this.f35514a;
        return new wv1(adViewController, vu1Var, new o91(adViewController.l(), vu1Var, adViewController.f(), adViewController.i()), new gj(adViewController.f()), new k71(adViewController.f()), new rt1(adViewController.f()), new r71(adViewController), new Handler(Looper.getMainLooper()), ew1.a.a(), new vi(), new u51());
    }
}
