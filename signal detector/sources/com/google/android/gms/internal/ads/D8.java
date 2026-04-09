package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class D8 extends AbstractC1096eL {
    private static final D8 zzB;
    private static volatile CL zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private InterfaceC1474lL zzA;
    private int zzl;
    private int zzm;
    private int zzn = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private C1678p9 zzo;
    private C1785r9 zzp;
    private InterfaceC1474lL zzu;
    private C1839s9 zzv;
    private M8 zzw;
    private G8 zzx;
    private C2217z9 zzy;
    private A9 zzz;

    static {
        D8 d8 = new D8();
        zzB = d8;
        AbstractC1096eL.u(D8.class, d8);
    }

    public D8() {
        FL fl = FL.f8088e;
        this.zzu = fl;
        this.zzA = fl;
    }

    public static D8 A() {
        return zzB;
    }

    public final void B(B8 b8) {
        this.zzm = b8.f7305a;
        this.zzl |= 1;
    }

    public final void C(C1785r9 c1785r9) {
        this.zzp = c1785r9;
        this.zzl |= 8;
    }

    public final C1785r9 D() {
        C1785r9 c1785r9 = this.zzp;
        return c1785r9 == null ? C1785r9.A() : c1785r9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", J5.f9245p, "zzn", J5.f9253x, "zzo", "zzp", "zzu", C1624o9.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", T8.class});
        }
        if (iC == 3) {
            return new D8();
        }
        if (iC == 4) {
            return new C8(zzB);
        }
        if (iC == 5) {
            return zzB;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzC;
        if (cl != null) {
            return cl;
        }
        synchronized (D8.class) {
            try {
                c1042dL = zzC;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzB);
                    zzC = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
