package com.bytedance.sdk.component.fkw.lh.vt;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static final ImageView.ScaleType ouw = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config vt = Bitmap.Config.ARGB_4444;
    public int fkw;

    /* renamed from: le, reason: collision with root package name */
    public final int f7483le;

    /* renamed from: lh, reason: collision with root package name */
    public final Bitmap.Config f7484lh;
    public final ImageView.ScaleType pno;
    public final int ra;
    public int yu;
    private final int bly = 3840;
    private final int tlj = 104857600;

    public ouw(int i4, int i10, ImageView.ScaleType scaleType, Bitmap.Config config, int i11, int i12) {
        this.f7484lh = config;
        this.yu = i4;
        this.fkw = i10;
        this.pno = scaleType;
        this.f7483le = i11;
        this.ra = i12;
        if (i4 > 3840 && i10 > 3840) {
            if (i4 > i10) {
                this.yu = 3840;
                this.fkw = (i10 * 3840) / i4;
                return;
            } else {
                this.yu = (i4 * 3840) / i10;
                this.fkw = 3840;
                return;
            }
        }
        if (i4 > 3840) {
            this.yu = 3840;
            this.fkw = (i10 * 3840) / i4;
        } else if (i10 > 3840) {
            this.yu = (i4 * 3840) / i10;
            this.fkw = 3840;
        }
    }

    public static int ouw(int i4, int i10, int i11, int i12, int i13, int i14) {
        double dMin = Math.min(i4 / i11, i10 / i12);
        if (i13 > 0 && i14 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i4, i10) / Math.max(i13, i14), Math.min(i4, i10) / Math.min(i13, i14)));
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

    public static int ouw(int i4, int i10, int i11, int i12, ImageView.ScaleType scaleType) {
        if (i4 != 0 || i10 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i4 == 0) {
                    return (int) (i11 * (i10 / i12));
                }
                if (i10 == 0) {
                    return i4;
                }
                double d10 = i12 / i11;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i10;
                    return ((double) i4) * d10 < d11 ? (int) (d11 / d10) : i4;
                }
                double d12 = i10;
                return ((double) i4) * d10 > d12 ? (int) (d12 / d10) : i4;
            }
            if (i4 != 0) {
                return i4;
            }
        }
        return i11;
    }
}
