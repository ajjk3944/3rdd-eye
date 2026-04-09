package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class wm {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35018a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wm(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, applicationContext);
    }

    public final Bitmap a(jj0 imageValue) {
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        b82 b82VarC = yc1.f35708c.a(this.f35018a).c();
        String strF = imageValue.f();
        Bitmap bitmapA = b82VarC.a(strF);
        if (bitmapA == null || bitmapA.getWidth() != 1 || bitmapA.getHeight() != 1) {
            return bitmapA;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, imageValue.g(), imageValue.a(), false);
        kotlin.jvm.internal.l.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        b82VarC.a(strF, bitmapCreateScaledBitmap);
        return bitmapCreateScaledBitmap;
    }

    public wm(Context context, Context appContext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        this.f35018a = appContext;
    }
}
