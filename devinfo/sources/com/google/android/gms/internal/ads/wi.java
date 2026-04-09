package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wi extends qn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final wi zzv;
    private static volatile po1 zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private xn1 zzj = so1.f16499e;
    private String zzn = "";
    private String zzo = "";

    static {
        wi wiVar = new wi();
        zzv = wiVar;
        qn1.u(wi.class, wiVar);
    }

    public static ui A() {
        return (ui) zzv.r();
    }

    public final void B(ArrayList arrayList) {
        xn1 xn1Var = this.zzj;
        if (!((rm1) xn1Var).f15707a) {
            int size = xn1Var.size();
            this.zzj = xn1Var.n(size + size);
        }
        qm1.e(arrayList, this.zzj);
    }

    public final void C(int i4) {
        this.zzi |= 1;
        this.zzk = i4;
    }

    public final void D(int i4) {
        this.zzi |= 2;
        this.zzl = i4;
    }

    public final void E(long j) {
        this.zzi |= 4;
        this.zzm = j;
    }

    public final void F(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    public final void G() {
        String str = Build.MODEL;
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    public final void H(long j) {
        this.zzi |= 32;
        this.zzp = j;
    }

    public final void I(int i4) {
        this.zzi |= 64;
        this.zzu = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final Object w(int i4, qn1 qn1Var) {
        po1 pn1Var;
        int iC = i3.e.c(i4);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new to1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", ti.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (iC == 3) {
            return new wi();
        }
        if (iC == 4) {
            return new ui(zzv);
        }
        if (iC == 5) {
            return zzv;
        }
        if (iC != 6) {
            throw null;
        }
        po1 po1Var = zzw;
        if (po1Var != null) {
            return po1Var;
        }
        synchronized (wi.class) {
            try {
                pn1Var = zzw;
                if (pn1Var == null) {
                    pn1Var = new pn1(zzv);
                    zzw = pn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pn1Var;
    }
}
