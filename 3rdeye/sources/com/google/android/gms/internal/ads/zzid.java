package com.google.android.gms.internal.ads;

import N7.C1094a9;
import androidx.work.s;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzid {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i = this.zza;
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        int i13 = this.zze;
        int i14 = this.zzf;
        int i15 = this.zzg;
        int i16 = this.zzh;
        int i17 = this.zzi;
        int i18 = this.zzj;
        long j4 = this.zzk;
        int i19 = this.zzl;
        String str = zzex.zza;
        Locale locale = Locale.US;
        StringBuilder sbI = s.i("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        C1094a9.k(sbI, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        C1094a9.k(sbI, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        C1094a9.k(sbI, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        C1094a9.k(sbI, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        sbI.append(j4);
        sbI.append("\n videoFrameProcessingOffsetCount=");
        sbI.append(i19);
        sbI.append("\n}");
        return sbI.toString();
    }

    public final synchronized void zza() {
    }
}
