package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamz implements zzamx {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzaez zzc;
    private final zzaop zzd;
    private final String zze;
    private final zzen zzf;
    private final zzanp zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzamy zzi = new zzamy(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzamz(zzaop zzaopVar, String str) {
        zzen zzenVar;
        this.zzd = zzaopVar;
        this.zze = str;
        if (zzaopVar != null) {
            this.zzg = new zzanp(178, 128);
            zzenVar = new zzen();
        } else {
            zzenVar = null;
            this.zzg = null;
        }
        this.zzf = zzenVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r29) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamz.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzb = zzaolVar.zzb();
        this.zzc = zzadwVar.zzw(zzaolVar.zza(), 2);
        zzaop zzaopVar = this.zzd;
        if (zzaopVar != null) {
            zzaopVar.zzc(zzadwVar, zzaolVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
        zzdd.zzb(this.zzc);
        if (z10) {
            boolean z11 = this.zzq;
            long j4 = this.zzj - this.zzo;
            this.zzc.zzt(this.zzp, z11 ? 1 : 0, (int) j4, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzn = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        zzfv.zzi(this.zzh);
        this.zzi.zzb();
        zzanp zzanpVar = this.zzg;
        if (zzanpVar != null) {
            zzanpVar.zzb();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }
}
