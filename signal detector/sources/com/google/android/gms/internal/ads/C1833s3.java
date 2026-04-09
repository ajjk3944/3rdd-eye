package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1833s3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16664b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16665c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f16666d;

    /* renamed from: e, reason: collision with root package name */
    public int f16667e;

    /* renamed from: f, reason: collision with root package name */
    public int f16668f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f16669g;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16663a = new int[4];

    /* renamed from: h, reason: collision with root package name */
    public int f16670h = -1;
    public int i = -1;

    public static int a(int i, int i3) {
        return (i & 16777215) | ((i3 * 17) << 24);
    }

    public final void b(C1443kr c1443kr, boolean z6, Rect rect, int[] iArr) {
        int i;
        int i3;
        int i6 = !z6 ? 1 : 0;
        int iWidth = rect.width();
        int i7 = i6 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i8 = 0;
            do {
                int iH = 0;
                for (int i9 = 1; iH < i9 && i9 <= 64; i9 <<= 2) {
                    if (c1443kr.b() < 4) {
                        i = -1;
                        i3 = 0;
                        break;
                    }
                    iH = (iH << 4) | c1443kr.h(4);
                }
                i = iH & 3;
                i3 = iH < 4 ? iWidth : iH >> 2;
                int iMin = Math.min(i3, iWidth - i8);
                if (iMin > 0) {
                    int i10 = i7 + iMin;
                    Arrays.fill(iArr, i7, i10, this.f16663a[i]);
                    i8 += iMin;
                    i7 = i10;
                }
            } while (i8 < iWidth);
            i6 += 2;
            if (i6 >= iHeight) {
                return;
            }
            i7 = i6 * iWidth;
            c1443kr.k();
        }
    }
}
