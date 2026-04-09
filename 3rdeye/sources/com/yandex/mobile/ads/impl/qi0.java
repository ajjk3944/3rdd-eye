package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qi0 {

    /* renamed from: a, reason: collision with root package name */
    private final hj0 f32227a;

    /* renamed from: b, reason: collision with root package name */
    private final gj0 f32228b;

    public /* synthetic */ qi0(Context context, hj0 hj0Var) {
        this(context, hj0Var, new gj0(context));
    }

    public final jj0 a(Map<String, Bitmap> imageValues, MediatedNativeAdImage mediatedNativeAdImage) {
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        if (mediatedNativeAdImage != null) {
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            this.f32227a.getClass();
            if (width > 0 && height > 0) {
                return new jj0(width, height, url, this.f32228b.a(width, height), 112);
            }
            Bitmap bitmap = imageValues.get(url);
            if (bitmap != null) {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                return new jj0(width2, height2, url, this.f32228b.a(width2, height2), 112);
            }
        }
        return null;
    }

    public qi0(Context context, hj0 imageSizeValidator, gj0 imageSizeTypeProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(imageSizeValidator, "imageSizeValidator");
        kotlin.jvm.internal.l.f(imageSizeTypeProvider, "imageSizeTypeProvider");
        this.f32227a = imageSizeValidator;
        this.f32228b = imageSizeTypeProvider;
    }
}
