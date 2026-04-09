package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4613j0 extends AbstractC4516a2 implements A2 {
    private static final C4613j0 zzb;
    private int zzd;
    private C4591h0 zze;
    private double zzf;
    private boolean zzg;

    static {
        C4613j0 c4613j0 = new C4613j0();
        zzb = c4613j0;
        AbstractC4516a2.p(C4613j0.class, c4613j0);
    }

    private C4613j0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C4613j0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4602i0(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
