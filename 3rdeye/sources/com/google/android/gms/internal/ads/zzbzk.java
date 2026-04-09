package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.internal.g;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbzk {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzbzk(String str, long j4) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j4;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzg = new JSONObject(str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlS)).booleanValue() && zzj()) {
                return;
            }
            if (this.zzg.optInt("status", -1) != 1) {
                this.zzh = false;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString(CommonUrlParts.APP_ID);
            JSONArray jSONArrayOptJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString(Constants.ADMON_AD_UNIT_ID);
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if (g.PLACEMENT_TYPE_INTERSTITIAL.equalsIgnoreCase(strOptString)) {
                            this.zzb.add(strOptString2);
                        } else if ((g.PLACEMENT_TYPE_REWARDED.equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(strOptString2, new zzbpi(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                    this.zza.add(jSONArrayOptJSONArray3.optString(i11));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgX)).booleanValue() && (jSONObjectOptJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    this.zzi.add(jSONArrayOptJSONArray.get(i12).toString());
                }
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgt)).booleanValue() || (jSONObjectOptJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e4) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Exception occurred while processing app setting json", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j4) {
        this.zzf = j4;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            zzbct zzbctVar = zzbdc.zzlV;
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).longValue();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlU)).booleanValue() && !TextUtils.isEmpty(this.zze)) {
                jLongValue = this.zzg.optLong("cache_ttl_sec", ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).longValue());
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            if (jLongValue >= 0) {
                long j4 = this.zzf;
                if (j4 > jCurrentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j4) > jLongValue) {
                    this.zza.clear();
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd = "";
                    this.zze = "";
                    this.zzg = null;
                    this.zzh = false;
                    this.zzi.clear();
                    this.zzj = false;
                    return true;
                }
            }
        }
        return false;
    }
}
