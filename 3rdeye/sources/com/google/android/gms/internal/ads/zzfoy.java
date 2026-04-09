package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfoy extends zzgyv implements zzhah {
    private static final zzfoy zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfou zzg;

    static {
        zzfoy zzfoyVar = new zzfoy();
        zza = zzfoyVar;
        zzgyv.zzbZ(zzfoy.class, zzfoyVar);
    }

    private zzfoy() {
    }

    public static zzfov zza() {
        return (zzfov) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfoy zzfoyVar, String str) {
        str.getClass();
        zzfoyVar.zzc |= 2;
        zzfoyVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfoy zzfoyVar, zzfou zzfouVar) {
        zzfouVar.getClass();
        zzfoyVar.zzg = zzfouVar;
        zzfoyVar.zzc |= 8;
    }

    public static /* synthetic */ void zzf(zzfoy zzfoyVar, int i) {
        zzfoyVar.zzd = 1;
        zzfoyVar.zzc = 1 | zzfoyVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfow.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzfoy();
        }
        zzfox zzfoxVar = null;
        if (iOrdinal == 4) {
            return new zzfov(zzfoxVar);
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
        synchronized (zzfoy.class) {
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
