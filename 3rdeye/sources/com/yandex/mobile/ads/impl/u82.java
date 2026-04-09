package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class u82 {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f33975a;

    public /* synthetic */ u82() {
        this(ew1.a.a());
    }

    public final boolean a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = this.f33975a.a(context);
        return du1VarA != null && du1VarA.Q();
    }

    public u82(ew1 sdkSettings) {
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f33975a = sdkSettings;
    }
}
