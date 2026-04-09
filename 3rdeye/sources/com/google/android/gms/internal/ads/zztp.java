package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zztp extends zzic {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private zzti zzA;
    private int zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private int zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private long zzY;
    private long zzZ;
    protected zzid zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private zztn zzad;
    private long zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private long zzai;
    private long zzaj;
    private zzsi zzak;
    private zzsi zzal;
    private final zztd zzc;
    private final zztr zzd;
    private final float zze;
    private final zzhs zzf;
    private final zzhs zzg;
    private final zzhs zzh;
    private final zzsw zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzrv zzl;
    private zzz zzm;
    private zzz zzn;
    private zzlz zzo;
    private MediaCrypto zzp;
    private long zzq;
    private float zzr;
    private float zzs;
    private zztf zzt;
    private zzz zzu;
    private MediaFormat zzv;
    private boolean zzw;
    private float zzx;
    private ArrayDeque zzy;
    private zztl zzz;

    public zztp(int i, zztd zztdVar, zztr zztrVar, boolean z10, float f10) {
        super(i);
        this.zzc = zztdVar;
        zztrVar.getClass();
        this.zzd = zztrVar;
        this.zze = f10;
        this.zzf = new zzhs(0, 0);
        this.zzg = new zzhs(0, 0);
        this.zzh = new zzhs(2, 0);
        zzsw zzswVar = new zzsw();
        this.zzi = zzswVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzr = 1.0f;
        this.zzs = 1.0f;
        this.zzq = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzad = zztn.zza;
        zzswVar.zzj(0);
        zzswVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzrv();
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzS = 0;
        this.zzJ = -1;
        this.zzK = -1;
        this.zzI = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzH = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zza = new zzid();
        this.zzai = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
    }

    public static boolean zzaU(zzz zzzVar) {
        return zzzVar.zzN == 0;
    }

    private final void zzaW(zztn zztnVar) {
        this.zzad = zztnVar;
        if (zztnVar.zzd != -9223372036854775807L) {
            this.zzaf = true;
        }
    }

    private final void zzaX() throws zzin {
        zzsi zzsiVar = this.zzal;
        zzsiVar.getClass();
        this.zzak = zzsiVar;
        this.zzT = 0;
        this.zzU = 0;
    }

    @TargetApi(23)
    private final boolean zzaY() throws zzin {
        if (this.zzV) {
            this.zzT = 1;
            if (this.zzD) {
                this.zzU = 3;
                return false;
            }
            this.zzU = 2;
        } else {
            zzaX();
        }
        return true;
    }

    private final boolean zzaZ() {
        if (this.zzt == null) {
            return false;
        }
        if (zzaT()) {
            zzaI();
            return true;
        }
        if (zzaR()) {
            zzaf();
            return false;
        }
        long j4 = this.zzaj;
        if (j4 == -9223372036854775807L || zzf() > j4 || this.zzae >= j4) {
            return false;
        }
        this.zzah = true;
        this.zzaj = -9223372036854775807L;
        return false;
    }

    private final void zzad() {
        this.zzQ = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzP = false;
        this.zzO = false;
        this.zzl.zzb();
    }

    private final void zzae() throws Throwable {
        if (this.zzV) {
            this.zzT = 1;
            this.zzU = 3;
        } else {
            zzaI();
            zzaF();
        }
    }

    private final void zzaf() {
        try {
            zztf zztfVar = this.zzt;
            zzdd.zzb(zztfVar);
            zztfVar.zzj();
        } finally {
            zzaJ();
        }
    }

    @TargetApi(23)
    private final void zzai() throws Throwable {
        int i = this.zzU;
        if (i == 1) {
            zzaf();
            return;
        }
        if (i == 2) {
            zzaf();
            zzaX();
        } else if (i != 3) {
            this.zzab = true;
            zzar();
        } else {
            zzaI();
            zzaF();
        }
    }

    private final void zzaj() {
        this.zzJ = -1;
        this.zzg.zzc = null;
    }

    private final void zzap() {
        this.zzK = -1;
        this.zzL = null;
    }

    private final boolean zzba() {
        return this.zzK >= 0;
    }

    private final boolean zzbb(long j4, long j10) {
        if (j10 >= j4) {
            return false;
        }
        zzz zzzVar = this.zzn;
        return (zzzVar != null && Objects.equals(zzzVar.zzo, "audio/opus") && zzaeo.zzf(j4, j10)) ? false : true;
    }

    private final boolean zzbc(int i) throws Throwable {
        zzkv zzkvVarZzk = zzk();
        zzhs zzhsVar = this.zzf;
        zzhsVar.zzb();
        int iZzcV = zzcV(zzkvVarZzk, zzhsVar, i | 4);
        if (iZzcV == -5) {
            zzac(zzkvVarZzk);
            return true;
        }
        if (iZzcV != -4 || !zzhsVar.zzf()) {
            return false;
        }
        this.zzaa = true;
        zzai();
        return false;
    }

    private final boolean zzbd(long j4) {
        return this.zzq == -9223372036854775807L || zzi().zzb() - j4 < this.zzq;
    }

    private final boolean zzbe(zzz zzzVar) throws Throwable {
        if (this.zzt != null && this.zzU != 3 && zzcU() != 0) {
            float f10 = this.zzs;
            zzzVar.getClass();
            float fZzZ = zzZ(f10, zzzVar, zzT());
            float f11 = this.zzx;
            if (f11 != fZzZ) {
                if (fZzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f11 != -1.0f || fZzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzZ);
                    zztf zztfVar = this.zzt;
                    zztfVar.getClass();
                    zztfVar.zzq(bundle);
                    this.zzx = fZzZ;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzC() {
        try {
            zzad();
            zzaI();
        } finally {
            this.zzal = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzF(com.google.android.gms.internal.ads.zzz[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzvh r17) throws com.google.android.gms.internal.ads.zzin {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zztn r12 = r11.zzad
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zztn r4 = new com.google.android.gms.internal.ads.zztn
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzaW(r4)
            boolean r12 = r11.zzag
            if (r12 == 0) goto L56
            r11.zzaq()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzk
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzY
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzae
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zztn r4 = new com.google.android.gms.internal.ads.zztn
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzaW(r4)
            com.google.android.gms.internal.ads.zztn r12 = r11.zzad
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzaq()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zztn r0 = new com.google.android.gms.internal.ads.zztn
            long r1 = r11.zzY
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzF(com.google.android.gms.internal.ads.zzz[], long, long, com.google.android.gms.internal.ads.zzvh):void");
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzma
    public void zzM(float f10, float f11) throws Throwable {
        this.zzr = f10;
        this.zzs = f11;
        zzbe(this.zzu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x034d, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0529, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02d6 A[Catch: IllegalStateException -> 0x000b, CryptoException -> 0x000f, TryCatch #1 {CryptoException -> 0x000f, blocks: (B:3:0x0003, B:5:0x0007, B:11:0x0012, B:13:0x0017, B:15:0x001d, B:21:0x0039, B:23:0x0058, B:25:0x0066, B:36:0x0082, B:114:0x01c2, B:343:0x0544, B:43:0x0094, B:49:0x00a0, B:51:0x00a4, B:53:0x00aa, B:57:0x00bb, B:58:0x00ca, B:62:0x00d7, B:64:0x00dd, B:104:0x01a7, B:106:0x01ad, B:107:0x01b0, B:109:0x01b6, B:111:0x01ba, B:65:0x00e3, B:67:0x00e9, B:68:0x00f1, B:70:0x0101, B:73:0x010b, B:76:0x0111, B:78:0x0115, B:80:0x011f, B:82:0x0129, B:83:0x0146, B:84:0x014e, B:85:0x014f, B:87:0x0156, B:89:0x015e, B:91:0x0164, B:92:0x016b, B:94:0x0177, B:95:0x0180, B:100:0x019b, B:102:0x01a1, B:98:0x0187, B:72:0x0109, B:103:0x01a4, B:31:0x007b, B:117:0x01cc, B:119:0x01d3, B:120:0x01e1, B:122:0x01e5, B:124:0x01f0, B:128:0x01fb, B:130:0x0201, B:132:0x0209, B:134:0x0213, B:136:0x021b, B:220:0x0352, B:224:0x0361, B:226:0x0365, B:228:0x036a, B:231:0x0371, B:233:0x0375, B:235:0x037d, B:236:0x0388, B:239:0x038d, B:241:0x0391, B:244:0x03a4, B:337:0x0529, B:245:0x03a8, B:247:0x03ac, B:249:0x03b5, B:333:0x0520, B:250:0x03cc, B:251:0x03cd, B:254:0x03d3, B:256:0x03d7, B:258:0x03df, B:260:0x03ef, B:261:0x03f5, B:262:0x03f6, B:263:0x03f9, B:264:0x03fa, B:266:0x0400, B:267:0x0408, B:270:0x040f, B:272:0x0415, B:275:0x041e, B:277:0x0422, B:278:0x0429, B:279:0x042e, B:281:0x0436, B:283:0x043e, B:284:0x0443, B:286:0x0449, B:287:0x044e, B:289:0x0452, B:290:0x0463, B:292:0x0467, B:294:0x046d, B:296:0x0474, B:297:0x0478, B:299:0x047e, B:301:0x0484, B:302:0x0489, B:304:0x048f, B:306:0x0497, B:308:0x04a3, B:313:0x04b3, B:309:0x04a7, B:310:0x04a8, B:312:0x04b0, B:314:0x04b6, B:315:0x04b7, B:317:0x04c5, B:320:0x04cd, B:322:0x04d6, B:323:0x04d9, B:325:0x04eb, B:329:0x0504, B:326:0x04f5, B:328:0x04fb, B:330:0x0514, B:319:0x04cb, B:332:0x0516, B:336:0x0528, B:138:0x0221, B:139:0x0226, B:140:0x0227, B:142:0x022b, B:144:0x022f, B:146:0x0233, B:147:0x0236, B:149:0x023c, B:151:0x024b, B:153:0x0252, B:155:0x0256, B:156:0x025c, B:158:0x0260, B:160:0x0266, B:161:0x026a, B:163:0x0274, B:164:0x0283, B:166:0x0291, B:168:0x0295, B:170:0x0299, B:172:0x02a5, B:177:0x02b0, B:179:0x02b4, B:180:0x02be, B:173:0x02a8, B:175:0x02ac, B:181:0x02bf, B:185:0x02ce, B:187:0x02d6, B:192:0x02e3, B:194:0x02e9, B:196:0x02ef, B:198:0x02f5, B:199:0x02fa, B:200:0x0302, B:203:0x031d, B:205:0x0323, B:210:0x0333, B:212:0x0337, B:214:0x033b, B:215:0x0345, B:217:0x034a, B:339:0x0530, B:341:0x0534, B:342:0x0535), top: B:370:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e9 A[Catch: IllegalStateException -> 0x000b, CryptoException -> 0x000f, TryCatch #1 {CryptoException -> 0x000f, blocks: (B:3:0x0003, B:5:0x0007, B:11:0x0012, B:13:0x0017, B:15:0x001d, B:21:0x0039, B:23:0x0058, B:25:0x0066, B:36:0x0082, B:114:0x01c2, B:343:0x0544, B:43:0x0094, B:49:0x00a0, B:51:0x00a4, B:53:0x00aa, B:57:0x00bb, B:58:0x00ca, B:62:0x00d7, B:64:0x00dd, B:104:0x01a7, B:106:0x01ad, B:107:0x01b0, B:109:0x01b6, B:111:0x01ba, B:65:0x00e3, B:67:0x00e9, B:68:0x00f1, B:70:0x0101, B:73:0x010b, B:76:0x0111, B:78:0x0115, B:80:0x011f, B:82:0x0129, B:83:0x0146, B:84:0x014e, B:85:0x014f, B:87:0x0156, B:89:0x015e, B:91:0x0164, B:92:0x016b, B:94:0x0177, B:95:0x0180, B:100:0x019b, B:102:0x01a1, B:98:0x0187, B:72:0x0109, B:103:0x01a4, B:31:0x007b, B:117:0x01cc, B:119:0x01d3, B:120:0x01e1, B:122:0x01e5, B:124:0x01f0, B:128:0x01fb, B:130:0x0201, B:132:0x0209, B:134:0x0213, B:136:0x021b, B:220:0x0352, B:224:0x0361, B:226:0x0365, B:228:0x036a, B:231:0x0371, B:233:0x0375, B:235:0x037d, B:236:0x0388, B:239:0x038d, B:241:0x0391, B:244:0x03a4, B:337:0x0529, B:245:0x03a8, B:247:0x03ac, B:249:0x03b5, B:333:0x0520, B:250:0x03cc, B:251:0x03cd, B:254:0x03d3, B:256:0x03d7, B:258:0x03df, B:260:0x03ef, B:261:0x03f5, B:262:0x03f6, B:263:0x03f9, B:264:0x03fa, B:266:0x0400, B:267:0x0408, B:270:0x040f, B:272:0x0415, B:275:0x041e, B:277:0x0422, B:278:0x0429, B:279:0x042e, B:281:0x0436, B:283:0x043e, B:284:0x0443, B:286:0x0449, B:287:0x044e, B:289:0x0452, B:290:0x0463, B:292:0x0467, B:294:0x046d, B:296:0x0474, B:297:0x0478, B:299:0x047e, B:301:0x0484, B:302:0x0489, B:304:0x048f, B:306:0x0497, B:308:0x04a3, B:313:0x04b3, B:309:0x04a7, B:310:0x04a8, B:312:0x04b0, B:314:0x04b6, B:315:0x04b7, B:317:0x04c5, B:320:0x04cd, B:322:0x04d6, B:323:0x04d9, B:325:0x04eb, B:329:0x0504, B:326:0x04f5, B:328:0x04fb, B:330:0x0514, B:319:0x04cb, B:332:0x0516, B:336:0x0528, B:138:0x0221, B:139:0x0226, B:140:0x0227, B:142:0x022b, B:144:0x022f, B:146:0x0233, B:147:0x0236, B:149:0x023c, B:151:0x024b, B:153:0x0252, B:155:0x0256, B:156:0x025c, B:158:0x0260, B:160:0x0266, B:161:0x026a, B:163:0x0274, B:164:0x0283, B:166:0x0291, B:168:0x0295, B:170:0x0299, B:172:0x02a5, B:177:0x02b0, B:179:0x02b4, B:180:0x02be, B:173:0x02a8, B:175:0x02ac, B:181:0x02bf, B:185:0x02ce, B:187:0x02d6, B:192:0x02e3, B:194:0x02e9, B:196:0x02ef, B:198:0x02f5, B:199:0x02fa, B:200:0x0302, B:203:0x031d, B:205:0x0323, B:210:0x0333, B:212:0x0337, B:214:0x033b, B:215:0x0345, B:217:0x034a, B:339:0x0530, B:341:0x0534, B:342:0x0535), top: B:370:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0359 A[LOOP:0: B:120:0x01e1->B:223:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x052d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.google.android.gms.internal.ads.zzma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzV(long r22, long r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public boolean zzW() {
        return this.zzab;
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzba()) {
            return true;
        }
        return this.zzI != -9223372036854775807L && zzi().zzb() < this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final int zzY(zzz zzzVar) throws zzin {
        try {
            return zzaa(this.zzd, zzzVar);
        } catch (zztw e4) {
            throw zzcX(e4, zzzVar, false, 4002);
        }
    }

    public float zzZ(float f10, zzz zzzVar, zzz[] zzzVarArr) {
        throw null;
    }

    public final zzlz zzaA() {
        return this.zzo;
    }

    public final zztf zzaB() {
        return this.zzt;
    }

    public zzth zzaC(Throwable th, zzti zztiVar) {
        return new zzth(th, zztiVar);
    }

    public final zzti zzaD() {
        return this.zzA;
    }

    public final void zzaE() {
        this.zzag = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0509 A[Catch: Exception -> 0x0434, TryCatch #4 {Exception -> 0x0434, blocks: (B:261:0x0454, B:265:0x045e, B:269:0x0492, B:271:0x049c, B:273:0x04a4, B:275:0x04ae, B:277:0x04b6, B:279:0x04be, B:299:0x0503, B:301:0x0509, B:305:0x0515, B:307:0x051b, B:311:0x0527, B:313:0x052d, B:338:0x0585, B:340:0x058b, B:318:0x053a, B:320:0x0542, B:322:0x054a, B:324:0x0552, B:326:0x055a, B:328:0x0562, B:330:0x056a, B:332:0x0574, B:334:0x057e, B:284:0x04cc, B:286:0x04d4, B:290:0x04e0, B:292:0x04ea, B:294:0x04f2, B:296:0x04fa, B:255:0x0439, B:256:0x0440), top: B:398:0x0454 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x058b A[Catch: Exception -> 0x0434, TRY_LEAVE, TryCatch #4 {Exception -> 0x0434, blocks: (B:261:0x0454, B:265:0x045e, B:269:0x0492, B:271:0x049c, B:273:0x04a4, B:275:0x04ae, B:277:0x04b6, B:279:0x04be, B:299:0x0503, B:301:0x0509, B:305:0x0515, B:307:0x051b, B:311:0x0527, B:313:0x052d, B:338:0x0585, B:340:0x058b, B:318:0x053a, B:320:0x0542, B:322:0x054a, B:324:0x0552, B:326:0x055a, B:328:0x0562, B:330:0x056a, B:332:0x0574, B:334:0x057e, B:284:0x04cc, B:286:0x04d4, B:290:0x04e0, B:292:0x04ea, B:294:0x04f2, B:296:0x04fa, B:255:0x0439, B:256:0x0440), top: B:398:0x0454 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0627 A[Catch: zztl -> 0x0082, TryCatch #17 {zztl -> 0x0082, blocks: (B:24:0x0057, B:26:0x005c, B:28:0x0060, B:30:0x0076, B:35:0x0087, B:39:0x0093, B:41:0x009b, B:43:0x009f, B:45:0x00a3, B:47:0x00ac, B:369:0x060b, B:371:0x0627, B:373:0x0630, B:376:0x0640, B:377:0x0642, B:372:0x062a, B:379:0x0644, B:380:0x0645, B:382:0x064a, B:383:0x064b, B:384:0x0655, B:37:0x008a, B:38:0x0092, B:386:0x0657), top: B:423:0x0057, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x062a A[Catch: zztl -> 0x0082, TryCatch #17 {zztl -> 0x0082, blocks: (B:24:0x0057, B:26:0x005c, B:28:0x0060, B:30:0x0076, B:35:0x0087, B:39:0x0093, B:41:0x009b, B:43:0x009f, B:45:0x00a3, B:47:0x00ac, B:369:0x060b, B:371:0x0627, B:373:0x0630, B:376:0x0640, B:377:0x0642, B:372:0x062a, B:379:0x0644, B:380:0x0645, B:382:0x064a, B:383:0x064b, B:384:0x0655, B:37:0x008a, B:38:0x0092, B:386:0x0657), top: B:423:0x0057, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117 A[PHI: r10
  0x0117: PHI (r10v27 int) = (r10v28 int), (r10v29 int) binds: [B:60:0x00e6, B:62:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v16, types: [android.media.MediaFormat] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzto] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zztp] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzaF() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzaF():void");
    }

    public void zzaG(long j4) {
        this.zzae = j4;
        while (true) {
            ArrayDeque arrayDeque = this.zzk;
            if (arrayDeque.isEmpty() || j4 < ((zztn) arrayDeque.peek()).zzb) {
                return;
            }
            zztn zztnVar = (zztn) arrayDeque.poll();
            zztnVar.getClass();
            zzaW(zztnVar);
            zzaq();
        }
    }

    public final void zzaI() {
        try {
            zztf zztfVar = this.zzt;
            if (zztfVar != null) {
                zztfVar.zzm();
                this.zza.zzb++;
                zzti zztiVar = this.zzA;
                if (zztiVar == null) {
                    throw null;
                }
                zzan(zztiVar.zza);
            }
            this.zzt = null;
            this.zzp = null;
            this.zzak = null;
            zzaK();
        } catch (Throwable th) {
            this.zzt = null;
            this.zzp = null;
            this.zzak = null;
            zzaK();
            throw th;
        }
    }

    public void zzaJ() {
        zzaj();
        zzap();
        this.zzI = -9223372036854775807L;
        this.zzW = false;
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzE = false;
        this.zzF = false;
        this.zzM = false;
        this.zzN = false;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zzS = this.zzR ? 1 : 0;
        this.zzah = false;
        this.zzai = -9223372036854775807L;
        this.zzaj = -9223372036854775807L;
    }

    public final void zzaK() {
        zzaJ();
        this.zzy = null;
        this.zzA = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzX = false;
        this.zzx = -1.0f;
        this.zzB = 0;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzR = false;
        this.zzS = 0;
    }

    public final boolean zzaL() throws Throwable {
        boolean zZzaZ = zzaZ();
        if (zZzaZ) {
            zzaF();
        }
        return zZzaZ;
    }

    public final boolean zzaM() {
        return this.zzah;
    }

    public final boolean zzaN() {
        return this.zzO;
    }

    public final boolean zzaO(zzz zzzVar) {
        return this.zzal == null && zzat(zzzVar);
    }

    public boolean zzaP(zzz zzzVar) throws zzin {
        return true;
    }

    public boolean zzaQ(zzhs zzhsVar) {
        return false;
    }

    public boolean zzaR() {
        return true;
    }

    public boolean zzaS(zzti zztiVar) {
        return true;
    }

    public boolean zzaT() {
        int i = this.zzU;
        if (i == 3 || ((this.zzC && !this.zzX) || (this.zzD && this.zzW))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzaX();
            return false;
        } catch (zzin e4) {
            zzea.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
            return true;
        }
    }

    public final boolean zzaV() throws zzin {
        return zzbe(this.zzu);
    }

    public abstract int zzaa(zztr zztrVar, zzz zzzVar) throws zztw;

    public zzie zzab(zzti zztiVar, zzz zzzVar, zzz zzzVar2) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzie zzac(com.google.android.gms.internal.ads.zzkv r13) throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzac(com.google.android.gms.internal.ads.zzkv):com.google.android.gms.internal.ads.zzie");
    }

    public abstract zztc zzag(zzti zztiVar, zzz zzzVar, MediaCrypto mediaCrypto, float f10);

    public abstract List zzah(zztr zztrVar, zzz zzzVar, boolean z10) throws zztw;

    public void zzak(zzhs zzhsVar) throws zzin {
        throw null;
    }

    public void zzal(Exception exc) {
        throw null;
    }

    public void zzam(String str, zztc zztcVar, long j4, long j10) {
        throw null;
    }

    public void zzan(String str) {
        throw null;
    }

    public void zzao(zzz zzzVar, MediaFormat mediaFormat) throws zzin {
        throw null;
    }

    public void zzar() throws zzin {
        throw null;
    }

    public abstract boolean zzas(long j4, long j10, zztf zztfVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z10, boolean z11, zzz zzzVar) throws zzin;

    public boolean zzat(zzz zzzVar) {
        return false;
    }

    public final float zzau() {
        return this.zzr;
    }

    public final long zzav() {
        return this.zzZ;
    }

    public final long zzaw() {
        return this.zzad.zzd;
    }

    public final long zzax() {
        return this.zzad.zzc;
    }

    public final MediaFormat zzay() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzmd
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzlv
    public void zzu(int i, Object obj) throws zzin {
        if (i == 11) {
            zzlz zzlzVar = (zzlz) obj;
            zzlzVar.getClass();
            this.zzo = zzlzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzx() {
        this.zzm = null;
        zzaW(zztn.zza);
        this.zzk.clear();
        zzaZ();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzy(boolean z10, boolean z11) throws zzin {
        this.zza = new zzid();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zzz(long j4, boolean z10) throws zzin {
        this.zzaa = false;
        this.zzab = false;
        if (this.zzO) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzP = false;
            this.zzl.zzb();
        } else {
            zzaL();
        }
        zzet zzetVar = this.zzad.zze;
        if (zzetVar.zza() > 0) {
            this.zzac = true;
        }
        zzetVar.zze();
        this.zzk.clear();
    }

    public void zzaq() {
    }

    public void zzaH(zzhs zzhsVar) throws zzin {
    }
}
