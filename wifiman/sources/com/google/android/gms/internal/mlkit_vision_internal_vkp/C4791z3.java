package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4791z3 extends AbstractC4516a2 implements A2 {
    private static final C4791z3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C4791z3 c4791z3 = new C4791z3();
        zzb = c4791z3;
        AbstractC4516a2.p(C4791z3.class, c4791z3);
    }

    private C4791z3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4791z3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new C4780y3(abstractC4758w3);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
