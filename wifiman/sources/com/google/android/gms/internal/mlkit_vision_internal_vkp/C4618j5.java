package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4618j5 extends AbstractC4516a2 implements A2 {
    private static final C4618j5 zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private double zzh;
    private boolean zzi;
    private double zzj;
    private double zzk;
    private byte zzl = 2;
    private String zzg = "";

    static {
        C4618j5 c4618j5 = new C4618j5();
        zzb = c4618j5;
        AbstractC4516a2.p(C4618j5.class, c4618j5);
    }

    private C4618j5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001\u0004က\u0005\u0005က\u0006\u0006ဇ\u0004\u0007က\u0003\bဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzj", "zzk", "zzi", "zzh", "zzg"});
        }
        if (i11 == 3) {
            return new C4618j5();
        }
        AbstractC4596h5 abstractC4596h5 = null;
        if (i11 == 4) {
            return new C4607i5(abstractC4596h5);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
