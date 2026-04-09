package com.google.android.gms.internal.ads;

import N7.H7;
import java.io.IOException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgxw extends zzgya {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgxw(byte[] bArr, int i, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(H7.n(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzL(byte b10) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i;
        int i10 = this.zzc;
        try {
            i = i10 + 1;
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
        try {
            this.zza[i10] = b10;
            this.zzc = i;
        } catch (IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
            i10 = i;
            throw new zzgxx(i10, this.zzb, 1, indexOutOfBoundsException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzM(int i, boolean z10) throws IOException {
        zzu(i << 3);
        zzL(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzN(int i, zzgxn zzgxnVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzgxnVar.zzd());
        zzgxnVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgya, com.google.android.gms.internal.ads.zzgxe
    public final void zza(byte[] bArr, int i, int i10) throws IOException {
        zze(bArr, i, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i10) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i10);
            this.zzc += i10;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgxx(this.zzc, this.zzb, i10, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzh(int i, int i10) throws IOException {
        zzu((i << 3) | 5);
        zzi(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzi(int i) throws IOException {
        int i10 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i10] = (byte) i;
            bArr[i10 + 1] = (byte) (i >> 8);
            bArr[i10 + 2] = (byte) (i >> 16);
            bArr[i10 + 3] = (byte) (i >> 24);
            this.zzc = i10 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgxx(i10, this.zzb, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzj(int i, long j4) throws IOException {
        zzu((i << 3) | 1);
        zzk(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzk(long j4) throws IOException {
        int i = this.zzc;
        try {
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
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgxx(i, this.zzb, 8, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzl(int i, int i10) throws IOException {
        zzu(i << 3);
        zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzn(int i, zzhag zzhagVar, zzhaz zzhazVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(((zzgww) zzhagVar).zzaM(zzhazVar));
        zzhazVar.zzj(zzhagVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzo(int i, zzhag zzhagVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzhagVar.zzaY());
        zzhagVar.zzcZ(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzp(int i, zzgxn zzgxnVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzN(3, zzgxnVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzD = zzgya.zzD(str.length() * 3);
            int iZzD2 = zzgya.zzD(str.length());
            if (iZzD2 != iZzD) {
                zzu(zzhbx.zze(str));
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = zzhbx.zzd(str, bArr, i10, this.zzb - i10);
                return;
            }
            int i11 = i + iZzD2;
            this.zzc = i11;
            int iZzd = zzhbx.zzd(str, this.zza, i11, this.zzb - i11);
            this.zzc = i;
            zzu((iZzd - i) - iZzD2);
            this.zzc = iZzd;
        } catch (zzhbw e4) {
            this.zzc = i;
            zzG(str, e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxx(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzs(int i, int i10) throws IOException {
        zzu((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzt(int i, int i10) throws IOException {
        zzu(i << 3);
        zzu(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzu(int i) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zzc;
        while ((i & (-128)) != 0) {
            try {
                i10 = i11 + 1;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                throw new zzgxx(i11, this.zzb, 1, indexOutOfBoundsException);
            }
            try {
                this.zza[i11] = (byte) (i | 128);
                i >>>= 7;
                i11 = i10;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i11 = i10;
                throw new zzgxx(i11, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.zza[i11] = (byte) i;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzv(int i, long j4) throws IOException {
        zzu(i << 3);
        zzw(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzw(long j4) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10;
        int i11 = this.zzc;
        if (!zzgya.zzb || this.zzb - i11 < 10) {
            int i12 = i11;
            while ((j4 & (-128)) != 0) {
                try {
                    i10 = i12 + 1;
                } catch (IndexOutOfBoundsException e4) {
                    indexOutOfBoundsException = e4;
                }
                try {
                    this.zza[i12] = (byte) (((int) j4) | 128);
                    j4 >>>= 7;
                    i12 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i10;
                    throw new zzgxx(i12, this.zzb, 1, indexOutOfBoundsException);
                }
            }
            i = i12 + 1;
            try {
                this.zza[i12] = (byte) j4;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i12 = i;
                throw new zzgxx(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j4 & (-128)) != 0) {
                zzhbs.zzq(this.zza, i11, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i11++;
            }
            i = i11 + 1;
            zzhbs.zzq(this.zza, i11, (byte) j4);
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgya
    public final void zzK() {
    }
}
