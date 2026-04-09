package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.vw0;

/* loaded from: classes3.dex */
public final class ey0 extends vw0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey0(CustomizableMediaView mediaView, cx0 mediaViewRenderController) {
        super(mediaView, mediaViewRenderController);
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(CustomizableMediaView mediaView) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
    }

    @Override // com.yandex.mobile.ads.impl.vw0, com.yandex.mobile.ads.impl.ig2
    public final void b(View view, sw0 sw0Var) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final vw0.a d() {
        return vw0.a.f34723g;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, sw0 sw0Var) {
        CustomizableMediaView mediaView = (CustomizableMediaView) view;
        sw0 mediaValue = sw0Var;
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    /* renamed from: a */
    public final void b(CustomizableMediaView mediaView, sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.vw0
    public final void a(sw0 mediaValue) {
        kotlin.jvm.internal.l.f(mediaValue, "mediaValue");
    }
}
