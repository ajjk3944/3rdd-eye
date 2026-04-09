package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzkt implements Handler.Callback, zzve, zzzc, zzlq, zzik, zzlu, zzia, zzabo {
    private static final long zza = zzex.zzv(10000);
    private boolean zzB;
    private boolean zzC;
    private zzkr zzD;
    private zzls zzE;
    private zzkq zzF;
    private boolean zzG;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzO;
    private int zzP;
    private zzkr zzQ;
    private long zzR;
    private long zzS;
    private int zzT;
    private boolean zzU;
    private zzin zzV;
    private zzix zzX;
    private boolean zzZ;
    private final zzjj zzab;
    private final zzig zzac;
    private final zzmf[] zzb;
    private final zzmd[] zzc;
    private final boolean[] zzd;
    private final zzzd zze;
    private final zzze zzf;
    private final zzkx zzg;
    private final zzzl zzh;
    private final zzdt zzi;
    private final zzlt zzj;
    private final Looper zzk;
    private final zzbk zzl;
    private final zzbj zzm;
    private final long zzn;
    private final zzil zzo;
    private final ArrayList zzp;
    private final zzdj zzq;
    private final zzlf zzr;
    private final zzlr zzs;
    private final long zzt;
    private final zzph zzu;
    private final zzmo zzv;
    private final zzdt zzw;
    private final boolean zzx;
    private final zzib zzy;
    private zzmi zzz;
    private long zzY = -9223372036854775807L;
    private int zzM = 0;
    private boolean zzN = false;
    private boolean zzH = false;
    private float zzaa = 1.0f;
    private zzmh zzA = zzmh.zza;
    private long zzW = -9223372036854775807L;
    private long zzK = -9223372036854775807L;

    public zzkt(Context context, zzma[] zzmaVarArr, zzma[] zzmaVarArr2, zzzd zzzdVar, zzze zzzeVar, zzkx zzkxVar, zzzl zzzlVar, int i, boolean z10, zzmo zzmoVar, zzmi zzmiVar, zzig zzigVar, long j4, boolean z11, boolean z12, Looper looper, zzdj zzdjVar, zzjj zzjjVar, zzph zzphVar, zzlt zzltVar, zzix zzixVar, final zzabo zzaboVar) {
        this.zzab = zzjjVar;
        this.zze = zzzdVar;
        this.zzf = zzzeVar;
        this.zzg = zzkxVar;
        this.zzh = zzzlVar;
        int i10 = 0;
        this.zzz = zzmiVar;
        this.zzac = zzigVar;
        this.zzt = j4;
        this.zzq = zzdjVar;
        this.zzu = zzphVar;
        this.zzX = zzixVar;
        this.zzv = zzmoVar;
        this.zzn = zzkxVar.zzb(zzphVar);
        zzkxVar.zzg(zzphVar);
        zzbl zzblVar = zzbl.zza;
        zzls zzlsVarZzh = zzls.zzh(zzzeVar);
        this.zzE = zzlsVarZzh;
        this.zzF = new zzkq(zzlsVarZzh);
        int length = zzmaVarArr.length;
        this.zzc = new zzmd[2];
        this.zzd = new boolean[2];
        zzmc zzmcVarZze = zzzdVar.zze();
        this.zzb = new zzmf[2];
        boolean z13 = false;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            zzmaVarArr[i10].zzv(i10, zzphVar, zzdjVar);
            this.zzc[i10] = zzmaVarArr[i10].zzm();
            this.zzc[i10].zzL(zzmcVarZze);
            zzma zzmaVar = zzmaVarArr2[i10];
            if (zzmaVar != null) {
                zzmaVar.zzv(i10, zzphVar, zzdjVar);
                z13 = true;
            }
            this.zzb[i10] = new zzmf(zzmaVarArr[i10], zzmaVarArr2[i10], i10);
            i10++;
        }
        this.zzx = z13;
        this.zzo = new zzil(this, zzdjVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbk();
        this.zzm = new zzbj();
        zzzdVar.zzr(this, zzzlVar);
        this.zzU = true;
        zzdt zzdtVarZzd = zzdjVar.zzd(looper, null);
        this.zzw = zzdtVarZzd;
        this.zzr = new zzlf(zzmoVar, zzdtVarZzd, new zzkk(this), zzixVar);
        this.zzs = new zzlr(this, zzmoVar, zzdtVarZzd, zzphVar);
        zzlt zzltVar2 = new zzlt(null);
        this.zzj = zzltVar2;
        Looper looperZza = zzltVar2.zza();
        this.zzk = looperZza;
        zzdt zzdtVarZzd2 = zzdjVar.zzd(looperZza, this);
        this.zzi = zzdtVarZzd2;
        this.zzy = new zzib(context, looperZza, this);
        zzdtVarZzd2.zzc(35, new zzabo() { // from class: com.google.android.gms.internal.ads.zzkl
            @Override // com.google.android.gms.internal.ads.zzabo
            public final void zzcT(long j10, long j11, zzz zzzVar, MediaFormat mediaFormat) {
                this.zza.zzcT(j10, j11, zzzVar, mediaFormat);
            }
        }).zza();
    }

    private final long zzA(long j4) {
        zzlc zzlcVarZzi = this.zzr.zzi();
        if (zzlcVarZzi == null) {
            return 0L;
        }
        return Math.max(0L, j4 - (this.zzR - zzlcVarZzi.zze()));
    }

    private final long zzB(zzvh zzvhVar, long j4, boolean z10) throws zzin {
        zzlf zzlfVar = this.zzr;
        return zzC(zzvhVar, j4, zzlfVar.zzj() != zzlfVar.zzn(), z10);
    }

    private final long zzC(zzvh zzvhVar, long j4, boolean z10, boolean z11) throws zzin {
        zzal();
        zzat(false, true);
        if (z11 || this.zzE.zze == 3) {
            zzah(2);
        }
        zzlf zzlfVar = this.zzr;
        zzlc zzlcVarZzj = zzlfVar.zzj();
        zzlc zzlcVarZzg = zzlcVarZzj;
        while (zzlcVarZzg != null && !zzvhVar.equals(zzlcVarZzg.zzg.zza)) {
            zzlcVarZzg = zzlcVarZzg.zzg();
        }
        if (z10 || zzlcVarZzj != zzlcVarZzg || (zzlcVarZzg != null && zzlcVarZzg.zze() + j4 < 0)) {
            zzI();
            if (zzlcVarZzg != null) {
                while (zzlfVar.zzj() != zzlcVarZzg) {
                    zzlfVar.zze();
                }
                zzlfVar.zza(zzlcVarZzg);
                zzlcVarZzg.zzq(1000000000000L);
                zzK();
                zzlcVarZzg.zzh = true;
            }
        }
        zzH();
        if (zzlcVarZzg != null) {
            zzlfVar.zza(zzlcVarZzg);
            if (!zzlcVarZzg.zze) {
                zzlcVarZzg.zzg = zzlcVarZzg.zzg.zzb(j4);
            } else if (zzlcVarZzg.zzf) {
                zzvf zzvfVar = zzlcVarZzg.zza;
                j4 = zzvfVar.zze(j4);
                zzvfVar.zzh(j4 - this.zzn, false);
            }
            zzaa(j4);
            zzR();
        } else {
            zzlfVar.zzs();
            zzaa(j4);
        }
        zzN(false);
        this.zzi.zzj(2);
        return j4;
    }

    private final Pair zzD(zzbl zzblVar) {
        long j4 = 0;
        if (zzblVar.zzo()) {
            return Pair.create(zzls.zzi(), 0L);
        }
        int iZzg = zzblVar.zzg(this.zzN);
        zzbk zzbkVar = this.zzl;
        zzbj zzbjVar = this.zzm;
        Pair pairZzl = zzblVar.zzl(zzbkVar, zzbjVar, iZzg, -9223372036854775807L);
        zzvh zzvhVarZzq = this.zzr.zzq(zzblVar, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (zzvhVarZzq.zzb()) {
            zzblVar.zzn(zzvhVarZzq.zza, zzbjVar);
            if (zzvhVarZzq.zzc == zzbjVar.zze(zzvhVarZzq.zzb)) {
                zzbjVar.zzh();
            }
        } else {
            j4 = jLongValue;
        }
        return Pair.create(zzvhVarZzq, Long.valueOf(j4));
    }

    private static Pair zzE(zzbl zzblVar, zzkr zzkrVar, boolean z10, int i, boolean z11, zzbk zzbkVar, zzbj zzbjVar) {
        Pair pairZzl;
        zzbl zzblVar2;
        zzbl zzblVar3 = zzkrVar.zza;
        if (zzblVar.zzo()) {
            return null;
        }
        if (true == zzblVar3.zzo()) {
            zzblVar3 = zzblVar;
        }
        try {
            pairZzl = zzblVar3.zzl(zzbkVar, zzbjVar, zzkrVar.zzb, zzkrVar.zzc);
            zzblVar2 = zzblVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzblVar.equals(zzblVar2)) {
            return pairZzl;
        }
        if (zzblVar.zza(pairZzl.first) != -1) {
            return (zzblVar2.zzn(pairZzl.first, zzbjVar).zzf && zzblVar2.zze(zzbjVar.zzc, zzbkVar, 0L).zzn == zzblVar2.zza(pairZzl.first)) ? zzblVar.zzl(zzbkVar, zzbjVar, zzblVar.zzn(pairZzl.first, zzbjVar).zzc, zzkrVar.zzc) : pairZzl;
        }
        int iZzd = zzd(zzbkVar, zzbjVar, i, z11, pairZzl.first, zzblVar2, zzblVar);
        if (iZzd != -1) {
            return zzblVar.zzl(zzbkVar, zzbjVar, iZzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzls zzF(com.google.android.gms.internal.ads.zzvh r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzF(com.google.android.gms.internal.ads.zzvh, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzls");
    }

    private final void zzG() throws zzin {
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmfVarArr[i].zzu(this.zzB ? this.zzA : null);
            i++;
        }
    }

    private final void zzH() {
        if (this.zzx && zzau()) {
            zzmf[] zzmfVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzmf zzmfVar = zzmfVarArr[i];
                int iZza = zzmfVar.zza();
                zzmfVar.zzf(this.zzo);
                this.zzP -= iZza - zzmfVar.zza();
            }
            this.zzY = -9223372036854775807L;
        }
    }

    private final void zzI() throws zzin {
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i >= 2) {
                this.zzY = -9223372036854775807L;
                return;
            }
            int iZza = zzmfVarArr[i].zza();
            zzmfVarArr[i].zze(this.zzo);
            zzV(i, false);
            this.zzP -= iZza;
            i++;
        }
    }

    private final void zzJ(zzlc zzlcVar, int i, boolean z10, long j4) throws zzin {
        zzmf zzmfVar = this.zzb[i];
        if (zzmfVar.zzK()) {
            return;
        }
        boolean z11 = zzlcVar == this.zzr.zzj();
        zzze zzzeVarZzi = zzlcVar.zzi();
        zzme zzmeVar = zzzeVarZzi.zzb[i];
        zzyw zzywVar = zzzeVarZzi.zzc[i];
        boolean z12 = zzax() && this.zzE.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzP++;
        zzmfVar.zzg(zzmeVar, zzywVar, zzlcVar.zzc[i], this.zzR, z13, z11, j4, zzlcVar.zze(), zzlcVar.zzg.zza, this.zzo);
        zzmfVar.zzi(11, new zzkm(this), zzlcVar);
        if (z12 && z11) {
            zzmfVar.zzz();
        }
    }

    private final void zzK() throws zzin {
        zzL(new boolean[2], this.zzr.zzn().zzf());
    }

    private final void zzL(boolean[] zArr, long j4) throws zzin {
        zzmf[] zzmfVarArr;
        long j10;
        zzlc zzlcVarZzn = this.zzr.zzn();
        zzze zzzeVarZzi = zzlcVarZzn.zzi();
        int i = 0;
        while (true) {
            zzmfVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzzeVarZzi.zzb(i)) {
                zzmfVarArr[i].zzp();
            }
            i++;
        }
        int i10 = 0;
        while (i10 < 2) {
            if (!zzzeVarZzi.zzb(i10) || zzmfVarArr[i10].zzJ(zzlcVarZzn)) {
                j10 = j4;
            } else {
                j10 = j4;
                zzJ(zzlcVarZzn, i10, zArr[i10], j10);
            }
            i10++;
            j4 = j10;
        }
    }

    private final void zzM(IOException iOException, int i) {
        zzlf zzlfVar = this.zzr;
        zzin zzinVarZzc = zzin.zzc(iOException, i);
        zzlc zzlcVarZzj = zzlfVar.zzj();
        if (zzlcVarZzj != null) {
            zzinVarZzc = zzinVarZzc.zza(zzlcVarZzj.zzg.zza);
        }
        zzea.zzd("ExoPlayerImplInternal", "Playback error", zzinVarZzc);
        zzak(false, false);
        this.zzE = this.zzE.zze(zzinVarZzc);
    }

    private final void zzN(boolean z10) {
        zzlc zzlcVarZzi = this.zzr.zzi();
        zzvh zzvhVar = zzlcVarZzi == null ? this.zzE.zzb : zzlcVarZzi.zzg.zza;
        boolean zEquals = this.zzE.zzk.equals(zzvhVar);
        if (!zEquals) {
            this.zzE = this.zzE.zzb(zzvhVar);
        }
        zzls zzlsVar = this.zzE;
        zzlsVar.zzq = zzlcVarZzi == null ? zzlsVar.zzs : zzlcVarZzi.zzc();
        this.zzE.zzr = zzz();
        if ((!zEquals || z10) && zzlcVarZzi != null && zzlcVarZzi.zze) {
            zzan(zzlcVarZzi.zzg.zza, zzlcVarZzi.zzh(), zzlcVarZzi.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03af  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzO(com.google.android.gms.internal.ads.zzbl r30, boolean r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzO(com.google.android.gms.internal.ads.zzbl, boolean):void");
    }

    private final void zzP(zzbb zzbbVar, boolean z10) throws zzin {
        zzQ(zzbbVar, zzbbVar.zzb, true, z10);
    }

    private final void zzQ(zzbb zzbbVar, float f10, boolean z10, boolean z11) throws zzin {
        int i;
        if (z10) {
            if (z11) {
                this.zzF.zza(1);
            }
            zzls zzlsVar = this.zzE;
            this.zzE = new zzls(zzlsVar.zza, zzlsVar.zzb, zzlsVar.zzc, zzlsVar.zzd, zzlsVar.zze, zzlsVar.zzf, zzlsVar.zzg, zzlsVar.zzh, zzlsVar.zzi, zzlsVar.zzj, zzlsVar.zzk, zzlsVar.zzl, zzlsVar.zzm, zzlsVar.zzn, zzbbVar, zzlsVar.zzq, zzlsVar.zzr, zzlsVar.zzs, zzlsVar.zzt, false);
        }
        float f11 = zzbbVar.zzb;
        zzlc zzlcVarZzj = this.zzr.zzj();
        while (true) {
            i = 0;
            if (zzlcVarZzj == null) {
                break;
            }
            zzyw[] zzywVarArr = zzlcVarZzj.zzi().zzc;
            int length = zzywVarArr.length;
            while (i < length) {
                zzyw zzywVar = zzywVarArr[i];
                i++;
            }
            zzlcVarZzj = zzlcVarZzj.zzg();
        }
        zzmf[] zzmfVarArr = this.zzb;
        while (i < 2) {
            zzmfVarArr[i].zzt(f10, f11);
            i++;
        }
    }

    private final void zzR() {
        long jZze;
        long jZze2;
        zzlf zzlfVar = this.zzr;
        boolean zZzh = false;
        if (zzaz(zzlfVar.zzi())) {
            zzlc zzlcVarZzi = zzlfVar.zzi();
            long jZzA = zzA(zzlcVarZzi.zzd());
            if (zzlcVarZzi == zzlfVar.zzj()) {
                jZze = this.zzR;
                jZze2 = zzlcVarZzi.zze();
            } else {
                jZze = this.zzR - zzlcVarZzi.zze();
                jZze2 = zzlcVarZzi.zzg.zzb;
            }
            zzkw zzkwVar = new zzkw(this.zzu, this.zzE.zza, zzlcVarZzi.zzg.zza, jZze - jZze2, jZzA, this.zzo.zzc().zzb, this.zzE.zzl, this.zzJ, zzay(this.zzE.zza, zzlcVarZzi.zzg.zza) ? this.zzac.zzb() : -9223372036854775807L, this.zzK);
            zzkx zzkxVar = this.zzg;
            boolean zZzh2 = zzkxVar.zzh(zzkwVar);
            zzlc zzlcVarZzj = zzlfVar.zzj();
            if (zZzh2 || !zzlcVarZzj.zze || jZzA >= 500000 || this.zzn <= 0) {
                zZzh = zZzh2;
            } else {
                zzlcVarZzj.zza.zzh(this.zzE.zzs, false);
                zZzh = zzkxVar.zzh(zzkwVar);
            }
        }
        this.zzL = zZzh;
        if (zZzh) {
            zzlc zzlcVarZzi2 = zzlfVar.zzi();
            zzlcVarZzi2.getClass();
            zzky zzkyVar = new zzky();
            zzkyVar.zze(this.zzR - zzlcVarZzi2.zze());
            zzkyVar.zzf(this.zzo.zzc().zzb);
            zzkyVar.zzd(this.zzK);
            zzlcVarZzi2.zzk(new zzla(zzkyVar, null));
        }
        zzam();
    }

    private final void zzS() {
        zzlf zzlfVar = this.zzr;
        zzlfVar.zzt();
        zzlc zzlcVarZzl = zzlfVar.zzl();
        if (zzlcVarZzl != null) {
            if (!zzlcVarZzl.zzd || zzlcVarZzl.zze) {
                zzvf zzvfVar = zzlcVarZzl.zza;
                if (zzvfVar.zzp()) {
                    return;
                }
                if (this.zzg.zzi(this.zzE.zza, zzlcVarZzl.zzg.zza, zzlcVarZzl.zze ? zzvfVar.zzb() : 0L)) {
                    if (!zzlcVarZzl.zzd) {
                        zzlcVarZzl.zzm(this, zzlcVarZzl.zzg.zzb);
                        return;
                    }
                    zzky zzkyVar = new zzky();
                    zzkyVar.zze(this.zzR - zzlcVarZzl.zze());
                    zzkyVar.zzf(this.zzo.zzc().zzb);
                    zzkyVar.zzd(this.zzK);
                    zzlcVarZzl.zzk(new zzla(zzkyVar, null));
                }
            }
        }
    }

    private final void zzT() {
        this.zzF.zzb(this.zzE);
        if (this.zzF.zze) {
            zzjj zzjjVar = this.zzab;
            zzjjVar.zza.zzab(this.zzF);
            this.zzF = new zzkq(this.zzE);
        }
    }

    private final void zzU(int i) throws Throwable {
        zzmf zzmfVar = this.zzb[i];
        try {
            zzlc zzlcVarZzj = this.zzr.zzj();
            if (zzlcVarZzj == null) {
                throw null;
            }
            zzmfVar.zzm(zzlcVarZzj);
        } catch (IOException e4) {
            e = e4;
            zzmfVar.zzb();
            throw e;
        } catch (RuntimeException e10) {
            e = e10;
            zzmfVar.zzb();
            throw e;
        }
    }

    private final void zzV(final int i, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z10) {
            zArr[i] = z10;
            this.zzw.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // java.lang.Runnable
                public final void run() {
                    zzkt zzktVar = this.zza;
                    int i10 = i;
                    zzktVar.zzv.zzJ(i10, zzktVar.zzb[i10].zzb(), z10);
                }
            });
        }
    }

    private final void zzW() throws zzin {
        zzkt zzktVar;
        int i;
        int i10;
        boolean z10;
        zzil zzilVar = this.zzo;
        float f10 = zzilVar.zzc().zzb;
        zzlf zzlfVar = this.zzr;
        zzlc zzlcVarZzj = zzlfVar.zzj();
        zzlc zzlcVarZzn = zzlfVar.zzn();
        zzze zzzeVar = null;
        boolean z11 = true;
        while (zzlcVarZzj != null && zzlcVarZzj.zze) {
            zzls zzlsVar = this.zzE;
            zzze zzzeVarZzj = zzlcVarZzj.zzj(f10, zzlsVar.zza, zzlsVar.zzl);
            zzze zzzeVar2 = zzlcVarZzj == zzlfVar.zzj() ? zzzeVarZzj : zzzeVar;
            zzze zzzeVarZzi = zzlcVarZzj.zzi();
            boolean z12 = false;
            if (zzzeVarZzi != null) {
                zzyw[] zzywVarArr = zzzeVarZzj.zzc;
                if (zzzeVarZzi.zzc.length == zzywVarArr.length) {
                    for (int i11 = 0; i11 < zzywVarArr.length; i11++) {
                        if (zzzeVarZzj.zza(zzzeVarZzi, i11)) {
                        }
                    }
                    if (zzlcVarZzj != zzlcVarZzn) {
                        z12 = true;
                    }
                    z11 &= z12;
                    zzlcVarZzj = zzlcVarZzj.zzg();
                    zzzeVar = zzzeVar2;
                }
            }
            if (z11) {
                zzlc zzlcVarZzj2 = zzlfVar.zzj();
                int iZza = zzlfVar.zza(zzlcVarZzj2) & 1;
                zzmf[] zzmfVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzzeVar2.getClass();
                long jZzb = zzlcVarZzj2.zzb(zzzeVar2, this.zzE.zzs, 1 == iZza, zArr);
                zzls zzlsVar2 = this.zzE;
                if (zzlsVar2.zze == 4 || jZzb == zzlsVar2.zzs) {
                    z10 = false;
                } else {
                    z10 = false;
                    z12 = true;
                }
                zzls zzlsVar3 = this.zzE;
                boolean z13 = z10;
                i = 4;
                i10 = 2;
                zzktVar = this;
                zzktVar.zzE = zzF(zzlsVar3.zzb, jZzb, zzlsVar3.zzc, zzlsVar3.zzd, z12, 5);
                if (z12) {
                    zzktVar.zzaa(jZzb);
                }
                zzktVar.zzH();
                boolean[] zArr2 = new boolean[2];
                int i12 = z13;
                while (i12 < 2) {
                    int iZza2 = zzmfVarArr[i12].zza();
                    zArr2[i12] = zzmfVarArr[i12].zzK();
                    zzil zzilVar2 = zzilVar;
                    zzmfVarArr[i12].zzj(zzlcVarZzj2.zzc[i12], zzilVar2, zzktVar.zzR, zArr[i12]);
                    if (iZza2 - zzmfVarArr[i12].zza() > 0) {
                        zzktVar.zzV(i12, z13);
                    }
                    zzktVar.zzP -= iZza2 - zzmfVarArr[i12].zza();
                    i12++;
                    zzilVar = zzilVar2;
                }
                zzktVar.zzL(zArr2, zzktVar.zzR);
                zzlcVarZzj2.zzh = true;
            } else {
                zzktVar = this;
                i = 4;
                i10 = 2;
                zzlfVar.zza(zzlcVarZzj);
                if (zzlcVarZzj.zze) {
                    long jMax = Math.max(zzlcVarZzj.zzg.zzb, zzktVar.zzR - zzlcVarZzj.zze());
                    if (zzktVar.zzx && zzktVar.zzau() && zzlfVar.zzm() == zzlcVarZzj) {
                        zzktVar.zzH();
                    }
                    zzlcVarZzj.zza(zzzeVarZzj, jMax, false);
                }
            }
            zzktVar.zzN(true);
            if (zzktVar.zzE.zze != i) {
                zzktVar.zzR();
                zzktVar.zzar();
                zzktVar.zzi.zzj(i10);
                return;
            }
            return;
        }
    }

    private final void zzX() throws zzin {
        zzW();
        zzad(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[PHI: r2 r7 r9
  0x0094: PHI (r2v2 com.google.android.gms.internal.ads.zzvh) = (r2v1 com.google.android.gms.internal.ads.zzvh), (r2v11 com.google.android.gms.internal.ads.zzvh) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:25:0x006a, B:27:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[PHI: r3
  0x00d8: PHI (r3v3 com.google.android.gms.internal.ads.zzbl) = 
  (r3v2 com.google.android.gms.internal.ads.zzbl)
  (r3v2 com.google.android.gms.internal.ads.zzbl)
  (r3v12 com.google.android.gms.internal.ads.zzbl)
  (r3v12 com.google.android.gms.internal.ads.zzbl)
 binds: [B:31:0x00a1, B:33:0x00a5, B:35:0x00b6, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzY(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzY(boolean, boolean, boolean, boolean):void");
    }

    private final void zzZ() {
        zzlc zzlcVarZzj = this.zzr.zzj();
        boolean z10 = false;
        if (zzlcVarZzj != null && zzlcVarZzj.zzg.zzi && this.zzH) {
            z10 = true;
        }
        this.zzI = z10;
    }

    private static final void zzaA(zzlw zzlwVar) throws zzin {
        zzlwVar.zzi();
        try {
            zzlwVar.zzc().zzu(zzlwVar.zza(), zzlwVar.zzg());
        } finally {
            zzlwVar.zzh(true);
        }
    }

    private final void zzaa(long j4) throws zzin {
        zzlc zzlcVarZzj = this.zzr.zzj();
        long jZze = j4 + (zzlcVarZzj == null ? 1000000000000L : zzlcVarZzj.zze());
        this.zzR = jZze;
        this.zzo.zzf(jZze);
        zzmf[] zzmfVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmfVarArr[i].zzq(zzlcVarZzj, this.zzR);
        }
        for (zzlc zzlcVarZzj2 = r0.zzj(); zzlcVarZzj2 != null; zzlcVarZzj2 = zzlcVarZzj2.zzg()) {
            for (zzyw zzywVar : zzlcVarZzj2.zzi().zzc) {
            }
        }
    }

    private final void zzab(zzbl zzblVar, zzbl zzblVar2) {
        if (zzblVar.zzo() && zzblVar2.zzo()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzkp) arrayList.get(size)).zzb;
            String str = zzex.zza;
            throw null;
        }
    }

    private final void zzac(long j4) {
        this.zzi.zzk(2, j4 + ((this.zzE.zze != 3 || zzax()) ? zza : 1000L));
    }

    private final void zzad(boolean z10) throws zzin {
        zzvh zzvhVar = this.zzr.zzj().zzg.zza;
        long jZzC = zzC(zzvhVar, this.zzE.zzs, true, false);
        if (jZzC != this.zzE.zzs) {
            zzls zzlsVar = this.zzE;
            this.zzE = zzF(zzvhVar, jZzC, zzlsVar.zzc, zzlsVar.zzd, z10, 5);
        }
    }

    private final void zzae(zzkr zzkrVar, boolean z10) throws Throwable {
        long jLongValue;
        long j4;
        long j10;
        zzvh zzvhVarZzq;
        boolean z11;
        zzvh zzvhVar;
        long j11;
        boolean z12;
        long j12;
        long jZza;
        zzvh zzvhVar2;
        long j13;
        long j14;
        boolean z13;
        zzls zzlsVar;
        int i;
        this.zzF.zza(z10 ? 1 : 0);
        if (this.zzC) {
            this.zzD = zzkrVar;
            return;
        }
        zzbl zzblVar = this.zzE.zza;
        int i10 = this.zzM;
        boolean z14 = this.zzN;
        zzbk zzbkVar = this.zzl;
        zzbj zzbjVar = this.zzm;
        Pair pairZzE = zzE(zzblVar, zzkrVar, true, i10, z14, zzbkVar, zzbjVar);
        if (pairZzE == null) {
            Pair pairZzD = zzD(this.zzE.zza);
            zzvhVarZzq = (zzvh) pairZzD.first;
            jLongValue = ((Long) pairZzD.second).longValue();
            z11 = !this.zzE.zza.zzo();
            j4 = -9223372036854775807L;
            j10 = 0;
        } else {
            Object obj = pairZzE.first;
            jLongValue = ((Long) pairZzE.second).longValue();
            long j15 = zzkrVar.zzc;
            j4 = j15 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            j10 = 0;
            zzvhVarZzq = this.zzr.zzq(this.zzE.zza, obj, jLongValue);
            if (zzvhVarZzq.zzb()) {
                this.zzE.zza.zzn(zzvhVarZzq.zza, zzbjVar);
                if (zzbjVar.zze(zzvhVarZzq.zzb) == zzvhVarZzq.zzc) {
                    zzbjVar.zzh();
                }
                z11 = true;
                jLongValue = 0;
            } else {
                z11 = j15 == -9223372036854775807L;
            }
        }
        try {
            if (this.zzE.zza.zzo()) {
                this.zzQ = zzkrVar;
            } else if (pairZzE == null) {
                if (this.zzE.zze != 1) {
                    zzah(4);
                }
                zzY(false, true, false, true);
            } else {
                if (zzvhVarZzq.equals(this.zzE.zzb)) {
                    zzlc zzlcVarZzj = this.zzr.zzj();
                    if (zzlcVarZzj == null || !zzlcVarZzj.zze || jLongValue == j10) {
                        jZza = jLongValue;
                    } else {
                        zzvf zzvfVar = zzlcVarZzj.zza;
                        long j16 = zzbkVar.zzm;
                        if (this.zzB && j16 != -9223372036854775807L) {
                            Double d10 = this.zzA.zzc;
                        }
                        jZza = zzvfVar.zza(jLongValue, this.zzz);
                    }
                    if (zzex.zzv(jZza) == zzex.zzv(this.zzE.zzs) && ((i = (zzlsVar = this.zzE).zze) == 2 || i == 3)) {
                        jLongValue = zzlsVar.zzs;
                    }
                } else {
                    jZza = jLongValue;
                }
                this.zzC = this.zzB;
                long jZzB = zzB(zzvhVarZzq, jZza, this.zzE.zze == 4);
                boolean z15 = z11 | (jLongValue != jZzB);
                try {
                    zzls zzlsVar2 = this.zzE;
                    zzbl zzblVar2 = zzlsVar2.zza;
                    zzvh zzvhVar3 = zzvhVarZzq;
                    long j17 = j4;
                    try {
                        zzas(zzblVar2, zzvhVar3, zzblVar2, zzlsVar2.zzb, j17, true);
                        zzvhVar2 = zzvhVar3;
                        j13 = j17;
                        j14 = jZzB;
                        z13 = z15;
                        this.zzE = zzF(zzvhVar2, j14, j13, j14, z13, 2);
                    } catch (Throwable th) {
                        th = th;
                        zzvhVar = zzvhVar3;
                        j11 = j17;
                        j12 = jZzB;
                        z12 = z15;
                        this.zzE = zzF(zzvhVar, j12, j11, j12, z12, 2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    zzvhVar = zzvhVarZzq;
                    j11 = j4;
                }
            }
            z13 = z11;
            zzvhVar2 = zzvhVarZzq;
            j14 = jLongValue;
            j13 = j4;
            this.zzE = zzF(zzvhVar2, j14, j13, j14, z13, 2);
        } catch (Throwable th3) {
            th = th3;
            zzvhVar = zzvhVarZzq;
            j11 = j4;
            z12 = z11;
            j12 = jLongValue;
        }
    }

    private final void zzaf(zzbb zzbbVar) {
        this.zzi.zzg(16);
        this.zzo.zzg(zzbbVar);
    }

    private final void zzag(boolean z10, int i, boolean z11, int i10) throws zzin {
        this.zzF.zza(z11 ? 1 : 0);
        zzap(z10, i, i10);
    }

    private final void zzah(int i) {
        zzls zzlsVar = this.zzE;
        if (zzlsVar.zze != i) {
            if (i != 2) {
                this.zzW = -9223372036854775807L;
            }
            this.zzE = zzlsVar.zzf(i);
        }
    }

    private final void zzai(float f10) throws zzin {
        this.zzaa = f10;
        float fZza = f10 * this.zzy.zza();
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmfVarArr[i].zzy(fZza);
            i++;
        }
    }

    private final void zzaj() throws zzin {
        zzlc zzlcVarZzj = this.zzr.zzj();
        if (zzlcVarZzj == null) {
            return;
        }
        zzze zzzeVarZzi = zzlcVarZzj.zzi();
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzzeVarZzi.zzb(i)) {
                zzmfVarArr[i].zzz();
            }
            i++;
        }
    }

    private final void zzak(boolean z10, boolean z11) {
        zzY(z10 || !this.zzO, false, true, false);
        this.zzF.zza(z11 ? 1 : 0);
        this.zzg.zze(this.zzu);
        this.zzy.zzb(this.zzE.zzl, 1);
        zzah(1);
    }

    private final void zzal() throws zzin {
        this.zzo.zzi();
        int i = 0;
        while (true) {
            zzmf[] zzmfVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmfVarArr[i].zzB();
            i++;
        }
    }

    private final void zzam() {
        zzlc zzlcVarZzi = this.zzr.zzi();
        boolean z10 = true;
        if (!this.zzL && (zzlcVarZzi == null || !zzlcVarZzi.zza.zzp())) {
            z10 = false;
        }
        zzls zzlsVar = this.zzE;
        if (z10 != zzlsVar.zzg) {
            this.zzE = zzlsVar.zza(z10);
        }
    }

    private final void zzan(zzvh zzvhVar, zzxk zzxkVar, zzze zzzeVar) {
        long jZze;
        long jZze2;
        zzlf zzlfVar = this.zzr;
        zzlc zzlcVarZzi = zzlfVar.zzi();
        zzlcVarZzi.getClass();
        if (zzlcVarZzi == zzlfVar.zzj()) {
            jZze = this.zzR;
            jZze2 = zzlcVarZzi.zze();
        } else {
            jZze = this.zzR - zzlcVarZzi.zze();
            jZze2 = zzlcVarZzi.zzg.zzb;
        }
        this.zzg.zzf(new zzkw(this.zzu, this.zzE.zza, zzvhVar, jZze - jZze2, zzA(zzlcVarZzi.zzc()), this.zzo.zzc().zzb, this.zzE.zzl, this.zzJ, zzay(this.zzE.zza, zzlcVarZzi.zzg.zza) ? this.zzac.zzb() : -9223372036854775807L, this.zzK), zzxkVar, zzzeVar.zzc);
    }

    private final void zzao() throws zzin {
        zzls zzlsVar = this.zzE;
        zzap(zzlsVar.zzl, zzlsVar.zzn, zzlsVar.zzm);
    }

    private final void zzap(boolean z10, int i, int i10) throws zzin {
        zzaq(z10, this.zzy.zzb(z10, this.zzE.zze), i, i10);
    }

    private final void zzaq(boolean z10, int i, int i10, int i11) throws zzin {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i != -1) {
            z11 = true;
        } else {
            i = -1;
            z11 = false;
        }
        if (i == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        if (i == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = 0;
        }
        zzls zzlsVar = this.zzE;
        if (zzlsVar.zzl == z11 && zzlsVar.zzn == i10 && zzlsVar.zzm == i11) {
            return;
        }
        this.zzE = zzlsVar.zzd(z11, i11, i10);
        zzat(false, false);
        zzlf zzlfVar = this.zzr;
        for (zzlc zzlcVarZzj = zzlfVar.zzj(); zzlcVarZzj != null; zzlcVarZzj = zzlcVarZzj.zzg()) {
            for (zzyw zzywVar : zzlcVarZzj.zzi().zzc) {
            }
        }
        if (!zzax()) {
            zzal();
            zzar();
            zzlfVar.zzu(this.zzR);
            return;
        }
        int i12 = this.zzE.zze;
        if (i12 == 3) {
            this.zzo.zzh();
            zzaj();
            this.zzi.zzj(2);
        } else if (i12 == 2) {
            this.zzi.zzj(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzar() throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.zzar():void");
    }

    private final void zzas(zzbl zzblVar, zzvh zzvhVar, zzbl zzblVar2, zzvh zzvhVar2, long j4, boolean z10) throws zzin {
        if (!zzay(zzblVar, zzvhVar)) {
            zzbb zzbbVar = zzvhVar.zzb() ? zzbb.zza : this.zzE.zzo;
            if (this.zzo.zzc().equals(zzbbVar)) {
                return;
            }
            zzaf(zzbbVar);
            zzQ(this.zzE.zzo, zzbbVar.zzb, false, false);
            return;
        }
        Object obj = zzvhVar.zza;
        zzbj zzbjVar = this.zzm;
        int i = zzblVar.zzn(obj, zzbjVar).zzc;
        zzbk zzbkVar = this.zzl;
        zzblVar.zze(i, zzbkVar, 0L);
        zzig zzigVar = this.zzac;
        zzaj zzajVar = zzbkVar.zzj;
        String str = zzex.zza;
        zzigVar.zzd(zzajVar);
        if (j4 != -9223372036854775807L) {
            zzigVar.zze(zzx(zzblVar, obj, j4));
            return;
        }
        if (!Objects.equals(!zzblVar2.zzo() ? zzblVar2.zze(zzblVar2.zzn(zzvhVar2.zza, zzbjVar).zzc, zzbkVar, 0L).zzb : null, zzbkVar.zzb) || z10) {
            zzigVar.zze(-9223372036854775807L);
        }
    }

    private final void zzat(boolean z10, boolean z11) {
        this.zzJ = z10;
        long jElapsedRealtime = -9223372036854775807L;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzK = jElapsedRealtime;
    }

    private final boolean zzau() {
        if (!this.zzx) {
            return false;
        }
        zzmf[] zzmfVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzmfVarArr[i].zzH()) {
                return true;
            }
        }
        return false;
    }

    private final boolean zzav() {
        zzlc zzlcVarZzj = this.zzr.zzj();
        long j4 = zzlcVarZzj.zzg.zze;
        if (zzlcVarZzj.zze) {
            return j4 == -9223372036854775807L || this.zzE.zzs < j4 || !zzax();
        }
        return false;
    }

    private static boolean zzaw(zzls zzlsVar, zzbj zzbjVar) {
        zzvh zzvhVar = zzlsVar.zzb;
        zzbl zzblVar = zzlsVar.zza;
        return zzblVar.zzo() || zzblVar.zzn(zzvhVar.zza, zzbjVar).zzf;
    }

    private final boolean zzax() {
        zzls zzlsVar = this.zzE;
        return zzlsVar.zzl && zzlsVar.zzn == 0;
    }

    private final boolean zzay(zzbl zzblVar, zzvh zzvhVar) {
        if (!zzvhVar.zzb() && !zzblVar.zzo()) {
            int i = zzblVar.zzn(zzvhVar.zza, this.zzm).zzc;
            zzbk zzbkVar = this.zzl;
            zzblVar.zze(i, zzbkVar, 0L);
            if (zzbkVar.zzb() && zzbkVar.zzi && zzbkVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzaz(zzlc zzlcVar) {
        if (zzlcVar != null) {
            try {
                if (zzlcVar.zze) {
                    zzwz[] zzwzVarArr = zzlcVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzwz zzwzVar = zzwzVarArr[i];
                        if (zzwzVar != null) {
                            zzwzVar.zzd();
                        }
                    }
                } else {
                    zzlcVar.zza.zzj();
                }
                if (zzlcVar.zzd() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int zzd(zzbk zzbkVar, zzbj zzbjVar, int i, boolean z10, Object obj, zzbl zzblVar, zzbl zzblVar2) {
        zzbk zzbkVar2 = zzbkVar;
        zzbl zzblVar3 = zzblVar;
        Object obj2 = zzblVar3.zze(zzblVar3.zzn(obj, zzbjVar).zzc, zzbkVar, 0L).zzb;
        for (int i10 = 0; i10 < zzblVar2.zzc(); i10++) {
            if (zzblVar2.zze(i10, zzbkVar, 0L).zzb.equals(obj2)) {
                return i10;
            }
        }
        int iZza = zzblVar3.zza(obj);
        int iZzb = zzblVar3.zzb();
        int iZza2 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= iZzb || iZza2 != -1) {
                break;
            }
            zzbl zzblVar4 = zzblVar3;
            int iZzi = zzblVar4.zzi(iZza, zzbjVar, zzbkVar2, i, z10);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzblVar2.zza(zzblVar4.zzf(iZzi));
            i11++;
            zzblVar3 = zzblVar4;
            iZza = iZzi;
            zzbkVar2 = zzbkVar;
        }
        if (iZza2 == -1) {
            return -1;
        }
        return zzblVar2.zzd(iZza2, zzbjVar, false).zzc;
    }

    public static /* synthetic */ zzlc zzf(zzkt zzktVar, zzld zzldVar, long j4) {
        zzzm zzzmVarZzk = zzktVar.zzg.zzk();
        long j10 = zzktVar.zzX.zzb;
        zzze zzzeVar = zzktVar.zzf;
        zzlr zzlrVar = zzktVar.zzs;
        return new zzlc(zzktVar.zzc, j4, zzktVar.zze, zzzmVarZzk, zzlrVar, zzldVar, zzzeVar, -9223372036854775807L);
    }

    public static /* synthetic */ void zzg(zzkt zzktVar, zzlw zzlwVar) {
        try {
            zzaA(zzlwVar);
        } catch (zzin e4) {
            zzea.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
            throw new RuntimeException(e4);
        }
    }

    private final long zzx(zzbl zzblVar, Object obj, long j4) {
        int i = zzblVar.zzn(obj, this.zzm).zzc;
        zzbk zzbkVar = this.zzl;
        zzblVar.zze(i, zzbkVar, 0L);
        if (zzbkVar.zzf == -9223372036854775807L || !zzbkVar.zzb() || !zzbkVar.zzi) {
            return -9223372036854775807L;
        }
        long j10 = zzbkVar.zzg;
        String str = zzex.zza;
        return zzex.zzs((j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - zzbkVar.zzf) - j4;
    }

    private final long zzy(zzlc zzlcVar) {
        if (zzlcVar == null) {
            return 0L;
        }
        long jZze = zzlcVar.zze();
        if (zzlcVar.zze) {
            int i = 0;
            while (true) {
                zzmf[] zzmfVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzmfVarArr[i].zzJ(zzlcVar)) {
                    long jZzd = zzmfVarArr[i].zzd(zzlcVar);
                    if (jZzd == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZze = Math.max(jZzd, jZze);
                }
                i++;
            }
        }
        return jZze;
    }

    private final long zzz() {
        return zzA(this.zzE.zzq);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:388:0x077f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x08cf: MOVE (r11 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:468:0x08cf */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x08d1: MOVE (r12 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:468:0x08cf */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06a7 A[Catch: IOException -> 0x0029, zzuh -> 0x002c, zzgk -> 0x002f, zzaz -> 0x0032, zzsa -> 0x0035, RuntimeException -> 0x04ae, zzin -> 0x04b1, LOOP:20: B:329:0x06a5->B:330:0x06a7, LOOP_END, TryCatch #13 {zzin -> 0x04b1, blocks: (B:215:0x04a8, B:223:0x04c7, B:225:0x04cd, B:226:0x04d2, B:230:0x04dd, B:232:0x04e1, B:234:0x04f2, B:236:0x04f6, B:238:0x04fa, B:240:0x04fe, B:242:0x0504, B:244:0x050a, B:246:0x0510, B:248:0x0516, B:250:0x051e, B:252:0x0528, B:253:0x052e, B:255:0x0532, B:257:0x0538, B:259:0x0540, B:261:0x0548, B:263:0x0565, B:264:0x056a, B:266:0x0577, B:268:0x0585, B:272:0x059a, B:365:0x0714, B:367:0x071a, B:369:0x0720, B:372:0x0725, B:373:0x0730, B:375:0x0734, B:379:0x0759, B:381:0x075f, B:383:0x0767, B:384:0x076f, B:385:0x0772, B:387:0x077b, B:435:0x0859, B:444:0x0874, B:454:0x08ac, B:390:0x0787, B:392:0x078b, B:394:0x0791, B:396:0x0797, B:398:0x07a1, B:401:0x07a7, B:402:0x07aa, B:404:0x07b3, B:406:0x07c5, B:408:0x07ce, B:410:0x07d6, B:415:0x07e2, B:417:0x0817, B:419:0x081d, B:421:0x0822, B:422:0x082a, B:424:0x0830, B:425:0x0833, B:426:0x083c, B:428:0x0840, B:430:0x0846, B:431:0x084b, B:434:0x0858, B:275:0x05a6, B:285:0x05c3, B:290:0x05d4, B:294:0x05e6, B:299:0x062a, B:301:0x0631, B:303:0x0635, B:307:0x0645, B:309:0x0649, B:313:0x0650, B:315:0x0656, B:317:0x0673, B:320:0x067c, B:322:0x0681, B:324:0x0688, B:325:0x0690, B:327:0x0696, B:305:0x063b, B:330:0x06a7, B:346:0x06db, B:348:0x06e1, B:350:0x06e5, B:352:0x06ea, B:364:0x0711, B:355:0x06f3, B:357:0x06f9, B:361:0x0707, B:363:0x070e, B:233:0x04ef, B:220:0x04b6, B:222:0x04bc), top: B:672:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0734 A[Catch: IOException -> 0x0029, zzuh -> 0x002c, zzgk -> 0x002f, zzaz -> 0x0032, zzsa -> 0x0035, RuntimeException -> 0x04ae, zzin -> 0x04b1, LOOP:11: B:373:0x0730->B:375:0x0734, LOOP_END, TryCatch #13 {zzin -> 0x04b1, blocks: (B:215:0x04a8, B:223:0x04c7, B:225:0x04cd, B:226:0x04d2, B:230:0x04dd, B:232:0x04e1, B:234:0x04f2, B:236:0x04f6, B:238:0x04fa, B:240:0x04fe, B:242:0x0504, B:244:0x050a, B:246:0x0510, B:248:0x0516, B:250:0x051e, B:252:0x0528, B:253:0x052e, B:255:0x0532, B:257:0x0538, B:259:0x0540, B:261:0x0548, B:263:0x0565, B:264:0x056a, B:266:0x0577, B:268:0x0585, B:272:0x059a, B:365:0x0714, B:367:0x071a, B:369:0x0720, B:372:0x0725, B:373:0x0730, B:375:0x0734, B:379:0x0759, B:381:0x075f, B:383:0x0767, B:384:0x076f, B:385:0x0772, B:387:0x077b, B:435:0x0859, B:444:0x0874, B:454:0x08ac, B:390:0x0787, B:392:0x078b, B:394:0x0791, B:396:0x0797, B:398:0x07a1, B:401:0x07a7, B:402:0x07aa, B:404:0x07b3, B:406:0x07c5, B:408:0x07ce, B:410:0x07d6, B:415:0x07e2, B:417:0x0817, B:419:0x081d, B:421:0x0822, B:422:0x082a, B:424:0x0830, B:425:0x0833, B:426:0x083c, B:428:0x0840, B:430:0x0846, B:431:0x084b, B:434:0x0858, B:275:0x05a6, B:285:0x05c3, B:290:0x05d4, B:294:0x05e6, B:299:0x062a, B:301:0x0631, B:303:0x0635, B:307:0x0645, B:309:0x0649, B:313:0x0650, B:315:0x0656, B:317:0x0673, B:320:0x067c, B:322:0x0681, B:324:0x0688, B:325:0x0690, B:327:0x0696, B:305:0x063b, B:330:0x06a7, B:346:0x06db, B:348:0x06e1, B:350:0x06e5, B:352:0x06ea, B:364:0x0711, B:355:0x06f3, B:357:0x06f9, B:361:0x0707, B:363:0x070e, B:233:0x04ef, B:220:0x04b6, B:222:0x04bc), top: B:672:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0822 A[Catch: IOException -> 0x0029, zzuh -> 0x002c, zzgk -> 0x002f, zzaz -> 0x0032, zzsa -> 0x0035, RuntimeException -> 0x04ae, zzin -> 0x04b1, LOOP:14: B:420:0x0820->B:421:0x0822, LOOP_END, TryCatch #13 {zzin -> 0x04b1, blocks: (B:215:0x04a8, B:223:0x04c7, B:225:0x04cd, B:226:0x04d2, B:230:0x04dd, B:232:0x04e1, B:234:0x04f2, B:236:0x04f6, B:238:0x04fa, B:240:0x04fe, B:242:0x0504, B:244:0x050a, B:246:0x0510, B:248:0x0516, B:250:0x051e, B:252:0x0528, B:253:0x052e, B:255:0x0532, B:257:0x0538, B:259:0x0540, B:261:0x0548, B:263:0x0565, B:264:0x056a, B:266:0x0577, B:268:0x0585, B:272:0x059a, B:365:0x0714, B:367:0x071a, B:369:0x0720, B:372:0x0725, B:373:0x0730, B:375:0x0734, B:379:0x0759, B:381:0x075f, B:383:0x0767, B:384:0x076f, B:385:0x0772, B:387:0x077b, B:435:0x0859, B:444:0x0874, B:454:0x08ac, B:390:0x0787, B:392:0x078b, B:394:0x0791, B:396:0x0797, B:398:0x07a1, B:401:0x07a7, B:402:0x07aa, B:404:0x07b3, B:406:0x07c5, B:408:0x07ce, B:410:0x07d6, B:415:0x07e2, B:417:0x0817, B:419:0x081d, B:421:0x0822, B:422:0x082a, B:424:0x0830, B:425:0x0833, B:426:0x083c, B:428:0x0840, B:430:0x0846, B:431:0x084b, B:434:0x0858, B:275:0x05a6, B:285:0x05c3, B:290:0x05d4, B:294:0x05e6, B:299:0x062a, B:301:0x0631, B:303:0x0635, B:307:0x0645, B:309:0x0649, B:313:0x0650, B:315:0x0656, B:317:0x0673, B:320:0x067c, B:322:0x0681, B:324:0x0688, B:325:0x0690, B:327:0x0696, B:305:0x063b, B:330:0x06a7, B:346:0x06db, B:348:0x06e1, B:350:0x06e5, B:352:0x06ea, B:364:0x0711, B:355:0x06f3, B:357:0x06f9, B:361:0x0707, B:363:0x070e, B:233:0x04ef, B:220:0x04b6, B:222:0x04bc), top: B:672:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0830 A[Catch: IOException -> 0x0029, zzuh -> 0x002c, zzgk -> 0x002f, zzaz -> 0x0032, zzsa -> 0x0035, RuntimeException -> 0x04ae, zzin -> 0x04b1, TryCatch #13 {zzin -> 0x04b1, blocks: (B:215:0x04a8, B:223:0x04c7, B:225:0x04cd, B:226:0x04d2, B:230:0x04dd, B:232:0x04e1, B:234:0x04f2, B:236:0x04f6, B:238:0x04fa, B:240:0x04fe, B:242:0x0504, B:244:0x050a, B:246:0x0510, B:248:0x0516, B:250:0x051e, B:252:0x0528, B:253:0x052e, B:255:0x0532, B:257:0x0538, B:259:0x0540, B:261:0x0548, B:263:0x0565, B:264:0x056a, B:266:0x0577, B:268:0x0585, B:272:0x059a, B:365:0x0714, B:367:0x071a, B:369:0x0720, B:372:0x0725, B:373:0x0730, B:375:0x0734, B:379:0x0759, B:381:0x075f, B:383:0x0767, B:384:0x076f, B:385:0x0772, B:387:0x077b, B:435:0x0859, B:444:0x0874, B:454:0x08ac, B:390:0x0787, B:392:0x078b, B:394:0x0791, B:396:0x0797, B:398:0x07a1, B:401:0x07a7, B:402:0x07aa, B:404:0x07b3, B:406:0x07c5, B:408:0x07ce, B:410:0x07d6, B:415:0x07e2, B:417:0x0817, B:419:0x081d, B:421:0x0822, B:422:0x082a, B:424:0x0830, B:425:0x0833, B:426:0x083c, B:428:0x0840, B:430:0x0846, B:431:0x084b, B:434:0x0858, B:275:0x05a6, B:285:0x05c3, B:290:0x05d4, B:294:0x05e6, B:299:0x062a, B:301:0x0631, B:303:0x0635, B:307:0x0645, B:309:0x0649, B:313:0x0650, B:315:0x0656, B:317:0x0673, B:320:0x067c, B:322:0x0681, B:324:0x0688, B:325:0x0690, B:327:0x0696, B:305:0x063b, B:330:0x06a7, B:346:0x06db, B:348:0x06e1, B:350:0x06e5, B:352:0x06ea, B:364:0x0711, B:355:0x06f3, B:357:0x06f9, B:361:0x0707, B:363:0x070e, B:233:0x04ef, B:220:0x04b6, B:222:0x04bc), top: B:672:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0840 A[Catch: IOException -> 0x0029, zzuh -> 0x002c, zzgk -> 0x002f, zzaz -> 0x0032, zzsa -> 0x0035, RuntimeException -> 0x04ae, zzin -> 0x04b1, TryCatch #13 {zzin -> 0x04b1, blocks: (B:215:0x04a8, B:223:0x04c7, B:225:0x04cd, B:226:0x04d2, B:230:0x04dd, B:232:0x04e1, B:234:0x04f2, B:236:0x04f6, B:238:0x04fa, B:240:0x04fe, B:242:0x0504, B:244:0x050a, B:246:0x0510, B:248:0x0516, B:250:0x051e, B:252:0x0528, B:253:0x052e, B:255:0x0532, B:257:0x0538, B:259:0x0540, B:261:0x0548, B:263:0x0565, B:264:0x056a, B:266:0x0577, B:268:0x0585, B:272:0x059a, B:365:0x0714, B:367:0x071a, B:369:0x0720, B:372:0x0725, B:373:0x0730, B:375:0x0734, B:379:0x0759, B:381:0x075f, B:383:0x0767, B:384:0x076f, B:385:0x0772, B:387:0x077b, B:435:0x0859, B:444:0x0874, B:454:0x08ac, B:390:0x0787, B:392:0x078b, B:394:0x0791, B:396:0x0797, B:398:0x07a1, B:401:0x07a7, B:402:0x07aa, B:404:0x07b3, B:406:0x07c5, B:408:0x07ce, B:410:0x07d6, B:415:0x07e2, B:417:0x0817, B:419:0x081d, B:421:0x0822, B:422:0x082a, B:424:0x0830, B:425:0x0833, B:426:0x083c, B:428:0x0840, B:430:0x0846, B:431:0x084b, B:434:0x0858, B:275:0x05a6, B:285:0x05c3, B:290:0x05d4, B:294:0x05e6, B:299:0x062a, B:301:0x0631, B:303:0x0635, B:307:0x0645, B:309:0x0649, B:313:0x0650, B:315:0x0656, B:317:0x0673, B:320:0x067c, B:322:0x0681, B:324:0x0688, B:325:0x0690, B:327:0x0696, B:305:0x063b, B:330:0x06a7, B:346:0x06db, B:348:0x06e1, B:350:0x06e5, B:352:0x06ea, B:364:0x0711, B:355:0x06f3, B:357:0x06f9, B:361:0x0707, B:363:0x070e, B:233:0x04ef, B:220:0x04b6, B:222:0x04bc), top: B:672:0x046f }] */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0754 A[SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r43) {
        /*
            Method dump skipped, instructions count: 3220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkt.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzia
    public final void zza(int i) {
        this.zzi.zzd(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzia
    public final void zzb(float f10) {
        this.zzi.zzj(34);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzc(zzbb zzbbVar) {
        this.zzi.zzc(16, zzbbVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzcT(long j4, long j10, zzz zzzVar, MediaFormat mediaFormat) {
        if (this.zzC) {
            this.zzi.zzb(37).zza();
        }
    }

    public final Looper zze() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzi(zzxb zzxbVar) {
        this.zzi.zzc(9, (zzvf) zzxbVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzj() {
        zzdt zzdtVar = this.zzi;
        zzdtVar.zzg(2);
        zzdtVar.zzj(22);
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzk(zzvf zzvfVar) {
        this.zzi.zzc(8, zzvfVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzl() {
        this.zzi.zzj(10);
    }

    public final void zzm() {
        this.zzi.zzb(29).zza();
    }

    public final void zzn(zzbl zzblVar, int i, long j4) {
        this.zzi.zzc(3, new zzkr(zzblVar, i, j4)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzo(zzlw zzlwVar) {
        if (!this.zzG && this.zzk.getThread().isAlive()) {
            this.zzi.zzc(14, zzlwVar).zza();
        } else {
            zzea.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzlwVar.zzh(false);
        }
    }

    public final void zzp(zze zzeVar, boolean z10) {
        this.zzi.zze(31, 0, 0, zzeVar).zza();
    }

    public final void zzq(boolean z10, int i, int i10) {
        this.zzi.zzd(1, z10 ? 1 : 0, (i10 << 4) | 1).zza();
    }

    public final void zzr(zzmh zzmhVar) {
        this.zzi.zzc(38, zzmhVar).zza();
    }

    public final void zzs(float f10) {
        this.zzi.zzc(32, Float.valueOf(f10)).zza();
    }

    public final void zzt() {
        this.zzi.zzb(6).zza();
    }

    public final boolean zzu() {
        if (this.zzG || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzG = true;
        zzdm zzdmVar = new zzdm(this.zzq);
        this.zzi.zzc(7, zzdmVar).zza();
        return zzdmVar.zzc(this.zzt);
    }

    public final boolean zzv(Object obj, long j4) {
        if (this.zzG || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdm zzdmVar = new zzdm(this.zzq);
        this.zzi.zzc(30, new Pair(obj, zzdmVar)).zza();
        if (j4 != -9223372036854775807L) {
            return zzdmVar.zzc(j4);
        }
        return true;
    }

    public final void zzw(List list, int i, long j4, zzxc zzxcVar) {
        this.zzi.zzc(17, new zzkn(list, zzxcVar, i, j4, null)).zza();
    }
}
