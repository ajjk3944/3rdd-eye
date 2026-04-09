package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class ta extends AbstractC4516a2 implements A2 {
    private static final ta zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        ta taVar = new ta();
        zzb = taVar;
        AbstractC4516a2.p(ta.class, taVar);
    }

    private ta() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4535c.class});
        }
        if (i11 == 3) {
            return new ta();
        }
        ra raVar = null;
        if (i11 == 4) {
            return new sa(raVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
