package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.yandex.mobile.ads.impl.yc1;

/* loaded from: classes3.dex */
public final class yy1 extends aj0 {

    /* renamed from: g, reason: collision with root package name */
    private final si0 f36114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy1(cq1 queue, yc1.b imageCache, si0 imageCacheKeyGenerator) {
        super(queue, imageCache);
        kotlin.jvm.internal.l.f(queue, "queue");
        kotlin.jvm.internal.l.f(imageCache, "imageCache");
        kotlin.jvm.internal.l.f(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.f36114g = imageCacheKeyGenerator;
    }

    @Override // com.yandex.mobile.ads.impl.aj0
    public final String a(String url, int i, int i10, ImageView.ScaleType scaleType) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(scaleType, "scaleType");
        this.f36114g.getClass();
        return si0.b(url, scaleType);
    }
}
