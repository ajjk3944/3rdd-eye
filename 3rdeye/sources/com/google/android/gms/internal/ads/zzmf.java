package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzmf {
    private final zzma zza;
    private final int zzb;
    private final zzma zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmf(zzma zzmaVar, zzma zzmaVar2, int i) {
        this.zza = zzmaVar;
        this.zzb = i;
        this.zzc = zzmaVar2;
    }

    private final int zzL(zzma zzmaVar, zzlc zzlcVar, zzze zzzeVar, zzil zzilVar) throws zzin {
        if (zzmaVar != null && zzT(zzmaVar)) {
            zzma zzmaVar2 = this.zza;
            boolean z10 = zzmaVar != zzmaVar2;
            if ((zzmaVar != zzmaVar2 || !zzS()) && (zzmaVar != this.zzc || !zzU())) {
                zzwz zzwzVarZzp = zzmaVar.zzp();
                zzwz[] zzwzVarArr = zzlcVar.zzc;
                int i = this.zzb;
                zzwz zzwzVar = zzwzVarArr[i];
                boolean zZzb = zzzeVar.zzb(i);
                if (zZzb && zzwzVarZzp == zzwzVar) {
                    return 1;
                }
                if (!zzmaVar.zzR()) {
                    zzz[] zzzVarArrZzV = zzV(zzzeVar.zzc[i]);
                    zzwz zzwzVar2 = zzwzVarArr[i];
                    zzwzVar2.getClass();
                    zzmaVar.zzH(zzzVarArrZzV, zzwzVar2, zzlcVar.zzf(), zzlcVar.zze(), zzlcVar.zzg.zza);
                    return 3;
                }
                if (!zzmaVar.zzW()) {
                    return 0;
                }
                zzN(zzmaVar, zzilVar);
                if (!zZzb || zzH()) {
                    zzP(!z10);
                }
                return 1;
            }
        }
        return 1;
    }

    private final zzma zzM(zzlc zzlcVar) {
        if (zzlcVar != null) {
            int i = this.zzb;
            zzwz[] zzwzVarArr = zzlcVar.zzc;
            if (zzwzVarArr[i] != null) {
                zzma zzmaVar = this.zza;
                zzwz zzwzVarZzp = zzmaVar.zzp();
                zzwz zzwzVar = zzwzVarArr[i];
                if (zzwzVarZzp == zzwzVar) {
                    return zzmaVar;
                }
                zzma zzmaVar2 = this.zzc;
                if (zzmaVar2 != null && zzmaVar2.zzp() == zzwzVar) {
                    return zzmaVar2;
                }
            }
        }
        return null;
    }

    private final void zzN(zzma zzmaVar, zzil zzilVar) {
        boolean z10 = true;
        if (this.zza != zzmaVar && this.zzc != zzmaVar) {
            z10 = false;
        }
        zzdd.zzf(z10);
        if (zzT(zzmaVar)) {
            zzilVar.zzd(zzmaVar);
            zzW(zzmaVar);
            zzmaVar.zzr();
        }
    }

    private final void zzO(zzma zzmaVar, zzwz zzwzVar, zzil zzilVar, long j4, boolean z10) throws zzin {
        if (zzT(zzmaVar)) {
            if (zzwzVar != zzmaVar.zzp()) {
                zzN(zzmaVar, zzilVar);
            } else if (z10) {
                zzmaVar.zzJ(j4);
            }
        }
    }

    private final void zzP(boolean z10) {
        if (z10) {
            if (this.zze) {
                this.zza.zzI();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzma zzmaVar = this.zzc;
            zzmaVar.getClass();
            zzmaVar.zzI();
            this.zzf = false;
        }
    }

    private final void zzQ(boolean z10) throws zzin {
        if (z10) {
            zzma zzmaVar = this.zzc;
            zzmaVar.getClass();
            zzmaVar.zzu(17, this.zza);
        } else {
            zzma zzmaVar2 = this.zza;
            zzma zzmaVar3 = this.zzc;
            zzmaVar3.getClass();
            zzmaVar2.zzu(17, zzmaVar3);
        }
    }

    private final boolean zzR(zzlc zzlcVar, zzma zzmaVar) {
        if (zzmaVar == null) {
            return true;
        }
        zzwz[] zzwzVarArr = zzlcVar.zzc;
        int i = this.zzb;
        zzwz zzwzVar = zzwzVarArr[i];
        if (zzmaVar.zzp() != null) {
            if (zzmaVar.zzp() == zzwzVar) {
                if (zzwzVar != null && !zzmaVar.zzQ()) {
                    zzlcVar.zzg();
                    boolean z10 = zzlcVar.zzg.zzg;
                }
            }
            zzlc zzlcVarZzg = zzlcVar.zzg();
            return zzlcVarZzg != null && zzlcVarZzg.zzc[i] == zzmaVar.zzp();
        }
        return true;
    }

    private final boolean zzS() {
        int i = this.zzd;
        return i == 2 || i == 4;
    }

    private static boolean zzT(zzma zzmaVar) {
        return zzmaVar.zzcU() != 0;
    }

    private final boolean zzU() {
        return this.zzd == 3;
    }

    private static zzz[] zzV(zzyw zzywVar) {
        int iZzh = zzywVar != null ? zzywVar.zzh() : 0;
        zzz[] zzzVarArr = new zzz[iZzh];
        for (int i = 0; i < iZzh; i++) {
            zzywVar.getClass();
            zzzVarArr[i] = zzywVar.zza(i);
        }
        return zzzVarArr;
    }

    private static final void zzW(zzma zzmaVar) {
        if (zzmaVar.zzcU() == 2) {
            zzmaVar.zzP();
        }
    }

    private static final void zzX(zzma zzmaVar, long j4) {
        zzmaVar.zzK();
        if (zzmaVar instanceof zzxo) {
            throw null;
        }
    }

    public final void zzA() {
        int i;
        zzdd.zzf(!zzH());
        if (zzT(this.zza)) {
            i = 3;
        } else {
            zzma zzmaVar = this.zzc;
            i = (zzmaVar == null || !zzT(zzmaVar)) ? 2 : 4;
        }
        this.zzd = i;
    }

    public final void zzB() {
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar)) {
            zzW(zzmaVar);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2)) {
            return;
        }
        zzW(zzmaVar2);
    }

    public final boolean zzC(zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        return zzmaVarZzM == null || zzmaVarZzM.zzQ() || zzmaVarZzM.zzX() || zzmaVarZzM.zzW();
    }

    public final boolean zzD(zzlc zzlcVar) {
        return zzR(zzlcVar, this.zza) && zzR(zzlcVar, this.zzc);
    }

    public final boolean zzE(zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        return zzmaVarZzM.zzQ();
    }

    public final boolean zzF() {
        return this.zzc != null;
    }

    public final boolean zzG() {
        zzma zzmaVar = this.zza;
        boolean zZzW = zzT(zzmaVar) ? zzmaVar.zzW() : true;
        zzma zzmaVar2 = this.zzc;
        return (zzmaVar2 == null || !zzT(zzmaVar2)) ? zZzW : zZzW & zzmaVar2.zzW();
    }

    public final boolean zzH() {
        return zzS() || zzU();
    }

    public final boolean zzI(zzlc zzlcVar) {
        return (zzS() && zzM(zzlcVar) == this.zza) || (zzU() && zzM(zzlcVar) == this.zzc);
    }

    public final boolean zzJ(zzlc zzlcVar) {
        return zzM(zzlcVar) != null;
    }

    public final boolean zzK() {
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            return zzT(this.zza);
        }
        zzma zzmaVar = this.zzc;
        zzmaVar.getClass();
        return zzT(zzmaVar);
    }

    public final int zza() {
        zzma zzmaVar = this.zzc;
        boolean zZzT = zzT(this.zza);
        int i = 0;
        if (zzmaVar != null && zzT(zzmaVar)) {
            i = 1;
        }
        return (zZzT ? 1 : 0) + i;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final int zzc(zzlc zzlcVar, zzze zzzeVar, zzil zzilVar) throws zzin {
        int iZzL = zzL(this.zza, zzlcVar, zzzeVar, zzilVar);
        return iZzL == 1 ? zzL(this.zzc, zzlcVar, zzzeVar, zzilVar) : iZzL;
    }

    public final long zzd(zzlc zzlcVar) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        Objects.requireNonNull(zzmaVarZzM);
        return zzmaVarZzM.zzcW();
    }

    public final void zze(zzil zzilVar) throws zzin {
        zzN(this.zza, zzilVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            boolean z10 = zzT(zzmaVar) && this.zzd != 3;
            zzN(zzmaVar, zzilVar);
            zzP(false);
            if (z10) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzf(zzil zzilVar) {
        boolean z10;
        zzma zzmaVar;
        if (zzH()) {
            int i = this.zzd;
            if (i == 4) {
                z10 = true;
            } else if (i == 2) {
                i = 2;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zzmaVar = this.zza;
            } else {
                zzmaVar = this.zzc;
                zzmaVar.getClass();
            }
            zzN(zzmaVar, zzilVar);
            zzP(z10);
            this.zzd = i == 4 ? 1 : 0;
        }
    }

    public final void zzg(zzme zzmeVar, zzyw zzywVar, zzwz zzwzVar, long j4, boolean z10, boolean z11, long j10, long j11, zzvh zzvhVar, zzil zzilVar) throws zzin {
        zzz[] zzzVarArrZzV = zzV(zzywVar);
        int i = this.zzd;
        if (i == 0 || i == 2 || i == 4) {
            this.zze = true;
            zzma zzmaVar = this.zza;
            zzmaVar.zzs(zzmeVar, zzzVarArrZzV, zzwzVar, j4, z10, z11, j10, j11, zzvhVar);
            zzilVar.zze(zzmaVar);
            return;
        }
        this.zzf = true;
        zzma zzmaVar2 = this.zzc;
        zzmaVar2.getClass();
        zzmaVar2.zzs(zzmeVar, zzzVarArrZzV, zzwzVar, j4, z10, z11, j10, j11, zzvhVar);
        zzilVar.zze(zzmaVar2);
    }

    public final void zzh() {
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar)) {
            zzmaVar.zzt();
            return;
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2)) {
            return;
        }
        zzmaVar2.zzt();
    }

    public final void zzi(int i, Object obj, zzlc zzlcVar) throws zzin {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        zzmaVarZzM.zzu(11, obj);
    }

    public final void zzj(zzwz zzwzVar, zzil zzilVar, long j4, boolean z10) throws zzin {
        zzO(this.zza, zzwzVar, zzilVar, j4, z10);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzO(zzmaVar, zzwzVar, zzilVar, j4, z10);
        }
    }

    public final void zzk() throws zzin {
        int i = this.zzd;
        if (i == 3 || i == 4) {
            zzQ(i == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i == 2) {
            this.zzd = 0;
        }
    }

    public final void zzl(zzze zzzeVar, zzze zzzeVar2, long j4) {
        int i;
        int i10 = this.zzb;
        boolean zZzb = zzzeVar.zzb(i10);
        boolean zZzb2 = zzzeVar2.zzb(i10);
        zzma zzmaVar = this.zzc;
        if (zzmaVar == null || (i = this.zzd) == 3 || (i == 0 && zzT(this.zza))) {
            zzmaVar = this.zza;
        }
        if (!zZzb || zzmaVar.zzR()) {
            return;
        }
        zzb();
        zzme zzmeVar = zzzeVar.zzb[i10];
        zzme zzmeVar2 = zzzeVar2.zzb[i10];
        if (zZzb2 && Objects.equals(zzmeVar2, zzmeVar) && !zzH()) {
            return;
        }
        zzX(zzmaVar, j4);
    }

    public final void zzm(zzlc zzlcVar) throws IOException {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        zzmaVarZzM.zzw();
    }

    public final void zzn() {
        this.zza.zzG();
        this.zze = false;
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzG();
            this.zzf = false;
        }
    }

    public final void zzo(long j4, long j10) throws zzin {
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar)) {
            zzmaVar.zzV(j4, j10);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2)) {
            return;
        }
        zzmaVar2.zzV(j4, j10);
    }

    public final void zzp() {
        if (!zzT(this.zza)) {
            zzP(true);
        }
        zzma zzmaVar = this.zzc;
        if (zzmaVar == null || zzT(zzmaVar)) {
            return;
        }
        zzP(false);
    }

    public final void zzq(zzlc zzlcVar, long j4) throws zzin {
        zzma zzmaVarZzM = zzM(zzlcVar);
        if (zzmaVarZzM != null) {
            zzmaVarZzM.zzJ(j4);
        }
    }

    public final void zzr(long j4) {
        int i;
        zzma zzmaVar = this.zza;
        if (zzT(zzmaVar) && (i = this.zzd) != 4 && i != 2) {
            zzX(zzmaVar, j4);
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || !zzT(zzmaVar2) || this.zzd == 3) {
            return;
        }
        zzX(zzmaVar2, j4);
    }

    public final void zzs(zzlc zzlcVar, long j4) {
        zzma zzmaVarZzM = zzM(zzlcVar);
        zzmaVarZzM.getClass();
        zzX(zzmaVarZzM, j4);
    }

    public final void zzt(float f10, float f11) throws zzin {
        this.zza.zzM(f10, f11);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzM(f10, f11);
        }
    }

    public final void zzu(zzmh zzmhVar) throws zzin {
        this.zza.zzu(18, zzmhVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzu(18, zzmhVar);
        }
    }

    public final void zzv(zzbl zzblVar) {
        this.zza.zzN(zzblVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzN(zzblVar);
        }
    }

    public final void zzw(zzabo zzaboVar) throws zzin {
        if (zzb() != 2) {
            return;
        }
        this.zza.zzu(7, zzaboVar);
        zzma zzmaVar = this.zzc;
        if (zzmaVar != null) {
            zzmaVar.zzu(7, zzaboVar);
        }
    }

    public final void zzx(Object obj) throws zzin {
        if (zzb() != 2) {
            return;
        }
        int i = this.zzd;
        if (i != 4 && i != 1) {
            this.zza.zzu(1, obj);
            return;
        }
        zzma zzmaVar = this.zzc;
        zzmaVar.getClass();
        zzmaVar.zzu(1, obj);
    }

    public final void zzy(float f10) throws zzin {
        if (zzb() != 1) {
            return;
        }
        zzma zzmaVar = this.zza;
        Float fValueOf = Float.valueOf(f10);
        zzmaVar.zzu(2, fValueOf);
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 != null) {
            zzmaVar2.zzu(2, fValueOf);
        }
    }

    public final void zzz() throws zzin {
        zzma zzmaVar = this.zza;
        if (zzmaVar.zzcU() == 1 && this.zzd != 4) {
            zzmaVar.zzO();
            return;
        }
        zzma zzmaVar2 = this.zzc;
        if (zzmaVar2 == null || zzmaVar2.zzcU() != 1 || this.zzd == 3) {
            return;
        }
        zzmaVar2.zzO();
    }
}
