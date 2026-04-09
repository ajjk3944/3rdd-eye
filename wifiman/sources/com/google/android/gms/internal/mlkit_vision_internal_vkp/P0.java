package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class P0 extends AbstractC4516a2 implements A2 {
    private static final P0 zzb;
    private int zzd;
    private Y zze;
    private int zzh;
    private int zzi;
    private byte zzj = 2;
    private String zzf = "";
    private InterfaceC4560e2 zzg = AbstractC4516a2.i();

    static {
        P0 p02 = new P0();
        zzb = p02;
        AbstractC4516a2.p(P0.class, p02);
    }

    private P0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u0016\u0004င\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", X3.a()});
        }
        if (i11 == 3) {
            return new P0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new O0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
