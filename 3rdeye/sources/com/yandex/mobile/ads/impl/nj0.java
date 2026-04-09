package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class nj0 {

    /* renamed from: a, reason: collision with root package name */
    private final ej0 f30892a;

    /* renamed from: b, reason: collision with root package name */
    private final ol f30893b;

    public /* synthetic */ nj0(ej0 ej0Var) {
        this(ej0Var, new ol());
    }

    public final boolean a(Drawable drawable, jj0 imageValue) {
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        Bitmap bitmapB = this.f30892a.b(imageValue);
        if (bitmapB == null) {
            bitmapB = this.f30892a.a(imageValue);
        }
        if (drawable == null || bitmapB == null) {
            return false;
        }
        this.f30893b.getClass();
        return (drawable instanceof BitmapDrawable ? new pl() : new y30(new gt1(), new ql())).a(drawable, bitmapB);
    }

    public nj0(ej0 imageProvider, ol bitmapComparatorFactory) {
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(bitmapComparatorFactory, "bitmapComparatorFactory");
        this.f30892a = imageProvider;
        this.f30893b = bitmapComparatorFactory;
    }
}
