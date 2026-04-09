package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class U3 extends AbstractC4516a2 implements A2 {
    private static final U3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        U3 u32 = new U3();
        zzb = u32;
        AbstractC4516a2.p(U3.class, u32);
    }

    private U3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new U3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new T3(abstractC4758w3);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
