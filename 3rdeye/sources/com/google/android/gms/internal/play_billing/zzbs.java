package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbs extends zzbu {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzbs(byte[] bArr, int i, int i10, boolean z10, zzbr zzbrVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzdc {
        int i10 = this.zze;
        this.zze = 0;
        int i11 = this.zzc + this.zzd;
        this.zzc = i11;
        if (i11 <= 0) {
            this.zzd = 0;
            return i10;
        }
        this.zzd = i11;
        this.zzc = 0;
        return i10;
    }
}
