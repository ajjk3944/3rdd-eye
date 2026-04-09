package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class F0 extends AbstractC4516a2 implements A2 {
    private static final F0 zzb;
    private int zzd;
    private float zzf;
    private String zze = "";
    private String zzg = "";

    static {
        F0 f02 = new F0();
        zzb = f02;
        AbstractC4516a2.p(F0.class, f02);
    }

    private F0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new F0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new E0(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
