package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class by0 {

    /* renamed from: a, reason: collision with root package name */
    private final z30 f25461a;

    /* renamed from: b, reason: collision with root package name */
    private final hj0 f25462b;

    /* renamed from: c, reason: collision with root package name */
    private final Point f25463c;

    public /* synthetic */ by0(Context context) {
        this(context, new z30(), new hj0());
    }

    public final LinkedHashSet a(List images) {
        kotlin.jvm.internal.l.f(images, "images");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = images.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            if (url.length() > 0) {
                this.f25462b.getClass();
                if (width <= 0 || height <= 0) {
                    Point point = this.f25463c;
                    linkedHashSet.add(new jj0(point.x, point.y, url, null, 120));
                }
            }
        }
        return linkedHashSet;
    }

    public final LinkedHashMap b(List nativeAdImages) {
        kotlin.jvm.internal.l.f(nativeAdImages, "nativeAdImages");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = nativeAdImages.iterator();
        while (it.hasNext()) {
            MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
            Drawable drawable = mediatedNativeAdImage.getDrawable();
            String url = mediatedNativeAdImage.getUrl();
            if (drawable != null && url.length() > 0) {
                this.f25461a.getClass();
                Bitmap bitmapA = z30.a(drawable);
                if (bitmapA != null) {
                    linkedHashMap.put(url, bitmapA);
                }
            }
        }
        return linkedHashMap;
    }

    public by0(Context context, z30 drawableConverter, hj0 imageSizeValidator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(drawableConverter, "drawableConverter");
        kotlin.jvm.internal.l.f(imageSizeValidator, "imageSizeValidator");
        this.f25461a = drawableConverter;
        this.f25462b = imageSizeValidator;
        this.f25463c = ch1.b(context);
    }
}
