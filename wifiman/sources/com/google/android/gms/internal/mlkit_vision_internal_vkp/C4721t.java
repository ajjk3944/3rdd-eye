package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4721t extends AbstractC4516a2 implements A2 {
    private static final C4721t zzb;
    private int zzd;
    private float zze;
    private float zzf;

    static {
        C4721t c4721t = new C4721t();
        zzb = c4721t;
        AbstractC4516a2.p(C4721t.class, c4721t);
    }

    private C4721t() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C4721t();
        }
        AbstractC4689q abstractC4689q = null;
        if (i11 == 4) {
            return new C4710s(abstractC4689q);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
