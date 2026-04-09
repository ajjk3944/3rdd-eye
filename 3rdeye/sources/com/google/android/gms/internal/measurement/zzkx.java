package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzkx extends zzkz {
    public /* synthetic */ zzkx(zzkw zzkwVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zza(Object obj, long j4) {
        ((zzkl) zzmx.zzf(obj, j4)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zzb(Object obj, Object obj2, long j4) {
        zzkl zzklVarZzd = (zzkl) zzmx.zzf(obj, j4);
        zzkl zzklVar = (zzkl) zzmx.zzf(obj2, j4);
        int size = zzklVarZzd.size();
        int size2 = zzklVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzklVarZzd.zzc()) {
                zzklVarZzd = zzklVarZzd.zzd(size2 + size);
            }
            zzklVarZzd.addAll(zzklVar);
        }
        if (size > 0) {
            zzklVar = zzklVarZzd;
        }
        zzmx.zzs(obj, j4, zzklVar);
    }

    private zzkx() {
        super(null);
    }
}
