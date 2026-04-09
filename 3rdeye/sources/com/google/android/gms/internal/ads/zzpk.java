package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzpk extends AudioDeviceCallback {
    final /* synthetic */ zzpo zza;

    public /* synthetic */ zzpk(zzpo zzpoVar, zzpn zzpnVar) {
        this.zza = zzpoVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpo zzpoVar = this.zza;
        zzpoVar.zzj(zzpj.zzc(zzpoVar.zza, zzpoVar.zzh, zzpoVar.zzg));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpo zzpoVar = this.zza;
        zzpp zzppVar = zzpoVar.zzg;
        String str = zzex.zza;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], zzppVar)) {
                zzpoVar.zzg = null;
                break;
            }
            i++;
        }
        zzpoVar.zzj(zzpj.zzc(zzpoVar.zza, zzpoVar.zzh, zzpoVar.zzg));
    }
}
