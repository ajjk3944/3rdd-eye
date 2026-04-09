package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4700r0 extends AbstractC4516a2 implements A2 {
    private static final C4700r0 zzb;
    private int zzd;
    private float zze = 1.5f;
    private float zzf = 3.0f;
    private float zzg = 3.0f;
    private float zzh = 2.0f;
    private float zzi = 0.5f;
    private float zzj = 1.5f;
    private float zzk = 1.7f;
    private float zzl = 2.0f;
    private boolean zzm;

    static {
        C4700r0 c4700r0 = new C4700r0();
        zzb = c4700r0;
        AbstractC4516a2.p(C4700r0.class, c4700r0);
    }

    private C4700r0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C4700r0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4690q0(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
