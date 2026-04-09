package com.bytedance.sdk.component.bw.xq.ypw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class emc {
    public static final ImageView.ScaleType emc = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config ypw = Bitmap.Config.ARGB_4444;
    private int bw;
    private int dg;
    private final ImageView.ScaleType msw;
    private final int uym;
    private final Bitmap.Config xq;
    private final int ycc;
    private final int zz = 3840;
    private final int ru = 104857600;

    public emc(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.xq = config;
        this.dg = i10;
        this.bw = i11;
        this.msw = scaleType;
        this.ycc = i12;
        this.uym = i13;
        emc(i10, i11);
    }

    public static int emc(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(i10 / i12, i11 / i13);
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i10, i11) / Math.max(i14, i15), Math.min(i10, i11) / Math.min(i14, i15)));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int emc(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (i12 * (i11 / i13));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = i13 / i12;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    public Bitmap emc(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.dg == 0 && this.bw == 0) {
            options.inPreferredConfig = this.xq;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iEmc = emc(this.dg, this.bw, i10, i11, this.msw);
            int iEmc2 = emc(this.bw, this.dg, i11, i10, this.msw);
            options.inJustDecodeBounds = false;
            options.inSampleSize = emc(i10, i11, iEmc, iEmc2, this.ycc, this.uym);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iEmc || bitmapDecodeByteArray.getHeight() > iEmc2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iEmc, iEmc2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
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

    private void emc(int i10, int i11) {
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.dg = 3840;
                this.bw = (i11 * 3840) / i10;
                return;
            } else {
                this.dg = (i10 * 3840) / i11;
                this.bw = 3840;
                return;
            }
        }
        if (i10 > 3840) {
            this.dg = 3840;
            this.bw = (i11 * 3840) / i10;
        } else if (i11 > 3840) {
            this.dg = (i10 * 3840) / i11;
            this.bw = 3840;
        }
    }
}
