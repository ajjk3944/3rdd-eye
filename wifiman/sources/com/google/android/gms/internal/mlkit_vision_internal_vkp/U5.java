package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class U5 extends AbstractC4516a2 implements A2 {
    private static final U5 zzb;
    private int zzd;
    private Object zzf;
    private N5 zzg;
    private int zze = 0;
    private C4724t2 zzm = C4724t2.d();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private InterfaceC4582g2 zzk = AbstractC4516a2.k();
    private InterfaceC4582g2 zzl = AbstractC4516a2.k();
    private InterfaceC4582g2 zzn = AbstractC4516a2.k();

    static {
        U5 u52 = new U5();
        zzb = u52;
        AbstractC4516a2.p(U5.class, u52);
    }

    private U5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0000\t\u0001\u0001\u0001\u000b\t\u0001\u0003\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b\u0004\u001b\u0005<\u0000\b2\t\u001b\nȈ\u000bȈ", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzk", R5.class, "zzl", T5.class, L5.class, "zzm", O5.f35621a, "zzn", C4669o1.class, "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new U5();
        }
        E5 e52 = null;
        if (i11 == 4) {
            return new P5(e52);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
