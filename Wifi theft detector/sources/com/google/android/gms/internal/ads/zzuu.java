package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.xbill.DNS.Flags;

/* loaded from: classes2.dex */
public abstract class zzuu extends zzij {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Flags.CD, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;

    @Nullable
    private ArrayDeque zzB;

    @Nullable
    private zzuq zzC;

    @Nullable
    private zzun zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private boolean zzL;
    private long zzM;
    private int zzN;
    private int zzO;

    @Nullable
    private ByteBuffer zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    protected zzin zza;
    private boolean zzaa;
    private boolean zzab;
    private long zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private zzut zzag;
    private long zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private long zzal;
    private final zzui zzc;
    private final zzuw zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zzub zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zztb zzl;
    private final AtomicInteger zzm;

    @Nullable
    private zzv zzn;
    private zzv zzo;

    @Nullable
    private zzth zzp;

    @Nullable
    private zzth zzq;
    private zzmk zzr;

    @Nullable
    private MediaCrypto zzs;
    private long zzt;
    private float zzu;
    private float zzv;

    @Nullable
    private zzuk zzw;

    @Nullable
    private zzv zzx;

    @Nullable
    private MediaFormat zzy;
    private boolean zzz;

    public zzuu(int i10, zzui zzuiVar, zzuw zzuwVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzuiVar;
        zzuwVar.getClass();
        this.zzd = zzuwVar;
        this.zze = f10;
        this.zzm = new AtomicInteger();
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zzub zzubVar = new zzub();
        this.zzi = zzubVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = C.TIME_UNSET;
        this.zzk = new ArrayDeque();
        this.zzag = zzut.zza;
        zzubVar.zzj(0);
        zzubVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zztb();
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzW = 0;
        this.zzN = -1;
        this.zzO = -1;
        this.zzM = C.TIME_UNSET;
        this.zzac = C.TIME_UNSET;
        this.zzah = C.TIME_UNSET;
        this.zzK = C.TIME_UNSET;
        this.zzX = 0;
        this.zzY = 0;
        this.zza = new zzin();
        this.zzak = false;
        this.zzal = 0L;
    }

    private final void zzao() {
        this.zzS = false;
        zzat();
    }

    private final void zzat() {
        zzaw();
        this.zzU = false;
        this.zzi.zza();
        this.zzh.zza();
        this.zzT = false;
        this.zzl.zzb();
    }

    private final boolean zzau() {
        if (this.zzw == null) {
            return false;
        }
        if (zzaK()) {
            zzaI();
            return true;
        }
        if (zzaL()) {
            zzav();
            return false;
        }
        this.zzak = true;
        return false;
    }

    private final void zzav() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar == null) {
                throw null;
            }
            zzukVar.zzk();
        } finally {
            zzaN();
        }
    }

    private final void zzaw() {
        this.zzac = C.TIME_UNSET;
        zzbo().zzf = C.TIME_UNSET;
        this.zzah = C.TIME_UNSET;
    }

    private final boolean zzax(int i10) throws zziw, zzuq {
        zzlh zzlhVarZzH = zzH();
        zzih zzihVar = this.zzf;
        zzihVar.zza();
        int iZzO = zzO(zzlhVarZzH, zzihVar, i10 | 4);
        if (iZzO == -5) {
            zzam(zzlhVarZzH);
            return true;
        }
        if (iZzO != -4 || !zzihVar.zzb()) {
            return false;
        }
        this.zzad = true;
        zzbm();
        return false;
    }

    private final boolean zzay(long j10) {
        return this.zzt == C.TIME_UNSET || zzL().zzb() - j10 < this.zzt;
    }

    public static boolean zzbd(zzv zzvVar) {
        return zzvVar.zzN == 0;
    }

    private final boolean zzbg() {
        return this.zzO >= 0;
    }

    private final void zzbh() {
        this.zzN = -1;
        this.zzg.zzc = null;
    }

    private final void zzbi() {
        this.zzO = -1;
        this.zzP = null;
    }

    private final boolean zzbj(@Nullable zzv zzvVar) throws zziw, zzuq {
        if (this.zzw != null && this.zzY != 3 && zze() != 0) {
            float f10 = this.zzv;
            zzvVar.getClass();
            float fZzai = zzai(f10, zzvVar, zzI());
            float f11 = this.zzA;
            if (f11 != fZzai) {
                if (fZzai == -1.0f) {
                    zzbl();
                    return false;
                }
                if (f11 != -1.0f || fZzai > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzai);
                    zzuk zzukVar = this.zzw;
                    zzukVar.getClass();
                    zzukVar.zzp(bundle);
                    this.zzA = fZzai;
                }
            }
        }
        return true;
    }

    private final boolean zzbk() throws zziw {
        if (this.zzZ) {
            this.zzX = 1;
            if (this.zzG) {
                this.zzY = 3;
                return false;
            }
            this.zzY = 2;
        } else {
            zzbp();
        }
        return true;
    }

    private final void zzbl() throws zziw, zzuq {
        if (this.zzZ) {
            this.zzX = 1;
            this.zzY = 3;
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbm() throws zziw, zzuq {
        int i10 = this.zzY;
        if (i10 == 1) {
            zzav();
            return;
        }
        if (i10 == 2) {
            zzav();
            zzbp();
        } else if (i10 != 3) {
            this.zzae = true;
            zzar();
        } else {
            zzaI();
            zzaA();
        }
    }

    private final void zzbn(zzut zzutVar) {
        this.zzag = zzutVar;
        if (zzutVar.zzd != C.TIME_UNSET) {
            this.zzai = true;
        }
    }

    private final zzut zzbo() {
        ArrayDeque arrayDeque = this.zzk;
        return !arrayDeque.isEmpty() ? (zzut) arrayDeque.getLast() : this.zzag;
    }

    private final void zzbp() throws zziw {
        zzth zzthVar = this.zzq;
        zzthVar.getClass();
        this.zzp = zzthVar;
        this.zzX = 0;
        this.zzY = 0;
    }

    private final boolean zzbq(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzv zzvVar = this.zzo;
        return (zzvVar != null && Objects.equals(zzvVar.zzo, MimeTypes.AUDIO_OPUS) && zzafu.zzf(j10, j11)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzA(long j10, boolean z10, boolean z11) throws zziw, zzuq {
        ArrayDeque arrayDeque = this.zzk;
        if (!arrayDeque.isEmpty()) {
            this.zzag = (zzut) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.zzad = false;
            this.zzae = false;
            if (this.zzS) {
                zzat();
            } else {
                zzaJ();
            }
            zzff zzffVar = this.zzag.zze;
            if (zzffVar.zzc() > 0) {
                this.zzaf = true;
            }
            zzffVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzD() {
        this.zzn = null;
        zzbn(zzut.zza);
        this.zzk.clear();
        if (this.zzS) {
            zzao();
        } else {
            zzau();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzE() {
        try {
            zzao();
            zzaI();
        } finally {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public final long zzT(long j10, long j11) {
        return zzah(j10, j11, this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzml
    public void zzV(float f10, float f11) throws zziw, zzuq {
        this.zzu = f10;
        this.zzv = f11;
        zzbj(this.zzx);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:128|129|(12:390|131|(2:133|(2:135|(6:137|(1:146)(1:143)|144|145|227|(2:402|229)(1:230))(2:396|147))(6:395|148|(1:154)|155|(1:159)|160))(2:162|(4:164|145|227|(0)(0))(2:167|(7:172|(1:174)|175|(1:181)|(1:183)(2:184|(0))|188|(1:190)(2:398|191))(2:397|171)))|358|(2:361|(1:379))|365|(1:370)(1:369)|(1:372)|373|(1:375)(1:376)|377|378)(1:192)|193|(1:197)(1:198)|199|(1:204)(1:203)|205|206|388|207|(3:209|210|(5:212|(1:214)(1:215)|(1:221)|222|(2:401|224)(3:226|227|(0)(0)))(1:400))(3:399|349|350)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026a, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x035d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0372, code lost:
    
        r4 = r21.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0374, code lost:
    
        if (r4 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0379, code lost:
    
        if (r21.zzX == 2) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x037d, code lost:
    
        if (r21.zzad == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0385, code lost:
    
        if (r21.zzN >= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0387, code lost:
    
        r0 = r4.zze();
        r21.zzN = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x038d, code lost:
    
        if (r0 < 0) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x038f, code lost:
    
        r5 = r21.zzg;
        r5.zzc = r4.zzh(r0);
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x039c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x039d, code lost:
    
        if (r21.zzX != 1) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03a1, code lost:
    
        if (r21.zzJ != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x03a3, code lost:
    
        r21.zzaa = true;
        r4.zza(r21.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03b7, code lost:
    
        r21.zzX = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03be, code lost:
    
        if (r21.zzH == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03c1, code lost:
    
        r21.zzH = false;
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03c7, code lost:
    
        if (r0 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03c9, code lost:
    
        r0.put(com.google.android.gms.internal.ads.zzuu.zzb);
        r4.zza(r21.zzN, 0, 38, 0, 0);
        zzbh();
        r21.zzZ = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03e6, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03ea, code lost:
    
        if (r21.zzW != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03ec, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03ed, code lost:
    
        r5 = r21.zzx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03ef, code lost:
    
        if (r5 == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03f7, code lost:
    
        if (r0 >= r5.zzr.size()) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x03f9, code lost:
    
        r5 = (byte[]) r21.zzx.zzr.get(r0);
        r6 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0407, code lost:
    
        if (r6 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0409, code lost:
    
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x040f, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0410, code lost:
    
        r21.zzW = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0413, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0414, code lost:
    
        r0 = r21.zzg.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0418, code lost:
    
        if (r0 == null) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x041a, code lost:
    
        r0 = r0.position();
        r5 = zzH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0422, code lost:
    
        r4.zzi(new com.google.android.gms.internal.ads.zzur(r21, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x042a, code lost:
    
        r6 = r21.zzm.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0431, code lost:
    
        if (r6 != (-3)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0437, code lost:
    
        if (zzcW() == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0439, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0444, code lost:
    
        if (r6 != (-5)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0448, code lost:
    
        if (r21.zzW != 2) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x044a, code lost:
    
        r21.zzg.zza();
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0451, code lost:
    
        zzam(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0456, code lost:
    
        r5 = r21.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x045c, code lost:
    
        if (r5.zzb() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x045e, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0468, code lost:
    
        if (r21.zzW != 2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x046a, code lost:
    
        r5.zza();
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x046f, code lost:
    
        r21.zzad = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0473, code lost:
    
        if (r21.zzZ != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0475, code lost:
    
        zzbm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x047c, code lost:
    
        if (r21.zzJ != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x047e, code lost:
    
        r21.zzaa = true;
        r4.zza(r21.zzN, 0, 0, 0, 4);
        zzbh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0492, code lost:
    
        if (r21.zzZ != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0498, code lost:
    
        if (r5.zzc() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x049a, code lost:
    
        r5.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x049f, code lost:
    
        if (r21.zzW != 2) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x04a1, code lost:
    
        r21.zzW = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x04a5, code lost:
    
        r6 = r5.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x04ab, code lost:
    
        if (zzaT(r5) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04ad, code lost:
    
        r8 = r5.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04b1, code lost:
    
        if (r8 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04b3, code lost:
    
        r5.zzb.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x04ba, code lost:
    
        if (r21.zzaf == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x04bc, code lost:
    
        r0 = zzbo().zze;
        r9 = r21.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x04c4, code lost:
    
        if (r9 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x04c6, code lost:
    
        r0.zza(r6, r9);
        r21.zzaf = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x04cc, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x04cd, code lost:
    
        r21.zzac = java.lang.Math.max(r21.zzac, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x04d9, code lost:
    
        if (zzcW() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04df, code lost:
    
        if (r5.zzd() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x04e1, code lost:
    
        zzbo().zzf = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x04e9, code lost:
    
        r5.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x04f0, code lost:
    
        if (r5.zze() == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x04f2, code lost:
    
        zzas(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x04f7, code lost:
    
        if (r21.zzak == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04f9, code lost:
    
        r9 = r21.zzac;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x04fd, code lost:
    
        if (r6 > r9) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x04ff, code lost:
    
        r21.zzal += (r9 - r6) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0509, code lost:
    
        r21.zzac = r6;
        r21.zzak = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x050d, code lost:
    
        zzaR(r5);
        r10 = zzaS(r5);
        r6 = r6 + r21.zzal;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0517, code lost:
    
        if (r8 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0519, code lost:
    
        r4.zzb(r21.zzN, 0, r5.zzb, r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0524, code lost:
    
        r0 = r21.zzN;
        r5 = r5.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0529, code lost:
    
        if (r5 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x052b, code lost:
    
        r4.zza(r0, 0, r5.limit(), r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0534, code lost:
    
        zzbh();
        r21.zzZ = true;
        r21.zzW = 0;
        r21.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0543, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0544, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0545, code lost:
    
        zzal(r0);
        zzax(0);
        zzav();
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0556, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x055f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0560, code lost:
    
        r12 = r5;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0369 A[LOOP:0: B:126:0x01fa->B:230:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // com.google.android.gms.internal.ads.zzml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzX(long r22, long r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzX(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzml
    public boolean zzZ() {
        return this.zzae;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01dd A[Catch: Exception -> 0x0107, TryCatch #5 {Exception -> 0x0107, blocks: (B:59:0x00e1, B:61:0x00e7, B:63:0x00fb, B:69:0x0139, B:71:0x014b, B:73:0x0167, B:75:0x016f, B:77:0x0177, B:79:0x0181, B:81:0x0189, B:83:0x0191, B:103:0x01d7, B:105:0x01dd, B:109:0x01ea, B:111:0x01f0, B:115:0x01fd, B:117:0x0203, B:142:0x025c, B:144:0x0262, B:146:0x0268, B:147:0x0276, B:122:0x0211, B:124:0x0219, B:126:0x0221, B:128:0x0229, B:130:0x0231, B:132:0x0239, B:134:0x0241, B:136:0x024b, B:138:0x0255, B:88:0x019f, B:90:0x01a7, B:94:0x01b3, B:96:0x01bd, B:98:0x01c5, B:100:0x01cd), top: B:194:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0262 A[Catch: Exception -> 0x0107, TryCatch #5 {Exception -> 0x0107, blocks: (B:59:0x00e1, B:61:0x00e7, B:63:0x00fb, B:69:0x0139, B:71:0x014b, B:73:0x0167, B:75:0x016f, B:77:0x0177, B:79:0x0181, B:81:0x0189, B:83:0x0191, B:103:0x01d7, B:105:0x01dd, B:109:0x01ea, B:111:0x01f0, B:115:0x01fd, B:117:0x0203, B:142:0x025c, B:144:0x0262, B:146:0x0268, B:147:0x0276, B:122:0x0211, B:124:0x0219, B:126:0x0221, B:128:0x0229, B:130:0x0231, B:132:0x0239, B:134:0x0241, B:136:0x024b, B:138:0x0255, B:88:0x019f, B:90:0x01a7, B:94:0x01b3, B:96:0x01bd, B:98:0x01c5, B:100:0x01cd), top: B:194:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c9 A[Catch: zzuq -> 0x0082, TryCatch #6 {zzuq -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:164:0x02af, B:166:0x02c9, B:168:0x02d2, B:171:0x02dc, B:172:0x02de, B:167:0x02cc, B:174:0x02e0, B:175:0x02e1, B:177:0x02e6, B:178:0x02e7, B:179:0x02f1, B:38:0x008a, B:39:0x0092, B:181:0x02f4), top: B:196:0x0055, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02cc A[Catch: zzuq -> 0x0082, TryCatch #6 {zzuq -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:164:0x02af, B:166:0x02c9, B:168:0x02d2, B:171:0x02dc, B:172:0x02de, B:167:0x02cc, B:174:0x02e0, B:175:0x02e1, B:177:0x02e6, B:178:0x02e7, B:179:0x02f1, B:38:0x008a, B:39:0x0092, B:181:0x02f4), top: B:196:0x0055, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b0  */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.google.android.gms.internal.ads.zzui] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.google.android.gms.internal.ads.zzuh] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzuu] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaA() throws com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzuq {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzaA():void");
    }

    public final boolean zzaB(zzv zzvVar) {
        return this.zzq == null && zzae(zzvVar);
    }

    public boolean zzaC(zzun zzunVar) {
        return true;
    }

    public final boolean zzaD() {
        return this.zzS;
    }

    @Nullable
    public final zzuk zzaE() {
        return this.zzw;
    }

    @Nullable
    public final zzv zzaF() {
        return this.zzx;
    }

    @Nullable
    public final MediaFormat zzaG() {
        return this.zzy;
    }

    @Nullable
    public final zzun zzaH() {
        return this.zzD;
    }

    public final void zzaI() {
        try {
            zzuk zzukVar = this.zzw;
            if (zzukVar != null) {
                zzukVar.zzl();
                this.zza.zzb++;
                zzun zzunVar = this.zzD;
                if (zzunVar == null) {
                    throw null;
                }
                zzak(zzunVar.zza);
            }
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
        } catch (Throwable th) {
            this.zzw = null;
            this.zzs = null;
            this.zzp = null;
            zzaO();
            throw th;
        }
    }

    public final boolean zzaJ() throws zziw, zzuq {
        boolean zZzau = zzau();
        if (zZzau) {
            zzaA();
        }
        return zZzau;
    }

    public boolean zzaK() {
        int i10 = this.zzY;
        if (i10 == 3 || ((this.zzF && !this.zzab) || (this.zzG && this.zzaa))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            zzbp();
            return false;
        } catch (zziw e10) {
            zzee.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    public boolean zzaL() {
        return true;
    }

    public final long zzaM() {
        return this.zzal;
    }

    @CallSuper
    public void zzaN() {
        zzbh();
        zzbi();
        zzaw();
        this.zzM = C.TIME_UNSET;
        this.zzaa = false;
        this.zzK = C.TIME_UNSET;
        this.zzZ = false;
        this.zzH = false;
        this.zzI = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzX = 0;
        this.zzY = 0;
        this.zzW = this.zzV ? 1 : 0;
        this.zzak = false;
        this.zzal = 0L;
    }

    @CallSuper
    public final void zzaO() {
        zzaN();
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzab = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzJ = false;
        this.zzL = false;
        this.zzV = false;
        this.zzW = 0;
    }

    public zzum zzaP(Throwable th, @Nullable zzun zzunVar) {
        return new zzum(th, zzunVar);
    }

    public boolean zzaQ(zzv zzvVar) throws zziw {
        return true;
    }

    public void zzaR(zzih zzihVar) throws zziw {
    }

    public int zzaS(zzih zzihVar) {
        return 0;
    }

    public boolean zzaT(zzih zzihVar) {
        return false;
    }

    public final long zzaU() {
        return this.zzah;
    }

    @CallSuper
    public void zzaV(long j10) {
        this.zzah = j10;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j10 < ((zzut) arrayDeque.peek()).zzb) {
                return;
            }
            zzut zzutVar = (zzut) arrayDeque.poll();
            zzutVar.getClass();
            zzbn(zzutVar);
            zzap();
        }
    }

    public final boolean zzaW() {
        if (this.zzn == null) {
            return false;
        }
        if (zzQ() || zzbg()) {
            return true;
        }
        return this.zzM != C.TIME_UNSET && zzL().zzb() < this.zzM;
    }

    public final float zzaX() {
        return this.zzu;
    }

    @Nullable
    public final zzmk zzaY() {
        return this.zzr;
    }

    public final boolean zzaZ() throws zziw {
        return zzbj(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzab(zzv zzvVar) throws zziw {
        try {
            return zzac(this.zzd, zzvVar);
        } catch (zzuy e10) {
            throw zzN(e10, zzvVar, false, 4002);
        }
    }

    public abstract int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy;

    public abstract List zzad(zzuw zzuwVar, zzv zzvVar, boolean z10) throws zzuy;

    public boolean zzae(zzv zzvVar) {
        return false;
    }

    public abstract zzuh zzaf(zzun zzunVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f10);

    public zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    public long zzah(long j10, long j11, boolean z10) {
        return super.zzT(j10, j11);
    }

    public float zzai(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    public void zzaj(String str, zzuh zzuhVar, long j10, long j11) {
        throw null;
    }

    public void zzak(String str) {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzio zzam(com.google.android.gms.internal.ads.zzlh r14) throws com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzuq {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzam(com.google.android.gms.internal.ads.zzlh):com.google.android.gms.internal.ads.zzio");
    }

    public void zzan(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zziw {
        throw null;
    }

    public void zzap() {
    }

    public abstract boolean zzaq(long j10, long j11, @Nullable zzuk zzukVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) throws zziw;

    public void zzar() throws zziw {
        throw null;
    }

    public void zzas(zzih zzihVar) throws zziw {
        throw null;
    }

    public final void zzaz() {
        this.zzaj = true;
    }

    public final long zzba() {
        return this.zzag.zzf;
    }

    public final long zzbb() {
        return this.zzag.zzd;
    }

    public final long zzbc() {
        return this.zzag.zzc;
    }

    public final /* synthetic */ void zzbe(zzlh zzlhVar) {
        this.zzm.set(zzO(zzlhVar, this.zzg, 0));
    }

    public final /* synthetic */ zzmk zzbf() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmn
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzij, com.google.android.gms.internal.ads.zzmg
    public void zzx(int i10, @Nullable Object obj) throws zziw {
        if (i10 == 11) {
            zzmk zzmkVar = (zzmk) obj;
            zzmkVar.getClass();
            this.zzr = zzmkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzij
    public void zzy(boolean z10, boolean z11) throws zziw {
        this.zza = new zzin();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzz(com.google.android.gms.internal.ads.zzv[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzwk r17) throws com.google.android.gms.internal.ads.zziw {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzut r12 = r11.zzag
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zzut r4 = new com.google.android.gms.internal.ads.zzut
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbn(r4)
            boolean r12 = r11.zzaj
            if (r12 == 0) goto L56
            r11.zzap()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzac
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzah
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zzut r4 = new com.google.android.gms.internal.ads.zzut
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbn(r4)
            com.google.android.gms.internal.ads.zzut r12 = r11.zzag
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzap()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zzut r0 = new com.google.android.gms.internal.ads.zzut
            long r1 = r11.zzac
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzwk):void");
    }
}
