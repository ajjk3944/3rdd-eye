package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
final class zzgme implements zzgky {
    private final zzgjd zza;
    private final ExecutorService zzb;
    private final zzgoe zzc;

    public zzgme(zzgjd zzgjdVar, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgjdVar;
        this.zzb = executorService;
        this.zzc = zzgoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zzb() {
        com.google.common.util.concurrent.a aVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, aVarZzd);
        return aVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zzc(final zzgdu zzgduVar, final byte[] bArr, final byte[] bArr2) {
        com.google.common.util.concurrent.a aVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws IllegalArgumentException {
                this.zza.zzi(zzgduVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, aVarZzd);
        return aVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final com.google.common.util.concurrent.a zzd(final zzgdu zzgduVar, final byte[] bArr) {
        com.google.common.util.concurrent.a aVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws IllegalArgumentException {
                this.zza.zzh(zzgduVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, aVarZzd);
        return aVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final com.google.common.util.concurrent.a zze() {
        com.google.common.util.concurrent.a aVarZzd = zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgma
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, aVarZzd);
        return aVarZzd;
    }

    public final /* synthetic */ zzgdu zzf() throws IllegalArgumentException {
        zzgdu zzgduVarZzc = this.zza.zzc(1);
        return zzgduVarZzc == null ? zzgdu.zzg() : zzgduVarZzc;
    }

    public final /* synthetic */ zzfwq zzg() {
        return this.zza.zzb(1);
    }

    public final /* synthetic */ Void zzh(zzgdu zzgduVar, byte[] bArr) throws IllegalArgumentException {
        this.zza.zza(zzgduVar, null, bArr);
        return null;
    }

    public final /* synthetic */ Void zzi(zzgdu zzgduVar, byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.zza.zza(zzgduVar, bArr, bArr2);
        return null;
    }
}
