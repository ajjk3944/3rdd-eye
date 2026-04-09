package com.google.android.gms.internal.measurement;

import N7.C1154e9;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal == 1) {
            zzap zzapVarZzb = zzgVar.zzb((zzap) C1154e9.h(zzbl.AND, 2, list, 0));
            return !zzapVarZzb.zzg().booleanValue() ? zzapVarZzb : zzgVar.zzb((zzap) list.get(1));
        }
        if (iOrdinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) C1154e9.h(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        }
        if (iOrdinal != 50) {
            return zzb(str);
        }
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) C1154e9.h(zzbl.OR, 2, list, 0));
        return zzapVarZzb2.zzg().booleanValue() ? zzapVarZzb2 : zzgVar.zzb((zzap) list.get(1));
    }
}
