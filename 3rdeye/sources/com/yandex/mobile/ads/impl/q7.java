package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    private final j7 f32088a = new j7();

    static {
        TimeUnit.SECONDS.toMillis(10L);
    }

    public final h00 a(Context context, int i) {
        Integer numG;
        kotlin.jvm.internal.l.f(context, "context");
        this.f32088a.getClass();
        du1 du1VarA = ew1.a.a().a(context);
        return new h00(1.0f, i, (du1VarA == null || (numG = du1VarA.g()) == null) ? 0 : numG.intValue());
    }
}
