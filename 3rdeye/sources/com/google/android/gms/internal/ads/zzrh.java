package com.google.android.gms.internal.ads;

import G0.n;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzrh {
    private final AudioTrack zza;
    private final zzpo zzb;
    private AudioRouting$OnRoutingChangedListener zzc = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzrg
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzrh.zza(this.zza, audioRouting);
        }
    };

    public zzrh(AudioTrack audioTrack, zzpo zzpoVar) {
        this.zza = audioTrack;
        this.zzb = zzpoVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    public static /* synthetic */ void zza(zzrh zzrhVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zzrhVar.zzc == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
            return;
        }
        zzrhVar.zzb.zzh(routedDevice);
    }

    public final void zzb() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.zzc;
        audioRouting$OnRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(n.f(audioRouting$OnRoutingChangedListener));
        this.zzc = null;
    }
}
