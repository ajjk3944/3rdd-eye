package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamq implements zzadt {
    private final zzamr zza = new zzamr(null, 0, "audio/ac4");
    private final zzen zzb = new zzen(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        zzen zzenVar = this.zzb;
        int iZza = zzaduVar.zza(zzenVar.zzN(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzenVar.zzL(0);
        zzenVar.zzK(iZza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
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
        this.zza.zzb(zzadwVar, new zzaol(RecyclerView.UNDEFINED_DURATION, 0, 1));
        zzadwVar.zzG();
        zzadwVar.zzP(new zzaer(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        int i;
        zzen zzenVar = new zzen(10);
        int i10 = 0;
        while (true) {
            zzadj zzadjVar = (zzadj) zzaduVar;
            zzadjVar.zzm(zzenVar.zzN(), 0, 10, false);
            zzenVar.zzL(0);
            if (zzenVar.zzo() != 4801587) {
                break;
            }
            zzenVar.zzM(3);
            int iZzl = zzenVar.zzl();
            i10 += iZzl + 10;
            zzadjVar.zzl(iZzl, false);
        }
        zzaduVar.zzj();
        zzadj zzadjVar2 = (zzadj) zzaduVar;
        zzadjVar2.zzl(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            int i13 = 7;
            zzadjVar2.zzm(zzenVar.zzN(), 0, 7, false);
            zzenVar.zzL(0);
            int iZzq = zzenVar.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArrZzN = zzenVar.zzN();
                if (bArrZzN.length < 7) {
                    i = -1;
                } else {
                    int i14 = ((bArrZzN[2] & 255) << 8) | (bArrZzN[3] & 255);
                    if (i14 == 65535) {
                        i14 = ((bArrZzN[4] & 255) << 16) | ((bArrZzN[5] & 255) << 8) | (bArrZzN[6] & 255);
                    } else {
                        i13 = 4;
                    }
                    if (iZzq == 44097) {
                        i13 += 2;
                    }
                    i = i14 + i13;
                }
                if (i == -1) {
                    return false;
                }
                zzadjVar2.zzl(i - 7, false);
            } else {
                zzaduVar.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzadjVar2.zzl(i12, false);
                i11 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
