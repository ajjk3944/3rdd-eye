package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class B0 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7094a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7095b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7096c;

    public /* synthetic */ B0(Object obj, long j6, int i) {
        this.f7094a = i;
        this.f7096c = obj;
        this.f7095b = j6;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        switch (this.f7094a) {
        }
        return this.f7095b;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        switch (this.f7094a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        int i = this.f7094a;
        int i3 = 1;
        Object obj = this.f7096c;
        switch (i) {
            case 0:
                C0 c02 = (C0) obj;
                C0697Ql c0697Ql = c02.f7488k;
                c0697Ql.getClass();
                String str = Vt.f12096a;
                long jMax = Math.max(0L, Math.min((c02.f7483e * j6) / 1000000, c02.f7487j - 1));
                long[] jArr = (long[]) c0697Ql.f10691b;
                int iQ = Vt.q(jArr, jMax, false);
                long j7 = iQ == -1 ? 0L : jArr[iQ];
                long[] jArr2 = (long[]) c0697Ql.f10692c;
                long j8 = iQ != -1 ? jArr2[iQ] : 0L;
                int i6 = c02.f7483e;
                long j9 = (j7 * 1000000) / i6;
                long j10 = this.f7095b;
                M0 m02 = new M0(j9, j8 + j10);
                if (j9 == j6 || iQ == jArr.length - 1) {
                    return new K0(m02, m02);
                }
                int i7 = iQ + 1;
                return new K0(m02, new M0((jArr[i7] * 1000000) / i6, j10 + jArr2[i7]));
            case 1:
                return (K0) obj;
            default:
                Y0 y02 = (Y0) obj;
                K0 k0A = y02.i[0].a(j6);
                while (true) {
                    C0913b1[] c0913b1Arr = y02.i;
                    if (i3 >= c0913b1Arr.length) {
                        return k0A;
                    }
                    K0 k0A2 = c0913b1Arr[i3].a(j6);
                    if (k0A2.f9416a.f9792b < k0A.f9416a.f9792b) {
                        k0A = k0A2;
                    }
                    i3++;
                }
        }
    }

    public B0(long j6, long j7) {
        this.f7094a = 1;
        this.f7095b = j6;
        M0 m02 = j7 == 0 ? M0.f9790c : new M0(0L, j7);
        this.f7096c = new K0(m02, m02);
    }
}
