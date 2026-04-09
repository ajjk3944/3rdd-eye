package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class L0 extends AbstractC4516a2 implements A2 {
    private static final L0 zzb;
    private byte zze = 2;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        L0 l02 = new L0();
        zzb = l02;
        AbstractC4516a2.p(L0.class, l02);
    }

    private L0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", J0.class});
        }
        if (i11 == 3) {
            return new L0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new K0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
