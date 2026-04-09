package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzwl implements zzvf, zzadw, zzzs, zzzw, zzww {
    private static final Map zzb;
    private static final zzz zzc;
    private zzaes zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzzm zzP;
    private final Uri zzd;
    private final zzgj zze;
    private final zzsh zzf;
    private final zzvr zzg;
    private final zzsc zzh;
    private final zzwh zzi;
    private final long zzj;
    private final long zzk;
    private final zzwa zzm;
    private zzve zzr;
    private zzagt zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzwk zzz;
    private final zzaaa zzl = new zzaaa("ProgressiveMediaPeriod");
    private final zzdm zzn = new zzdm(zzdj.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwc
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzV();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwd
        @Override // java.lang.Runnable
        public final void run() {
            zzwl.zzA(this.zza);
        }
    };
    private final Handler zzq = zzex.zzy(null);
    private zzwj[] zzu = new zzwj[0];
    private zzwy[] zzt = new zzwy[0];
    private long zzK = -9223372036854775807L;
    private int zzD = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzx zzxVar = new zzx();
        zzxVar.zzS("icy");
        zzxVar.zzah("application/x-icy");
        zzc = zzxVar.zzan();
    }

    public zzwl(Uri uri, zzgj zzgjVar, zzwa zzwaVar, zzsh zzshVar, zzsc zzscVar, zzzq zzzqVar, zzvr zzvrVar, zzwh zzwhVar, zzzm zzzmVar, String str, int i, int i10, zzz zzzVar, long j4, zzaai zzaaiVar) {
        this.zzd = uri;
        this.zze = zzgjVar;
        this.zzf = zzshVar;
        this.zzh = zzscVar;
        this.zzg = zzvrVar;
        this.zzi = zzwhVar;
        this.zzP = zzzmVar;
        this.zzj = i;
        this.zzm = zzwaVar;
        this.zzk = j4;
    }

    public static /* synthetic */ void zzA(zzwl zzwlVar) {
        if (zzwlVar.zzO) {
            return;
        }
        zzve zzveVar = zzwlVar.zzr;
        zzveVar.getClass();
        zzveVar.zzi(zzwlVar);
    }

    public static /* synthetic */ void zzC(zzwl zzwlVar, zzaes zzaesVar) {
        zzwlVar.zzA = zzwlVar.zzs == null ? zzaesVar : new zzaer(-9223372036854775807L, 0L);
        zzwlVar.zzB = zzaesVar.zza();
        boolean z10 = false;
        if (!zzwlVar.zzI && zzaesVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        zzwlVar.zzC = z10;
        zzwlVar.zzD = true == z10 ? 7 : 1;
        if (zzwlVar.zzw) {
            zzwlVar.zzi.zza(zzwlVar.zzB, zzaesVar, z10);
        } else {
            zzwlVar.zzV();
        }
    }

    public static /* bridge */ /* synthetic */ void zzF(final zzwl zzwlVar) {
        zzwlVar.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI = true;
            }
        });
    }

    private final int zzR() {
        int iZzd = 0;
        for (zzwy zzwyVar : this.zzt) {
            iZzd += zzwyVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzS(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.zzwy[] r3 = r5.zzt
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.zzwk r4 = r5.zzz
            r4.getClass()
            boolean[] r4 = r4.zzc
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.zzh()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwl.zzS(boolean):long");
    }

    private final zzaez zzT(zzwj zzwjVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzwjVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            zzea.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + zzwjVar.zza + ") after finishing tracks.");
            return new zzadp();
        }
        zzwy zzwyVar = new zzwy(this.zzP, this.zzf, this.zzh);
        zzwyVar.zzv(this);
        int i10 = length + 1;
        zzwj[] zzwjVarArr = (zzwj[]) Arrays.copyOf(this.zzu, i10);
        zzwjVarArr[length] = zzwjVar;
        String str = zzex.zza;
        this.zzu = zzwjVarArr;
        zzwy[] zzwyVarArr = (zzwy[]) Arrays.copyOf(this.zzt, i10);
        zzwyVarArr[length] = zzwyVar;
        this.zzt = zzwyVarArr;
        return zzwyVar;
    }

    private final void zzU() {
        zzdd.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzV() {
        int i;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzwy zzwyVar : this.zzt) {
            if (zzwyVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzd();
        int length = this.zzt.length;
        zzbm[] zzbmVarArr = new zzbm[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zzz zzzVarZzi = this.zzt[i10].zzi();
            zzzVarZzi.getClass();
            String str = zzzVarZzi.zzo;
            boolean zZzh = zzay.zzh(str);
            boolean z10 = zZzh || zzay.zzj(str);
            zArr[i10] = z10;
            this.zzx = z10 | this.zzx;
            this.zzy = this.zzk != -9223372036854775807L && length == 1 && zzay.zzi(str);
            zzagt zzagtVar = this.zzs;
            if (zzagtVar != null) {
                if (zZzh || this.zzu[i10].zzb) {
                    zzav zzavVar = zzzVarZzi.zzl;
                    zzav zzavVar2 = zzavVar == null ? new zzav(-9223372036854775807L, zzagtVar) : zzavVar.zzc(zzagtVar);
                    zzx zzxVarZzb = zzzVarZzi.zzb();
                    zzxVarZzb.zzaa(zzavVar2);
                    zzzVarZzi = zzxVarZzb.zzan();
                }
                if (zZzh && zzzVarZzi.zzh == -1 && zzzVarZzi.zzi == -1 && (i = zzagtVar.zza) != -1) {
                    zzx zzxVarZzb2 = zzzVarZzi.zzb();
                    zzxVarZzb2.zzC(i);
                    zzzVarZzi = zzxVarZzb2.zzan();
                }
            }
            zzz zzzVarZzc = zzzVarZzi.zzc(this.zzf.zza(zzzVarZzi));
            zzbmVarArr[i10] = new zzbm(Integer.toString(i10), zzzVarZzc);
            this.zzG = zzzVarZzc.zzu | this.zzG;
        }
        this.zzz = new zzwk(new zzxk(zzbmVarArr), zArr);
        if (this.zzy && this.zzB == -9223372036854775807L) {
            this.zzB = this.zzk;
            this.zzA = new zzwf(this, this.zzA);
        }
        this.zzi.zza(this.zzB, this.zzA, this.zzC);
        this.zzw = true;
        zzve zzveVar = this.zzr;
        zzveVar.getClass();
        zzveVar.zzk(this);
    }

    private final void zzW(int i) {
        zzU();
        zzwk zzwkVar = this.zzz;
        boolean[] zArr = zzwkVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzz zzzVarZzb = zzwkVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(new zzvd(1, zzay.zzb(zzzVarZzb.zzo), zzzVarZzb, 0, null, zzex.zzv(this.zzJ), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzX(int i) {
        zzU();
        if (this.zzL) {
            if ((!this.zzx || this.zzz.zzb[i]) && !this.zzt[i].zzy(false)) {
                this.zzK = 0L;
                this.zzL = false;
                this.zzF = true;
                this.zzJ = 0L;
                this.zzM = 0;
                for (zzwy zzwyVar : this.zzt) {
                    zzwyVar.zzq(false);
                }
                zzve zzveVar = this.zzr;
                zzveVar.getClass();
                zzveVar.zzi(this);
            }
        }
    }

    private final void zzY() {
        zzwg zzwgVar = new zzwg(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzdd.zzf(zzZ());
            long j4 = this.zzB;
            if (j4 != -9223372036854775807L && this.zzK > j4) {
                this.zzN = true;
                this.zzK = -9223372036854775807L;
                return;
            }
            zzaes zzaesVar = this.zzA;
            zzaesVar.getClass();
            zzwg.zzf(zzwgVar, zzaesVar.zzg(this.zzK).zza.zzc, this.zzK);
            for (zzwy zzwyVar : this.zzt) {
                zzwyVar.zzu(this.zzK);
            }
            this.zzK = -9223372036854775807L;
        }
        this.zzM = zzR();
        this.zzl.zza(zzwgVar, this, zzzq.zza(this.zzD));
    }

    private final boolean zzZ() {
        return this.zzK != -9223372036854775807L;
    }

    private final boolean zzaa() {
        return this.zzF || zzZ();
    }

    public static /* bridge */ /* synthetic */ long zzr(zzwl zzwlVar, boolean z10) {
        return zzwlVar.zzS(true);
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzG() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    public final void zzH() throws IOException {
        this.zzl.zzi(zzzq.zza(this.zzD));
    }

    public final void zzI(int i) throws IOException {
        this.zzt[i].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ void zzJ(zzzv zzzvVar, long j4, long j10, boolean z10) {
        zzwg zzwgVar = (zzwg) zzzvVar;
        zzhi zzhiVar = zzwgVar.zzd;
        zzuy zzuyVar = new zzuy(zzwgVar.zzb, zzwgVar.zzl, zzhiVar.zzh(), zzhiVar.zzi(), j4, j10, zzhiVar.zzg());
        long unused = zzwgVar.zzb;
        this.zzg.zze(zzuyVar, new zzvd(1, -1, null, 0, null, zzex.zzv(zzwgVar.zzk), zzex.zzv(this.zzB)));
        if (z10) {
            return;
        }
        for (zzwy zzwyVar : this.zzt) {
            zzwyVar.zzq(false);
        }
        if (this.zzH > 0) {
            zzve zzveVar = this.zzr;
            zzveVar.getClass();
            zzveVar.zzi(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ void zzK(zzzv zzzvVar, long j4, long j10) {
        zzwg zzwgVar = (zzwg) zzzvVar;
        if (this.zzB == -9223372036854775807L && this.zzA != null) {
            long jZzS = zzS(true);
            long j11 = jZzS == Long.MIN_VALUE ? 0L : jZzS + 10000;
            this.zzB = j11;
            this.zzi.zza(j11, this.zzA, this.zzC);
        }
        zzhi zzhiVar = zzwgVar.zzd;
        zzuy zzuyVar = new zzuy(zzwgVar.zzb, zzwgVar.zzl, zzhiVar.zzh(), zzhiVar.zzi(), j4, j10, zzhiVar.zzg());
        long unused = zzwgVar.zzb;
        this.zzg.zzf(zzuyVar, new zzvd(1, -1, null, 0, null, zzex.zzv(zzwgVar.zzk), zzex.zzv(this.zzB)));
        this.zzN = true;
        zzve zzveVar = this.zzr;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ void zzL(zzzv zzzvVar, long j4, long j10, int i) {
        zzwg zzwgVar = (zzwg) zzzvVar;
        zzhi zzhiVar = zzwgVar.zzd;
        this.zzg.zzh(i == 0 ? new zzuy(zzwgVar.zzb, zzwgVar.zzl, j4) : new zzuy(zzwgVar.zzb, zzwgVar.zzl, zzhiVar.zzh(), zzhiVar.zzi(), j4, j10, zzhiVar.zzg()), new zzvd(1, -1, null, 0, null, zzex.zzv(zzwgVar.zzk), zzex.zzv(this.zzB)), i);
    }

    @Override // com.google.android.gms.internal.ads.zzzw
    public final void zzM() {
        for (zzwy zzwyVar : this.zzt) {
            zzwyVar.zzp();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzww
    public final void zzN(zzz zzzVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzO() {
        if (this.zzw) {
            for (zzwy zzwyVar : this.zzt) {
                zzwyVar.zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzP(final zzaes zzaesVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwe
            @Override // java.lang.Runnable
            public final void run() {
                zzwl.zzC(this.zza, zzaesVar);
            }
        });
    }

    public final boolean zzQ(int i) {
        return !zzaa() && this.zzt[i].zzy(this.zzN);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzvf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zza(long r23, com.google.android.gms.internal.ads.zzmi r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r0.zzU()
            com.google.android.gms.internal.ads.zzaes r4 = r0.zzA
            boolean r4 = r4.zzh()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.gms.internal.ads.zzaes r4 = r0.zzA
            com.google.android.gms.internal.ads.zzaeq r4 = r4.zzg(r1)
            com.google.android.gms.internal.ads.zzaet r7 = r4.zza
            com.google.android.gms.internal.ads.zzaet r4 = r4.zzb
            long r8 = r3.zzc
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.zzd
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.zzb
            java.lang.String r7 = com.google.android.gms.internal.ads.zzex.zza
            long r12 = r1 - r8
            long r8 = r8 ^ r1
            long r14 = r1 ^ r12
            r16 = r5
            long r5 = r3.zzd
            long r18 = r1 + r5
            long r20 = r1 ^ r18
            long r5 = r5 ^ r18
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 >= 0) goto L46
            r12 = -9223372036854775808
        L46:
            long r5 = r20 & r5
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L51
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L51:
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 > 0) goto L5d
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 > 0) goto L5d
            r3 = r5
            goto L5e
        L5d:
            r3 = r6
        L5e:
            long r7 = r4.zzb
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L69
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 > 0) goto L69
            goto L6a
        L69:
            r5 = r6
        L6a:
            if (r3 == 0) goto L7f
            if (r5 == 0) goto L7f
            long r3 = r10 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L84
            goto L81
        L7f:
            if (r3 == 0) goto L82
        L81:
            return r10
        L82:
            if (r5 == 0) goto L85
        L84:
            return r7
        L85:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwl.zza(long, com.google.android.gms.internal.ads.zzmi):long");
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        long jZzS;
        zzU();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzS = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzwk zzwkVar = this.zzz;
                if (zzwkVar.zzb[i] && zzwkVar.zzc[i] && !this.zzt[i].zzx()) {
                    jZzS = Math.min(jZzS, this.zzt[i].zzh());
                }
            }
        } else {
            jZzS = Long.MAX_VALUE;
        }
        if (jZzS == Long.MAX_VALUE) {
            jZzS = zzS(false);
        }
        return jZzS == Long.MIN_VALUE ? this.zzJ : jZzS;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        if (this.zzG) {
            this.zzG = false;
        } else {
            if (!this.zzF) {
                return -9223372036854775807L;
            }
            if (!this.zzN && zzR() <= this.zzM) {
                return -9223372036854775807L;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    @Override // com.google.android.gms.internal.ads.zzvf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zze(long r9) {
        /*
            r8 = this;
            r8.zzU()
            com.google.android.gms.internal.ads.zzwk r0 = r8.zzz
            boolean[] r0 = r0.zzb
            com.google.android.gms.internal.ads.zzaes r1 = r8.zzA
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.zzF = r1
            long r2 = r8.zzJ
            r8.zzJ = r9
            boolean r4 = r8.zzZ()
            if (r4 == 0) goto L22
            r8.zzK = r9
            return r9
        L22:
            int r4 = r8.zzD
            r5 = 7
            if (r4 == r5) goto L67
            boolean r4 = r8.zzN
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.zzaaa r4 = r8.zzl
            boolean r4 = r4.zzl()
            if (r4 == 0) goto L67
        L33:
            com.google.android.gms.internal.ads.zzwy[] r4 = r8.zzt
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto L99
            com.google.android.gms.internal.ads.zzwy[] r6 = r8.zzt
            r6 = r6[r5]
            int r7 = r6.zzb()
            if (r7 != 0) goto L48
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 != 0) goto L48
            goto L64
        L48:
            boolean r7 = r8.zzy
            if (r7 == 0) goto L55
            int r7 = r6.zza()
            boolean r6 = r6.zzz(r7)
            goto L59
        L55:
            boolean r6 = r6.zzA(r9, r1)
        L59:
            if (r6 != 0) goto L64
            boolean r6 = r0[r5]
            if (r6 != 0) goto L67
            boolean r6 = r8.zzx
            if (r6 != 0) goto L64
            goto L67
        L64:
            int r5 = r5 + 1
            goto L37
        L67:
            r8.zzL = r1
            r8.zzK = r9
            r8.zzN = r1
            r8.zzG = r1
            com.google.android.gms.internal.ads.zzaaa r0 = r8.zzl
            boolean r2 = r0.zzl()
            if (r2 == 0) goto L88
            com.google.android.gms.internal.ads.zzwy[] r2 = r8.zzt
            int r3 = r2.length
        L7a:
            if (r1 >= r3) goto L84
            r4 = r2[r1]
            r4.zzk()
            int r1 = r1 + 1
            goto L7a
        L84:
            r0.zzg()
            return r9
        L88:
            r0.zzh()
            com.google.android.gms.internal.ads.zzwy[] r0 = r8.zzt
            int r2 = r0.length
            r3 = r1
        L8f:
            if (r3 >= r2) goto L99
            r4 = r0[r3]
            r4.zzq(r1)
            int r3 = r3 + 1
            goto L8f
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwl.zze(long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j4) {
        zzyw zzywVar;
        zzU();
        zzwk zzwkVar = this.zzz;
        zzxk zzxkVar = zzwkVar.zza;
        boolean[] zArr3 = zzwkVar.zzc;
        int i = this.zzH;
        int i10 = 0;
        for (int i11 = 0; i11 < zzywVarArr.length; i11++) {
            zzwz zzwzVar = zzwzVarArr[i11];
            if (zzwzVar != null && (zzywVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((zzwi) zzwzVar).zzb;
                zzdd.zzf(zArr3[i12]);
                this.zzH--;
                zArr3[i12] = false;
                zzwzVarArr[i11] = null;
            }
        }
        boolean z10 = !this.zzE ? j4 == 0 || this.zzy : i != 0;
        for (int i13 = 0; i13 < zzywVarArr.length; i13++) {
            if (zzwzVarArr[i13] == null && (zzywVar = zzywVarArr[i13]) != null) {
                zzdd.zzf(zzywVar.zzh() == 1);
                zzdd.zzf(zzywVar.zze(0) == 0);
                int iZza = zzxkVar.zza(zzywVar.zzc());
                zzdd.zzf(!zArr3[iZza]);
                this.zzH++;
                zArr3[iZza] = true;
                this.zzG = zzywVar.zzb().zzu | this.zzG;
                zzwzVarArr[i13] = new zzwi(this, iZza);
                zArr2[i13] = true;
                if (!z10) {
                    zzwy zzwyVar = this.zzt[iZza];
                    z10 = (zzwyVar.zzb() == 0 || zzwyVar.zzA(j4, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            zzaaa zzaaaVar = this.zzl;
            if (zzaaaVar.zzl()) {
                zzwy[] zzwyVarArr = this.zzt;
                int length = zzwyVarArr.length;
                while (i10 < length) {
                    zzwyVarArr[i10].zzk();
                    i10++;
                }
                zzaaaVar.zzg();
            } else {
                this.zzN = false;
                for (zzwy zzwyVar2 : this.zzt) {
                    zzwyVar2.zzq(false);
                }
            }
        } else if (z10) {
            j4 = zze(j4);
            while (i10 < zzwzVarArr.length) {
                if (zzwzVarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.zzE = true;
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        zzU();
        return this.zzz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j4, boolean z10) {
        if (this.zzy) {
            return;
        }
        zzU();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j4, false, zArr[i]);
        }
    }

    public final int zzi(int i, zzkv zzkvVar, zzhs zzhsVar, int i10) {
        if (zzaa()) {
            return -3;
        }
        zzW(i);
        int iZze = this.zzt[i].zze(zzkvVar, zzhsVar, i10, this.zzN);
        if (iZze == -3) {
            zzX(i);
        }
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj() throws IOException {
        zzH();
        if (this.zzN && !this.zzw) {
            throw zzaz.zza("Loading finished before preparation is complete.", null);
        }
    }

    public final int zzk(int i, long j4) {
        if (zzaa()) {
            return 0;
        }
        zzW(i);
        zzwy zzwyVar = this.zzt[i];
        int iZzc = zzwyVar.zzc(j4, this.zzN);
        zzwyVar.zzw(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        zzX(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j4) {
        this.zzr = zzveVar;
        this.zzn.zzf();
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        if (this.zzN) {
            return false;
        }
        zzaaa zzaaaVar = this.zzl;
        if (zzaaaVar.zzk() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zZzf = this.zzn.zzf();
        if (zzaaaVar.zzl()) {
            return zZzf;
        }
        zzY();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ zzzt zzu(zzzv zzzvVar, long j4, long j10, IOException iOException, int i) {
        long jMin;
        zzzt zzztVarZzb;
        zzaes zzaesVar;
        zzwg zzwgVar = (zzwg) zzzvVar;
        zzhi zzhiVar = zzwgVar.zzd;
        zzuy zzuyVar = new zzuy(zzwgVar.zzb, zzwgVar.zzl, zzhiVar.zzh(), zzhiVar.zzi(), j4, j10, zzhiVar.zzg());
        long unused = zzwgVar.zzk;
        String str = zzex.zza;
        if ((iOException instanceof zzaz) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgz) || (iOException instanceof zzzy)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzgk) && ((zzgk) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzztVarZzb = zzaaa.zzb;
        } else {
            int iZzR = zzR();
            boolean z10 = iZzR > this.zzM;
            if (this.zzI || !((zzaesVar = this.zzA) == null || zzaesVar.zza() == -9223372036854775807L)) {
                this.zzM = iZzR;
            } else {
                boolean z11 = this.zzw;
                if (!z11 || zzaa()) {
                    this.zzF = z11;
                    this.zzJ = 0L;
                    this.zzM = 0;
                    for (zzwy zzwyVar : this.zzt) {
                        zzwyVar.zzq(false);
                    }
                    zzwg.zzf(zzwgVar, 0L, 0L);
                } else {
                    this.zzL = true;
                    zzztVarZzb = zzaaa.zza;
                }
            }
            zzztVarZzb = zzaaa.zzb(z10, jMin);
        }
        boolean zZzc = zzztVarZzb.zzc();
        this.zzg.zzg(zzuyVar, new zzvd(1, -1, null, 0, null, zzex.zzv(zzwgVar.zzk), zzex.zzv(this.zzB)), iOException, true ^ zZzc);
        if (!zZzc) {
            long unused2 = zzwgVar.zzb;
        }
        return zzztVarZzb;
    }

    public final zzaez zzv() {
        return zzT(new zzwj(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final zzaez zzw(int i, int i10) {
        return zzT(new zzwj(i, false));
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j4) {
    }
}
