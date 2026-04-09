package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q implements Iterable, n {

    /* renamed from: a, reason: collision with root package name */
    public final String f19867a;

    public q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f19867a = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n N1() {
        return new q(this.f19867a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.valueOf(!this.f19867a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new p(0, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f19867a.equals(((q) obj).f19867a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double f() {
        String str = this.f19867a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f19867a.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ec A[PHI: r7
  0x02ec: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02d8, B:101:0x02da, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f6 A[LOOP:0: B:108:0x02f4->B:109:0x02f6, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n i(java.lang.String r28, a0.x0 r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q.i(java.lang.String, a0.x0, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(1, this);
    }

    public final String toString() {
        String str = this.f19867a;
        return r5.c.m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String zzc() {
        return this.f19867a;
    }
}
