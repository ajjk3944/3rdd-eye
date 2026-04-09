package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAdViewConfiguration;

/* loaded from: classes.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f20168a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20169b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20170c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f20171a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* renamed from: b, reason: collision with root package name */
        private int f20172b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f20173c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f20171a;
        }

        public int getAdaptiveWidth() {
            return this.f20172b;
        }

        public int getInlineMaximumHeight() {
            return this.f20173c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f20171a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + ")");
            this.f20172b = i;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + ")");
            this.f20173c = i;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MaxAdViewConfiguration.Builder{adaptiveType=");
            sb.append(this.f20171a);
            sb.append(", adaptiveWidth=");
            sb.append(this.f20172b);
            sb.append(", inlineMaximumHeight=");
            return B4.i.j(sb, this.f20173c, "}");
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f20168a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f20169b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f20170c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdViewConfiguration{adaptiveType=");
        sb.append(this.f20168a);
        sb.append(", adaptiveWidth=");
        sb.append(this.f20169b);
        sb.append(", inlineMaximumHeight=");
        return B4.i.j(sb, this.f20170c, "}");
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f20168a = builderImpl.f20171a;
        this.f20169b = builderImpl.f20172b;
        this.f20170c = builderImpl.f20173c;
    }
}
