package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.singular.sdk.internal.Constants;

/* loaded from: classes3.dex */
public final class gj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27773a;

    public gj0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f27773a = context.getApplicationContext();
    }

    public final String a(int i, int i10) {
        Context context = this.f27773a;
        kotlin.jvm.internal.l.e(context, "context");
        int iA = jh2.a(context, i);
        Context context2 = this.f27773a;
        kotlin.jvm.internal.l.e(context2, "context");
        int iA2 = jh2.a(context2, i10);
        fp0.a(new Object[0]);
        return (iA >= 320 || iA2 >= 240) ? Constants.LARGE : (iA >= 160 || iA2 >= 160) ? Constants.MEDIUM : Constants.SMALL;
    }
}
