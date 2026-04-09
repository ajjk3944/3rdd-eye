package com.yandex.mobile.ads.nativeads;

import c9.C2100u;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.b71;
import com.yandex.mobile.ads.impl.v71;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class g {
    public static b71 a(NativeAdViewBinder binder) {
        l.f(binder, "binder");
        return new b71(new b71.a(binder.getNativeAdView(), v71.f34408c, C2100u.f18582b).a(binder.getAgeView()).b(binder.getBodyView()).c(binder.getCallToActionView()).d(binder.getDomainView()).a(binder.getFaviconView()).b(binder.getFeedbackView()).c(binder.getIconView()).a((CustomizableMediaView) binder.getMediaView()).e(binder.getPriceView()).a(binder.getRatingView()).f(binder.getReviewCountView()).g(binder.getSponsoredView()).h(binder.getTitleView()).i(binder.getWarningView()));
    }
}
