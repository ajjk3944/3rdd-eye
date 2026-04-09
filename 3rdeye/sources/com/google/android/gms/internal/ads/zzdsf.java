package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdsf implements zzfgt {
    private final zzdrw zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsf(zzdrw zzdrwVar, Set set, Clock clock) {
        this.zzb = zzdrwVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdse zzdseVar = (zzdse) it.next();
            this.zzd.put(zzdseVar.zzc, zzdseVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfgm zzfgmVar, boolean z10) {
        zzdse zzdseVar = (zzdse) this.zzd.get(zzfgmVar);
        if (zzdseVar == null) {
            return;
        }
        String str = true != z10 ? "f." : "s.";
        Map map = this.zza;
        zzfgm zzfgmVar2 = zzdseVar.zzb;
        if (map.containsKey(zzfgmVar2)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfgmVar2)).longValue();
            this.zzb.zzb().put("label.".concat(zzdseVar.zza), str + jElapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfgmVar)).longValue();
            zzdrw zzdrwVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdrwVar.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfgmVar)) {
            zze(zzfgmVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfgmVar)).longValue();
            zzdrw zzdrwVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdrwVar.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfgmVar)) {
            zze(zzfgmVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) {
        this.zza.put(zzfgmVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) {
    }
}
