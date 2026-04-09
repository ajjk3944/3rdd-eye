package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class J0 extends AbstractC4516a2 implements A2 {
    private static final J0 zzb;
    private int zzd;
    private int zze;
    private float zzg;
    private byte zzh = 2;
    private InterfaceC4560e2 zzf = AbstractC4516a2.i();

    static {
        J0 j02 = new J0();
        zzb = j02;
        AbstractC4516a2.p(J0.class, j02);
    }

    private J0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᔄ\u0000\u0002ᔁ\u0001\u0003\u0016", new Object[]{"zzd", "zze", "zzg", "zzf"});
        }
        if (i11 == 3) {
            return new J0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new I0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
