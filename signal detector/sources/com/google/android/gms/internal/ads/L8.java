package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.ArrayList;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class L8 extends AbstractC1096eL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final L8 zzv;
    private static volatile CL zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private InterfaceC1474lL zzj = FL.f8088e;
    private String zzn = "";
    private String zzo = "";

    static {
        L8 l8 = new L8();
        zzv = l8;
        AbstractC1096eL.u(L8.class, l8);
    }

    public static J8 A() {
        return (J8) zzv.r();
    }

    public final void B(ArrayList arrayList) {
        InterfaceC1474lL interfaceC1474lL = this.zzj;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzj = interfaceC1474lL.B(size + size);
        }
        FK.e(arrayList, this.zzj);
    }

    public final void C(int i) {
        this.zzi |= 1;
        this.zzk = i;
    }

    public final void D(int i) {
        this.zzi |= 2;
        this.zzl = i;
    }

    public final void E(long j6) {
        this.zzi |= 4;
        this.zzm = j6;
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

    public final void H(long j6) {
        this.zzi |= 32;
        this.zzp = j6;
    }

    public final void I(int i) {
        this.zzi |= 64;
        this.zzu = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", I8.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (iC == 3) {
            return new L8();
        }
        if (iC == 4) {
            return new J8(zzv);
        }
        if (iC == 5) {
            return zzv;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzw;
        if (cl != null) {
            return cl;
        }
        synchronized (L8.class) {
            try {
                c1042dL = zzw;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzv);
                    zzw = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
