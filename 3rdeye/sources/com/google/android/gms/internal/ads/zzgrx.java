package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgrx extends zzgyv implements zzhah {
    private static final zzgrx zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgsa zzd;
    private int zze;

    static {
        zzgrx zzgrxVar = new zzgrx();
        zza = zzgrxVar;
        zzgyv.zzbZ(zzgrx.class, zzgrxVar);
    }

    private zzgrx() {
    }

    public static zzgrv zzb() {
        return (zzgrv) zza.zzaZ();
    }

    public static zzgrx zzd() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgrx zzgrxVar, zzgsa zzgsaVar) {
        zzgsaVar.getClass();
        zzgrxVar.zzd = zzgsaVar;
        zzgrxVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgrx();
        }
        zzgrw zzgrwVar = null;
        if (iOrdinal == 4) {
            return new zzgrv(zzgrwVar);
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
        synchronized (zzgrx.class) {
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

    public final zzgsa zzf() {
        zzgsa zzgsaVar = this.zzd;
        return zzgsaVar == null ? zzgsa.zzd() : zzgsaVar;
    }
}
