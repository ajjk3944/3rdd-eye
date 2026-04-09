package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzams implements zzadt {
    private final zzamt zza;
    private final zzen zzb;
    private final zzen zzc;
    private final zzem zzd;
    private zzadw zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzams() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        zzdd.zzb(this.zze);
        zzen zzenVar = this.zzb;
        int iZza = zzaduVar.zza(zzenVar.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzP(new zzaer(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzenVar.zzL(0);
        zzenVar.zzK(iZza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zza(zzenVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zze = zzadwVar;
        this.zza.zzb(zzadwVar, new zzaol(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzadwVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        zzen zzenVar;
        int i = 0;
        while (true) {
            zzenVar = this.zzc;
            zzadj zzadjVar = (zzadj) zzaduVar;
            zzadjVar.zzm(zzenVar.zzN(), 0, 10, false);
            zzenVar.zzL(0);
            if (zzenVar.zzo() != 4801587) {
                break;
            }
            zzenVar.zzM(3);
            int iZzl = zzenVar.zzl();
            i += iZzl + 10;
            zzadjVar.zzl(iZzl, false);
        }
        zzaduVar.zzj();
        zzadj zzadjVar2 = (zzadj) zzaduVar;
        zzadjVar2.zzl(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = i;
        do {
            zzadjVar2.zzm(zzenVar.zzN(), 0, 2, false);
            zzenVar.zzL(0);
            if (zzamt.zzf(zzenVar.zzq())) {
                i10++;
                if (i10 >= 4 && i11 > 188) {
                    return true;
                }
                zzadjVar2.zzm(zzenVar.zzN(), 0, 4, false);
                zzem zzemVar = this.zzd;
                zzemVar.zzl(14);
                int iZzd = zzemVar.zzd(13);
                if (iZzd <= 6) {
                    i12++;
                    zzaduVar.zzj();
                    zzadjVar2.zzl(i12, false);
                } else {
                    zzadjVar2.zzl(iZzd - 6, false);
                    i11 += iZzd;
                }
            } else {
                i12++;
                zzaduVar.zzj();
                zzadjVar2.zzl(i12, false);
            }
            i10 = 0;
            i11 = 0;
        } while (i12 - i < 8192);
        return false;
    }

    public zzams(int i) {
        this.zza = new zzamt(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzen(2048);
        this.zzg = -1L;
        zzen zzenVar = new zzen(10);
        this.zzc = zzenVar;
        byte[] bArrZzN = zzenVar.zzN();
        this.zzd = new zzem(bArrZzN, bArrZzN.length);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
