package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class Q8 extends AbstractC4516a2 implements A2 {
    private static final Q8 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        Q8 q82 = new Q8();
        zzb = q82;
        AbstractC4516a2.p(Q8.class, q82);
    }

    private Q8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new Q8();
        }
        O8 o82 = null;
        if (i11 == 4) {
            return new P8(o82);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
