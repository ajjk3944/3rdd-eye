package com.google.android.gms.internal.ads;

import B4.g;
import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfkh {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfkw zzc;
    private final zzfkd zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzg;
    private AtomicInteger zzh;

    public zzfkh(zzfkw zzfkwVar, zzfkd zzfkdVar, Context context, Clock clock) {
        this.zzc = zzfkwVar;
        this.zzd = zzfkdVar;
        this.zze = context;
        this.zzg = clock;
    }

    public static String zzd(String str, AdFormat adFormat) {
        return g.o(str, "#", adFormat == null ? "NULL" : adFormat.name());
    }

    private final synchronized zzfkv zzm(String str, AdFormat adFormat) {
        return (zzfkv) this.zza.get(zzd(str, adFormat));
    }

    private final synchronized Object zzn(Class cls, String str, AdFormat adFormat) {
        zzfkl zzfklVar = new zzfkl(new zzfkj(str, adFormat), null);
        zzfkd zzfkdVar = this.zzd;
        Clock clock = this.zzg;
        zzfkdVar.zzl(clock.currentTimeMillis(), zzfklVar, -1, -1, "1");
        zzfkv zzfkvVarZzm = zzm(str, adFormat);
        if (zzfkvVarZzm == null) {
            return null;
        }
        try {
            String strZzo = zzfkvVarZzm.zzo();
            Object objZzk = zzfkvVarZzm.zzk();
            Object objCast = objZzk == null ? null : cls.cast(objZzk);
            if (objCast != null) {
                zzfkdVar.zzm(clock.currentTimeMillis(), zzfkvVarZzm.zze.zzd, zzfkvVarZzm.zzd(), strZzo, zzfklVar, "1");
            }
            return objCast;
        } catch (ClassCastException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e4);
            return null;
        }
    }

    private final synchronized List zzo(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzfv zzfvVar = (com.google.android.gms.ads.internal.client.zzfv) it.next();
                String strZzd = zzd(zzfvVar.zza, AdFormat.getAdFormat(zzfvVar.zzb));
                hashSet.add(strZzd);
                ConcurrentMap concurrentMap = this.zza;
                zzfkv zzfkvVar = (zzfkv) concurrentMap.get(strZzd);
                if (zzfkvVar == null) {
                    ConcurrentMap concurrentMap2 = this.zzb;
                    if (concurrentMap2.containsKey(strZzd)) {
                        zzfkv zzfkvVar2 = (zzfkv) concurrentMap2.get(strZzd);
                        if (zzfkvVar2.zze.equals(zzfvVar)) {
                            zzfkvVar2.zzB(zzfvVar.zzd);
                            zzfkvVar2.zzy();
                            concurrentMap.put(strZzd, zzfkvVar2);
                            concurrentMap2.remove(strZzd);
                        }
                    } else {
                        arrayList.add(zzfvVar);
                    }
                } else if (zzfkvVar.zze.equals(zzfvVar)) {
                    zzfkvVar.zzB(zzfvVar.zzd);
                } else {
                    this.zzb.put(strZzd, zzfkvVar);
                    concurrentMap.remove(strZzd);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfkv) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfkv zzfkvVar3 = (zzfkv) ((Map.Entry) it3.next()).getValue();
                zzfkvVar3.zzA();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzx)).booleanValue()) {
                    zzfkvVar3.zzv();
                }
                if (!zzfkvVar3.zzC()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void zzp(String str, zzfkv zzfkvVar) {
        zzfkvVar.zzh();
        this.zza.put(str, zzfkvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzq(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfkv) it.next()).zzy();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfkv) it2.next()).zzf.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzr(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzv)).booleanValue()) {
            zzq(z10);
        }
    }

    private final synchronized boolean zzs(String str, AdFormat adFormat) {
        boolean z10;
        try {
            Clock clock = this.zzg;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            zzfkv zzfkvVarZzm = zzm(str, adFormat);
            int iZzd = 0;
            z10 = zzfkvVarZzm != null && zzfkvVarZzm.zzC();
            Long lValueOf = z10 ? Long.valueOf(clock.currentTimeMillis()) : null;
            zzfkl zzfklVar = new zzfkl(new zzfkj(str, adFormat), null);
            zzfkd zzfkdVar = this.zzd;
            int i = zzfkvVarZzm == null ? 0 : zzfkvVarZzm.zze.zzd;
            if (zzfkvVarZzm != null) {
                iZzd = zzfkvVarZzm.zzd();
            }
            zzfkdVar.zzh(i, iZzd, jCurrentTimeMillis, lValueOf, zzfkvVarZzm != null ? zzfkvVarZzm.zzo() : null, zzfklVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    public final synchronized zzbau zza(String str) {
        return (zzbau) zzn(zzbau.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzb(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzn(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }

    public final synchronized zzbwt zzc(String str) {
        return (zzbwt) zzn(zzbwt.class, str, AdFormat.REWARDED);
    }

    public final void zzg(zzbpo zzbpoVar) {
        this.zzc.zzc(zzbpoVar);
    }

    public final synchronized void zzh(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        try {
            List<com.google.android.gms.ads.internal.client.zzfv> listZzo = zzo(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzfv zzfvVar : listZzo) {
                String str = zzfvVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzfvVar.zzb);
                zzfkv zzfkvVarZza = this.zzc.zza(zzfvVar, zzceVar);
                if (adFormat != null && zzfkvVarZza != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzfkvVarZza.zzx(atomicInteger.get());
                    }
                    zzfkd zzfkdVar = this.zzd;
                    zzfkvVarZza.zzz(zzfkdVar);
                    zzp(zzd(str, adFormat), zzfkvVarZza);
                    enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzi(enumMap, adFormat, 0)).intValue() + 1));
                    zzfkdVar.zzp(zzfvVar.zzd, this.zzg.currentTimeMillis(), new zzfkl(new zzfkj(str, adFormat), null), "1");
                }
            }
            this.zzd.zzo(enumMap, this.zzg.currentTimeMillis(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzi() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e4) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get connectivity manager", e4);
                    }
                }
            }
        }
        if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
            this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzB)).intValue());
        } else {
            try {
                this.zzf.registerDefaultNetworkCallback(new zzfkg(this));
            } catch (RuntimeException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e10);
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzB)).intValue());
            }
        }
        com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzfkf(this));
    }

    public final synchronized boolean zzj(String str) {
        return zzs(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzk(String str) {
        return zzs(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzl(String str) {
        return zzs(str, AdFormat.REWARDED);
    }
}
