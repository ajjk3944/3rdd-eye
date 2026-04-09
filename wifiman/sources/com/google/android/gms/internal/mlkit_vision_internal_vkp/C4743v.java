package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4743v extends AbstractC4516a2 implements A2 {
    private static final C4743v zzb;
    private int zzd;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private int zzf;
    private int zzg;

    static {
        C4743v c4743v = new C4743v();
        zzb = c4743v;
        AbstractC4516a2.p(C4743v.class, c4743v);
    }

    private C4743v() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000\u0003᠌\u0001", new Object[]{"zzd", "zze", C4721t.class, "zzf", C4732u.f35730a, "zzg", C4678p.f35706a});
        }
        if (i11 == 3) {
            return new C4743v();
        }
        AbstractC4689q abstractC4689q = null;
        if (i11 == 4) {
            return new r(abstractC4689q);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
