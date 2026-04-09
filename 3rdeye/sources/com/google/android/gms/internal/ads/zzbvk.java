package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbvk extends zzbvi {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbok zzd;
    private final VersionInfoParcel zze;

    public zzbvk(Context context, zzbok zzbokVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbokVar;
    }

    public static /* synthetic */ Void zzb(zzbvk zzbvkVar, JSONObject jSONObject) {
        zzbct zzbctVar = zzbdc.zza;
        com.google.android.gms.ads.internal.client.zzbd.zzb();
        SharedPreferences sharedPreferencesZza = zzbcv.zza(zzbvkVar.zzb);
        if (sharedPreferencesZza == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        com.google.android.gms.ads.internal.client.zzbd.zza();
        int i = zzbes.zza;
        com.google.android.gms.ads.internal.client.zzbd.zza().zzf(editorEdit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzbd.zzb();
        editorEdit.commit();
        SharedPreferences sharedPreferences = zzbvkVar.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis()).apply();
        return null;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbfc.zzb.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbfc.zzc.zze());
            jSONObject.put("cl", "761682454");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final A4.a zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbfc.zzd.zze()).longValue()) {
            return zzgdb.zzh(null);
        }
        return zzgdb.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfut() { // from class: com.google.android.gms.internal.ads.zzbvj
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzbvk.zzb(this.zza, (JSONObject) obj);
                return null;
            }
        }, zzcad.zzg);
    }
}
