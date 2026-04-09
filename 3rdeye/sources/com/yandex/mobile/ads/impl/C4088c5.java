package com.yandex.mobile.ads.impl;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4088c5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4162n2 f25536a;

    public C4088c5(be2 videoDurationHolder, C4162n2 adBreakTimingProvider) {
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(adBreakTimingProvider, "adBreakTimingProvider");
        this.f25536a = adBreakTimingProvider;
    }

    public final AdPlaybackState a(xs instreamAd, Object obj) {
        kotlin.jvm.internal.l.f(instreamAd, "instreamAd");
        List<zs> listA = instreamAd.a();
        if (listA.isEmpty() || obj == null) {
            AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
            kotlin.jvm.internal.l.c(adPlaybackState);
            return adPlaybackState;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zs> it = listA.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            long jA = this.f25536a.a(it.next().b());
            if (jA == Long.MIN_VALUE) {
                z10 = true;
            } else if (jA != -1) {
                arrayList.add(Long.valueOf(Util.msToUs(jA)));
            }
        }
        int size = z10 ? arrayList.size() + 1 : arrayList.size();
        long[] jArr = new long[size];
        if (z10) {
            jArr[size - 1] = Long.MIN_VALUE;
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            jArr[i] = ((Number) arrayList.get(i)).longValue();
        }
        Arrays.sort(jArr, 0, arrayList.size());
        return new AdPlaybackState(obj, Arrays.copyOf(jArr, size));
    }
}
