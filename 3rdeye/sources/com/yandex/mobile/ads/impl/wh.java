package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class wh {

    /* renamed from: a, reason: collision with root package name */
    private final zw1 f34969a;

    public wh(zw1 sensitiveModeChecker) {
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        this.f34969a = sensitiveModeChecker;
    }

    public final boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        boolean zB = this.f34969a.b(context);
        du1 du1VarA = ew1.a.a().a(context);
        return (zB || du1VarA == null || !du1VarA.d0()) ? false : true;
    }
}
