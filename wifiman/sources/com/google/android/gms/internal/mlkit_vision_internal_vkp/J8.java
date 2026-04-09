package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class J8 extends AbstractC4516a2 implements A2 {
    private static final J8 zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private long zzj;
    private int zzl;
    private int zze = 0;
    private String zzh = "";
    private InterfaceC4582g2 zzi = AbstractC4516a2.k();
    private String zzk = "";

    static {
        J8 j82 = new J8();
        zzb = j82;
        AbstractC4516a2.p(J8.class, j82);
    }

    private J8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဈ\u0003\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\nဂ\u0002\u000b᠌\u0004", new Object[]{"zzf", "zze", "zzd", "zzg", K8.f35608a, "zzh", "zzi", I8.class, "zzk", P7.class, A.class, M7.class, D.class, W7.class, "zzj", "zzl", F8.f35586a});
        }
        if (i11 == 3) {
            return new J8();
        }
        D8 d82 = null;
        if (i11 == 4) {
            return new G8(d82);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
