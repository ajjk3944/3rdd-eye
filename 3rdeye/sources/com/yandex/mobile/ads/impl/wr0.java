package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes3.dex */
public final class wr0 {

    /* renamed from: a, reason: collision with root package name */
    private final oj1 f35045a;

    /* renamed from: b, reason: collision with root package name */
    private final ce2 f35046b;

    public wr0(oj1 positionProviderHolder, ce2 videoDurationHolder) {
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        this.f35045a = positionProviderHolder;
        this.f35046b = videoDurationHolder;
    }

    public final int a(AdPlaybackState adPlaybackState) {
        kotlin.jvm.internal.l.f(adPlaybackState, "adPlaybackState");
        ji1 ji1VarB = this.f35045a.b();
        if (ji1VarB == null) {
            return -1;
        }
        long jMsToUs = Util.msToUs(this.f35046b.a());
        long jMsToUs2 = Util.msToUs(ji1VarB.a());
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(jMsToUs2, jMsToUs);
        return adGroupIndexForPositionUs == -1 ? adPlaybackState.getAdGroupIndexAfterPositionUs(jMsToUs2, jMsToUs) : adGroupIndexForPositionUs;
    }
}
