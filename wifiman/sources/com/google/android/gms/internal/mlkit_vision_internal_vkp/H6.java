package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class H6 extends AbstractC4516a2 implements A2 {
    private static final H6 zzb;
    private String zzd = "";
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private String zzf = "";

    static {
        H6 h62 = new H6();
        zzb = h62;
        AbstractC4516a2.p(H6.class, h62);
    }

    private H6() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"zzd", "zze", E6.class, "zzf"});
        }
        if (i11 == 3) {
            return new H6();
        }
        F6 f62 = null;
        if (i11 == 4) {
            return new G6(f62);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
