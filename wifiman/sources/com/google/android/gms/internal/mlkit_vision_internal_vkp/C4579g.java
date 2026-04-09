package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4579g extends AbstractC4516a2 implements A2 {
    private static final C4579g zzb;
    private int zzd;
    private int zze;
    private Q8 zzf;
    private String zzg = "";

    static {
        C4579g c4579g = new C4579g();
        zzb = c4579g;
        AbstractC4516a2.p(C4579g.class, c4579g);
    }

    private C4579g() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C4579g();
        }
        AbstractC4557e abstractC4557e = null;
        if (i11 == 4) {
            return new C4568f(abstractC4557e);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
