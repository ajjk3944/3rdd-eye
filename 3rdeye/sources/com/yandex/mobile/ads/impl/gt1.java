package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class gt1 {

    /* renamed from: a, reason: collision with root package name */
    private final ql f27984a;

    public /* synthetic */ gt1() {
        this(new ql());
    }

    public final Bitmap a(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        kotlin.jvm.internal.l.f(drawable, "drawable");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            ql qlVar = this.f27984a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            qlVar.getClass();
            kotlin.jvm.internal.l.f(config, "config");
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, config);
            kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(...)");
        } else {
            ql qlVar2 = this.f27984a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            qlVar2.getClass();
            kotlin.jvm.internal.l.f(config2, "config");
            bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
            kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(...)");
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public gt1(ql bitmapProvider) {
        kotlin.jvm.internal.l.f(bitmapProvider, "bitmapProvider");
        this.f27984a = bitmapProvider;
    }
}
