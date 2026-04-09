package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class B0 extends AbstractC4516a2 implements A2 {
    private static final B0 zzb;
    private int zzd;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzk;
    private float zzl;
    private boolean zzm;
    private int zze = 1;
    private float zzj = 1.0f;

    static {
        B0 b02 = new B0();
        zzb = b02;
        AbstractC4516a2.p(B0.class, b02);
    }

    private B0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new B0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new A0(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
