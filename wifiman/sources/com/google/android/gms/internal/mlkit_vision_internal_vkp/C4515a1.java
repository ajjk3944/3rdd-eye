package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4515a1 extends AbstractC4516a2 implements A2 {
    private static final C4515a1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC4549d2 zzg = AbstractC4516a2.h();
    private int zzh;
    private int zzi;
    private float zzj;

    static {
        C4515a1 c4515a1 = new C4515a1();
        zzb = c4515a1;
        AbstractC4516a2.p(C4515a1.class, c4515a1);
    }

    private C4515a1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0013\u0004င\u0002\u0005င\u0003\u0006ခ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C4515a1();
        }
        W0 w02 = null;
        if (i11 == 4) {
            return new Z0(w02);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
