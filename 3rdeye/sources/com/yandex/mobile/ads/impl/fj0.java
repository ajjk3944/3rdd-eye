package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.rq1;

/* loaded from: classes3.dex */
public final class fj0 extends op1<Bitmap> {

    /* renamed from: y, reason: collision with root package name */
    private static final Object f27348y = new Object();

    /* renamed from: s, reason: collision with root package name */
    private final Object f27349s;

    /* renamed from: t, reason: collision with root package name */
    private rq1.b<Bitmap> f27350t;

    /* renamed from: u, reason: collision with root package name */
    private final Bitmap.Config f27351u;

    /* renamed from: v, reason: collision with root package name */
    private final int f27352v;

    /* renamed from: w, reason: collision with root package name */
    private final int f27353w;

    /* renamed from: x, reason: collision with root package name */
    private final ImageView.ScaleType f27354x;

    public fj0(String str, rq1.b<Bitmap> bVar, int i, int i10, ImageView.ScaleType scaleType, Bitmap.Config config, rq1.a aVar) {
        super(0, str, aVar);
        this.f27349s = new Object();
        a(new h00(2.0f, 1000, 2));
        this.f27350t = bVar;
        this.f27351u = config;
        this.f27352v = i;
        this.f27353w = i10;
        this.f27354x = scaleType;
    }

    private rq1<Bitmap> b(nc1 nc1Var) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = nc1Var.f30836b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f27352v == 0 && this.f27353w == 0) {
            options.inPreferredConfig = this.f27351u;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i10 = options.outHeight;
            int iA = a(this.f27352v, this.f27353w, i, i10, this.f27354x);
            int iA2 = a(this.f27353w, this.f27352v, i10, i, this.f27354x);
            options.inJustDecodeBounds = false;
            float f10 = 1.0f;
            while (true) {
                float f11 = 2.0f * f10;
                if (f11 > Math.min(i / iA, i10 / iA2)) {
                    break;
                }
                f10 = f11;
            }
            options.inSampleSize = (int) f10;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iA || bitmapDecodeByteArray.getHeight() > iA2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iA, iA2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? rq1.a(new xf1(nc1Var)) : rq1.a(bitmapDecodeByteArray, hh0.a(nc1Var));
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final void a() {
        super.a();
        synchronized (this.f27349s) {
            this.f27350t = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final int g() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final void a(Bitmap bitmap) {
        rq1.b<Bitmap> bVar;
        Bitmap bitmap2 = bitmap;
        synchronized (this.f27349s) {
            bVar = this.f27350t;
        }
        if (bVar != null) {
            bVar.a(bitmap2);
        }
    }

    private static int a(int i, int i10, int i11, int i12, ImageView.ScaleType scaleType) {
        if (i != 0 || i10 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) (i11 * (i10 / i12));
                }
                if (i10 == 0) {
                    return i;
                }
                double d10 = i12 / i11;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i10;
                    return ((double) i) * d10 < d11 ? (int) (d11 / d10) : i;
                }
                double d12 = i10;
                return ((double) i) * d10 > d12 ? (int) (d12 / d10) : i;
            }
            if (i != 0) {
                return i;
            }
        }
        return i11;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final rq1<Bitmap> a(nc1 nc1Var) {
        rq1<Bitmap> rq1VarB;
        synchronized (f27348y) {
            try {
                try {
                    rq1VarB = b(nc1Var);
                } catch (OutOfMemoryError e4) {
                    Object[] objArr = {Integer.valueOf(nc1Var.f30836b.length), l()};
                    boolean z10 = gi2.f27765a;
                    fp0.b(objArr);
                    return rq1.a(new xf1(e4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rq1VarB;
    }
}
