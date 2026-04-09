package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class N6 extends AbstractC4516a2 implements A2 {
    private static final N6 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        N6 n62 = new N6();
        zzb = n62;
        AbstractC4516a2.p(N6.class, n62);
    }

    private N6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new N6();
        }
        L6 l62 = null;
        if (i11 == 4) {
            return new M6(l62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
