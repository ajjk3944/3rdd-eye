package zc;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class p3 implements k1 {

    /* renamed from: g0, reason: collision with root package name */
    public static volatile p3 f27090g0;
    public final m0 B;
    public m0 D;
    public z2 E;
    public t0 G;
    public final c1 H;
    public boolean J;
    public long K;
    public ArrayList L;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public FileLock S;
    public FileChannel T;
    public ArrayList U;
    public ArrayList V;
    public final HashMap X;
    public final HashMap Y;
    public final HashMap Z;

    /* renamed from: a, reason: collision with root package name */
    public final w0 f27091a;

    /* renamed from: b0, reason: collision with root package name */
    public l2 f27093b0;

    /* renamed from: c0, reason: collision with root package name */
    public String f27094c0;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f27095d;

    /* renamed from: d0, reason: collision with root package name */
    public d3 f27096d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f27097e0;

    /* renamed from: g, reason: collision with root package name */
    public l f27099g;

    /* renamed from: r, reason: collision with root package name */
    public o0 f27100r;

    /* renamed from: x, reason: collision with root package name */
    public i3 f27101x;

    /* renamed from: y, reason: collision with root package name */
    public c f27102y;
    public final AtomicBoolean I = new AtomicBoolean(false);
    public final LinkedList M = new LinkedList();

    /* renamed from: a0, reason: collision with root package name */
    public final HashMap f27092a0 = new HashMap();

    /* renamed from: f0, reason: collision with root package name */
    public final y9.u f27098f0 = new y9.u(8, this);
    public long W = -1;
    public final m3 F = new m3(this);

    public p3(j4.k kVar) {
        this.H = c1.m(kVar.f13220a, null, null);
        m0 m0Var = new m0(this, 2);
        m0Var.u1();
        this.B = m0Var;
        m0 m0Var2 = new m0(this, 0);
        m0Var2.u1();
        this.f27095d = m0Var2;
        w0 w0Var = new w0(this);
        w0Var.u1();
        this.f27091a = w0Var;
        this.X = new HashMap();
        this.Y = new HashMap();
        this.Z = new HashMap();
        J().B1(new pb.l0(this, kVar));
    }

    public static final void A(com.google.android.gms.internal.measurement.y2 y2Var, String str) {
        List listH = y2Var.h();
        for (int i10 = 0; i10 < listH.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.c3) listH.get(i10)).q())) {
                y2Var.m(i10);
                return;
            }
        }
    }

    public static String I(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final boolean P(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.f5428d);
    }

    public static final void Q(k3 k3Var) {
        if (k3Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!k3Var.f26984r) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(k3Var.getClass())));
        }
    }

    public static final Boolean R(zzr zzrVar) {
        Boolean bool = zzrVar.L;
        String str = zzrVar.Y;
        if (!TextUtils.isEmpty(str)) {
            l1 l1Var = (l1) y9.u.j(str).f25996d;
            l1 l1Var2 = l1.UNINITIALIZED;
            int iOrdinal = l1Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static p3 y(Context context) {
        cc.s.h(context);
        cc.s.h(context.getApplicationContext());
        if (f27090g0 == null) {
            synchronized (p3.class) {
                try {
                    if (f27090g0 == null) {
                        f27090g0 = new p3(new j4.k(context, 1));
                    }
                } finally {
                }
            }
        }
        return f27090g0;
    }

    public static final void z(com.google.android.gms.internal.measurement.y2 y2Var, int i10, String str) {
        List listH = y2Var.h();
        for (int i11 = 0; i11 < listH.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.c3) listH.get(i11)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.b3 b3VarB = com.google.android.gms.internal.measurement.c3.B();
        b3VarB.h("_err");
        b3VarB.j(i10);
        com.google.android.gms.internal.measurement.c3 c3Var = (com.google.android.gms.internal.measurement.c3) b3VarB.e();
        com.google.android.gms.internal.measurement.b3 b3VarB2 = com.google.android.gms.internal.measurement.c3.B();
        b3VarB2.h("_ev");
        b3VarB2.i(str);
        com.google.android.gms.internal.measurement.c3 c3Var2 = (com.google.android.gms.internal.measurement.c3) b3VarB2.e();
        y2Var.k(c3Var);
        y2Var.k(c3Var2);
    }

    public final int B(String str, z7.j jVar) {
        n1 n1Var;
        l1 l1VarW1;
        w0 w0Var = this.f27091a;
        if (w0Var.N1(str) == null) {
            jVar.i(n1.AD_PERSONALIZATION, g.FAILSAFE);
            return 1;
        }
        l lVar = this.f27099g;
        Q(lVar);
        n0 n0VarU2 = lVar.u2(str);
        if (n0VarU2 == null || ((l1) y9.u.j(n0VarU2.s()).f25996d) != l1.POLICY || (l1VarW1 = w0Var.w1(str, (n1Var = n1.AD_PERSONALIZATION))) == l1.UNINITIALIZED) {
            n1 n1Var2 = n1.AD_PERSONALIZATION;
            jVar.i(n1Var2, g.REMOTE_DEFAULT);
            if (w0Var.M1(str, n1Var2)) {
                return 0;
            }
        } else {
            jVar.i(n1Var, g.REMOTE_ENFORCED_DEFAULT);
            if (l1VarW1 == l1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap C(com.google.android.gms.internal.measurement.z2 z2Var) {
        Serializable serializableH1;
        HashMap map = new HashMap();
        g0();
        HashMap map2 = new HashMap();
        for (com.google.android.gms.internal.measurement.c3 c3Var : z2Var.p()) {
            if (c3Var.q().startsWith("gad_") && (serializableH1 = m0.H1(c3Var)) != null) {
                map2.put(c3Var.q(), serializableH1);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    @Override // zc.k1
    public final gc.a C0() {
        c1 c1Var = this.H;
        cc.s.h(c1Var);
        return c1Var.G;
    }

    public final void D() {
        J().s1();
        if (this.M.isEmpty()) {
            return;
        }
        if (this.f27096d0 == null) {
            this.f27096d0 = new d3(this, this.H, 2);
        }
        if (this.f27096d0.f27006c != 0) {
            return;
        }
        C0().getClass();
        long jMax = Math.max(0L, ((Integer) u.B0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.f27097e0));
        x().K.c(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.f27096d0 == null) {
            this.f27096d0 = new d3(this, this.H, 2);
        }
        this.f27096d0.b(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(3:9|10|(4:12|13|(4:15|(1:22)|25|472)(18:26|27|(2:35|(3:37|(1:44)(1:43)|45)(0))(1:34)|46|(2:48|(3:50|(4:53|(1:477)(2:59|474)|60|51)|473))|61|62|(4:64|65|(0)(1:71)|(7:117|(5:121|(2:123|488)(2:124|(2:126|487)(1:489))|127|118|119)|486|128|(2:131|(3:137|(1:139)(2:140|(3:142|(3:145|(1:147)(1:505)|143)|504))|148)(2:135|136))(1:130)|149|(2:151|(6:(2:156|(6:158|159|193|(9:195|(4:198|(2:211|(2:213|491)(1:493))(5:202|(5:205|(2:208|206)|495|209|203)|494|210|492)|214|196)|490|215|(4:218|(3:497|220|500)(1:499)|498|216)|496|221|(2:224|222)|501)(1:225)|226|471))|160|193|(0)(0)|226|471)(7:161|162|192|193|(0)(0)|226|471))(2:163|(8:165|(6:(2:170|(6:172|159|193|(0)(0)|226|471))|173|193|(0)(0)|226|471)|162|192|193|(0)(0)|226|471)(7:174|(2:185|(2:186|(2:188|(2:503|190)(1:191))(1:502)))(0)|192|193|(0)(0)|226|471)))(3:136|149|(0)(0)))(1:72)|70|(3:73|74|(3:76|(2:78|480)(2:79|(2:81|481)(2:82|479))|83)(1:478))|84|(1:87)|(1:89)|90|(1:92)(1:93)|94|(4:99|(4:102|(2:104|484)(2:105|(2:107|483)(1:485))|108|100)|482|(1:(1:114)(1:115))(1:(1:111)(2:112|(0)(0))))|(0)(0))|227)(1:470))|228|(3:230|(2:232|(2:234|508)(2:235|(1:509)(3:237|(1:239)(1:240)|(1:511)(2:244|507))))(0)|245)|506|246|(3:247|248|(1:512)(2:250|(2:513|252)(1:514)))|253|(1:255)(2:256|(1:258))|259|(1:261)(1:262)|263|(1:265)(1:266)|267|(6:270|(1:272)|273|(2:275|516)(1:517)|276|268)|515|277|(2:282|(1:286))(1:281)|287|(1:289)|290|(1:292)|293|(2:295|(1:301))|302|(8:304|(8:308|309|(4:311|(2:313|(1:315))|(1:332)(5:319|(1:323)|325|(1:330)(1:329)|331)|333)(3:335|(4:466|337|342|(6:344|(3:347|(3:522|349|(3:351|355|(1:357)(6:358|(1:362)|363|(1:365)(1:367)|366|(3:369|(1:377)|378)(4:379|(3:381|(1:383)|384)(4:385|(1:387)(1:388)|389|(3:391|(1:393)|394)(2:395|(1:397)))|398|519)))(2:352|(0)(0)))(1:353)|345)|521|354|355|(0)(0))(3:354|355|(0)(0)))(3:341|342|(0)(0))|399)|334|520|399|305|306)|518|400|(1:402)|403|(2:406|404)|523)(1:407)|408|(1:410)(13:412|(9:414|(1:416)(1:417)|418|(1:420)(1:421)|422|(1:424)(1:425)|426|(1:428)(1:429)|430)|431|(3:433|(2:439|(1:441)(1:442))(1:438)|443)|444|(3:(2:448|525)(1:526)|449|445)|524|450|(1:452)|453|468|454|458)|411|431|(0)|444|(1:445)|524|450|(0)|453|468|454|458) */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0f21, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0f22, code lost:
    
        ((zc.c1) r2.f1504d).x().w1().d(zc.j0.A1(r1), r0, "Failed to remove unused event metadata. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x074f A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b19 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b4d A[PHI: r2
  0x0b4d: PHI (r2v54 long) = (r2v53 long), (r2v77 long) binds: [B:343:0x0b17, B:521:0x0b4d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b65 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0b88 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0e34 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0ef2 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:227:0x0713, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:222:0x06ed, B:224:0x06f3, B:226:0x06ff, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:230:0x072c, B:232:0x073e, B:234:0x0747, B:245:0x0777, B:235:0x074f, B:237:0x0758, B:239:0x075e, B:242:0x076a, B:244:0x0772, B:246:0x077a, B:247:0x0786, B:250:0x078e, B:252:0x07a0, B:253:0x07ab, B:255:0x07b3, B:259:0x07e2, B:261:0x07fe, B:263:0x0813, B:265:0x082f, B:267:0x0844, B:268:0x0860, B:270:0x0866, B:272:0x087e, B:273:0x088c, B:275:0x089c, B:276:0x08aa, B:277:0x08ad, B:279:0x08f7, B:281:0x08fd, B:287:0x0928, B:289:0x0930, B:290:0x094e, B:292:0x0954, B:293:0x0968, B:295:0x097f, B:297:0x0990, B:299:0x09a2, B:301:0x09ac, B:302:0x09af, B:304:0x0a0a, B:305:0x0a1d, B:308:0x0a25, B:311:0x0a44, B:313:0x0a5d, B:315:0x0a72, B:317:0x0a77, B:319:0x0a7b, B:321:0x0a7f, B:323:0x0a89, B:325:0x0a92, B:327:0x0a96, B:329:0x0a9c, B:331:0x0aa7, B:333:0x0ab5, B:399:0x0d1c, B:335:0x0abe, B:337:0x0adc, B:342:0x0af9, B:344:0x0b19, B:345:0x0b21, B:347:0x0b27, B:349:0x0b39, B:355:0x0b4f, B:357:0x0b65, B:358:0x0b88, B:360:0x0b94, B:362:0x0baa, B:363:0x0bea, B:369:0x0c06, B:371:0x0c11, B:373:0x0c15, B:375:0x0c19, B:377:0x0c1d, B:378:0x0c29, B:379:0x0c2e, B:381:0x0c34, B:383:0x0c4c, B:384:0x0c51, B:398:0x0d19, B:385:0x0c90, B:387:0x0c95, B:391:0x0ca9, B:393:0x0cc8, B:394:0x0ccf, B:397:0x0d0d, B:388:0x0c9a, B:340:0x0ae2, B:400:0x0d27, B:402:0x0d34, B:403:0x0d48, B:404:0x0d50, B:406:0x0d56, B:408:0x0d6c, B:410:0x0d7e, B:431:0x0e2e, B:433:0x0e34, B:435:0x0e49, B:438:0x0e50, B:443:0x0e93, B:439:0x0e5f, B:441:0x0e6d, B:442:0x0e7a, B:444:0x0ea2, B:445:0x0ebb, B:448:0x0ec3, B:449:0x0ec8, B:450:0x0ed8, B:452:0x0ef2, B:453:0x0f0f, B:454:0x0f17, B:458:0x0f37, B:457:0x0f22, B:412:0x0d9a, B:414:0x0da0, B:416:0x0db0, B:418:0x0db7, B:424:0x0dcd, B:426:0x0dd4, B:428:0x0e1f, B:430:0x0e26, B:429:0x0e23, B:425:0x0dd1, B:417:0x0db4, B:282:0x090d, B:284:0x0913, B:286:0x0919, B:266:0x0841, B:262:0x0810, B:256:0x07b9, B:258:0x07bf, B:459:0x0f40), top: B:465:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(long r47, java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 3928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.E(long, java.lang.String):boolean");
    }

    public final void F(com.google.android.gms.internal.measurement.g3 g3Var, long j, boolean z10) {
        r3 r3Var;
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        l lVar = this.f27099g;
        Q(lVar);
        r3 r3VarM2 = lVar.m2(g3Var.o(), str);
        if (r3VarM2 == null || (obj = r3VarM2.f27137e) == null) {
            String strO = g3Var.o();
            C0().getClass();
            r3Var = new r3(strO, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strO2 = g3Var.o();
            C0().getClass();
            r3Var = new r3(strO2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        com.google.android.gms.internal.measurement.q3 q3VarA = com.google.android.gms.internal.measurement.r3.A();
        q3VarA.b();
        ((com.google.android.gms.internal.measurement.r3) q3VarA.f5042d).C(str);
        C0().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q3VarA.b();
        ((com.google.android.gms.internal.measurement.r3) q3VarA.f5042d).B(jCurrentTimeMillis);
        Object obj2 = r3Var.f27137e;
        long jLongValue = ((Long) obj2).longValue();
        q3VarA.b();
        ((com.google.android.gms.internal.measurement.r3) q3VarA.f5042d).F(jLongValue);
        com.google.android.gms.internal.measurement.r3 r3Var2 = (com.google.android.gms.internal.measurement.r3) q3VarA.e();
        int iG2 = m0.g2(g3Var, str);
        if (iG2 >= 0) {
            g3Var.b();
            ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).c0(iG2, r3Var2);
        } else {
            g3Var.b();
            ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).d0(r3Var2);
        }
        if (j > 0) {
            l lVar2 = this.f27099g;
            Q(lVar2);
            lVar2.l2(r3Var);
            x().K.d(true != z10 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean G(com.google.android.gms.internal.measurement.y2 y2Var, com.google.android.gms.internal.measurement.y2 y2Var2) {
        cc.s.b("_e".equals(y2Var.n()));
        g0();
        com.google.android.gms.internal.measurement.c3 c3VarA1 = m0.A1((com.google.android.gms.internal.measurement.z2) y2Var.e(), "_sc");
        String strS = c3VarA1 == null ? null : c3VarA1.s();
        g0();
        com.google.android.gms.internal.measurement.c3 c3VarA12 = m0.A1((com.google.android.gms.internal.measurement.z2) y2Var2.e(), "_pc");
        String strS2 = c3VarA12 != null ? c3VarA12.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        cc.s.b("_e".equals(y2Var.n()));
        g0();
        com.google.android.gms.internal.measurement.c3 c3VarA13 = m0.A1((com.google.android.gms.internal.measurement.z2) y2Var.e(), "_et");
        if (c3VarA13 == null || !c3VarA13.t() || c3VarA13.u() <= 0) {
            return true;
        }
        long jU = c3VarA13.u();
        g0();
        com.google.android.gms.internal.measurement.c3 c3VarA14 = m0.A1((com.google.android.gms.internal.measurement.z2) y2Var2.e(), "_et");
        if (c3VarA14 != null && c3VarA14.u() > 0) {
            jU += c3VarA14.u();
        }
        g0();
        m0.y1(y2Var2, "_et", Long.valueOf(jU));
        g0();
        m0.y1(y2Var, "_fr", 1L);
        return true;
    }

    public final boolean H() {
        J().s1();
        i0();
        l lVar = this.f27099g;
        Q(lVar);
        if (lVar.c2("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        l lVar2 = this.f27099g;
        Q(lVar2);
        return !TextUtils.isEmpty(lVar2.A1());
    }

    @Override // zc.k1
    public final a1 J() {
        c1 c1Var = this.H;
        cc.s.h(c1Var);
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        return a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K() {
        /*
            Method dump skipped, instructions count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.K():void");
    }

    public final void L() {
        J().s1();
        if (this.P || this.Q || this.R) {
            x().K.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.P), Boolean.valueOf(this.Q), Boolean.valueOf(this.R));
            return;
        }
        x().K.b("Stopping uploading service(s)");
        ArrayList arrayList = this.L;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.L;
        cc.s.h(arrayList2);
        arrayList2.clear();
    }

    public final Boolean M(n0 n0Var) {
        try {
            long jP = n0Var.P();
            c1 c1Var = this.H;
            if (jP != -2147483648L) {
                if (n0Var.P() == ic.c.a(c1Var.f26884a).c(0, n0Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = ic.c.a(c1Var.f26884a).c(0, n0Var.D()).versionName;
                String strN = n0Var.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final zzr N(String str) {
        l lVar = this.f27099g;
        Q(lVar);
        n0 n0VarU2 = lVar.u2(str);
        if (n0VarU2 != null) {
            c1 c1Var = n0VarU2.f27019a;
            if (!TextUtils.isEmpty(n0VarU2.N())) {
                Boolean boolM = M(n0VarU2);
                if (boolM != null && !boolM.booleanValue()) {
                    x().B.c(j0.A1(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = n0VarU2.G();
                String strN = n0VarU2.N();
                long jP = n0VarU2.P();
                a1 a1Var = c1Var.B;
                c1.g(a1Var);
                a1Var.s1();
                String str2 = n0VarU2.f27028l;
                a1 a1Var2 = c1Var.B;
                c1.g(a1Var2);
                a1Var2.s1();
                long j = n0VarU2.f27029m;
                a1 a1Var3 = c1Var.B;
                c1.g(a1Var3);
                a1Var3.s1();
                long j7 = n0VarU2.f27030n;
                a1 a1Var4 = c1Var.B;
                c1.g(a1Var4);
                a1Var4.s1();
                boolean z10 = n0VarU2.f27031o;
                String strJ = n0VarU2.J();
                a1 a1Var5 = c1Var.B;
                c1.g(a1Var5);
                a1Var5.s1();
                boolean z11 = n0VarU2.f27032p;
                Boolean boolW = n0VarU2.w();
                long jB = n0VarU2.b();
                a1 a1Var6 = c1Var.B;
                c1.g(a1Var6);
                a1Var6.s1();
                ArrayList arrayList = n0VarU2.f27035s;
                String strG2 = a(str).g();
                boolean zY = n0VarU2.y();
                a1 a1Var7 = c1Var.B;
                c1.g(a1Var7);
                a1Var7.s1();
                long j10 = n0VarU2.f27038v;
                int i10 = a(str).f27054b;
                String str3 = l0(str).f27015b;
                a1 a1Var8 = c1Var.B;
                c1.g(a1Var8);
                a1Var8.s1();
                int i11 = n0VarU2.f27040x;
                a1 a1Var9 = c1Var.B;
                c1.g(a1Var9);
                a1Var9.s1();
                return new zzr(str, strG, strN, jP, str2, j, j7, (String) null, z10, false, strJ, 0L, 0, z11, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j10, i10, str3, i11, n0VarU2.B, n0VarU2.C(), n0VarU2.s(), 0L, n0VarU2.t());
            }
        }
        x().J.c(str, "No app data available; dropping");
        return null;
    }

    public final boolean O(String str, String str2) {
        l lVar = this.f27099g;
        Q(lVar);
        p pVarQ1 = lVar.Q1("events", str, str2);
        return pVarQ1 == null || pVarQ1.f27063c < 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(com.google.android.gms.measurement.internal.zzpl r24, com.google.android.gms.measurement.internal.zzr r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.S(com.google.android.gms.measurement.internal.zzpl, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void T(String str, zzr zzrVar) {
        J().s1();
        i0();
        boolean zP = P(zzrVar);
        String str2 = zzrVar.f5426a;
        if (zP) {
            if (!zzrVar.D) {
                Y(zzrVar);
                return;
            }
            Boolean boolR = R(zzrVar);
            if ("_npa".equals(str) && boolR != null) {
                x().J.b("Falling back to manifest metadata value for ad personalization");
                C0().getClass();
                S(new zzpl(System.currentTimeMillis(), Long.valueOf(true != boolR.booleanValue() ? 0L : 1L), "_npa", "auto"), zzrVar);
                return;
            }
            su.b bVar = x().J;
            c1 c1Var = this.H;
            bVar.c(c1Var.F.c(str), "Removing user property");
            l lVar = this.f27099g;
            Q(lVar);
            lVar.e2();
            try {
                Y(zzrVar);
                if ("_id".equals(str)) {
                    l lVar2 = this.f27099g;
                    Q(lVar2);
                    cc.s.h(str2);
                    lVar2.k2(str2, "_lair");
                }
                l lVar3 = this.f27099g;
                Q(lVar3);
                cc.s.h(str2);
                lVar3.k2(str2, str);
                l lVar4 = this.f27099g;
                Q(lVar4);
                lVar4.f2();
                x().J.c(c1Var.F.c(str), "User property removed");
                l lVar5 = this.f27099g;
                Q(lVar5);
                lVar5.g2();
            } catch (Throwable th2) {
                l lVar6 = this.f27099g;
                Q(lVar6);
                lVar6.g2();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0422 A[Catch: all -> 0x02ca, TryCatch #3 {all -> 0x02ca, blocks: (B:105:0x0297, B:107:0x02b5, B:150:0x037e, B:151:0x0381, B:153:0x038e, B:154:0x039e, B:165:0x0446, B:112:0x02cd, B:117:0x02ed, B:119:0x02f5, B:121:0x02fc, B:125:0x030f, B:129:0x0321, B:133:0x032d, B:136:0x0340, B:141:0x035f, B:143:0x0367, B:145:0x036f, B:147:0x0375, B:139:0x034d, B:127:0x031a, B:115:0x02db, B:155:0x03b7, B:157:0x03ec, B:158:0x03ef, B:160:0x03fc, B:161:0x040a, B:162:0x0422, B:164:0x042a), top: B:176:0x0138, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x011f, B:56:0x013a, B:59:0x0153, B:67:0x019b, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:174:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.measurement.internal.zzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [zc.p3] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [zc.p3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(com.google.android.gms.measurement.internal.zzr r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.U(com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void V(zzah zzahVar, zzr zzrVar) {
        zzbg zzbgVar;
        cc.s.e(zzahVar.f5397a);
        cc.s.h(zzahVar.f5398d);
        cc.s.h(zzahVar.f5399g);
        cc.s.e(zzahVar.f5399g.f5421d);
        J().s1();
        i0();
        if (P(zzrVar)) {
            if (!zzrVar.D) {
                Y(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z10 = false;
            zzahVar2.f5401x = false;
            l lVar = this.f27099g;
            Q(lVar);
            lVar.e2();
            try {
                l lVar2 = this.f27099g;
                Q(lVar2);
                String str = zzahVar2.f5397a;
                cc.s.h(str);
                zzah zzahVarQ2 = lVar2.q2(str, zzahVar2.f5399g.f5421d);
                c1 c1Var = this.H;
                if (zzahVarQ2 != null && !zzahVarQ2.f5398d.equals(zzahVar2.f5398d)) {
                    x().F.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", c1Var.F.c(zzahVar2.f5399g.f5421d), zzahVar2.f5398d, zzahVarQ2.f5398d);
                }
                if (zzahVarQ2 != null && zzahVarQ2.f5401x) {
                    zzahVar2.f5398d = zzahVarQ2.f5398d;
                    zzahVar2.f5400r = zzahVarQ2.f5400r;
                    zzahVar2.D = zzahVarQ2.D;
                    zzahVar2.f5402y = zzahVarQ2.f5402y;
                    zzahVar2.E = zzahVarQ2.E;
                    zzahVar2.f5401x = true;
                    zzpl zzplVar = zzahVar2.f5399g;
                    zzahVar2.f5399g = new zzpl(zzahVarQ2.f5399g.f5422g, zzplVar.d(), zzplVar.f5421d, zzahVarQ2.f5399g.f5425y);
                } else if (TextUtils.isEmpty(zzahVar2.f5402y)) {
                    zzpl zzplVar2 = zzahVar2.f5399g;
                    zzahVar2.f5399g = new zzpl(zzahVar2.f5400r, zzplVar2.d(), zzplVar2.f5421d, zzahVar2.f5399g.f5425y);
                    zzahVar2.f5401x = true;
                    z10 = true;
                }
                if (zzahVar2.f5401x) {
                    zzpl zzplVar3 = zzahVar2.f5399g;
                    String str2 = zzahVar2.f5397a;
                    cc.s.h(str2);
                    String str3 = zzahVar2.f5398d;
                    String str4 = zzplVar3.f5421d;
                    long j = zzplVar3.f5422g;
                    Object objD = zzplVar3.d();
                    cc.s.h(objD);
                    r3 r3Var = new r3(str2, str3, str4, j, objD);
                    Object obj = r3Var.f27137e;
                    String str5 = r3Var.f27135c;
                    l lVar3 = this.f27099g;
                    Q(lVar3);
                    if (lVar3.l2(r3Var)) {
                        x().J.e("User property updated immediately", zzahVar2.f5397a, c1Var.F.c(str5), obj);
                    } else {
                        x().B.e("(2)Too many active user properties, ignoring", j0.A1(zzahVar2.f5397a), c1Var.F.c(str5), obj);
                    }
                    if (z10 && (zzbgVar = zzahVar2.E) != null) {
                        g(new zzbg(zzbgVar, zzahVar2.f5400r), zzrVar);
                    }
                }
                l lVar4 = this.f27099g;
                Q(lVar4);
                if (lVar4.p2(zzahVar2)) {
                    x().J.e("Conditional property added", zzahVar2.f5397a, c1Var.F.c(zzahVar2.f5399g.f5421d), zzahVar2.f5399g.d());
                } else {
                    x().B.e("Too many conditional properties, ignoring", j0.A1(zzahVar2.f5397a), c1Var.F.c(zzahVar2.f5399g.f5421d), zzahVar2.f5399g.d());
                }
                l lVar5 = this.f27099g;
                Q(lVar5);
                lVar5.f2();
                l lVar6 = this.f27099g;
                Q(lVar6);
                lVar6.g2();
            } catch (Throwable th2) {
                l lVar7 = this.f27099g;
                Q(lVar7);
                lVar7.g2();
                throw th2;
            }
        }
    }

    public final void W(zzah zzahVar, zzr zzrVar) {
        cc.s.e(zzahVar.f5397a);
        cc.s.h(zzahVar.f5399g);
        cc.s.e(zzahVar.f5399g.f5421d);
        J().s1();
        i0();
        if (P(zzrVar)) {
            if (!zzrVar.D) {
                Y(zzrVar);
                return;
            }
            l lVar = this.f27099g;
            Q(lVar);
            lVar.e2();
            try {
                Y(zzrVar);
                String str = zzahVar.f5397a;
                cc.s.h(str);
                l lVar2 = this.f27099g;
                Q(lVar2);
                zzah zzahVarQ2 = lVar2.q2(str, zzahVar.f5399g.f5421d);
                c1 c1Var = this.H;
                if (zzahVarQ2 != null) {
                    x().J.d(zzahVar.f5397a, c1Var.F.c(zzahVar.f5399g.f5421d), "Removing conditional user property");
                    l lVar3 = this.f27099g;
                    Q(lVar3);
                    lVar3.r2(str, zzahVar.f5399g.f5421d);
                    if (zzahVarQ2.f5401x) {
                        l lVar4 = this.f27099g;
                        Q(lVar4);
                        lVar4.k2(str, zzahVar.f5399g.f5421d);
                    }
                    zzbg zzbgVar = zzahVar.G;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.f5406d;
                        zzbg zzbgVarU1 = h0().U1(zzbgVar.f5405a, zzbeVar != null ? zzbeVar.j() : null, zzahVarQ2.f5398d, zzbgVar.f5408r, true);
                        cc.s.h(zzbgVarU1);
                        g(zzbgVarU1, zzrVar);
                    }
                } else {
                    x().F.d(j0.A1(zzahVar.f5397a), c1Var.F.c(zzahVar.f5399g.f5421d), "Conditional user property doesn't exist");
                }
                l lVar5 = this.f27099g;
                Q(lVar5);
                lVar5.f2();
                l lVar6 = this.f27099g;
                Q(lVar6);
                lVar6.g2();
            } catch (Throwable th2) {
                l lVar7 = this.f27099g;
                Q(lVar7);
                lVar7.g2();
                throw th2;
            }
        }
    }

    public final void X(zzr zzrVar, long j) throws Throwable {
        l lVar = this.f27099g;
        Q(lVar);
        String str = zzrVar.f5426a;
        cc.s.h(str);
        n0 n0VarU2 = lVar.u2(str);
        if (n0VarU2 != null) {
            h0();
            String str2 = zzrVar.f5428d;
            String strG = n0VarU2.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                cc.s.h(str2);
                if (!str2.equals(strG)) {
                    x().F.c(j0.A1(n0VarU2.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    l lVar2 = this.f27099g;
                    Q(lVar2);
                    c1 c1Var = (c1) lVar2.f1504d;
                    String strD = n0VarU2.D();
                    lVar2.t1();
                    lVar2.s1();
                    cc.s.e(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseH2 = lVar2.h2();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseH2.delete("events", "app_id=?", strArr) + sQLiteDatabaseH2.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseH2.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseH2.delete("apps", "app_id=?", strArr) + sQLiteDatabaseH2.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseH2.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseH2.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseH2.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseH2.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseH2.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseH2.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseH2.delete("trigger_uris", "app_id=?", strArr);
                        if (c1Var.f26887r.C1(null, u.f27184h1)) {
                            iDelete += sQLiteDatabaseH2.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            j0 j0Var = c1Var.f26889y;
                            c1.g(j0Var);
                            j0Var.K.d(strD, Integer.valueOf(iDelete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e4) {
                        j0 j0Var2 = c1Var.f26889y;
                        c1.g(j0Var2);
                        j0Var2.B.d(j0.A1(strD), e4, "Error deleting application data. appId, error");
                    }
                    n0VarU2 = null;
                }
            }
        }
        if (n0VarU2 != null) {
            boolean z10 = (n0VarU2.P() == -2147483648L || n0VarU2.P() == zzrVar.F) ? false : true;
            String strN = n0VarU2.N();
            if (z10 || ((n0VarU2.P() != -2147483648L || strN == null || strN.equals(zzrVar.f5429g)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strN);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j);
                if (b0().C1(null, u.f27169c1)) {
                    d(zzbgVar, zzrVar);
                } else {
                    e(zzbgVar, zzrVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.n0 Y(com.google.android.gms.measurement.internal.zzr r13) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.Y(com.google.android.gms.measurement.internal.zzr):zc.n0");
    }

    @Override // zc.k1
    public final d Z() {
        return this.H.f26886g;
    }

    public final o1 a(String str) {
        o1 o1Var = o1.f27052c;
        J().s1();
        i0();
        HashMap map = this.X;
        o1 o1VarL1 = (o1) map.get(str);
        if (o1VarL1 == null) {
            l lVar = this.f27099g;
            Q(lVar);
            o1VarL1 = lVar.L1(str);
            if (o1VarL1 == null) {
                o1VarL1 = o1.f27052c;
            }
            J().s1();
            i0();
            map.put(str, o1VarL1);
            l lVar2 = this.f27099g;
            Q(lVar2);
            lVar2.N1(str, o1VarL1);
        }
        return o1VarL1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List a0(Bundle bundle, zzr zzrVar) {
        int[] iArr;
        J().s1();
        q8.a();
        f fVarB0 = b0();
        String str = zzrVar.f5426a;
        if (!fVarB0.C1(str, u.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    x().B.b("Uri sources and timestamps do not match");
                } else {
                    int i10 = 0;
                    while (i10 < intArray.length) {
                        l lVar = this.f27099g;
                        Q(lVar);
                        c1 c1Var = (c1) lVar.f1504d;
                        int i11 = intArray[i10];
                        long j = longArray[i10];
                        cc.s.e(str);
                        lVar.s1();
                        lVar.t1();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = lVar.h2().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j)});
                                j0 j0Var = c1Var.f26889y;
                                c1.g(j0Var);
                                su.b bVar = j0Var.K;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb2.append("Pruned ");
                                sb2.append(iDelete);
                                sb2.append(" trigger URIs. appId, source, timestamp");
                                bVar.e(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j));
                            } catch (SQLiteException e4) {
                                e = e4;
                                j0 j0Var2 = c1Var.f26889y;
                                c1.g(j0Var2);
                                j0Var2.B.d(j0.A1(str), e, "Error pruning trigger URIs. appId");
                                i10++;
                                intArray = iArr;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            iArr = intArray;
                        }
                        i10++;
                        intArray = iArr;
                    }
                }
            }
        }
        l lVar2 = this.f27099g;
        Q(lVar2);
        String str2 = zzrVar.f5426a;
        cc.s.e(str2);
        lVar2.s1();
        lVar2.t1();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = lVar2.h2().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursorQuery.getInt(2), cursorQuery.getLong(1)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e11) {
                j0 j0Var3 = ((c1) lVar2.f1504d).f26889y;
                c1.g(j0Var3);
                j0Var3.B.d(j0.A1(str2), e11, "Error querying trigger uris. appId");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final long b() {
        C0().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        z2 z2Var = this.E;
        z2Var.t1();
        z2Var.s1();
        d5.y0 y0Var = z2Var.G;
        long jE = y0Var.e();
        if (jE == 0) {
            c1.e(((c1) z2Var.f1504d).E);
            jE = r2.p2().nextInt(86400000) + 1;
            y0Var.f(jE);
        }
        return ((((jCurrentTimeMillis + jE) / 1000) / 60) / 60) / 24;
    }

    public final f b0() {
        c1 c1Var = this.H;
        cc.s.h(c1Var);
        return c1Var.f26887r;
    }

    public final void c(zzbg zzbgVar, String str) throws Throwable {
        l lVar = this.f27099g;
        Q(lVar);
        n0 n0VarU2 = lVar.u2(str);
        if (n0VarU2 != null) {
            c1 c1Var = n0VarU2.f27019a;
            if (!TextUtils.isEmpty(n0VarU2.N())) {
                Boolean boolM = M(n0VarU2);
                if (boolM == null) {
                    if (!"_ui".equals(zzbgVar.f5405a)) {
                        x().F.c(j0.A1(str), "Could not find package. appId");
                    }
                } else if (!boolM.booleanValue()) {
                    x().B.c(j0.A1(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = n0VarU2.G();
                String strN = n0VarU2.N();
                long jP = n0VarU2.P();
                a1 a1Var = c1Var.B;
                c1.g(a1Var);
                a1Var.s1();
                String str2 = n0VarU2.f27028l;
                a1 a1Var2 = c1Var.B;
                c1.g(a1Var2);
                a1Var2.s1();
                long j = n0VarU2.f27029m;
                a1 a1Var3 = c1Var.B;
                c1.g(a1Var3);
                a1Var3.s1();
                long j7 = n0VarU2.f27030n;
                a1 a1Var4 = c1Var.B;
                c1.g(a1Var4);
                a1Var4.s1();
                boolean z10 = n0VarU2.f27031o;
                String strJ = n0VarU2.J();
                a1 a1Var5 = c1Var.B;
                c1.g(a1Var5);
                a1Var5.s1();
                boolean z11 = n0VarU2.f27032p;
                Boolean boolW = n0VarU2.w();
                long jB = n0VarU2.b();
                a1 a1Var6 = c1Var.B;
                c1.g(a1Var6);
                a1Var6.s1();
                ArrayList arrayList = n0VarU2.f27035s;
                String strG2 = a(str).g();
                boolean zY = n0VarU2.y();
                a1 a1Var7 = c1Var.B;
                c1.g(a1Var7);
                a1Var7.s1();
                long j10 = n0VarU2.f27038v;
                int i10 = a(str).f27054b;
                String str3 = l0(str).f27015b;
                a1 a1Var8 = c1Var.B;
                c1.g(a1Var8);
                a1Var8.s1();
                int i11 = n0VarU2.f27040x;
                a1 a1Var9 = c1Var.B;
                c1.g(a1Var9);
                a1Var9.s1();
                d(zzbgVar, new zzr(str, strG, strN, jP, str2, j, j7, (String) null, z10, false, strJ, 0L, 0, z11, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j10, i10, str3, i11, n0VarU2.B, n0VarU2.C(), n0VarU2.s(), 0L, n0VarU2.t()));
                return;
            }
        }
        x().J.c(str, "No app data available; dropping event");
    }

    public final w0 c0() {
        w0 w0Var = this.f27091a;
        Q(w0Var);
        return w0Var;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.measurement.internal.zzbg r11, com.google.android.gms.measurement.internal.zzr r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.d(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final l d0() {
        l lVar = this.f27099g;
        Q(lVar);
        return lVar;
    }

    public final void e(zzbg zzbgVar, zzr zzrVar) throws MalformedURLException, URISyntaxException, NumberFormatException, SQLException {
        zzbg zzbgVar2;
        List listT2;
        c1 c1Var;
        List listT22;
        List<zzah> listT23;
        String str;
        cc.s.h(zzrVar);
        String str2 = zzrVar.f5426a;
        cc.s.e(str2);
        J().s1();
        i0();
        long j = zzbgVar.f5408r;
        su.l lVarD = su.l.d(zzbgVar);
        J().s1();
        s3.j2((this.f27093b0 == null || (str = this.f27094c0) == null || !str.equals(str2)) ? null : this.f27093b0, (Bundle) lVarD.f22360e, false);
        zzbg zzbgVarE = lVarD.e();
        g0();
        if (TextUtils.isEmpty(zzrVar.f5428d)) {
            return;
        }
        if (!zzrVar.D) {
            Y(zzrVar);
            return;
        }
        List list = zzrVar.N;
        if (list != null) {
            String str3 = zzbgVarE.f5405a;
            if (!list.contains(str3)) {
                x().J.e("Dropping non-safelisted event. appId, event name, origin", str2, zzbgVarE.f5405a, zzbgVarE.f5407g);
                return;
            } else {
                Bundle bundleJ = zzbgVarE.f5406d.j();
                bundleJ.putLong("ga_safelisted", 1L);
                zzbgVar2 = new zzbg(str3, new zzbe(bundleJ), zzbgVarE.f5407g, zzbgVarE.f5408r);
            }
        } else {
            zzbgVar2 = zzbgVarE;
        }
        l lVar = this.f27099g;
        Q(lVar);
        lVar.e2();
        try {
            String str4 = zzbgVar2.f5405a;
            if ("_s".equals(str4)) {
                l lVar2 = this.f27099g;
                Q(lVar2);
                if (!lVar2.H1(str2, "_s") && zzbgVar2.f5406d.f5404a.getLong("_sid") != 0) {
                    l lVar3 = this.f27099g;
                    Q(lVar3);
                    if (lVar3.H1(str2, "_f")) {
                        l lVar4 = this.f27099g;
                        Q(lVar4);
                        lVar4.K1(str2, null, "_sid", f(zzbgVar2, str2));
                    } else {
                        l lVar5 = this.f27099g;
                        Q(lVar5);
                        if (lVar5.H1(str2, "_v")) {
                            l lVar42 = this.f27099g;
                            Q(lVar42);
                            lVar42.K1(str2, null, "_sid", f(zzbgVar2, str2));
                        } else {
                            l lVar6 = this.f27099g;
                            Q(lVar6);
                            C0().getClass();
                            lVar6.K1(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", f(zzbgVar2, str2));
                        }
                    }
                }
            }
            l lVar7 = this.f27099g;
            Q(lVar7);
            cc.s.e(str2);
            lVar7.s1();
            lVar7.t1();
            if (j < 0) {
                j0 j0Var = ((c1) lVar7.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.F.d(j0.A1(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                listT2 = Collections.EMPTY_LIST;
            } else {
                listT2 = lVar7.t2("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listT2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c1Var = this.H;
                if (!zHasNext) {
                    break;
                }
                zzah zzahVar = (zzah) it.next();
                if (zzahVar != null) {
                    x().K.e("User property timed out", zzahVar.f5397a, c1Var.F.c(zzahVar.f5399g.f5421d), zzahVar.f5399g.d());
                    zzbg zzbgVar3 = zzahVar.B;
                    if (zzbgVar3 != null) {
                        g(new zzbg(zzbgVar3, j), zzrVar);
                    }
                    l lVar8 = this.f27099g;
                    Q(lVar8);
                    lVar8.r2(str2, zzahVar.f5399g.f5421d);
                }
            }
            l lVar9 = this.f27099g;
            Q(lVar9);
            cc.s.e(str2);
            lVar9.s1();
            lVar9.t1();
            if (j < 0) {
                j0 j0Var2 = ((c1) lVar9.f1504d).f26889y;
                c1.g(j0Var2);
                j0Var2.F.d(j0.A1(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                listT22 = Collections.EMPTY_LIST;
            } else {
                listT22 = lVar9.t2("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listT22.size());
            Iterator it2 = listT22.iterator();
            while (it2.hasNext()) {
                zzah zzahVar2 = (zzah) it2.next();
                if (zzahVar2 != null) {
                    Iterator it3 = it2;
                    x().K.e("User property expired", zzahVar2.f5397a, c1Var.F.c(zzahVar2.f5399g.f5421d), zzahVar2.f5399g.d());
                    l lVar10 = this.f27099g;
                    Q(lVar10);
                    lVar10.k2(str2, zzahVar2.f5399g.f5421d);
                    zzbg zzbgVar4 = zzahVar2.G;
                    if (zzbgVar4 != null) {
                        arrayList.add(zzbgVar4);
                    }
                    l lVar11 = this.f27099g;
                    Q(lVar11);
                    lVar11.r2(str2, zzahVar2.f5399g.f5421d);
                    it2 = it3;
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                g(new zzbg((zzbg) it4.next(), j), zzrVar);
            }
            l lVar12 = this.f27099g;
            Q(lVar12);
            cc.s.e(str2);
            cc.s.e(str4);
            lVar12.s1();
            lVar12.t1();
            if (j < 0) {
                c1 c1Var2 = (c1) lVar12.f1504d;
                j0 j0Var3 = c1Var2.f26889y;
                c1.g(j0Var3);
                j0Var3.F.e("Invalid time querying triggered conditional properties", j0.A1(str2), c1Var2.F.a(str4), Long.valueOf(j));
                listT23 = Collections.EMPTY_LIST;
            } else {
                listT23 = lVar12.t2("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listT23.size());
            for (zzah zzahVar3 : listT23) {
                if (zzahVar3 != null) {
                    zzpl zzplVar = zzahVar3.f5399g;
                    String str5 = zzahVar3.f5397a;
                    cc.s.h(str5);
                    String str6 = zzahVar3.f5398d;
                    String str7 = zzplVar.f5421d;
                    Object objD = zzplVar.d();
                    cc.s.h(objD);
                    r3 r3Var = new r3(str5, str6, str7, j, objD);
                    Object obj = r3Var.f27137e;
                    String str8 = r3Var.f27135c;
                    l lVar13 = this.f27099g;
                    Q(lVar13);
                    if (lVar13.l2(r3Var)) {
                        x().K.e("User property triggered", zzahVar3.f5397a, c1Var.F.c(str8), obj);
                    } else {
                        x().B.e("Too many active user properties, ignoring", j0.A1(zzahVar3.f5397a), c1Var.F.c(str8), obj);
                    }
                    zzbg zzbgVar5 = zzahVar3.E;
                    if (zzbgVar5 != null) {
                        arrayList2.add(zzbgVar5);
                    }
                    zzahVar3.f5399g = new zzpl(r3Var);
                    zzahVar3.f5401x = true;
                    l lVar14 = this.f27099g;
                    Q(lVar14);
                    lVar14.p2(zzahVar3);
                }
            }
            g(zzbgVar2, zzrVar);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                g(new zzbg((zzbg) it5.next(), j), zzrVar);
            }
            l lVar15 = this.f27099g;
            Q(lVar15);
            lVar15.f2();
            l lVar16 = this.f27099g;
            Q(lVar16);
            lVar16.g2();
        } catch (Throwable th2) {
            l lVar17 = this.f27099g;
            Q(lVar17);
            lVar17.g2();
            throw th2;
        }
    }

    public final o0 e0() {
        o0 o0Var = this.f27100r;
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final Bundle f(zzbg zzbgVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.f5406d.f5404a.getLong("_sid"));
        l lVar = this.f27099g;
        Q(lVar);
        r3 r3VarM2 = lVar.m2(str, "_sno");
        if (r3VarM2 != null) {
            Object obj = r3VarM2.f27137e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final c f0() {
        c cVar = this.f27102y;
        Q(cVar);
        return cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:74|(12:76|(0)(1:79)|80|87|(1:89)|91|(0)(0)|94|102|(0)(0)|157|158)|78|81|395|82|86|80|87|(0)(0)|91|(0)(0)|94|102|(0)(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02fe, code lost:
    
        ((zc.c1) r10.f1504d).x().w1().d(zc.j0.A1(r13), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e5 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0885 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0895 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09b2 A[Catch: all -> 0x0942, TryCatch #1 {all -> 0x0942, blocks: (B:270:0x08b0, B:272:0x08bb, B:274:0x08c9, B:276:0x08d3, B:279:0x08e7, B:281:0x08f3, B:283:0x08ff, B:285:0x0909, B:287:0x0917, B:289:0x092f, B:293:0x094a, B:295:0x0958, B:296:0x0961, B:298:0x096d, B:300:0x09b2, B:303:0x09bd, B:304:0x09c7, B:305:0x09c8, B:307:0x09d2, B:273:0x08c0), top: B:381:0x08b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x09d2 A[Catch: all -> 0x0942, TRY_LEAVE, TryCatch #1 {all -> 0x0942, blocks: (B:270:0x08b0, B:272:0x08bb, B:274:0x08c9, B:276:0x08d3, B:279:0x08e7, B:281:0x08f3, B:283:0x08ff, B:285:0x0909, B:287:0x0917, B:289:0x092f, B:293:0x094a, B:295:0x0958, B:296:0x0961, B:298:0x096d, B:300:0x09b2, B:303:0x09bd, B:304:0x09c7, B:305:0x09c8, B:307:0x09d2, B:273:0x08c0), top: B:381:0x08b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a3f A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a5d A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0a76 A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0b7c A[Catch: all -> 0x09fe, TryCatch #7 {all -> 0x09fe, blocks: (B:309:0x09db, B:311:0x09f0, B:315:0x0a01, B:317:0x0a37, B:319:0x0a3f, B:321:0x0a49, B:322:0x0a53, B:324:0x0a5d, B:325:0x0a67, B:326:0x0a70, B:328:0x0a76, B:330:0x0ac0, B:332:0x0ad2, B:336:0x0af1, B:338:0x0b01, B:335:0x0ae1, B:342:0x0b14, B:343:0x0b56, B:344:0x0b61, B:345:0x0b76, B:347:0x0b7c, B:356:0x0bc9, B:357:0x0c15, B:359:0x0c26, B:373:0x0c8f, B:364:0x0c40, B:365:0x0c43, B:350:0x0b8b, B:352:0x0bb5, B:370:0x0c60, B:371:0x0c79, B:372:0x0c7a), top: B:391:0x09db, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0c26 A[Catch: all -> 0x09fe, SQLiteException -> 0x0c3c, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0c3c, blocks: (B:357:0x0c15, B:359:0x0c26), top: B:387:0x0c15, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0b8b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338 A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e A[Catch: all -> 0x01eb, TryCatch #4 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:189:0x0718, B:191:0x0721, B:195:0x0736, B:200:0x0743, B:203:0x074c, B:207:0x0759, B:211:0x0767, B:215:0x0775, B:219:0x0783, B:223:0x0791, B:227:0x079d, B:231:0x07ab, B:234:0x07bb, B:235:0x07c2, B:237:0x07e5, B:240:0x07ee, B:244:0x07f9, B:245:0x0815, B:247:0x081b, B:249:0x0831, B:251:0x083d, B:253:0x084a, B:258:0x0869, B:259:0x087b, B:263:0x0885, B:264:0x0888, B:266:0x0895, B:267:0x0898, B:278:0x08de, B:238:0x07e8, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:386:0x01cc, inners: #2, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.measurement.internal.zzbg r61, com.google.android.gms.measurement.internal.zzr r62) throws java.net.MalformedURLException, java.net.URISyntaxException, java.lang.NumberFormatException, android.database.SQLException {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.g(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final m0 g0() {
        m0 m0Var = this.B;
        Q(m0Var);
        return m0Var;
    }

    public final void h(n0 n0Var, com.google.android.gms.internal.measurement.g3 g3Var) {
        z7.j jVar;
        com.google.android.gms.internal.measurement.r3 r3Var;
        J().s1();
        i0();
        String strB0 = ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).B0();
        EnumMap enumMap = new EnumMap(n1.class);
        int i10 = 0;
        if (strB0.length() < n1.values().length || strB0.charAt(0) != '1') {
            jVar = new z7.j();
        } else {
            n1[] n1VarArrValues = n1.values();
            int length = n1VarArrValues.length;
            int i11 = 0;
            int i12 = 1;
            while (i11 < length) {
                enumMap.put((EnumMap) n1VarArrValues[i11], (n1) g.zza(strB0.charAt(i12)));
                i11++;
                i12++;
            }
            jVar = new z7.j(enumMap);
        }
        String strD = n0Var.D();
        J().s1();
        i0();
        o1 o1VarA = a(strD);
        EnumMap enumMap2 = o1VarA.f27053a;
        l1 l1Var = l1.UNINITIALIZED;
        n1 n1Var = n1.AD_STORAGE;
        l1 l1Var2 = (l1) enumMap2.get(n1Var);
        if (l1Var2 == null) {
            l1Var2 = l1.UNINITIALIZED;
        }
        int i13 = o1VarA.f27054b;
        int iOrdinal = l1Var2.ordinal();
        if (iOrdinal == 1) {
            jVar.i(n1Var, g.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            jVar.g(n1Var, i13);
        } else {
            jVar.i(n1Var, g.FAILSAFE);
        }
        n1 n1Var2 = n1.ANALYTICS_STORAGE;
        l1 l1Var3 = (l1) enumMap2.get(n1Var2);
        if (l1Var3 == null) {
            l1Var3 = l1.UNINITIALIZED;
        }
        int iOrdinal2 = l1Var3.ordinal();
        if (iOrdinal2 == 1) {
            jVar.i(n1Var2, g.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            jVar.g(n1Var2, i13);
        } else {
            jVar.i(n1Var2, g.FAILSAFE);
        }
        String strD2 = n0Var.D();
        J().s1();
        i0();
        n nVarN0 = n0(strD2, l0(strD2), a(strD2), jVar);
        String str = nVarN0.f27017d;
        Boolean bool = nVarN0.f27016c;
        cc.s.h(bool);
        boolean zBooleanValue = bool.booleanValue();
        g3Var.b();
        ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            g3Var.b();
            ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).g1(str);
        }
        J().s1();
        i0();
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                r3Var = (com.google.android.gms.internal.measurement.r3) it.next();
                if ("_npa".equals(r3Var.r())) {
                    break;
                }
            } else {
                r3Var = null;
                break;
            }
        }
        if (r3Var != null) {
            n1 n1Var3 = n1.AD_PERSONALIZATION;
            g gVar = (g) ((EnumMap) jVar.f26706d).get(n1Var3);
            if (gVar == null) {
                gVar = g.UNSET;
            }
            if (gVar == g.UNSET) {
                l lVar = this.f27099g;
                Q(lVar);
                r3 r3VarM2 = lVar.m2(n0Var.D(), "_npa");
                if (r3VarM2 != null) {
                    String str2 = r3VarM2.f27134b;
                    if ("tcf".equals(str2)) {
                        jVar.i(n1Var3, g.TCF);
                    } else if ("app".equals(str2)) {
                        jVar.i(n1Var3, g.API);
                    } else {
                        jVar.i(n1Var3, g.MANIFEST);
                    }
                } else {
                    Boolean boolW = n0Var.w();
                    if (boolW == null || ((boolW.booleanValue() && r3Var.v() != 1) || !(boolW.booleanValue() || r3Var.v() == 0))) {
                        jVar.i(n1Var3, g.API);
                    } else {
                        jVar.i(n1Var3, g.MANIFEST);
                    }
                }
            }
        } else {
            int iB = B(n0Var.D(), jVar);
            com.google.android.gms.internal.measurement.q3 q3VarA = com.google.android.gms.internal.measurement.r3.A();
            q3VarA.b();
            ((com.google.android.gms.internal.measurement.r3) q3VarA.f5042d).C("_npa");
            C0().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            q3VarA.b();
            ((com.google.android.gms.internal.measurement.r3) q3VarA.f5042d).B(jCurrentTimeMillis);
            q3VarA.b();
            ((com.google.android.gms.internal.measurement.r3) q3VarA.f5042d).F(iB);
            com.google.android.gms.internal.measurement.r3 r3Var2 = (com.google.android.gms.internal.measurement.r3) q3VarA.e();
            g3Var.b();
            ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).d0(r3Var2);
            x().K.d("non_personalized_ads(_npa)", Integer.valueOf(iB), "Setting user property");
        }
        String string = jVar.toString();
        g3Var.b();
        ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).e1(string);
        String strD3 = n0Var.D();
        w0 w0Var = this.f27091a;
        w0Var.s1();
        w0Var.y1(strD3);
        com.google.android.gms.internal.measurement.y1 y1VarN1 = w0Var.N1(strD3);
        boolean z10 = y1VarN1 == null || !y1VarN1.s() || y1VarN1.t();
        List listU = g3Var.U();
        for (int i14 = 0; i14 < listU.size(); i14++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.z2) listU.get(i14)).s())) {
                com.google.android.gms.internal.measurement.y2 y2Var = (com.google.android.gms.internal.measurement.y2) ((com.google.android.gms.internal.measurement.z2) listU.get(i14)).i();
                List listH = y2Var.h();
                int i15 = 0;
                while (true) {
                    if (i15 >= listH.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.c3) listH.get(i15)).q())) {
                        String strS = ((com.google.android.gms.internal.measurement.c3) listH.get(i15)).s();
                        if (z10 && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i16 = 1;
                            while (true) {
                                if (i16 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i16)) {
                                    i10 = i16;
                                    break;
                                }
                                i16++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            strS = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.b3 b3VarB = com.google.android.gms.internal.measurement.c3.B();
                        b3VarB.h("_tcfd");
                        b3VarB.i(strS);
                        y2Var.b();
                        ((com.google.android.gms.internal.measurement.z2) y2Var.f5042d).A(i15, (com.google.android.gms.internal.measurement.c3) b3VarB.e());
                    } else {
                        i15++;
                    }
                }
                g3Var.W(i14, y2Var);
                return;
            }
        }
    }

    public final s3 h0() {
        c1 c1Var = this.H;
        cc.s.h(c1Var);
        s3 s3Var = c1Var.E;
        c1.e(s3Var);
        return s3Var;
    }

    public final void i(n0 n0Var, com.google.android.gms.internal.measurement.g3 g3Var) {
        Serializable serializableH1;
        J().s1();
        i0();
        com.google.android.gms.internal.measurement.j2 j2VarO = com.google.android.gms.internal.measurement.m2.O();
        c1 c1Var = n0Var.f27019a;
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.s1();
        byte[] bArr = n0Var.H;
        if (bArr != null) {
            try {
                j2VarO = (com.google.android.gms.internal.measurement.j2) m0.f2(j2VarO, bArr);
            } catch (q5 unused) {
                x().F.c(j0.A1(n0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = g3Var.U().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) it.next();
            if (z2Var.s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.c3 c3VarA1 = m0.A1(z2Var, "gclid");
                Serializable serializableH12 = c3VarA1 == null ? null : m0.H1(c3VarA1);
                if (serializableH12 == null) {
                    serializableH12 = "";
                }
                String str = (String) serializableH12;
                com.google.android.gms.internal.measurement.c3 c3VarA12 = m0.A1(z2Var, "gbraid");
                Serializable serializableH13 = c3VarA12 == null ? null : m0.H1(c3VarA12);
                if (serializableH13 == null) {
                    serializableH13 = "";
                }
                String str2 = (String) serializableH13;
                com.google.android.gms.internal.measurement.c3 c3VarA13 = m0.A1(z2Var, "gad_source");
                Object objH1 = c3VarA13 == null ? null : m0.H1(c3VarA13);
                String str3 = (String) (objH1 != null ? objH1 : "");
                String[] strArrSplit = ((String) u.f27181g1.a(null)).split(",");
                g0();
                HashMap map = new HashMap();
                for (com.google.android.gms.internal.measurement.c3 c3Var : z2Var.p()) {
                    if (Arrays.asList(strArrSplit).contains(c3Var.q()) && (serializableH1 = m0.H1(c3Var)) != null) {
                        map.put(c3Var.q(), serializableH1);
                    }
                }
                if (!map.isEmpty()) {
                    com.google.android.gms.internal.measurement.c3 c3VarA14 = m0.A1(z2Var, "click_timestamp");
                    Object objH12 = c3VarA14 == null ? null : m0.H1(c3VarA14);
                    long jLongValue = ((Long) (objH12 != null ? objH12 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = z2Var.u();
                    }
                    com.google.android.gms.internal.measurement.c3 c3VarA15 = m0.A1(z2Var, "_cis");
                    if ("referrer API v2".equals(c3VarA15 != null ? m0.H1(c3VarA15) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).N()) {
                            if (str.isEmpty()) {
                                j2VarO.b();
                                ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).q();
                            } else {
                                j2VarO.b();
                                ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).p(str);
                            }
                            if (str2.isEmpty()) {
                                j2VarO.b();
                                ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).s();
                            } else {
                                j2VarO.b();
                                ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).r(str2);
                            }
                            if (str3.isEmpty()) {
                                j2VarO.b();
                                ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).u();
                            } else {
                                j2VarO.b();
                                ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).t(str3);
                            }
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).v(jLongValue);
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).x().clear();
                            HashMap mapC = C(z2Var);
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).x().putAll(mapC);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).F()) {
                        if (str.isEmpty()) {
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).R();
                        } else {
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).Q(str);
                        }
                        if (str2.isEmpty()) {
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).T();
                        } else {
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).S(str2);
                        }
                        if (str3.isEmpty()) {
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).V();
                        } else {
                            j2VarO.b();
                            ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).U(str3);
                        }
                        j2VarO.b();
                        ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).W(jLongValue);
                        j2VarO.b();
                        ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).w().clear();
                        HashMap mapC2 = C(z2Var);
                        j2VarO.b();
                        ((com.google.android.gms.internal.measurement.m2) j2VarO.f5042d).w().putAll(mapC2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.m2) j2VarO.e()).equals(com.google.android.gms.internal.measurement.m2.P())) {
            com.google.android.gms.internal.measurement.m2 m2Var = (com.google.android.gms.internal.measurement.m2) j2VarO.e();
            g3Var.b();
            ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).k1(m2Var);
        }
        byte[] bArrA = ((com.google.android.gms.internal.measurement.m2) j2VarO.e()).a();
        a1 a1Var2 = c1Var.B;
        c1.g(a1Var2);
        a1Var2.s1();
        n0Var.Q |= n0Var.H != bArrA;
        n0Var.H = bArrA;
        if (n0Var.o()) {
            l lVar = this.f27099g;
            Q(lVar);
            lVar.v2(n0Var, false);
        }
        if (b0().C1(null, u.f27178f1)) {
            l lVar2 = this.f27099g;
            Q(lVar2);
            lVar2.k2(n0Var.D(), "_lgclid");
        }
    }

    public final void i0() {
        if (!this.I.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final String j(o1 o1Var) {
        if (!o1Var.i(n1.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        h0().p2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void j0(zzr zzrVar) {
        J().s1();
        i0();
        String str = zzrVar.f5426a;
        cc.s.e(str);
        o1 o1VarC = o1.c(zzrVar.T, zzrVar.O);
        a(str);
        x().K.d(str, o1VarC, "Setting storage consent for package");
        J().s1();
        i0();
        this.X.put(str, o1VarC);
        l lVar = this.f27099g;
        Q(lVar);
        lVar.N1(str, o1VarC);
    }

    public final void k(ArrayList arrayList) {
        cc.s.b(!arrayList.isEmpty());
        if (this.U != null) {
            x().B.b("Set uploading progress before finishing the previous upload");
        } else {
            this.U = new ArrayList(arrayList);
        }
    }

    public final void k0(zzr zzrVar) throws NumberFormatException {
        J().s1();
        i0();
        String str = zzrVar.f5426a;
        cc.s.e(str);
        n nVarB = n.b(zzrVar.U);
        x().K.d(str, nVarB, "Setting DMA consent for package");
        J().s1();
        i0();
        l1 l1VarA = n.c(100, m0(str)).a();
        this.Y.put(str, nVarB);
        l lVar = this.f27099g;
        Q(lVar);
        cc.s.h(str);
        cc.s.h(nVarB);
        lVar.s1();
        lVar.t1();
        o1 o1VarL1 = lVar.L1(str);
        o1 o1Var = o1.f27052c;
        if (o1VarL1 == o1Var) {
            lVar.N1(str, o1Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", nVarB.f27015b);
        lVar.P1(contentValues);
        l1 l1VarA2 = n.c(100, m0(str)).a();
        J().s1();
        i0();
        l1 l1Var = l1.DENIED;
        boolean z10 = l1VarA == l1Var && l1VarA2 == l1.GRANTED;
        boolean z11 = l1VarA == l1.GRANTED && l1VarA2 == l1Var;
        if (z10 || z11) {
            x().K.c(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            l lVar2 = this.f27099g;
            Q(lVar2);
            if (lVar2.w2(b(), str, false, false, false, false).f26950f < b0().A1(str, u.f27195m0)) {
                bundle.putLong("_r", 1L);
                l lVar3 = this.f27099g;
                Q(lVar3);
                x().K.d(str, Long.valueOf(lVar3.w2(b(), str, false, false, true, false).f26950f), "_dcu realtime event count");
            }
            this.f27098f0.h(str, "_dcu", bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [zc.p3] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.l():void");
    }

    public final n l0(String str) throws NumberFormatException {
        J().s1();
        i0();
        HashMap map = this.Y;
        n nVar = (n) map.get(str);
        if (nVar != null) {
            return nVar;
        }
        l lVar = this.f27099g;
        Q(lVar);
        cc.s.h(str);
        lVar.s1();
        lVar.t1();
        n nVarB = n.b(lVar.O1("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, nVarB);
        return nVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r23 r24
  0x006f: PHI (r0v120 java.util.List) = (r0v8 java.util.List), (r0v142 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r11v63 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v65 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r23v24 java.lang.String) = (r23v42 java.lang.String), (r23v43 java.lang.String) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r24v17 long) = (r24v2 long), (r24v18 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0804 A[EDGE_INSN: B:450:0x0804->B:317:0x0804 BREAK  A[LOOP:4: B:263:0x065b->B:316:0x07f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x07f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:487:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:491:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v9, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [zc.c1] */
    /* JADX WARN: Type inference failed for: r23v25 */
    /* JADX WARN: Type inference failed for: r23v27 */
    /* JADX WARN: Type inference failed for: r23v29 */
    /* JADX WARN: Type inference failed for: r23v30 */
    /* JADX WARN: Type inference failed for: r23v31 */
    /* JADX WARN: Type inference failed for: r23v32 */
    /* JADX WARN: Type inference failed for: r23v33, types: [zc.c1] */
    /* JADX WARN: Type inference failed for: r23v34 */
    /* JADX WARN: Type inference failed for: r23v35 */
    /* JADX WARN: Type inference failed for: r23v36 */
    /* JADX WARN: Type inference failed for: r23v37 */
    /* JADX WARN: Type inference failed for: r23v39 */
    /* JADX WARN: Type inference failed for: r23v41 */
    /* JADX WARN: Type inference failed for: r23v50 */
    /* JADX WARN: Type inference failed for: r23v51 */
    /* JADX WARN: Type inference failed for: r23v52 */
    /* JADX WARN: Type inference failed for: r23v55 */
    /* JADX WARN: Type inference failed for: r23v56 */
    /* JADX WARN: Type inference failed for: r31v0, types: [zc.p3] */
    /* JADX WARN: Type inference failed for: r4v46, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r32, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.m(long, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle m0(String str) {
        J().s1();
        i0();
        w0 w0Var = this.f27091a;
        Q(w0Var);
        if (w0Var.N1(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o1 o1VarA = a(str);
        Bundle bundle2 = new Bundle();
        Iterator it = o1VarA.f27053a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((l1) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((n1) entry.getKey()).zze, str2);
            }
        }
        bundle.putAll(bundle2);
        n nVarN0 = n0(str, l0(str), o1VarA, new z7.j());
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : nVarN0.f27018e.entrySet()) {
            int iOrdinal2 = ((l1) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((n1) entry2.getKey()).zze, str3);
            }
        }
        Boolean bool = nVarN0.f27016c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = nVarN0.f27017d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        l lVar = this.f27099g;
        Q(lVar);
        r3 r3VarM2 = lVar.m2(str, "_npa");
        bundle.putString("ad_personalization", 1 != (r3VarM2 != null ? r3VarM2.f27137e.equals(1L) : B(str, new z7.j())) ? "granted" : "denied");
        return bundle;
    }

    public final boolean n(String str, String str2) {
        l lVar = this.f27099g;
        Q(lVar);
        n0 n0VarU2 = lVar.u2(str);
        HashMap map = this.f27092a0;
        if (n0VarU2 != null && h0().S1(str, n0VarU2.C())) {
            map.remove(str2);
            return true;
        }
        o3 o3Var = (o3) map.get(str2);
        if (o3Var != null) {
            o3Var.f27058a.C0().getClass();
            if (System.currentTimeMillis() < o3Var.f27060c) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zc.n n0(java.lang.String r11, zc.n r12, zc.o1 r13, z7.j r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.n0(java.lang.String, zc.n, zc.o1, z7.j):zc.n");
    }

    public final void o(String str) {
        J().s1();
        i0();
        this.R = true;
        try {
            c1 c1Var = this.H;
            c1Var.getClass();
            Boolean bool = c1Var.j().f27268y;
            if (bool == null) {
                x().F.b("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                x().B.b("Upload called in the client side when service should be used");
            } else if (this.K > 0) {
                K();
            } else {
                m0 m0Var = this.f27095d;
                Q(m0Var);
                if (m0Var.M1()) {
                    l lVar = this.f27099g;
                    Q(lVar);
                    if (lVar.y1(str)) {
                        l lVar2 = this.f27099g;
                        Q(lVar2);
                        cc.s.e(str);
                        lVar2.s1();
                        lVar2.t1();
                        List listX1 = lVar2.x1(str, zzoo.d(k2.GOOGLE_SIGNAL), 1);
                        q3 q3Var = listX1.isEmpty() ? null : (q3) listX1.get(0);
                        if (q3Var != null) {
                            com.google.android.gms.internal.measurement.f3 f3Var = q3Var.f27110b;
                            x().K.e("[sgtm] Uploading data from upload queue. appId, type, url", str, q3Var.f27113e, q3Var.f27111c);
                            byte[] bArrA = f3Var.a();
                            if (Log.isLoggable(x().C1(), 2)) {
                                m0 m0Var2 = this.B;
                                Q(m0Var2);
                                x().K.e("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), m0Var2.V1(f3Var));
                            }
                            l3 l3Var = new l3(q3Var.f27111c, q3Var.f27112d, q3Var.f27113e, null);
                            this.Q = true;
                            m0 m0Var3 = this.f27095d;
                            Q(m0Var3);
                            m0Var3.R1(str, l3Var, f3Var, new qm.c(this, str, (Object) q3Var, 29));
                        }
                    } else {
                        x().K.c(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    x().K.b("Network not connected, ignoring upload request");
                    K();
                }
            }
            this.R = false;
            L();
        } catch (Throwable th2) {
            this.R = false;
            L();
            throw th2;
        }
    }

    public final void p(String str, boolean z10, Long l10, Long l11) {
        l lVar = this.f27099g;
        Q(lVar);
        n0 n0VarU2 = lVar.u2(str);
        if (n0VarU2 != null) {
            c1 c1Var = n0VarU2.f27019a;
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            a1Var.s1();
            n0VarU2.Q |= n0VarU2.f27041y != z10;
            n0VarU2.f27041y = z10;
            a1 a1Var2 = c1Var.B;
            c1.g(a1Var2);
            a1Var2.s1();
            n0VarU2.Q |= !Objects.equals(n0VarU2.f27042z, l10);
            n0VarU2.f27042z = l10;
            a1 a1Var3 = c1Var.B;
            c1.g(a1Var3);
            a1Var3.s1();
            n0VarU2.Q |= !Objects.equals(n0VarU2.A, l11);
            n0VarU2.A = l11;
            if (n0VarU2.o()) {
                l lVar2 = this.f27099g;
                Q(lVar2);
                lVar2.v2(n0VarU2, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(com.google.android.gms.internal.measurement.g3 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.q(com.google.android.gms.internal.measurement.g3, java.lang.String):void");
    }

    public final void r(com.google.android.gms.internal.measurement.g3 g3Var, q0 q0Var) {
        String strK2;
        String strK22;
        for (int i10 = 0; i10 < g3Var.V(); i10++) {
            com.google.android.gms.internal.measurement.y2 y2Var = (com.google.android.gms.internal.measurement.y2) ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).T1(i10).i();
            Iterator it = y2Var.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.c3) it.next()).q())) {
                    if (((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).G0() >= b0().A1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), u.f27193l0)) {
                        int iA1 = b0().A1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), u.f27219y0);
                        LinkedList linkedList = this.M;
                        m0 m0Var = this.B;
                        if (iA1 > 0) {
                            l lVar = this.f27099g;
                            Q(lVar);
                            if (lVar.w2(b(), ((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), false, false, false, true).f26951g > iA1) {
                                com.google.android.gms.internal.measurement.b3 b3VarB = com.google.android.gms.internal.measurement.c3.B();
                                b3VarB.h("_tnr");
                                b3VarB.j(1L);
                                y2Var.k((com.google.android.gms.internal.measurement.c3) b3VarB.e());
                            } else {
                                if (b0().C1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), u.R0)) {
                                    strK22 = h0().k2();
                                    com.google.android.gms.internal.measurement.b3 b3VarB2 = com.google.android.gms.internal.measurement.c3.B();
                                    b3VarB2.h("_tu");
                                    b3VarB2.i(strK22);
                                    y2Var.k((com.google.android.gms.internal.measurement.c3) b3VarB2.e());
                                } else {
                                    strK22 = null;
                                }
                                com.google.android.gms.internal.measurement.b3 b3VarB3 = com.google.android.gms.internal.measurement.c3.B();
                                b3VarB3.h("_tr");
                                b3VarB3.j(1L);
                                y2Var.k((com.google.android.gms.internal.measurement.c3) b3VarB3.e());
                                Q(m0Var);
                                zzoh zzohVarT1 = m0Var.T1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), g3Var, y2Var, strK22);
                                if (zzohVarT1 != null) {
                                    x().K.d(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), zzohVarT1.f5409a, "Generated trigger URI. appId, uri");
                                    l lVar2 = this.f27099g;
                                    Q(lVar2);
                                    lVar2.M1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), zzohVarT1);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p());
                                    }
                                }
                            }
                        } else {
                            if (b0().C1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), u.R0)) {
                                strK2 = h0().k2();
                                com.google.android.gms.internal.measurement.b3 b3VarB4 = com.google.android.gms.internal.measurement.c3.B();
                                b3VarB4.h("_tu");
                                b3VarB4.i(strK2);
                                y2Var.k((com.google.android.gms.internal.measurement.c3) b3VarB4.e());
                            } else {
                                strK2 = null;
                            }
                            com.google.android.gms.internal.measurement.b3 b3VarB5 = com.google.android.gms.internal.measurement.c3.B();
                            b3VarB5.h("_tr");
                            b3VarB5.j(1L);
                            y2Var.k((com.google.android.gms.internal.measurement.c3) b3VarB5.e());
                            Q(m0Var);
                            zzoh zzohVarT12 = m0Var.T1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), g3Var, y2Var, strK2);
                            if (zzohVarT12 != null) {
                                x().K.d(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), zzohVarT12.f5409a, "Generated trigger URI. appId, uri");
                                l lVar3 = this.f27099g;
                                Q(lVar3);
                                lVar3.M1(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p(), zzohVarT12);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.h3) q0Var.f27104b).p());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.z2 z2Var = (com.google.android.gms.internal.measurement.z2) y2Var.e();
                    g3Var.b();
                    ((com.google.android.gms.internal.measurement.h3) g3Var.f5042d).X(i10, z2Var);
                }
            }
        }
    }

    public final void s(String str, com.google.android.gms.internal.measurement.b3 b3Var, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (s3.Q1(((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).q()) || s3.Q1(str)) {
            f fVarB0 = b0();
            fVarB0.getClass();
            iMax = Math.max(Math.max(Math.min(fVarB0.A1(str2, u.f27183h0), 500), 100), 256);
        } else {
            f fVarB02 = b0();
            fVarB02.getClass();
            iMax = Math.max(Math.min(fVarB02.A1(str2, u.f27183h0), 500), 100);
        }
        long j = iMax;
        long jCodePointCount = ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).s().codePointCount(0, ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).s().length());
        h0();
        String strQ = ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).q();
        b0();
        String strX1 = s3.x1(strQ, 40, true);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).q())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).q())) {
            h0();
            String strS = ((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).s();
            f fVarB03 = b0();
            fVarB03.getClass();
            bundle.putString("_ev", s3.x1(strS, Math.max(Math.max(Math.min(fVarB03.A1(str2, u.f27183h0), 500), 100), 256), true));
            return;
        }
        x().H.d(strX1, Long.valueOf(jCodePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strX1);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.c3) b3Var.f5042d).q());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0018, TryCatch #2 {all -> 0x0018, blocks: (B:4:0x0015, B:17:0x0033, B:22:0x0083, B:21:0x0071, B:26:0x00a6, B:32:0x00ca), top: B:110:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091 A[Catch: all -> 0x024c, PHI: r0
  0x0091: PHI (r0v4 int) = (r0v0 int), (r0v37 int) binds: [B:10:0x0026, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x024c, blocks: (B:9:0x001e, B:24:0x0091, B:30:0x00bc, B:35:0x00e6, B:83:0x0228, B:85:0x023b, B:87:0x0246, B:97:0x0268, B:91:0x024f, B:93:0x0258, B:95:0x025e, B:96:0x0262, B:99:0x026c, B:100:0x0274, B:34:0x00db, B:101:0x0275, B:26:0x00a6, B:32:0x00ca), top: B:112:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: all -> 0x0018, SQLiteException -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x0228, B:85:0x023b, B:87:0x0246, B:97:0x0268, B:91:0x024f, B:93:0x0258, B:95:0x025e, B:96:0x0262, B:99:0x026c, B:100:0x0274, B:34:0x00db), top: B:107:0x00a6, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db A[Catch: SQLiteException -> 0x00b9, all -> 0x024c, TRY_ENTER, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x0228, B:85:0x023b, B:87:0x0246, B:97:0x0268, B:91:0x024f, B:93:0x0258, B:95:0x025e, B:96:0x0262, B:99:0x026c, B:100:0x0274, B:34:0x00db), top: B:107:0x00a6, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff A[Catch: all -> 0x015b, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:70:0x01f9, B:72:0x01ff, B:73:0x0206, B:76:0x0214, B:78:0x0218, B:81:0x021f, B:82:0x0220), top: B:111:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b A[Catch: all -> 0x015b, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:70:0x01f9, B:72:0x01ff, B:73:0x0206, B:76:0x0214, B:78:0x0218, B:81:0x021f, B:82:0x0220), top: B:111:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0 A[Catch: all -> 0x015b, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:70:0x01f9, B:72:0x01ff, B:73:0x0206, B:76:0x0214, B:78:0x0218, B:81:0x021f, B:82:0x0220), top: B:111:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #3 {all -> 0x015b, blocks: (B:36:0x00ee, B:37:0x00f7, B:39:0x00ff, B:41:0x0113, B:43:0x0120, B:44:0x0122, B:48:0x0140, B:50:0x014a, B:54:0x015e, B:55:0x0165, B:57:0x016b, B:59:0x0180, B:61:0x0196, B:62:0x0198, B:64:0x01a4, B:66:0x01c0, B:68:0x01e6, B:69:0x01f5, B:70:0x01f9, B:72:0x01ff, B:73:0x0206, B:76:0x0214, B:78:0x0218, B:81:0x021f, B:82:0x0220), top: B:111:0x00ee, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023b A[Catch: SQLiteException -> 0x00b9, all -> 0x024c, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x0228, B:85:0x023b, B:87:0x0246, B:97:0x0268, B:91:0x024f, B:93:0x0258, B:95:0x025e, B:96:0x0262, B:99:0x026c, B:100:0x0274, B:34:0x00db), top: B:107:0x00a6, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024f A[Catch: SQLiteException -> 0x00b9, all -> 0x024c, TryCatch #0 {SQLiteException -> 0x00b9, blocks: (B:26:0x00a6, B:30:0x00bc, B:32:0x00ca, B:35:0x00e6, B:83:0x0228, B:85:0x023b, B:87:0x0246, B:97:0x0268, B:91:0x024f, B:93:0x0258, B:95:0x025e, B:96:0x0262, B:99:0x026c, B:100:0x0274, B:34:0x00db), top: B:107:0x00a6, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(boolean r22, int r23, java.lang.Throwable r24, byte[] r25, java.lang.String r26, java.util.List r27) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.t(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final void u(n0 n0Var) throws MalformedURLException, URISyntaxException {
        u.e eVar;
        u.e eVar2;
        J().s1();
        if (TextUtils.isEmpty(n0Var.G())) {
            String strD = n0Var.D();
            cc.s.h(strD);
            v(strD, 204, null, null, null);
            return;
        }
        String strD2 = n0Var.D();
        cc.s.h(strD2);
        x().K.c(strD2, "Fetching remote configuration");
        w0 w0Var = this.f27091a;
        Q(w0Var);
        com.google.android.gms.internal.measurement.d2 d2VarE1 = w0Var.E1(strD2);
        Q(w0Var);
        w0Var.s1();
        String str = (String) w0Var.J.get(strD2);
        if (d2VarE1 != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new u.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            Q(w0Var);
            w0Var.s1();
            String str2 = (String) w0Var.K.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new u.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.P = true;
        m0 m0Var = this.f27095d;
        Q(m0Var);
        z7.b bVar = new z7.b(this);
        c1 c1Var = (c1) m0Var.f1504d;
        m0Var.s1();
        m0Var.t1();
        m3 m3Var = m0Var.f26981g.F;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) u.f27176f.a(null)).encodedAuthority((String) u.f27179g.a(null)).path("config/app/".concat(String.valueOf(n0Var.G()))).appendQueryParameter("platform", "android");
        ((c1) m3Var.f1504d).f26887r.x1();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            a1Var.E1(new l0(m0Var, n0Var.D(), url, (byte[]) null, eVar, bVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.d(j0.A1(n0Var.D()), string, "Failed to parse config URL. Not fetching. appId");
        }
    }

    @Override // zc.k1
    public final Context u0() {
        return this.H.f26884a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.p3.v(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void w() {
        J().s1();
        i0();
        if (this.J) {
            return;
        }
        this.J = true;
        J().s1();
        FileLock fileLock = this.S;
        c1 c1Var = this.H;
        if (fileLock == null || !fileLock.isValid()) {
            ((c1) this.f27099g.f1504d).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(c1Var.f26884a.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.T = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.S = fileLockTryLock;
                if (fileLockTryLock == null) {
                    x().B.b("Storage concurrent data access panic");
                    return;
                }
                x().K.b("Storage concurrent access okay");
            } catch (FileNotFoundException e4) {
                x().B.c(e4, "Failed to acquire storage lock");
                return;
            } catch (IOException e10) {
                x().B.c(e10, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e11) {
                x().F.c(e11, "Storage lock already acquired");
                return;
            }
        } else {
            x().K.b("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.T;
        J().s1();
        int i10 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            x().B.b("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i11 = fileChannel.read(byteBufferAllocate);
                if (i11 == 4) {
                    byteBufferAllocate.flip();
                    i10 = byteBufferAllocate.getInt();
                } else if (i11 != -1) {
                    x().F.c(Integer.valueOf(i11), "Unexpected data length. Bytes read");
                }
            } catch (IOException e12) {
                x().B.c(e12, "Failed to read from channel");
            }
        }
        c0 c0VarL = c1Var.l();
        c0VarL.t1();
        int i12 = c0VarL.f26882y;
        J().s1();
        if (i10 > i12) {
            x().B.d(Integer.valueOf(i10), Integer.valueOf(i12), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i10 < i12) {
            FileChannel fileChannel2 = this.T;
            J().s1();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                x().B.b("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i12);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        x().B.c(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    x().K.d(Integer.valueOf(i10), Integer.valueOf(i12), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e13) {
                    x().B.c(e13, "Failed to write to channel");
                }
            }
            x().B.d(Integer.valueOf(i10), Integer.valueOf(i12), "Storage version upgrade failed. Previous, current version");
        }
    }

    @Override // zc.k1
    public final j0 x() {
        c1 c1Var = this.H;
        cc.s.h(c1Var);
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        return j0Var;
    }
}
