package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class M3 extends Y1 implements A2 {
    private static final M3 zzd;
    private int zze;
    private Object zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzf = 0;
    private byte zzl = 2;
    private String zzh = "";

    static {
        M3 m32 = new M3();
        zzd = m32;
        AbstractC4516a2.p(M3.class, m32);
    }

    private M3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzd, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006=\u0000\u0007=\u0000\b6\u0000", new Object[]{"zzg", "zzf", "zze", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new M3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new L3(abstractC4758w3);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
