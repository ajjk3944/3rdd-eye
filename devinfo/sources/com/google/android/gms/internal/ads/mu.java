package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mu {

    /* renamed from: b, reason: collision with root package name */
    public static final mu f14017b = new mu(new a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final a f14018c;

    /* renamed from: a, reason: collision with root package name */
    public final a[] f14019a;

    static {
        a aVar = new a(-1, new int[0], new h5[0], new long[0], new String[0], new xe[0]);
        int[] iArr = aVar.f9151d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f9152e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        h5[] h5VarArr = (h5[]) Arrays.copyOf(aVar.f9150c, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f9153f, 0);
        xe[] xeVarArr = aVar.g;
        f14018c = new a(0, iArrCopyOf, h5VarArr, jArrCopyOf, strArr, (xe[]) Arrays.copyOf(xeVarArr, Math.max(0, xeVarArr.length)));
        String str = bq0.f9768a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public mu(a[] aVarArr) {
        this.f14019a = aVarArr;
    }

    public final a a(int i4) {
        return i4 < 0 ? f14018c : this.f14019a[i4];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && mu.class == obj.getClass() && Arrays.equals(this.f14019a, ((mu) obj).f14019a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14019a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return je.u.t("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
