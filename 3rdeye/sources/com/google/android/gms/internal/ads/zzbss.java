package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzbss {
    private final zzcfe zza;
    private final String zzb;

    public zzbss(zzcfe zzcfeVar, String str) {
        this.zza = zzcfeVar;
        this.zzb = str;
    }

    public final void zzg(int i, int i10, int i11, int i12) throws JSONException {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e4) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching default position.", e4);
        }
    }

    public final void zzh(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.zzb);
            zzcfe zzcfeVar = this.zza;
            if (zzcfeVar != null) {
                zzcfeVar.zze("onError", jSONObjectPut);
            }
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching error event.", e4);
        }
    }

    public final void zzi(String str) throws JSONException {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching ready Event.", e4);
        }
    }

    public final void zzj(int i, int i10, int i11, int i12, float f10, int i13) throws JSONException {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i10).put("maxSizeWidth", i11).put("maxSizeHeight", i12).put("density", f10).put("rotation", i13));
        } catch (JSONException e4) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while obtaining screen information.", e4);
        }
    }

    public final void zzk(int i, int i10, int i11, int i12) throws JSONException {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i10).put("width", i11).put("height", i12));
        } catch (JSONException e4) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching size change.", e4);
        }
    }

    public final void zzl(String str) throws JSONException {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching state change.", e4);
        }
    }
}
