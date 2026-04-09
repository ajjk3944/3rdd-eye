package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class E6 extends AbstractC4516a2 implements A2 {
    private static final E6 zzb;
    private int zzd;
    private B6 zze;
    private C4718s7 zzf;

    static {
        E6 e62 = new E6();
        zzb = e62;
        AbstractC4516a2.p(E6.class, e62);
    }

    private E6() {
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
            return new E6();
        }
        C6 c62 = null;
        if (i11 == 4) {
            return new D6(c62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
