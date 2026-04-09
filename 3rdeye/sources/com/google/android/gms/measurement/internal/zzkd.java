package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzkd implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzke zzc;

    public zzkd(zzke zzkeVar, long j4, long j10) {
        this.zzc = zzkeVar;
        this.zza = j4;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzc.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                zzkd zzkdVar = this.zza;
                zzke zzkeVar = zzkdVar.zzc;
                long j4 = zzkdVar.zza;
                long j10 = zzkdVar.zzb;
                zzkeVar.zza.zzg();
                zzkeVar.zza.zzs.zzay().zzc().zza("Application going to the background");
                zzkeVar.zza.zzs.zzm().zzl.zza(true);
                Bundle bundle = new Bundle();
                if (!zzkeVar.zza.zzs.zzf().zzu()) {
                    zzkeVar.zza.zzb.zzb(j10);
                    zzkeVar.zza.zzb.zzd(false, false, j10);
                }
                zzkeVar.zza.zzs.zzq().zzH("auto", "_ab", j4, bundle);
            }
        });
    }
}
