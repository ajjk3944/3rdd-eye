package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzagh implements zzadt {
    private zzadw zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzahk zzg;
    private zzadu zzh;
    private zzagk zzi;
    private zzajh zzj;
    private final zzen zza = new zzen(6);
    private long zzf = -1;

    private final int zza(zzadu zzaduVar) throws IOException {
        zzen zzenVar = this.zza;
        zzenVar.zzI(2);
        ((zzadj) zzaduVar).zzm(zzenVar.zzN(), 0, 2, false);
        return zzenVar.zzq();
    }

    private final void zzg() {
        zzadw zzadwVar = this.zzb;
        zzadwVar.getClass();
        zzadwVar.zzG();
        this.zzb.zzP(new zzaer(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e  */
    @Override // com.google.android.gms.internal.ads.zzadt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadu r27, com.google.android.gms.internal.ads.zzaep r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagh.zzb(com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaep):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzb = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        if (j4 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzajh zzajhVar = this.zzj;
            zzajhVar.getClass();
            zzajhVar.zzf(j4, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        if (zza(zzaduVar) != 65496) {
            return false;
        }
        int iZza = zza(zzaduVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            zzen zzenVar = this.zza;
            zzenVar.zzI(2);
            zzadj zzadjVar = (zzadj) zzaduVar;
            zzadjVar.zzm(zzenVar.zzN(), 0, 2, false);
            zzadjVar.zzl(zzenVar.zzq() - 2, false);
            iZza = zza(zzaduVar);
            this.zzd = iZza;
        }
        if (iZza == 65505) {
            zzadj zzadjVar2 = (zzadj) zzaduVar;
            zzadjVar2.zzl(2, false);
            zzen zzenVar2 = this.zza;
            zzenVar2.zzI(6);
            zzadjVar2.zzm(zzenVar2.zzN(), 0, 6, false);
            if (zzenVar2.zzu() == 1165519206 && zzenVar2.zzq() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
