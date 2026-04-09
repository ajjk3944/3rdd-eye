package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    public zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final com.google.common.util.concurrent.a zzh(zzgdu zzgduVar) {
        com.google.common.util.concurrent.a aVarZzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, aVarZzc);
        return aVarZzc;
    }

    private final com.google.common.util.concurrent.a zzi(byte[] bArr) {
        com.google.common.util.concurrent.a aVarZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, aVarZzc);
        return aVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zzb() {
        com.google.common.util.concurrent.a aVarZzb = this.zza.zzb();
        this.zzd.zze(20302, aVarZzb);
        return aVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        com.google.common.util.concurrent.a aVarZzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, aVarZzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(aVarZzc, zzi(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return this.zza.zzg(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return this.zza.zzf(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmg
    public final com.google.common.util.concurrent.a zze() {
        com.google.common.util.concurrent.a aVarZzb = this.zzb.zzb();
        this.zzd.zze(20304, aVarZzb);
        return aVarZzb;
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzf(zzgdu zzgduVar, Void r22) {
        return zzh(zzgduVar);
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
