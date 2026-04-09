package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4738u5 extends AbstractC4516a2 implements A2 {
    private static final C4738u5 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private C4771x5 zzi;
    private float zzj;
    private C4574f5 zzk;
    private float zzl;
    private B1 zzm;
    private B1 zzn;
    private byte zzo = 2;

    static {
        C4738u5 c4738u5 = new C4738u5();
        zzb = c4738u5;
        AbstractC4516a2.p(C4738u5.class, c4738u5);
    }

    private C4738u5() {
        B1 b12 = B1.f35555b;
        this.zzm = b12;
        this.zzn = b12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ခ\u0003\u0005ခ\u0007\u0006ည\b\u0007ခ\u0005\bဉ\u0006\tᐉ\u0004\nည\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzl", "zzm", "zzj", "zzk", "zzi", "zzn"});
        }
        if (i11 == 3) {
            return new C4738u5();
        }
        AbstractC4716s5 abstractC4716s5 = null;
        if (i11 == 4) {
            return new C4727t5(abstractC4716s5);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
