package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzwy implements zzaez {
    private boolean zzA;
    private zzsi zzB;
    private final zzws zza;
    private final zzsh zzd;
    private final zzsc zze;
    private zzww zzf;
    private zzz zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzz zzy;
    private final zzwu zzb = new zzwu();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzaey[] zzn = new zzaey[1000];
    private final zzxf zzc = new zzxf(new zzdn() { // from class: com.google.android.gms.internal.ads.zzwt
        @Override // com.google.android.gms.internal.ads.zzdn
        public final void zza(Object obj) {
            zzsg zzsgVar = ((zzwv) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    public zzwy(zzzm zzzmVar, zzsh zzshVar, zzsc zzscVar) {
        this.zzd = zzshVar;
        this.zze = zzscVar;
        this.zza = new zzws(zzzmVar);
    }

    private final int zzB(int i, int i10, long j4, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = this.zzm[i];
            if (j10 > j4) {
                break;
            }
            if (!z10 || (this.zzl[i] & 1) != 0) {
                if (j10 == j4) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i11;
    }

    private final int zzC(int i) {
        int i10 = this.zzq + i;
        int i11 = this.zzh;
        return i10 < i11 ? i10 : i10 - i11;
    }

    private final synchronized int zzD(zzkv zzkvVar, zzhs zzhsVar, boolean z10, boolean z11, zzwu zzwuVar) {
        try {
            zzhsVar.zzd = false;
            if (!zzL()) {
                if (!z11 && !this.zzv) {
                    zzz zzzVar = this.zzy;
                    if (zzzVar == null || (!z10 && zzzVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzzVar, zzkvVar);
                    return -5;
                }
                zzhsVar.zzc(4);
                zzhsVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzz zzzVar2 = ((zzwv) this.zzc.zza(this.zzp + this.zzr)).zza;
            if (!z10 && zzzVar2 == this.zzg) {
                int iZzC = zzC(this.zzr);
                if (!zzM(iZzC)) {
                    zzhsVar.zzd = true;
                    return -3;
                }
                zzhsVar.zzc(this.zzl[iZzC]);
                if (this.zzr == this.zzo - 1 && (z11 || this.zzv)) {
                    zzhsVar.zza(536870912);
                }
                zzhsVar.zze = this.zzm[iZzC];
                zzwuVar.zza = this.zzk[iZzC];
                zzwuVar.zzb = this.zzj[iZzC];
                zzwuVar.zzc = this.zzn[iZzC];
                return -4;
            }
            zzI(zzzVar2, zzkvVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized long zzE(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzo     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.zzm     // Catch: java.lang.Throwable -> L32
            int r2 = r7.zzq     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.zzr     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzB(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.zzG(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.zzE(long, boolean, boolean):long");
    }

    private final synchronized long zzF() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzG(i);
    }

    private final long zzG(int i) {
        long j4 = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzC = zzC(i - 1);
            for (int i10 = 0; i10 < i; i10++) {
                jMax = Math.max(jMax, this.zzm[iZzC]);
                if ((this.zzl[iZzC] & 1) != 0) {
                    break;
                }
                iZzC--;
                if (iZzC == -1) {
                    iZzC = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j4, jMax);
        this.zzo -= i;
        int i11 = this.zzp + i;
        this.zzp = i11;
        int i12 = this.zzq + i;
        this.zzq = i12;
        int i13 = this.zzh;
        if (i12 >= i13) {
            this.zzq = i12 - i13;
        }
        int i14 = this.zzr - i;
        this.zzr = i14;
        if (i14 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i11);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i15 = this.zzq;
        if (i15 == 0) {
            i15 = this.zzh;
        }
        return this.zzj[i15 - 1] + this.zzk[r12];
    }

    private final synchronized void zzH(long j4, int i, long j10, int i10, zzaey zzaeyVar) {
        try {
            int i11 = this.zzo;
            if (i11 > 0) {
                int iZzC = zzC(i11 - 1);
                zzdd.zzd(this.zzj[iZzC] + ((long) this.zzk[iZzC]) <= j10);
            }
            this.zzv = (536870912 & i) != 0;
            this.zzu = Math.max(this.zzu, j4);
            int iZzC2 = zzC(this.zzo);
            this.zzm[iZzC2] = j4;
            this.zzj[iZzC2] = j10;
            this.zzk[iZzC2] = i10;
            this.zzl[iZzC2] = i;
            this.zzn[iZzC2] = zzaeyVar;
            this.zzi[iZzC2] = 0;
            zzxf zzxfVar = this.zzc;
            if (zzxfVar.zzf() || !((zzwv) zzxfVar.zzb()).zza.equals(this.zzy)) {
                zzz zzzVar = this.zzy;
                if (zzzVar == null) {
                    throw null;
                }
                zzxfVar.zzc(this.zzp + this.zzo, new zzwv(zzzVar, this.zzd.zzb(this.zze, zzzVar), null));
            }
            int i12 = this.zzo + 1;
            this.zzo = i12;
            int i13 = this.zzh;
            if (i12 == i13) {
                int i14 = i13 + 1000;
                long[] jArr = new long[i14];
                long[] jArr2 = new long[i14];
                long[] jArr3 = new long[i14];
                int[] iArr = new int[i14];
                int[] iArr2 = new int[i14];
                zzaey[] zzaeyVarArr = new zzaey[i14];
                int i15 = this.zzq;
                int i16 = i13 - i15;
                System.arraycopy(this.zzj, i15, jArr2, 0, i16);
                System.arraycopy(this.zzm, this.zzq, jArr3, 0, i16);
                System.arraycopy(this.zzl, this.zzq, iArr, 0, i16);
                System.arraycopy(this.zzk, this.zzq, iArr2, 0, i16);
                System.arraycopy(this.zzn, this.zzq, zzaeyVarArr, 0, i16);
                System.arraycopy(this.zzi, this.zzq, jArr, 0, i16);
                int i17 = this.zzq;
                System.arraycopy(this.zzj, 0, jArr2, i16, i17);
                System.arraycopy(this.zzm, 0, jArr3, i16, i17);
                System.arraycopy(this.zzl, 0, iArr, i16, i17);
                System.arraycopy(this.zzk, 0, iArr2, i16, i17);
                System.arraycopy(this.zzn, 0, zzaeyVarArr, i16, i17);
                System.arraycopy(this.zzi, 0, jArr, i16, i17);
                this.zzj = jArr2;
                this.zzm = jArr3;
                this.zzl = iArr;
                this.zzk = iArr2;
                this.zzn = zzaeyVarArr;
                this.zzi = jArr;
                this.zzq = 0;
                this.zzh = i14;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzI(zzz zzzVar, zzkv zzkvVar) {
        zzz zzzVar2 = this.zzg;
        zzs zzsVar = zzzVar2 == null ? null : zzzVar2.zzs;
        this.zzg = zzzVar;
        zzs zzsVar2 = zzzVar.zzs;
        zzsh zzshVar = this.zzd;
        zzkvVar.zza = zzzVar.zzc(zzshVar.zza(zzzVar));
        zzkvVar.zzb = this.zzB;
        if (zzzVar2 == null || !Objects.equals(zzsVar, zzsVar2)) {
            zzsi zzsiVarZzc = zzshVar.zzc(this.zze, zzzVar);
            this.zzB = zzsiVarZzc;
            zzkvVar.zzb = zzsiVarZzc;
        }
    }

    private final void zzJ() {
        if (this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i) {
        if (this.zzB == null) {
            return true;
        }
        int i10 = this.zzl[i];
        return false;
    }

    private final synchronized boolean zzN(zzz zzzVar) {
        try {
            this.zzx = false;
            if (Objects.equals(zzzVar, this.zzy)) {
                return false;
            }
            zzxf zzxfVar = this.zzc;
            if (zzxfVar.zzf() || !((zzwv) zzxfVar.zzb()).zza.equals(zzzVar)) {
                this.zzy = zzzVar;
            } else {
                this.zzy = ((zzwv) zzxfVar.zzb()).zza;
            }
            boolean z10 = this.zzz;
            zzz zzzVar2 = this.zzy;
            this.zzz = z10 & zzay.zzf(zzzVar2.zzo, zzzVar2.zzk);
            this.zzA = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzA(long j4, boolean z10) throws Throwable {
        Throwable th;
        zzwy zzwyVar;
        long j10;
        int iZzB;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            zzK();
            int i = this.zzr;
            int iZzC = zzC(i);
            if (zzL() && j4 >= this.zzm[iZzC]) {
                if (j4 > this.zzu) {
                    if (z10) {
                        z10 = true;
                    }
                }
                if (this.zzz) {
                    try {
                        int i10 = this.zzo - i;
                        int i11 = 0;
                        while (true) {
                            if (i11 < i10) {
                                if (this.zzm[iZzC] >= j4) {
                                    zzwyVar = this;
                                    j10 = j4;
                                    iZzB = i11;
                                    break;
                                }
                                iZzC++;
                                if (iZzC == this.zzh) {
                                    iZzC = 0;
                                }
                                i11++;
                            } else if (z10) {
                                j10 = j4;
                                iZzB = i10;
                                zzwyVar = this;
                            } else {
                                zzwyVar = this;
                                j10 = j4;
                                iZzB = -1;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    zzwyVar = this;
                    j10 = j4;
                    iZzB = zzwyVar.zzB(iZzC, this.zzo - i, j10, true);
                }
                if (iZzB != -1) {
                    zzwyVar.zzs = j10;
                    zzwyVar.zzr += iZzB;
                    return true;
                }
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j4, boolean z10) {
        Throwable th;
        try {
            try {
                int i = this.zzr;
                int iZzC = zzC(i);
                if (!zzL() || j4 < this.zzm[iZzC]) {
                    return 0;
                }
                if (j4 <= this.zzu || !z10) {
                    int iZzB = zzB(iZzC, this.zzo - i, j4, true);
                    if (iZzB == -1) {
                        return 0;
                    }
                    return iZzB;
                }
                try {
                    return this.zzo - i;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    public final int zze(zzkv zzkvVar, zzhs zzhsVar, int i, boolean z10) {
        boolean z11 = (i & 2) != 0;
        zzwu zzwuVar = this.zzb;
        int iZzD = zzD(zzkvVar, zzhsVar, z11, z10, zzwuVar);
        if (iZzD != -4) {
            return iZzD;
        }
        if (!zzhsVar.zzf()) {
            int i10 = i & 1;
            if ((i & 4) == 0) {
                if (i10 != 0) {
                    this.zza.zzd(zzhsVar, zzwuVar);
                    return -4;
                }
                this.zza.zze(zzhsVar, zzwuVar);
            } else if (i10 != 0) {
                return -4;
            }
            this.zzr++;
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ int zzf(zzl zzlVar, int i, boolean z10) {
        return zzaex.zza(this, zzlVar, i, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final int zzg(zzl zzlVar, int i, boolean z10, int i10) throws IOException {
        return this.zza.zza(zzlVar, i, z10);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzz zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j4, boolean z10, boolean z11) {
        this.zza.zzc(zzE(j4, false, z11));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzm(zzz zzzVar) {
        boolean zZzN = zzN(zzzVar);
        zzww zzwwVar = this.zzf;
        if (zzwwVar == null || !zZzN) {
            return;
        }
        zzwwVar.zzN(zzzVar);
    }

    public final void zzn() throws IOException {
        zzsi zzsiVar = this.zzB;
        if (zzsiVar != null) {
            throw zzsiVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzr(zzen zzenVar, int i) {
        zzaex.zzb(this, zzenVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzs(zzen zzenVar, int i, int i10) {
        this.zza.zzh(zzenVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzt(long j4, int i, int i10, int i11, zzaey zzaeyVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzz) {
            if (j4 < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzA) {
                    zzea.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzy)));
                    this.zzA = true;
                }
                i |= 1;
            }
        }
        zzH(j4, i, (this.zza.zzb() - i10) - i11, i10, zzaeyVar);
    }

    public final void zzu(long j4) {
        this.zzs = j4;
    }

    public final void zzv(zzww zzwwVar) {
        this.zzf = zzwwVar;
    }

    public final synchronized void zzw(int i) {
        boolean z10 = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdd.zzd(z10);
        this.zzr += i;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z10) {
        boolean z11 = true;
        if (zzL()) {
            if (((zzwv) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzM(zzC(this.zzr));
        }
        if (!z10 && !this.zzv) {
            zzz zzzVar = this.zzy;
            if (zzzVar == null) {
                z11 = false;
            } else if (zzzVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean zzz(int i) {
        zzK();
        int i10 = this.zzp;
        if (i >= i10 && i <= this.zzo + i10) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i - i10;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzl(long j4) {
    }
}
