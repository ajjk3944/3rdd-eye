package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzem {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzem(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    private final void zzq() {
        int i;
        int i10 = this.zzb;
        boolean z10 = false;
        if (i10 >= 0 && (i10 < (i = this.zzd) || (i10 == i && this.zzc == 0))) {
            z10 = true;
        }
        zzdd.zzf(z10);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        zzdd.zzf(this.zzc == 0);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i) {
        int i10;
        if (i == 0) {
            return 0;
        }
        this.zzc += i;
        int i11 = 0;
        while (true) {
            i10 = this.zzc;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.zzc = i12;
            byte[] bArr = this.zza;
            int i13 = this.zzb;
            this.zzb = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.zza;
        int i14 = this.zzb;
        int i15 = i11 | ((bArr2[i14] & 255) >> (8 - i10));
        int i16 = 32 - i;
        if (i10 == 8) {
            this.zzc = 0;
            this.zzb = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        zzq();
        return i17;
    }

    public final long zze(int i) {
        if (i <= 32) {
            int iZzd = zzd(i);
            String str = zzex.zza;
            return 4294967295L & iZzd;
        }
        int iZzd2 = zzd(i - 32);
        int iZzd3 = zzd(32);
        String str2 = zzex.zza;
        return (4294967295L & iZzd3) | ((iZzd2 & 4294967295L) << 32);
    }

    public final void zzf() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzg(int i, int i10) {
        int iMin = Math.min(8 - this.zzc, 14);
        int i11 = this.zzc;
        int i12 = (8 - i11) - iMin;
        byte[] bArr = this.zza;
        int i13 = this.zzb;
        byte b10 = (byte) (((65280 >> i11) | ((1 << i12) - 1)) & bArr[i13]);
        bArr[i13] = b10;
        int i14 = 14 - iMin;
        int i15 = i & 16383;
        bArr[i13] = (byte) (b10 | ((i15 >>> i14) << i12));
        int i16 = i13 + 1;
        while (i14 > 8) {
            i14 -= 8;
            this.zza[i16] = (byte) (i15 >>> i14);
            i16++;
        }
        byte[] bArr2 = this.zza;
        byte b11 = (byte) (bArr2[i16] & ((1 << r0) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i15 & ((1 << i14) - 1)) << (8 - i14)) | b11);
        zzn(14);
        zzq();
    }

    public final void zzh(byte[] bArr, int i, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i13 = this.zzb;
            int i14 = i13 + 1;
            this.zzb = i14;
            byte b10 = bArr2[i13];
            int i15 = this.zzc;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((bArr2[i14] & 255) >> (8 - i15)) | b11);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (KotlinVersion.MAX_COMPONENT_VALUE >> i16));
        bArr[i11] = b12;
        int i17 = this.zzc;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.zza;
            int i18 = this.zzb;
            this.zzb = i18 + 1;
            b12 = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b12;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.zzc = i19;
        byte[] bArr4 = this.zza;
        int i20 = this.zzb;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b12);
        if (i19 == 8) {
            this.zzc = 0;
            this.zzb = i20 + 1;
        }
        zzq();
    }

    public final void zzi(byte[] bArr, int i, int i10) {
        zzdd.zzf(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i10);
        this.zzb += i10;
        zzq();
    }

    public final void zzj(zzen zzenVar) {
        zzk(zzenVar.zzN(), zzenVar.zzd());
        zzl(zzenVar.zzc() * 8);
    }

    public final void zzk(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i;
    }

    public final void zzl(int i) {
        int i10 = i / 8;
        this.zzb = i10;
        this.zzc = i - (i10 * 8);
        zzq();
    }

    public final void zzm() {
        int i = this.zzc + 1;
        this.zzc = i;
        if (i == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzn(int i) {
        int i10 = i / 8;
        int i11 = this.zzb + i10;
        this.zzb = i11;
        int i12 = (i - (i10 * 8)) + this.zzc;
        this.zzc = i12;
        if (i12 > 7) {
            this.zzb = i11 + 1;
            this.zzc = i12 - 8;
        }
        zzq();
    }

    public final void zzo(int i) {
        zzdd.zzf(this.zzc == 0);
        this.zzb += i;
        zzq();
    }

    public final boolean zzp() {
        int i = this.zza[this.zzb] & (128 >> this.zzc);
        zzm();
        return i != 0;
    }

    public zzem() {
        this.zza = zzex.zzb;
    }
}
