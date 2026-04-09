package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class K4 extends Y1 implements A2 {
    private static final K4 zzd;
    private int zze;
    private B4 zzf;
    private float zzh;
    private float zzi;
    private B4 zzl;
    private C4726t4 zzm;
    private byte zzo = 2;
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();
    private InterfaceC4582g2 zzj = AbstractC4516a2.k();
    private B1 zzk = B1.f35555b;
    private InterfaceC4582g2 zzn = AbstractC4516a2.k();

    static {
        K4 k42 = new K4();
        zzd = k42;
        AbstractC4516a2.p(K4.class, k42);
    }

    private K4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzd, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004\u001b\u0005ᐉ\u0005\u0006\u001b\u0007ည\u0003\bဉ\u0004\tခ\u0002", new Object[]{"zze", "zzf", "zzg", J4.class, "zzh", "zzj", E4.class, "zzm", "zzn", C4792z4.class, "zzk", "zzl", "zzi"});
        }
        if (i11 == 3) {
            return new K4();
        }
        AbstractC4770x4 abstractC4770x4 = null;
        if (i11 == 4) {
            return new C4(abstractC4770x4);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
