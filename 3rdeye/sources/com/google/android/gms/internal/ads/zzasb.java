package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzasb extends zzgyv implements zzhah {
    private static final zzasb zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzgzh zzo = zzgyv.zzbK();

    static {
        zzasb zzasbVar = new zzasb();
        zza = zzasbVar;
        zzgyv.zzbZ(zzasb.class, zzasbVar);
    }

    private zzasb() {
    }

    public static zzarx zza() {
        return (zzarx) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasb zzasbVar, String str) {
        str.getClass();
        zzasbVar.zzc |= 1;
        zzasbVar.zzd = str;
    }

    public static /* synthetic */ void zzd(zzasb zzasbVar, String str) {
        zzasbVar.zzc |= 16;
        zzasbVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzasb zzasbVar, String str) {
        zzasbVar.zzc |= 1024;
        zzasbVar.zzn = str;
    }

    public static /* synthetic */ void zzg(zzasb zzasbVar, String str) {
        str.getClass();
        zzasbVar.zzc |= 8;
        zzasbVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzasb zzasbVar, long j4) {
        zzasbVar.zzc |= 2;
        zzasbVar.zze = j4;
    }

    public static /* synthetic */ void zzi(zzasb zzasbVar, String str) {
        str.getClass();
        zzasbVar.zzc |= 4;
        zzasbVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzasb zzasbVar, int i) {
        zzasbVar.zzp = i - 1;
        zzasbVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzarz.class, "zzp", zzasa.zza});
        }
        if (iOrdinal == 3) {
            return new zzasb();
        }
        zzasc zzascVar = null;
        if (iOrdinal == 4) {
            return new zzarx(zzascVar);
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
        synchronized (zzasb.class) {
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
