package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public final class vr0 {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f34653a;

    /* renamed from: b, reason: collision with root package name */
    private final be2 f34654b;

    public vr0(nj1 positionProviderHolder, be2 videoDurationHolder) {
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        this.f34653a = positionProviderHolder;
        this.f34654b = videoDurationHolder;
    }

    public final int a(AdPlaybackState adPlaybackState) {
        kotlin.jvm.internal.l.f(adPlaybackState, "adPlaybackState");
        ii1 ii1VarB = this.f34653a.b();
        if (ii1VarB == null) {
            return -1;
        }
        long jMsToUs = Util.msToUs(this.f34654b.a());
        long jMsToUs2 = Util.msToUs(ii1VarB.a());
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(jMsToUs2, jMsToUs);
        return adGroupIndexForPositionUs == -1 ? adPlaybackState.getAdGroupIndexAfterPositionUs(jMsToUs2, jMsToUs) : adGroupIndexForPositionUs;
    }
}
