package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final lg0 f12590a;

    /* renamed from: b, reason: collision with root package name */
    public final lg0 f12591b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12592c;

    public j2(long j, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        mq0.m(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f12590a = new lg0(length2);
            this.f12591b = new lg0(length2);
        } else {
            int i4 = length2 + 1;
            lg0 lg0Var = new lg0(i4);
            this.f12590a = lg0Var;
            lg0 lg0Var2 = new lg0(i4);
            this.f12591b = lg0Var2;
            lg0Var.d();
            lg0Var2.d();
        }
        this.f12590a.e(jArr);
        this.f12591b.e(jArr2);
        this.f12592c = j;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return this.f12591b.f13487a > 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f12592c;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        lg0 lg0Var = this.f12591b;
        int i4 = lg0Var.f13487a;
        if (i4 == 0) {
            n2 n2Var = n2.f14129c;
            return new l2(n2Var, n2Var);
        }
        String str = bq0.f9768a;
        int i10 = i4 - 1;
        int i11 = 0;
        int i12 = 0;
        while (i12 <= i10) {
            int i13 = (i12 + i10) >>> 1;
            if (lg0Var.f(i13) < j) {
                i12 = i13 + 1;
            } else {
                i10 = i13 - 1;
            }
        }
        int i14 = i10 + 1;
        if (i14 < lg0Var.f13487a && lg0Var.f(i14) == j) {
            i11 = i14;
        } else if (i10 != -1) {
            i11 = i10;
        }
        long jF = lg0Var.f(i11);
        lg0 lg0Var2 = this.f12590a;
        n2 n2Var2 = new n2(jF, lg0Var2.f(i11));
        if (jF == j || i11 == lg0Var.f13487a - 1) {
            return new l2(n2Var2, n2Var2);
        }
        int i15 = i11 + 1;
        return new l2(n2Var2, new n2(lg0Var.f(i15), lg0Var2.f(i15)));
    }
}
