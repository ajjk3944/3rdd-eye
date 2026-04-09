package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class I5 extends AbstractC4516a2 implements A2 {
    private static final I5 zzb;
    private int zzd;
    private InterfaceC4560e2 zze = AbstractC4516a2.i();

    static {
        I5 i52 = new I5();
        zzb = i52;
        AbstractC4516a2.p(I5.class, i52);
    }

    private I5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002'", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new I5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new G5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
