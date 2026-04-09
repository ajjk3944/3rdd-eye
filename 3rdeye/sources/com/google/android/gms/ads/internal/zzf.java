package com.google.android.gms.ads.internal;

import A4.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzfha;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzgdm;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static /* synthetic */ a zza(zzf zzfVar, Long l5, zzdsc zzdscVar, zzfhb zzfhbVar, zzfhp zzfhpVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzv.zzp().zzi().zzs(jSONObject.getString("appSettingsJson"));
            if (l5 != null) {
                zzf(zzdscVar, "cld_s", zzv.zzD().elapsedRealtime() - l5.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorMessage", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfhbVar.zzc(strOptString);
        }
        zzfhbVar.zzg(zOptBoolean);
        zzfhpVar.zzc(zzfhbVar.zzm());
        return zzgdb.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdsc zzdscVar, String str, long j4) {
        if (zzdscVar != null) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzmR)).booleanValue()) {
                zzdsb zzdsbVarZza = zzdscVar.zza();
                zzdsbVarZza.zzb("action", "lat_init");
                zzdsbVarZza.zzb(str, Long.toString(j4));
                zzdsbVarZza.zzj();
            }
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfhp zzfhpVar, zzdsc zzdscVar, Long l5, boolean z10) throws JSONException {
        zzd(context, versionInfoParcel, true, null, str, null, runnable, zzfhpVar, zzdscVar, l5, z10);
    }

    public final void zzd(Context context, VersionInfoParcel versionInfoParcel, boolean z10, zzbzk zzbzkVar, String str, String str2, Runnable runnable, final zzfhp zzfhpVar, final zzdsc zzdscVar, final Long l5, boolean z11) throws JSONException {
        zzfhb zzfhbVar;
        Exception exc;
        JSONObject jSONObject;
        a aVarZzb;
        zzgci zzgciVar;
        PackageInfo packageInfo;
        if (zzv.zzD().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzv.zzD().elapsedRealtime();
        if (zzbzkVar != null && !TextUtils.isEmpty(zzbzkVar.zzc())) {
            if (zzv.zzD().currentTimeMillis() - zzbzkVar.zza() <= ((Long) zzbd.zzc().zzb(zzbdc.zzer)).longValue() && zzbzkVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfhb zzfhbVarZza = zzfha.zza(context, 4);
        zzfhbVarZza.zzi();
        zzbou zzbouVarZza = zzv.zzg().zza(this.zza, versionInfoParcel, zzfhpVar);
        zzboo zzbooVar = zzbor.zza;
        zzbok zzbokVarZza = zzbouVarZza.zza("google.afma.config.fetchAppSettings", zzbooVar, zzbooVar);
        try {
            jSONObject = new JSONObject();
        } catch (Exception e4) {
            e = e4;
            zzfhbVar = zzfhbVarZza;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(CommonUrlParts.APP_ID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(Constants.ADMON_AD_UNIT_ID, str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put(Constants.REVENUE_PRODUCT_NAME_KEY, context.getPackageName());
            zzbct zzbctVar = zzbdc.zza;
            jSONObject.put("experiment_ids", TextUtils.join(StringUtils.COMMA, zzbd.zza().zza()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzjL)).booleanValue()) {
                jSONObject.put("inspector_enabled", z11);
            }
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            aVarZzb = zzbokVarZza.zzb(jSONObject);
            try {
                zzgciVar = new zzgci() { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final a zza(Object obj) {
                        return zzf.zza(this.zza, l5, zzdscVar, zzfhbVarZza, zzfhpVar, (JSONObject) obj);
                    }
                };
                zzfhbVar = zzfhbVarZza;
            } catch (Exception e10) {
                e = e10;
                zzfhbVar = zzfhbVarZza;
            }
        } catch (Exception e11) {
            exc = e11;
            zzfhbVar = zzfhbVarZza;
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", exc);
            zzfhbVar.zzh(exc);
            zzfhbVar.zzg(false);
            zzfhpVar.zzc(zzfhbVar.zzm());
        }
        try {
            zzgdm zzgdmVar = zzcad.zzg;
            a aVarZzn = zzgdb.zzn(aVarZzb, zzgciVar, zzgdmVar);
            if (runnable != null) {
                aVarZzb.addListener(runnable, zzgdmVar);
            }
            if (l5 != null) {
                aVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzf zzfVar = this.zza;
                        zzf.zzf(zzdscVar, "cld_r", zzv.zzD().elapsedRealtime() - l5.longValue());
                    }
                }, zzgdmVar);
            }
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzhU)).booleanValue()) {
                zzcag.zzb(aVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcag.zza(aVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e12) {
            e = e12;
            exc = e;
            int i122 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", exc);
            zzfhbVar.zzh(exc);
            zzfhbVar.zzg(false);
            zzfhpVar.zzc(zzfhbVar.zzm());
        }
    }

    public final void zze(Context context, VersionInfoParcel versionInfoParcel, String str, zzbzk zzbzkVar, zzfhp zzfhpVar, boolean z10) throws JSONException {
        zzd(context, versionInfoParcel, false, zzbzkVar, zzbzkVar != null ? zzbzkVar.zzb() : null, str, null, zzfhpVar, null, null, z10);
    }
}
