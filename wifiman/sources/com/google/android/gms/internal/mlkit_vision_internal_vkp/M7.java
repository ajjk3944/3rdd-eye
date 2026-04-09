package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class M7 extends AbstractC4516a2 implements A2 {
    private static final M7 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        M7 m72 = new M7();
        zzb = m72;
        AbstractC4516a2.p(M7.class, m72);
    }

    private M7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new M7();
        }
        J7 j72 = null;
        if (i11 == 4) {
            return new L7(j72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
