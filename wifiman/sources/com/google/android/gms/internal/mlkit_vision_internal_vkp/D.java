package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class D extends AbstractC4516a2 implements A2 {
    private static final D zzb;
    private int zzd;
    private double zze;
    private double zzf;

    static {
        D d10 = new D();
        zzb = d10;
        AbstractC4516a2.p(D.class, d10);
    }

    private D() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new D();
        }
        B b10 = null;
        if (i11 == 4) {
            return new C(b10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
