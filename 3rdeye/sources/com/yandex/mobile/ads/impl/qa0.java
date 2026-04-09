package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes3.dex */
public final class qa0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32124a;

    public qa0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f32124a = context;
    }

    public final FrameLayout a() {
        FrameLayout frameLayout = new FrameLayout(this.f32124a);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return frameLayout;
    }
}
