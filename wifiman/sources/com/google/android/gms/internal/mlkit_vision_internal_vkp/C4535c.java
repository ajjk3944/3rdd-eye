package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4535c extends AbstractC4516a2 implements A2 {
    private static final C4535c zzb;
    private int zzd;
    private int zzf;
    private float zzh;
    private boolean zzi;
    private boolean zzj;
    private String zze = "";
    private String zzg = "";

    static {
        C4535c c4535c = new C4535c();
        zzb = c4535c;
        AbstractC4516a2.p(C4535c.class, c4535c);
    }

    private C4535c() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C4535c();
        }
        ua uaVar = null;
        if (i11 == 4) {
            return new C4524b(uaVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
