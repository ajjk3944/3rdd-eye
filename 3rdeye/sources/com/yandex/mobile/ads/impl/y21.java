package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.impl.gu0;
import java.util.List;

/* loaded from: classes3.dex */
public final class y21 {

    /* renamed from: a, reason: collision with root package name */
    private final e31 f35600a = new e31();

    public final ExtendedViewContainer a(Context context, List<jj0> imageValues) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        this.f35600a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new fm1((float) e31.a(imageValues), new gu0.a()));
        return extendedViewContainer;
    }
}
