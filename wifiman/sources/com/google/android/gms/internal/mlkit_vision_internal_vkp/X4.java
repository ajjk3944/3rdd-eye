package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class X4 extends AbstractC4516a2 implements A2 {
    private static final X4 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;

    static {
        X4 x42 = new X4();
        zzb = x42;
        AbstractC4516a2.p(X4.class, x42);
    }

    private X4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", V4.f35648a, "zzi", W4.f35659a, "zzj"});
        }
        if (i11 == 3) {
            return new X4();
        }
        Q4 q42 = null;
        if (i11 == 4) {
            return new U4(q42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
