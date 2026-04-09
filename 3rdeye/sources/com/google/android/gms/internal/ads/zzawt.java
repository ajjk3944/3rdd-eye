package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzawt implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawv zzb;

    public zzawt(zzawv zzawvVar, int i, boolean z10) {
        this.zza = i;
        this.zzb = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzato zzatoVarZza;
        int i = this.zza;
        zzawv zzawvVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzawvVar.zza;
            zzatoVarZza = zzfoh.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzatoVarZza = null;
        }
        zzawv zzawvVar2 = this.zzb;
        zzawvVar2.zzk = zzatoVarZza;
        int i10 = this.zza;
        if (i10 < 4) {
            if (zzatoVarZza != null && zzatoVarZza.zzaf() && !zzatoVarZza.zzg().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzatoVarZza.zzag() && zzatoVarZza.zzf().zzg() && zzatoVarZza.zzf().zza() != -2) {
                return;
            }
            zzawvVar2.zzn(i10 + 1, true);
        }
    }
}
