package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class A extends AbstractC4516a2 implements A2 {
    private static final A zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        A a10 = new A();
        zzb = a10;
        AbstractC4516a2.p(A.class, a10);
    }

    private A() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C4787z.f35737a});
        }
        if (i11 == 3) {
            return new A();
        }
        AbstractC4546d abstractC4546d = null;
        if (i11 == 4) {
            return new C4623k(abstractC4546d);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
