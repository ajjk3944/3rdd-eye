package com.applovin.mediation;

import com.applovin.impl.mediation.MaxAdViewConfigurationImpl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class MaxAdViewConfiguration {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum AdaptiveType {
        NONE("none"),
        ANCHORED("anchored"),
        INLINE("inline");


        /* renamed from: a, reason: collision with root package name */
        private final String f6352a;

        AdaptiveType(String str) {
            this.f6352a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f6352a;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface Builder {
        MaxAdViewConfiguration build();

        Builder setAdaptiveType(AdaptiveType adaptiveType);

        Builder setAdaptiveWidth(int i4);

        Builder setInlineMaximumHeight(int i4);
    }

    public static Builder builder() {
        return new MaxAdViewConfigurationImpl.BuilderImpl();
    }

    public abstract AdaptiveType getAdaptiveType();

    public abstract int getAdaptiveWidth();

    public abstract int getInlineMaximumHeight();
}
