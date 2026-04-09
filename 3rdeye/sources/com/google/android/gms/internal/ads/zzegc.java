package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzegc implements zzgcx {
    final /* synthetic */ zzfbt zza;
    final /* synthetic */ zzegd zzb;

    public zzegc(zzegd zzegdVar, zzfbt zzfbtVar) {
        this.zza = zzfbtVar;
        this.zzb = zzegdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        zzegd zzegdVar = this.zzb;
        synchronized (zzegdVar) {
            try {
                zzege zzegeVar = zzegdVar.zzh;
                zzfbt zzfbtVar = this.zza;
                zzegeVar.zzb(th, zzfbtVar);
                zzfbt zzfbtVarZza = zzegdVar.zzh.zza();
                if (zzfbtVar.zzav) {
                    while (zzfbtVarZza != null) {
                        zzegdVar.zze(zzfbtVarZza);
                        zzfbtVarZza = zzegdVar.zzh.zza();
                    }
                } else if (zzfbtVarZza != null) {
                    zzegdVar.zze(zzfbtVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzegd zzegdVar = this.zzb;
        zzegu zzeguVar = (zzegu) obj;
        synchronized (zzegdVar) {
            try {
                zzegdVar.zzh.zzc(zzeguVar, this.zza);
                zzfbt zzfbtVarZza = zzegdVar.zzh.zza();
                if (zzfbtVarZza != null) {
                    zzegdVar.zze(zzfbtVarZza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
