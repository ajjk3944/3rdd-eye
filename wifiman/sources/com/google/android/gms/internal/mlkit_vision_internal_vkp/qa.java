package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class qa extends AbstractC4516a2 implements A2 {
    private static final qa zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        qa qaVar = new qa();
        zzb = qaVar;
        AbstractC4516a2.p(qa.class, qaVar);
    }

    private qa() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", oa.class});
        }
        if (i11 == 3) {
            return new qa();
        }
        ma maVar = null;
        if (i11 == 4) {
            return new pa(maVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
