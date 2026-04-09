package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.hI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257hI extends AbstractC1096eL {
    private static final C1257hI zzc;
    private static volatile CL zzd;
    private int zza;
    private InterfaceC1474lL zzb = FL.f8088e;

    static {
        C1257hI c1257hI = new C1257hI();
        zzc = c1257hI;
        AbstractC1096eL.u(C1257hI.class, c1257hI);
    }

    public static C1257hI E(byte[] bArr, XK xk) {
        AbstractC1096eL abstractC1096eLY = AbstractC1096eL.y(zzc, bArr, bArr.length, xk);
        AbstractC1096eL.z(abstractC1096eLY);
        return (C1257hI) abstractC1096eLY;
    }

    public static C1257hI F(ByteArrayInputStream byteArrayInputStream, XK xk) throws C1636oL {
        AbstractC1096eL abstractC1096eLL = AbstractC1096eL.l(zzc, new SK(byteArrayInputStream), xk);
        AbstractC1096eL.z(abstractC1096eLL);
        return (C1257hI) abstractC1096eLL;
    }

    public static C1093eI G() {
        return (C1093eI) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final InterfaceC1474lL B() {
        return this.zzb;
    }

    public final int C() {
        return this.zzb.size();
    }

    public final C1203gI D(int i) {
        return (C1203gI) this.zzb.get(i);
    }

    public final /* synthetic */ void H(int i) {
        this.zza = i;
    }

    public final void I(C1203gI c1203gI) {
        InterfaceC1474lL interfaceC1474lL = this.zzb;
        if (!((GK) interfaceC1474lL).f8358a) {
            int size = interfaceC1474lL.size();
            this.zzb = interfaceC1474lL.B(size + size);
        }
        this.zzb.add(c1203gI);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C1203gI.class});
        }
        if (iC == 3) {
            return new C1257hI();
        }
        if (iC == 4) {
            return new C1093eI(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzd;
        if (cl != null) {
            return cl;
        }
        synchronized (C1257hI.class) {
            try {
                c1042dL = zzd;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzc);
                    zzd = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
