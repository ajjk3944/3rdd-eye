package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class C3 extends AbstractC4516a2 implements A2 {
    private static final C3 zzb;
    private Object zze;
    private int zzd = 0;
    private byte zzf = 2;

    static {
        C3 c32 = new C3();
        zzb = c32;
        AbstractC4516a2.p(C3.class, c32);
    }

    private C3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"zze", "zzd", B3.class, T.class, N.class});
        }
        if (i11 == 3) {
            return new C3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new C4769x3(abstractC4758w3);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzf = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
