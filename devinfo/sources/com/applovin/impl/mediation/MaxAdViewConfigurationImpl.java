package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAdViewConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f4513a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4514b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4515c;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f4516a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* renamed from: b, reason: collision with root package name */
        private int f4517b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f4518c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f4516a;
        }

        public int getAdaptiveWidth() {
            return this.f4517b;
        }

        public int getInlineMaximumHeight() {
            return this.f4518c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f4516a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i4) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i4 + ")");
            this.f4517b = i4;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i4) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i4 + ")");
            this.f4518c = i4;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration.Builder{adaptiveType=");
            sb2.append(this.f4516a);
            sb2.append(", adaptiveWidth=");
            sb2.append(this.f4517b);
            sb2.append(", inlineMaximumHeight=");
            return r5.c.j(this.f4518c, "}", sb2);
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f4513a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f4514b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f4515c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration{adaptiveType=");
        sb2.append(this.f4513a);
        sb2.append(", adaptiveWidth=");
        sb2.append(this.f4514b);
        sb2.append(", inlineMaximumHeight=");
        return r5.c.j(this.f4515c, "}", sb2);
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f4513a = builderImpl.f4516a;
        this.f4514b = builderImpl.f4517b;
        this.f4515c = builderImpl.f4518c;
    }
}
