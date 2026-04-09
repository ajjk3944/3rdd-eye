package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class ya0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35680a;

    public ya0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f35680a = context;
    }

    public final ImageView a(int i, int i10) {
        ImageView imageView = new ImageView(this.f35680a);
        int iA = jh2.a(this.f35680a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = i;
        layoutParams.topMargin = i10;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
