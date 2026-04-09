package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdmy implements zzbgb {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdmz zzb;

    public zzdmy(zzdmz zzdmzVar, String str) {
        this.zzb = zzdmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzc() {
        zzdmz zzdmzVar = this.zzb;
        if (zzdmzVar.zzd != null) {
            zzdmzVar.zzd.zzF(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zzd(MotionEvent motionEvent) {
    }
}
