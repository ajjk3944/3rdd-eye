package ec;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.p8;
import j$.util.DesugarCollections;
import j$.util.Objects;
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
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g4 implements w1 {
    public static volatile g4 K;
    public final HashMap B;
    public final HashMap C;
    public final HashMap D;
    public y2 F;
    public String G;
    public q3 H;
    public long I;

    /* renamed from: a, reason: collision with root package name */
    public final h1 f22731a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f22732b;

    /* renamed from: c, reason: collision with root package name */
    public m f22733c;

    /* renamed from: d, reason: collision with root package name */
    public y0 f22734d;

    /* renamed from: e, reason: collision with root package name */
    public w3 f22735e;

    /* renamed from: f, reason: collision with root package name */
    public c f22736f;
    public final w0 g;

    /* renamed from: h, reason: collision with root package name */
    public w0 f22737h;

    /* renamed from: i, reason: collision with root package name */
    public l3 f22738i;

    /* renamed from: k, reason: collision with root package name */
    public d1 f22739k;

    /* renamed from: l, reason: collision with root package name */
    public final o1 f22740l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22742n;

    /* renamed from: o, reason: collision with root package name */
    public long f22743o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f22744p;

    /* renamed from: r, reason: collision with root package name */
    public int f22746r;

    /* renamed from: s, reason: collision with root package name */
    public int f22747s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22748t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22749u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22750v;

    /* renamed from: w, reason: collision with root package name */
    public FileLock f22751w;

    /* renamed from: x, reason: collision with root package name */
    public FileChannel f22752x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f22753y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f22754z;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f22741m = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final LinkedList f22745q = new LinkedList();
    public final HashMap E = new HashMap();
    public final o7.d J = new o7.d(15, this);
    public long A = -1;
    public final d4 j = new d4(this);

    public g4(d8.h hVar) {
        this.f22740l = o1.s(hVar.f22020b, null, null);
        w0 w0Var = new w0(this, 2);
        w0Var.D();
        this.g = w0Var;
        w0 w0Var2 = new w0(this, 0);
        w0Var2.D();
        this.f22732b = w0Var2;
        h1 h1Var = new h1(this);
        h1Var.D();
        this.f22731a = h1Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        b().K(new b5.o(this, hVar));
    }

    public static g4 C(Context context) {
        pb.y.h(context);
        pb.y.h(context.getApplicationContext());
        if (K == null) {
            synchronized (g4.class) {
                try {
                    if (K == null) {
                        K = new g4(new d8.h(context, 3));
                    }
                } finally {
                }
            }
        }
        return K;
    }

    public static final void D(com.google.android.gms.internal.measurement.a3 a3Var, int i4, String str) {
        List listI = a3Var.i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.e3) listI.get(i10)).q())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.d3 d3VarB = com.google.android.gms.internal.measurement.e3.B();
        d3VarB.i("_err");
        d3VarB.k(i4);
        com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) d3VarB.f();
        com.google.android.gms.internal.measurement.d3 d3VarB2 = com.google.android.gms.internal.measurement.e3.B();
        d3VarB2.i("_ev");
        d3VarB2.j(str);
        com.google.android.gms.internal.measurement.e3 e3Var2 = (com.google.android.gms.internal.measurement.e3) d3VarB2.f();
        a3Var.l(e3Var);
        a3Var.l(e3Var2);
    }

    public static final void E(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        List listI = a3Var.i();
        for (int i4 = 0; i4 < listI.size(); i4++) {
            if (str.equals(((com.google.android.gms.internal.measurement.e3) listI.get(i4)).q())) {
                a3Var.n(i4);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
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

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(n4 n4Var) {
        return !TextUtils.isEmpty(n4Var.f22916b);
    }

    public static final void U(b4 b4Var) {
        if (b4Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!b4Var.f22595d) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b4Var.getClass())));
        }
    }

    public static final Boolean V(n4 n4Var) {
        Boolean bool = n4Var.f22928p;
        String str = n4Var.C;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = ((x1) o7.c.D(str).f30419b).ordinal();
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void B() {
        b().B();
        l0();
        if (this.f22742n) {
            return;
        }
        this.f22742n = true;
        b().B();
        FileLock fileLock = this.f22751w;
        o1 o1Var = this.f22740l;
        if (fileLock == null || !fileLock.isValid()) {
            ((o1) this.f22733c.f218b).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(o1Var.f22949a.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
                this.f22752x = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.f22751w = fileLockTryLock;
                if (fileLockTryLock == null) {
                    a().g.d("Storage concurrent data access panic");
                    return;
                }
                a().f23060o.d("Storage concurrent access okay");
            } catch (FileNotFoundException e2) {
                a().g.e(e2, "Failed to acquire storage lock");
                return;
            } catch (IOException e10) {
                a().g.e(e10, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e11) {
                a().j.e(e11, "Storage lock already acquired");
                return;
            }
        } else {
            a().f23060o.d("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.f22752x;
        b().B();
        int i4 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().g.d("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i10 = fileChannel.read(byteBufferAllocate);
                if (i10 == 4) {
                    byteBufferAllocate.flip();
                    i4 = byteBufferAllocate.getInt();
                } else if (i10 != -1) {
                    a().j.e(Integer.valueOf(i10), "Unexpected data length. Bytes read");
                }
            } catch (IOException e12) {
                a().g.e(e12, "Failed to read from channel");
            }
        }
        l0 l0VarR = o1Var.r();
        l0VarR.C();
        int i11 = l0VarR.f22847f;
        b().B();
        if (i4 > i11) {
            a().g.f(Integer.valueOf(i4), Integer.valueOf(i11), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i4 < i11) {
            FileChannel fileChannel2 = this.f22752x;
            b().B();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                a().g.d("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i11);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        a().g.e(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    a().f23060o.f(Integer.valueOf(i4), Integer.valueOf(i11), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e13) {
                    a().g.e(e13, "Failed to write to channel");
                }
            }
            a().g.f(Integer.valueOf(i4), Integer.valueOf(i11), "Storage version upgrade failed. Previous, current version");
        }
    }

    public final int F(String str, jf.c cVar) {
        x1 x1VarF;
        h1 h1Var = this.f22731a;
        com.google.android.gms.internal.measurement.a2 a2VarW = h1Var.W(str);
        z1 z1Var = z1.AD_PERSONALIZATION;
        if (a2VarW == null) {
            cVar.B(z1Var, h.FAILSAFE);
            return 1;
        }
        m mVar = this.f22733c;
        U(mVar);
        x0 x0VarD0 = mVar.D0(str);
        if (x0VarD0 == null || ((x1) o7.c.D(x0VarD0.s()).f30419b) != x1.POLICY || (x1VarF = h1Var.F(str, z1Var)) == x1.UNINITIALIZED) {
            cVar.B(z1Var, h.REMOTE_DEFAULT);
            if (h1Var.V(str, z1Var)) {
                return 0;
            }
        } else {
            cVar.B(z1Var, h.REMOTE_ENFORCED_DEFAULT);
            if (x1VarF == x1.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(com.google.android.gms.internal.measurement.b3 b3Var) {
        Serializable serializableQ;
        HashMap map = new HashMap();
        j0();
        HashMap map2 = new HashMap();
        for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.p()) {
            if (e3Var.q().startsWith("gad_") && (serializableQ = w0.Q(e3Var)) != null) {
                map2.put(e3Var.q(), serializableQ);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        b().B();
        if (this.f22745q.isEmpty()) {
            return;
        }
        if (this.H == null) {
            this.H = new q3(this, this.f22740l, 2);
        }
        if (this.H.f22904c != 0) {
            return;
        }
        f().getClass();
        long jMax = Math.max(0L, ((Integer) d0.C0.a(null)).intValue() - (SystemClock.elapsedRealtime() - this.I));
        a().f23060o.e(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        if (this.H == null) {
            this.H = new q3(this, this.f22740l, 2);
        }
        this.H.b(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:8|(3:9|10|(4:12|13|(4:15|(1:22)|25|471)(18:26|27|(2:35|(3:37|(1:44)(1:43)|45)(0))(1:34)|46|(2:48|(3:50|(4:53|(1:476)(2:59|473)|60|51)|472))|61|62|(4:64|65|(0)(1:71)|(7:117|(5:121|(2:123|487)(2:124|(2:126|486)(1:488))|127|118|119)|485|128|(2:131|(3:137|(1:139)(2:140|(3:142|(3:145|(1:147)(1:504)|143)|503))|148)(2:135|136))(1:130)|149|(2:151|(6:(2:156|(6:158|159|193|(9:195|(4:198|(2:211|(2:213|490)(1:492))(5:202|(5:205|(2:208|206)|494|209|203)|493|210|491)|214|196)|489|215|(4:218|(3:496|220|499)(1:498)|497|216)|495|221|(1:223)|500)(1:224)|225|470))|160|193|(0)(0)|225|470)(7:161|162|192|193|(0)(0)|225|470))(2:163|(8:165|(6:(2:170|(6:172|159|193|(0)(0)|225|470))|173|193|(0)(0)|225|470)|162|192|193|(0)(0)|225|470)(7:174|(2:185|(2:186|(2:188|(2:502|190)(1:191))(1:501)))(0)|192|193|(0)(0)|225|470)))(3:136|149|(0)(0)))(1:72)|70|(3:73|74|(3:76|(2:78|479)(2:79|(2:81|480)(2:82|478))|83)(1:477))|84|(1:87)|(1:89)|90|(1:92)(1:93)|94|(4:99|(4:102|(2:104|483)(2:105|(2:107|482)(1:484))|108|100)|481|(1:(1:114)(1:115))(1:(1:111)(2:112|(0)(0))))|(0)(0))|226)(1:469))|227|(3:229|(2:231|(2:233|507)(2:234|(1:508)(3:236|(1:238)(1:239)|(1:510)(2:243|506))))(0)|244)|505|245|(3:246|247|(1:511)(2:249|(2:512|251)(1:513)))|252|(1:254)(2:255|(1:257))|258|(1:260)(1:261)|262|(1:264)(1:265)|266|(6:269|(1:271)|272|(2:274|515)(1:516)|275|267)|514|276|(2:281|(1:285))(1:280)|286|(1:288)|289|(1:291)|292|(2:294|(1:300))|301|(8:303|(8:307|308|(4:310|(2:312|(1:314))|(1:331)(5:318|(1:322)|324|(1:329)(1:328)|330)|332)(3:334|(4:467|336|341|(6:343|(3:346|(3:521|348|(3:350|354|(1:356)(6:357|(1:361)|362|(1:364)(1:366)|365|(3:368|(1:376)|377)(4:378|(3:380|(1:382)|383)(4:384|(1:386)(1:387)|388|(3:390|(1:392)|393)(2:394|(1:396)))|397|518)))(2:351|(0)(0)))(1:352)|344)|520|353|354|(0)(0))(3:353|354|(0)(0)))(3:340|341|(0)(0))|398)|333|519|398|304|305)|517|399|(1:401)|402|(2:405|403)|522)(1:406)|407|(1:409)(13:411|(9:413|(1:415)(1:416)|417|(1:419)(1:420)|421|(1:423)(1:424)|425|(1:427)(1:428)|429)|430|(3:432|(2:438|(1:440)(1:441))(1:437)|442)|443|(3:(2:447|524)(1:525)|448|444)|523|449|(1:451)|452|465|453|457)|410|430|(0)|443|(1:444)|523|449|(0)|452|465|453|457) */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0f20, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0f21, code lost:
    
        ((ec.o1) r2.f218b).a().F().f(ec.s0.J(r1), r0, "Failed to remove unused event metadata. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03f6 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0415 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ef A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0538 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05e8 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x074e A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b18 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0b4c A[PHI: r2
  0x0b4c: PHI (r2v54 long) = (r2v53 long), (r2v77 long) binds: [B:342:0x0b16, B:520:0x0b4c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b64 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0b87 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0e33 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0ec0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0ef1 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x0076, B:15:0x00a4, B:17:0x00e1, B:20:0x00fa, B:22:0x0104, B:226:0x0712, B:26:0x0132, B:29:0x0144, B:31:0x014a, B:46:0x018e, B:48:0x01a0, B:51:0x01c7, B:53:0x01cd, B:55:0x01dd, B:57:0x01eb, B:59:0x01fb, B:60:0x0206, B:61:0x0209, B:64:0x0221, B:73:0x0252, B:76:0x025c, B:78:0x026a, B:83:0x02c6, B:79:0x028e, B:81:0x029e, B:87:0x02d5, B:89:0x02ff, B:90:0x0327, B:92:0x035c, B:94:0x0362, B:97:0x036e, B:99:0x03a3, B:100:0x03c0, B:102:0x03c6, B:104:0x03d4, B:108:0x03e8, B:105:0x03dc, B:111:0x03ef, B:114:0x03f6, B:115:0x0415, B:117:0x0430, B:118:0x043c, B:121:0x0446, B:127:0x0469, B:124:0x0458, B:149:0x04e3, B:151:0x04ef, B:154:0x0500, B:156:0x0511, B:158:0x051d, B:193:0x05e2, B:195:0x05e8, B:196:0x05f4, B:198:0x05fa, B:200:0x060a, B:202:0x0614, B:203:0x0627, B:205:0x062d, B:206:0x0646, B:208:0x064c, B:209:0x066a, B:210:0x0678, B:214:0x069f, B:211:0x067e, B:213:0x068a, B:215:0x06a6, B:216:0x06c3, B:218:0x06c9, B:220:0x06dc, B:221:0x06e9, B:223:0x06f0, B:225:0x06fe, B:163:0x0538, B:165:0x0546, B:168:0x0557, B:170:0x0568, B:172:0x0574, B:174:0x0583, B:176:0x0592, B:179:0x059e, B:181:0x05a8, B:183:0x05b2, B:186:0x05bd, B:188:0x05c3, B:190:0x05d3, B:191:0x05de, B:131:0x0471, B:133:0x047d, B:135:0x0489, B:148:0x04cd, B:140:0x04a5, B:143:0x04b7, B:145:0x04bd, B:147:0x04c7, B:35:0x0154, B:37:0x0161, B:39:0x016f, B:41:0x0175, B:45:0x0180, B:229:0x072b, B:231:0x073d, B:233:0x0746, B:244:0x0776, B:234:0x074e, B:236:0x0757, B:238:0x075d, B:241:0x0769, B:243:0x0771, B:245:0x0779, B:246:0x0785, B:249:0x078d, B:251:0x079f, B:252:0x07aa, B:254:0x07b2, B:258:0x07e1, B:260:0x07fd, B:262:0x0812, B:264:0x082e, B:266:0x0843, B:267:0x085f, B:269:0x0865, B:271:0x087d, B:272:0x088b, B:274:0x089b, B:275:0x08a9, B:276:0x08ac, B:278:0x08f6, B:280:0x08fc, B:286:0x0927, B:288:0x092f, B:289:0x094d, B:291:0x0953, B:292:0x0967, B:294:0x097e, B:296:0x098f, B:298:0x09a1, B:300:0x09ab, B:301:0x09ae, B:303:0x0a09, B:304:0x0a1c, B:307:0x0a24, B:310:0x0a43, B:312:0x0a5c, B:314:0x0a71, B:316:0x0a76, B:318:0x0a7a, B:320:0x0a7e, B:322:0x0a88, B:324:0x0a91, B:326:0x0a95, B:328:0x0a9b, B:330:0x0aa6, B:332:0x0ab4, B:398:0x0d1b, B:334:0x0abd, B:336:0x0adb, B:341:0x0af8, B:343:0x0b18, B:344:0x0b20, B:346:0x0b26, B:348:0x0b38, B:354:0x0b4e, B:356:0x0b64, B:357:0x0b87, B:359:0x0b93, B:361:0x0ba9, B:362:0x0be9, B:368:0x0c05, B:370:0x0c10, B:372:0x0c14, B:374:0x0c18, B:376:0x0c1c, B:377:0x0c28, B:378:0x0c2d, B:380:0x0c33, B:382:0x0c4b, B:383:0x0c50, B:397:0x0d18, B:384:0x0c8f, B:386:0x0c94, B:390:0x0ca8, B:392:0x0cc7, B:393:0x0cce, B:396:0x0d0c, B:387:0x0c99, B:339:0x0ae1, B:399:0x0d26, B:401:0x0d33, B:402:0x0d47, B:403:0x0d4f, B:405:0x0d55, B:407:0x0d6b, B:409:0x0d7d, B:430:0x0e2d, B:432:0x0e33, B:434:0x0e48, B:437:0x0e4f, B:442:0x0e92, B:438:0x0e5e, B:440:0x0e6c, B:441:0x0e79, B:443:0x0ea1, B:444:0x0eba, B:447:0x0ec2, B:448:0x0ec7, B:449:0x0ed7, B:451:0x0ef1, B:452:0x0f0e, B:453:0x0f16, B:457:0x0f36, B:456:0x0f21, B:411:0x0d99, B:413:0x0d9f, B:415:0x0daf, B:417:0x0db6, B:423:0x0dcc, B:425:0x0dd3, B:427:0x0e1e, B:429:0x0e25, B:428:0x0e22, B:424:0x0dd0, B:416:0x0db3, B:281:0x090c, B:283:0x0912, B:285:0x0918, B:265:0x0840, B:261:0x080f, B:255:0x07b8, B:257:0x07be, B:458:0x0f3f), top: B:464:0x0019, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(long r47, java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 3927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.I(long, java.lang.String):boolean");
    }

    public final void J(com.google.android.gms.internal.measurement.i3 i3Var, long j, boolean z3) {
        j4 j4Var;
        Object obj;
        String str = true != z3 ? "_lte" : "_se";
        m mVar = this.f22733c;
        U(mVar);
        j4 j4VarV0 = mVar.v0(i3Var.p(), str);
        if (j4VarV0 == null || (obj = j4VarV0.f22828e) == null) {
            String strP = i3Var.p();
            f().getClass();
            j4Var = new j4(strP, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strP2 = i3Var.p();
            f().getClass();
            j4Var = new j4(strP2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        com.google.android.gms.internal.measurement.r3 r3VarA = com.google.android.gms.internal.measurement.s3.A();
        r3VarA.b();
        ((com.google.android.gms.internal.measurement.s3) r3VarA.f19740b).C(str);
        f().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r3VarA.b();
        ((com.google.android.gms.internal.measurement.s3) r3VarA.f19740b).B(jCurrentTimeMillis);
        Object obj2 = j4Var.f22828e;
        long jLongValue = ((Long) obj2).longValue();
        r3VarA.b();
        ((com.google.android.gms.internal.measurement.s3) r3VarA.f19740b).F(jLongValue);
        com.google.android.gms.internal.measurement.s3 s3Var = (com.google.android.gms.internal.measurement.s3) r3VarA.f();
        int iP0 = w0.p0(i3Var, str);
        if (iP0 >= 0) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).c0(iP0, s3Var);
        } else {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).d0(s3Var);
        }
        if (j > 0) {
            m mVar2 = this.f22733c;
            U(mVar2);
            mVar2.u0(j4Var);
            a().f23060o.f(true != z3 ? "lifetime" : "session-scoped", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final boolean K(com.google.android.gms.internal.measurement.a3 a3Var, com.google.android.gms.internal.measurement.a3 a3Var2) {
        pb.y.b("_e".equals(a3Var.o()));
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarJ = w0.J((com.google.android.gms.internal.measurement.b3) a3Var.f(), "_sc");
        String strS = e3VarJ == null ? null : e3VarJ.s();
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarJ2 = w0.J((com.google.android.gms.internal.measurement.b3) a3Var2.f(), "_pc");
        String strS2 = e3VarJ2 != null ? e3VarJ2.s() : null;
        if (strS2 == null || !strS2.equals(strS)) {
            return false;
        }
        pb.y.b("_e".equals(a3Var.o()));
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarJ3 = w0.J((com.google.android.gms.internal.measurement.b3) a3Var.f(), "_et");
        if (e3VarJ3 == null || !e3VarJ3.t() || e3VarJ3.u() <= 0) {
            return true;
        }
        long jU = e3VarJ3.u();
        j0();
        com.google.android.gms.internal.measurement.e3 e3VarJ4 = w0.J((com.google.android.gms.internal.measurement.b3) a3Var2.f(), "_et");
        if (e3VarJ4 != null && e3VarJ4.u() > 0) {
            jU += e3VarJ4.u();
        }
        j0();
        w0.H(a3Var2, "_et", Long.valueOf(jU));
        j0();
        w0.H(a3Var, "_fr", 1L);
        return true;
    }

    public final boolean L() {
        b().B();
        l0();
        m mVar = this.f22733c;
        U(mVar);
        if (mVar.l0("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        m mVar2 = this.f22733c;
        U(mVar2);
        return !TextUtils.isEmpty(mVar2.J());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.N():void");
    }

    public final void O() {
        b().B();
        if (this.f22748t || this.f22749u || this.f22750v) {
            a().f23060o.g("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f22748t), Boolean.valueOf(this.f22749u), Boolean.valueOf(this.f22750v));
            return;
        }
        a().f23060o.d("Stopping uploading service(s)");
        ArrayList arrayList = this.f22744p;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.f22744p;
        pb.y.h(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(x0 x0Var) {
        try {
            long jP = x0Var.P();
            o1 o1Var = this.f22740l;
            if (jP != -2147483648L) {
                if (x0Var.P() == ub.b.a(o1Var.f22949a).e(0, x0Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = ub.b.a(o1Var.f22949a).e(0, x0Var.D()).versionName;
                String strN = x0Var.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final n4 Q(String str) {
        m mVar = this.f22733c;
        U(mVar);
        x0 x0VarD0 = mVar.D0(str);
        if (x0VarD0 != null) {
            o1 o1Var = x0VarD0.f23138a;
            if (!TextUtils.isEmpty(x0VarD0.N())) {
                Boolean boolP = P(x0VarD0);
                if (boolP != null && !boolP.booleanValue()) {
                    a().g.e(s0.J(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = x0VarD0.G();
                String strN = x0VarD0.N();
                long jP = x0VarD0.P();
                l1 l1Var = o1Var.g;
                o1.m(l1Var);
                l1Var.B();
                String str2 = x0VarD0.f23147l;
                l1 l1Var2 = o1Var.g;
                o1.m(l1Var2);
                l1Var2.B();
                long j = x0VarD0.f23148m;
                l1 l1Var3 = o1Var.g;
                o1.m(l1Var3);
                l1Var3.B();
                long j8 = x0VarD0.f23149n;
                l1 l1Var4 = o1Var.g;
                o1.m(l1Var4);
                l1Var4.B();
                boolean z3 = x0VarD0.f23150o;
                String strJ = x0VarD0.J();
                l1 l1Var5 = o1Var.g;
                o1.m(l1Var5);
                l1Var5.B();
                boolean z10 = x0VarD0.f23151p;
                Boolean boolW = x0VarD0.w();
                long jB = x0VarD0.b();
                l1 l1Var6 = o1Var.g;
                o1.m(l1Var6);
                l1Var6.B();
                ArrayList arrayList = x0VarD0.f23154s;
                String strG2 = e(str).g();
                boolean zY = x0VarD0.y();
                l1 l1Var7 = o1Var.g;
                o1.m(l1Var7);
                l1Var7.B();
                long j9 = x0VarD0.f23157v;
                int i4 = e(str).f22543b;
                String str3 = o0(str).f22941b;
                l1 l1Var8 = o1Var.g;
                o1.m(l1Var8);
                l1Var8.B();
                int i10 = x0VarD0.f23159x;
                l1 l1Var9 = o1Var.g;
                o1.m(l1Var9);
                l1Var9.B();
                return new n4(str, strG, strN, jP, str2, j, j8, (String) null, z3, false, strJ, 0L, 0, z10, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j9, i4, str3, i10, x0VarD0.B, x0VarD0.C(), x0VarD0.s(), 0L, x0VarD0.t());
            }
        }
        a().f23059n.e(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        m mVar = this.f22733c;
        U(mVar);
        r rVarZ = mVar.Z("events", str, str2);
        return rVarZ == null || rVarZ.f23032c < 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(ec.i4 r24, ec.n4 r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.W(ec.i4, ec.n4):void");
    }

    public final void X(String str, n4 n4Var) {
        b().B();
        l0();
        boolean zT = T(n4Var);
        String str2 = n4Var.f22915a;
        if (zT) {
            if (!n4Var.f22921h) {
                c0(n4Var);
                return;
            }
            Boolean boolV = V(n4Var);
            if ("_npa".equals(str) && boolV != null) {
                a().f23059n.d("Falling back to manifest metadata value for ad personalization");
                f().getClass();
                W(new i4(System.currentTimeMillis(), Long.valueOf(true != boolV.booleanValue() ? 0L : 1L), "_npa", "auto"), n4Var);
                return;
            }
            or orVar = a().f23059n;
            o1 o1Var = this.f22740l;
            orVar.e(o1Var.j.c(str), "Removing user property");
            m mVar = this.f22733c;
            U(mVar);
            mVar.n0();
            try {
                c0(n4Var);
                if ("_id".equals(str)) {
                    m mVar2 = this.f22733c;
                    U(mVar2);
                    pb.y.h(str2);
                    mVar2.t0(str2, "_lair");
                }
                m mVar3 = this.f22733c;
                U(mVar3);
                pb.y.h(str2);
                mVar3.t0(str2, str);
                m mVar4 = this.f22733c;
                U(mVar4);
                mVar4.o0();
                a().f23059n.e(o1Var.j.c(str), "User property removed");
                m mVar5 = this.f22733c;
                U(mVar5);
                mVar5.p0();
            } catch (Throwable th2) {
                m mVar6 = this.f22733c;
                U(mVar6);
                mVar6.p0();
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0385 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0395 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0428 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116 A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d A[Catch: all -> 0x00c4, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cb, B:38:0x00db, B:40:0x00ea, B:46:0x00ff, B:48:0x010c, B:50:0x0119, B:53:0x0120, B:56:0x013b, B:59:0x0154, B:62:0x0178, B:65:0x0185, B:67:0x019d, B:105:0x0276, B:107:0x02a1, B:108:0x02a4, B:110:0x02c3, B:151:0x0385, B:152:0x0388, B:154:0x0395, B:155:0x03a5, B:166:0x044b, B:113:0x02da, B:118:0x02f9, B:120:0x0301, B:122:0x0307, B:126:0x031a, B:130:0x032c, B:134:0x0337, B:137:0x034a, B:142:0x0369, B:144:0x036e, B:146:0x0376, B:148:0x037c, B:140:0x0357, B:128:0x0325, B:116:0x02e7, B:69:0x01ac, B:71:0x01d6, B:72:0x01e1, B:74:0x01e8, B:76:0x01ee, B:78:0x01f8, B:80:0x01fe, B:82:0x0204, B:84:0x020a, B:85:0x020f, B:87:0x0221, B:89:0x0227, B:95:0x0237, B:101:0x0241, B:102:0x0252, B:103:0x025e, B:104:0x026a, B:156:0x03be, B:158:0x03f2, B:159:0x03f5, B:161:0x0402, B:162:0x0410, B:163:0x0428, B:165:0x042f, B:54:0x012d, B:49:0x0116, B:42:0x00f4, B:45:0x00fc), top: B:175:0x00a4, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(ec.n4 r35) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.Y(ec.n4):void");
    }

    public final void Z(e eVar, n4 n4Var) {
        u uVar;
        pb.y.e(eVar.f22688a);
        pb.y.h(eVar.f22689b);
        pb.y.h(eVar.f22690c);
        pb.y.e(eVar.f22690c.f22800b);
        b().B();
        l0();
        if (T(n4Var)) {
            if (!n4Var.f22921h) {
                c0(n4Var);
                return;
            }
            e eVar2 = new e(eVar);
            boolean z3 = false;
            eVar2.f22692e = false;
            m mVar = this.f22733c;
            U(mVar);
            mVar.n0();
            try {
                m mVar2 = this.f22733c;
                U(mVar2);
                String str = eVar2.f22688a;
                pb.y.h(str);
                e eVarZ0 = mVar2.z0(str, eVar2.f22690c.f22800b);
                o1 o1Var = this.f22740l;
                if (eVarZ0 != null && !eVarZ0.f22689b.equals(eVar2.f22689b)) {
                    a().j.g("Updating a conditional user property with different origin. name, origin, origin (from DB)", o1Var.j.c(eVar2.f22690c.f22800b), eVar2.f22689b, eVarZ0.f22689b);
                }
                if (eVarZ0 != null && eVarZ0.f22692e) {
                    eVar2.f22689b = eVarZ0.f22689b;
                    eVar2.f22691d = eVarZ0.f22691d;
                    eVar2.f22694h = eVarZ0.f22694h;
                    eVar2.f22693f = eVarZ0.f22693f;
                    eVar2.f22695i = eVarZ0.f22695i;
                    eVar2.f22692e = true;
                    i4 i4Var = eVar2.f22690c;
                    eVar2.f22690c = new i4(eVarZ0.f22690c.f22801c, i4Var.a(), i4Var.f22800b, eVarZ0.f22690c.f22804f);
                } else if (TextUtils.isEmpty(eVar2.f22693f)) {
                    i4 i4Var2 = eVar2.f22690c;
                    eVar2.f22690c = new i4(eVar2.f22691d, i4Var2.a(), i4Var2.f22800b, eVar2.f22690c.f22804f);
                    eVar2.f22692e = true;
                    z3 = true;
                }
                if (eVar2.f22692e) {
                    i4 i4Var3 = eVar2.f22690c;
                    String str2 = eVar2.f22688a;
                    pb.y.h(str2);
                    String str3 = eVar2.f22689b;
                    String str4 = i4Var3.f22800b;
                    long j = i4Var3.f22801c;
                    Object objA = i4Var3.a();
                    pb.y.h(objA);
                    j4 j4Var = new j4(str2, str3, str4, j, objA);
                    Object obj = j4Var.f22828e;
                    String str5 = j4Var.f22826c;
                    m mVar3 = this.f22733c;
                    U(mVar3);
                    if (mVar3.u0(j4Var)) {
                        a().f23059n.g("User property updated immediately", eVar2.f22688a, o1Var.j.c(str5), obj);
                    } else {
                        a().g.g("(2)Too many active user properties, ignoring", s0.J(eVar2.f22688a), o1Var.j.c(str5), obj);
                    }
                    if (z3 && (uVar = eVar2.f22695i) != null) {
                        l(new u(uVar, eVar2.f22691d), n4Var);
                    }
                }
                m mVar4 = this.f22733c;
                U(mVar4);
                if (mVar4.y0(eVar2)) {
                    a().f23059n.g("Conditional property added", eVar2.f22688a, o1Var.j.c(eVar2.f22690c.f22800b), eVar2.f22690c.a());
                } else {
                    a().g.g("Too many conditional properties, ignoring", s0.J(eVar2.f22688a), o1Var.j.c(eVar2.f22690c.f22800b), eVar2.f22690c.a());
                }
                m mVar5 = this.f22733c;
                U(mVar5);
                mVar5.o0();
                m mVar6 = this.f22733c;
                U(mVar6);
                mVar6.p0();
            } catch (Throwable th2) {
                m mVar7 = this.f22733c;
                U(mVar7);
                mVar7.p0();
                throw th2;
            }
        }
    }

    @Override // ec.w1
    public final s0 a() {
        o1 o1Var = this.f22740l;
        pb.y.h(o1Var);
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        return s0Var;
    }

    public final void a0(e eVar, n4 n4Var) {
        pb.y.e(eVar.f22688a);
        pb.y.h(eVar.f22690c);
        pb.y.e(eVar.f22690c.f22800b);
        b().B();
        l0();
        if (T(n4Var)) {
            if (!n4Var.f22921h) {
                c0(n4Var);
                return;
            }
            m mVar = this.f22733c;
            U(mVar);
            mVar.n0();
            try {
                c0(n4Var);
                String str = eVar.f22688a;
                pb.y.h(str);
                m mVar2 = this.f22733c;
                U(mVar2);
                e eVarZ0 = mVar2.z0(str, eVar.f22690c.f22800b);
                o1 o1Var = this.f22740l;
                if (eVarZ0 != null) {
                    a().f23059n.f(eVar.f22688a, o1Var.j.c(eVar.f22690c.f22800b), "Removing conditional user property");
                    m mVar3 = this.f22733c;
                    U(mVar3);
                    mVar3.A0(str, eVar.f22690c.f22800b);
                    if (eVarZ0.f22692e) {
                        m mVar4 = this.f22733c;
                        U(mVar4);
                        mVar4.t0(str, eVar.f22690c.f22800b);
                    }
                    u uVar = eVar.f22696k;
                    if (uVar != null) {
                        t tVar = uVar.f23086b;
                        u uVarE0 = k0().e0(uVar.f23085a, tVar != null ? tVar.f() : null, eVarZ0.f22689b, uVar.f23088d, true);
                        pb.y.h(uVarE0);
                        l(uVarE0, n4Var);
                    }
                } else {
                    a().j.f(s0.J(eVar.f22688a), o1Var.j.c(eVar.f22690c.f22800b), "Conditional user property doesn't exist");
                }
                m mVar5 = this.f22733c;
                U(mVar5);
                mVar5.o0();
                m mVar6 = this.f22733c;
                U(mVar6);
                mVar6.p0();
            } catch (Throwable th2) {
                m mVar7 = this.f22733c;
                U(mVar7);
                mVar7.p0();
                throw th2;
            }
        }
    }

    @Override // ec.w1
    public final l1 b() {
        o1 o1Var = this.f22740l;
        pb.y.h(o1Var);
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        return l1Var;
    }

    public final void b0(n4 n4Var, long j) throws Throwable {
        m mVar = this.f22733c;
        U(mVar);
        String str = n4Var.f22915a;
        pb.y.h(str);
        x0 x0VarD0 = mVar.D0(str);
        if (x0VarD0 != null) {
            k0();
            String str2 = n4Var.f22916b;
            String strG = x0VarD0.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                pb.y.h(str2);
                if (!str2.equals(strG)) {
                    a().j.e(s0.J(x0VarD0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    m mVar2 = this.f22733c;
                    U(mVar2);
                    o1 o1Var = (o1) mVar2.f218b;
                    String strD = x0VarD0.D();
                    mVar2.C();
                    mVar2.B();
                    pb.y.e(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseQ0 = mVar2.q0();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseQ0.delete("events", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseQ0.delete("trigger_uris", "app_id=?", strArr);
                        if (o1Var.f22952d.L(null, d0.f22641i1)) {
                            iDelete += sQLiteDatabaseQ0.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            s0 s0Var = o1Var.f22954f;
                            o1.m(s0Var);
                            s0Var.f23060o.f(strD, Integer.valueOf(iDelete), "Deleted application data. app, records");
                        }
                    } catch (SQLiteException e2) {
                        s0 s0Var2 = o1Var.f22954f;
                        o1.m(s0Var2);
                        s0Var2.g.f(s0.J(strD), e2, "Error deleting application data. appId, error");
                    }
                    x0VarD0 = null;
                }
            }
        }
        if (x0VarD0 != null) {
            boolean z3 = (x0VarD0.P() == -2147483648L || x0VarD0.P() == n4Var.j) ? false : true;
            String strN = x0VarD0.N();
            if (z3 || ((x0VarD0.P() != -2147483648L || strN == null || strN.equals(n4Var.f22917c)) ? false : true)) {
                u uVar = new u("_au", new t(r5.c.g("_pv", strN)), "auto", j);
                if (e0().L(null, d0.f22627d1)) {
                    i(uVar, n4Var);
                } else {
                    j(uVar, n4Var);
                }
            }
        }
    }

    @Override // ec.w1
    public final b7.h c() {
        return this.f22740l.f22951c;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.x0 c0(ec.n4 r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.c0(ec.n4):ec.x0");
    }

    @Override // ec.w1
    public final Context d() {
        return this.f22740l.f22949a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, n4 n4Var) {
        int[] iArr;
        b().B();
        p8.a();
        g gVarE0 = e0();
        String str = n4Var.f22915a;
        if (!gVarE0.L(str, d0.Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().g.d("Uri sources and timestamps do not match");
                } else {
                    int i4 = 0;
                    while (i4 < intArray.length) {
                        m mVar = this.f22733c;
                        U(mVar);
                        o1 o1Var = (o1) mVar.f218b;
                        int i10 = intArray[i4];
                        long j = longArray[i4];
                        pb.y.e(str);
                        mVar.B();
                        mVar.C();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = mVar.q0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i10), String.valueOf(j)});
                                s0 s0Var = o1Var.f22954f;
                                o1.m(s0Var);
                                or orVar = s0Var.f23060o;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb2.append("Pruned ");
                                sb2.append(iDelete);
                                sb2.append(" trigger URIs. appId, source, timestamp");
                                orVar.g(sb2.toString(), str, Integer.valueOf(i10), Long.valueOf(j));
                            } catch (SQLiteException e2) {
                                e = e2;
                                s0 s0Var2 = o1Var.f22954f;
                                o1.m(s0Var2);
                                s0Var2.g.f(s0.J(str), e, "Error pruning trigger URIs. appId");
                                i4++;
                                intArray = iArr;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            iArr = intArray;
                        }
                        i4++;
                        intArray = iArr;
                    }
                }
            }
        }
        m mVar2 = this.f22733c;
        U(mVar2);
        String str2 = n4Var.f22915a;
        pb.y.e(str2);
        mVar2.B();
        mVar2.C();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar2.q0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new v3(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e11) {
                s0 s0Var3 = ((o1) mVar2.f218b).f22954f;
                o1.m(s0Var3);
                s0Var3.g.f(s0.J(str2), e11, "Error querying trigger uris. appId");
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

    public final a2 e(String str) {
        a2 a2Var = a2.f22541c;
        b().B();
        l0();
        HashMap map = this.B;
        a2 a2VarU = (a2) map.get(str);
        if (a2VarU == null) {
            m mVar = this.f22733c;
            U(mVar);
            a2VarU = mVar.U(str);
            if (a2VarU == null) {
                a2VarU = a2.f22541c;
            }
            b().B();
            l0();
            map.put(str, a2VarU);
            m mVar2 = this.f22733c;
            U(mVar2);
            mVar2.W(str, a2VarU);
        }
        return a2VarU;
    }

    public final g e0() {
        o1 o1Var = this.f22740l;
        pb.y.h(o1Var);
        return o1Var.f22952d;
    }

    @Override // ec.w1
    public final tb.a f() {
        o1 o1Var = this.f22740l;
        pb.y.h(o1Var);
        return o1Var.f22957k;
    }

    public final h1 f0() {
        h1 h1Var = this.f22731a;
        U(h1Var);
        return h1Var;
    }

    public final long g() {
        f().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        l3 l3Var = this.f22738i;
        l3Var.C();
        l3Var.B();
        a1 a1Var = l3Var.f22874k;
        long jA = a1Var.a();
        if (jA == 0) {
            o1.k(((o1) l3Var.f218b).f22956i);
            jA = r2.z0().nextInt(86400000) + 1;
            a1Var.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final m g0() {
        m mVar = this.f22733c;
        U(mVar);
        return mVar;
    }

    public final void h(u uVar, String str) {
        m mVar = this.f22733c;
        U(mVar);
        x0 x0VarD0 = mVar.D0(str);
        if (x0VarD0 != null) {
            o1 o1Var = x0VarD0.f23138a;
            if (!TextUtils.isEmpty(x0VarD0.N())) {
                Boolean boolP = P(x0VarD0);
                if (boolP == null) {
                    if (!"_ui".equals(uVar.f23085a)) {
                        a().j.e(s0.J(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    a().g.e(s0.J(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = x0VarD0.G();
                String strN = x0VarD0.N();
                long jP = x0VarD0.P();
                l1 l1Var = o1Var.g;
                o1.m(l1Var);
                l1Var.B();
                String str2 = x0VarD0.f23147l;
                l1 l1Var2 = o1Var.g;
                o1.m(l1Var2);
                l1Var2.B();
                long j = x0VarD0.f23148m;
                l1 l1Var3 = o1Var.g;
                o1.m(l1Var3);
                l1Var3.B();
                long j8 = x0VarD0.f23149n;
                l1 l1Var4 = o1Var.g;
                o1.m(l1Var4);
                l1Var4.B();
                boolean z3 = x0VarD0.f23150o;
                String strJ = x0VarD0.J();
                l1 l1Var5 = o1Var.g;
                o1.m(l1Var5);
                l1Var5.B();
                boolean z10 = x0VarD0.f23151p;
                Boolean boolW = x0VarD0.w();
                long jB = x0VarD0.b();
                l1 l1Var6 = o1Var.g;
                o1.m(l1Var6);
                l1Var6.B();
                ArrayList arrayList = x0VarD0.f23154s;
                String strG2 = e(str).g();
                boolean zY = x0VarD0.y();
                l1 l1Var7 = o1Var.g;
                o1.m(l1Var7);
                l1Var7.B();
                long j9 = x0VarD0.f23157v;
                int i4 = e(str).f22543b;
                String str3 = o0(str).f22941b;
                l1 l1Var8 = o1Var.g;
                o1.m(l1Var8);
                l1Var8.B();
                int i10 = x0VarD0.f23159x;
                l1 l1Var9 = o1Var.g;
                o1.m(l1Var9);
                l1Var9.B();
                i(uVar, new n4(str, strG, strN, jP, str2, j, j8, (String) null, z3, false, strJ, 0L, 0, z10, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j9, i4, str3, i10, x0VarD0.B, x0VarD0.C(), x0VarD0.s(), 0L, x0VarD0.t()));
                return;
            }
        }
        a().f23059n.e(str, "No app data available; dropping event");
    }

    public final y0 h0() {
        y0 y0Var = this.f22734d;
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
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
    public final void i(ec.u r11, ec.n4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.i(ec.u, ec.n4):void");
    }

    public final c i0() {
        c cVar = this.f22736f;
        U(cVar);
        return cVar;
    }

    public final void j(u uVar, n4 n4Var) {
        u uVar2;
        List listC0;
        o1 o1Var;
        List listC02;
        List<e> listC03;
        String str;
        pb.y.h(n4Var);
        String str2 = n4Var.f22915a;
        pb.y.e(str2);
        b().B();
        l0();
        long j = uVar.f23088d;
        t0 t0VarC = t0.c(uVar);
        b().B();
        l4.t0((this.F == null || (str = this.G) == null || !str.equals(str2)) ? null : this.F, (Bundle) t0VarC.f23072e, false);
        u uVarD = t0VarC.d();
        j0();
        if (TextUtils.isEmpty(n4Var.f22916b)) {
            return;
        }
        if (!n4Var.f22921h) {
            c0(n4Var);
            return;
        }
        List list = n4Var.f22930r;
        if (list != null) {
            String str3 = uVarD.f23085a;
            if (!list.contains(str3)) {
                a().f23059n.g("Dropping non-safelisted event. appId, event name, origin", str2, uVarD.f23085a, uVarD.f23087c);
                return;
            } else {
                Bundle bundleF = uVarD.f23086b.f();
                bundleF.putLong("ga_safelisted", 1L);
                uVar2 = new u(str3, new t(bundleF), uVarD.f23087c, uVarD.f23088d);
            }
        } else {
            uVar2 = uVarD;
        }
        m mVar = this.f22733c;
        U(mVar);
        mVar.n0();
        try {
            String str4 = uVar2.f23085a;
            if ("_s".equals(str4)) {
                m mVar2 = this.f22733c;
                U(mVar2);
                if (!mVar2.Q(str2, "_s") && uVar2.f23086b.f23067a.getLong("_sid") != 0) {
                    m mVar3 = this.f22733c;
                    U(mVar3);
                    if (mVar3.Q(str2, "_f")) {
                        m mVar4 = this.f22733c;
                        U(mVar4);
                        mVar4.T(str2, null, "_sid", k(uVar2, str2));
                    } else {
                        m mVar5 = this.f22733c;
                        U(mVar5);
                        if (mVar5.Q(str2, "_v")) {
                            m mVar42 = this.f22733c;
                            U(mVar42);
                            mVar42.T(str2, null, "_sid", k(uVar2, str2));
                        } else {
                            m mVar6 = this.f22733c;
                            U(mVar6);
                            f().getClass();
                            mVar6.T(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(uVar2, str2));
                        }
                    }
                }
            }
            m mVar7 = this.f22733c;
            U(mVar7);
            pb.y.e(str2);
            mVar7.B();
            mVar7.C();
            if (j < 0) {
                s0 s0Var = ((o1) mVar7.f218b).f22954f;
                o1.m(s0Var);
                s0Var.j.f(s0.J(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                listC0 = Collections.EMPTY_LIST;
            } else {
                listC0 = mVar7.C0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listC0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                o1Var = this.f22740l;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar != null) {
                    a().f23060o.g("User property timed out", eVar.f22688a, o1Var.j.c(eVar.f22690c.f22800b), eVar.f22690c.a());
                    u uVar3 = eVar.g;
                    if (uVar3 != null) {
                        l(new u(uVar3, j), n4Var);
                    }
                    m mVar8 = this.f22733c;
                    U(mVar8);
                    mVar8.A0(str2, eVar.f22690c.f22800b);
                }
            }
            m mVar9 = this.f22733c;
            U(mVar9);
            pb.y.e(str2);
            mVar9.B();
            mVar9.C();
            if (j < 0) {
                s0 s0Var2 = ((o1) mVar9.f218b).f22954f;
                o1.m(s0Var2);
                s0Var2.j.f(s0.J(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                listC02 = Collections.EMPTY_LIST;
            } else {
                listC02 = mVar9.C0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listC02.size());
            Iterator it2 = listC02.iterator();
            while (it2.hasNext()) {
                e eVar2 = (e) it2.next();
                if (eVar2 != null) {
                    Iterator it3 = it2;
                    a().f23060o.g("User property expired", eVar2.f22688a, o1Var.j.c(eVar2.f22690c.f22800b), eVar2.f22690c.a());
                    m mVar10 = this.f22733c;
                    U(mVar10);
                    mVar10.t0(str2, eVar2.f22690c.f22800b);
                    u uVar4 = eVar2.f22696k;
                    if (uVar4 != null) {
                        arrayList.add(uVar4);
                    }
                    m mVar11 = this.f22733c;
                    U(mVar11);
                    mVar11.A0(str2, eVar2.f22690c.f22800b);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                l(new u((u) obj, j), n4Var);
            }
            m mVar12 = this.f22733c;
            U(mVar12);
            pb.y.e(str2);
            pb.y.e(str4);
            mVar12.B();
            mVar12.C();
            if (j < 0) {
                o1 o1Var2 = (o1) mVar12.f218b;
                s0 s0Var3 = o1Var2.f22954f;
                o1.m(s0Var3);
                s0Var3.j.g("Invalid time querying triggered conditional properties", s0.J(str2), o1Var2.j.a(str4), Long.valueOf(j));
                listC03 = Collections.EMPTY_LIST;
            } else {
                listC03 = mVar12.C0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listC03.size());
            for (e eVar3 : listC03) {
                if (eVar3 != null) {
                    i4 i4Var = eVar3.f22690c;
                    String str5 = eVar3.f22688a;
                    pb.y.h(str5);
                    String str6 = eVar3.f22689b;
                    String str7 = i4Var.f22800b;
                    Object objA = i4Var.a();
                    pb.y.h(objA);
                    j4 j4Var = new j4(str5, str6, str7, j, objA);
                    Object obj2 = j4Var.f22828e;
                    String str8 = j4Var.f22826c;
                    m mVar13 = this.f22733c;
                    U(mVar13);
                    if (mVar13.u0(j4Var)) {
                        a().f23060o.g("User property triggered", eVar3.f22688a, o1Var.j.c(str8), obj2);
                    } else {
                        a().g.g("Too many active user properties, ignoring", s0.J(eVar3.f22688a), o1Var.j.c(str8), obj2);
                    }
                    u uVar5 = eVar3.f22695i;
                    if (uVar5 != null) {
                        arrayList2.add(uVar5);
                    }
                    eVar3.f22690c = new i4(j4Var);
                    eVar3.f22692e = true;
                    m mVar14 = this.f22733c;
                    U(mVar14);
                    mVar14.y0(eVar3);
                }
            }
            l(uVar2, n4Var);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                l(new u((u) obj3, j), n4Var);
            }
            m mVar15 = this.f22733c;
            U(mVar15);
            mVar15.o0();
            m mVar16 = this.f22733c;
            U(mVar16);
            mVar16.p0();
        } catch (Throwable th2) {
            m mVar17 = this.f22733c;
            U(mVar17);
            mVar17.p0();
            throw th2;
        }
    }

    public final w0 j0() {
        w0 w0Var = this.g;
        U(w0Var);
        return w0Var;
    }

    public final Bundle k(u uVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", uVar.f23086b.f23067a.getLong("_sid"));
        m mVar = this.f22733c;
        U(mVar);
        j4 j4VarV0 = mVar.v0(str, "_sno");
        if (j4VarV0 != null) {
            Object obj = j4VarV0.f22828e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final l4 k0() {
        o1 o1Var = this.f22740l;
        pb.y.h(o1Var);
        l4 l4Var = o1Var.f22956i;
        o1.k(l4Var);
        return l4Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:74|(12:76|(0)(1:79)|80|87|(1:89)|91|(0)(0)|94|102|(0)(0)|157|158)|78|81|396|82|86|80|87|(0)(0)|91|(0)(0)|94|102|(0)(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02fe, code lost:
    
        ((ec.o1) r10.f218b).a().F().f(ec.s0.J(r13), r0, "Error pruning currencies. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e5 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0890 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08a0 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x09b6 A[Catch: all -> 0x094a, TryCatch #5 {all -> 0x094a, blocks: (B:273:0x08b9, B:275:0x08c4, B:277:0x08d2, B:279:0x08dc, B:282:0x08f0, B:284:0x08fc, B:286:0x0908, B:288:0x0912, B:290:0x0920, B:292:0x0938, B:296:0x0951, B:298:0x095f, B:299:0x0968, B:301:0x0973, B:303:0x09b6, B:306:0x09c1, B:307:0x09cb, B:308:0x09cc, B:310:0x09d6, B:276:0x08c9), top: B:390:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x09d6 A[Catch: all -> 0x094a, TRY_LEAVE, TryCatch #5 {all -> 0x094a, blocks: (B:273:0x08b9, B:275:0x08c4, B:277:0x08d2, B:279:0x08dc, B:282:0x08f0, B:284:0x08fc, B:286:0x0908, B:288:0x0912, B:290:0x0920, B:292:0x0938, B:296:0x0951, B:298:0x095f, B:299:0x0968, B:301:0x0973, B:303:0x09b6, B:306:0x09c1, B:307:0x09cb, B:308:0x09cc, B:310:0x09d6, B:276:0x08c9), top: B:390:0x08b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0a47 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a65 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a7e A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b84 A[Catch: all -> 0x0a04, TryCatch #1 {all -> 0x0a04, blocks: (B:312:0x09df, B:314:0x09f6, B:318:0x0a07, B:320:0x0a3f, B:322:0x0a47, B:324:0x0a51, B:325:0x0a5b, B:327:0x0a65, B:328:0x0a6f, B:329:0x0a78, B:331:0x0a7e, B:333:0x0ac8, B:335:0x0ada, B:339:0x0af9, B:341:0x0b09, B:338:0x0ae9, B:345:0x0b1c, B:346:0x0b5e, B:347:0x0b69, B:348:0x0b7e, B:350:0x0b84, B:359:0x0bcf, B:360:0x0c1b, B:362:0x0c2c, B:376:0x0c95, B:367:0x0c46, B:368:0x0c49, B:353:0x0b92, B:355:0x0bbc, B:373:0x0c66, B:374:0x0c7f, B:375:0x0c80), top: B:384:0x09df, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c2c A[Catch: all -> 0x0a04, SQLiteException -> 0x0c42, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0c42, blocks: (B:360:0x0c1b, B:362:0x0c2c), top: B:388:0x0c1b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b92 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338 A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e A[Catch: all -> 0x01eb, TryCatch #6 {all -> 0x01eb, blocks: (B:35:0x01cc, B:38:0x01d9, B:40:0x01e1, B:46:0x01ef, B:91:0x036c, B:102:0x03a9, B:104:0x03e5, B:106:0x03ea, B:107:0x0401, B:109:0x040c, B:111:0x0426, B:113:0x042c, B:114:0x0443, B:117:0x0462, B:121:0x0484, B:122:0x049b, B:123:0x04a4, B:126:0x04c1, B:127:0x04d5, B:129:0x04dd, B:131:0x04e7, B:133:0x04ed, B:134:0x04f4, B:136:0x0501, B:138:0x0509, B:140:0x0511, B:142:0x0519, B:143:0x0525, B:144:0x0532, B:150:0x057a, B:151:0x058f, B:153:0x05be, B:156:0x05e8, B:160:0x0638, B:163:0x0666, B:165:0x0695, B:166:0x0698, B:168:0x069e, B:170:0x06a6, B:172:0x06ac, B:174:0x06b4, B:176:0x06ba, B:180:0x06c9, B:183:0x06d8, B:185:0x06e1, B:187:0x06e9, B:190:0x071a, B:192:0x0723, B:196:0x0738, B:201:0x0745, B:236:0x07c0, B:237:0x07c7, B:239:0x07ea, B:242:0x07f3, B:246:0x07fe, B:247:0x0818, B:249:0x081e, B:251:0x0838, B:253:0x0844, B:255:0x0851, B:262:0x0886, B:266:0x0890, B:267:0x0893, B:269:0x08a0, B:270:0x08a3, B:281:0x08e7, B:260:0x0872, B:240:0x07ed, B:204:0x074e, B:208:0x075b, B:212:0x0769, B:216:0x0777, B:220:0x0785, B:224:0x0793, B:228:0x079f, B:232:0x07ad, B:162:0x0659, B:147:0x055f, B:95:0x037e, B:96:0x038a, B:98:0x0390, B:100:0x039e, B:54:0x020f, B:57:0x021d, B:59:0x0232, B:65:0x024a, B:70:0x027a, B:72:0x0280, B:74:0x028e, B:76:0x029c, B:79:0x02a5, B:87:0x032e, B:89:0x0338, B:81:0x02d2, B:82:0x02eb, B:86:0x0313, B:85:0x02fe, B:68:0x0256, B:69:0x0274), top: B:391:0x01cc, inners: #7, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(ec.u r60, ec.n4 r61) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.l(ec.u, ec.n4):void");
    }

    public final void l0() {
        if (!this.f22741m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void m(x0 x0Var, com.google.android.gms.internal.measurement.i3 i3Var) {
        jf.c cVar;
        com.google.android.gms.internal.measurement.s3 s3Var;
        h hVar;
        b().B();
        l0();
        String strB0 = ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).B0();
        EnumMap enumMap = new EnumMap(z1.class);
        int length = strB0.length();
        int length2 = z1.values().length;
        h hVar2 = h.UNSET;
        int i4 = 0;
        if (length < length2 || strB0.charAt(0) != '1') {
            cVar = new jf.c(10);
        } else {
            z1[] z1VarArrValues = z1.values();
            int length3 = z1VarArrValues.length;
            int i10 = 0;
            int i11 = 1;
            while (i10 < length3) {
                z1 z1Var = z1VarArrValues[i10];
                int i12 = i11 + 1;
                char cCharAt = strB0.charAt(i11);
                h[] hVarArrValues = h.values();
                int length4 = hVarArrValues.length;
                int i13 = i4;
                while (true) {
                    if (i13 >= length4) {
                        hVar = hVar2;
                        break;
                    }
                    hVar = hVarArrValues[i13];
                    if (hVar.f22763a == cCharAt) {
                        break;
                    } else {
                        i13++;
                    }
                }
                enumMap.put((EnumMap) z1Var, (z1) hVar);
                i10++;
                i11 = i12;
                i4 = 0;
            }
            cVar = new jf.c(enumMap);
        }
        String strD = x0Var.D();
        b().B();
        l0();
        a2 a2VarE = e(strD);
        EnumMap enumMap2 = a2VarE.f22542a;
        z1 z1Var2 = z1.AD_STORAGE;
        x1 x1Var = (x1) enumMap2.get(z1Var2);
        x1 x1Var2 = x1.UNINITIALIZED;
        if (x1Var == null) {
            x1Var = x1Var2;
        }
        int i14 = a2VarE.f22543b;
        int iOrdinal = x1Var.ordinal();
        h hVar3 = h.REMOTE_ENFORCED_DEFAULT;
        h hVar4 = h.FAILSAFE;
        if (iOrdinal == 1) {
            cVar.B(z1Var2, hVar3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            cVar.A(z1Var2, i14);
        } else {
            cVar.B(z1Var2, hVar4);
        }
        z1 z1Var3 = z1.ANALYTICS_STORAGE;
        x1 x1Var3 = (x1) enumMap2.get(z1Var3);
        if (x1Var3 != null) {
            x1Var2 = x1Var3;
        }
        int iOrdinal2 = x1Var2.ordinal();
        if (iOrdinal2 == 1) {
            cVar.B(z1Var3, hVar3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            cVar.A(z1Var3, i14);
        } else {
            cVar.B(z1Var3, hVar4);
        }
        String strD2 = x0Var.D();
        b().B();
        l0();
        o oVarQ0 = q0(strD2, o0(strD2), e(strD2), cVar);
        String str = oVarQ0.f22943d;
        Boolean bool = oVarQ0.f22942c;
        pb.y.h(bool);
        boolean zBooleanValue = bool.booleanValue();
        i3Var.b();
        ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).f1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).g1(str);
        }
        b().B();
        l0();
        Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).U1()).iterator();
        while (true) {
            if (it.hasNext()) {
                s3Var = (com.google.android.gms.internal.measurement.s3) it.next();
                if ("_npa".equals(s3Var.r())) {
                    break;
                }
            } else {
                s3Var = null;
                break;
            }
        }
        if (s3Var != null) {
            EnumMap enumMap3 = (EnumMap) cVar.f27642b;
            z1 z1Var4 = z1.AD_PERSONALIZATION;
            h hVar5 = (h) enumMap3.get(z1Var4);
            if (hVar5 == null) {
                hVar5 = hVar2;
            }
            if (hVar5 == hVar2) {
                m mVar = this.f22733c;
                U(mVar);
                j4 j4VarV0 = mVar.v0(x0Var.D(), "_npa");
                h hVar6 = h.MANIFEST;
                h hVar7 = h.API;
                if (j4VarV0 != null) {
                    String str2 = j4VarV0.f22825b;
                    if ("tcf".equals(str2)) {
                        cVar.B(z1Var4, h.TCF);
                    } else if ("app".equals(str2)) {
                        cVar.B(z1Var4, hVar7);
                    } else {
                        cVar.B(z1Var4, hVar6);
                    }
                } else {
                    Boolean boolW = x0Var.w();
                    if (boolW == null || ((boolW.booleanValue() && s3Var.v() != 1) || !(boolW.booleanValue() || s3Var.v() == 0))) {
                        cVar.B(z1Var4, hVar7);
                    } else {
                        cVar.B(z1Var4, hVar6);
                    }
                }
            }
        } else {
            int iF = F(x0Var.D(), cVar);
            com.google.android.gms.internal.measurement.r3 r3VarA = com.google.android.gms.internal.measurement.s3.A();
            r3VarA.b();
            ((com.google.android.gms.internal.measurement.s3) r3VarA.f19740b).C("_npa");
            f().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            r3VarA.b();
            ((com.google.android.gms.internal.measurement.s3) r3VarA.f19740b).B(jCurrentTimeMillis);
            r3VarA.b();
            ((com.google.android.gms.internal.measurement.s3) r3VarA.f19740b).F(iF);
            com.google.android.gms.internal.measurement.s3 s3Var2 = (com.google.android.gms.internal.measurement.s3) r3VarA.f();
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).d0(s3Var2);
            a().f23060o.f("non_personalized_ads(_npa)", Integer.valueOf(iF), "Setting user property");
        }
        String string = cVar.toString();
        i3Var.b();
        ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).e1(string);
        String strD3 = x0Var.D();
        h1 h1Var = this.f22731a;
        h1Var.B();
        h1Var.H(strD3);
        com.google.android.gms.internal.measurement.a2 a2VarW = h1Var.W(strD3);
        boolean z3 = a2VarW == null || !a2VarW.s() || a2VarW.t();
        List listV = i3Var.V();
        for (int i15 = 0; i15 < listV.size(); i15++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.b3) listV.get(i15)).s())) {
                com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.b3) listV.get(i15)).i();
                List listI = a3Var.i();
                int i16 = 0;
                while (true) {
                    if (i16 >= listI.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.e3) listI.get(i16)).q())) {
                        String strS = ((com.google.android.gms.internal.measurement.e3) listI.get(i16)).s();
                        if (z3 && strS.length() > 4) {
                            char[] charArray = strS.toCharArray();
                            int i17 = 1;
                            while (true) {
                                if (i17 >= 64) {
                                    i17 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i17 | 1);
                            strS = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.d3 d3VarB = com.google.android.gms.internal.measurement.e3.B();
                        d3VarB.i("_tcfd");
                        d3VarB.j(strS);
                        a3Var.b();
                        ((com.google.android.gms.internal.measurement.b3) a3Var.f19740b).A(i16, (com.google.android.gms.internal.measurement.e3) d3VarB.f());
                    } else {
                        i16++;
                    }
                }
                i3Var.X(i15, a3Var);
                return;
            }
        }
    }

    public final void m0(n4 n4Var) {
        b().B();
        l0();
        String str = n4Var.f22915a;
        pb.y.e(str);
        a2 a2VarC = a2.c(n4Var.f22936x, n4Var.f22931s);
        e(str);
        a().f23060o.f(str, a2VarC, "Setting storage consent for package");
        b().B();
        l0();
        this.B.put(str, a2VarC);
        m mVar = this.f22733c;
        U(mVar);
        mVar.W(str, a2VarC);
    }

    public final void n(x0 x0Var, com.google.android.gms.internal.measurement.i3 i3Var) {
        Serializable serializableQ;
        b().B();
        l0();
        com.google.android.gms.internal.measurement.l2 l2VarO = com.google.android.gms.internal.measurement.o2.O();
        o1 o1Var = x0Var.f23138a;
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.B();
        byte[] bArr = x0Var.H;
        if (bArr != null) {
            try {
                l2VarO = (com.google.android.gms.internal.measurement.l2) w0.o0(l2VarO, bArr);
            } catch (p5 unused) {
                a().j.e(s0.J(x0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = i3Var.V().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) it.next();
            if (b3Var.s().equals("_cmp")) {
                com.google.android.gms.internal.measurement.e3 e3VarJ = w0.J(b3Var, "gclid");
                Serializable serializableQ2 = e3VarJ == null ? null : w0.Q(e3VarJ);
                if (serializableQ2 == null) {
                    serializableQ2 = "";
                }
                String str = (String) serializableQ2;
                com.google.android.gms.internal.measurement.e3 e3VarJ2 = w0.J(b3Var, "gbraid");
                Serializable serializableQ3 = e3VarJ2 == null ? null : w0.Q(e3VarJ2);
                if (serializableQ3 == null) {
                    serializableQ3 = "";
                }
                String str2 = (String) serializableQ3;
                com.google.android.gms.internal.measurement.e3 e3VarJ3 = w0.J(b3Var, "gad_source");
                Object objQ = e3VarJ3 == null ? null : w0.Q(e3VarJ3);
                String str3 = (String) (objQ != null ? objQ : "");
                String[] strArrSplit = ((String) d0.f22638h1.a(null)).split(",");
                j0();
                HashMap map = new HashMap();
                for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.p()) {
                    if (Arrays.asList(strArrSplit).contains(e3Var.q()) && (serializableQ = w0.Q(e3Var)) != null) {
                        map.put(e3Var.q(), serializableQ);
                    }
                }
                if (!map.isEmpty()) {
                    com.google.android.gms.internal.measurement.e3 e3VarJ4 = w0.J(b3Var, "click_timestamp");
                    Object objQ2 = e3VarJ4 == null ? null : w0.Q(e3VarJ4);
                    long jLongValue = ((Long) (objQ2 != null ? objQ2 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = b3Var.u();
                    }
                    com.google.android.gms.internal.measurement.e3 e3VarJ5 = w0.J(b3Var, "_cis");
                    if ("referrer API v2".equals(e3VarJ5 != null ? w0.Q(e3VarJ5) : null)) {
                        if (jLongValue > ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).N()) {
                            if (str.isEmpty()) {
                                l2VarO.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).q();
                            } else {
                                l2VarO.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).p(str);
                            }
                            if (str2.isEmpty()) {
                                l2VarO.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).s();
                            } else {
                                l2VarO.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).r(str2);
                            }
                            if (str3.isEmpty()) {
                                l2VarO.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).u();
                            } else {
                                l2VarO.b();
                                ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).t(str3);
                            }
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).v(jLongValue);
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).x().clear();
                            HashMap mapG = G(b3Var);
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).x().putAll(mapG);
                        }
                    } else if (jLongValue > ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).F()) {
                        if (str.isEmpty()) {
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).R();
                        } else {
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).Q(str);
                        }
                        if (str2.isEmpty()) {
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).T();
                        } else {
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).S(str2);
                        }
                        if (str3.isEmpty()) {
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).V();
                        } else {
                            l2VarO.b();
                            ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).U(str3);
                        }
                        l2VarO.b();
                        ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).W(jLongValue);
                        l2VarO.b();
                        ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).w().clear();
                        HashMap mapG2 = G(b3Var);
                        l2VarO.b();
                        ((com.google.android.gms.internal.measurement.o2) l2VarO.f19740b).w().putAll(mapG2);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.o2) l2VarO.f()).equals(com.google.android.gms.internal.measurement.o2.P())) {
            com.google.android.gms.internal.measurement.o2 o2Var = (com.google.android.gms.internal.measurement.o2) l2VarO.f();
            i3Var.b();
            ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).k1(o2Var);
        }
        byte[] bArrA = ((com.google.android.gms.internal.measurement.o2) l2VarO.f()).a();
        l1 l1Var2 = o1Var.g;
        o1.m(l1Var2);
        l1Var2.B();
        x0Var.Q |= x0Var.H != bArrA;
        x0Var.H = bArrA;
        if (x0Var.o()) {
            m mVar = this.f22733c;
            U(mVar);
            mVar.E0(x0Var, false);
        }
        if (e0().L(null, d0.f22635g1)) {
            m mVar2 = this.f22733c;
            U(mVar2);
            mVar2.t0(x0Var.D(), "_lgclid");
        }
    }

    public final void n0(n4 n4Var) throws NumberFormatException {
        b().B();
        l0();
        String str = n4Var.f22915a;
        pb.y.e(str);
        o oVarB = o.b(n4Var.f22937y);
        a().f23060o.f(str, oVarB, "Setting DMA consent for package");
        b().B();
        l0();
        x1 x1VarA = o.c(100, p0(str)).a();
        this.C.put(str, oVarB);
        m mVar = this.f22733c;
        U(mVar);
        pb.y.h(str);
        pb.y.h(oVarB);
        mVar.B();
        mVar.C();
        a2 a2VarU = mVar.U(str);
        a2 a2Var = a2.f22541c;
        if (a2VarU == a2Var) {
            mVar.W(str, a2Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", oVarB.f22941b);
        mVar.Y(contentValues);
        x1 x1VarA2 = o.c(100, p0(str)).a();
        b().B();
        l0();
        x1 x1Var = x1.GRANTED;
        x1 x1Var2 = x1.DENIED;
        boolean z3 = x1VarA == x1Var2 && x1VarA2 == x1Var;
        boolean z10 = x1VarA == x1Var && x1VarA2 == x1Var2;
        if (z3 || z10) {
            a().f23060o.e(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            m mVar2 = this.f22733c;
            U(mVar2);
            if (mVar2.F0(g(), str, false, false, false, false).f22810f < e0().J(str, d0.f22653n0)) {
                bundle.putLong("_r", 1L);
                m mVar3 = this.f22733c;
                U(mVar3);
                a().f23060o.f(str, Long.valueOf(mVar3.F0(g(), str, false, false, true, false).f22810f), "_dcu realtime event count");
            }
            this.J.M(str, "_dcu", bundle);
        }
    }

    public final String o(a2 a2Var) {
        if (!a2Var.i(z1.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().z0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final o o0(String str) throws NumberFormatException {
        b().B();
        l0();
        HashMap map = this.C;
        o oVar = (o) map.get(str);
        if (oVar != null) {
            return oVar;
        }
        m mVar = this.f22733c;
        U(mVar);
        pb.y.h(str);
        mVar.B();
        mVar.C();
        o oVarB = o.b(mVar.X("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, oVarB);
        return oVarB;
    }

    public final void p(ArrayList arrayList) {
        pb.y.b(!arrayList.isEmpty());
        if (this.f22753y != null) {
            a().g.d("Set uploading progress before finishing the previous upload");
        } else {
            this.f22753y = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle p0(String str) {
        b().B();
        l0();
        h1 h1Var = this.f22731a;
        U(h1Var);
        if (h1Var.W(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        a2 a2VarE = e(str);
        Bundle bundle2 = new Bundle();
        Iterator it = a2VarE.f22542a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((x1) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((z1) entry.getKey()).f23248a, str2);
            }
        }
        bundle.putAll(bundle2);
        o oVarQ0 = q0(str, o0(str), a2VarE, new jf.c(10));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : oVarQ0.f22944e.entrySet()) {
            int iOrdinal2 = ((x1) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((z1) entry2.getKey()).f23248a, str3);
            }
        }
        Boolean bool = oVarQ0.f22942c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = oVarQ0.f22943d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        m mVar = this.f22733c;
        U(mVar);
        j4 j4VarV0 = mVar.v0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (j4VarV0 != null ? j4VarV0.f22828e.equals(1L) : F(str, new jf.c(10))) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ec.g4] */
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
    public final void q() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.q():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.o q0(java.lang.String r12, ec.o r13, ec.a2 r14, jf.c r15) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.q0(java.lang.String, ec.o, ec.a2, jf.c):ec.o");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r24
  0x006f: PHI (r0v114 java.util.List) = (r0v8 java.util.List), (r0v136 java.util.List) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r11v55 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v57 android.database.Cursor) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x006f: PHI (r24v19 long) = (r24v2 long), (r24v20 long) binds: [B:108:0x0225, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x07f7 A[EDGE_INSN: B:438:0x07f7->B:313:0x07f7 BREAK  A[LOOP:4: B:259:0x064e->B:312:0x07e9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:477:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(long r32, java.lang.String r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.r(long, java.lang.String):void");
    }

    public final boolean s(String str, String str2) {
        m mVar = this.f22733c;
        U(mVar);
        x0 x0VarD0 = mVar.D0(str);
        HashMap map = this.E;
        if (x0VarD0 != null && k0().c0(str, x0VarD0.C())) {
            map.remove(str2);
            return true;
        }
        f4 f4Var = (f4) map.get(str2);
        if (f4Var != null) {
            f4Var.f22713a.f().getClass();
            if (System.currentTimeMillis() < f4Var.f22715c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        b().B();
        l0();
        this.f22750v = true;
        try {
            o1 o1Var = this.f22740l;
            o1Var.getClass();
            Boolean bool = o1Var.p().f22820f;
            if (bool == null) {
                a().j.d("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().g.d("Upload called in the client side when service should be used");
            } else if (this.f22743o > 0) {
                N();
            } else {
                w0 w0Var = this.f22732b;
                U(w0Var);
                if (w0Var.V()) {
                    m mVar = this.f22733c;
                    U(mVar);
                    if (mVar.H(str)) {
                        m mVar2 = this.f22733c;
                        U(mVar2);
                        pb.y.e(str);
                        mVar2.B();
                        mVar2.C();
                        List listG = mVar2.G(str, z3.a(x2.GOOGLE_SIGNAL), 1);
                        h4 h4Var = listG.isEmpty() ? null : (h4) listG.get(0);
                        if (h4Var != null) {
                            com.google.android.gms.internal.measurement.h3 h3Var = h4Var.f22779b;
                            a().f23060o.g("[sgtm] Uploading data from upload queue. appId, type, url", str, h4Var.f22782e, h4Var.f22780c);
                            byte[] bArrA = h3Var.a();
                            if (Log.isLoggable(a().L(), 2)) {
                                w0 w0Var2 = this.g;
                                U(w0Var2);
                                a().f23060o.g("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrA.length), w0Var2.e0(h3Var));
                            }
                            c4 c4Var = new c4(h4Var.f22780c, h4Var.f22781d, h4Var.f22782e, null);
                            this.f22749u = true;
                            w0 w0Var3 = this.f22732b;
                            U(w0Var3);
                            w0Var3.a0(str, c4Var, h3Var, new yb.e(this, str, (Object) h4Var, 19));
                        }
                    } else {
                        a().f23060o.e(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    a().f23060o.d("Network not connected, ignoring upload request");
                    N();
                }
            }
            this.f22750v = false;
            O();
        } catch (Throwable th2) {
            this.f22750v = false;
            O();
            throw th2;
        }
    }

    public final void u(String str, boolean z3, Long l10, Long l11) {
        m mVar = this.f22733c;
        U(mVar);
        x0 x0VarD0 = mVar.D0(str);
        if (x0VarD0 != null) {
            o1 o1Var = x0VarD0.f23138a;
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            l1Var.B();
            x0VarD0.Q |= x0VarD0.f23160y != z3;
            x0VarD0.f23160y = z3;
            l1 l1Var2 = o1Var.g;
            o1.m(l1Var2);
            l1Var2.B();
            x0VarD0.Q |= !Objects.equals(x0VarD0.f23161z, l10);
            x0VarD0.f23161z = l10;
            l1 l1Var3 = o1Var.g;
            o1.m(l1Var3);
            l1Var3.B();
            x0VarD0.Q |= !Objects.equals(x0VarD0.A, l11);
            x0VarD0.A = l11;
            if (x0VarD0.o()) {
                m mVar2 = this.f22733c;
                U(mVar2);
                mVar2.E0(x0VarD0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.google.android.gms.internal.measurement.i3 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.v(com.google.android.gms.internal.measurement.i3, java.lang.String):void");
    }

    public final void w(com.google.android.gms.internal.measurement.i3 i3Var, b8.d dVar) {
        String strU0;
        String strU02;
        for (int i4 = 0; i4 < i3Var.W(); i4++) {
            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).T1(i4).i();
            Iterator it = a3Var.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.e3) it.next()).q())) {
                    if (((com.google.android.gms.internal.measurement.j3) dVar.f2074b).G0() >= e0().J(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), d0.f22651m0)) {
                        int iJ = e0().J(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), d0.f22677z0);
                        LinkedList linkedList = this.f22745q;
                        w0 w0Var = this.g;
                        if (iJ > 0) {
                            m mVar = this.f22733c;
                            U(mVar);
                            if (mVar.F0(g(), ((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), false, false, false, true).g > iJ) {
                                com.google.android.gms.internal.measurement.d3 d3VarB = com.google.android.gms.internal.measurement.e3.B();
                                d3VarB.i("_tnr");
                                d3VarB.k(1L);
                                a3Var.l((com.google.android.gms.internal.measurement.e3) d3VarB.f());
                            } else {
                                if (e0().L(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), d0.S0)) {
                                    strU02 = k0().u0();
                                    com.google.android.gms.internal.measurement.d3 d3VarB2 = com.google.android.gms.internal.measurement.e3.B();
                                    d3VarB2.i("_tu");
                                    d3VarB2.j(strU02);
                                    a3Var.l((com.google.android.gms.internal.measurement.e3) d3VarB2.f());
                                } else {
                                    strU02 = null;
                                }
                                com.google.android.gms.internal.measurement.d3 d3VarB3 = com.google.android.gms.internal.measurement.e3.B();
                                d3VarB3.i("_tr");
                                d3VarB3.k(1L);
                                a3Var.l((com.google.android.gms.internal.measurement.e3) d3VarB3.f());
                                U(w0Var);
                                v3 v3VarC0 = w0Var.c0(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), i3Var, a3Var, strU02);
                                if (v3VarC0 != null) {
                                    a().f23060o.f(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), v3VarC0.f23101a, "Generated trigger URI. appId, uri");
                                    m mVar2 = this.f22733c;
                                    U(mVar2);
                                    mVar2.V(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), v3VarC0);
                                    if (!linkedList.contains(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p())) {
                                        linkedList.add(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p());
                                    }
                                }
                            }
                        } else {
                            if (e0().L(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), d0.S0)) {
                                strU0 = k0().u0();
                                com.google.android.gms.internal.measurement.d3 d3VarB4 = com.google.android.gms.internal.measurement.e3.B();
                                d3VarB4.i("_tu");
                                d3VarB4.j(strU0);
                                a3Var.l((com.google.android.gms.internal.measurement.e3) d3VarB4.f());
                            } else {
                                strU0 = null;
                            }
                            com.google.android.gms.internal.measurement.d3 d3VarB5 = com.google.android.gms.internal.measurement.e3.B();
                            d3VarB5.i("_tr");
                            d3VarB5.k(1L);
                            a3Var.l((com.google.android.gms.internal.measurement.e3) d3VarB5.f());
                            U(w0Var);
                            v3 v3VarC02 = w0Var.c0(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), i3Var, a3Var, strU0);
                            if (v3VarC02 != null) {
                                a().f23060o.f(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), v3VarC02.f23101a, "Generated trigger URI. appId, uri");
                                m mVar3 = this.f22733c;
                                U(mVar3);
                                mVar3.V(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p(), v3VarC02);
                                if (!linkedList.contains(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p())) {
                                    linkedList.add(((com.google.android.gms.internal.measurement.j3) dVar.f2074b).p());
                                }
                            }
                        }
                    }
                    com.google.android.gms.internal.measurement.b3 b3Var = (com.google.android.gms.internal.measurement.b3) a3Var.f();
                    i3Var.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var.f19740b).X(i4, b3Var);
                }
            }
        }
    }

    public final void x(String str, com.google.android.gms.internal.measurement.d3 d3Var, Bundle bundle, String str2) {
        int iMax;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (l4.a0(((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).q()) || l4.a0(str)) {
            g gVarE0 = e0();
            gVarE0.getClass();
            iMax = Math.max(Math.max(Math.min(gVarE0.J(str2, d0.f22640i0), 500), 100), 256);
        } else {
            g gVarE02 = e0();
            gVarE02.getClass();
            iMax = Math.max(Math.min(gVarE02.J(str2, d0.f22640i0), 500), 100);
        }
        long j = iMax;
        long jCodePointCount = ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).s().codePointCount(0, ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).s().length());
        k0();
        String strQ = ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).q();
        e0();
        String strG = l4.G(true, 40, strQ);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).q())) {
            return;
        }
        if ("_ev".equals(((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).q())) {
            k0();
            String strS = ((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).s();
            g gVarE03 = e0();
            gVarE03.getClass();
            bundle.putString("_ev", l4.G(true, Math.max(Math.max(Math.min(gVarE03.J(str2, d0.f22640i0), 500), 100), 256), strS));
            return;
        }
        a().f23057l.f(strG, Long.valueOf(jCodePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strG);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((com.google.android.gms.internal.measurement.e3) d3Var.f19740b).q());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0153 A[EDGE_INSN: B:105:0x0153->B:52:0x0153 BREAK  A[LOOP:0: B:33:0x00f5->B:107:0x00f5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x0018, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: all -> 0x0018, PHI: r0
  0x008f: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b8 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0230 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.g4.y(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final void z(x0 x0Var) throws MalformedURLException {
        x.e eVar;
        x.e eVar2;
        b().B();
        if (TextUtils.isEmpty(x0Var.G())) {
            String strD = x0Var.D();
            pb.y.h(strD);
            A(strD, 204, null, null, null);
            return;
        }
        String strD2 = x0Var.D();
        pb.y.h(strD2);
        a().f23060o.e(strD2, "Fetching remote configuration");
        h1 h1Var = this.f22731a;
        U(h1Var);
        com.google.android.gms.internal.measurement.f2 f2VarN = h1Var.N(strD2);
        U(h1Var);
        h1Var.B();
        String str = (String) h1Var.f22771n.get(strD2);
        if (f2VarN != null) {
            if (TextUtils.isEmpty(str)) {
                eVar2 = null;
            } else {
                eVar2 = new x.e(0);
                eVar2.put("If-Modified-Since", str);
            }
            U(h1Var);
            h1Var.B();
            String str2 = (String) h1Var.f22772o.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (eVar2 == null) {
                    eVar2 = new x.e(0);
                }
                eVar2.put("If-None-Match", str2);
            }
            eVar = eVar2;
        } else {
            eVar = null;
        }
        this.f22748t = true;
        w0 w0Var = this.f22732b;
        U(w0Var);
        p6.i iVar = new p6.i(this);
        o1 o1Var = (o1) w0Var.f218b;
        w0Var.B();
        w0Var.C();
        d4 d4Var = w0Var.f23175c.j;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) d0.f22631f.a(null)).encodedAuthority((String) d0.g.a(null)).path("config/app/".concat(String.valueOf(x0Var.G()))).appendQueryParameter("platform", "android");
        ((o1) d4Var.f218b).f22952d.G();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            l1Var.N(new v0(w0Var, x0Var.D(), url, (byte[]) null, eVar, iVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.f(s0.J(x0Var.D()), string, "Failed to parse config URL. Not fetching. appId");
        }
    }
}
