package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* loaded from: classes3.dex */
public final class wk1 {

    /* renamed from: a, reason: collision with root package name */
    private final uk f35004a;

    public /* synthetic */ wk1() {
        this(new uk());
    }

    public final Bitmap a(Bitmap bitmap, jj0 imageValue) {
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || imageValue.g() == 0 || imageValue.a() == 0) {
            return bitmap;
        }
        if (imageValue.a() * bitmap.getWidth() == bitmap.getHeight() * imageValue.g()) {
            return bitmap;
        }
        this.f35004a.getClass();
        uy1 uy1Var = new uy1(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && imageValue.g() != 0 && imageValue.a() != 0) {
            v9.f it = new v9.g(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (imageValue.g() * 100) / imageValue.a())), 1).iterator();
            double d10 = 1.0d;
            while (true) {
                if (!it.f47101d) {
                    break;
                }
                int iA = it.a();
                if ((imageValue.a() * iA) % imageValue.g() == 0) {
                    uy1Var = new uy1(iA, (imageValue.a() * iA) / imageValue.g());
                    break;
                }
                double dA = (imageValue.a() * iA) / imageValue.g();
                int iX = com.google.gson.internal.c.x(dA);
                double dAbs = Math.abs(iX - dA) / dA;
                if (dAbs < d10) {
                    uy1Var = new uy1(iA, iX);
                    d10 = dAbs;
                }
            }
        }
        uy1 uy1Var2 = new uy1(bitmap.getWidth(), bitmap.getHeight());
        uy1 uy1Var3 = new uy1(uy1Var.b(), (uy1Var2.a() * uy1Var.b()) / uy1Var2.b());
        uy1 uy1Var4 = new uy1((uy1Var2.b() * uy1Var.a()) / uy1Var2.a(), uy1Var.a());
        if (uy1Var3.compareTo(uy1Var4) < 0) {
            uy1Var3 = uy1Var4;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, uy1Var3.b(), uy1Var3.a(), false);
        kotlin.jvm.internal.l.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (bitmapCreateScaledBitmap.getWidth() - uy1Var.b()) / 2, (bitmapCreateScaledBitmap.getHeight() - uy1Var.a()) / 2, uy1Var.b(), uy1Var.a(), (Matrix) null, false);
        kotlin.jvm.internal.l.e(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public wk1(uk bestSizeForScalePreviewCalculator) {
        kotlin.jvm.internal.l.f(bestSizeForScalePreviewCalculator, "bestSizeForScalePreviewCalculator");
        this.f35004a = bestSizeForScalePreviewCalculator;
    }
}
