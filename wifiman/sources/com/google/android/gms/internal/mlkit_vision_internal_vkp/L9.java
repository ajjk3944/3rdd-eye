package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class L9 extends AbstractC4516a2 implements A2 {
    private static final L9 zzb;
    private byte zze = 2;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        L9 l92 = new L9();
        zzb = l92;
        AbstractC4516a2.p(L9.class, l92);
    }

    private L9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", I9.class});
        }
        if (i11 == 3) {
            return new L9();
        }
        J9 j92 = null;
        if (i11 == 4) {
            return new K9(j92);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
