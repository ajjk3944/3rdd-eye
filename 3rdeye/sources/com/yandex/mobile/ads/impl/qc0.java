package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class qc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32137a;

    public qc0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f32137a = context.getApplicationContext();
    }

    public final boolean a() {
        ew1 ew1VarA = ew1.a.a();
        Context context = this.f32137a;
        kotlin.jvm.internal.l.e(context, "context");
        du1 du1VarA = ew1VarA.a(context);
        return du1VarA != null && du1VarA.j0();
    }
}
