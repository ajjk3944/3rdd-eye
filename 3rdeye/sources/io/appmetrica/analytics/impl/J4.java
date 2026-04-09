package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class J4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f39669a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f39670b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f39671c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f39672d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f39673e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f39674f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f39675g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f39676h;
    public final Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, String> f39677j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f39678k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f39679l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f39680m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f39681n;

    public J4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.f39669a = str;
        this.f39670b = bool;
        this.f39671c = location;
        this.f39672d = bool2;
        this.f39673e = num;
        this.f39674f = num2;
        this.f39675g = num3;
        this.f39676h = bool3;
        this.i = bool4;
        this.f39677j = map;
        this.f39678k = num4;
        this.f39679l = bool5;
        this.f39680m = bool6;
        this.f39681n = bool7;
    }

    public final boolean a(J4 j4) {
        return equals(j4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final J4 mergeFrom(J4 j4) {
        return new J4((String) WrapUtils.getOrDefaultNullable(this.f39669a, j4.f39669a), (Boolean) WrapUtils.getOrDefaultNullable(this.f39670b, j4.f39670b), (Location) WrapUtils.getOrDefaultNullable(this.f39671c, j4.f39671c), (Boolean) WrapUtils.getOrDefaultNullable(this.f39672d, j4.f39672d), (Integer) WrapUtils.getOrDefaultNullable(this.f39673e, j4.f39673e), (Integer) WrapUtils.getOrDefaultNullable(this.f39674f, j4.f39674f), (Integer) WrapUtils.getOrDefaultNullable(this.f39675g, j4.f39675g), (Boolean) WrapUtils.getOrDefaultNullable(this.f39676h, j4.f39676h), (Boolean) WrapUtils.getOrDefaultNullable(this.i, j4.i), (Map) WrapUtils.getOrDefaultNullable(this.f39677j, j4.f39677j), (Integer) WrapUtils.getOrDefaultNullable(this.f39678k, j4.f39678k), (Boolean) WrapUtils.getOrDefaultNullable(this.f39679l, j4.f39679l), (Boolean) WrapUtils.getOrDefaultNullable(this.f39680m, j4.f39680m), (Boolean) WrapUtils.getOrDefaultNullable(this.f39681n, j4.f39681n));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((J4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J4.class == obj.getClass()) {
            J4 j4 = (J4) obj;
            if (Objects.equals(this.f39669a, j4.f39669a) && Objects.equals(this.f39670b, j4.f39670b) && Objects.equals(this.f39671c, j4.f39671c) && Objects.equals(this.f39672d, j4.f39672d) && Objects.equals(this.f39673e, j4.f39673e) && Objects.equals(this.f39674f, j4.f39674f) && Objects.equals(this.f39675g, j4.f39675g) && Objects.equals(this.f39676h, j4.f39676h) && Objects.equals(this.i, j4.i) && Objects.equals(this.f39677j, j4.f39677j) && Objects.equals(this.f39678k, j4.f39678k) && Objects.equals(this.f39679l, j4.f39679l) && Objects.equals(this.f39680m, j4.f39680m) && Objects.equals(this.f39681n, j4.f39681n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f39681n) + ((Objects.hashCode(this.f39680m) + ((Objects.hashCode(this.f39679l) + ((Objects.hashCode(this.f39678k) + ((Objects.hashCode(this.f39677j) + ((Objects.hashCode(this.i) + ((Objects.hashCode(this.f39676h) + ((Objects.hashCode(this.f39675g) + ((Objects.hashCode(this.f39674f) + ((Objects.hashCode(this.f39673e) + ((Objects.hashCode(this.f39672d) + ((Objects.hashCode(this.f39671c) + ((Objects.hashCode(this.f39670b) + (Objects.hashCode(this.f39669a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f39669a + "', locationTracking=" + this.f39670b + ", manualLocation=" + this.f39671c + ", firstActivationAsUpdate=" + this.f39672d + ", sessionTimeout=" + this.f39673e + ", maxReportsCount=" + this.f39674f + ", dispatchPeriod=" + this.f39675g + ", logEnabled=" + this.f39676h + ", dataSendingEnabled=" + this.i + ", clidsFromClient=" + this.f39677j + ", maxReportsInDbCount=" + this.f39678k + ", nativeCrashesEnabled=" + this.f39679l + ", revenueAutoTrackingEnabled=" + this.f39680m + ", advIdentifiersTrackingEnabled=" + this.f39681n + '}';
    }

    public J4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled());
    }

    public J4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
