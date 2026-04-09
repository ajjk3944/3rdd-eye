package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhau extends zzgxg {
    final zzhaw zza;
    zzgxi zzb = zzb();
    final /* synthetic */ zzhay zzc;

    public zzhau(zzhay zzhayVar) {
        this.zzc = zzhayVar;
        this.zza = new zzhaw(zzhayVar, null);
    }

    private final zzgxi zzb() {
        zzhaw zzhawVar = this.zza;
        if (zzhawVar.hasNext()) {
            return zzhawVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final byte zza() {
        zzgxi zzgxiVar = this.zzb;
        if (zzgxiVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgxiVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
