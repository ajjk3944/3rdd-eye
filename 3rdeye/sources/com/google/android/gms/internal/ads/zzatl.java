package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzatl extends zzgyv implements zzhah {
    private static final zzatl zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzatl zzatlVar = new zzatl();
        zza = zzatlVar;
        zzgyv.zzbZ(zzatl.class, zzatlVar);
    }

    private zzatl() {
    }

    public static zzatk zza() {
        return (zzatk) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzatl zzatlVar) {
        zzatlVar.zzc &= -9;
        zzatlVar.zzg = -1L;
    }

    public static /* synthetic */ void zzd(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 8;
        zzatlVar.zzg = j4;
    }

    public static /* synthetic */ void zzf(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 32;
        zzatlVar.zzi = j4;
    }

    public static /* synthetic */ void zzg(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 4096;
        zzatlVar.zzp = j4;
    }

    public static /* synthetic */ void zzh(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzatlVar.zzm = j4;
    }

    public static /* synthetic */ void zzi(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 2048;
        zzatlVar.zzo = j4;
    }

    public static /* synthetic */ void zzj(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 4;
        zzatlVar.zzf = j4;
    }

    public static /* synthetic */ void zzk(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 16;
        zzatlVar.zzh = j4;
    }

    public static /* synthetic */ void zzl(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 128;
        zzatlVar.zzk = j4;
    }

    public static /* synthetic */ void zzm(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 131072;
        zzatlVar.zzy = j4;
    }

    public static /* synthetic */ void zzn(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 1;
        zzatlVar.zzd = j4;
    }

    public static /* synthetic */ void zzo(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 262144;
        zzatlVar.zzz = j4;
    }

    public static /* synthetic */ void zzp(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 2;
        zzatlVar.zze = j4;
    }

    public static /* synthetic */ void zzq(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 256;
        zzatlVar.zzl = j4;
    }

    public static /* synthetic */ void zzr(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= Constants.QUEUE_ELEMENT_MAX_SIZE;
        zzatlVar.zzw = j4;
    }

    public static /* synthetic */ void zzs(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 65536;
        zzatlVar.zzx = j4;
    }

    public static /* synthetic */ void zzt(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 8192;
        zzatlVar.zzu = j4;
    }

    public static /* synthetic */ void zzu(zzatl zzatlVar, long j4) {
        zzatlVar.zzc |= 16384;
        zzatlVar.zzv = j4;
    }

    public static /* synthetic */ void zzv(zzatl zzatlVar, int i) {
        zzatlVar.zzn = i - 1;
        zzatlVar.zzc |= 1024;
    }

    public static /* synthetic */ void zzw(zzatl zzatlVar, int i) {
        zzatlVar.zzj = i - 1;
        zzatlVar.zzc |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzgzb zzgzbVar = zzatw.zza;
            return zzgyv.zzbQ(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgzbVar, "zzk", "zzl", "zzm", "zzn", zzgzbVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        if (iOrdinal == 3) {
            return new zzatl();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzatk(zzaugVar);
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
        synchronized (zzatl.class) {
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
