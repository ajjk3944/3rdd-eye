package com.bytedance.sdk.component.bw.dg.xq.ypw;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import org.xbill.DNS.SimpleResolver;

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
    private final int zz = SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE;
    private final int ru = 83886080;

    public ypw(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.xq = config;
        this.dg = i10;
        this.bw = i11;
        this.msw = scaleType;
        this.ycc = i12;
        this.uym = i13;
        emc(i10, i11);
    }

    private static int emc(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (i10 == 0) {
            return (int) (i12 * (i11 / i13));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = i13 / i12;
        double d11 = i11;
        return ((double) i10) * d10 > d11 ? (int) (d11 / d10) : i10;
    }

    public static int emc(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(i10 / i12, i11 / i13);
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i10, i11) / Math.max(i14, i15), Math.min(i10, i11) / Math.min(i14, i15)));
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
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iEmc = emc(this.dg, this.bw, i10, i11);
            int iEmc2 = emc(this.bw, this.dg, i11, i10);
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

    private void emc(int i10, int i11) {
        if (i10 > 1280 && i11 > 1280) {
            if (i10 > i11) {
                this.dg = SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE;
                this.bw = (i11 * SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE) / i10;
                return;
            } else {
                this.dg = (i10 * SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE) / i11;
                this.bw = SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE;
                return;
            }
        }
        if (i10 > 1280) {
            this.dg = SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE;
            this.bw = (i11 * SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE) / i10;
        } else if (i11 > 1280) {
            this.dg = (i10 * SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE) / i11;
            this.bw = SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE;
        }
    }
}
