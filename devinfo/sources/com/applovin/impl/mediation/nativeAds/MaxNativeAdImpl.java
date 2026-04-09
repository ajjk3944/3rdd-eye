package com.applovin.impl.mediation.nativeAds;

import android.view.View;
import com.applovin.impl.mediation.ads.b;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxNativeAdImpl {
    private b adViewTracker;
    private List<View> clickableViews;

    public b getAdViewTracker() {
        return this.adViewTracker;
    }

    public List<View> getClickableViews() {
        return this.clickableViews;
    }

    public void setAdViewTracker(b bVar) {
        this.adViewTracker = bVar;
    }

    public void setClickableViews(List<View> list) {
        this.clickableViews = list;
    }
}
