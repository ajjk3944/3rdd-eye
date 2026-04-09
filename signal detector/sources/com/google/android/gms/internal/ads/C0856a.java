package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13006a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f13007b;

    /* renamed from: c, reason: collision with root package name */
    public final C1241h2[] f13008c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f13009d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f13010e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f13011f;

    /* renamed from: g, reason: collision with root package name */
    public final P6[] f13012g;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public C0856a(int i, int[] iArr, C1241h2[] c1241h2Arr, long[] jArr, String[] strArr, P6[] p6Arr) {
        Uri uri;
        int length = iArr.length;
        int length2 = c1241h2Arr.length;
        int i3 = 0;
        AbstractC0582Jp.m(length == length2);
        AbstractC0582Jp.m(length == p6Arr.length);
        this.f13006a = i;
        this.f13009d = iArr;
        this.f13008c = c1241h2Arr;
        this.f13010e = jArr;
        this.f13007b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f13007b;
            if (i3 >= uriArr.length) {
                this.f13011f = strArr;
                this.f13012g = p6Arr;
                return;
            }
            C1241h2 c1241h2 = c1241h2Arr[i3];
            if (c1241h2 == null) {
                uri = null;
            } else {
                N0 n02 = c1241h2.f14415b;
                n02.getClass();
                uri = n02.f9935a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0856a.class == obj.getClass()) {
            C0856a c0856a = (C0856a) obj;
            if (this.f13006a == c0856a.f13006a && Arrays.equals(this.f13008c, c0856a.f13008c) && Arrays.equals(this.f13009d, c0856a.f13009d) && Arrays.equals(this.f13010e, c0856a.f13010e) && Arrays.equals(this.f13011f, c0856a.f13011f) && Arrays.equals(this.f13012g, c0856a.f13012g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f13012g) + ((((Arrays.hashCode(this.f13010e) + ((Arrays.hashCode(this.f13009d) + ((Arrays.hashCode(this.f13008c) + (((this.f13006a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f13011f)) * 31)) * 31;
    }
}
