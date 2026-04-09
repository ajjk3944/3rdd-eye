package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.h5;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements s.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5640b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f5639a = i4;
        this.f5640b = obj;
    }

    @Override // s.a
    public final Object apply(Object obj) {
        switch (this.f5639a) {
            case 0:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getCustomTabsNavigationAbortedPostbacks$6((h5) obj);
            case 1:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getOpenMeasurementVerificationScriptResources$10((JSONArray) obj);
            case 2:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getDirectClickTrackingPostbacks$9((h5) obj);
            case 3:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getCustomTabsNavigationFinishedPostbacks$4((h5) obj);
            case 4:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getCustomTabsNavigationFailedPostbacks$5((h5) obj);
            case 5:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getCustomTabsHeaders$2((h5) obj);
            case 6:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getCustomTabsTabShownPostbacks$7((h5) obj);
            case 7:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getCustomTabsTabHiddenPostbacks$8((h5) obj);
            case 8:
                return ((AppLovinNativeAdImpl) this.f5640b).lambda$getCustomTabsNavigationStartedPostbacks$3((h5) obj);
            default:
                return AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$11((c) this.f5640b, (h5) obj);
        }
    }
}
