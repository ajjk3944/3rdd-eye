package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdei;
import com.google.android.gms.internal.ads.zzdrw;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzw implements zzdei {
    private final zzdrw zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    public zzw(zzdrw zzdrwVar, zzv zzvVar, String str, int i) {
        this.zza = zzdrwVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(zzbk zzbkVar) {
        String strOptString;
        if (zzbkVar == null || this.zzd == 2) {
            return;
        }
        if (TextUtils.isEmpty(zzbkVar.zzc)) {
            this.zzb.zze(this.zzc, zzbkVar.zzb, this.zza);
            return;
        }
        try {
            strOptString = new JSONObject(zzbkVar.zzc).optString(CommonUrlParts.REQUEST_ID);
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.zzb.zze(strOptString, zzbkVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
    }
}
