package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class J4 extends AbstractC4516a2 implements A2 {
    private static final J4 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private B4 zzk;
    private int zzl;
    private int zzm;
    private float zzn;

    static {
        J4 j42 = new J4();
        zzb = j42;
        AbstractC4516a2.p(J4.class, j42);
    }

    private J4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0007\u0005᠌\b\u0006ခ\t\u0007ဉ\u0006\tခ\u0003\nခ\u0004\u000bခ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzl", G4.f35594a, "zzm", H4.f35598a, "zzn", "zzk", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new J4();
        }
        AbstractC4770x4 abstractC4770x4 = null;
        if (i11 == 4) {
            return new F4(abstractC4770x4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
