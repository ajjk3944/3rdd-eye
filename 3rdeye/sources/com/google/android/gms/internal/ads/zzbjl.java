package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbjl implements zzbkd {
    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcfe zzcfeVar = (zzcfe) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfto zzftoVarZzl = zzftp.zzl();
        zzftoVarZzl.zzb((String) map.get("appId"));
        zzftoVarZzl.zzh(zzcfeVar.getWidth());
        zzftoVarZzl.zzg(zzcfeVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzftoVarZzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzftoVarZzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzftoVarZzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzftoVarZzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzftoVarZzl.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzk().zzj(zzcfeVar, zzftoVarZzl.zzi());
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
