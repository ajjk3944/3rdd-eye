package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class BidderTokenRequestConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final AdType f23996a;

    /* renamed from: b, reason: collision with root package name */
    private final BannerAdSize f23997b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f23998c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final AdType f23999a;

        /* renamed from: b, reason: collision with root package name */
        private BannerAdSize f24000b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f24001c;

        public Builder(AdType adType) {
            l.f(adType, "adType");
            this.f23999a = adType;
        }

        public final BidderTokenRequestConfiguration build() {
            return new BidderTokenRequestConfiguration(this.f23999a, this.f24000b, this.f24001c, null);
        }

        public final Builder setBannerAdSize(BannerAdSize bannerAdSize) {
            this.f24000b = bannerAdSize;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.f24001c = map;
            return this;
        }
    }

    public /* synthetic */ BidderTokenRequestConfiguration(AdType adType, BannerAdSize bannerAdSize, Map map, g gVar) {
        this(adType, bannerAdSize, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !BidderTokenRequestConfiguration.class.equals(obj.getClass())) {
            return false;
        }
        BidderTokenRequestConfiguration bidderTokenRequestConfiguration = (BidderTokenRequestConfiguration) obj;
        if (this.f23996a == bidderTokenRequestConfiguration.f23996a && l.b(this.f23997b, bidderTokenRequestConfiguration.f23997b)) {
            return l.b(this.f23998c, bidderTokenRequestConfiguration.f23998c);
        }
        return false;
    }

    public final AdType getAdType() {
        return this.f23996a;
    }

    public final BannerAdSize getBannerAdSize() {
        return this.f23997b;
    }

    public final Map<String, String> getParameters() {
        return this.f23998c;
    }

    public int hashCode() {
        int iHashCode = this.f23996a.hashCode() * 31;
        BannerAdSize bannerAdSize = this.f23997b;
        int iHashCode2 = (iHashCode + (bannerAdSize != null ? bannerAdSize.hashCode() : 0)) * 31;
        Map<String, String> map = this.f23998c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    private BidderTokenRequestConfiguration(AdType adType, BannerAdSize bannerAdSize, Map<String, String> map) {
        this.f23996a = adType;
        this.f23997b = bannerAdSize;
        this.f23998c = map;
    }
}
