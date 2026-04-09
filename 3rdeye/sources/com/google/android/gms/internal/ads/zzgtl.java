package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgtl extends zzgyv implements zzhah {
    private static final zzgtl zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;

    static {
        zzgtl zzgtlVar = new zzgtl();
        zza = zzgtlVar;
        zzgyv.zzbZ(zzgtl.class, zzgtlVar);
    }

    private zzgtl() {
    }

    public static zzgtj zzc() {
        return (zzgtj) zza.zzaZ();
    }

    public static zzgtl zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgtc zzb() {
        int i = this.zzc;
        zzgtc zzgtcVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzgtc.SHA224 : zzgtc.SHA512 : zzgtc.SHA256 : zzgtc.SHA384 : zzgtc.SHA1 : zzgtc.UNKNOWN_HASH;
        return zzgtcVar == null ? zzgtc.UNRECOGNIZED : zzgtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzgtl();
        }
        zzgtk zzgtkVar = null;
        if (iOrdinal == 4) {
            return new zzgtj(zzgtkVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhao zzhaoVar = zzb;
        if (zzhaoVar != null) {
            return zzhaoVar;
        }
        synchronized (zzgtl.class) {
            try {
                zzgyqVar = zzb;
                if (zzgyqVar == null) {
                    zzgyqVar = new zzgyq(zza);
                    zzb = zzgyqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgyqVar;
    }
}
