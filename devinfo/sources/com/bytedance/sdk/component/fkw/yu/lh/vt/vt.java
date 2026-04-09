package com.bytedance.sdk.component.fkw.yu.lh.vt;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static final ImageView.ScaleType ouw = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config vt = Bitmap.Config.ARGB_4444;
    private int fkw;

    /* renamed from: le, reason: collision with root package name */
    private final int f7517le;

    /* renamed from: lh, reason: collision with root package name */
    private final Bitmap.Config f7518lh;
    private final ImageView.ScaleType pno;
    private final int ra;
    private int yu;
    private final int bly = 1280;
    private final int tlj = 83886080;

    public vt(int i4, int i10, ImageView.ScaleType scaleType, Bitmap.Config config, int i11, int i12) {
        this.f7518lh = config;
        this.yu = i4;
        this.fkw = i10;
        this.pno = scaleType;
        this.f7517le = i11;
        this.ra = i12;
        if (i4 > 1280 && i10 > 1280) {
            if (i4 > i10) {
                this.yu = 1280;
                this.fkw = (i10 * 1280) / i4;
                return;
            } else {
                this.yu = (i4 * 1280) / i10;
                this.fkw = 1280;
                return;
            }
        }
        if (i4 > 1280) {
            this.yu = 1280;
            this.fkw = (i10 * 1280) / i4;
        } else if (i10 > 1280) {
            this.yu = (i4 * 1280) / i10;
            this.fkw = 1280;
        }
    }

    private static int ouw(int i4, int i10, int i11, int i12) {
        if (i4 == 0 && i10 == 0) {
            return i11;
        }
        if (i4 == 0) {
            return (int) (i11 * (i10 / i12));
        }
        if (i10 == 0) {
            return i4;
        }
        double d10 = i12 / i11;
        double d11 = i10;
        return ((double) i4) * d10 > d11 ? (int) (d11 / d10) : i4;
    }

    private static int ouw(int i4, int i10, int i11, int i12, int i13, int i14) {
        double dMin = Math.min(i4 / i11, i10 / i12);
        if (i13 > 0 && i14 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i4, i10) / Math.max(i13, i14), Math.min(i4, i10) / Math.min(i13, i14)));
        }
        return Integer.highestOneBit((int) dMin);
    }

    public final Bitmap ouw(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.yu == 0 && this.fkw == 0) {
            options.inPreferredConfig = this.f7518lh;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i4 = options.outWidth;
            int i10 = options.outHeight;
            int iOuw = ouw(this.yu, this.fkw, i4, i10);
            int iOuw2 = ouw(this.fkw, this.yu, i10, i4);
            options.inJustDecodeBounds = false;
            options.inSampleSize = ouw(i4, i10, iOuw, iOuw2, this.f7517le, this.ra);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iOuw || bitmapDecodeByteArray.getHeight() > iOuw2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iOuw, iOuw2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }
}
