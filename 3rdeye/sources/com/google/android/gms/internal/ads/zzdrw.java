package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdrw {
    private final ConcurrentHashMap zza;
    private final zzbzu zzb;
    private final zzfco zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.gms.ads.internal.zzk zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdrw(Context context, zzdsh zzdshVar, zzbzu zzbzuVar, zzfco zzfcoVar, String str, String str2, com.google.android.gms.ads.internal.zzk zzkVar) {
        ActivityManager.MemoryInfo memoryInfoZzc;
        ConcurrentHashMap concurrentHashMapZzc = zzdshVar.zzc();
        this.zza = concurrentHashMapZzc;
        this.zzb = zzbzuVar;
        this.zzc = zzfcoVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzkVar;
        this.zzh = context;
        concurrentHashMapZzc.put("ad_format", str2.toUpperCase(Locale.ROOT));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjM)).booleanValue()) {
            int iZzp = zzkVar.zzp();
            int i = iZzp - 1;
            if (iZzp == 0) {
                throw null;
            }
            concurrentHashMapZzc.put("asv", i != 0 ? i != 1 ? "na" : "2" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzv.zzp().zzb()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcw)).booleanValue() && (memoryInfoZzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(context)) != null) {
                zzd("mem_avl", String.valueOf(memoryInfoZzc.availMem));
                zzd("mem_tt", String.valueOf(memoryInfoZzc.totalMem));
                zzd("low_m", true != memoryInfoZzc.lowMemory ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhb)).booleanValue()) {
            int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfcoVar) - 1;
            if (iZzg == 0) {
                concurrentHashMapZzc.put(CommonUrlParts.REQUEST_ID, str);
                concurrentHashMapZzc.put("scar", "false");
                return;
            }
            if (iZzg == 1) {
                concurrentHashMapZzc.put(CommonUrlParts.REQUEST_ID, str);
                concurrentHashMapZzc.put("se", "query_g");
            } else if (iZzg == 2) {
                concurrentHashMapZzc.put("se", "r_adinfo");
            } else if (iZzg != 3) {
                concurrentHashMapZzc.put("se", "r_both");
            } else {
                concurrentHashMapZzc.put("se", "r_adstring");
            }
            concurrentHashMapZzc.put("scar", "true");
            zzd("ragent", zzfcoVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcoVar.zzd)));
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznv)).booleanValue()) {
            zzd("brr", true != this.zzc.zzp ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zze(zzfcf zzfcfVar) {
        zzfce zzfceVar = zzfcfVar.zzb;
        List list = zzfceVar.zza;
        if (!list.isEmpty()) {
            int i = ((zzfbt) list.get(0)).zzb;
            zzd("ad_format", zzfbt.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfceVar.zzb.zzb);
    }

    public final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
