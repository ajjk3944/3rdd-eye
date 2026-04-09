package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzadj implements zzadu {
    private final zzl zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[65536];
    private final byte[] zza = new byte[4096];

    static {
        zzaq.zzb("media3.extractor");
    }

    public zzadj(zzl zzlVar, long j4, long j10) {
        this.zzb = zzlVar;
        this.zzd = j4;
        this.zzc = j10;
    }

    private final int zzp(byte[] bArr, int i, int i10) {
        int i11 = this.zzg;
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.zze, 0, bArr, i, iMin);
        zzu(iMin);
        return iMin;
    }

    private final int zzq(byte[] bArr, int i, int i10, int i11, boolean z10) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iZza = this.zzb.zza(bArr, i + i11, i10 - i11);
        if (iZza != -1) {
            return i11 + iZza;
        }
        if (i11 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private final int zzr(int i) {
        int iMin = Math.min(this.zzg, i);
        zzu(iMin);
        return iMin;
    }

    private final void zzs(int i) {
        if (i != -1) {
            this.zzd += i;
        }
    }

    private final void zzt(int i) {
        int i10 = this.zzf + i;
        int length = this.zze.length;
        if (i10 > length) {
            String str = zzex.zza;
            this.zze = Arrays.copyOf(this.zze, Math.max(65536 + i10, Math.min(length + length, i10 + 524288)));
        }
    }

    private final void zzu(int i) {
        int i10 = this.zzg - i;
        this.zzg = i10;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i10 < bArr.length + (-524288) ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i10);
        this.zze = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        int iZzp = zzp(bArr, i, i10);
        if (iZzp == 0) {
            iZzp = zzq(bArr, i, i10, 0, true);
        }
        zzs(iZzp);
        return iZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(byte[] bArr, int i, int i10) throws IOException {
        zzadj zzadjVar;
        int iMin;
        zzt(i10);
        int i11 = this.zzg;
        int i12 = this.zzf;
        int i13 = i11 - i12;
        if (i13 == 0) {
            zzadjVar = this;
            iMin = zzadjVar.zzq(this.zze, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            zzadjVar.zzg += iMin;
        } else {
            zzadjVar = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(zzadjVar.zze, zzadjVar.zzf, bArr, i, iMin);
        zzadjVar.zzf += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzc(int i) throws IOException {
        int iZzr = zzr(1);
        if (iZzr == 0) {
            iZzr = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(iZzr);
        return iZzr;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzg(int i) throws IOException {
        zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzh(byte[] bArr, int i, int i10) throws IOException {
        zzm(bArr, i, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzi(byte[] bArr, int i, int i10) throws IOException {
        zzn(bArr, i, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzk(int i) throws IOException {
        zzo(i, false);
    }

    public final boolean zzl(int i, boolean z10) throws IOException {
        zzt(i);
        int iZzq = this.zzg - this.zzf;
        while (iZzq < i) {
            int i10 = i;
            boolean z11 = z10;
            iZzq = zzq(this.zze, this.zzf, i10, iZzq, z11);
            if (iZzq == -1) {
                return false;
            }
            this.zzg = this.zzf + iZzq;
            i = i10;
            z10 = z11;
        }
        this.zzf += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzm(byte[] bArr, int i, int i10, boolean z10) throws IOException {
        if (!zzl(i10, z10)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i10, bArr, i, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzn(byte[] bArr, int i, int i10, boolean z10) throws IOException {
        int iZzp = zzp(bArr, i, i10);
        while (iZzp < i10 && iZzp != -1) {
            iZzp = zzq(bArr, i, i10, iZzp, z10);
        }
        zzs(iZzp);
        return iZzp != -1;
    }

    public final boolean zzo(int i, boolean z10) throws IOException {
        int iZzr = zzr(i);
        while (iZzr < i && iZzr != -1) {
            iZzr = zzq(this.zza, -iZzr, Math.min(i, iZzr + 4096), iZzr, false);
        }
        zzs(iZzr);
        return iZzr != -1;
    }
}
