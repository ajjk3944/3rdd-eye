package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzrl extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzrm zza;

    public zzrl(zzrm zzrmVar) {
        this.zza = zzrmVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        audioTrack.equals(this.zza.zza.zzu);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzro zzroVar = this.zza.zza;
        if (audioTrack.equals(zzroVar.zzu)) {
            zzroVar.zzR = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.zza.zza.zzu);
    }
}
