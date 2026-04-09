package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhel extends zzgyv implements zzhah {
    private static final zzhel zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhel zzhelVar = new zzhel();
        zza = zzhelVar;
        zzgyv.zzbZ(zzhel.class, zzhelVar);
    }

    private zzhel() {
    }

    public static zzhek zzc() {
        return (zzhek) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhel zzhelVar, String str) {
        zzhelVar.zzc |= 1;
        zzhelVar.zzd = str;
    }

    public static /* synthetic */ void zzg(zzhel zzhelVar, long j4) {
        zzhelVar.zzc |= 2;
        zzhelVar.zze = j4;
    }

    public static /* synthetic */ void zzh(zzhel zzhelVar, boolean z10) {
        zzhelVar.zzc |= 4;
        zzhelVar.zzf = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhem.zza, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzhel();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhek(zzhfeVar);
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
        synchronized (zzhel.class) {
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
