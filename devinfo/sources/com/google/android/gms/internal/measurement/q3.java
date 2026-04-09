package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q3 extends g5 {
    private static final q3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        q3 q3Var = new q3();
        zzg = q3Var;
        g5.m(q3.class, q3Var);
    }

    public static p3 q() {
        return (p3) zzg.h();
    }

    public static q3 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i4) {
        int i10 = i4 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", s1.f19922n, "zze", s1.f19920l, "zzf", s1.f19921m});
        }
        if (i10 == 3) {
            return new q3();
        }
        if (i10 == 4) {
            return new p3(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int iC = com.google.android.gms.internal.ads.d7.c(this.zze);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public final void s(int i4) {
        this.zze = com.google.android.gms.internal.ads.d7.k(i4);
        this.zzb |= 2;
    }

    public final int t() {
        int i4;
        int i10 = this.zzd;
        if (i10 != 0) {
            i4 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i4 = 4;
                    if (i10 != 3) {
                        i4 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i4 = 3;
                }
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r3
  0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u() {
        /*
            r4 = this;
            int r0 = r4.zzf
            r1 = 1
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r2) goto L17
            r2 = 4
            if (r0 == r3) goto L1a
            r3 = 5
            if (r0 == r2) goto L17
            if (r0 == r3) goto L15
            r2 = 0
            goto L1a
        L15:
            r2 = 6
            goto L1a
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q3.u():int");
    }

    public final /* synthetic */ void v(int i4) {
        this.zzd = i4 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i4) {
        this.zzf = i4 - 1;
        this.zzb |= 4;
    }
}
