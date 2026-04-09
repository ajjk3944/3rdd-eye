package com.google.android.gms.measurement.internal;

import N7.C1094a9;
import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoz;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzkh {
    final /* synthetic */ zzki zza;

    public zzkh(zzki zzkiVar) {
        this.zza = zzkiVar;
    }

    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzs.zzm().zzk(this.zza.zzs.zzav().currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                C1094a9.j(this.zza.zzs, "Detected application was in foreground");
                zzc(this.zza.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j4, boolean z10) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j4)) {
            this.zza.zzs.zzm().zzg.zza(true);
            zzoz.zzc();
            if (this.zza.zzs.zzf().zzs(null, zzeb.zzas)) {
                this.zza.zzs.zzh().zzo();
            }
        }
        this.zza.zzs.zzm().zzj.zzb(j4);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j4, z10);
        }
    }

    @VisibleForTesting
    public final void zzc(long j4, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j4);
            this.zza.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzs.zzav().elapsedRealtime()));
            long j10 = j4 / 1000;
            this.zza.zzs.zzq().zzY("auto", "_sid", Long.valueOf(j10), j4);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            if (this.zza.zzs.zzf().zzs(null, zzeb.zzZ) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzs.zzq().zzH("auto", "_s", j4, bundle);
            zznv.zzc();
            if (this.zza.zzs.zzf().zzs(null, zzeb.zzac)) {
                String strZza = this.zza.zzs.zzm().zzo.zza();
                if (TextUtils.isEmpty(strZza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strZza);
                this.zza.zzs.zzq().zzH("auto", "_ssr", j4, bundle2);
            }
        }
    }
}
