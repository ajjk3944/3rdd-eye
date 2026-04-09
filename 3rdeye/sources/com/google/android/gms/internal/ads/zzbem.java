package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public class zzbem {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbem(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbem zza(String str, double d10) {
        return new zzbem(str, Double.valueOf(d10), 3);
    }

    public static zzbem zzb(String str, long j4) {
        return new zzbem(str, Long.valueOf(j4), 2);
    }

    public static zzbem zzc(String str, String str2) {
        return new zzbem("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbem zzd(String str, boolean z10) {
        return new zzbem(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzbfr zzbfrVarZza = zzbft.zza();
        if (zzbfrVarZza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zzbfrVarZza.zzd(this.zza, (String) this.zzb) : zzbfrVarZza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zzbfrVarZza.zzc(this.zza, ((Long) this.zzb).longValue()) : zzbfrVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbft.zzb() != null) {
            zzbft.zzb().zza();
        }
        return this.zzb;
    }
}
