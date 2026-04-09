package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.impl.fs;
import java.util.List;

/* loaded from: classes3.dex */
public final class ax0 {

    /* renamed from: a, reason: collision with root package name */
    private final g31 f25013a = new g31();

    /* renamed from: b, reason: collision with root package name */
    private final z21 f25014b = new z21();

    /* renamed from: c, reason: collision with root package name */
    private final y21 f25015c = new y21();

    public final qv1 a(a8 adResponse, C4072a3 adConfiguration, CustomizableMediaView mediaView, ej0 imageProvider, List imageValues, cx0 mediaViewRenderController, nx1 nx1Var) {
        w21 w21Var;
        Long lB;
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        Context context = mediaView.getContext();
        Q1.f fVar = new Q1.f(context);
        a31 a31Var = new a31(context, adResponse, adConfiguration);
        h31 h31Var = new h31(fVar);
        long jLongValue = (nx1Var == null || (lB = nx1Var.b()) == null) ? 0L : lB.longValue();
        if (jLongValue > 0) {
            w21Var = new w21(fVar, h31Var, a31Var, new ys0());
            fVar.addOnAttachStateChangeListener(new d31(w21Var, jLongValue));
        } else {
            w21Var = null;
        }
        fVar.a(new rf1(a31Var, w21Var));
        MultiBannerControlsContainer multiBannerControlsContainerA = this.f25014b.a(context);
        if (multiBannerControlsContainerA != null) {
            multiBannerControlsContainerA.a(fVar);
            multiBannerControlsContainerA.setOnClickLeftButtonListener(new fs.a(h31Var, a31Var, w21Var));
            multiBannerControlsContainerA.setOnClickRightButtonListener(new fs.b(h31Var, a31Var, w21Var));
        }
        ExtendedViewContainer container = this.f25015c.a(context, imageValues);
        this.f25013a.getClass();
        kotlin.jvm.internal.l.f(container, "container");
        Context context2 = mediaView.getContext();
        kotlin.jvm.internal.l.e(context2, "getContext(...)");
        if (!s80.a(context2, r80.f32551e)) {
            mediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        container.addView(fVar, layoutParams);
        if (multiBannerControlsContainerA != null) {
            container.addView(multiBannerControlsContainerA, layoutParams);
        }
        mediaView.addView(container, layoutParams);
        i31 i31Var = new i31(fVar, imageProvider, adConfiguration.q().c(), adResponse);
        return new qv1(mediaView, i31Var, mediaViewRenderController, new jg2(i31Var));
    }
}
