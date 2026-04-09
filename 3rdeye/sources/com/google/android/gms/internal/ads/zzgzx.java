package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgzx implements zzhae {
    private final zzhae[] zza;

    public zzgzx(zzhae... zzhaeVarArr) {
        this.zza = zzhaeVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final zzhad zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzhae zzhaeVar = this.zza[i];
            if (zzhaeVar.zzc(cls)) {
                return zzhaeVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
