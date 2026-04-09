package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import c9.C2078B;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class eh2 {
    public static final ah2 a(CustomizableMediaView customizableMediaView, String mediaType) {
        kotlin.jvm.internal.l.f(customizableMediaView, "<this>");
        kotlin.jvm.internal.l.f(mediaType, "mediaType");
        ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
        Integer numValueOf = layoutParams != null ? Integer.valueOf(r72.a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
        Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(r72.a(layoutParams2.height)) : null;
        int iA = r72.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
        int iA2 = r72.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
        int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
        ju0 ju0Var = mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? ju0.f29273d : ju0.f29271b : ju0.f29272c;
        int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
        ju0 ju0Var2 = mode2 != Integer.MIN_VALUE ? (mode2 == 0 || mode2 != 1073741824) ? ju0.f29273d : ju0.f29271b : ju0.f29272c;
        return new ah2(new zg2(r72.a(customizableMediaView.getWidth()), r72.a(customizableMediaView.getHeight())), new ar0(numValueOf, numValueOf2), new hu0(new iu0(iA, ju0Var), new iu0(iA2, ju0Var2)), C2078B.o(new b9.l("asset", "media"), new b9.l("media_type", mediaType)));
    }
}
