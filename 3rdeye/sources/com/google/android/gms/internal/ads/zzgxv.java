package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzgxv extends zzgya {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzgxv(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b10) {
        byte[] bArr = this.zza;
        int i = this.zzc;
        bArr[i] = b10;
        this.zzc = i + 1;
        this.zzd++;
    }

    public final void zzd(int i) {
        int i10 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i10] = (byte) i;
        bArr[i10 + 1] = (byte) (i >> 8);
        bArr[i10 + 2] = (byte) (i >> 16);
        bArr[i10 + 3] = (byte) (i >> 24);
        this.zzc = i10 + 4;
        this.zzd += 4;
    }

    public final void zze(long j4) {
        int i = this.zzc;
        byte[] bArr = this.zza;
        bArr[i] = (byte) j4;
        bArr[i + 1] = (byte) (j4 >> 8);
        bArr[i + 2] = (byte) (j4 >> 16);
        bArr[i + 3] = (byte) (j4 >> 24);
        bArr[i + 4] = (byte) (j4 >> 32);
        bArr[i + 5] = (byte) (j4 >> 40);
        bArr[i + 6] = (byte) (j4 >> 48);
        bArr[i + 7] = (byte) (j4 >> 56);
        this.zzc = i + 8;
        this.zzd += 8;
    }

    public final void zzf(int i) {
        if (!zzgya.zzb) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr[i10] = (byte) (i | 128);
                this.zzd++;
                i >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            bArr2[i11] = (byte) i;
            this.zzd++;
            return;
        }
        long j4 = this.zzc;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzhbs.zzq(bArr3, i12, (byte) (i | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        zzhbs.zzq(bArr4, i13, (byte) i);
        this.zzd += (int) (this.zzc - j4);
    }

    public final void zzg(long j4) {
        if (zzgya.zzb) {
            long j10 = this.zzc;
            while (true) {
                int i = (int) j4;
                if ((j4 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzhbs.zzq(bArr, i10, (byte) i);
                    this.zzd += (int) (this.zzc - j10);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzhbs.zzq(bArr2, i11, (byte) (i | 128));
                j4 >>>= 7;
            }
        } else {
            while (true) {
                int i12 = (int) j4;
                if ((j4 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i13 = this.zzc;
                    this.zzc = i13 + 1;
                    bArr3[i13] = (byte) i12;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i14 = this.zzc;
                this.zzc = i14 + 1;
                bArr4[i14] = (byte) (i12 | 128);
                this.zzd++;
                j4 >>>= 7;
            }
        }
    }
}
