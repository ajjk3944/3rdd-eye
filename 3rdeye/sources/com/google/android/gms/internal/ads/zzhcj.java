package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhcj extends zzgyv implements zzhah {
    private static final zzhcj zza;
    private static volatile zzhao zzb;
    private zzgzh zzc = zzgyv.zzbK();

    static {
        zzhcj zzhcjVar = new zzhcj();
        zza = zzhcjVar;
        zzgyv.zzbZ(zzhcj.class, zzhcjVar);
    }

    private zzhcj() {
    }

    public static zzhci zzc() {
        return (zzhci) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhcj zzhcjVar, zzhch zzhchVar) {
        zzhchVar.getClass();
        zzgzh zzgzhVar = zzhcjVar.zzc;
        if (!zzgzhVar.zzc()) {
            zzhcjVar.zzc = zzgyv.zzbL(zzgzhVar);
        }
        zzhcjVar.zzc.add(zzhchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhch.class});
        }
        if (iOrdinal == 3) {
            return new zzhcj();
        }
        zzhck zzhckVar = null;
        if (iOrdinal == 4) {
            return new zzhci(zzhckVar);
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
        synchronized (zzhcj.class) {
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
