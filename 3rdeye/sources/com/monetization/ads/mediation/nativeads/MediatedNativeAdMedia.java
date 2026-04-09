package com.monetization.ads.mediation.nativeads;

import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class MediatedNativeAdMedia {

    /* renamed from: a, reason: collision with root package name */
    private final float f23762a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final float f23763a;

        public Builder(float f10) {
            this.f23763a = f10;
        }

        public final MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this.f23763a, null);
        }

        public final float getAspectRatio() {
            return this.f23763a;
        }
    }

    public /* synthetic */ MediatedNativeAdMedia(float f10, g gVar) {
        this(f10);
    }

    public final float getAspectRatio() {
        return this.f23762a;
    }

    private MediatedNativeAdMedia(float f10) {
        this.f23762a = f10;
    }
}
