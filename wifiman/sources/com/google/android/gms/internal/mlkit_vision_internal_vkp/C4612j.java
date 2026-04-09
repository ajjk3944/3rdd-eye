package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4612j extends AbstractC4516a2 implements A2 {
    private static final C4612j zzb;
    private InterfaceC4582g2 zzd = AbstractC4516a2.k();

    static {
        C4612j c4612j = new C4612j();
        zzb = c4612j;
        AbstractC4516a2.p(C4612j.class, c4612j);
    }

    private C4612j() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4579g.class});
        }
        if (i11 == 3) {
            return new C4612j();
        }
        AbstractC4590h abstractC4590h = null;
        if (i11 == 4) {
            return new C4601i(abstractC4590h);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
