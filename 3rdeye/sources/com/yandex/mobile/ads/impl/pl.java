package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class pl implements nl<BitmapDrawable> {
    @Override // com.yandex.mobile.ads.impl.nl
    public final boolean a(Drawable drawable, Bitmap bitmap) {
        BitmapDrawable drawable2 = (BitmapDrawable) drawable;
        kotlin.jvm.internal.l.f(drawable2, "drawable");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        return bitmap.equals(drawable2.getBitmap());
    }
}
