package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class V3 extends AbstractC4516a2 implements A2 {
    private static final V3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private InterfaceC4582g2 zzj = AbstractC4516a2.k();
    private InterfaceC4582g2 zzk = AbstractC4516a2.k();

    static {
        V3 v32 = new V3();
        zzb = v32;
        AbstractC4516a2.p(V3.class, v32);
    }

    private V3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", U3.class, "zzk", U3.class});
        }
        if (i11 == 3) {
            return new V3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new S3(abstractC4758w3);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
