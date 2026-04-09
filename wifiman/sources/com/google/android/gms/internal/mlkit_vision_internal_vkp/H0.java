package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class H0 extends AbstractC4516a2 implements A2 {
    private static final H0 zzb;
    private int zzd;
    private int zze;
    private Y zzg;
    private Y zzh;
    private float zzj;
    private Y zzl;
    private Y zzm;
    private C4679p0 zzn;
    private L0 zzp;
    private byte zzq = 2;
    private InterfaceC4560e2 zzf = AbstractC4516a2.i();
    private String zzi = "";
    private InterfaceC4582g2 zzk = AbstractC4516a2.k();
    private boolean zzo = true;

    static {
        H0 h02 = new H0();
        zzb = h02;
        AbstractC4516a2.p(H0.class, h02);
    }

    private H0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzq);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\b\u0001ᔄ\u0000\u0002ᔉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ခ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဇ\b\nᐉ\t\u000bЛ\f\u0016", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzk", C4536c0.class, "zzf"});
        }
        if (i11 == 3) {
            return new H0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new G0(w10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzq = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
