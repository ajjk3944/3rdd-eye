package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamo implements zzadt {
    private final zzamp zza = new zzamp(null, 0, "audio/ac3");
    private final zzen zzb = new zzen(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        zzen zzenVar = this.zzb;
        int iZza = zzaduVar.zza(zzenVar.zzN(), 0, 2786);
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
        zzen zzenVar = new zzen(10);
        int i = 0;
        while (true) {
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
        int i10 = 0;
        int i11 = i;
        while (true) {
            zzadjVar2.zzm(zzenVar.zzN(), 0, 6, false);
            zzenVar.zzL(0);
            if (zzenVar.zzq() != 2935) {
                zzaduVar.zzj();
                i11++;
                if (i11 - i >= 8192) {
                    return false;
                }
                zzadjVar2.zzl(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                int iZzb = zzact.zzb(zzenVar.zzN());
                if (iZzb == -1) {
                    return false;
                }
                zzadjVar2.zzl(iZzb - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
