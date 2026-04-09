package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgxh extends zzgxk {
    private final int zzc;
    private final int zzd;

    public zzgxh(byte[] bArr, int i, int i10) {
        super(bArr);
        zzgxn.zzq(i, i + i10, bArr.length);
        this.zzc = i;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final byte zza(int i) {
        zzgxn.zzy(i, this.zzd);
        return ((zzgxk) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final byte zzb(int i) {
        return ((zzgxk) this).zza[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk, com.google.android.gms.internal.ads.zzgxn
    public final void zze(byte[] bArr, int i, int i10, int i11) {
        System.arraycopy(((zzgxk) this).zza, this.zzc + i, bArr, i10, i11);
    }
}
