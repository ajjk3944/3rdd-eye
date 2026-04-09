package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzdsh;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzv {
    private final zzdsh zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgZ)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzha)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhe)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhd)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzt(this));

    public zzv(zzdsh zzdshVar) {
        this.zzh = zzdshVar;
    }

    public static /* synthetic */ void zzd(zzv zzvVar, zzdrw zzdrwVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) throws JSONException {
        zzvVar.zzj(zzdrwVar, arrayDeque, "to");
        zzvVar.zzj(zzdrwVar, arrayDeque2, "of");
    }

    private final synchronized void zzi(final zzdrw zzdrwVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzv.zzd(this.zza, zzdrwVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzj(zzdrw zzdrwVar, ArrayDeque arrayDeque, String str) throws JSONException {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdrwVar.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzg(this.zzi);
        }
    }

    private final synchronized void zzk() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((zzu) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized String zzb(String str, zzdrw zzdrwVar) {
        zzu zzuVar = (zzu) this.zze.get(str);
        zzdrwVar.zzb().put(CommonUrlParts.REQUEST_ID, str);
        if (zzuVar == null) {
            zzdrwVar.zzb().put("mhit", "false");
            return null;
        }
        zzdrwVar.zzb().put("mhit", "true");
        return zzuVar.zzb;
    }

    public final synchronized void zze(String str, String str2, zzdrw zzdrwVar) {
        this.zze.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis()), str2, new HashSet()));
        zzk();
        zzi(zzdrwVar);
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i) {
        zzu zzuVar = (zzu) this.zze.get(str);
        if (zzuVar == null) {
            return false;
        }
        Set set = zzuVar.zzc;
        set.add(str2);
        return set.size() < i;
    }

    public final synchronized boolean zzh(String str, String str2) {
        zzu zzuVar = (zzu) this.zze.get(str);
        if (zzuVar != null) {
            if (zzuVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
