package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcgy {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgy(int i, int i10, int i11) {
        this.zzc = i;
        this.zzb = i10;
        this.zza = i11;
    }

    public static zzcgy zza() {
        return new zzcgy(0, 0, 0);
    }

    public static zzcgy zzb(int i, int i10) {
        return new zzcgy(1, i, i10);
    }

    public static zzcgy zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.zzd ? new zzcgy(3, 0, 0) : zzrVar.zzi ? new zzcgy(2, 0, 0) : zzrVar.zzh ? new zzcgy(0, 0, 0) : new zzcgy(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcgy zzd() {
        return new zzcgy(5, 0, 0);
    }

    public static zzcgy zze() {
        return new zzcgy(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
