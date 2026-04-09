package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
public final class fy0 implements xw0 {
    @Override // com.yandex.mobile.ads.impl.xw0
    public final vw0 a(CustomizableMediaView mediaView, C4072a3 adConfiguration, ej0 imageProvider, ov0 controlsProvider, ck0 impressionEventsObservable, c91 nativeMediaContent, j81 nativeForcePauseObserver, v41 nativeAdControllers, cx0 mediaViewRenderController, nx1 nx1Var, sw0 sw0Var) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(controlsProvider, "controlsProvider");
        kotlin.jvm.internal.l.f(impressionEventsObservable, "impressionEventsObservable");
        kotlin.jvm.internal.l.f(nativeMediaContent, "nativeMediaContent");
        kotlin.jvm.internal.l.f(nativeForcePauseObserver, "nativeForcePauseObserver");
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(mediaViewRenderController, "mediaViewRenderController");
        mediaView.removeAllViews();
        return new ey0(mediaView, mediaViewRenderController);
    }
}
