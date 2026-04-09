package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcnd {
    private final String zza;
    private final zzbpd zzb;
    private final Executor zzc;
    private zzcni zzd;
    private final zzbkd zze = new zzcna(this);
    private final zzbkd zzf = new zzcnc(this);

    public zzcnd(String str, zzbpd zzbpdVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbpdVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcnd zzcndVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcndVar.zza);
    }

    public final void zzc(zzcni zzcniVar) {
        zzbpd zzbpdVar = this.zzb;
        zzbpdVar.zzb("/updateActiveView", this.zze);
        zzbpdVar.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcniVar;
    }

    public final void zzd(zzcfe zzcfeVar) {
        zzcfeVar.zzag("/updateActiveView", this.zze);
        zzcfeVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        zzbpd zzbpdVar = this.zzb;
        zzbpdVar.zzc("/updateActiveView", this.zze);
        zzbpdVar.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcfe zzcfeVar) {
        zzcfeVar.zzaz("/updateActiveView", this.zze);
        zzcfeVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
