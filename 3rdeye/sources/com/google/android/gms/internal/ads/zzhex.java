package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhex extends zzgyv implements zzhah {
    private static final zzhex zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgzd zzf = zzgyv.zzbG();
    private zzgzh zzh = zzgyv.zzbK();
    private zzgxn zzi = zzgxn.zzb;

    static {
        zzhex zzhexVar = new zzhex();
        zza = zzhexVar;
        zzgyv.zzbZ(zzhex.class, zzhexVar);
    }

    private zzhex() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhev.class, "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzhex();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhew(zzhfeVar);
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
        synchronized (zzhex.class) {
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
