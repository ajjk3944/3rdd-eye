package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzqu {
    private final Context zza;
    private Boolean zzb;

    public zzqu() {
        this(null);
    }

    public final zzps zza(zzz zzzVar, zze zzeVar) {
        int i;
        boolean zBooleanValue;
        zzzVar.getClass();
        zzeVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || (i = zzzVar.zzH) == -1) {
            return zzps.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z10 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zzc(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzzVar.zzo;
        str.getClass();
        int iZza = zzay.zza(str, zzzVar.zzk);
        if (iZza == 0 || i10 < zzex.zzh(iZza)) {
            return zzps.zza;
        }
        int iZzi = zzex.zzi(zzzVar.zzG);
        if (iZzi == 0) {
            return zzps.zza;
        }
        try {
            AudioFormat audioFormatZzx = zzex.zzx(i, iZzi, iZza);
            if (i10 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatZzx, zzeVar.zza().zza)) {
                    return zzps.zza;
                }
                zzpq zzpqVar = new zzpq();
                zzpqVar.zza(true);
                zzpqVar.zzc(zBooleanValue);
                return zzpqVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatZzx, zzeVar.zza().zza);
            if (playbackOffloadSupport == 0) {
                return zzps.zza;
            }
            zzpq zzpqVar2 = new zzpq();
            if (i10 > 32 && playbackOffloadSupport == 2) {
                z10 = true;
            }
            zzpqVar2.zza(true);
            zzpqVar2.zzb(z10);
            zzpqVar2.zzc(zBooleanValue);
            return zzpqVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzps.zza;
        }
    }

    public zzqu(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}
