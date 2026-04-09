package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzguw extends zzgyv implements zzhah {
    public static final /* synthetic */ int zza = 0;
    private static final zzguw zzb;
    private static volatile zzhao zzc;
    private String zzd = "";
    private zzgzh zze = zzgyv.zzbK();

    static {
        zzguw zzguwVar = new zzguw();
        zzb = zzguwVar;
        zzgyv.zzbZ(zzguw.class, zzguwVar);
    }

    private zzguw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgtw.class});
        }
        if (iOrdinal == 3) {
            return new zzguw();
        }
        zzguv zzguvVar = null;
        if (iOrdinal == 4) {
            return new zzguu(zzguvVar);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhao zzhaoVar = zzc;
        if (zzhaoVar != null) {
            return zzhaoVar;
        }
        synchronized (zzguw.class) {
            try {
                zzgyqVar = zzc;
                if (zzgyqVar == null) {
                    zzgyqVar = new zzgyq(zzb);
                    zzc = zzgyqVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgyqVar;
    }
}
