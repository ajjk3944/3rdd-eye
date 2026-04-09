package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v8 {

    /* renamed from: a, reason: collision with root package name */
    public final c8[] f17554a;

    public v8(c8... c8VarArr) {
        this.f17554a = c8VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.u51 a(java.lang.Class r10, com.google.android.gms.internal.ads.d31 r11) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.v41 r0 = com.google.android.gms.internal.ads.x41.f18307b
            java.lang.String r0 = "initialCapacity"
            r1 = 4
            com.google.android.gms.internal.ads.yr1.u(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.c8[] r1 = r9.f17554a
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
            com.google.android.gms.internal.ads.c8 r5 = (com.google.android.gms.internal.ads.c8) r5
            boolean r6 = r11.c(r5)
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L3e
            int r6 = r0.length
            int r7 = r4 + 1
            int r8 = com.google.android.gms.internal.ads.s41.d(r6, r7)
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
            com.google.android.gms.internal.ads.u51 r10 = com.google.android.gms.internal.ads.x41.s(r0, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v8.a(java.lang.Class, com.google.android.gms.internal.ads.d31):com.google.android.gms.internal.ads.u51");
    }

    public final v8 b(v8 v8Var) {
        return v8Var == null ? this : c(v8Var.f17554a);
    }

    public final v8 c(c8... c8VarArr) {
        int length = c8VarArr.length;
        if (length == 0) {
            return this;
        }
        String str = bq0.f9768a;
        c8[] c8VarArr2 = this.f17554a;
        int length2 = c8VarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(c8VarArr2, length2 + length);
        System.arraycopy(c8VarArr, 0, objArrCopyOf, length2, length);
        return new v8((c8[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v8.class == obj.getClass() && Arrays.equals(this.f17554a, ((v8) obj).f17554a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f17554a) * 31) + ((int) (-9223372034707292159L));
    }

    public final String toString() {
        String string = Arrays.toString(this.f17554a);
        return r5.c.m(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public v8(List list) {
        this.f17554a = (c8[]) list.toArray(new c8[0]);
    }
}
