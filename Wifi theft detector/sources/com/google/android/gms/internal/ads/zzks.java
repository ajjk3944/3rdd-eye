package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
final class zzks extends zzf implements zzjh {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfa zzC;

    @Nullable
    private final zzkr zzD;
    private final Map zzE;
    private int zzF;
    private int zzG;
    private boolean zzH;
    private zzms zzI;
    private zzmt zzJ;
    private zzjg zzK;
    private zzax zzL;
    private zzan zzM;

    @Nullable
    private Object zzN;

    @Nullable
    private Surface zzO;
    private int zzP;
    private zzes zzQ;
    private zzd zzR;
    private float zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private zzil zzY;
    private zzan zzZ;
    private zzmd zzaa;
    private int zzab;
    private long zzac;
    private zzyf zzad;
    final zzaak zzb;
    final zzax zzc;
    private final zzdq zze = new zzdq(zzdn.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzml[] zzh;
    private final zzml[] zzi;
    private final zzaaj zzj;
    private final zzdx zzk;
    private final zzld zzl;
    private final zzlf zzm;
    private final zzed zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmx zzs;
    private final Looper zzt;
    private final zzaas zzu;
    private final zzdn zzv;
    private final zzjo zzw;
    private final zzkn zzx;
    private final zzfo zzy;
    private final zzfp zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public zzks(zzjf zzjfVar, @Nullable zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfj.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb.append(str);
            sb.append("]");
            zzee.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjfVar.zza.getApplicationContext();
            this.zzs = (zzmx) zzjfVar.zzh.apply(zzjfVar.zzb);
            this.zzW = zzjfVar.zzj;
            this.zzR = zzjfVar.zzk;
            this.zzP = zzjfVar.zzl;
            this.zzT = false;
            this.zzA = zzjfVar.zzq;
            zzjo zzjoVar = new zzjo(this, null);
            this.zzw = zzjoVar;
            this.zzx = new zzkn(null);
            zzml[] zzmlVarArrZza = ((zzmq) zzjfVar.zzc.zza()).zza(new Handler(zzjfVar.zzi), zzjoVar, zzjoVar, zzjoVar, zzjoVar);
            this.zzh = zzmlVarArrZza;
            int length = zzmlVarArrZza.length;
            this.zzi = new zzml[2];
            int i10 = 0;
            while (true) {
                zzml[] zzmlVarArr = this.zzi;
                int length2 = zzmlVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzml zzmlVar = this.zzh[i10];
                zzmlVarArr[i10] = null;
                i10++;
            }
            zzaaj zzaajVar = (zzaaj) zzjfVar.zze.zza();
            this.zzj = zzaajVar;
            zzaas zzaasVar = (zzaas) zzjfVar.zzg.zza();
            this.zzu = zzaasVar;
            this.zzr = zzjfVar.zzm;
            this.zzJ = zzjfVar.zzn;
            this.zzI = zzjfVar.zzo;
            Looper looper = zzjfVar.zzi;
            this.zzt = looper;
            zzdn zzdnVar = zzjfVar.zzb;
            this.zzv = zzdnVar;
            this.zzg = zzbbVar;
            this.zzn = new zzed(looper, zzdnVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyf(0);
            this.zzK = zzjg.zza;
            int length3 = this.zzh.length;
            zzaak zzaakVar = new zzaak(new zzmo[2], new zzaac[2], zzbn.zza, null);
            this.zzb = zzaakVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaajVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzL = zzawVar2.zze();
            this.zzk = zzdnVar.zzd(looper, null);
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzld
                public final /* synthetic */ void zza(zzlc zzlcVar) {
                    this.zza.zzK(zzlcVar);
                }
            };
            this.zzl = zzldVar;
            this.zzaa = zzmd.zza(zzaakVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpq zzpqVar = new zzpq(zzjfVar.zzx);
            zzlf zzlfVar = new zzlf(this.zzf, this.zzh, this.zzi, zzaajVar, zzaakVar, (zzlj) zzjfVar.zzf.zza(), zzaasVar, 0, false, this.zzs, this.zzJ, zzjfVar.zzy, zzjfVar.zzp, false, false, looper, zzdnVar, zzldVar, zzpqVar, null, this.zzK, this.zzx);
            this.zzm = zzlfVar;
            Looper looperZzn = zzlfVar.zzn();
            this.zzS = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzM = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i11 = zzcz.zza;
            this.zzU = true;
            zze(this.zzs);
            zzaasVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                final Context context = this.zzf;
                final boolean z10 = zzjfVar.zzv;
                zzdnVar.zzd(zzlfVar.zzn(), null).zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzji
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpm zzpmVarZza = zzpm.zza(context);
                        if (zzpmVarZza == null) {
                            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z10) {
                            this.zzD(zzpmVarZza);
                        }
                        zzpqVar.zzb(zzpmVarZza.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdnVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzka
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjfVar.zza, looperZzn, zzjfVar.zzi, this.zzw, zzdnVar);
            boolean z11 = (zzjfVar.zzs == Integer.MAX_VALUE || zzjfVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfo zzfoVar = new zzfo(zzjfVar.zza, looperZzn, zzdnVar);
            this.zzy = zzfoVar;
            zzfoVar.zza(z11);
            this.zzz = new zzfp(zzjfVar.zza, looperZzn, zzdnVar);
            int i13 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzQ = zzes.zza;
            this.zzD = i12 >= 34 ? new zzkr(this, zzjfVar.zza, null) : null;
            this.zzE = new HashMap();
            this.zzY = zzil.zza;
            this.zzC = new zzfa(this, this.zzw, zzdnVar, zzjfVar.zzr, zzjfVar.zzs, zzjfVar.zzt, zzjfVar.zzu);
            zzlfVar.zzg(this.zzI);
            zzlfVar.zzi(this.zzR, false);
            zzaw(1, 3, this.zzR);
            zzaw(2, 4, Integer.valueOf(this.zzP));
            zzaw(2, 5, 0);
            zzaw(1, 9, Boolean.valueOf(this.zzT));
            zzaw(6, 8, this.zzx);
            zzaw(-1, 16, Integer.valueOf(this.zzW));
            this.zze.zza();
        } catch (Throwable th) {
            this.zze.zza();
            throw th;
        }
    }

    public static /* synthetic */ zzil zzU(zzil zzilVar, List list) {
        zzik zzikVar = new zzik(zzilVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzilVar.zza()) {
            if (!hashSet.contains(str)) {
                zzikVar.zzf(str);
            }
        }
        return zzikVar.zzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] */
    public final void zzP(@Nullable zziw zziwVar) {
        zzmd zzmdVar = this.zzaa;
        zzmd zzmdVarZzh = zzmdVar.zzh(zzmdVar.zzb);
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        zzmdVarZzh.zzr = 0L;
        zzmd zzmdVarZzao = zzao(zzmdVarZzh, 1);
        if (zziwVar != null) {
            zzmdVarZzao = zzmdVarZzao.zzf(zziwVar);
        }
        this.zzF++;
        this.zzm.zzh();
        zzal(zzmdVarZzao, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private final int zzai(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmdVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzaj(zzmd zzmdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        if (!zzwkVar.zzb()) {
            return zzfj.zzp(zzak(zzmdVar));
        }
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        long j10 = zzmdVar.zzc;
        if (j10 != C.TIME_UNSET) {
            return zzfj.zzp(0L) + zzfj.zzp(j10);
        }
        long j11 = zzbfVar.zzb(zzai(zzmdVar), this.zza, 0L).zzl;
        return zzfj.zzp(0L);
    }

    private final long zzak(zzmd zzmdVar) {
        zzbf zzbfVar = zzmdVar.zza;
        if (zzbfVar.zzg()) {
            return zzfj.zzq(this.zzac);
        }
        long j10 = zzmdVar.zzs;
        zzwk zzwkVar = zzmdVar.zzb;
        if (zzwkVar.zzb()) {
            return j10;
        }
        zzaq(zzbfVar, zzwkVar, j10);
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzal(final com.google.android.gms.internal.ads.zzmd r33, final int r34, boolean r35, int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzal(com.google.android.gms.internal.ads.zzmd, int, boolean, int, long, int, boolean):void");
    }

    private static long zzam(zzmd zzmdVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmdVar.zza;
        zzbfVar.zzo(zzmdVar.zzb.zza, zzbdVar);
        long j10 = zzmdVar.zzc;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        long j11 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzmd zzan(com.google.android.gms.internal.ads.zzmd r23, com.google.android.gms.internal.ads.zzbf r24, @androidx.annotation.Nullable android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzan(com.google.android.gms.internal.ads.zzmd, com.google.android.gms.internal.ads.zzbf, android.util.Pair):com.google.android.gms.internal.ads.zzmd");
    }

    private static zzmd zzao(zzmd zzmdVar, int i10) {
        zzmd zzmdVarZze = zzmdVar.zze(i10);
        return (i10 == 1 || i10 == 4) ? zzmdVarZze.zzg(false) : zzmdVarZze;
    }

    @Nullable
    private final Pair zzap(zzbf zzbfVar, int i10, long j10) {
        if (zzbfVar.zzg()) {
            this.zzab = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.zzac = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzbfVar.zza()) {
            i10 = zzbfVar.zzk(false);
            long j11 = zzbfVar.zzb(i10, this.zza, 0L).zzl;
            j10 = zzfj.zzp(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i10, zzfj.zzq(j10));
    }

    private final long zzaq(zzbf zzbfVar, zzwk zzwkVar, long j10) {
        zzbfVar.zzo(zzwkVar.zza, this.zzp);
        return j10;
    }

    private final zzmh zzar(zzmg zzmgVar) {
        int iZzai = zzai(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzai == -1) {
            iZzai = 0;
        }
        zzdn zzdnVar = this.zzv;
        zzlf zzlfVar = this.zzm;
        return new zzmh(zzlfVar, zzmgVar, zzbfVar, iZzai, zzdnVar, zzlfVar.zzn());
    }

    private final void zzas(@Nullable Object obj) {
        Object obj2 = this.zzN;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z10 ? this.zzA : C.TIME_UNSET);
        if (z10) {
            Object obj3 = this.zzN;
            Surface surface = this.zzO;
            if (obj3 == surface) {
                surface.release();
                this.zzO = null;
            }
        }
        this.zzN = obj;
        if (zZzl) {
            return;
        }
        zzP(zziw.zzc(new zzlg(3), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i10, final int i11) {
        if (i10 == this.zzQ.zza() && i11 == this.zzQ.zzb()) {
            return;
        }
        this.zzQ = new zzes(i10, i11);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkc
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzks.zzd;
                ((zzaz) obj).zzu(i10, i11);
            }
        });
        zzedVar.zze();
        zzaw(2, 14, new zzes(i10, i11));
    }

    private final void zzau() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzav();
            boolean z10 = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzav() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfj.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzU) {
                throw new IllegalStateException(str2);
            }
            zzee.zzd("ExoPlayerImpl", str2, this.zzV ? null : new IllegalStateException());
            this.zzV = true;
        }
    }

    private final void zzaw(int i10, int i11, @Nullable Object obj) {
        zzml[] zzmlVarArr = this.zzh;
        int length = zzmlVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzml zzmlVar = zzmlVarArr[i12];
            if (i10 == -1 || zzmlVar.zza() == i10) {
                zzmh zzmhVarZzar = zzar(zzmlVar);
                zzmhVarZzar.zzb(i11);
                zzmhVarZzar.zzd(obj);
                zzmhVarZzar.zzg();
            }
        }
        zzml[] zzmlVarArr2 = this.zzi;
        int length2 = zzmlVarArr2.length;
        for (int i13 = 0; i13 < 2; i13++) {
            zzml zzmlVar2 = zzmlVarArr2[i13];
            if (zzmlVar2 != null && (i10 == -1 || zzmlVar2.zza() == i10)) {
                zzmh zzmhVarZzar2 = zzar(zzmlVar2);
                zzmhVarZzar2.zzb(i11);
                zzmhVarZzar2.zzd(obj);
                zzmhVarZzar2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzav();
        return zzaj(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f10) {
        zzav();
        String str = zzfj.zza;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzS == fMax) {
            return;
        }
        this.zzS = fMax;
        this.zzm.zzj(fMax);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i10 = zzks.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(@Nullable Surface surface) {
        zzav();
        zzas(surface);
        int i10 = surface == null ? 0 : -1;
        zzS(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzD(zzna zznaVar) {
        this.zzs.zzv(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzE(zzna zznaVar) {
        zzav();
        this.zzs.zzw(zznaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final int zzF() {
        zzav();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzG(com.google.android.gms.internal.ads.zzwm r14) {
        /*
            r13 = this;
            r13.zzav()
            java.util.List r1 = java.util.Collections.singletonList(r14)
            r13.zzav()
            r13.zzav()
            com.google.android.gms.internal.ads.zzmd r2 = r13.zzaa
            r13.zzai(r2)
            r13.zzu()
            int r2 = r13.zzF
            r3 = 1
            int r2 = r2 + r3
            r13.zzF = r2
            java.util.List r2 = r13.zzq
            r2.clear()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r10 = 0
            r4 = r10
        L27:
            int r6 = r1.size()
            if (r4 >= r6) goto L4c
            com.google.android.gms.internal.ads.zzlz r6 = new com.google.android.gms.internal.ads.zzlz
            java.lang.Object r7 = r1.get(r4)
            com.google.android.gms.internal.ads.zzwm r7 = (com.google.android.gms.internal.ads.zzwm) r7
            boolean r8 = r13.zzr
            r6.<init>(r7, r8)
            r5.add(r6)
            java.lang.Object r7 = r6.zzb
            com.google.android.gms.internal.ads.zzwf r6 = r6.zza
            com.google.android.gms.internal.ads.zzko r8 = new com.google.android.gms.internal.ads.zzko
            r8.<init>(r7, r6)
            r2.add(r4, r8)
            int r4 = r4 + 1
            goto L27
        L4c:
            com.google.android.gms.internal.ads.zzyf r1 = r13.zzad
            int r4 = r5.size()
            com.google.android.gms.internal.ads.zzyf r1 = r1.zzg()
            com.google.android.gms.internal.ads.zzyf r1 = r1.zzf(r10, r4)
            r13.zzad = r1
            com.google.android.gms.internal.ads.zzmj r1 = new com.google.android.gms.internal.ads.zzmj
            com.google.android.gms.internal.ads.zzyf r4 = r13.zzad
            r1.<init>(r2, r4)
            boolean r2 = r1.zzg()
            r4 = -1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L7c
            int r2 = r1.zza()
            if (r2 < 0) goto L76
            goto L7c
        L76:
            com.google.android.gms.internal.ads.zzw r2 = new com.google.android.gms.internal.ads.zzw
            r2.<init>(r1, r4, r6)
            throw r2
        L7c:
            int r2 = r1.zzk(r10)
            com.google.android.gms.internal.ads.zzmd r8 = r13.zzaa
            android.util.Pair r9 = r13.zzap(r1, r2, r6)
            com.google.android.gms.internal.ads.zzmd r8 = r13.zzan(r8, r1, r9)
            int r9 = r8.zze
            if (r9 != r3) goto L90
            r9 = r3
            goto La4
        L90:
            boolean r11 = r1.zzg()
            r12 = 4
            if (r11 == 0) goto L99
        L97:
            r9 = r12
            goto La4
        L99:
            if (r2 != r4) goto L9c
            goto La4
        L9c:
            int r1 = r1.zza()
            if (r2 < r1) goto La3
            goto L97
        La3:
            r9 = 2
        La4:
            com.google.android.gms.internal.ads.zzmd r1 = zzao(r8, r9)
            com.google.android.gms.internal.ads.zzlf r4 = r13.zzm
            long r7 = com.google.android.gms.internal.ads.zzfj.zzq(r6)
            com.google.android.gms.internal.ads.zzyf r9 = r13.zzad
            r6 = r2
            r4.zzy(r5, r6, r7, r9)
            com.google.android.gms.internal.ads.zzmd r2 = r13.zzaa
            com.google.android.gms.internal.ads.zzwk r2 = r2.zzb
            java.lang.Object r2 = r2.zza
            com.google.android.gms.internal.ads.zzwk r4 = r1.zzb
            java.lang.Object r4 = r4.zza
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lcf
            com.google.android.gms.internal.ads.zzmd r2 = r13.zzaa
            com.google.android.gms.internal.ads.zzbf r2 = r2.zza
            boolean r2 = r2.zzg()
            if (r2 != 0) goto Lcf
            goto Ld0
        Lcf:
            r3 = r10
        Ld0:
            long r5 = r13.zzak(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r13
            r0.zzal(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzks.zzG(com.google.android.gms.internal.ads.zzwm):void");
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 40 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strZza);
        sb.append("]");
        zzee.zzb("ExoPlayerImpl", sb.toString());
        zzav();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzkr zzkrVar = this.zzD;
        if (zzkrVar != null && Build.VERSION.SDK_INT >= 34) {
            zzkrVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzed zzedVar = this.zzn;
            zzedVar.zzd(10, zzkg.zza);
            zzedVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzm(null);
        zzaas zzaasVar = this.zzu;
        zzmx zzmxVar = this.zzs;
        zzaasVar.zzg(zzmxVar);
        zzmd zzmdVar = this.zzaa;
        boolean z10 = zzmdVar.zzp;
        zzmd zzmdVarZzao = zzao(zzmdVar, 1);
        this.zzaa = zzmdVarZzao;
        zzmd zzmdVarZzh = zzmdVarZzao.zzh(zzmdVarZzao.zzb);
        this.zzaa = zzmdVarZzh;
        zzmdVarZzh.zzq = zzmdVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zzmxVar.zzy();
        Surface surface = this.zzO;
        if (surface != null) {
            surface.release();
            this.zzO = null;
        }
        int i10 = zzcz.zza;
        this.zzX = true;
    }

    @Nullable
    public final zziw zzI() {
        zzav();
        return this.zzaa.zzf;
    }

    public final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    public final /* synthetic */ void zzK(final zzlc zzlcVar) {
        this.zzk.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzlcVar);
            }
        });
    }

    public final /* synthetic */ void zzL(int i10, final int i11) {
        zzav();
        Integer numValueOf = Integer.valueOf(i11);
        zzaw(1, 10, numValueOf);
        zzaw(2, 10, numValueOf);
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzks.zzd;
                ((zzaz) obj).zzq(i11);
            }
        };
        zzed zzedVar = this.zzn;
        zzedVar.zzd(21, zzdyVar);
        zzedVar.zze();
    }

    public final /* synthetic */ void zzM() {
        String str = zzfj.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(iGenerateAudioSessionId));
    }

    public final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzL);
    }

    public final /* synthetic */ void zzO(zzlc zzlcVar) {
        int i10;
        long j10;
        boolean z10;
        int i11 = this.zzF - zzlcVar.zzb;
        this.zzF = i11;
        boolean z11 = true;
        if (zzlcVar.zzc) {
            this.zzG = zzlcVar.zzd;
            this.zzH = true;
        }
        if (i11 == 0) {
            zzbf zzbfVar = zzlcVar.zza.zza;
            int iZzs = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzmj) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgrc.zzi(size == list.size());
                for (int i12 = 0; i12 < listZzw.size(); i12++) {
                    ((zzko) list.get(i12)).zzc((zzbf) listZzw.get(i12));
                }
            }
            boolean z12 = this.zzH;
            long j11 = C.TIME_UNSET;
            if (z12) {
                boolean z13 = zzlcVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzlcVar.zza.zzb.equals(this.zzaa.zzb);
                long j12 = zzlcVar.zza.zzd;
                long j13 = this.zzaa.zzs;
                if (z13 || (zEquals && j12 == j13)) {
                    z11 = false;
                }
                if (z11) {
                    iZzs = zzs();
                    if (zzbfVar.zzg() || zzlcVar.zza.zzb.zzb()) {
                        j11 = zzlcVar.zza.zzd;
                    } else {
                        zzmd zzmdVar = zzlcVar.zza;
                        zzwk zzwkVar = zzmdVar.zzb;
                        long j14 = zzmdVar.zzd;
                        zzaq(zzbfVar, zzwkVar, j14);
                        j11 = j14;
                    }
                }
                z10 = z11;
                long j15 = j11;
                i10 = iZzs;
                j10 = j15;
            } else {
                i10 = -1;
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzH = false;
            zzal(zzlcVar.zza, 1, z10, this.zzG, j10, i10, false);
        }
    }

    public final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzas(surface);
        this.zzO = surface;
    }

    public final /* synthetic */ void zzR(Object obj) {
        zzas(null);
    }

    public final /* synthetic */ void zzT(int i10, int i11, Object obj) {
        zzaw(1, 19, obj);
    }

    public final /* synthetic */ zzed zzV() {
        return this.zzn;
    }

    public final /* synthetic */ zzmx zzW() {
        return this.zzs;
    }

    public final /* synthetic */ Looper zzX() {
        return this.zzt;
    }

    public final /* synthetic */ zzdn zzY() {
        return this.zzv;
    }

    public final /* synthetic */ zzdm zzZ() {
        return this.zzB;
    }

    public final /* synthetic */ Map zzaa() {
        return this.zzE;
    }

    public final /* synthetic */ Object zzab() {
        return this.zzN;
    }

    public final /* synthetic */ boolean zzac() {
        return this.zzT;
    }

    public final /* synthetic */ void zzad(boolean z10) {
        this.zzT = z10;
    }

    public final /* synthetic */ boolean zzae() {
        return this.zzX;
    }

    public final /* synthetic */ zzil zzaf() {
        return this.zzY;
    }

    public final /* synthetic */ void zzag(zzil zzilVar) {
        this.zzY = zzilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    public final void zzc(int i10, long j10, int i11, boolean z10) {
        zzav();
        if (i10 == -1) {
            return;
        }
        zzgrc.zza(i10 >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i10 < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzF++;
            if (zzx()) {
                zzee.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlc zzlcVar = new zzlc(this.zzaa);
                zzlcVar.zza(1);
                this.zzl.zza(zzlcVar);
                return;
            }
            zzmd zzmdVarZzao = this.zzaa;
            int i12 = zzmdVarZzao.zze;
            if (i12 == 3 || (i12 == 4 && !zzbfVar.zzg())) {
                zzmdVarZzao = zzao(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzmd zzmdVarZzan = zzan(zzmdVarZzao, zzbfVar, zzap(zzbfVar, i10, j10));
            this.zzm.zzf(zzbfVar, i10, zzfj.zzq(j10));
            zzal(zzmdVarZzan, 0, true, 1, zzak(zzmdVarZzan), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzb(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzav();
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzav();
        zzmd zzmdVar = this.zzaa;
        if (zzmdVar.zze != 1) {
            return;
        }
        zzmd zzmdVarZzf = zzmdVar.zzf(null);
        zzmd zzmdVarZzao = zzao(zzmdVarZzf, true != zzmdVarZzf.zza.zzg() ? 2 : 4);
        this.zzF++;
        this.zzm.zzd();
        zzal(zzmdVarZzao, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzav();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzav();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z10) {
        zzav();
        zzmd zzmdVar = this.zzaa;
        int i10 = zzmdVar.zzn;
        int i11 = 0;
        if (i10 == 1) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 1;
                i11 = 1;
            }
        }
        if (zzmdVar.zzl == z10 && i10 == i11 && zzmdVar.zzm == 1) {
            return;
        }
        this.zzF++;
        zzmd zzmdVarZzi = zzmdVar.zzi(z10, 1, i11);
        this.zzm.zze(z10, 1, i11);
        zzal(zzmdVarZzi, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzav();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzav();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzav();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzav();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzav();
        zzP(null);
        new zzcz(zzguf.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzav();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzav();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzav();
        if (!this.zzaa.zza.zzg()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zza.zze(zzmdVar.zzb.zza);
        }
        int i10 = this.zzab;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzav();
        int iZzai = zzai(this.zzaa);
        if (iZzai == -1) {
            return 0;
        }
        return iZzai;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzav();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            return zzbfVarZzq.zzg() ? C.TIME_UNSET : zzfj.zzp(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmd zzmdVar = this.zzaa;
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfj.zzp(zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzav();
        return zzfj.zzp(zzak(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzav();
        if (zzx()) {
            zzmd zzmdVar = this.zzaa;
            return zzmdVar.zzk.equals(zzmdVar.zzb) ? zzfj.zzp(this.zzaa.zzq) : zzt();
        }
        zzav();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmd zzmdVar2 = this.zzaa;
        long j10 = 0;
        if (zzmdVar2.zzk.zzd != zzmdVar2.zzb.zzd) {
            return zzfj.zzp(zzmdVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j11 = zzmdVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmd zzmdVar3 = this.zzaa;
            zzmdVar3.zza.zzo(zzmdVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzmd zzmdVar4 = this.zzaa;
        zzaq(zzmdVar4.zza, zzmdVar4.zzk, j10);
        return zzfj.zzp(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzav();
        return zzfj.zzp(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzav();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzav();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }
}
