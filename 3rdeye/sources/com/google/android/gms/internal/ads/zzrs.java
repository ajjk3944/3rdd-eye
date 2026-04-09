package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzrs implements zzql {
    final /* synthetic */ zzru zza;

    public /* synthetic */ zzrs(zzru zzruVar, zzrt zzrtVar) {
        this.zza = zzruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void zza(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            zzru zzruVar = this.zza;
            if (zzruVar.zze != null) {
                zzruVar.zze.zzd(i);
            }
        }
        this.zza.zzc.zzo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzql
    public final void zzb(Exception exc) {
        zzea.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzp(exc);
    }
}
