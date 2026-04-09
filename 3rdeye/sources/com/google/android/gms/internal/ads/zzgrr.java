package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgrr extends zzgyv implements zzhah {
    private static final zzgrr zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgrx zzd;
    private zzgti zze;

    static {
        zzgrr zzgrrVar = new zzgrr();
        zza = zzgrrVar;
        zzgyv.zzbZ(zzgrr.class, zzgrrVar);
    }

    private zzgrr() {
    }

    public static zzgrp zza() {
        return (zzgrp) zza.zzaZ();
    }

    public static zzgrr zzc(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
        return (zzgrr) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzg(zzgrr zzgrrVar, zzgrx zzgrxVar) {
        zzgrxVar.getClass();
        zzgrrVar.zzd = zzgrxVar;
        zzgrrVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgrr zzgrrVar, zzgti zzgtiVar) {
        zzgtiVar.getClass();
        zzgrrVar.zze = zzgtiVar;
        zzgrrVar.zzc |= 2;
    }

    public final zzgrx zzd() {
        zzgrx zzgrxVar = this.zzd;
        return zzgrxVar == null ? zzgrx.zzd() : zzgrxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgrr();
        }
        zzgrq zzgrqVar = null;
        if (iOrdinal == 4) {
            return new zzgrp(zzgrqVar);
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
        synchronized (zzgrr.class) {
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

    public final zzgti zzf() {
        zzgti zzgtiVar = this.zze;
        return zzgtiVar == null ? zzgti.zzf() : zzgtiVar;
    }
}
