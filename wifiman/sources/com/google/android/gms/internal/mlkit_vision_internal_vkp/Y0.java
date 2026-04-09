package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC4516a2 implements A2 {
    private static final Y0 zzb;
    private int zzd;
    private String zze = "";
    private double zzf = 1.0d;
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();

    static {
        Y0 y02 = new Y0();
        zzb = y02;
        AbstractC4516a2.p(Y0.class, y02);
    }

    private Y0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002က\u0001\u000f\u001a", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new Y0();
        }
        W0 w02 = null;
        if (i11 == 4) {
            return new X0(w02);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
