package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import c9.C2092m;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdMedia;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ou0 {

    /* renamed from: a, reason: collision with root package name */
    private final qi0 f31501a;

    public ou0(qi0 imageAssetConverter) {
        kotlin.jvm.internal.l.f(imageAssetConverter, "imageAssetConverter");
        this.f31501a = imageAssetConverter;
    }

    public final sw0 a(Map<String, Bitmap> imageValues, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdMedia mediatedNativeAdMedia) {
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        ku0 ku0Var = mediatedNativeAdMedia != null ? new ku0(null, mediatedNativeAdMedia.getAspectRatio()) : null;
        jj0 jj0VarA = this.f31501a.a(imageValues, mediatedNativeAdImage);
        ArrayList arrayListX = jj0VarA != null ? C2092m.X(jj0VarA) : null;
        if (ku0Var == null && arrayListX == null) {
            return null;
        }
        return new sw0(ku0Var, null, arrayListX);
    }
}
