package com.yandex.mobile.ads.feed;

import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class FeedAdAppearance {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f24033a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f24034b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f24035a;

        /* renamed from: b, reason: collision with root package name */
        private Double f24036b;

        public Builder(int i) {
            this.f24035a = i;
        }

        public final FeedAdAppearance build() {
            return new FeedAdAppearance(Integer.valueOf(this.f24035a), this.f24036b);
        }

        public final Builder setCardCornerRadius(Double d10) {
            this.f24036b = d10;
            return this;
        }
    }

    public FeedAdAppearance(Integer num, Double d10) {
        this.f24033a = num;
        this.f24034b = d10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !FeedAdAppearance.class.equals(obj.getClass())) {
            return false;
        }
        FeedAdAppearance feedAdAppearance = (FeedAdAppearance) obj;
        if (l.b(this.f24033a, feedAdAppearance.f24033a)) {
            return l.a(this.f24034b, feedAdAppearance.f24034b);
        }
        return false;
    }

    public final Double getCardCornerRadius() {
        return this.f24034b;
    }

    public final Integer getCardWidth() {
        return this.f24033a;
    }

    public int hashCode() {
        Integer num = this.f24033a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Double d10 = this.f24034b;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }
}
