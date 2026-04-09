package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class B3 extends AbstractC4516a2 implements A2 {
    private static final B3 zzb;
    private int zzd;
    private T zzf;
    private byte zzg = 2;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();

    static {
        B3 b32 = new B3();
        zzb = b32;
        AbstractC4516a2.p(B3.class, b32);
    }

    private B3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"zzd", "zze", C4791z3.class, "zzf"});
        }
        if (i11 == 3) {
            return new B3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new A3(abstractC4758w3);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
