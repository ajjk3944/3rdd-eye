package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.s7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4718s7 extends AbstractC4516a2 implements A2 {
    private static final C4718s7 zzb;
    private Object zze;
    private int zzd = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C4718s7 c4718s7 = new C4718s7();
        zzb = c4718s7;
        AbstractC4516a2.p(C4718s7.class, c4718s7);
    }

    private C4718s7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003=\u0000\u0004Ȉ\u0005Ȉ", new Object[]{"zze", "zzd", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4718s7();
        }
        AbstractC4697q7 abstractC4697q7 = null;
        if (i11 == 4) {
            return new C4707r7(abstractC4697q7);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
