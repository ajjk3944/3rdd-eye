package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023ve {

    /* renamed from: b, reason: collision with root package name */
    public static final C2023ve f17312b = new C2023ve(new C0856a[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final C0856a f17313c;

    /* renamed from: a, reason: collision with root package name */
    public final C0856a[] f17314a;

    static {
        C0856a c0856a = new C0856a(-1, new int[0], new C1241h2[0], new long[0], new String[0], new P6[0]);
        int[] iArr = c0856a.f13009d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c0856a.f13010e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        C1241h2[] c1241h2Arr = (C1241h2[]) Arrays.copyOf(c0856a.f13008c, 0);
        String[] strArr = (String[]) Arrays.copyOf(c0856a.f13011f, 0);
        P6[] p6Arr = c0856a.f13012g;
        f17313c = new C0856a(0, iArrCopyOf, c1241h2Arr, jArrCopyOf, strArr, (P6[]) Arrays.copyOf(p6Arr, Math.max(0, p6Arr.length)));
        String str = Vt.f12096a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C2023ve(C0856a[] c0856aArr) {
        this.f17314a = c0856aArr;
    }

    public final C0856a a(int i) {
        return i < 0 ? f17313c : this.f17314a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2023ve.class == obj.getClass() && Arrays.equals(this.f17314a, ((C2023ve) obj).f17314a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17314a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return A.f.l("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
