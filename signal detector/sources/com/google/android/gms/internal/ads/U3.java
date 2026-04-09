package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class U3 {

    /* renamed from: a, reason: collision with root package name */
    public final B3[] f11598a;

    public U3(B3... b3Arr) {
        this.f11598a = b3Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1197gC a(java.lang.Class r10, com.google.android.gms.internal.ads.RA r11) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.JB r0 = com.google.android.gms.internal.ads.LB.f9635b
            java.lang.String r0 = "initialCapacity"
            r1 = 4
            com.google.android.gms.internal.ads.C1476lN.v(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.B3[] r1 = r9.f11598a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r2) goto L41
            r5 = r1[r3]
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r10.isAssignableFrom(r6)
            if (r6 == 0) goto L2a
            java.lang.Object r5 = r10.cast(r5)
            com.google.android.gms.internal.ads.B3 r5 = (com.google.android.gms.internal.ads.B3) r5
            boolean r6 = r11.b(r5)
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L3e
            int r6 = r0.length
            int r7 = r4 + 1
            int r8 = com.google.android.gms.internal.ads.GB.d(r6, r7)
            if (r8 > r6) goto L37
            goto L3b
        L37:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
        L3b:
            r0[r4] = r5
            r4 = r7
        L3e:
            int r3 = r3 + 1
            goto Lf
        L41:
            com.google.android.gms.internal.ads.gC r10 = com.google.android.gms.internal.ads.LB.o(r4, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.U3.a(java.lang.Class, com.google.android.gms.internal.ads.RA):com.google.android.gms.internal.ads.gC");
    }

    public final U3 b(U3 u32) {
        return u32 == null ? this : c(u32.f11598a);
    }

    public final U3 c(B3... b3Arr) {
        int length = b3Arr.length;
        if (length == 0) {
            return this;
        }
        String str = Vt.f12096a;
        B3[] b3Arr2 = this.f11598a;
        int length2 = b3Arr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(b3Arr2, length2 + length);
        System.arraycopy(b3Arr, 0, objArrCopyOf, length2, length);
        return new U3((B3[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && U3.class == obj.getClass() && Arrays.equals(this.f11598a, ((U3) obj).f11598a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f11598a) * 31) + ((int) (-9223372034707292159L));
    }

    public final String toString() {
        String string = Arrays.toString(this.f11598a);
        return AbstractC1135f5.n(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public U3(List list) {
        this.f11598a = (B3[]) list.toArray(new B3[0]);
    }
}
