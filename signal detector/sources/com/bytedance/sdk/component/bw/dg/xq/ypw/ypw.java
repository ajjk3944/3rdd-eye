package com.bytedance.sdk.component.bw.dg.xq.ypw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class ypw {
    public static final ImageView.ScaleType emc = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config ypw = Bitmap.Config.ARGB_4444;
    private int bw;
    private int dg;
    private final ImageView.ScaleType msw;
    private final int uym;
    private final Bitmap.Config xq;
    private final int ycc;
    private final int zz = 1280;
    private final int ru = 83886080;

    public ypw(int i, int i3, ImageView.ScaleType scaleType, Bitmap.Config config, int i6, int i7) {
        this.xq = config;
        this.dg = i;
        this.bw = i3;
        this.msw = scaleType;
        this.ycc = i6;
        this.uym = i7;
        emc(i, i3);
    }

    private static int emc(int i, int i3, int i6, int i7) {
        if (i == 0 && i3 == 0) {
            return i6;
        }
        if (i == 0) {
            return (int) (i6 * (i3 / i7));
        }
        if (i3 == 0) {
            return i;
        }
        double d6 = i7 / i6;
        double d7 = i3;
        return ((double) i) * d6 > d7 ? (int) (d7 / d6) : i;
    }

    public static int emc(int i, int i3, int i6, int i7, int i8, int i9) {
        double dMin = Math.min(i / i6, i3 / i7);
        if (i8 > 0 && i9 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i, i3) / Math.max(i8, i9), Math.min(i, i3) / Math.min(i8, i9)));
        }
        return Integer.highestOneBit((int) dMin);
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
            int i = options.outWidth;
            int i3 = options.outHeight;
            int iEmc = emc(this.dg, this.bw, i, i3);
            int iEmc2 = emc(this.bw, this.dg, i3, i);
            options.inJustDecodeBounds = false;
            options.inSampleSize = emc(i, i3, iEmc, iEmc2, this.ycc, this.uym);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iEmc || bitmapDecodeByteArray.getHeight() > iEmc2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iEmc, iEmc2, true);
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

    private void emc(int i, int i3) {
        if (i > 1280 && i3 > 1280) {
            if (i > i3) {
                this.dg = 1280;
                this.bw = (i3 * 1280) / i;
                return;
            } else {
                this.dg = (i * 1280) / i3;
                this.bw = 1280;
                return;
            }
        }
        if (i > 1280) {
            this.dg = 1280;
            this.bw = (i3 * 1280) / i;
        } else if (i3 > 1280) {
            this.dg = (i * 1280) / i3;
            this.bw = 1280;
        }
    }
}
