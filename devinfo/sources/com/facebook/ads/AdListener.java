package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes.dex */
public interface AdListener {
    @Benchmark
    void onAdClicked(Ad ad2);

    @Benchmark
    void onAdLoaded(Ad ad2);

    @Benchmark
    void onError(Ad ad2, AdError adError);

    @Benchmark
    void onLoggingImpression(Ad ad2);
}
