package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdr {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbdr(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbdo zzf() {
        return new zzbdo(com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime(), null, null);
    }

    public final zzbdq zza() {
        zzbdq zzbdqVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbdo> list = this.zza;
                for (zzbdo zzbdoVar : list) {
                    long jZza = zzbdoVar.zza();
                    String strZzc = zzbdoVar.zzc();
                    zzbdo zzbdoVarZzb = zzbdoVar.zzb();
                    if (zzbdoVarZzb != null && jZza > 0) {
                        long jZza2 = jZza - zzbdoVarZzb.zza();
                        sb.append(strZzc);
                        sb.append('.');
                        sb.append(jZza2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbdoVarZzb.zza()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbdoVarZzb.zza()));
                                sb2.append('+');
                                sb2.append(strZzc);
                            } else {
                                map.put(Long.valueOf(zzbdoVarZzb.zza()), new StringBuilder(strZzc));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                zzbdqVar = new zzbdq(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbdqVar;
    }

    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbdr zzbdrVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbdh zzbdhVarZzg;
        if (TextUtils.isEmpty(str2) || (zzbdhVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbdn zzbdnVarZza = zzbdhVarZzg.zza(str);
            Map map = this.zzb;
            map.put(str, zzbdnVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbdo zzbdoVar, long j4, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbdo(j4, strArr[0], zzbdoVar));
        }
        return true;
    }
}
