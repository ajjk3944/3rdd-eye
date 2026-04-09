package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaba extends zztp implements zzabq {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private int zzC;
    private zzmh zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private long zzH;
    private zzcd zzI;
    private zzcd zzJ;
    private int zzK;
    private int zzL;
    private zzabo zzM;
    private long zzN;
    private long zzO;
    private boolean zzP;
    private boolean zzQ;
    private int zzR;
    private final Context zze;
    private final boolean zzf;
    private final zzach zzg;
    private final boolean zzh;
    private final zzabr zzi;
    private final zzabp zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaaz zzm;
    private boolean zzn;
    private boolean zzo;
    private zzacn zzp;
    private boolean zzq;
    private int zzr;
    private List zzs;
    private Surface zzt;
    private zzabd zzu;
    private zzeo zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzaba(zzaay zzaayVar) {
        super(2, zzaayVar.zzd, zzaayVar.zzc, false, 30.0f);
        Context applicationContext = zzaayVar.zza.getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        this.zzg = new zzach(zzaayVar.zze, zzaayVar.zzf);
        this.zzf = this.zzp == null;
        this.zzi = new zzabr(applicationContext, this, 0L);
        this.zzj = new zzabp();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzv = zzeo.zza;
        this.zzx = 1;
        this.zzy = 0;
        this.zzI = zzcd.zza;
        this.zzL = 0;
        this.zzJ = null;
        this.zzK = -1000;
        this.zzN = -9223372036854775807L;
        this.zzO = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
        this.zzD = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzad(com.google.android.gms.internal.ads.zzti r11, com.google.android.gms.internal.ads.zzz r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzad(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzz):int");
    }

    public static int zzae(zzti zztiVar, zzz zzzVar) {
        int i = zzzVar.zzp;
        if (i == -1) {
            return zzad(zztiVar, zzzVar);
        }
        List list = zzzVar.zzr;
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzba(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaba.zzba(java.lang.String):boolean");
    }

    public static final boolean zzbb(zzti zztiVar) {
        return Build.VERSION.SDK_INT >= 35 && zztiVar.zzh;
    }

    private final Surface zzbc(zzti zztiVar) {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            return zzacnVar.zzb();
        }
        Surface surface = this.zzt;
        if (surface != null) {
            return surface;
        }
        if (zzbb(zztiVar)) {
            return null;
        }
        zzdd.zzf(zzaZ(zztiVar));
        zzabd zzabdVar = this.zzu;
        if (zzabdVar != null) {
            if (zzabdVar.zza != zztiVar.zzf) {
                zzbh();
            }
        }
        if (this.zzu == null) {
            this.zzu = zzabd.zza(this.zze, zztiVar.zzf);
        }
        return this.zzu;
    }

    private static List zzbd(Context context, zztr zztrVar, zzz zzzVar, boolean z10, boolean z11) throws zztw {
        String str = zzzVar.zzo;
        if (str == null) {
            return zzfyf.zzn();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            List listZzc = zzuc.zzc(zztrVar, zzzVar, z10, z11);
            if (!listZzc.isEmpty()) {
                return listZzc;
            }
        }
        return zzuc.zze(zztrVar, zzzVar, z10, z11);
    }

    private final void zzbe() {
        zzcd zzcdVar = this.zzJ;
        if (zzcdVar != null) {
            this.zzg.zzt(zzcdVar);
        }
    }

    private final void zzbf(long j4, long j10, zzz zzzVar) {
        zzabo zzaboVar = this.zzM;
        if (zzaboVar != null) {
            zzaboVar.zzcT(j4, j10, zzzVar, zzay());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbg() {
        this.zzg.zzq(this.zzt);
        this.zzw = true;
    }

    private final void zzbh() {
        zzabd zzabdVar = this.zzu;
        if (zzabdVar != null) {
            zzabdVar.release();
            this.zzu = null;
        }
    }

    private final void zzbi(Object obj) throws Throwable {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzt == surface) {
            if (surface != null) {
                zzbe();
                Surface surface2 = this.zzt;
                if (surface2 == null || !this.zzw) {
                    return;
                }
                this.zzg.zzq(surface2);
                return;
            }
            return;
        }
        this.zzt = surface;
        if (this.zzp == null) {
            this.zzi.zzk(surface);
        }
        this.zzw = false;
        int iZzcU = zzcU();
        zztf zztfVarZzaB = zzaB();
        if (zztfVarZzaB != null && this.zzp == null) {
            zzti zztiVarZzaD = zzaD();
            zztiVarZzaD.getClass();
            if (!zzbj(zztiVarZzaD) || this.zzn) {
                zzaI();
                zzaF();
            } else {
                Surface surfaceZzbc = zzbc(zztiVarZzaD);
                if (surfaceZzbc != null) {
                    zztfVarZzaB.zzp(surfaceZzbc);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zztfVarZzaB.zzi();
                }
            }
        }
        if (surface != null) {
            zzbe();
        } else {
            this.zzJ = null;
            zzacn zzacnVar = this.zzp;
            if (zzacnVar != null) {
                zzacnVar.zzi();
            }
        }
        if (iZzcU == 2) {
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzk(true);
            } else {
                this.zzi.zzc(true);
            }
        }
    }

    private final boolean zzbj(zzti zztiVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzt;
        return (surface != null && surface.isValid()) || zzbb(zztiVar) || zzaZ(zztiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzA() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || !this.zzf) {
            return;
        }
        zzacnVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzq = false;
            this.zzN = -9223372036854775807L;
            zzbh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzD() {
        this.zzA = 0;
        this.zzz = zzi().zzb();
        this.zzF = 0L;
        this.zzG = 0;
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzx();
        } else {
            this.zzi.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public final void zzE() {
        if (this.zzA > 0) {
            long jZzb = zzi().zzb();
            this.zzg.zzn(this.zzA, jZzb - this.zzz);
            this.zzA = 0;
            this.zzz = jZzb;
        }
        int i = this.zzG;
        if (i != 0) {
            this.zzg.zzr(this.zzF, i);
            this.zzF = 0L;
            this.zzG = 0;
        }
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzy();
        } else {
            this.zzi.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzF(zzz[] zzzVarArr, long j4, long j10, zzvh zzvhVar) throws zzin {
        super.zzF(zzzVarArr, j4, j10, zzvhVar);
        zzbl zzblVarZzh = zzh();
        if (zzblVarZzh.zzo()) {
            this.zzO = -9223372036854775807L;
        } else {
            this.zzO = zzblVarZzh.zzn(zzvhVar.zza, new zzbj()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final void zzM(float f10, float f11) throws Throwable {
        super.zzM(f10, f11);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzt(f10);
        } else {
            this.zzi.zzl(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzma, com.google.android.gms.internal.ads.zzmd
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final void zzV(long j4, long j10) throws Throwable {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            try {
                zzacnVar.zzo(j4, j10);
            } catch (zzacm e4) {
                throw zzcX(e4, e4.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzV(j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzW() {
        if (!super.zzW()) {
            return false;
        }
        zzacn zzacnVar = this.zzp;
        return zzacnVar == null || zzacnVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzma
    public final boolean zzX() {
        boolean zZzX = super.zzX();
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            return zzacnVar.zzD(zZzX);
        }
        if (zZzX && zzaB() == null) {
            return true;
        }
        return this.zzi.zzm(zZzX);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        zzti zztiVarZzaD;
        float fMax = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f11 = zzzVar2.zzz;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.zzD == null || (zztiVarZzaD = zzaD()) == null) {
            return f12;
        }
        float fZza = zztiVarZzaD.zza(zzzVar.zzv, zzzVar.zzw);
        return f12 != -1.0f ? Math.max(f12, fZza) : fZza;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzth zzaC(Throwable th, zzti zztiVar) {
        return new zzaau(th, zztiVar, this.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaG(long j4) {
        super.zzaG(j4);
        this.zzC--;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaH(zzhs zzhsVar) throws zzin {
        this.zzR = 0;
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaJ() {
        super.zzaJ();
        this.zzl.clear();
        this.zzQ = false;
        this.zzC = 0;
        this.zzR = 0;
        this.zzE = false;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaP(zzz zzzVar) throws zzin {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || zzacnVar.zzC()) {
            return true;
        }
        try {
            zzacnVar.zzA(zzzVar);
            return true;
        } catch (zzacm e4) {
            throw zzcX(e4, zzzVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaQ(zzhs zzhsVar) {
        if (!zzQ() && !zzhsVar.zzh() && this.zzO != -9223372036854775807L) {
            if (this.zzO - (zzhsVar.zze - zzaw()) > 100000) {
                boolean z10 = zzhsVar.zze < zzf();
                if ((z10 || this.zzQ) && !zzhsVar.zze() && zzhsVar.zzi()) {
                    zzhsVar.zzb();
                    if (z10) {
                        ((zztp) this).zza.zzd++;
                    } else if (this.zzQ) {
                        this.zzl.add(Long.valueOf(zzhsVar.zze));
                        this.zzR++;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaR() {
        return this.zzD == null || this.zzE || zzaM() || zzav() != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaS(zzti zztiVar) {
        return zzbj(zztiVar);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzaT() {
        zzti zztiVarZzaD = zzaD();
        if (this.zzp != null && zztiVarZzaD != null) {
            String str = zztiVarZzaD.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaT();
    }

    public final void zzaW(int i, int i10) {
        zzid zzidVar = ((zztp) this).zza;
        zzidVar.zzh += i;
        int i11 = i + i10;
        zzidVar.zzg += i11;
        this.zzA += i11;
        int i12 = this.zzB + i11;
        this.zzB = i12;
        zzidVar.zzi = Math.max(i12, zzidVar.zzi);
    }

    public final void zzaX(long j4) {
        zzid zzidVar = ((zztp) this).zza;
        zzidVar.zzk += j4;
        zzidVar.zzl++;
        this.zzF += j4;
        this.zzG++;
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final boolean zzaY(long j4, long j10, long j11, boolean z10, boolean z11) throws Throwable {
        int iZzd;
        if (this.zzp != null && this.zzf) {
            j10 -= -this.zzN;
        }
        long j12 = this.zzk;
        if (j12 != -9223372036854775807L) {
            this.zzQ = j10 > zzf() + 200000 && j4 < j12;
        }
        if (j4 >= -500000 || z10 || (iZzd = zzd(j10)) == 0) {
            return false;
        }
        if (z11) {
            zzid zzidVar = ((zztp) this).zza;
            int i = zzidVar.zzd + iZzd;
            zzidVar.zzd = i;
            zzidVar.zzf += this.zzC;
            zzidVar.zzd = this.zzl.size() + i;
        } else {
            ((zztp) this).zza.zzj++;
            zzaW(this.zzl.size() + iZzd, this.zzC);
        }
        zzaL();
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzj(false);
        }
        return true;
    }

    public final boolean zzaZ(zzti zztiVar) {
        if (zzba(zztiVar.zza)) {
            return false;
        }
        return !zztiVar.zzf || zzabd.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final int zzaa(zztr zztrVar, zzz zzzVar) throws zztw {
        boolean z10;
        String str = zzzVar.zzo;
        if (!zzay.zzj(str)) {
            return 128;
        }
        Context context = this.zze;
        int i = 0;
        boolean z11 = zzzVar.zzs != null;
        List listZzbd = zzbd(context, zztrVar, zzzVar, z11, false);
        if (z11 && listZzbd.isEmpty()) {
            listZzbd = zzbd(context, zztrVar, zzzVar, false, false);
        }
        if (listZzbd.isEmpty()) {
            return 129;
        }
        if (!zztp.zzaU(zzzVar)) {
            return 130;
        }
        zzti zztiVar = (zzti) listZzbd.get(0);
        boolean zZzf = zztiVar.zzf(zzzVar);
        if (zZzf) {
            z10 = true;
        } else {
            for (int i10 = 1; i10 < listZzbd.size(); i10++) {
                zzti zztiVar2 = (zzti) listZzbd.get(i10);
                if (zztiVar2.zzf(zzzVar)) {
                    zZzf = true;
                    z10 = false;
                    zztiVar = zztiVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i11 = true != zZzf ? 3 : 4;
        int i12 = true != zztiVar.zzg(zzzVar) ? 8 : 16;
        int i13 = true != zztiVar.zzg ? 0 : 64;
        int i14 = true != z10 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzaax.zza(context)) {
            i14 = 256;
        }
        if (zZzf) {
            List listZzbd2 = zzbd(context, zztrVar, zzzVar, z11, true);
            if (!listZzbd2.isEmpty()) {
                zzti zztiVar3 = (zzti) zzuc.zzf(listZzbd2, zzzVar).get(0);
                if (zztiVar3.zzf(zzzVar) && zztiVar3.zzg(zzzVar)) {
                    i = 32;
                }
            }
        }
        return i11 | i12 | i | i13 | i14;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzab(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        int i;
        int i10;
        zzie zzieVarZzc = zztiVar.zzc(zzzVar, zzzVar2);
        int i11 = zzieVarZzc.zze;
        zzaaz zzaazVar = this.zzm;
        zzaazVar.getClass();
        if (zzzVar2.zzv > zzaazVar.zza || zzzVar2.zzw > zzaazVar.zzb) {
            i11 |= 256;
        }
        if (zzae(zztiVar, zzzVar2) > zzaazVar.zzc) {
            i11 |= 64;
        }
        String str = zztiVar.zza;
        if (i11 != 0) {
            i10 = 0;
            i = i11;
        } else {
            i = 0;
            i10 = zzieVarZzc.zzd;
        }
        return new zzie(str, zzzVar, zzzVar2, i10, i);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zzie zzac(zzkv zzkvVar) throws zzin {
        zzie zzieVarZzac = super.zzac(zzkvVar);
        zzz zzzVar = zzkvVar.zza;
        zzzVar.getClass();
        this.zzg.zzp(zzzVar, zzieVarZzac);
        return zzieVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final zztc zzag(zzti zztiVar, zzz zzzVar, MediaCrypto mediaCrypto, float f10) {
        zzaaz zzaazVar;
        Point pointZzb;
        int i;
        int i10;
        int i11;
        boolean z10;
        zzz[] zzzVarArr;
        char c10;
        boolean z11;
        int iZzad;
        zzz[] zzzVarArrZzT = zzT();
        int length = zzzVarArrZzT.length;
        int iZzae = zzae(zztiVar, zzzVar);
        int i12 = zzzVar.zzw;
        int i13 = zzzVar.zzv;
        boolean z12 = true;
        if (length == 1) {
            if (iZzae != -1 && (iZzad = zzad(zztiVar, zzzVar)) != -1) {
                iZzae = Math.min((int) (iZzae * 1.5f), iZzad);
            }
            zzaazVar = new zzaaz(i13, i12, iZzae);
        } else {
            int iMax = i12;
            int iMax2 = i13;
            int i14 = 0;
            boolean z13 = false;
            while (i14 < length) {
                zzz zzzVarZzan = zzzVarArrZzT[i14];
                boolean z14 = z12;
                zzk zzkVar = zzzVar.zzE;
                if (zzkVar != null && zzzVarZzan.zzE == null) {
                    zzx zzxVarZzb = zzzVarZzan.zzb();
                    zzxVarZzb.zzF(zzkVar);
                    zzzVarZzan = zzxVarZzb.zzan();
                }
                if (zztiVar.zzc(zzzVar, zzzVarZzan).zzd != 0) {
                    int i15 = zzzVarZzan.zzv;
                    c10 = 65535;
                    if (i15 != -1) {
                        zzzVarArr = zzzVarArrZzT;
                        if (zzzVarZzan.zzw != -1) {
                            z11 = false;
                        }
                        z13 |= z11;
                        iMax2 = Math.max(iMax2, i15);
                        iMax = Math.max(iMax, zzzVarZzan.zzw);
                        iZzae = Math.max(iZzae, zzae(zztiVar, zzzVarZzan));
                    } else {
                        zzzVarArr = zzzVarArrZzT;
                    }
                    z11 = z14;
                    z13 |= z11;
                    iMax2 = Math.max(iMax2, i15);
                    iMax = Math.max(iMax, zzzVarZzan.zzw);
                    iZzae = Math.max(iZzae, zzae(zztiVar, zzzVarZzan));
                } else {
                    zzzVarArr = zzzVarArrZzT;
                    c10 = 65535;
                }
                i14++;
                z12 = z14;
                zzzVarArrZzT = zzzVarArr;
            }
            boolean z15 = z12;
            if (z13) {
                zzea.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax2 + "x" + iMax);
                boolean z16 = i12 > i13 ? z15 : false;
                int i16 = z16 ? i12 : i13;
                int i17 = z15 != z16 ? i12 : i13;
                int[] iArr = zzb;
                int i18 = 0;
                while (i18 < 9) {
                    float f11 = i17;
                    float f12 = i16;
                    int i19 = iArr[i18];
                    int i20 = i18;
                    float f13 = i19;
                    if (i19 <= i16 || (i = (int) (f13 * (f11 / f12))) <= i17) {
                        break;
                    }
                    int i21 = i17;
                    if (true != z16) {
                        i10 = i16;
                        i11 = i19;
                    } else {
                        i10 = i16;
                        i11 = i;
                    }
                    if (true != z16) {
                        i19 = i;
                    }
                    pointZzb = zztiVar.zzb(i11, i19);
                    float f14 = zzzVar.zzz;
                    if (pointZzb != null) {
                        z10 = z16;
                        if (zztiVar.zzh(pointZzb.x, pointZzb.y, f14)) {
                            break;
                        }
                    } else {
                        z10 = z16;
                    }
                    i18 = i20 + 1;
                    i17 = i21;
                    i16 = i10;
                    z16 = z10;
                }
                pointZzb = null;
                if (pointZzb != null) {
                    iMax2 = Math.max(iMax2, pointZzb.x);
                    iMax = Math.max(iMax, pointZzb.y);
                    zzx zzxVarZzb2 = zzzVar.zzb();
                    zzxVarZzb2.zzam(iMax2);
                    zzxVarZzb2.zzQ(iMax);
                    iZzae = Math.max(iZzae, zzad(zztiVar, zzxVarZzb2.zzan()));
                    zzea.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                }
            }
            zzaazVar = new zzaaz(iMax2, iMax, iZzae);
        }
        String str = zztiVar.zzc;
        this.zzm = zzaazVar;
        boolean z17 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i12);
        zzed.zzb(mediaFormat, zzzVar.zzr);
        float f15 = zzzVar.zzz;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzed.zza(mediaFormat, "rotation-degrees", zzzVar.zzA);
        zzk zzkVar2 = zzzVar.zzE;
        if (zzkVar2 != null) {
            zzed.zza(mediaFormat, "color-transfer", zzkVar2.zzd);
            zzed.zza(mediaFormat, "color-standard", zzkVar2.zzb);
            zzed.zza(mediaFormat, "color-range", zzkVar2.zzc);
            byte[] bArr = zzkVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzzVar.zzo)) {
            int i22 = zzuc.zza;
            Pair pairZza = zzdk.zza(zzzVar);
            if (pairZza != null) {
                zzed.zza(mediaFormat, Scopes.PROFILE, ((Integer) pairZza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaazVar.zza);
        mediaFormat.setInteger("max-height", zzaazVar.zzb);
        zzed.zza(mediaFormat, "max-input-size", zzaazVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z17) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzK));
        }
        Surface surfaceZzbc = zzbc(zztiVar);
        if (this.zzp != null && !zzex.zzL(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zztc.zzb(zztiVar, mediaFormat, zzzVar, surfaceZzbc, null);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final List zzah(zztr zztrVar, zzz zzzVar, boolean z10) throws zztw {
        return zzuc.zzf(zzbd(this.zze, zztrVar, zzzVar, false, false), zzzVar);
    }

    public final void zzaj(zztf zztfVar, int i, long j4, long j10) {
        Trace.beginSection("releaseOutputBuffer");
        zztfVar.zzn(i, j10);
        Trace.endSection();
        ((zztp) this).zza.zze++;
        this.zzB = 0;
        if (this.zzp == null) {
            zzcd zzcdVar = this.zzI;
            if (!zzcdVar.equals(zzcd.zza) && !zzcdVar.equals(this.zzJ)) {
                this.zzJ = zzcdVar;
                this.zzg.zzt(zzcdVar);
            }
            if (!this.zzi.zzn() || this.zzt == null) {
                return;
            }
            zzbg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    @TargetApi(29)
    public final void zzak(zzhs zzhsVar) throws zzin {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhsVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztf zztfVarZzaB = zzaB();
                        zztfVarZzaB.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zztfVarZzaB.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzal(Exception exc) {
        zzea.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzam(String str, zztc zztcVar, long j4, long j10) {
        this.zzg.zzk(str, j4, j10);
        this.zzn = zzba(str);
        zzti zztiVarZzaD = zzaD();
        zztiVarZzaD.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zztiVarZzaD.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzi = zztiVarZzaD.zzi();
            int length = codecProfileLevelArrZzi.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrZzi[i].profile == 16384) {
                    z10 = true;
                    break;
                }
                i++;
            }
        }
        this.zzo = z10;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzan(String str) {
        this.zzg.zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzao(zzz zzzVar, MediaFormat mediaFormat) {
        zztf zztfVarZzaB = zzaB();
        if (zztfVarZzaB != null) {
            zztfVarZzaB.zzr(this.zzx);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzzVar.zzB;
        int i = zzzVar.zzA;
        if (i == 90 || i == 270) {
            f10 = 1.0f / f10;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.zzI = new zzcd(integer, integer2, f10);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null || !this.zzP) {
            this.zzi.zzj(zzzVar.zzz);
        } else {
            zzx zzxVarZzb = zzzVar.zzb();
            zzxVarZzb.zzam(integer);
            zzxVarZzb.zzQ(integer2);
            zzxVarZzb.zzad(f10);
            zzz zzzVarZzan = zzxVarZzb.zzan();
            int i11 = this.zzr;
            List listZzn = this.zzs;
            if (listZzn == null) {
                listZzn = zzfyf.zzn();
            }
            zzacnVar.zzl(1, zzzVarZzan, zzax(), i11, listZzn);
            this.zzr = 2;
        }
        this.zzP = false;
    }

    public final void zzap(zztf zztfVar, int i, long j4) {
        Trace.beginSection("skipVideoBuffer");
        zztfVar.zzo(i, false);
        Trace.endSection();
        ((zztp) this).zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzaq() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzw();
            long jZzax = this.zzN;
            if (jZzax == -9223372036854775807L) {
                jZzax = zzax();
                this.zzN = jZzax;
            }
            this.zzp.zzp(-jZzax);
        } else {
            this.zzi.zzf(2);
        }
        this.zzP = true;
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzar() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            zzacnVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final boolean zzas(long j4, long j10, zztf zztfVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z10, boolean z11, zzz zzzVar) throws zzin {
        zzaba zzabaVar;
        long j12;
        zztfVar.getClass();
        long jZzaw = j11 - zzaw();
        int i12 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzl;
            Long l5 = (Long) priorityQueue.peek();
            if (l5 == null || l5.longValue() >= j11) {
                break;
            }
            priorityQueue.poll();
            i12++;
        }
        zzaW(i12, 0);
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null) {
            if (!z10 || z11) {
                return zzacnVar.zzz(j11, new zzaaw(this, zztfVar, i, jZzaw));
            }
            zzap(zztfVar, i, jZzaw);
            return true;
        }
        zzabr zzabrVar = this.zzi;
        long jZzax = zzax();
        zzabp zzabpVar = this.zzj;
        int iZza = zzabrVar.zza(j11, j4, j10, jZzax, z10, z11, zzabpVar);
        if (iZza == 0) {
            long jZzc = zzi().zzc();
            zzbf(jZzaw, jZzc, zzzVar);
            zzaj(zztfVar, i, jZzaw, jZzc);
            zzaX(zzabpVar.zzc());
            return true;
        }
        if (iZza != 1) {
            if (iZza != 2) {
                if (iZza != 3) {
                    return false;
                }
                zzap(zztfVar, i, jZzaw);
                zzaX(zzabpVar.zzc());
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            zztfVar.zzo(i, false);
            Trace.endSection();
            zzaW(0, 1);
            zzaX(zzabpVar.zzc());
            return true;
        }
        long jZzd = zzabpVar.zzd();
        long jZzc2 = zzabpVar.zzc();
        if (jZzd == this.zzH) {
            zzap(zztfVar, i, jZzaw);
            j12 = jZzd;
            zzabaVar = this;
        } else {
            zzbf(jZzaw, jZzd, zzzVar);
            zzaj(zztfVar, i, jZzaw, jZzd);
            zzabaVar = this;
            j12 = jZzd;
        }
        zzabaVar.zzaX(jZzc2);
        zzabaVar.zzH = j12;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public final void zzt() {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null) {
            this.zzi.zzb();
            return;
        }
        int i = this.zzr;
        if (i == 0 || i == 1) {
            this.zzr = 0;
        } else {
            zzacnVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public final void zzu(int i, Object obj) throws Throwable {
        if (i == 1) {
            zzbi(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            zzabo zzaboVar = (zzabo) obj;
            this.zzM = zzaboVar;
            zzacn zzacnVar = this.zzp;
            if (zzacnVar != null) {
                zzacnVar.zzv(zzaboVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzL != iIntValue) {
                this.zzL = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzx = iIntValue2;
            zztf zztfVarZzaB = zzaB();
            if (zztfVarZzaB != null) {
                zztfVarZzaB.zzr(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzy = iIntValue3;
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzq(iIntValue3);
                return;
            } else {
                this.zzi.zzh(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbz.zza)) {
                zzacn zzacnVar3 = this.zzp;
                if (zzacnVar3 == null || !zzacnVar3.zzC()) {
                    return;
                }
                zzacnVar3.zzm();
                return;
            }
            this.zzs = list;
            zzacn zzacnVar4 = this.zzp;
            if (zzacnVar4 != null) {
                zzacnVar4.zzu(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            zzeo zzeoVar = (zzeo) obj;
            if (zzeoVar.zzb() == 0 || zzeoVar.zza() == 0) {
                return;
            }
            this.zzv = zzeoVar;
            zzacn zzacnVar5 = this.zzp;
            if (zzacnVar5 != null) {
                Surface surface = this.zzt;
                zzdd.zzb(surface);
                zzacnVar5.zzs(surface, zzeoVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzK = ((Integer) obj).intValue();
                zztf zztfVarZzaB2 = zzaB();
                if (zztfVarZzaB2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzK));
                    zztfVarZzaB2.zzq(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzt;
                zzbi(null);
                obj.getClass();
                ((zzaba) obj).zzu(1, surface2);
                break;
            case 18:
                boolean z10 = this.zzD != null;
                zzmh zzmhVar = (zzmh) obj;
                this.zzD = zzmhVar;
                if (z10 != (zzmhVar != null)) {
                    zzaV();
                    break;
                }
                break;
            default:
                super.zzu(i, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzx() {
        this.zzJ = null;
        this.zzO = -9223372036854775807L;
        this.zzw = false;
        this.zzE = true;
        try {
            super.zzx();
        } finally {
            zzach zzachVar = this.zzg;
            zzachVar.zzm(((zztp) this).zza);
            zzachVar.zzt(zzcd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzy(boolean z10, boolean z11) throws zzin {
        super.zzy(z10, z11);
        zzn();
        this.zzg.zzo(((zztp) this).zza);
        if (!this.zzq) {
            if (this.zzs != null && this.zzp == null) {
                zzabg zzabgVar = new zzabg(this.zze, this.zzi);
                zzabgVar.zze(true);
                zzabgVar.zzd(zzi());
                zzabn zzabnVarZzf = zzabgVar.zzf();
                zzabnVarZzf.zzt(1);
                this.zzp = zzabnVarZzf.zze(0);
            }
            this.zzq = true;
        }
        int i = !z11 ? 1 : 0;
        zzacn zzacnVar = this.zzp;
        if (zzacnVar == null) {
            zzabr zzabrVar = this.zzi;
            zzabrVar.zzi(zzi());
            zzabrVar.zzf(i);
            return;
        }
        zzacnVar.zzr(new zzaav(this), zzgdt.zzc());
        zzabo zzaboVar = this.zzM;
        if (zzaboVar != null) {
            this.zzp.zzv(zzaboVar);
        }
        if (this.zzt != null && !this.zzv.equals(zzeo.zza)) {
            this.zzp.zzs(this.zzt, this.zzv);
        }
        this.zzp.zzq(this.zzy);
        this.zzp.zzt(zzau());
        List list = this.zzs;
        if (list != null) {
            this.zzp.zzu(list);
        }
        this.zzr = i;
        zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zztp, com.google.android.gms.internal.ads.zzic
    public final void zzz(long j4, boolean z10) throws zzin {
        zzacn zzacnVar = this.zzp;
        if (zzacnVar != null && !z10) {
            zzacnVar.zzj(true);
        }
        super.zzz(j4, z10);
        if (this.zzp == null) {
            this.zzi.zzg();
        }
        if (z10) {
            zzacn zzacnVar2 = this.zzp;
            if (zzacnVar2 != null) {
                zzacnVar2.zzk(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzB = 0;
    }
}
