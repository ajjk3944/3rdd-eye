package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzhdt extends zzgyv implements zzhah {
    private static final zzhdt zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzhds zze;
    private zzhds zzf;

    static {
        zzhdt zzhdtVar = new zzhdt();
        zza = zzhdtVar;
        zzgyv.zzbZ(zzhdt.class, zzhdtVar);
    }

    private zzhdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhdq.zza, "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhdt();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhdp(zzhfeVar);
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
        synchronized (zzhdt.class) {
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
