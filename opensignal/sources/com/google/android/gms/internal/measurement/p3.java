package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class p3 extends h5 {
    private static final p3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        p3 p3Var = new p3();
        zzg = p3Var;
        h5.m(p3.class, p3Var);
    }

    public static n3 q() {
        return (n3) zzg.h();
    }

    public static p3 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.h5
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new i6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", q1.f5177n, "zze", q1.f5175l, "zzf", q1.f5176m});
        }
        if (i11 == 3) {
            return new p3();
        }
        if (i11 == 4) {
            return new n3(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final o3 p() {
        o3 o3VarZzb = o3.zzb(this.zze);
        return o3VarZzb == null ? o3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : o3VarZzb;
    }

    public final /* synthetic */ void s(o3 o3Var) {
        this.zze = o3Var.zza();
        this.zzb |= 2;
    }

    public final int t() {
        int i10;
        int i11 = this.zzd;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p3.u():int");
    }

    public final /* synthetic */ void v(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
