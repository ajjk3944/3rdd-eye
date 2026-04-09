package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class I9 extends Y1 implements A2 {
    private static final I9 zzd;
    private int zze;
    private long zzf;
    private Q8 zzg;
    private Y8 zzh;
    private byte zzj = 2;
    private InterfaceC4582g2 zzi = AbstractC4516a2.k();

    static {
        I9 i92 = new I9();
        zzd = i92;
        AbstractC4516a2.p(I9.class, i92);
    }

    private I9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzi", C4545c9.class, "zzh"});
        }
        if (i11 == 3) {
            return new I9();
        }
        G9 g92 = null;
        if (i11 == 4) {
            return new H9(g92);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
