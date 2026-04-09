package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhco extends zzgyv implements zzhah {
    private static final zzhco zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgxn zzf = zzgxn.zzb;

    static {
        zzhco zzhcoVar = new zzhco();
        zza = zzhcoVar;
        zzgyv.zzbZ(zzhco.class, zzhcoVar);
    }

    private zzhco() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhcn.zza, "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhco();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhcm(zzhfeVar);
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
        synchronized (zzhco.class) {
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
