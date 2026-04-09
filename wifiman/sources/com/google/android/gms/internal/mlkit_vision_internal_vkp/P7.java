package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class P7 extends AbstractC4516a2 implements A2 {
    private static final P7 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        P7 p72 = new P7();
        zzb = p72;
        AbstractC4516a2.p(P7.class, p72);
    }

    private P7() {
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
            return new P7();
        }
        N7 n72 = null;
        if (i11 == 4) {
            return new O7(n72);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
