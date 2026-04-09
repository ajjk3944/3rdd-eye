package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.singular.sdk.internal.Constants;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzfmp {
    private final String zza;
    private zzfnr zzb;
    private long zzc;
    private int zzd;

    public zzfmp(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfnr(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j4) {
        if (j4 < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfmg.zza().zzh(zza(), this.zza, str);
    }

    public final void zze() {
        zzfmg.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfle zzfleVar) {
        zzfmg.zza().zzd(zza(), this.zza, zzfleVar.zzb());
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfmv.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfmg.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j4) {
        if (j4 >= this.zzc) {
            this.zzd = 2;
            zzfmg.zza().zzh(zza(), this.zza, str);
        }
    }

    public void zzi(zzflh zzflhVar, zzflf zzflfVar) {
        zzj(zzflhVar, zzflfVar, null);
    }

    public final void zzj(zzflh zzflhVar, zzflf zzflfVar, JSONObject jSONObject) throws JSONException {
        String strZzh = zzflhVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfmv.zze(jSONObject2, "environment", "app");
        zzfmv.zze(jSONObject2, "adSessionType", zzflfVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfmv.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfmv.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfmv.zze(jSONObject3, "os", Constants.PLATFORM);
        zzfmv.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfmv.zze(jSONObject2, "deviceCategory", zzfmu.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfmv.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfmv.zze(jSONObject4, "partnerName", zzflfVar.zze().zzb());
        zzfmv.zze(jSONObject4, "partnerVersion", zzflfVar.zze().zzc());
        zzfmv.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfmv.zze(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfmv.zze(jSONObject5, "appId", zzfme.zzb().zza().getApplicationContext().getPackageName());
        zzfmv.zze(jSONObject2, "app", jSONObject5);
        if (zzflfVar.zzf() != null) {
            zzfmv.zze(jSONObject2, "contentUrl", zzflfVar.zzf());
        }
        if (zzflfVar.zzg() != null) {
            zzfmv.zze(jSONObject2, "customReferenceData", zzflfVar.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzflfVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfmg.zza().zzj(zza(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzk(boolean z10) {
        if (zzp()) {
            zzfmg.zza().zzi(zza(), this.zza, true != z10 ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzl(float f10) {
        zzfmg.zza().zze(zza(), this.zza, f10);
    }

    public final void zzm(boolean z10) {
        if (zzp()) {
            zzfmg.zza().zzg(zza(), this.zza, true != z10 ? "unlocked" : "locked");
        }
    }

    public final void zzn(WebView webView) {
        this.zzb = new zzfnr(webView);
    }

    public final boolean zzp() {
        return this.zzb.get() != 0;
    }

    public void zzo() {
    }
}
