package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbdf {
    private final String zza = (String) zzbew.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbdf(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzv.zzr();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzs());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzv.zzr();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzF(context) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        Future futureZzb = com.google.android.gms.ads.internal.zzv.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvs) futureZzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvs) futureZzb.get()).zzk));
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlC)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzv.zzr();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.zzC(context) ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjG)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcA)).booleanValue() || zzfvv.zzd(com.google.android.gms.ads.internal.zzv.zzp().zzn())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzv.zzp().zzn());
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
