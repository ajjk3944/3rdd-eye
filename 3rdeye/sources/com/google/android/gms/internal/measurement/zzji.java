package com.google.android.gms.internal.measurement;

import java.io.IOException;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzji extends zzjl {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzji(byte[] bArr, int i, int i10) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzb(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b10;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i, int i10) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i10);
            this.zzd += i10;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzd(int i, boolean z10) throws IOException {
        zzq(i << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zze(int i, zzjd zzjdVar) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzjdVar.zzd());
        zzjdVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzf(int i, int i10) throws IOException {
        zzq((i << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            this.zzd = i11;
            bArr[i10] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i12 = i10 + 2;
            this.zzd = i12;
            bArr[i11] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i10 + 3;
            this.zzd = i13;
            bArr[i12] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zzd = i10 + 4;
            bArr[i13] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzh(int i, long j4) throws IOException {
        zzq((i << 3) | 1);
        zzi(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzi(long j4) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            int i10 = i + 1;
            this.zzd = i10;
            bArr[i] = (byte) (((int) j4) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i11 = i + 2;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j4 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i12 = i + 3;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j4 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i + 4;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j4 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i14 = i + 5;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i15 = i + 6;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i + 7;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zzd = i + 8;
            bArr[i16] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzj(int i, int i10) throws IOException {
        zzq(i << 3);
        zzk(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzl(byte[] bArr, int i, int i10) throws IOException {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i = this.zzd;
        try {
            int iZzA = zzjl.zzA(str.length() * 3);
            int iZzA2 = zzjl.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzq(zznc.zzc(str));
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = zznc.zzb(str, bArr, i10, this.zzc - i10);
                return;
            }
            int i11 = i + iZzA2;
            this.zzd = i11;
            int iZzb = zznc.zzb(str, this.zzb, i11, this.zzc - i11);
            this.zzd = i;
            zzq((iZzb - i) - iZzA2);
            this.zzd = iZzb;
        } catch (zznb e4) {
            this.zzd = i;
            zzE(str, e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjj(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzo(int i, int i10) throws IOException {
        zzq((i << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzp(int i, int i10) throws IOException {
        zzq(i << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzq(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr2 = this.zzb;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        bArr2[i11] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzr(int i, long j4) throws IOException {
        zzq(i << 3);
        zzs(j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzs(long j4) throws IOException {
        if (zzjl.zzc && this.zzc - this.zzd >= 10) {
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                zzmx.zzn(bArr, i, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i10 = this.zzd;
            this.zzd = 1 + i10;
            zzmx.zzn(bArr2, i10, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr3[i11] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr4 = this.zzb;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        bArr4[i12] = (byte) j4;
    }
}
