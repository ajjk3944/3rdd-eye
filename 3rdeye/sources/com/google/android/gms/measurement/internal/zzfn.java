package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
final class zzfn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfp zza;

    public zzfn(zzfp zzfpVar) {
        this.zza = zzfpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z10, boolean z11) {
        int i10 = i - 1;
        zzem zzemVarZzi = i10 != 0 ? i10 != 1 ? i10 != 3 ? i10 != 4 ? this.zza.zzs.zzay().zzi() : z10 ? this.zza.zzs.zzay().zzm() : !z11 ? this.zza.zzs.zzay().zzl() : this.zza.zzs.zzay().zzk() : this.zza.zzs.zzay().zzj() : z10 ? this.zza.zzs.zzay().zzh() : !z11 ? this.zza.zzs.zzay().zze() : this.zza.zzs.zzay().zzd() : this.zza.zzs.zzay().zzc();
        int size = list.size();
        if (size == 1) {
            zzemVarZzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzemVarZzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzemVarZzi.zza(str);
        } else {
            zzemVarZzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
