package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4545c9 extends AbstractC4516a2 implements A2 {
    private static final C4545c9 zzb;
    private int zzd;
    private int zze;
    private float zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        C4545c9 c4545c9 = new C4545c9();
        zzb = c4545c9;
        AbstractC4516a2.p(C4545c9.class, c4545c9);
    }

    private C4545c9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4545c9();
        }
        Z8 z82 = null;
        if (i11 == 4) {
            return new C4523a9(z82);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
