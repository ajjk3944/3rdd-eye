package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfda {
    private final zzfbt zza;
    private final zzfbw zzb;
    private final zzfjq zzc;
    private final zzfji zzd;
    private final zzfhm zze;
    private final zzcml zzf;

    public zzfda(zzfjq zzfjqVar, zzfji zzfjiVar, zzfbt zzfbtVar, zzfbw zzfbwVar, zzcml zzcmlVar, zzfhm zzfhmVar) {
        this.zza = zzfbtVar;
        this.zzb = zzfbwVar;
        this.zzc = zzfjqVar;
        this.zzd = zzfjiVar;
        this.zzf = zzcmlVar;
        this.zze = zzfhmVar;
    }

    public final void zza(List list, zzcyb zzcybVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2, zzcybVar);
        }
    }

    public final void zzb(String str, int i, zzcyb zzcybVar) {
        zzfbt zzfbtVar = this.zza;
        if (zzfbtVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzd(str, zzfbtVar.zzax, this.zze, zzcybVar);
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgdb.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkn)).booleanValue() && zzcml.zzj(str)) ? this.zzf.zze(str, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgdb.zzh(str), new zzfcz(this, i), zzcad.zza);
        }
    }
}
