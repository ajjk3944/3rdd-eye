package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgc implements zzgj {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgo zzd;

    public zzgc(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzf(zzhj zzhjVar) {
        zzhjVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzhjVar)) {
            return;
        }
        arrayList.add(zzhjVar);
        this.zzc++;
    }

    public final void zzg(int i) {
        zzgo zzgoVar = this.zzd;
        String str = zzex.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhj) this.zzb.get(i10)).zza(this, zzgoVar, this.zza, i);
        }
    }

    public final void zzh() {
        zzgo zzgoVar = this.zzd;
        String str = zzex.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhj) this.zzb.get(i)).zzb(this, zzgoVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgo zzgoVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzhj) this.zzb.get(i)).zzc(this, zzgoVar, this.zza);
        }
    }

    public final void zzj(zzgo zzgoVar) {
        this.zzd = zzgoVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhj) this.zzb.get(i)).zzd(this, zzgoVar, this.zza);
        }
    }
}
