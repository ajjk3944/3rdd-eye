package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.singular.sdk.internal.SingularParamsBase;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcne implements zzbon {
    private final Context zza;
    private final zzayx zzb;
    private final PowerManager zzc;

    public zzcne(Context context, zzayx zzayxVar) {
        this.zza = context;
        this.zzb = zzayxVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcnh zzcnhVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzaza zzazaVar = zzcnhVar.zzf;
        if (zzazaVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzayx zzayxVar = this.zzb;
            if (zzayxVar.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = zzazaVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzayxVar.zzb()).put("activeViewJSON", zzayxVar.zzd()).put("timestamp", zzcnhVar.zzd).put("adFormat", zzayxVar.zza()).put("hashCode", zzayxVar.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcnhVar.zzb).put("isNative", zzayxVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzv.zzt().zze()).put("appVolume", com.google.android.gms.ads.internal.zzv.zzt().zza());
            Context context = this.zza;
            jSONObjectPut.put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzazaVar.zzb).put("isAttachedToWindow", z10);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzazaVar.zzc;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzazaVar.zzd;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzazaVar.zze;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzazaVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzazaVar.zzg;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzazaVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzazaVar.zzi;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", zzcnhVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbA)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzazaVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcnhVar.zze)) {
                jSONObject3.put("doneReasonCode", SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY);
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
