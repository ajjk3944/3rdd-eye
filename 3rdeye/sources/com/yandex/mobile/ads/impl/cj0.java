package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import b9.m;

/* loaded from: classes3.dex */
public final class cj0 {

    /* renamed from: a, reason: collision with root package name */
    private final vk1 f25668a;

    /* renamed from: b, reason: collision with root package name */
    private final wk1 f25669b;

    /* renamed from: c, reason: collision with root package name */
    private final sl f25670c;

    public /* synthetic */ cj0() {
        this(new vk1(), new wk1(), new sl());
    }

    public final Bitmap a(jj0 imageValue) {
        Object objA;
        Bitmap bitmap;
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        String strC = imageValue.c();
        if (strC == null) {
            return null;
        }
        this.f25668a.getClass();
        Bitmap bitmapA = vk1.a(strC);
        if (bitmapA != null) {
            try {
                objA = this.f25669b.a(bitmapA, imageValue);
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (objA instanceof m.a) {
                objA = null;
            }
            bitmap = (Bitmap) objA;
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        this.f25670c.getClass();
        return sl.a(bitmap, 1.0d);
    }

    public cj0(vk1 previewBitmapCreator, wk1 previewBitmapScaler, sl blurredBitmapProvider) {
        kotlin.jvm.internal.l.f(previewBitmapCreator, "previewBitmapCreator");
        kotlin.jvm.internal.l.f(previewBitmapScaler, "previewBitmapScaler");
        kotlin.jvm.internal.l.f(blurredBitmapProvider, "blurredBitmapProvider");
        this.f25668a = previewBitmapCreator;
        this.f25669b = previewBitmapScaler;
        this.f25670c = blurredBitmapProvider;
    }
}
