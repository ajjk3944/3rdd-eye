package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzlr {
    private final zzph zza;
    private final zzlq zze;
    private final zzmo zzh;
    private final zzdt zzi;
    private boolean zzj;
    private zzhj zzk;
    private zzxc zzl = new zzxc(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlr(zzlq zzlqVar, zzmo zzmoVar, zzdt zzdtVar, zzph zzphVar) {
        this.zza = zzphVar;
        this.zze = zzlqVar;
        this.zzh = zzmoVar;
        this.zzi = zzdtVar;
    }

    private final void zzr(int i, int i10) {
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            ((zzlp) list.get(i)).zzd += i10;
            i++;
        }
    }

    private final void zzs(zzlp zzlpVar) {
        zzlo zzloVar = (zzlo) this.zzf.get(zzlpVar);
        if (zzloVar != null) {
            zzloVar.zza.zzi(zzloVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlp zzlpVar = (zzlp) it.next();
            if (zzlpVar.zzc.isEmpty()) {
                zzs(zzlpVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzlp zzlpVar) {
        if (zzlpVar.zze && zzlpVar.zzc.isEmpty()) {
            zzlo zzloVar = (zzlo) this.zzf.remove(zzlpVar);
            zzloVar.getClass();
            zzvj zzvjVar = zzloVar.zza;
            zzvjVar.zzp(zzloVar.zzb);
            zzln zzlnVar = zzloVar.zzc;
            zzvjVar.zzs(zzlnVar);
            zzvjVar.zzr(zzlnVar);
            this.zzg.remove(zzlpVar);
        }
    }

    private final void zzv(zzlp zzlpVar) {
        zzvc zzvcVar = zzlpVar.zza;
        zzvi zzviVar = new zzvi() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // com.google.android.gms.internal.ads.zzvi
            public final void zza(zzvj zzvjVar, zzbl zzblVar) {
                this.zza.zze.zzj();
            }
        };
        zzln zzlnVar = new zzln(this, zzlpVar);
        this.zzf.put(zzlpVar, new zzlo(zzvcVar, zzviVar, zzlnVar));
        zzvcVar.zzh(new Handler(zzex.zzz(), null), zzlnVar);
        zzvcVar.zzg(new Handler(zzex.zzz(), null), zzlnVar);
        zzvcVar.zzm(zzviVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i10) {
        while (true) {
            i10--;
            if (i10 < i) {
                return;
            }
            zzlp zzlpVar = (zzlp) this.zzb.remove(i10);
            this.zzd.remove(zzlpVar.zzb);
            zzr(i10, -zzlpVar.zza.zzC().zzc());
            zzlpVar.zze = true;
            if (this.zzj) {
                zzu(zzlpVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbl zzb() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbl.zza;
        }
        int iZzc = 0;
        for (int i = 0; i < list.size(); i++) {
            zzlp zzlpVar = (zzlp) list.get(i);
            zzlpVar.zzd = iZzc;
            iZzc += zzlpVar.zza.zzC().zzc();
        }
        return new zzly(list, this.zzl);
    }

    public final zzbl zzc(int i, int i10, List list) {
        zzdd.zzd(i >= 0 && i <= i10 && i10 <= zza());
        zzdd.zzd(list.size() == i10 - i);
        for (int i11 = i; i11 < i10; i11++) {
            ((zzlp) this.zzb.get(i11)).zza.zzt((zzap) list.get(i11 - i));
        }
        return zzb();
    }

    public final void zzg(zzhj zzhjVar) {
        zzdd.zzf(!this.zzj);
        this.zzk = zzhjVar;
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                this.zzj = true;
                return;
            }
            zzlp zzlpVar = (zzlp) list.get(i);
            zzv(zzlpVar);
            this.zzg.add(zzlpVar);
            i++;
        }
    }

    public final void zzh() {
        for (zzlo zzloVar : this.zzf.values()) {
            try {
                zzloVar.zza.zzp(zzloVar.zzb);
            } catch (RuntimeException e4) {
                zzea.zzd("MediaSourceList", "Failed to release child source.", e4);
            }
            zzvj zzvjVar = zzloVar.zza;
            zzln zzlnVar = zzloVar.zzc;
            zzvjVar.zzs(zzlnVar);
            zzvjVar.zzr(zzlnVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzvf zzvfVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzlp zzlpVar = (zzlp) identityHashMap.remove(zzvfVar);
        zzlpVar.getClass();
        zzlpVar.zza.zzG(zzvfVar);
        zzlpVar.zzc.remove(((zzuz) zzvfVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzt();
        }
        zzu(zzlpVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbl zzk(int i, List list, zzxc zzxcVar) {
        if (!list.isEmpty()) {
            this.zzl = zzxcVar;
            for (int i10 = i; i10 < list.size() + i; i10++) {
                zzlp zzlpVar = (zzlp) list.get(i10 - i);
                if (i10 > 0) {
                    zzlp zzlpVar2 = (zzlp) this.zzb.get(i10 - 1);
                    zzlpVar.zzc(zzlpVar2.zza.zzC().zzc() + zzlpVar2.zzd);
                } else {
                    zzlpVar.zzc(0);
                }
                zzr(i10, zzlpVar.zza.zzC().zzc());
                this.zzb.add(i10, zzlpVar);
                this.zzd.put(zzlpVar.zzb, zzlpVar);
                if (this.zzj) {
                    zzv(zzlpVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlpVar);
                    } else {
                        zzs(zzlpVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbl zzl(int i, int i10, int i11, zzxc zzxcVar) {
        zzdd.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzbl zzm(int i, int i10, zzxc zzxcVar) {
        boolean z10 = false;
        if (i >= 0 && i <= i10 && i10 <= zza()) {
            z10 = true;
        }
        zzdd.zzd(z10);
        this.zzl = zzxcVar;
        zzw(i, i10);
        return zzb();
    }

    public final zzbl zzn(List list, zzxc zzxcVar) {
        List list2 = this.zzb;
        zzw(0, list2.size());
        return zzk(list2.size(), list, zzxcVar);
    }

    public final zzbl zzo(zzxc zzxcVar) {
        int iZza = zza();
        if (zzxcVar.zzc() != iZza) {
            zzxcVar = zzxcVar.zzf().zzg(0, iZza);
        }
        this.zzl = zzxcVar;
        return zzb();
    }

    public final zzvf zzp(zzvh zzvhVar, zzzm zzzmVar, long j4) {
        int i = zzly.zzb;
        Pair pair = (Pair) zzvhVar.zza;
        Object obj = pair.first;
        zzvh zzvhVarZza = zzvhVar.zza(pair.second);
        zzlp zzlpVar = (zzlp) this.zzd.get(obj);
        zzlpVar.getClass();
        this.zzg.add(zzlpVar);
        zzlo zzloVar = (zzlo) this.zzf.get(zzlpVar);
        if (zzloVar != null) {
            zzloVar.zza.zzk(zzloVar.zzb);
        }
        zzlpVar.zzc.add(zzvhVarZza);
        zzuz zzuzVarZzI = zzlpVar.zza.zzI(zzvhVarZza, zzzmVar, j4);
        this.zzc.put(zzuzVarZzI, zzlpVar);
        zzt();
        return zzuzVarZzI;
    }

    public final zzxc zzq() {
        return this.zzl;
    }
}
