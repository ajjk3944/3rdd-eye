package com.yandex.mobile.ads.impl;

import android.content.res.TypedArray;
import c9.C2091l;
import com.yandex.mobile.ads.R;

/* loaded from: classes3.dex */
public final class mf2 {
    public static lf2 a(TypedArray attributes) {
        kotlin.jvm.internal.l.f(attributes, "attributes");
        return (lf2) C2091l.n(lf2.values(), attributes.getInt(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_scale_type, -1));
    }
}
