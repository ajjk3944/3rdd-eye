package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaeu implements zzadt {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzadw zzf;
    private zzaez zzg;

    public zzaeu(int i, int i10, String str) {
        this.zza = i;
        this.zzb = i10;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaez zzaezVar = this.zzg;
        zzaezVar.getClass();
        int iZzf = zzaezVar.zzf(zzaduVar, 1024, true);
        if (iZzf == -1) {
            this.zze = 2;
            this.zzg.zzt(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZzf;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzf = zzadwVar;
        zzaez zzaezVarZzw = zzadwVar.zzw(1024, 4);
        this.zzg = zzaezVarZzw;
        zzx zzxVar = new zzx();
        String str = this.zzc;
        zzxVar.zzG(str);
        zzxVar.zzah(str);
        zzaezVarZzw.zzm(zzxVar.zzan());
        this.zzf.zzG();
        this.zzf.zzP(new zzaev(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        if (j4 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        int i = this.zza;
        zzdd.zzf((i == -1 || this.zzb == -1) ? false : true);
        int i10 = this.zzb;
        zzen zzenVar = new zzen(i10);
        ((zzadj) zzaduVar).zzm(zzenVar.zzN(), 0, i10, false);
        return zzenVar.zzq() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
