package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzfvv;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzv.zzr();
        map.put("device", zzs.zzs());
        map.put("app", this.zzb);
        zzv.zzr();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzF(context) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        zzbct zzbctVar = zzbdc.zza;
        List listZzb = zzbd.zza().zzb();
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzgX)).booleanValue()) {
            listZzb.addAll(zzv.zzp().zzi().zzg().zzd());
        }
        map.put(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, TextUtils.join(StringUtils.COMMA, listZzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlC)).booleanValue()) {
            zzv.zzr();
            map.put("is_bstar", true != zzs.zzC(context) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        if (((Boolean) zzbd.zzc().zzb(zzbdc.zzjG)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzcA)).booleanValue()) {
                map.put("plugin", zzfvv.zzc(zzv.zzp().zzn()));
            }
        }
    }
}
