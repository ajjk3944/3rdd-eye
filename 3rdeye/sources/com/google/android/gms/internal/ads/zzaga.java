package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaga implements zzadt {
    private zzadw zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzafz zzo;
    private zzage zzp;
    private final zzen zza = new zzen(4);
    private final zzen zzb = new zzen(9);
    private final zzen zzc = new zzen(11);
    private final zzen zzd = new zzen();
    private final zzagb zze = new zzagb();
    private int zzg = 1;

    private final zzen zza(zzadu zzaduVar) throws IOException {
        zzen zzenVar = this.zzd;
        if (this.zzl > zzenVar.zzb()) {
            int iZzb = zzenVar.zzb();
            zzenVar.zzJ(new byte[Math.max(iZzb + iZzb, this.zzl)], 0);
        } else {
            zzenVar.zzL(0);
        }
        zzenVar.zzK(this.zzl);
        zzaduVar.zzi(zzenVar.zzN(), 0, this.zzl);
        return zzenVar;
    }

    private final void zzg() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzP(new zzaer(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadu r15, com.google.android.gms.internal.ads.zzaep r16) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaga.zzb(com.google.android.gms.internal.ads.zzadu, com.google.android.gms.internal.ads.zzaep):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzf = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        if (j4 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        zzen zzenVar = this.zza;
        zzadj zzadjVar = (zzadj) zzaduVar;
        zzadjVar.zzm(zzenVar.zzN(), 0, 3, false);
        zzenVar.zzL(0);
        if (zzenVar.zzo() != 4607062) {
            return false;
        }
        zzadjVar.zzm(zzenVar.zzN(), 0, 2, false);
        zzenVar.zzL(0);
        if ((zzenVar.zzq() & 250) != 0) {
            return false;
        }
        zzadjVar.zzm(zzenVar.zzN(), 0, 4, false);
        zzenVar.zzL(0);
        int iZzg = zzenVar.zzg();
        zzaduVar.zzj();
        zzadj zzadjVar2 = (zzadj) zzaduVar;
        zzadjVar2.zzl(iZzg, false);
        zzadjVar2.zzm(zzenVar.zzN(), 0, 4, false);
        zzenVar.zzL(0);
        return zzenVar.zzg() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
