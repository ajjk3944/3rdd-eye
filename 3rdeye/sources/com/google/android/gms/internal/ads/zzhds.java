package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhds extends zzgyv implements zzhah {
    private static final zzhds zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhds zzhdsVar = new zzhds();
        zza = zzhdsVar;
        zzgyv.zzbZ(zzhds.class, zzhdsVar);
    }

    private zzhds() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzgzb zzgzbVar = zzhdq.zza;
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzgzbVar, "zze", "zzf", zzgzbVar});
        }
        if (iOrdinal == 3) {
            return new zzhds();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhdr(zzhfeVar);
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
        synchronized (zzhds.class) {
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
