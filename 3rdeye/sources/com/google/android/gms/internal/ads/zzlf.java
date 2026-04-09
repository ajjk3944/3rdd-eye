package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzlf {
    private final zzmo zzc;
    private final zzdt zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzix zzh;
    private zzlc zzi;
    private zzlc zzj;
    private zzlc zzk;
    private zzlc zzl;
    private zzlc zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzkk zzr;
    private final zzbj zza = new zzbj();
    private final zzbk zzb = new zzbk();
    private List zzq = new ArrayList();

    public zzlf(zzmo zzmoVar, zzdt zzdtVar, zzkk zzkkVar, zzix zzixVar) {
        this.zzc = zzmoVar;
        this.zzd = zzdtVar;
        this.zzr = zzkkVar;
        this.zzh = zzixVar;
    }

    private final int zzA(zzbl zzblVar) {
        zzbl zzblVar2;
        zzlc zzlcVarZzg = this.zzi;
        if (zzlcVarZzg == null) {
            return 0;
        }
        int iZza = zzblVar.zza(zzlcVarZzg.zzb);
        while (true) {
            zzblVar2 = zzblVar;
            iZza = zzblVar2.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlcVarZzg.getClass();
                if (zzlcVarZzg.zzg() == null || zzlcVarZzg.zzg.zzh) {
                    break;
                }
                zzlcVarZzg = zzlcVarZzg.zzg();
            }
            zzlc zzlcVarZzg2 = zzlcVarZzg.zzg();
            if (iZza == -1 || zzlcVarZzg2 == null || zzblVar2.zza(zzlcVarZzg2.zzb) != iZza) {
                break;
            }
            zzlcVarZzg = zzlcVarZzg2;
            zzblVar = zzblVar2;
        }
        int iZza2 = zza(zzlcVarZzg);
        zzlcVarZzg.zzg = zzp(zzblVar2, zzlcVarZzg.zzg);
        return iZza2;
    }

    private final long zzB(zzbl zzblVar, Object obj, int i) {
        zzbj zzbjVar = this.zza;
        zzblVar.zzn(obj, zzbjVar);
        zzbjVar.zzg(i);
        long j4 = zzbjVar.zzg.zza(i).zzh;
        return 0L;
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlc zzlcVar = (zzlc) this.zzq.get(i);
            if (zzlcVar.zzb.equals(obj)) {
                return zzlcVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzld zzD(zzbl zzblVar, zzlc zzlcVar, long j4) {
        zzbl zzblVar2;
        long j10;
        zzbl zzblVar3;
        zzbj zzbjVar;
        zzbk zzbkVar;
        Object obj;
        long j11;
        long j12;
        long j13;
        zzld zzldVar = zzlcVar.zzg;
        long jZze = zzlcVar.zze();
        long j14 = zzldVar.zze;
        long j15 = (jZze + j14) - j4;
        if (!zzldVar.zzh) {
            zzvh zzvhVar = zzldVar.zza;
            Object obj2 = zzvhVar.zza;
            zzbj zzbjVar2 = this.zza;
            zzblVar.zzn(obj2, zzbjVar2);
            if (!zzvhVar.zzb()) {
                int i = zzvhVar.zze;
                if (i != -1) {
                    zzbjVar2.zzj(i);
                }
                int iZze = zzbjVar2.zze(i);
                zzbjVar2.zzk(i);
                if (iZze != zzbjVar2.zza(i)) {
                    return zzF(zzblVar, obj2, i, iZze, j14, zzvhVar.zzd, false);
                }
                zzB(zzblVar, obj2, i);
                return zzG(zzblVar, obj2, 0L, j14, zzvhVar.zzd, false);
            }
            int i10 = zzvhVar.zzb;
            if (zzbjVar2.zza(i10) == -1) {
                return null;
            }
            int iZza = zzbjVar2.zzg.zza(i10).zza(zzvhVar.zzc);
            if (iZza < 0) {
                return zzF(zzblVar, obj2, i10, iZza, zzldVar.zzc, zzvhVar.zzd, false);
            }
            long jLongValue = zzldVar.zzc;
            if (jLongValue == -9223372036854775807L) {
                Pair pairZzm = zzblVar.zzm(this.zzb, zzbjVar2, zzbjVar2.zzc, -9223372036854775807L, Math.max(0L, j15));
                zzblVar2 = zzblVar;
                if (pairZzm == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzm.second).longValue();
                j10 = -9223372036854775807L;
            } else {
                zzblVar2 = zzblVar;
                j10 = jLongValue;
            }
            zzB(zzblVar2, obj2, i10);
            return zzG(zzblVar2, obj2, Math.max(0L, jLongValue), j10, zzvhVar.zzd, false);
        }
        zzvh zzvhVar2 = zzldVar.zza;
        Object obj3 = zzvhVar2.zza;
        int iZza2 = zzblVar.zza(obj3);
        int i11 = this.zzf;
        boolean z10 = this.zzg;
        zzbk zzbkVar2 = this.zzb;
        zzbj zzbjVar3 = this.zza;
        long j16 = 0;
        int iZzi = zzblVar.zzi(iZza2, zzbjVar3, zzbkVar2, i11, z10);
        if (iZzi == -1) {
            return null;
        }
        int i12 = zzblVar.zzd(iZzi, zzbjVar3, true).zzc;
        Object obj4 = zzbjVar3.zzb;
        obj4.getClass();
        long j17 = zzvhVar2.zzd;
        if (zzblVar.zze(i12, zzbkVar2, 0L).zzn == iZzi) {
            Pair pairZzm2 = zzblVar.zzm(zzbkVar2, zzbjVar3, i12, -9223372036854775807L, Math.max(0L, j15));
            if (pairZzm2 == null) {
                return null;
            }
            Object obj5 = pairZzm2.first;
            long jLongValue2 = ((Long) pairZzm2.second).longValue();
            zzlc zzlcVarZzg = zzlcVar.zzg();
            if (zzlcVarZzg == null || !zzlcVarZzg.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j13 = jZzC;
            } else {
                j13 = zzlcVarZzg.zzg.zza.zzd;
            }
            zzblVar3 = zzblVar;
            zzbkVar = zzbkVar2;
            zzbjVar = zzbjVar3;
            j11 = jLongValue2;
            obj = obj5;
            j12 = j13;
            j16 = -9223372036854775807L;
        } else {
            zzblVar3 = zzblVar;
            zzbjVar = zzbjVar3;
            zzbkVar = zzbkVar2;
            obj = obj4;
            j11 = 0;
            j12 = j17;
        }
        zzvh zzvhVarZzH = zzH(zzblVar3, obj, j11, j12, zzbkVar, zzbjVar);
        long j18 = j11;
        zzbj zzbjVar4 = zzbjVar;
        if (j16 != -9223372036854775807L && zzldVar.zzc != -9223372036854775807L) {
            zzblVar3.zzn(obj3, zzbjVar4).zzb();
            int i13 = zzbjVar4.zzg.zzd;
        }
        return zzE(zzblVar3, zzvhVarZzH, j16, j18);
    }

    private final zzld zzE(zzbl zzblVar, zzvh zzvhVar, long j4, long j10) {
        Object obj = zzvhVar.zza;
        zzblVar.zzn(obj, this.zza);
        return zzvhVar.zzb() ? zzF(zzblVar, obj, zzvhVar.zzb, zzvhVar.zzc, j4, zzvhVar.zzd, false) : zzG(zzblVar, obj, j10, j4, zzvhVar.zzd, false);
    }

    private final zzld zzF(zzbl zzblVar, Object obj, int i, int i10, long j4, long j10, boolean z10) {
        zzvh zzvhVar = new zzvh(obj, i, i10, j10);
        Object obj2 = zzvhVar.zza;
        int i11 = zzvhVar.zzb;
        int i12 = zzvhVar.zzc;
        zzbj zzbjVar = this.zza;
        long jZzf = zzblVar.zzn(obj2, zzbjVar).zzf(i11, i12);
        if (i10 == zzbjVar.zze(i)) {
            zzbjVar.zzh();
        }
        zzbjVar.zzk(i11);
        long jMax = 0;
        if (jZzf != -9223372036854775807L && jZzf <= 0) {
            jMax = Math.max(0L, (-1) + jZzf);
        }
        return new zzld(zzvhVar, jMax, j4, -9223372036854775807L, jZzf, false, false, false, false, false);
    }

    private final zzld zzG(zzbl zzblVar, Object obj, long j4, long j10, long j11, boolean z10) {
        long j12;
        long j13;
        long j14;
        long jMax = j4;
        zzbj zzbjVar = this.zza;
        zzblVar.zzn(obj, zzbjVar);
        int iZzc = zzbjVar.zzc(jMax);
        if (iZzc == -1) {
            zzbjVar.zzb();
        } else {
            zzbjVar.zzk(iZzc);
        }
        zzvh zzvhVar = new zzvh(obj, j11, iZzc);
        boolean zZzL = zzL(zzvhVar);
        boolean zZzK = zzK(zzblVar, zzvhVar);
        boolean zZzJ = zzJ(zzblVar, zzvhVar, zZzL);
        if (iZzc != -1) {
            zzbjVar.zzk(iZzc);
        }
        if (iZzc != -1) {
            zzbjVar.zzj(iZzc);
        }
        if (iZzc != -1) {
            zzbjVar.zzg(iZzc);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        if (j12 != -9223372036854775807L) {
            j14 = j12;
            j13 = j14;
        } else {
            j13 = zzbjVar.zzd;
            j14 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - 1);
        }
        return new zzld(zzvhVar, jMax, j10, j14, j13, false, false, zZzL, zZzK, zZzJ);
    }

    private static zzvh zzH(zzbl zzblVar, Object obj, long j4, long j10, zzbk zzbkVar, zzbj zzbjVar) {
        zzblVar.zzn(obj, zzbjVar);
        zzblVar.zze(zzbjVar.zzc, zzbkVar, 0L);
        zzblVar.zza(obj);
        zzbjVar.zzb();
        zzblVar.zzn(obj, zzbjVar);
        int iZzd = zzbjVar.zzd(j4);
        return iZzd == -1 ? new zzvh(obj, j10, zzbjVar.zzc(j4)) : new zzvh(obj, iZzd, zzbjVar.zze(iZzd), j10);
    }

    private final void zzI() {
        int i = zzfyf.zzd;
        final zzfyc zzfycVar = new zzfyc();
        for (zzlc zzlcVarZzg = this.zzi; zzlcVarZzg != null; zzlcVarZzg = zzlcVarZzg.zzg()) {
            zzfycVar.zzf(zzlcVarZzg.zzg.zza);
        }
        zzlc zzlcVar = this.zzj;
        final zzvh zzvhVar = zzlcVar == null ? null : zzlcVar.zzg.zza;
        this.zzd.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc.zzU(zzfycVar.zzi(), zzvhVar);
            }
        });
    }

    private final boolean zzJ(zzbl zzblVar, zzvh zzvhVar, boolean z10) {
        int iZza = zzblVar.zza(zzvhVar.zza);
        zzbj zzbjVar = this.zza;
        int i = zzblVar.zzd(iZza, zzbjVar, false).zzc;
        zzbk zzbkVar = this.zzb;
        return !zzblVar.zze(i, zzbkVar, 0L).zzi && zzblVar.zzi(iZza, zzbjVar, zzbkVar, this.zzf, this.zzg) == -1 && z10;
    }

    private final boolean zzK(zzbl zzblVar, zzvh zzvhVar) {
        if (!zzL(zzvhVar)) {
            return false;
        }
        Object obj = zzvhVar.zza;
        return zzblVar.zze(zzblVar.zzn(obj, this.zza).zzc, this.zzb, 0L).zzo == zzblVar.zza(obj);
    }

    private static final boolean zzL(zzvh zzvhVar) {
        return !zzvhVar.zzb() && zzvhVar.zze == -1;
    }

    public final int zza(zzlc zzlcVar) {
        zzdd.zzb(zzlcVar);
        int i = 0;
        if (zzlcVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlcVar;
        while (zzlcVar.zzg() != null) {
            zzlcVar = zzlcVar.zzg();
            zzlcVar.getClass();
            if (zzlcVar == this.zzj) {
                zzlc zzlcVar2 = this.zzi;
                this.zzj = zzlcVar2;
                this.zzk = zzlcVar2;
                i = 3;
            }
            if (zzlcVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzlcVar.zzo();
            this.zzn--;
        }
        zzlc zzlcVar3 = this.zzl;
        zzlcVar3.getClass();
        zzlcVar3.zzp(null);
        zzI();
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        return zza(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzbl r14, long r15, long r17, long r19) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzlc r0 = r13.zzi
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzld r3 = r0.zzg
            if (r1 != 0) goto L10
            com.google.android.gms.internal.ads.zzld r1 = r13.zzp(r14, r3)
            r4 = r15
            goto L2a
        L10:
            r4 = r15
            com.google.android.gms.internal.ads.zzld r6 = r13.zzD(r14, r1, r4)
            if (r6 == 0) goto L99
            long r7 = r3.zzb
            long r9 = r6.zzb
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L99
            com.google.android.gms.internal.ads.zzvh r7 = r3.zza
            com.google.android.gms.internal.ads.zzvh r8 = r6.zza
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L99
            r1 = r6
        L2a:
            long r6 = r3.zzc
            com.google.android.gms.internal.ads.zzld r6 = r1.zza(r6)
            r0.zzg = r6
            long r6 = r3.zze
            long r8 = r1.zze
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L90
            r0.zzr()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r14 != 0) goto L4c
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L51
        L4c:
            long r10 = r0.zze()
            long r8 = r8 + r10
        L51:
            com.google.android.gms.internal.ads.zzlc r14 = r13.zzj
            r10 = -9223372036854775808
            r1 = 1
            if (r0 != r14) goto L66
            com.google.android.gms.internal.ads.zzld r14 = r0.zzg
            boolean r14 = r14.zzg
            int r14 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r14 == 0) goto L64
            int r14 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r14 < 0) goto L66
        L64:
            r14 = r1
            goto L67
        L66:
            r14 = r2
        L67:
            com.google.android.gms.internal.ads.zzlc r5 = r13.zzk
            if (r0 != r5) goto L75
            int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r5 == 0) goto L73
            int r5 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r5 < 0) goto L75
        L73:
            r5 = r1
            goto L76
        L75:
            r5 = r2
        L76:
            int r0 = r13.zza(r0)
            if (r0 == 0) goto L7d
            return r0
        L7d:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L82
            r6 = r3
        L82:
            if (r14 == 0) goto L8a
            int r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r14 != 0) goto L89
            goto L8a
        L89:
            r2 = r1
        L8a:
            if (r5 == 0) goto L8f
            r14 = r2 | 2
            return r14
        L8f:
            return r2
        L90:
            com.google.android.gms.internal.ads.zzlc r1 = r0.zzg()
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L99:
            int r14 = r13.zza(r1)
            return r14
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzb(com.google.android.gms.internal.ads.zzbl, long, long, long):int");
    }

    public final int zzc(zzbl zzblVar, int i) {
        this.zzf = i;
        return zzA(zzblVar);
    }

    public final int zzd(zzbl zzblVar, boolean z10) {
        this.zzg = z10;
        return zzA(zzblVar);
    }

    public final zzlc zze() {
        zzlc zzlcVar = this.zzi;
        if (zzlcVar == null) {
            return null;
        }
        if (zzlcVar == this.zzj) {
            this.zzj = zzlcVar.zzg();
        }
        if (zzlcVar == this.zzk) {
            this.zzk = zzlcVar.zzg();
        }
        zzlcVar.zzo();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzlc zzlcVar2 = this.zzi;
            this.zzo = zzlcVar2.zzb;
            this.zzp = zzlcVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        zzI();
        return this.zzi;
    }

    public final zzlc zzf() {
        zzlc zzlcVar = this.zzk;
        zzdd.zzb(zzlcVar);
        this.zzk = zzlcVar.zzg();
        zzI();
        zzlc zzlcVar2 = this.zzk;
        zzdd.zzb(zzlcVar2);
        return zzlcVar2;
    }

    public final zzlc zzg() {
        zzlc zzlcVar = this.zzk;
        zzlc zzlcVar2 = this.zzj;
        if (zzlcVar == zzlcVar2) {
            zzdd.zzb(zzlcVar2);
            this.zzk = zzlcVar2.zzg();
        }
        zzlc zzlcVar3 = this.zzj;
        zzdd.zzb(zzlcVar3);
        this.zzj = zzlcVar3.zzg();
        zzI();
        zzlc zzlcVar4 = this.zzj;
        zzdd.zzb(zzlcVar4);
        return zzlcVar4;
    }

    public final zzlc zzh(zzld zzldVar) {
        zzlc zzlcVarZzf;
        zzlc zzlcVar = this.zzl;
        long jZze = zzlcVar == null ? 1000000000000L : (zzlcVar.zze() + zzlcVar.zzg.zze) - zzldVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzlcVarZzf = null;
                break;
            }
            zzld zzldVar2 = ((zzlc) this.zzq.get(i)).zzg;
            long j4 = zzldVar2.zze;
            long j10 = zzldVar.zze;
            if ((j4 == -9223372036854775807L || j4 == j10) && zzldVar2.zzb == zzldVar.zzb && zzldVar2.zza.equals(zzldVar.zza)) {
                zzlcVarZzf = (zzlc) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzlcVarZzf == null) {
            zzlcVarZzf = zzkt.zzf(this.zzr.zza, zzldVar, jZze);
        } else {
            zzlcVarZzf.zzg = zzldVar;
            zzlcVarZzf.zzq(jZze);
        }
        zzlc zzlcVar2 = this.zzl;
        if (zzlcVar2 != null) {
            zzlcVar2.zzp(zzlcVarZzf);
        } else {
            this.zzi = zzlcVarZzf;
            this.zzj = zzlcVarZzf;
            this.zzk = zzlcVarZzf;
        }
        this.zzo = null;
        this.zzl = zzlcVarZzf;
        this.zzn++;
        zzI();
        return zzlcVarZzf;
    }

    public final zzlc zzi() {
        return this.zzl;
    }

    public final zzlc zzj() {
        return this.zzi;
    }

    public final zzlc zzk(zzvf zzvfVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzlc zzlcVar = (zzlc) this.zzq.get(i);
            if (zzlcVar.zza == zzvfVar) {
                return zzlcVar;
            }
        }
        return null;
    }

    public final zzlc zzl() {
        return this.zzm;
    }

    public final zzlc zzm() {
        return this.zzk;
    }

    public final zzlc zzn() {
        return this.zzj;
    }

    public final zzld zzo(long j4, zzls zzlsVar) {
        zzlc zzlcVar = this.zzl;
        return zzlcVar == null ? zzE(zzlsVar.zza, zzlsVar.zzb, zzlsVar.zzc, zzlsVar.zzs) : zzD(zzlsVar.zza, zzlcVar, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzld zzp(com.google.android.gms.internal.ads.zzbl r19, com.google.android.gms.internal.ads.zzld r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzvh r3 = r2.zza
            boolean r13 = zzL(r3)
            boolean r14 = r0.zzK(r1, r3)
            boolean r15 = r0.zzJ(r1, r3, r13)
            java.lang.Object r4 = r3.zza
            com.google.android.gms.internal.ads.zzbj r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.zze
            if (r1 != r4) goto L2f
        L2d:
            r10 = r8
            goto L33
        L2f:
            r5.zzg(r1)
            r10 = r6
        L33:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L47
            int r1 = r3.zzb
            int r6 = r3.zzc
            long r6 = r5.zzf(r1, r6)
        L41:
            r16 = r10
            r9 = r6
            r7 = r16
            goto L51
        L47:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L4e
            r9 = r6
            r7 = r9
            goto L51
        L4e:
            long r6 = r5.zzd
            goto L41
        L51:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L5d
            int r1 = r3.zzb
            r5.zzk(r1)
            goto L64
        L5d:
            int r1 = r3.zze
            if (r1 == r4) goto L64
            r5.zzk(r1)
        L64:
            com.google.android.gms.internal.ads.zzld r1 = new com.google.android.gms.internal.ads.zzld
            r5 = r3
            long r3 = r2.zzb
            long r11 = r2.zzc
            r2 = r5
            r5 = r11
            r11 = 0
            r12 = 0
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzp(com.google.android.gms.internal.ads.zzbl, com.google.android.gms.internal.ads.zzld):com.google.android.gms.internal.ads.zzld");
    }

    public final zzvh zzq(zzbl zzblVar, Object obj, long j4) {
        long jZzC;
        int iZza;
        zzbj zzbjVar = this.zza;
        int i = zzblVar.zzn(obj, zzbjVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZza = zzblVar.zza(obj2)) == -1 || zzblVar.zzd(iZza, zzbjVar, false).zzc != i) {
            zzlc zzlcVarZzg = this.zzi;
            while (true) {
                if (zzlcVarZzg == null) {
                    zzlc zzlcVarZzg2 = this.zzi;
                    while (true) {
                        if (zzlcVarZzg2 != null) {
                            int iZza2 = zzblVar.zza(zzlcVarZzg2.zzb);
                            if (iZza2 != -1 && zzblVar.zzd(iZza2, zzbjVar, false).zzc == i) {
                                jZzC = zzlcVarZzg2.zzg.zza.zzd;
                                break;
                            }
                            zzlcVarZzg2 = zzlcVarZzg2.zzg();
                        } else {
                            jZzC = zzC(obj);
                            if (jZzC == -1) {
                                jZzC = this.zze;
                                this.zze = 1 + jZzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = jZzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzlcVarZzg.zzb.equals(obj)) {
                        jZzC = zzlcVarZzg.zzg.zza.zzd;
                        break;
                    }
                    zzlcVarZzg = zzlcVarZzg.zzg();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j10 = jZzC;
        zzblVar.zzn(obj, zzbjVar);
        int i10 = zzbjVar.zzc;
        zzbk zzbkVar = this.zzb;
        zzblVar.zze(i10, zzbkVar, 0L);
        Object obj3 = obj;
        for (int iZza3 = zzblVar.zza(obj); iZza3 >= zzbkVar.zzn; iZza3--) {
            zzblVar.zzd(iZza3, zzbjVar, true);
            zzbjVar.zzb();
            if (zzbjVar.zzd(zzbjVar.zzd) != -1) {
                Object obj4 = zzbjVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzH(zzblVar, obj3, j4, j10, zzbkVar, zzbjVar);
    }

    public final void zzs() {
        if (this.zzn == 0) {
            return;
        }
        zzlc zzlcVarZzg = this.zzi;
        zzdd.zzb(zzlcVarZzg);
        this.zzo = zzlcVarZzg.zzb;
        this.zzp = zzlcVarZzg.zzg.zza.zzd;
        while (zzlcVarZzg != null) {
            zzlcVarZzg.zzo();
            zzlcVarZzg = zzlcVarZzg.zzg();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzI();
    }

    public final void zzt() {
        zzlc zzlcVar = this.zzm;
        if (zzlcVar == null || zzlcVar.zzt()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzlc zzlcVar2 = (zzlc) this.zzq.get(i);
                if (!zzlcVar2.zzt()) {
                    this.zzm = zzlcVar2;
                    return;
                }
            }
        }
    }

    public final void zzu(long j4) {
        zzlc zzlcVar = this.zzl;
        if (zzlcVar != null) {
            zzlcVar.zzn(j4);
        }
    }

    public final void zzv() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzlc) this.zzq.get(i)).zzo();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final void zzw(zzbl zzblVar, zzix zzixVar) {
        this.zzh = zzixVar;
        long j4 = zzixVar.zzb;
        zzv();
    }

    public final boolean zzx(zzvf zzvfVar) {
        zzlc zzlcVar = this.zzl;
        return zzlcVar != null && zzlcVar.zza == zzvfVar;
    }

    public final boolean zzy(zzvf zzvfVar) {
        zzlc zzlcVar = this.zzm;
        return zzlcVar != null && zzlcVar.zza == zzvfVar;
    }

    public final boolean zzz() {
        zzlc zzlcVar = this.zzl;
        if (zzlcVar != null) {
            return !zzlcVar.zzg.zzj && zzlcVar.zzs() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }
}
