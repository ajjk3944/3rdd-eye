package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaee {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzaed zzk;
    private final zzav zzl;

    private zzaee(int i, int i10, int i11, int i12, int i13, int i14, int i15, long j4, zzaed zzaedVar, zzav zzavVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = zzi(i13);
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = zzh(i15);
        this.zzj = j4;
        this.zzk = zzaedVar;
        this.zzl = zzavVar;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j4 = this.zzj;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.zze;
    }

    public final long zzb(long j4) {
        String str = zzex.zza;
        return Math.max(0L, Math.min((j4 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzz zzc(byte[] bArr, zzav zzavVar) {
        bArr[4] = -128;
        zzav zzavVarZzd = zzd(zzavVar);
        zzx zzxVar = new zzx();
        zzxVar.zzah("audio/flac");
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzxVar.zzX(i);
        zzxVar.zzD(this.zzg);
        zzxVar.zzai(this.zze);
        zzxVar.zzab(zzex.zzn(this.zzh));
        zzxVar.zzT(Collections.singletonList(bArr));
        zzxVar.zzaa(zzavVarZzd);
        return zzxVar.zzan();
    }

    public final zzav zzd(zzav zzavVar) {
        zzav zzavVar2 = this.zzl;
        return zzavVar2 == null ? zzavVar : zzavVar2.zzd(zzavVar);
    }

    public final zzaee zze(List list) {
        return new zzaee(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzav(list)));
    }

    public final zzaee zzf(zzaed zzaedVar) {
        return new zzaee(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzaedVar, this.zzl);
    }

    public final zzaee zzg(List list) {
        return new zzaee(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaff.zzb(list)));
    }

    public zzaee(byte[] bArr, int i) {
        zzem zzemVar = new zzem(bArr, bArr.length);
        zzemVar.zzl(i * 8);
        this.zza = zzemVar.zzd(16);
        this.zzb = zzemVar.zzd(16);
        this.zzc = zzemVar.zzd(24);
        this.zzd = zzemVar.zzd(24);
        int iZzd = zzemVar.zzd(20);
        this.zze = iZzd;
        this.zzf = zzi(iZzd);
        this.zzg = zzemVar.zzd(3) + 1;
        int iZzd2 = zzemVar.zzd(5) + 1;
        this.zzh = iZzd2;
        this.zzi = zzh(iZzd2);
        this.zzj = zzemVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}
