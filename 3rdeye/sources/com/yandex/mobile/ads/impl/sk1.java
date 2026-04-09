package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sk1 implements ej0 {

    /* renamed from: a, reason: collision with root package name */
    private final wm f33100a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f33101b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f33102c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f33103a;

        /* renamed from: b, reason: collision with root package name */
        private final uy1 f33104b;

        public a(String base64, uy1 size) {
            kotlin.jvm.internal.l.f(base64, "base64");
            kotlin.jvm.internal.l.f(size, "size");
            this.f33103a = base64;
            this.f33104b = size;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f33103a, aVar.f33103a) && kotlin.jvm.internal.l.b(this.f33104b, aVar.f33104b);
        }

        public final int hashCode() {
            return this.f33104b.hashCode() + (this.f33103a.hashCode() * 31);
        }

        public final String toString() {
            return "Preview(base64=" + this.f33103a + ", size=" + this.f33104b + ")";
        }
    }

    public /* synthetic */ sk1(Context context) {
        this(context, new wm(context));
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public final void a(String key, Bitmap value) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(value, "value");
        this.f33101b.put(key, value);
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public final Bitmap b(jj0 imageValue) {
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        String strF = imageValue.f();
        Bitmap bitmap = (Bitmap) this.f33101b.get(strF);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmapA = this.f33100a.a(imageValue);
        if (bitmapA == null) {
            return null;
        }
        this.f33101b.put(strF, bitmapA);
        return bitmapA;
    }

    public sk1(Context context, wm cacheImageProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(cacheImageProvider, "cacheImageProvider");
        this.f33100a = cacheImageProvider;
        this.f33101b = new LinkedHashMap();
        this.f33102c = new LinkedHashMap();
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public final void a(Map<String, Bitmap> images) {
        kotlin.jvm.internal.l.f(images, "images");
        this.f33101b.putAll(images);
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public final void a(Bitmap value, jj0 key) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(value, "value");
        String strC = key.c();
        a aVar = strC != null ? new a(strC, new uy1(key.g(), key.a())) : null;
        if (aVar != null) {
            this.f33102c.put(aVar, value);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ej0
    public final Bitmap a(jj0 imageValue) {
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        String strC = imageValue.c();
        a aVar = strC != null ? new a(strC, new uy1(imageValue.g(), imageValue.a())) : null;
        if (aVar != null) {
            return (Bitmap) this.f33102c.get(aVar);
        }
        return null;
    }
}
