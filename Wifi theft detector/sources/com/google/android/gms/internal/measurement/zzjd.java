package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class zzjd extends zzjf {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzjd(byte[] bArr, int i10, int i11, boolean z10, zzjc zzjcVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i10) throws zzkm {
        int i11 = this.zze;
        this.zze = 0;
        int i12 = this.zzc + this.zzd;
        this.zzc = i12;
        if (i12 <= 0) {
            this.zzd = 0;
            return i11;
        }
        this.zzd = i12;
        this.zzc = 0;
        return i11;
    }
}
