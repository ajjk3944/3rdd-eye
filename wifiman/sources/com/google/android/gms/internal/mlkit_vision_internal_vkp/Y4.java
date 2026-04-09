package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class Y4 extends AbstractC4516a2 implements A2 {
    private static final Y4 zzb;
    private int zzd;
    private S4 zze;
    private InterfaceC4582g2 zzf = AbstractC4516a2.k();
    private float zzg;

    static {
        Y4 y42 = new Y4();
        zzb = y42;
        AbstractC4516a2.p(Y4.class, y42);
    }

    private Y4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001", new Object[]{"zzd", "zze", "zzf", X4.class, "zzg"});
        }
        if (i11 == 3) {
            return new Y4();
        }
        Q4 q42 = null;
        if (i11 == 4) {
            return new T4(q42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
