package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzahx {
    private final zzen zza = new zzen(8);
    private int zzb;

    private final long zzb(zzadu zzaduVar) throws IOException {
        int i;
        zzen zzenVar = this.zza;
        zzadj zzadjVar = (zzadj) zzaduVar;
        int i10 = 0;
        zzadjVar.zzm(zzenVar.zzN(), 0, 1, false);
        int i11 = zzenVar.zzN()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while (true) {
            i = i13 + 1;
            if ((i11 & i12) != 0) {
                break;
            }
            i12 >>= 1;
            i13 = i;
        }
        int i14 = i11 & (~i12);
        zzadjVar.zzm(zzenVar.zzN(), 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (zzenVar.zzN()[i10] & 255) + (i14 << 8);
        }
        this.zzb += i;
        return i14;
    }

    public final boolean zza(zzadu zzaduVar) throws IOException {
        long jZzd = zzaduVar.zzd();
        long j4 = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j4 = jZzd;
        }
        zzen zzenVar = this.zza;
        zzadj zzadjVar = (zzadj) zzaduVar;
        zzadjVar.zzm(zzenVar.zzN(), 0, 4, false);
        this.zzb = 4;
        for (long jZzu = zzenVar.zzu(); jZzu != 440786851; jZzu = ((jZzu << 8) & (-256)) | (zzenVar.zzN()[0] & 255)) {
            int i = (int) j4;
            int i10 = this.zzb + 1;
            this.zzb = i10;
            if (i10 == i) {
                return false;
            }
            zzadjVar.zzm(zzenVar.zzN(), 0, 1, false);
        }
        long jZzb = zzb(zzaduVar);
        long j10 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j11 = j10 + jZzb;
            if (jZzd == -1 || j11 < jZzd) {
                while (true) {
                    long j12 = this.zzb;
                    if (j12 < j11) {
                        if (zzb(zzaduVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzaduVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i11 = (int) jZzb2;
                            zzadjVar.zzl(i11, false);
                            this.zzb += i11;
                        }
                    } else if (j12 == j11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
