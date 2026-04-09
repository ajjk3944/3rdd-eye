package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes3.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f38869a;

    /* renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f38870b;

    /* renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f38871c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f38869a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f38870b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f38871c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f38869a + ", mHuawei=" + this.f38870b + ", yandex=" + this.f38871c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f38869a = adTrackingInfoResult;
        this.f38870b = adTrackingInfoResult2;
        this.f38871c = adTrackingInfoResult3;
    }
}
