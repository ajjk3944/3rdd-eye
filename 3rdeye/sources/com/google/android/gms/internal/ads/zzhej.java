package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhej extends zzgyv implements zzhah {
    private static final zzhej zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzhdk zzf;
    private zzhdo zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzgzd zzi = zzgyv.zzbG();
    private String zzj = "";
    private zzgzh zzl = zzgyv.zzbK();

    static {
        zzhej zzhejVar = new zzhej();
        zza = zzhejVar;
        zzgyv.zzbZ(zzhej.class, zzhejVar);
    }

    private zzhej() {
    }

    public static zzhei zzd() {
        return (zzhei) zza.zzaZ();
    }

    public static /* synthetic */ void zzh(zzhej zzhejVar, String str) {
        str.getClass();
        zzgzh zzgzhVar = zzhejVar.zzl;
        if (!zzgzhVar.zzc()) {
            zzhejVar.zzl = zzgyv.zzbL(zzgzhVar);
        }
        zzhejVar.zzl.add(str);
    }

    public static /* synthetic */ void zzi(zzhej zzhejVar, int i) {
        zzhejVar.zzc |= 1;
        zzhejVar.zzd = i;
    }

    public static /* synthetic */ void zzj(zzhej zzhejVar, zzhdk zzhdkVar) {
        zzhdkVar.getClass();
        zzhejVar.zzf = zzhdkVar;
        zzhejVar.zzc |= 4;
    }

    public static /* synthetic */ void zzk(zzhej zzhejVar, String str) {
        str.getClass();
        zzhejVar.zzc |= 2;
        zzhejVar.zze = str;
    }

    public static /* synthetic */ void zzl(zzhej zzhejVar, int i) {
        zzhejVar.zzk = i - 1;
        zzhejVar.zzc |= 64;
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        zzhfe zzhfeVar = null;
        switch (zzgyuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyv.zzbQ(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzheg.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhej();
            case NEW_BUILDER:
                return new zzhei(zzhfeVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhao zzhaoVar = zzb;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zzhej.class) {
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
            default:
                throw null;
        }
    }

    public final String zzg() {
        return this.zze;
    }
}
