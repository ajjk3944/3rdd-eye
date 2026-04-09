package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzafy implements zzadt {
    private final byte[] zza;
    private final zzen zzb;
    private final zzadz zzc;
    private zzadw zzd;
    private zzaez zze;
    private int zzf;
    private zzav zzg;
    private zzaee zzh;
    private int zzi;
    private int zzj;
    private zzafx zzk;
    private int zzl;
    private long zzm;

    public zzafy() {
        throw null;
    }

    private final long zza(zzen zzenVar, boolean z10) {
        boolean zZzc;
        this.zzh.getClass();
        int iZzc = zzenVar.zzc();
        while (iZzc <= zzenVar.zzd() - 16) {
            zzenVar.zzL(iZzc);
            zzaee zzaeeVar = this.zzh;
            int i = this.zzj;
            zzadz zzadzVar = this.zzc;
            if (zzaea.zzc(zzenVar, zzaeeVar, i, zzadzVar)) {
                zzenVar.zzL(iZzc);
                return zzadzVar.zza;
            }
            iZzc++;
        }
        if (!z10) {
            zzenVar.zzL(iZzc);
            return -1L;
        }
        while (iZzc <= zzenVar.zzd() - this.zzi) {
            zzenVar.zzL(iZzc);
            try {
                zZzc = zzaea.zzc(zzenVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzenVar.zzc() <= zzenVar.zzd() && zZzc) {
                zzenVar.zzL(iZzc);
                return this.zzc.zza;
            }
            iZzc++;
        }
        zzenVar.zzL(zzenVar.zzd());
        return -1L;
    }

    private final void zzg() {
        long j4 = this.zzm * 1000000;
        zzaee zzaeeVar = this.zzh;
        String str = zzex.zza;
        this.zze.zzt(j4 / zzaeeVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        boolean zZzp;
        zzaes zzaerVar;
        boolean z10;
        int i = this.zzf;
        if (i == 0) {
            zzaduVar.zzj();
            long jZze = zzaduVar.zze();
            zzav zzavVarZza = zzaeb.zza(zzaduVar, true);
            zzaduVar.zzk((int) (zzaduVar.zze() - jZze));
            this.zzg = zzavVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzaduVar.zzh(this.zza, 0, 42);
            zzaduVar.zzj();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzen zzenVar = new zzen(4);
            zzaduVar.zzi(zzenVar.zzN(), 0, 4);
            if (zzenVar.zzu() != 1716281667) {
                throw zzaz.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzaee zzaeeVarZze = this.zzh;
            do {
                zzaduVar.zzj();
                zzem zzemVar = new zzem(new byte[4], 4);
                zzaduVar.zzh(zzemVar.zza, 0, 4);
                zZzp = zzemVar.zzp();
                int iZzd = zzemVar.zzd(7);
                int iZzd2 = zzemVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzaduVar.zzi(bArr, 0, 38);
                    zzaeeVarZze = new zzaee(bArr, 4);
                } else {
                    if (zzaeeVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzen zzenVar2 = new zzen(iZzd2);
                        zzaduVar.zzi(zzenVar2.zzN(), 0, iZzd2);
                        zzaeeVarZze = zzaeeVarZze.zzf(zzaeb.zzb(zzenVar2));
                    } else if (iZzd == 4) {
                        zzen zzenVar3 = new zzen(iZzd2);
                        zzaduVar.zzi(zzenVar3.zzN(), 0, iZzd2);
                        zzenVar3.zzM(4);
                        zzaeeVarZze = zzaeeVarZze.zzg(Arrays.asList(zzaff.zzc(zzenVar3, false, false).zza));
                    } else if (iZzd == 6) {
                        zzen zzenVar4 = new zzen(iZzd2);
                        zzaduVar.zzi(zzenVar4.zzN(), 0, iZzd2);
                        zzenVar4.zzM(4);
                        zzaeeVarZze = zzaeeVarZze.zze(zzfyf.zzo(zzagr.zzb(zzenVar4)));
                    } else {
                        zzaduVar.zzk(iZzd2);
                    }
                }
                String str = zzex.zza;
                this.zzh = zzaeeVarZze;
            } while (!zZzp);
            zzaeeVarZze.getClass();
            this.zzi = Math.max(zzaeeVarZze.zzc, 6);
            zzz zzzVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzaez zzaezVar = this.zze;
            zzx zzxVarZzb = zzzVarZzc.zzb();
            zzxVarZzb.zzG("audio/flac");
            zzaezVar.zzm(zzxVarZzb.zzan());
            this.zze.zzl(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzaduVar.zzj();
            zzen zzenVar5 = new zzen(2);
            zzaduVar.zzh(zzenVar5.zzN(), 0, 2);
            int iZzq = zzenVar5.zzq();
            if ((iZzq >> 2) != 16382) {
                zzaduVar.zzj();
                throw zzaz.zza("First frame does not start with sync code.", null);
            }
            zzaduVar.zzj();
            this.zzj = iZzq;
            zzadw zzadwVar = this.zzd;
            String str2 = zzex.zza;
            long jZzf = zzaduVar.zzf();
            long jZzd = zzaduVar.zzd();
            zzaee zzaeeVar = this.zzh;
            zzaeeVar.getClass();
            if (zzaeeVar.zzk != null) {
                zzaerVar = new zzaec(zzaeeVar, jZzf);
            } else if (jZzd == -1 || zzaeeVar.zzj <= 0) {
                zzaerVar = new zzaer(zzaeeVar.zza(), 0L);
            } else {
                zzafx zzafxVar = new zzafx(zzaeeVar, this.zzj, jZzf, jZzd);
                this.zzk = zzafxVar;
                zzaerVar = zzafxVar.zzb();
            }
            zzadwVar.zzP(zzaerVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzaee zzaeeVar2 = this.zzh;
        zzaeeVar2.getClass();
        zzafx zzafxVar2 = this.zzk;
        if (zzafxVar2 != null && zzafxVar2.zze()) {
            return zzafxVar2.zza(zzaduVar, zzaepVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzaea.zzb(zzaduVar, zzaeeVar2);
            return 0;
        }
        zzen zzenVar6 = this.zzb;
        int iZzd3 = zzenVar6.zzd();
        if (iZzd3 < 32768) {
            int iZza = zzaduVar.zza(zzenVar6.zzN(), iZzd3, Constants.QUEUE_ELEMENT_MAX_SIZE - iZzd3);
            z10 = iZza == -1;
            if (!z10) {
                zzenVar6.zzK(iZzd3 + iZza);
            } else if (zzenVar6.zza() == 0) {
                zzg();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iZzc = zzenVar6.zzc();
        int i10 = this.zzl;
        int i11 = this.zzi;
        if (i10 < i11) {
            zzenVar6.zzM(Math.min(i11 - i10, zzenVar6.zza()));
        }
        long jZza = zza(zzenVar6, z10);
        int iZzc2 = zzenVar6.zzc() - iZzc;
        zzenVar6.zzL(iZzc);
        this.zze.zzr(zzenVar6, iZzc2);
        this.zzl += iZzc2;
        if (jZza != -1) {
            zzg();
            this.zzl = 0;
            this.zzm = jZza;
        }
        int length = zzenVar6.zzN().length - zzenVar6.zzd();
        if (zzenVar6.zza() >= 16 || length >= 16) {
            return 0;
        }
        int iZza2 = zzenVar6.zza();
        System.arraycopy(zzenVar6.zzN(), zzenVar6.zzc(), zzenVar6.zzN(), 0, iZza2);
        zzenVar6.zzL(0);
        zzenVar6.zzK(iZza2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzd = zzadwVar;
        this.zze = zzadwVar.zzw(0, 1);
        zzadwVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        if (j4 == 0) {
            this.zzf = 0;
        } else {
            zzafx zzafxVar = this.zzk;
            if (zzafxVar != null) {
                zzafxVar.zzd(j10);
            }
        }
        this.zzm = j10 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        zzaeb.zza(zzaduVar, false);
        zzen zzenVar = new zzen(4);
        ((zzadj) zzaduVar).zzm(zzenVar.zzN(), 0, 4, false);
        return zzenVar.zzu() == 1716281667;
    }

    public zzafy(int i) {
        this.zza = new byte[42];
        this.zzb = new zzen(new byte[Constants.QUEUE_ELEMENT_MAX_SIZE], 0);
        this.zzc = new zzadz();
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
