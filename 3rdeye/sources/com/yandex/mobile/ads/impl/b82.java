package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.yc1;

/* loaded from: classes3.dex */
public final class b82 implements yc1.c {

    /* renamed from: a, reason: collision with root package name */
    private final LruCache<String, Bitmap> f25133a;

    /* renamed from: b, reason: collision with root package name */
    private final si0 f25134b;

    public b82(zc1 bitmapLruCache, si0 imageCacheKeyGenerator) {
        kotlin.jvm.internal.l.f(bitmapLruCache, "bitmapLruCache");
        kotlin.jvm.internal.l.f(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.f25133a = bitmapLruCache;
        this.f25134b = imageCacheKeyGenerator;
    }

    public final Bitmap a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        this.f25134b.getClass();
        return this.f25133a.get(si0.a(url));
    }

    @Override // com.yandex.mobile.ads.impl.yc1.c
    public final void a(String url, Bitmap bitmap) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        this.f25134b.getClass();
        this.f25133a.put(si0.a(url), bitmap);
    }
}
