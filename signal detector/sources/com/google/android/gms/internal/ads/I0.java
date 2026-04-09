package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class I0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final L2.w f9053a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.w f9054b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9055c;

    public I0(long j6, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        AbstractC0582Jp.m(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f9053a = new L2.w(length2, 8);
            this.f9054b = new L2.w(length2, 8);
        } else {
            int i = length2 + 1;
            L2.w wVar = new L2.w(i, 8);
            this.f9053a = wVar;
            L2.w wVar2 = new L2.w(i, 8);
            this.f9054b = wVar2;
            wVar.n();
            wVar2.n();
        }
        this.f9053a.s(jArr);
        this.f9054b.s(jArr2);
        this.f9055c = j6;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f9055c;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return this.f9054b.f2569b > 0;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        L2.w wVar = this.f9054b;
        int i = wVar.f2569b;
        if (i == 0) {
            M0 m02 = M0.f9790c;
            return new K0(m02, m02);
        }
        String str = Vt.f12096a;
        int i3 = i - 1;
        int i6 = 0;
        int i7 = 0;
        while (i7 <= i3) {
            int i8 = (i7 + i3) >>> 1;
            if (wVar.t(i8) < j6) {
                i7 = i8 + 1;
            } else {
                i3 = i8 - 1;
            }
        }
        int i9 = i3 + 1;
        if (i9 < wVar.f2569b && wVar.t(i9) == j6) {
            i6 = i9;
        } else if (i3 != -1) {
            i6 = i3;
        }
        long jT = wVar.t(i6);
        L2.w wVar2 = this.f9053a;
        M0 m03 = new M0(jT, wVar2.t(i6));
        if (jT == j6 || i6 == wVar.f2569b - 1) {
            return new K0(m03, m03);
        }
        int i10 = i6 + 1;
        return new K0(m03, new M0(wVar.t(i10), wVar2.t(i10)));
    }
}
