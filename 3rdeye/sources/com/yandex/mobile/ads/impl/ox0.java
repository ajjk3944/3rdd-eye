package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ox0 {

    /* renamed from: a, reason: collision with root package name */
    private final wi0 f31513a;

    /* renamed from: b, reason: collision with root package name */
    private final by0 f31514b;

    /* renamed from: c, reason: collision with root package name */
    private final w41 f31515c;

    public interface a {
        void a(a8<p61> a8Var);
    }

    public static final class b implements sj0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediatedNativeAd f31517b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ar1 f31518c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f31519d;

        public b(MediatedNativeAd mediatedNativeAd, ar1 ar1Var, a aVar) {
            this.f31517b = mediatedNativeAd;
            this.f31518c = ar1Var;
            this.f31519d = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.sj0
        public final void a(String url, Bitmap bitmap) {
            kotlin.jvm.internal.l.f(url, "url");
            kotlin.jvm.internal.l.f(bitmap, "bitmap");
        }

        @Override // com.yandex.mobile.ads.impl.sj0
        public final void a(Map<String, Bitmap> images) {
            kotlin.jvm.internal.l.f(images, "images");
            ox0.a(ox0.this, this.f31517b, images, this.f31518c, this.f31519d);
        }
    }

    public /* synthetic */ ox0(Context context, wi0 wi0Var, by0 by0Var) {
        this(context, wi0Var, by0Var, new w41(context));
    }

    public static final void a(ox0 ox0Var, MediatedNativeAd mediatedNativeAd, Map map, ar1 ar1Var, a aVar) {
        aVar.a(ox0Var.f31515c.a(mediatedNativeAd, map, ar1Var));
    }

    public ox0(Context context, wi0 imageLoadManager, by0 mediatedImagesDataExtractor, w41 nativeAdConverter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(imageLoadManager, "imageLoadManager");
        kotlin.jvm.internal.l.f(mediatedImagesDataExtractor, "mediatedImagesDataExtractor");
        kotlin.jvm.internal.l.f(nativeAdConverter, "nativeAdConverter");
        this.f31513a = imageLoadManager;
        this.f31514b = mediatedImagesDataExtractor;
        this.f31515c = nativeAdConverter;
    }

    public final void a(MediatedNativeAd mediatedNativeAd, ar1 responseNativeType, List<MediatedNativeAdImage> mediatedImages, a listener) {
        kotlin.jvm.internal.l.f(mediatedNativeAd, "mediatedNativeAd");
        kotlin.jvm.internal.l.f(responseNativeType, "responseNativeType");
        kotlin.jvm.internal.l.f(mediatedImages, "mediatedImages");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31513a.a(this.f31514b.a(mediatedImages), new b(mediatedNativeAd, responseNativeType, listener));
    }
}
