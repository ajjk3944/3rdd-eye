package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaop implements zzaon {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzagh zzb;

    @Nullable
    private final zzaqf zzd;
    private final String zze;

    @Nullable
    private final zzer zzf;

    @Nullable
    private final zzape zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaoo zzi = new zzaoo(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    public zzaop(@Nullable zzaqf zzaqfVar, String str) {
        zzer zzerVar;
        this.zzd = zzaqfVar;
        this.zze = str;
        if (zzaqfVar != null) {
            this.zzg = new zzape(178, 128);
            zzerVar = new zzer();
        } else {
            zzerVar = null;
            this.zzg = null;
        }
        this.zzf = zzerVar;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzh);
        this.zzi.zza();
        zzape zzapeVar = this.zzg;
        if (zzapeVar != null) {
            zzapeVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zza = zzaqbVar.zzc();
        this.zzb = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        zzaqf zzaqfVar = this.zzd;
        if (zzaqfVar != null) {
            zzaqfVar.zza(zzaexVar, zzaqbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaop.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
        zzagh zzaghVar = this.zzb;
        zzaghVar.getClass();
        if (z10) {
            boolean z11 = this.zzq;
            long j10 = this.zzj - this.zzo;
            zzaghVar.zze(this.zzp, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }
}
