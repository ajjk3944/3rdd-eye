package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.vungle.ads.internal.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfhm implements Runnable {
    private final zzfhp zzb;
    private String zzc;
    private String zze;
    private zzfce zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfhr zzd = zzfhr.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfhm(zzfhp zzfhpVar) {
        this.zzb = zzfhpVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfhm zza(zzfhb zzfhbVar) {
        try {
            if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfhbVar.zzj();
                list.add(zzfhbVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcad.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziZ)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfhm zzb(String str) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue() && zzfhl.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhm zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfhm zzd(ArrayList arrayList) {
        try {
            if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.zzi = 3;
                } else if (arrayList.contains(g.PLACEMENT_TYPE_INTERSTITIAL) || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.zzi = 8;
                } else if (arrayList.contains(g.PLACEMENT_TYPE_REWARDED) || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfhm zze(String str) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfhm zzf(Bundle bundle) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(bundle);
        }
        return this;
    }

    public final synchronized zzfhm zzg(zzfce zzfceVar) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzf = zzfceVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfhb> list = this.zza;
                for (zzfhb zzfhbVar : list) {
                    int i = this.zzi;
                    if (i != 2) {
                        zzfhbVar.zzn(i);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfhbVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfhbVar.zzl()) {
                        zzfhbVar.zzd(this.zze);
                    }
                    zzfce zzfceVar = this.zzf;
                    if (zzfceVar != null) {
                        zzfhbVar.zzb(zzfceVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzfhbVar.zza(zzeVar);
                        }
                    }
                    zzfhbVar.zzf(this.zzd);
                    this.zzb.zzc(zzfhbVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfhm zzi(int i) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
