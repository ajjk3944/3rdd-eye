package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcav implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbd zzb;

    public zzcav(zzcbd zzcbdVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcbdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzcbd zzcbdVar = this.zzb;
        zzcbd.zzm(zzcbdVar, this.zza);
        if (zzcbdVar.zzr != null) {
            zzcbdVar.zzr.zzf();
        }
    }
}
