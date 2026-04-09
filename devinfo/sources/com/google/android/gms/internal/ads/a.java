package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9148a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f9149b;

    /* renamed from: c, reason: collision with root package name */
    public final h5[] f9150c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f9151d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f9152e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f9153f;
    public final xe[] g;

    static {
        String str = bq0.f9768a;
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

    public a(int i4, int[] iArr, h5[] h5VarArr, long[] jArr, String[] strArr, xe[] xeVarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = h5VarArr.length;
        int i10 = 0;
        mq0.m(length == length2);
        mq0.m(length == xeVarArr.length);
        this.f9148a = i4;
        this.f9151d = iArr;
        this.f9150c = h5VarArr;
        this.f9152e = jArr;
        this.f9149b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f9149b;
            if (i10 >= uriArr.length) {
                this.f9153f = strArr;
                this.g = xeVarArr;
                return;
            }
            h5 h5Var = h5VarArr[i10];
            if (h5Var == null) {
                uri = null;
            } else {
                o2 o2Var = h5Var.f11706b;
                o2Var.getClass();
                uri = o2Var.f14513a;
            }
            uriArr[i10] = uri;
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9148a == aVar.f9148a && Arrays.equals(this.f9150c, aVar.f9150c) && Arrays.equals(this.f9151d, aVar.f9151d) && Arrays.equals(this.f9152e, aVar.f9152e) && Arrays.equals(this.f9153f, aVar.f9153f) && Arrays.equals(this.g, aVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.f9152e) + ((Arrays.hashCode(this.f9151d) + ((Arrays.hashCode(this.f9150c) + (((this.f9148a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f9153f)) * 31)) * 31;
    }
}
