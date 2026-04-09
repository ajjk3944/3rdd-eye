package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import c9.C2099t;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.yandex.mobile.ads.impl.a8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w41 {

    /* renamed from: a, reason: collision with root package name */
    private final c41 f34803a;

    public /* synthetic */ w41(Context context) {
        this(context, new c41(context));
    }

    public final a8<p61> a(MediatedNativeAd mediatedNativeAd, Map<String, Bitmap> imageValues, ar1 responseNativeType) {
        kotlin.jvm.internal.l.f(mediatedNativeAd, "mediatedNativeAd");
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        List<ag<? extends Object>> listA = this.f34803a.a(mediatedNativeAd.getMediatedNativeAdAssets(), imageValues);
        C2099t c2099t = C2099t.f18581b;
        return new a8.a().a((a8.a) new p61(E.u.G(new w31(responseNativeType, listA, null, null, null, null, null, null, c2099t, c2099t, null)), c2099t, c2099t, null, new HashMap(), c2099t, c2099t, null, null, null)).a();
    }

    public w41(Context context, c41 nativeAdAssetsConverter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdAssetsConverter, "nativeAdAssetsConverter");
        this.f34803a = nativeAdAssetsConverter;
    }
}
