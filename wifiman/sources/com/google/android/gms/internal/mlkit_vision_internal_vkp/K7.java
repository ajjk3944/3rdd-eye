package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class K7 extends AbstractC4516a2 implements A2 {
    private static final K7 zzb;
    private int zzd;
    private float zzf;
    private String zze = "";
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();
    private InterfaceC4582g2 zzh = AbstractC4516a2.k();

    static {
        K7 k72 = new K7();
        zzb = k72;
        AbstractC4516a2.p(K7.class, k72);
    }

    private K7() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0004\u0005\u0000\u0000\u0001\u007f\u0005\u0000\u0002\u0000\u0001\f\u0002Ȉ\u0003\u0001\u0004Ț\u007fȚ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new K7();
        }
        AbstractC4513a abstractC4513a = null;
        if (i11 == 4) {
            return new C4547d0(abstractC4513a);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
