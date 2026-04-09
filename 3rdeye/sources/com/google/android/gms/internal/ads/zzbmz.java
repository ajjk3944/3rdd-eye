package com.google.android.gms.internal.ads;

import j6.l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbmz {
    public static void zza(zzbna zzbnaVar, String str, Map map) {
        try {
            zzbnaVar.zze(str, com.google.android.gms.ads.internal.client.zzbb.zzb().zzo(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbna zzbnaVar, String str, JSONObject jSONObject) {
        StringBuilder sbD = l.d("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbD.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Dispatching AFMA event: ".concat(string));
        zzbnaVar.zza(sbD.toString());
    }

    public static void zzc(zzbna zzbnaVar, String str, String str2) {
        zzbnaVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbna zzbnaVar, String str, JSONObject jSONObject) {
        zzbnaVar.zzb(str, jSONObject.toString());
    }
}
