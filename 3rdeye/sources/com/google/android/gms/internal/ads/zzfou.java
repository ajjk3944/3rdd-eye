package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfou extends zzgyv implements zzhah {
    private static final zzfou zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgzd zzd = zzgyv.zzbG();
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzfou zzfouVar = new zzfou();
        zza = zzfouVar;
        zzgyv.zzbZ(zzfou.class, zzfouVar);
    }

    private zzfou() {
    }

    public static zzfos zza() {
        return (zzfos) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfou zzfouVar, String str) {
        str.getClass();
        zzfouVar.zzc |= 1;
        zzfouVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfou zzfouVar, int i) {
        zzgzd zzgzdVar = zzfouVar.zzd;
        if (!zzgzdVar.zzc()) {
            zzfouVar.zzd = zzgyv.zzbH(zzgzdVar);
        }
        zzfouVar.zzd.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfor.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzfou();
        }
        zzfot zzfotVar = null;
        if (iOrdinal == 4) {
            return new zzfos(zzfotVar);
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
        synchronized (zzfou.class) {
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
