package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzenw implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzenw(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzenx zzc(zzenw zzenwVar) {
        int i;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) zzenwVar.zzb.getSystemService("audio");
        float fZza = com.google.android.gms.ads.internal.zzv.zzt().zza();
        boolean zZze = com.google.android.gms.ads.internal.zzv.zzt().zze();
        if (audioManager == null) {
            return new zzenx(-1, false, false, -1, -1, -1, -1, -1, fZza, zZze, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlk)).booleanValue()) {
            int iZzj = com.google.android.gms.ads.internal.zzv.zzs().zzj(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i = iZzj;
        } else {
            i = -1;
            streamMaxVolume = -1;
        }
        return new zzenx(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZza, zZze, false);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenw.zzc(this.zza);
            }
        });
    }
}
