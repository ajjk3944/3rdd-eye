package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.work.s;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzrj implements zzqr {
    final /* synthetic */ zzro zza;

    public /* synthetic */ zzrj(zzro zzroVar, zzrn zzrnVar) {
        this.zza = zzroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zza(long j4) {
        zzea.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j4);
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zzb(long j4) {
        zzro zzroVar = this.zza;
        if (zzroVar.zzq != null) {
            ((zzrs) zzroVar.zzq).zza.zzc.zzx(j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zzc(long j4, long j10, long j11, long j12) {
        zzro zzroVar = this.zza;
        long jZzL = zzroVar.zzL();
        long jZzM = zzroVar.zzM();
        StringBuilder sbJ = s.j("Spurious audio timestamp (frame position mismatch): ", ", ", j4);
        sbJ.append(j10);
        sbJ.append(", ");
        sbJ.append(j11);
        sbJ.append(", ");
        sbJ.append(j12);
        sbJ.append(", ");
        sbJ.append(jZzL);
        sbJ.append(", ");
        sbJ.append(jZzM);
        zzea.zzf("DefaultAudioSink", sbJ.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zzd(long j4, long j10, long j11, long j12) {
        zzro zzroVar = this.zza;
        long jZzL = zzroVar.zzL();
        long jZzM = zzroVar.zzM();
        StringBuilder sbJ = s.j("Spurious audio timestamp (system clock mismatch): ", ", ", j4);
        sbJ.append(j10);
        sbJ.append(", ");
        sbJ.append(j11);
        sbJ.append(", ");
        sbJ.append(j12);
        sbJ.append(", ");
        sbJ.append(jZzL);
        sbJ.append(", ");
        sbJ.append(jZzM);
        zzea.zzf("DefaultAudioSink", sbJ.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqr
    public final void zze(int i, long j4) {
        zzro zzroVar = this.zza;
        if (zzroVar.zzq != null) {
            ((zzrs) zzroVar.zzq).zza.zzc.zzz(i, j4, SystemClock.elapsedRealtime() - zzroVar.zzW);
        }
    }
}
