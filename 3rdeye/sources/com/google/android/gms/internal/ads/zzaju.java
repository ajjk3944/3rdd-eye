package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaju implements zzaka {
    private final zzajz zza;
    private final long zzb;
    private final long zzc;
    private final zzakf zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaju(zzakf zzakfVar, long j4, long j10, long j11, long j12, boolean z10) {
        zzdd.zzd(j4 >= 0 && j10 > j4);
        this.zzd = zzakfVar;
        this.zzb = j4;
        this.zzc = j10;
        if (j11 == j10 - j4 || z10) {
            this.zzf = j12;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajz();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzaka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzadu r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaju.zzd(com.google.android.gms.internal.ads.zzadu):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* bridge */ /* synthetic */ zzaes zze() {
        zzajt zzajtVar = null;
        if (this.zzf != 0) {
            return new zzajs(this, zzajtVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzg(long j4) {
        long j10 = this.zzf - 1;
        String str = zzex.zza;
        this.zzh = Math.max(0L, Math.min(j4, j10));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
