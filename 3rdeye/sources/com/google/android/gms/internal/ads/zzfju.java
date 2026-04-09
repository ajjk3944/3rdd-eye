package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfju {
    private final Map zza;
    private final zzfkw zzb;
    private final zzfkd zzc;
    private final Clock zzd;

    public zzfju(zzfkw zzfkwVar, zzfkd zzfkdVar, Context context, Clock clock) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfkwVar;
        this.zzc = zzfkdVar;
        this.zzd = clock;
    }

    private final synchronized Object zzk(Class cls, AdFormat adFormat, String str) {
        zzfkd zzfkdVar = this.zzc;
        Clock clock = this.zzd;
        zzfkdVar.zzg(clock.currentTimeMillis(), "2");
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzfkv zzfkvVar = (zzfkv) ((Map) map.get(adFormat)).get(str);
        if (zzfkvVar != null && adFormat.equals(zzfkvVar.zze())) {
            zzfkj zzfkjVar = new zzfkj(zzfkvVar.zze.zza, zzfkvVar.zze());
            zzfkjVar.zzb(str);
            zzfkl zzfklVar = new zzfkl(zzfkjVar, null);
            zzfkdVar.zzl(clock.currentTimeMillis(), zzfklVar, zzfkvVar.zze.zzd, zzfkvVar.zzd(), "2");
            try {
                String strZzo = zzfkvVar.zzo();
                Object objZzk = zzfkvVar.zzk();
                Object objCast = objZzk == null ? null : cls.cast(objZzk);
                if (objCast != null) {
                    zzfkdVar.zzm(clock.currentTimeMillis(), zzfkvVar.zze.zzd, zzfkvVar.zzd(), strZzo, zzfklVar, "2");
                }
                return objCast;
            } catch (ClassCastException e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "PreloadAdManager.pollAd");
                com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e4);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzl(AdFormat adFormat) {
        int size;
        int iOrdinal;
        try {
            Map map = this.zza;
            size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
            iOrdinal = adFormat.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeJ)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeI)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeH)).intValue(), 1));
    }

    public final synchronized int zza(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzfkv zzfkvVar = (zzfkv) ((Map) map.get(adFormat)).get(str);
        int iZzd = zzfkvVar != null ? zzfkvVar.zzd() : 0;
        this.zzc.zzf(iZzd, this.zzd.currentTimeMillis(), str, zzfkvVar == null ? null : zzfkvVar.zze.zza, adFormat, zzfkvVar == null ? -1 : zzfkvVar.zze.zzd);
        return iZzd;
    }

    public final synchronized zzbau zzb(String str) {
        return (zzbau) zzk(zzbau.class, AdFormat.APP_OPEN_AD, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzc(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzk(com.google.android.gms.ads.internal.client.zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzfv zzd(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (map.containsKey(adFormat)) {
            zzfkv zzfkvVar = (zzfkv) ((Map) map.get(adFormat)).get(str);
            this.zzc.zzd(this.zzd.currentTimeMillis(), str, zzfkvVar == null ? null : zzfkvVar.zze.zza, adFormat, zzfkvVar == null ? -1 : zzfkvVar.zze.zzd, zzfkvVar != null ? zzfkvVar.zzd() : -1);
            if (zzfkvVar != null) {
                return zzfkvVar.zze;
            }
        }
        return null;
    }

    public final synchronized zzbwt zze(String str) {
        return (zzbwt) zzk(zzbwt.class, AdFormat.REWARDED, str);
    }

    public final synchronized Map zzf(int i) {
        try {
            HashMap map = new HashMap();
            AdFormat adFormat = AdFormat.getAdFormat(i);
            if (adFormat != null) {
                Map map2 = this.zza;
                if (map2.containsKey(adFormat)) {
                    for (zzfkv zzfkvVar : ((Map) map2.get(adFormat)).values()) {
                        map.put(zzfkvVar.zzn(), zzfkvVar.zze);
                    }
                    this.zzc.zze(adFormat, this.zzd.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        } finally {
        }
    }

    public final synchronized void zzg(int i) {
        try {
            AdFormat adFormat = AdFormat.getAdFormat(i);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat)) {
                    Map map2 = (Map) map.get(adFormat);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzfkv zzfkvVar = (zzfkv) map2.get(str);
                        if (zzfkvVar != null) {
                            zzfkvVar.zzA();
                            zzfkvVar.zzv();
                            String strValueOf = String.valueOf(str);
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    map2.clear();
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                    this.zzc.zzc(this.zzd.currentTimeMillis(), adFormat, size);
                }
            }
        } finally {
        }
    }

    public final synchronized boolean zzh(AdFormat adFormat, String str) {
        zzfkv zzfkvVar;
        Map map = this.zza;
        if (map.containsKey(adFormat) && (zzfkvVar = (zzfkv) ((Map) map.get(adFormat)).get(str)) != null) {
            ((Map) map.get(adFormat)).remove(str);
            zzfkvVar.zzA();
            zzfkvVar.zzv();
            zzfkd zzfkdVar = this.zzc;
            long jCurrentTimeMillis = this.zzd.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzfv zzfvVar = zzfkvVar.zze;
            zzfkdVar.zzb(jCurrentTimeMillis, str, zzfvVar.zza, adFormat, zzfvVar.zzd, zzfkvVar.zzd());
            return true;
        }
        return false;
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        zzfkl zzfklVar;
        try {
            Clock clock = this.zzd;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Map map = this.zza;
            int iZzd = 0;
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzfkv zzfkvVar = (zzfkv) ((Map) map.get(adFormat)).get(str);
            String strZzo = zzfkvVar == null ? null : zzfkvVar.zzo();
            boolean z10 = strZzo != null && adFormat.equals(zzfkvVar.zze());
            Long lValueOf = z10 ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzfkvVar == null) {
                zzfklVar = null;
            } else {
                zzfkj zzfkjVar = new zzfkj(zzfkvVar.zze.zza, adFormat);
                zzfkjVar.zzb(str);
                zzfklVar = new zzfkl(zzfkjVar, null);
            }
            zzfkd zzfkdVar = this.zzc;
            int i = zzfkvVar == null ? 0 : zzfkvVar.zze.zzd;
            if (zzfkvVar != null) {
                iZzd = zzfkvVar.zzd();
            }
            zzfkdVar.zzh(i, iZzd, jCurrentTimeMillis, lValueOf, strZzo, zzfklVar, "2");
            return z10;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzj(String str, com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        zzfkv zzfkvVarZzb;
        AdFormat adFormat = AdFormat.getAdFormat(zzfvVar.zzb);
        if (adFormat != null) {
            Map map = this.zza;
            if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && zzl(adFormat) && (zzfkvVarZzb = this.zzb.zzb(str, zzfvVar, zzchVar)) != null) {
                zzfkd zzfkdVar = this.zzc;
                zzfkvVarZzb.zzz(zzfkdVar);
                zzfkvVarZzb.zzh();
                ((Map) map.get(adFormat)).put(str, zzfkvVarZzb);
                zzfkj zzfkjVar = new zzfkj(zzfvVar.zza, adFormat);
                zzfkjVar.zzb(str);
                zzfkdVar.zzp(zzfvVar.zzd, this.zzd.currentTimeMillis(), new zzfkl(zzfkjVar, null), "2");
                return true;
            }
        }
        return false;
    }
}
