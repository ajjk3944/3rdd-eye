package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import io.appmetrica.analytics.impl.Oo;
import j6.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzkh extends zzg implements zziy {
    public static final /* synthetic */ int zzd = 0;
    private final zzdi zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private zzmh zzE;
    private zzmi zzF;
    private zzix zzG;
    private zzbd zzH;
    private zzat zzI;
    private Object zzJ;
    private Surface zzK;
    private int zzL;
    private zzeo zzM;
    private zze zzN;
    private float zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzat zzT;
    private zzls zzU;
    private int zzV;
    private long zzW;
    private final zzjj zzX;
    private zzxc zzY;
    final zzze zzb;
    final zzbd zzc;
    private final zzdm zze = new zzdm(zzdj.zza);
    private final Context zzf;
    private final zzbh zzg;
    private final zzma[] zzh;
    private final zzma[] zzi;
    private final zzzd zzj;
    private final zzdt zzk;
    private final zzkt zzl;
    private final zzdz zzm;
    private final CopyOnWriteArraySet zzn;
    private final zzbj zzo;
    private final List zzp;
    private final boolean zzq;
    private final zzmo zzr;
    private final Looper zzs;
    private final zzzl zzt;
    private final zzdj zzu;
    private final zzkd zzv;
    private final zzke zzw;
    private final zzmm zzx;
    private final zzmn zzy;
    private final long zzz;

    static {
        zzaq.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzkh(zziw zziwVar, zzbh zzbhVar) {
        try {
            zzea.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0-alpha01] [" + zzex.zza + "]");
            this.zzf = zziwVar.zza.getApplicationContext();
            this.zzr = (zzmo) zziwVar.zzh.apply(zziwVar.zzb);
            this.zzS = zziwVar.zzj;
            this.zzN = zziwVar.zzk;
            this.zzL = zziwVar.zzl;
            this.zzP = false;
            this.zzz = zziwVar.zzq;
            zzkg zzkgVar = null;
            zzkd zzkdVar = new zzkd(this, zzkgVar);
            this.zzv = zzkdVar;
            this.zzw = new zzke(zzkgVar);
            zzma[] zzmaVarArrZzac = zzcem.zzac(((zzip) zziwVar.zzc).zza.zza, new Handler(zziwVar.zzi), zzkdVar, zzkdVar, zzkdVar, zzkdVar);
            this.zzh = zzmaVarArrZzac;
            int length = zzmaVarArrZzac.length;
            this.zzi = new zzma[2];
            int i = 0;
            while (true) {
                zzma[] zzmaVarArr = this.zzi;
                int length2 = zzmaVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzma zzmaVar = this.zzh[i];
                zzmaVarArr[i] = null;
                i++;
            }
            zzzd zzzdVar = (zzzd) zziwVar.zze.zza();
            this.zzj = zzzdVar;
            zziw.zza(((zziq) zziwVar.zzd).zza);
            zzzp zzzpVarZzh = zzzp.zzh(((zzit) zziwVar.zzg).zza);
            this.zzt = zzzpVarZzh;
            this.zzq = zziwVar.zzm;
            this.zzF = zziwVar.zzn;
            this.zzE = zziwVar.zzo;
            Looper looper = zziwVar.zzi;
            this.zzs = looper;
            zzdj zzdjVar = zziwVar.zzb;
            this.zzu = zzdjVar;
            this.zzg = zzbhVar;
            zzdz zzdzVar = new zzdz(looper, zzdjVar, new zzdx(this) { // from class: com.google.android.gms.internal.ads.zzji
                @Override // com.google.android.gms.internal.ads.zzdx
                public final void zza(Object obj, zzv zzvVar) {
                }
            });
            this.zzm = zzdzVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzn = copyOnWriteArraySet;
            this.zzp = new ArrayList();
            this.zzY = new zzxc(0);
            this.zzG = zzix.zza;
            int length3 = this.zzh.length;
            zzze zzzeVar = new zzze(new zzme[2], new zzyw[2], zzbt.zza, null);
            this.zzb = zzzeVar;
            this.zzo = new zzbj();
            zzbc zzbcVar = new zzbc();
            zzbcVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzzdVar.zzn();
            zzbcVar.zzd(29, true);
            zzbcVar.zzd(23, false);
            zzbcVar.zzd(25, false);
            zzbcVar.zzd(33, false);
            zzbcVar.zzd(26, false);
            zzbcVar.zzd(34, false);
            zzbd zzbdVarZze = zzbcVar.zze();
            this.zzc = zzbdVarZze;
            zzbc zzbcVar2 = new zzbc();
            zzbcVar2.zzb(zzbdVarZze);
            zzbcVar2.zza(4);
            zzbcVar2.zza(10);
            this.zzH = zzbcVar2.zze();
            this.zzk = zzdjVar.zzd(looper, null);
            zzjj zzjjVar = new zzjj(this);
            this.zzX = zzjjVar;
            this.zzU = zzls.zzh(zzzeVar);
            this.zzr.zzT(zzbhVar, looper);
            final zzph zzphVar = new zzph(zziwVar.zzt);
            zzkt zzktVar = new zzkt(this.zzf, this.zzh, this.zzi, zzzdVar, zzzeVar, (zzkx) zziwVar.zzf.zza(), zzzpVarZzh, 0, false, this.zzr, this.zzF, zziwVar.zzu, zziwVar.zzp, false, false, looper, zzdjVar, zzjjVar, zzphVar, null, this.zzG, this.zzw);
            this.zzl = zzktVar;
            Looper looperZze = zzktVar.zze();
            this.zzO = 1.0f;
            zzat zzatVar = zzat.zza;
            this.zzI = zzatVar;
            this.zzT = zzatVar;
            this.zzV = -1;
            int i10 = zzcw.zza;
            this.zzQ = true;
            zzmo zzmoVar = this.zzr;
            if (zzmoVar == null) {
                throw null;
            }
            zzdzVar.zzb(zzmoVar);
            zzzpVarZzh.zzf(new Handler(looper), this.zzr);
            copyOnWriteArraySet.add(this.zzv);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z10 = zziwVar.zzr;
                zzdjVar.zzd(zzktVar.zze(), null).zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpd zzpdVarZzb = zzpd.zzb(context);
                        if (zzpdVarZzb == null) {
                            zzea.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z10) {
                            this.zzz(zzpdVarZzb);
                        }
                        zzphVar.zzb(zzpdVarZzb.zza());
                    }
                });
            }
            zzdi zzdiVar = new zzdi(0, looperZze, looper, zzdjVar, new zzjk(this));
            this.zzA = zzdiVar;
            zzdiVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjl
                @Override // java.lang.Runnable
                public final void run() {
                    zzkh.zzJ(this.zza);
                }
            });
            new zzhx(zziwVar.zza, looperZze, zziwVar.zzi, this.zzv, zzdjVar);
            this.zzx = new zzmm(zziwVar.zza, looperZze, zzdjVar);
            this.zzy = new zzmn(zziwVar.zza, looperZze, zzdjVar);
            int i11 = zzo.zza;
            zzcd zzcdVar = zzcd.zza;
            this.zzM = zzeo.zza;
            zzktVar.zzr(this.zzE);
            zzktVar.zzp(this.zzN, false);
            zzad(1, 3, this.zzN);
            zzad(2, 4, Integer.valueOf(this.zzL));
            zzad(2, 5, 0);
            zzad(1, 9, Boolean.valueOf(this.zzP));
            zzad(6, 8, this.zzw);
            zzad(-1, 16, Integer.valueOf(this.zzS));
            this.zze.zzf();
        } catch (Throwable th) {
            this.zze.zzf();
            throw th;
        }
    }

    public static /* synthetic */ void zzJ(zzkh zzkhVar) {
        String str = zzex.zza;
        zzkhVar.zzA.zze(Integer.valueOf(zzcj.zzc(zzkhVar.zzf).generateAudioSessionId()));
    }

    public static /* synthetic */ void zzK(zzkh zzkhVar, zzkq zzkqVar) {
        boolean z10;
        int i = zzkhVar.zzB - zzkqVar.zzb;
        zzkhVar.zzB = i;
        boolean z11 = true;
        if (zzkqVar.zzc) {
            zzkhVar.zzC = zzkqVar.zzd;
            zzkhVar.zzD = true;
        }
        if (i == 0) {
            zzbl zzblVar = zzkqVar.zza.zza;
            if (!zzkhVar.zzU.zza.zzo() && zzblVar.zzo()) {
                zzkhVar.zzV = -1;
                zzkhVar.zzW = 0L;
            }
            if (!zzblVar.zzo()) {
                List listZzw = ((zzly) zzblVar).zzw();
                int size = listZzw.size();
                List list = zzkhVar.zzp;
                zzdd.zzf(size == list.size());
                for (int i10 = 0; i10 < listZzw.size(); i10++) {
                    ((zzkf) list.get(i10)).zzc((zzbl) listZzw.get(i10));
                }
            }
            long j4 = -9223372036854775807L;
            if (zzkhVar.zzD) {
                if (zzkqVar.zza.zzb.equals(zzkhVar.zzU.zzb) && zzkqVar.zza.zzd == zzkhVar.zzU.zzs) {
                    z11 = false;
                }
                if (z11) {
                    if (zzblVar.zzo() || zzkqVar.zza.zzb.zzb()) {
                        j4 = zzkqVar.zza.zzd;
                    } else {
                        zzls zzlsVar = zzkqVar.zza;
                        zzvh zzvhVar = zzlsVar.zzb;
                        long j10 = zzlsVar.zzd;
                        zzkhVar.zzW(zzblVar, zzvhVar, j10);
                        j4 = j10;
                    }
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            zzkhVar.zzD = false;
            zzkhVar.zzag(zzkqVar.zza, 1, z10, zzkhVar.zzC, j4, -1, false);
        }
    }

    public static /* synthetic */ void zzL(zzkh zzkhVar, int i, final int i10) {
        zzkhVar.zzai();
        Integer numValueOf = Integer.valueOf(i10);
        zzkhVar.zzad(1, 10, numValueOf);
        zzkhVar.zzad(2, 10, numValueOf);
        zzdw zzdwVar = new zzdw() { // from class: com.google.android.gms.internal.ads.zzjm
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i11 = zzkh.zzd;
                ((zzbe) obj).zza(i10);
            }
        };
        zzdz zzdzVar = zzkhVar.zzm;
        zzdzVar.zzd(21, zzdwVar);
        zzdzVar.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzP(zzkh zzkhVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkhVar.zzae(surface);
        zzkhVar.zzK = surface;
    }

    private final int zzS(zzls zzlsVar) {
        zzbl zzblVar = zzlsVar.zza;
        return zzblVar.zzo() ? this.zzV : zzblVar.zzn(zzlsVar.zzb.zza, this.zzo).zzc;
    }

    private final long zzT(zzls zzlsVar) {
        zzvh zzvhVar = zzlsVar.zzb;
        if (!zzvhVar.zzb()) {
            return zzex.zzv(zzU(zzlsVar));
        }
        zzbl zzblVar = zzlsVar.zza;
        zzblVar.zzn(zzvhVar.zza, this.zzo);
        long j4 = zzlsVar.zzc;
        if (j4 == -9223372036854775807L) {
            long j10 = zzblVar.zze(zzS(zzlsVar), this.zza, 0L).zzl;
            return zzex.zzv(0L);
        }
        return zzex.zzv(j4) + zzex.zzv(0L);
    }

    private final long zzU(zzls zzlsVar) {
        zzbl zzblVar = zzlsVar.zza;
        if (zzblVar.zzo()) {
            return zzex.zzs(this.zzW);
        }
        long j4 = zzlsVar.zzs;
        zzvh zzvhVar = zzlsVar.zzb;
        if (zzvhVar.zzb()) {
            return j4;
        }
        zzW(zzblVar, zzvhVar, j4);
        return j4;
    }

    private static long zzV(zzls zzlsVar) {
        zzbk zzbkVar = new zzbk();
        zzbj zzbjVar = new zzbj();
        zzbl zzblVar = zzlsVar.zza;
        zzblVar.zzn(zzlsVar.zzb.zza, zzbjVar);
        long j4 = zzlsVar.zzc;
        if (j4 != -9223372036854775807L) {
            return j4;
        }
        long j10 = zzblVar.zze(zzbjVar.zzc, zzbkVar, 0L).zzl;
        return 0L;
    }

    private final long zzW(zzbl zzblVar, zzvh zzvhVar, long j4) {
        zzblVar.zzn(zzvhVar.zza, this.zzo);
        return j4;
    }

    private final Pair zzX(zzbl zzblVar, int i, long j4) {
        if (zzblVar.zzo()) {
            this.zzV = i;
            if (j4 == -9223372036854775807L) {
                j4 = 0;
            }
            this.zzW = j4;
            return null;
        }
        if (i == -1 || i >= zzblVar.zzc()) {
            i = zzblVar.zzg(false);
            long j10 = zzblVar.zze(i, this.zza, 0L).zzl;
            j4 = zzex.zzv(0L);
        }
        return zzblVar.zzl(this.zza, this.zzo, i, zzex.zzs(j4));
    }

    private static zzls zzY(zzls zzlsVar, int i) {
        zzls zzlsVarZzf = zzlsVar.zzf(i);
        return (i == 1 || i == 4) ? zzlsVarZzf.zza(false) : zzlsVarZzf;
    }

    private final zzls zzZ(zzls zzlsVar, zzbl zzblVar, Pair pair) {
        zzdd.zzd(zzblVar.zzo() || pair != null);
        zzbl zzblVar2 = zzlsVar.zza;
        long jZzT = zzT(zzlsVar);
        zzls zzlsVarZzg = zzlsVar.zzg(zzblVar);
        if (zzblVar.zzo()) {
            zzvh zzvhVarZzi = zzls.zzi();
            long jZzs = zzex.zzs(this.zzW);
            zzls zzlsVarZzb = zzlsVarZzg.zzc(zzvhVarZzi, jZzs, jZzs, jZzs, 0L, zzxk.zza, this.zzb, zzfyf.zzn()).zzb(zzvhVarZzi);
            zzlsVarZzb.zzq = zzlsVarZzb.zzs;
            return zzlsVarZzb;
        }
        zzvh zzvhVar = zzlsVarZzg.zzb;
        Object obj = zzvhVar.zza;
        String str = zzex.zza;
        boolean zEquals = obj.equals(pair.first);
        zzvh zzvhVar2 = !zEquals ? new zzvh(pair.first, -1L) : zzvhVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzex.zzs(jZzT);
        if (!zzblVar2.zzo()) {
            zzblVar2.zzn(obj, this.zzo);
        }
        if (!zEquals || jLongValue < jZzs2) {
            zzvh zzvhVar3 = zzvhVar2;
            zzdd.zzf(!zzvhVar3.zzb());
            zzls zzlsVarZzb2 = zzlsVarZzg.zzc(zzvhVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzxk.zza : zzlsVarZzg.zzh, !zEquals ? this.zzb : zzlsVarZzg.zzi, !zEquals ? zzfyf.zzn() : zzlsVarZzg.zzj).zzb(zzvhVar3);
            zzlsVarZzb2.zzq = jLongValue;
            return zzlsVarZzb2;
        }
        if (jLongValue != jZzs2) {
            zzvh zzvhVar4 = zzvhVar2;
            zzdd.zzf(!zzvhVar4.zzb());
            long jMax = Math.max(0L, zzlsVarZzg.zzr - (jLongValue - jZzs2));
            long j4 = zzlsVarZzg.zzq;
            if (zzlsVarZzg.zzk.equals(zzvhVar)) {
                j4 = jLongValue + jMax;
            }
            zzls zzlsVarZzc = zzlsVarZzg.zzc(zzvhVar4, jLongValue, jLongValue, jLongValue, jMax, zzlsVarZzg.zzh, zzlsVarZzg.zzi, zzlsVarZzg.zzj);
            zzlsVarZzc.zzq = j4;
            return zzlsVarZzc;
        }
        int iZza = zzblVar.zza(zzlsVarZzg.zzk.zza);
        if (iZza != -1) {
            zzbj zzbjVar = this.zzo;
            if (zzblVar.zzd(iZza, zzbjVar, false).zzc == zzblVar.zzn(zzvhVar2.zza, zzbjVar).zzc) {
                return zzlsVarZzg;
            }
        }
        Object obj2 = zzvhVar2.zza;
        zzbj zzbjVar2 = this.zzo;
        zzblVar.zzn(obj2, zzbjVar2);
        long jZzf = zzvhVar2.zzb() ? zzbjVar2.zzf(zzvhVar2.zzb, zzvhVar2.zzc) : zzbjVar2.zzd;
        zzvh zzvhVar5 = zzvhVar2;
        zzls zzlsVarZzb3 = zzlsVarZzg.zzc(zzvhVar5, zzlsVarZzg.zzs, zzlsVarZzg.zzs, zzlsVarZzg.zzd, jZzf - zzlsVarZzg.zzs, zzlsVarZzg.zzh, zzlsVarZzg.zzi, zzlsVarZzg.zzj).zzb(zzvhVar5);
        zzlsVarZzb3.zzq = jZzf;
        return zzlsVarZzb3;
    }

    private final zzlw zzaa(zzlv zzlvVar) {
        int iZzS = zzS(this.zzU);
        zzbl zzblVar = this.zzU.zza;
        if (iZzS == -1) {
            iZzS = 0;
        }
        zzdj zzdjVar = this.zzu;
        zzkt zzktVar = this.zzl;
        return new zzlw(zzktVar, zzlvVar, zzblVar, iZzS, zzdjVar, zzktVar.zze());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ void zzab(final zzkq zzkqVar) {
        this.zzk.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjo
            @Override // java.lang.Runnable
            public final void run() {
                zzkh.zzK(this.zza, zzkqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(final int i, final int i10) {
        if (i == this.zzM.zzb() && i10 == this.zzM.zza()) {
            return;
        }
        this.zzM = new zzeo(i, i10);
        zzdz zzdzVar = this.zzm;
        zzdzVar.zzd(24, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i11 = zzkh.zzd;
                ((zzbe) obj).zzp(i, i10);
            }
        });
        zzdzVar.zzc();
        zzad(2, 14, new zzeo(i, i10));
    }

    private final void zzad(int i, int i10, Object obj) {
        zzma[] zzmaVarArr = this.zzh;
        int length = zzmaVarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            zzma zzmaVar = zzmaVarArr[i11];
            if (i == -1 || zzmaVar.zzb() == i) {
                zzlw zzlwVarZzaa = zzaa(zzmaVar);
                zzlwVarZzaa.zzf(i10);
                zzlwVarZzaa.zze(obj);
                zzlwVarZzaa.zzd();
            }
        }
        zzma[] zzmaVarArr2 = this.zzi;
        int length2 = zzmaVarArr2.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzma zzmaVar2 = zzmaVarArr2[i12];
            if (zzmaVar2 != null && (i == -1 || zzmaVar2.zzb() == i)) {
                zzlw zzlwVarZzaa2 = zzaa(zzmaVar2);
                zzlwVarZzaa2.zzf(i10);
                zzlwVarZzaa2.zze(obj);
                zzlwVarZzaa2.zzd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(Object obj) {
        Object obj2 = this.zzJ;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zZzv = this.zzl.zzv(obj, z10 ? this.zzz : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.zzJ;
            Surface surface = this.zzK;
            if (obj3 == surface) {
                surface.release();
                this.zzK = null;
            }
        }
        this.zzJ = obj;
        if (zZzv) {
            return;
        }
        zzaf(zzin.zzd(new zzku(3), 1003));
    }

    private final void zzaf(zzin zzinVar) {
        zzls zzlsVar = this.zzU;
        zzls zzlsVarZzb = zzlsVar.zzb(zzlsVar.zzb);
        zzlsVarZzb.zzq = zzlsVarZzb.zzs;
        zzlsVarZzb.zzr = 0L;
        zzls zzlsVarZzY = zzY(zzlsVarZzb, 1);
        if (zzinVar != null) {
            zzlsVarZzY = zzlsVarZzY.zze(zzinVar);
        }
        this.zzB++;
        this.zzl.zzt();
        zzag(zzlsVarZzY, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c  */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzag(final com.google.android.gms.internal.ads.zzls r34, final int r35, boolean r36, int r37, long r38, int r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkh.zzag(com.google.android.gms.internal.ads.zzls, int, boolean, int, long, int, boolean):void");
    }

    private final void zzah() {
        int iZzg = zzg();
        if (iZzg != 2 && iZzg != 3) {
            this.zzx.zza(false);
            this.zzy.zza(false);
        } else {
            zzai();
            boolean z10 = this.zzU.zzp;
            this.zzx.zza(zzv());
            this.zzy.zza(zzv());
        }
    }

    private final void zzai() {
        this.zze.zzb();
        Looper looper = this.zzs;
        if (Thread.currentThread() != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzex.zza;
            Locale locale = Locale.US;
            String strH = Oo.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzQ) {
                throw new IllegalStateException(strH);
            }
            zzea.zzg("ExoPlayerImpl", strH, this.zzR ? null : new IllegalStateException());
            this.zzR = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzA() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzex.zza;
        String strZza = zzaq.zza();
        StringBuilder sbD = l.d("Release ", hexString, " [AndroidXMedia3/1.8.0-alpha01] [", str, "] [");
        sbD.append(strZza);
        sbD.append("]");
        zzea.zze("ExoPlayerImpl", sbD.toString());
        zzai();
        this.zzx.zza(false);
        this.zzy.zza(false);
        if (!this.zzl.zzu()) {
            zzdz zzdzVar = this.zzm;
            zzdzVar.zzd(10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjg
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj) {
                    int i = zzkh.zzd;
                    ((zzbe) obj).zzk(zzin.zzd(new zzku(1), 1003));
                }
            });
            zzdzVar.zzc();
        }
        this.zzm.zze();
        this.zzk.zzf(null);
        zzzl zzzlVar = this.zzt;
        zzmo zzmoVar = this.zzr;
        zzzlVar.zzg(zzmoVar);
        zzls zzlsVar = this.zzU;
        boolean z10 = zzlsVar.zzp;
        zzls zzlsVarZzY = zzY(zzlsVar, 1);
        this.zzU = zzlsVarZzY;
        zzls zzlsVarZzb = zzlsVarZzY.zzb(zzlsVarZzY.zzb);
        this.zzU = zzlsVarZzb;
        zzlsVarZzb.zzq = zzlsVarZzb.zzs;
        this.zzU.zzr = 0L;
        zzmoVar.zzR();
        Surface surface = this.zzK;
        if (surface != null) {
            surface.release();
            this.zzK = null;
        }
        int i = zzcw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzB(zzmr zzmrVar) {
        zzai();
        this.zzr.zzS(zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzC(zzvj zzvjVar) {
        zzai();
        List listSingletonList = Collections.singletonList(zzvjVar);
        zzai();
        zzai();
        zzS(this.zzU);
        zzl();
        this.zzB++;
        List list = this.zzp;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                list.remove(i);
            }
            this.zzY = this.zzY.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listSingletonList.size(); i10++) {
            zzlp zzlpVar = new zzlp((zzvj) listSingletonList.get(i10), this.zzq);
            arrayList.add(zzlpVar);
            list.add(i10, new zzkf(zzlpVar.zzb, zzlpVar.zza));
        }
        this.zzY = this.zzY.zzg(0, arrayList.size());
        zzly zzlyVar = new zzly(list, this.zzY);
        if (!zzlyVar.zzo() && zzlyVar.zzc() < 0) {
            throw new zzaa(zzlyVar, -1, -9223372036854775807L);
        }
        int iZzg = zzlyVar.zzg(false);
        zzls zzlsVarZzZ = zzZ(this.zzU, zzlyVar, zzX(zzlyVar, iZzg, -9223372036854775807L));
        int i11 = zzlsVarZzZ.zze;
        if (iZzg != -1 && i11 != 1) {
            i11 = 4;
            if (!zzlyVar.zzo() && iZzg < zzlyVar.zzc()) {
                i11 = 2;
            }
        }
        zzls zzlsVarZzY = zzY(zzlsVarZzZ, i11);
        this.zzl.zzw(arrayList, iZzg, zzex.zzs(-9223372036854775807L), this.zzY);
        zzag(zzlsVarZzY, 0, (this.zzU.zzb.zza.equals(zzlsVarZzY.zzb.zza) || this.zzU.zza.zzo()) ? false : true, 4, zzU(zzlsVarZzY), -1, false);
    }

    public final zzin zzF() {
        zzai();
        return this.zzU.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzg
    public final void zzb(int i, long j4, int i10, boolean z10) {
        zzai();
        if (i == -1) {
            return;
        }
        zzdd.zzd(i >= 0);
        zzbl zzblVar = this.zzU.zza;
        if (zzblVar.zzo() || i < zzblVar.zzc()) {
            this.zzr.zzv();
            this.zzB++;
            if (zzx()) {
                zzea.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkq zzkqVar = new zzkq(this.zzU);
                zzkqVar.zza(1);
                this.zzX.zza.zzab(zzkqVar);
                return;
            }
            zzls zzlsVarZzY = this.zzU;
            int i11 = zzlsVarZzY.zze;
            if (i11 == 3 || (i11 == 4 && !zzblVar.zzo())) {
                zzlsVarZzY = zzY(this.zzU, 2);
            }
            int iZze = zze();
            zzls zzlsVarZzZ = zzZ(zzlsVarZzY, zzblVar, zzX(zzblVar, i, j4));
            this.zzl.zzn(zzblVar, i, zzex.zzs(j4));
            zzag(zzlsVarZzZ, 0, true, 1, zzU(zzlsVarZzZ), iZze, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzc() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzd() {
        zzai();
        if (zzx()) {
            return this.zzU.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zze() {
        zzai();
        int iZzS = zzS(this.zzU);
        if (iZzS == -1) {
            return 0;
        }
        return iZzS;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzf() {
        zzai();
        if (this.zzU.zza.zzo()) {
            return 0;
        }
        zzls zzlsVar = this.zzU;
        return zzlsVar.zza.zza(zzlsVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzg() {
        zzai();
        return this.zzU.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzh() {
        zzai();
        return this.zzU.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final int zzi() {
        zzai();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzj() {
        zzai();
        if (zzx()) {
            zzls zzlsVar = this.zzU;
            return zzlsVar.zzk.equals(zzlsVar.zzb) ? zzex.zzv(this.zzU.zzq) : zzm();
        }
        zzai();
        if (this.zzU.zza.zzo()) {
            return this.zzW;
        }
        zzls zzlsVar2 = this.zzU;
        long j4 = 0;
        if (zzlsVar2.zzk.zzd != zzlsVar2.zzb.zzd) {
            return zzex.zzv(zzlsVar2.zza.zze(zze(), this.zza, 0L).zzm);
        }
        long j10 = zzlsVar2.zzq;
        if (this.zzU.zzk.zzb()) {
            zzls zzlsVar3 = this.zzU;
            zzlsVar3.zza.zzn(zzlsVar3.zzk.zza, this.zzo).zzg(this.zzU.zzk.zzb);
        } else {
            j4 = j10;
        }
        zzls zzlsVar4 = this.zzU;
        zzW(zzlsVar4.zza, zzlsVar4.zzk, j4);
        return zzex.zzv(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzk() {
        zzai();
        return zzT(this.zzU);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzl() {
        zzai();
        return zzex.zzv(zzU(this.zzU));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzm() {
        zzai();
        if (!zzx()) {
            zzbl zzblVarZzo = zzo();
            if (zzblVarZzo.zzo()) {
                return -9223372036854775807L;
            }
            return zzex.zzv(zzblVarZzo.zze(zze(), this.zza, 0L).zzm);
        }
        zzls zzlsVar = this.zzU;
        zzvh zzvhVar = zzlsVar.zzb;
        zzbl zzblVar = zzlsVar.zza;
        Object obj = zzvhVar.zza;
        zzbj zzbjVar = this.zzo;
        zzblVar.zzn(obj, zzbjVar);
        return zzex.zzv(zzbjVar.zzf(zzvhVar.zzb, zzvhVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final long zzn() {
        zzai();
        return zzex.zzv(this.zzU.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbl zzo() {
        zzai();
        return this.zzU.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final zzbt zzp() {
        zzai();
        return this.zzU.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzq() {
        zzai();
        zzls zzlsVar = this.zzU;
        if (zzlsVar.zze != 1) {
            return;
        }
        zzls zzlsVarZze = zzlsVar.zze(null);
        zzls zzlsVarZzY = zzY(zzlsVarZze, true != zzlsVarZze.zza.zzo() ? 2 : 4);
        this.zzB++;
        this.zzl.zzm();
        zzag(zzlsVarZzY, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzr(boolean z10) {
        zzai();
        zzls zzlsVar = this.zzU;
        int i = zzlsVar.zzn;
        int i10 = 0;
        if (i == 1) {
            if (z10) {
                i = 1;
            } else {
                i = 1;
                i10 = 1;
            }
        }
        if (zzlsVar.zzl == z10 && i == i10 && zzlsVar.zzm == 1) {
            return;
        }
        this.zzB++;
        zzls zzlsVarZzd = zzlsVar.zzd(z10, 1, i10);
        this.zzl.zzq(z10, 1, i10);
        zzag(zzlsVarZzd, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzs(Surface surface) {
        zzai();
        zzae(surface);
        int i = surface == null ? 0 : -1;
        zzac(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzt(float f10) {
        zzai();
        String str = zzex.zza;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzO == fMax) {
            return;
        }
        this.zzO = fMax;
        this.zzl.zzs(fMax);
        zzdz zzdzVar = this.zzm;
        zzdzVar.zzd(22, new zzdw() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i = zzkh.zzd;
                ((zzbe) obj).zzt(fMax);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzu() {
        zzai();
        zzaf(null);
        new zzcw(zzfyf.zzn(), this.zzU.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzv() {
        zzai();
        return this.zzU.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzw() {
        zzai();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbh
    public final boolean zzx() {
        zzai();
        return this.zzU.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzy() {
        zzai();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final void zzz(zzmr zzmrVar) {
        this.zzr.zzu(zzmrVar);
    }
}
