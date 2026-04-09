package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class F9 extends AbstractC4516a2 implements A2 {
    private static final F9 zzb;
    private int zzd;
    private InterfaceC4549d2 zze = AbstractC4516a2.h();
    private B1 zzf = B1.f35555b;

    static {
        F9 f92 = new F9();
        zzb = f92;
        AbstractC4516a2.p(F9.class, f92);
    }

    private F9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002ည\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new F9();
        }
        D9 d92 = null;
        if (i11 == 4) {
            return new E9(d92);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
