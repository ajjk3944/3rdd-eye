package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class le1 {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f29981a;

    public /* synthetic */ le1() {
        this(ew1.a.a());
    }

    public final boolean a(Context context) {
        du1 du1VarA;
        kotlin.jvm.internal.l.f(context, "context");
        return (!aa.a(context) || (du1VarA = this.f29981a.a(context)) == null || du1VarA.x0()) ? false : true;
    }

    public le1(ew1 sdkSettings) {
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f29981a = sdkSettings;
    }
}
