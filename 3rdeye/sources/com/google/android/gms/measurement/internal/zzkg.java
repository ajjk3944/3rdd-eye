package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzoe;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzkg {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzki zzc;
    private final zzap zzd;

    public zzkg(zzki zzkiVar) {
        this.zzc = zzkiVar;
        this.zzd = new zzkf(this, zzkiVar.zzs);
        long jElapsedRealtime = zzkiVar.zzs.zzav().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    public final void zzb(long j4) {
        this.zzd.zzb();
    }

    public final void zzc(long j4) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j4;
        this.zzb = j4;
    }

    public final boolean zzd(boolean z10, boolean z11, long j4) {
        this.zzc.zzg();
        this.zzc.zza();
        zzoe.zzc();
        if (!this.zzc.zzs.zzf().zzs(null, zzeb.zzad) || this.zzc.zzs.zzJ()) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
        }
        long j10 = j4 - this.zza;
        if (!z10 && j10 < 1000) {
            this.zzc.zzs.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j10));
            return false;
        }
        if (!z11) {
            j10 = j4 - this.zzb;
            this.zzb = j4;
        }
        this.zzc.zzs.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j10));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        zzlh.zzK(this.zzc.zzs.zzs().zzj(!this.zzc.zzs.zzf().zzu()), bundle, true);
        if (!z11) {
            this.zzc.zzs.zzq().zzG("auto", "_e", bundle);
        }
        this.zza = j4;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
