package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaub extends zzgyv implements zzhah {
    private static final zzaub zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zzd;
    private String zze = "";
    private zzgxn zzf = zzgxn.zzb;

    static {
        zzaub zzaubVar = new zzaub();
        zza = zzaubVar;
        zzgyv.zzbZ(zzaub.class, zzaubVar);
    }

    private zzaub() {
    }

    public static zzaub zzc() {
        return zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzgxn zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzaub();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzaua(zzaugVar);
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
        synchronized (zzaub.class) {
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

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return (this.zzc & 1) != 0;
    }
}
