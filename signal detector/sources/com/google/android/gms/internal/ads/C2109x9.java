package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2109x9 extends AbstractC1096eL {
    private static final C2109x9 zzF;
    private static volatile CL zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private F8 zzA;
    private D8 zzB;
    private L8 zzC;
    private C1516m9 zzD;
    private C1084e9 zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private S8 zzw;
    private C1947u9 zzy;
    private C2001v9 zzz;
    private String zzp = "";
    private int zzv = TTAdConstant.STYLE_SIZE_RADIO_1_1;
    private InterfaceC1420kL zzx = C1851sL.f16708e;

    static {
        C2109x9 c2109x9 = new C2109x9();
        zzF = c2109x9;
        AbstractC1096eL.u(C2109x9.class, c2109x9);
    }

    public static C2055w9 L() {
        return (C2055w9) zzF.r();
    }

    public final C1947u9 A() {
        C1947u9 c1947u9 = this.zzy;
        return c1947u9 == null ? C1947u9.A() : c1947u9;
    }

    public final void B(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final D8 C() {
        D8 d8 = this.zzB;
        return d8 == null ? D8.A() : d8;
    }

    public final void D(C1084e9 c1084e9) {
        this.zzE = c1084e9;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(ArrayList arrayList) {
        InterfaceC1420kL interfaceC1420kL = this.zzx;
        if (!((GK) interfaceC1420kL).f8358a) {
            this.zzx = AbstractC1096eL.k(interfaceC1420kL);
        }
        FK.e(arrayList, this.zzx);
    }

    public final void F() {
        this.zzx = C1851sL.f16708e;
    }

    public final void G(C1947u9 c1947u9) {
        this.zzy = c1947u9;
        this.zzn |= 32;
    }

    public final void H(D8 d8) {
        this.zzB = d8;
        this.zzn |= 256;
    }

    public final void I(L8 l8) {
        this.zzC = l8;
        this.zzn |= 512;
    }

    public final void J(C1516m9 c1516m9) {
        this.zzD = c1516m9;
        this.zzn |= 1024;
    }

    public final String K() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", J5.f9253x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (iC == 3) {
            return new C2109x9();
        }
        if (iC == 4) {
            return new C2055w9(zzF);
        }
        if (iC == 5) {
            return zzF;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzG;
        if (cl != null) {
            return cl;
        }
        synchronized (C2109x9.class) {
            try {
                c1042dL = zzG;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzF);
                    zzG = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
