package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaic implements zzadt {
    private final zzen zza;
    private final zzael zzb;
    private final zzaeh zzc;
    private final zzaej zzd;
    private final zzaez zze;
    private zzadw zzf;
    private zzaez zzg;
    private zzaez zzh;
    private int zzi;
    private zzav zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzaie zzp;
    private boolean zzq;

    public zzaic() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.google.android.gms.internal.ads.zzaes] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(com.google.android.gms.internal.ads.zzadu r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaic.zzg(com.google.android.gms.internal.ads.zzadu):int");
    }

    private final long zzh(long j4) {
        zzael zzaelVar = this.zzb;
        return ((j4 * 1000000) / zzaelVar.zzd) + this.zzk;
    }

    private final void zzj() {
        zzaie zzaieVar = this.zzp;
        if ((zzaieVar instanceof zzahz) && zzaieVar.zzh()) {
            long j4 = this.zzn;
            if (j4 == -1 || j4 == this.zzp.zzd()) {
                return;
            }
            this.zzp = ((zzahz) this.zzp).zzf(this.zzn);
            zzadw zzadwVar = this.zzf;
            zzadwVar.getClass();
            zzadwVar.zzP(this.zzp);
            this.zzg.getClass();
            this.zzp.zza();
        }
    }

    private static boolean zzk(int i, long j4) {
        return ((long) (i & (-128000))) == (j4 & (-128000));
    }

    private final boolean zzl(zzadu zzaduVar) throws IOException {
        zzaie zzaieVar = this.zzp;
        if (zzaieVar != null) {
            long jZzd = zzaieVar.zzd();
            if (jZzd != -1 && zzaduVar.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !zzaduVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzadu zzaduVar, boolean z10) throws IOException {
        int iZze;
        int i;
        int iZzb;
        zzaduVar.zzj();
        if (zzaduVar.zzf() == 0) {
            zzav zzavVarZza = this.zzd.zza(zzaduVar, null);
            this.zzj = zzavVarZza;
            if (zzavVarZza != null) {
                this.zzc.zzb(zzavVarZza);
            }
            iZze = (int) zzaduVar.zze();
            if (!z10) {
                zzaduVar.zzk(iZze);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i10 = i;
        int i11 = i10;
        while (true) {
            if (!zzl(zzaduVar)) {
                zzen zzenVar = this.zza;
                zzenVar.zzL(0);
                int iZzg = zzenVar.zzg();
                if ((i == 0 || zzk(iZzg, i)) && (iZzb = zzaem.zzb(iZzg)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(iZzg);
                        i = iZzg;
                    }
                    zzaduVar.zzg(iZzb - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == (true != z10 ? 131072 : Constants.QUEUE_ELEMENT_MAX_SIZE)) {
                        if (z10) {
                            return false;
                        }
                        zzj();
                        throw new EOFException();
                    }
                    if (z10) {
                        zzaduVar.zzj();
                        zzaduVar.zzg(iZze + i12);
                    } else {
                        zzaduVar.zzk(1);
                    }
                    i = 0;
                    i11 = i12;
                    i10 = 0;
                }
            } else if (i10 <= 0) {
                zzj();
                throw new EOFException();
            }
        }
        if (z10) {
            zzaduVar.zzk(iZze + i11);
        } else {
            zzaduVar.zzj();
        }
        this.zzi = i;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws Throwable {
        zzdd.zzb(this.zzg);
        String str = zzex.zza;
        int iZzg = zzg(zzaduVar);
        if (iZzg == -1 && (this.zzp instanceof zzaia)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzf = zzadwVar;
        zzaez zzaezVarZzw = zzadwVar.zzw(0, 1);
        this.zzg = zzaezVarZzw;
        this.zzh = zzaezVarZzw;
        this.zzf.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzo = 0;
        if (this.zzp instanceof zzaia) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        return zzm(zzaduVar, true);
    }

    public zzaic(int i) {
        this.zza = new zzen(10);
        this.zzb = new zzael();
        this.zzc = new zzaeh();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzaej();
        zzadp zzadpVar = new zzadp();
        this.zze = zzadpVar;
        this.zzh = zzadpVar;
        this.zzn = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
