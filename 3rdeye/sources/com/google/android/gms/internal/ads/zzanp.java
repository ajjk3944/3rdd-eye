package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzanp {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzanp(int i, int i10) {
        this.zzc = i;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza(byte[] bArr, int i, int i10) {
        if (this.zzd) {
            int i11 = i10 - i;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i12 = this.zzb + i11;
            if (length < i12) {
                this.zza = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i, this.zza, this.zzb, i11);
            this.zzb += i11;
        }
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int i) {
        zzdd.zzf(!this.zzd);
        boolean z10 = i == this.zzc;
        this.zzd = z10;
        if (z10) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int i) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i;
        this.zzd = false;
        this.zze = true;
        return true;
    }

    public final boolean zze() {
        return this.zze;
    }
}
