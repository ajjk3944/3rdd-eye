package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4667o extends AbstractC4516a2 implements A2 {
    private static final C4667o zzb;
    private int zzd;
    private C4743v zze;
    private float zzf;
    private int zzg;
    private boolean zzh;

    static {
        C4667o c4667o = new C4667o();
        zzb = c4667o;
        AbstractC4516a2.p(C4667o.class, c4667o);
    }

    private C4667o() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C4656n.f35702a, "zzh"});
        }
        if (i11 == 3) {
            return new C4667o();
        }
        AbstractC4634l abstractC4634l = null;
        if (i11 == 4) {
            return new C4645m(abstractC4634l);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
