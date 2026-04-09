package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4679p0 extends AbstractC4516a2 implements A2 {
    private static final C4679p0 zzb;
    private int zzd;
    private B1 zze;
    private B1 zzf;
    private B1 zzg;
    private Y zzh;
    private String zzi;
    private byte zzj = 2;

    static {
        C4679p0 c4679p0 = new C4679p0();
        zzb = c4679p0;
        AbstractC4516a2.p(C4679p0.class, c4679p0);
    }

    private C4679p0() {
        B1 b12 = B1.f35555b;
        this.zze = b12;
        this.zzf = b12;
        this.zzg = b12;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C4679p0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4668o0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
