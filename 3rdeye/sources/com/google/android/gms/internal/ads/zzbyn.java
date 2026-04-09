package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzbyn {
    static zzbyn zzi;

    public static synchronized zzbyn zzb(Context context) {
        try {
            zzbyn zzbynVar = zzi;
            if (zzbynVar != null) {
                return zzbynVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbdc.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
            zzgVarZzi.zzp(applicationContext);
            zzbyf zzbyfVar = new zzbyf(null);
            zzbyfVar.zzb(applicationContext);
            zzbyfVar.zzc(com.google.android.gms.ads.internal.zzv.zzD());
            zzbyfVar.zza(zzgVarZzi);
            zzbyfVar.zzd(com.google.android.gms.ads.internal.zzv.zzo());
            zzbyn zzbynVarZze = zzbyfVar.zze();
            zzi = zzbynVarZze;
            ((zzbxz) ((zzbyg) zzbynVarZze).zzc.zzb()).zza();
            zzbyr zzbyrVar = (zzbyr) ((zzbyg) zzi).zzh.zzb();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzr();
                Map mapZzw = com.google.android.gms.ads.internal.util.zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaI));
                Iterator it = mapZzw.keySet().iterator();
                while (it.hasNext()) {
                    zzbyrVar.zzc((String) it.next());
                }
                zzbyrVar.zzd(new zzbyp(zzbyrVar, mapZzw));
            }
            return zzi;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzbyd zza();
}
