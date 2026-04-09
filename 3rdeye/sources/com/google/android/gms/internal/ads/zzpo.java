package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzpo {
    private final Context zza;
    private final Handler zzb;
    private final zzpk zzc;
    private final BroadcastReceiver zzd;
    private final zzpl zze;
    private zzpj zzf;
    private zzpp zzg;
    private zze zzh;
    private boolean zzi;
    private final zzqy zzj;

    public zzpo(Context context, zzqy zzqyVar, zze zzeVar, zzpp zzppVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzqyVar;
        this.zzh = zzeVar;
        this.zzg = zzppVar;
        Handler handler = new Handler(zzex.zzz(), null);
        this.zzb = handler;
        this.zzc = new zzpk(this, 0 == true ? 1 : 0);
        this.zzd = new zzpm(this, 0 == true ? 1 : 0);
        Uri uriZza = zzpj.zza();
        this.zze = uriZza != null ? new zzpl(this, handler, applicationContext.getContentResolver(), uriZza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzpj zzpjVar) {
        if (!this.zzi || zzpjVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzpjVar;
        this.zzj.zza.zzJ(zzpjVar);
    }

    public final zzpj zzc() {
        if (this.zzi) {
            zzpj zzpjVar = this.zzf;
            zzpjVar.getClass();
            return zzpjVar;
        }
        this.zzi = true;
        zzpl zzplVar = this.zze;
        if (zzplVar != null) {
            zzplVar.zza();
        }
        zzpk zzpkVar = this.zzc;
        if (zzpkVar != null) {
            Context context = this.zza;
            zzcj.zzc(context).registerAudioDeviceCallback(zzpkVar, this.zzb);
        }
        Context context2 = this.zza;
        zzpj zzpjVarZzd = zzpj.zzd(context2, context2.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzpjVarZzd;
        return zzpjVarZzd;
    }

    public final void zzg(zze zzeVar) {
        this.zzh = zzeVar;
        zzj(zzpj.zzc(this.zza, zzeVar, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        zzpp zzppVar = this.zzg;
        if (Objects.equals(audioDeviceInfo, zzppVar == null ? null : zzppVar.zza)) {
            return;
        }
        zzpp zzppVar2 = audioDeviceInfo != null ? new zzpp(audioDeviceInfo) : null;
        this.zzg = zzppVar2;
        zzj(zzpj.zzc(this.zza, this.zzh, zzppVar2));
    }

    public final void zzi() {
        if (this.zzi) {
            this.zzf = null;
            zzpk zzpkVar = this.zzc;
            if (zzpkVar != null) {
                zzcj.zzc(this.zza).unregisterAudioDeviceCallback(zzpkVar);
            }
            this.zza.unregisterReceiver(this.zzd);
            zzpl zzplVar = this.zze;
            if (zzplVar != null) {
                zzplVar.zzb();
            }
            this.zzi = false;
        }
    }
}
