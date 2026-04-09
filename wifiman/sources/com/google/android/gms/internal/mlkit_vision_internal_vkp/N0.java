package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class N0 extends AbstractC4516a2 implements A2 {
    private static final N0 zzb;
    private int zzd;
    private Y zze;
    private byte zzg = 2;
    private InterfaceC4560e2 zzf = AbstractC4516a2.i();

    static {
        N0 n02 = new N0();
        zzb = n02;
        AbstractC4516a2.p(N0.class, n02);
    }

    private N0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u0016", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new N0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new M0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
