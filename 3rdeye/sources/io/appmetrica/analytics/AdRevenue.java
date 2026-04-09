package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC4623fo;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes3.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final BigDecimal f38700a;

        /* renamed from: b, reason: collision with root package name */
        private final Currency f38701b;

        /* renamed from: c, reason: collision with root package name */
        private AdType f38702c;

        /* renamed from: d, reason: collision with root package name */
        private String f38703d;

        /* renamed from: e, reason: collision with root package name */
        private String f38704e;

        /* renamed from: f, reason: collision with root package name */
        private String f38705f;

        /* renamed from: g, reason: collision with root package name */
        private String f38706g;

        /* renamed from: h, reason: collision with root package name */
        private String f38707h;
        private String i;

        /* renamed from: j, reason: collision with root package name */
        private Map f38708j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f38700a, this.f38701b, this.f38702c, this.f38703d, this.f38704e, this.f38705f, this.f38706g, this.f38707h, this.i, this.f38708j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f38703d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f38706g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f38707h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f38702c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f38704e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f38705f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f38708j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f38700a = bigDecimal;
            this.f38701b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j4, Currency currency) {
        return new Builder(AbstractC4623fo.a(j4), currency, 0);
    }

    public static Builder newBuilder(double d10, Currency currency) {
        return new Builder(new BigDecimal(AbstractC4623fo.a(d10)), currency, 0);
    }
}
