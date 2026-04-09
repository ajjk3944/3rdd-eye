package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t7 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16721b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16722c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f16723d;

    /* renamed from: e, reason: collision with root package name */
    public int f16724e;

    /* renamed from: f, reason: collision with root package name */
    public int f16725f;
    public Rect g;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16720a = new int[4];

    /* renamed from: h, reason: collision with root package name */
    public int f16726h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f16727i = -1;

    public static int a(int i4, int i10) {
        return (i4 & 16777215) | ((i10 * 17) << 24);
    }

    public final void b(hk0 hk0Var, boolean z3, Rect rect, int[] iArr) {
        int i4;
        int i10;
        int i11 = !z3 ? 1 : 0;
        int iWidth = rect.width();
        int i12 = i11 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i13 = 0;
            do {
                int iH = 0;
                for (int i14 = 1; iH < i14 && i14 <= 64; i14 <<= 2) {
                    if (hk0Var.b() < 4) {
                        i4 = -1;
                        i10 = 0;
                        break;
                    }
                    iH = (iH << 4) | hk0Var.h(4);
                }
                i4 = iH & 3;
                i10 = iH < 4 ? iWidth : iH >> 2;
                int iMin = Math.min(i10, iWidth - i13);
                if (iMin > 0) {
                    int i15 = i12 + iMin;
                    Arrays.fill(iArr, i12, i15, this.f16720a[i4]);
                    i13 += iMin;
                    i12 = i15;
                }
            } while (i13 < iWidth);
            i11 += 2;
            if (i11 >= iHeight) {
                return;
            }
            i12 = i11 * iWidth;
            hk0Var.k();
        }
    }
}
