package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzegj extends zzegi {
    private final zzcgz zza;
    private final zzcuy zzb;
    private final zzdbp zzc;
    private final zzegt zzd;
    private final zzedj zze;

    public zzegj(zzcgz zzcgzVar, zzcuy zzcuyVar, zzdbp zzdbpVar, zzegt zzegtVar, zzedj zzedjVar) {
        this.zza = zzcgzVar;
        this.zzb = zzcuyVar;
        this.zzc = zzdbpVar;
        this.zzd = zzegtVar;
        this.zze = zzedjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegi
    public final A4.a zzc(zzfco zzfcoVar, Bundle bundle, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        zzcuy zzcuyVar = this.zzb;
        zzcuyVar.zzk(zzfcoVar);
        zzcuyVar.zzg(bundle);
        zzcuyVar.zzh(new zzcur(zzfcfVar, zzfbtVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdP)).booleanValue()) {
            zzcuyVar.zze(this.zze);
        }
        zzcoa zzcoaVarZzc = this.zza.zzc();
        zzcoaVarZzc.zzd(zzcuyVar.zzl());
        zzcoaVarZzc.zzc(this.zzc);
        zzcrz zzcrzVarZzb = zzcoaVarZzc.zze().zzb();
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzi());
    }
}
