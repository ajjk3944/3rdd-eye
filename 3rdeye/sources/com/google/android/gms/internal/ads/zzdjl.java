package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdjl implements zzbgb {
    final /* synthetic */ zzdkk zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdjl(zzdkk zzdkkVar, ViewGroup viewGroup) {
        this.zza = zzdkkVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzc() {
        zzfyf zzfyfVar = zzdji.zza;
        zzdkk zzdkkVar = this.zza;
        Map mapZzm = zzdkkVar.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzfyfVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzm.get((String) zzfyfVar.get(i));
            i++;
            if (obj != null) {
                zzdkkVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
