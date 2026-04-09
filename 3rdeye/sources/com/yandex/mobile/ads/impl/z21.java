package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class z21 {

    /* renamed from: a, reason: collision with root package name */
    private final at1<MultiBannerControlsContainer> f36150a = new at1<>();

    public final MultiBannerControlsContainer a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        at1<MultiBannerControlsContainer> at1Var = this.f36150a;
        int i = R.layout.monetization_ads_internal_multibanner_controls;
        at1Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) at1.a(context, MultiBannerControlsContainer.class, i, null);
        if (multiBannerControlsContainer == null) {
            return multiBannerControlsContainer;
        }
        multiBannerControlsContainer.setLayoutParams(layoutParams);
        return multiBannerControlsContainer;
    }
}
