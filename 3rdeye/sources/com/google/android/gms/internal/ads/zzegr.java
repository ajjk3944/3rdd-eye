package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzegr implements zzgcx {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfbw zzb;
    final /* synthetic */ zzfbt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjm zze;
    final /* synthetic */ zzfcf zzf;
    final /* synthetic */ zzegt zzg;

    public zzegr(zzegt zzegtVar, long j4, zzfbw zzfbwVar, zzfbt zzfbtVar, String str, zzfjm zzfjmVar, zzfcf zzfcfVar) {
        this.zza = j4;
        this.zzb = zzfbwVar;
        this.zzc = zzfbtVar;
        this.zzd = str;
        this.zze = zzfjmVar;
        this.zzf = zzfcfVar;
        this.zzg = zzegtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgcx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegr.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        long j4;
        zzegt zzegtVar = this.zzg;
        long jElapsedRealtime = zzegtVar.zza.elapsedRealtime() - this.zza;
        synchronized (zzegtVar) {
            try {
                if (zzegtVar.zze) {
                    j4 = jElapsedRealtime;
                    zzegtVar.zzb.zza(this.zzb, this.zzc, 0, null, j4);
                } else {
                    j4 = jElapsedRealtime;
                }
                if (zzegtVar.zzg) {
                    return;
                }
                zzfbt zzfbtVar = this.zzc;
                if (zzegtVar.zzq(zzfbtVar)) {
                    ((zzegs) zzegtVar.zzd.get(zzfbtVar)).zzd = j4;
                } else {
                    long j10 = j4;
                    j4 = j10;
                    zzegtVar.zzd.put(zzfbtVar, new zzegs(this.zzd, zzfbtVar.zzaf, 0, j10, null));
                }
                zzegtVar.zzf.zzg(zzfbtVar, j4, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
