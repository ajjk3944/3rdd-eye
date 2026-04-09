package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4589g9 extends AbstractC4516a2 implements A2 {
    private static final C4589g9 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        C4589g9 c4589g9 = new C4589g9();
        zzb = c4589g9;
        AbstractC4516a2.p(C4589g9.class, c4589g9);
    }

    private C4589g9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C4589g9();
        }
        AbstractC4556d9 abstractC4556d9 = null;
        if (i11 == 4) {
            return new C4578f9(abstractC4556d9);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
