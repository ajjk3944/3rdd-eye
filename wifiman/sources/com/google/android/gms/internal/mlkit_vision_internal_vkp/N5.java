package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class N5 extends AbstractC4516a2 implements A2 {
    private static final N5 zzb;
    private int zzd;
    private C4652m6 zze;
    private C4652m6 zzf;

    static {
        N5 n52 = new N5();
        zzb = n52;
        AbstractC4516a2.p(N5.class, n52);
    }

    private N5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new N5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new M5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
