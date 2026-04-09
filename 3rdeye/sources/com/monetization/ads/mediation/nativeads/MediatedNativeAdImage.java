package com.monetization.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class MediatedNativeAdImage {

    /* renamed from: a, reason: collision with root package name */
    private final int f23754a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23755b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23756c;

    /* renamed from: d, reason: collision with root package name */
    private final Drawable f23757d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f23758a;

        /* renamed from: b, reason: collision with root package name */
        private int f23759b;

        /* renamed from: c, reason: collision with root package name */
        private int f23760c;

        /* renamed from: d, reason: collision with root package name */
        private Drawable f23761d;

        public Builder(String url) {
            l.f(url, "url");
            this.f23758a = url;
        }

        public final MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this.f23759b, this.f23760c, this.f23758a, this.f23761d, null);
        }

        public final String getUrl() {
            return this.f23758a;
        }

        public final Builder setDrawable(Drawable drawable) {
            this.f23761d = drawable;
            return this;
        }

        public final Builder setHeight(int i) {
            this.f23760c = i;
            return this;
        }

        public final Builder setWidth(int i) {
            this.f23759b = i;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdImage(int i, int i10, String str, Drawable drawable, g gVar) {
        this(i, i10, str, drawable);
    }

    public final Drawable getDrawable() {
        return this.f23757d;
    }

    public final int getHeight() {
        return this.f23755b;
    }

    public final String getUrl() {
        return this.f23756c;
    }

    public final int getWidth() {
        return this.f23754a;
    }

    private MediatedNativeAdImage(int i, int i10, String str, Drawable drawable) {
        this.f23754a = i;
        this.f23755b = i10;
        this.f23756c = str;
        this.f23757d = drawable;
    }
}
