package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class f91 {

    /* renamed from: a, reason: collision with root package name */
    private final w81 f27248a;

    /* renamed from: b, reason: collision with root package name */
    private final ac1 f27249b;

    /* renamed from: c, reason: collision with root package name */
    private final ua1 f27250c;

    public /* synthetic */ f91(Context context, A9.E e4, C4198s4 c4198s4, v41 v41Var) {
        this(context, e4, c4198s4, v41Var, new w81(context, e4, c4198s4), new ac1(c4198s4));
    }

    public final void a() {
        this.f27250c.a();
        this.f27248a.getClass();
        this.f27249b.getClass();
    }

    public f91(Context context, A9.E coroutineScope, C4198s4 adLoadingPhasesManager, v41 nativeAdControllers, w81 nativeImagesLoader, ac1 webViewLoader) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(nativeImagesLoader, "nativeImagesLoader");
        kotlin.jvm.internal.l.f(webViewLoader, "webViewLoader");
        this.f27248a = nativeImagesLoader;
        this.f27249b = webViewLoader;
        this.f27250c = nativeAdControllers.a();
    }
}
