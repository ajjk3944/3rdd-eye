package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzafa {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzaez zzaezVar, zzaey zzaeyVar) {
        if (this.zzc > 0) {
            zzaezVar.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzaeyVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzaez zzaezVar, long j4, int i, int i10, int i11, zzaey zzaeyVar) {
        zzdd.zzg(this.zzg <= i10 + i11, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i12 = this.zzc;
            int i13 = i12 + 1;
            this.zzc = i13;
            if (i12 == 0) {
                this.zzd = j4;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i10;
            this.zzg = i11;
            if (i13 >= 16) {
                zza(zzaezVar, zzaeyVar);
            }
        }
    }

    public final void zzd(zzadu zzaduVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzaduVar.zzh(bArr, 0, 10);
        zzaduVar.zzj();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
