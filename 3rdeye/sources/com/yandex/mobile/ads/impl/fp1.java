package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class fp1 {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f27420a;

    public /* synthetic */ fp1() {
        this(new j10());
    }

    public final Button a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Button button = new Button(context);
        button.setBackground(C5848a.getDrawable(context, R.drawable.monetization_ads_video_ic_replay));
        this.f27420a.getClass();
        int iA = j10.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public fp1(j10 dimensionConverter) {
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        this.f27420a = dimensionConverter;
    }
}
