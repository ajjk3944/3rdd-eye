package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class J5 extends AbstractC4516a2 implements A2 {
    private static final J5 zzb;
    private Object zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzd = 0;
    private InterfaceC4582g2 zzi = AbstractC4516a2.k();

    static {
        J5 j52 = new J5();
        zzb = j52;
        AbstractC4516a2.p(J5.class, j52);
    }

    private J5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002<\u0000\u0003\u0004\u0004\u001b\u00057\u0000\u0006\u0004", new Object[]{"zze", "zzd", "zzf", I5.class, "zzg", "zzi", C4669o1.class, "zzh"});
        }
        if (i11 == 3) {
            return new J5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new F5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
