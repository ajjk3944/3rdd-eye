package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class ia extends AbstractC4516a2 implements A2 {
    private static final ia zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private float zzg;
    private float zzh;

    static {
        ia iaVar = new ia();
        zzb = iaVar;
        AbstractC4516a2.p(ia.class, iaVar);
    }

    private ia() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new ia();
        }
        AbstractC4764w9 abstractC4764w9 = null;
        if (i11 == 4) {
            return new N9(abstractC4764w9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
