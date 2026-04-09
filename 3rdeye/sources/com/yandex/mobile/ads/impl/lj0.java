package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lj0 {
    public static boolean a(jj0 imageValue, Map images) {
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        kotlin.jvm.internal.l.f(images, "images");
        Bitmap bitmap = (Bitmap) images.get(imageValue.f());
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !imageValue.b();
    }
}
