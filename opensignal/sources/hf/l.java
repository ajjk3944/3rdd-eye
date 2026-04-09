package hf;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import io.sentry.android.core.e0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import lf.b0;
import lf.h1;
import lf.i0;
import lf.j0;
import lf.k0;
import lf.k1;
import lf.l1;
import lf.m0;
import lf.m1;
import lf.m2;
import lf.n1;
import lf.n2;
import p.v2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: r, reason: collision with root package name */
    public static final g f10665r = new g(1);

    /* renamed from: s, reason: collision with root package name */
    public static final Charset f10666s = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f10667a;

    /* renamed from: b, reason: collision with root package name */
    public final cj.a f10668b;

    /* renamed from: c, reason: collision with root package name */
    public final bm.e f10669c;

    /* renamed from: d, reason: collision with root package name */
    public final v2 f10670d;

    /* renamed from: e, reason: collision with root package name */
    public final jf.d f10671e;

    /* renamed from: f, reason: collision with root package name */
    public final x f10672f;

    /* renamed from: g, reason: collision with root package name */
    public final of.b f10673g;

    /* renamed from: h, reason: collision with root package name */
    public final a8.f f10674h;

    /* renamed from: i, reason: collision with root package name */
    public final kf.e f10675i;
    public final ef.a j;
    public final ff.a k;

    /* renamed from: l, reason: collision with root package name */
    public final i f10676l;

    /* renamed from: m, reason: collision with root package name */
    public final r2 f10677m;

    /* renamed from: n, reason: collision with root package name */
    public s f10678n;

    /* renamed from: o, reason: collision with root package name */
    public final dd.h f10679o = new dd.h();

    /* renamed from: p, reason: collision with root package name */
    public final dd.h f10680p = new dd.h();

    /* renamed from: q, reason: collision with root package name */
    public final dd.h f10681q = new dd.h();

    public l(Context context, x xVar, cj.a aVar, of.b bVar, bm.e eVar, a8.f fVar, v2 v2Var, kf.e eVar2, r2 r2Var, ef.a aVar2, ff.a aVar3, i iVar, jf.d dVar) {
        new AtomicBoolean(false);
        this.f10667a = context;
        this.f10672f = xVar;
        this.f10668b = aVar;
        this.f10673g = bVar;
        this.f10669c = eVar;
        this.f10674h = fVar;
        this.f10670d = v2Var;
        this.f10675i = eVar2;
        this.j = aVar2;
        this.k = aVar3;
        this.f10676l = iVar;
        this.f10677m = r2Var;
        this.f10671e = dVar;
    }

    public static dd.r a(l lVar) {
        dd.r rVarN;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : of.b.m(((File) lVar.f10673g.f19423g).listFiles(f10665r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    e0.q("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    rVarN = e5.u(null);
                } catch (ClassNotFoundException unused) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    rVarN = e5.n(new ScheduledThreadPoolExecutor(1), new k(lVar, j));
                }
                arrayList.add(rVarN);
            } catch (NumberFormatException unused2) {
                e0.q("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return e5.U(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0476 A[LOOP:2: B:143:0x0476->B:145:0x047c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06d1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r33, al.b r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.l.b(boolean, al.b, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    public final void c(String str, Boolean bool) throws Throwable {
        long j;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Log.isLoggable("FirebaseCrashlytics", 3);
        Locale locale = Locale.US;
        x xVar = this.f10672f;
        a8.f fVar = this.f10674h;
        l1 l1Var = new l1(xVar.f10728c, (String) fVar.f200f, (String) fVar.f201g, xVar.c().f10640a, t.determineFrom((String) fVar.f198d).getId(), (io.sentry.internal.debugmeta.c) fVar.f202h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(f.g());
        Context context = this.f10667a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iOrdinal = e.getValue().ordinal();
        String str4 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = f.a(context);
        boolean zF = f.f();
        int iC = f.c();
        String str5 = Build.MANUFACTURER;
        String str6 = Build.PRODUCT;
        m1 m1Var = new m1(iOrdinal, iAvailableProcessors, jA, statFs.getBlockCount() * statFs.getBlockSize(), zF, iC);
        ef.a aVar = this.j;
        k1 k1Var = new k1(l1Var, n1Var, m1Var);
        aVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        String str7 = str;
        aVar.f8184a.a(new e5.w(str7, jCurrentTimeMillis, k1Var, 1));
        if (!bool.booleanValue() || str7 == null) {
            j = jCurrentTimeMillis;
        } else {
            v2 v2Var = this.f10670d;
            ?? r11 = (String) v2Var.f20203r;
            synchronized (r11) {
                try {
                    try {
                        v2Var.f20203r = str7;
                        kf.d dVar = (kf.d) ((AtomicMarkableReference) ((d8.a) v2Var.f20204x).f7149c).getReference();
                        synchronized (dVar) {
                            try {
                                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar.f14304a));
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                        j = jCurrentTimeMillis;
                        str7 = str;
                        ((jf.d) v2Var.f20202g).f13708b.a(new io.sentry.android.core.internal.util.h(v2Var, str, mapUnmodifiableMap, ((kf.n) v2Var.B).b(), 2));
                    } catch (Throwable th4) {
                        th = th4;
                        bool = r11;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            }
        }
        kf.e eVar = this.f10675i;
        ((kf.c) eVar.f14309d).b();
        eVar.f14309d = kf.e.f14307g;
        if (str7 != null) {
            eVar.f14309d = new kf.l(((of.b) eVar.f14308a).e(str7, "userlog"));
        }
        this.f10676l.a(str7);
        r2 r2Var = this.f10677m;
        r rVar = (r) r2Var.f10470a;
        Charset charset = n2.f15373a;
        lf.a0 a0Var = new lf.a0();
        a0Var.f15145a = "20.0.3";
        a8.f fVar2 = rVar.f10709c;
        String str8 = (String) fVar2.f195a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a0Var.f15146b = str8;
        x xVar2 = rVar.f10708b;
        String str9 = xVar2.c().f10640a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a0Var.f15148d = str9;
        a0Var.f15149e = xVar2.c().f10641b;
        a0Var.f15150f = xVar2.c().f10642c;
        String str10 = (String) fVar2.f200f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a0Var.f15152h = str10;
        String str11 = (String) fVar2.f201g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a0Var.f15153i = str11;
        a0Var.f15147c = 4;
        a0Var.f15155m = (byte) (a0Var.f15155m | 1);
        i0 i0Var = new i0();
        i0Var.f15276f = false;
        byte b2 = (byte) (i0Var.f15281m | 2);
        i0Var.f15274d = j;
        i0Var.f15281m = (byte) (b2 | 1);
        if (str7 == null) {
            throw new NullPointerException("Null identifier");
        }
        i0Var.f15272b = str7;
        String str12 = r.f10706g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        i0Var.f15271a = str12;
        String str13 = xVar2.f10728c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str14 = xVar2.c().f10640a;
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) fVar2.f202h;
        if (((ef.c) cVar.f12354g) == null) {
            cVar.f12354g = new ef.c(cVar);
        }
        ef.c cVar2 = (ef.c) cVar.f12354g;
        String str15 = cVar2.f8188b;
        if (cVar2 == null) {
            cVar.f12354g = new ef.c(cVar);
        }
        i0Var.f15277g = new k0(str13, str10, str11, str14, str15, ((ef.c) cVar.f12354g).f8189c);
        h1 h1Var = new h1();
        h1Var.f15257a = 3;
        h1Var.f15261e = (byte) (h1Var.f15261e | 1);
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        h1Var.f15258b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        h1Var.f15259c = str3;
        h1Var.f15260d = f.g();
        h1Var.f15261e = (byte) (h1Var.f15261e | 2);
        i0Var.f15279i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str16 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str16) && (num = (Integer) r.f10705f.get(str16.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = f.a(rVar.f10707a);
        long blockCount = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zF2 = f.f();
        int iC2 = f.c();
        m0 m0Var = new m0();
        m0Var.f15342a = iIntValue;
        byte b10 = (byte) (m0Var.j | 1);
        m0Var.j = b10;
        if (str4 == null) {
            throw new NullPointerException("Null model");
        }
        m0Var.f15343b = str4;
        m0Var.f15344c = iAvailableProcessors2;
        m0Var.f15345d = jA2;
        m0Var.f15346e = blockCount;
        m0Var.f15347f = zF2;
        m0Var.f15348g = iC2;
        m0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str5 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m0Var.f15349h = str5;
        if (str6 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m0Var.f15350i = str6;
        i0Var.j = m0Var.a();
        i0Var.f15280l = 3;
        i0Var.f15281m = (byte) (i0Var.f15281m | 4);
        a0Var.j = i0Var.a();
        b0 b0VarA = a0Var.a();
        of.b bVar = ((of.a) r2Var.f10471d).f19418b;
        m2 m2Var = b0VarA.k;
        if (m2Var == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        String str17 = ((j0) m2Var).f15298b;
        try {
            of.a.f19414g.getClass();
            of.a.f(bVar.e(str17, "report"), mf.a.f16702a.b(b0VarA));
            File fileE = bVar.e(str17, "start-time");
            long j7 = ((j0) m2Var).f15300d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(xu.l.k(new FileOutputStream(fileE), fileE), of.a.f19412e);
            try {
                outputStreamWriter.write("");
                fileE.setLastModified(j7 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException unused) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
    }

    public final boolean d(al.b bVar) throws Throwable {
        jf.d.a();
        s sVar = this.f10678n;
        if (sVar != null && sVar.f10716x.get()) {
            e0.q("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            b(true, bVar, true);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return true;
        } catch (Exception e4) {
            e0.c("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e4);
            return false;
        }
    }

    public final String e() throws Resources.NotFoundException, IOException {
        InputStream resourceAsStream;
        Context context = this.f10667a;
        int iD = f.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            return Base64.encodeToString(string.getBytes(f10666s), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            e0.q("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return null;
        }
        try {
            Log.isLoggable("FirebaseCrashlytics", 3);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = resourceAsStream.read(bArr);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void f() throws Resources.NotFoundException {
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.f10670d.i(strE);
                } catch (IllegalArgumentException e4) {
                    Context context = this.f10667a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e4;
                    }
                    e0.c("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
            }
        } catch (IOException e10) {
            e0.q("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final void g(dd.r rVar) {
        dd.r rVar2;
        dd.r rVarA;
        dd.h hVar = this.f10679o;
        of.b bVar = ((of.a) this.f10677m.f10471d).f19418b;
        if (of.b.m(((File) bVar.f19425x).listFiles()).isEmpty() && of.b.m(((File) bVar.f19426y).listFiles()).isEmpty() && of.b.m(((File) bVar.B).listFiles()).isEmpty()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            hVar.c(Boolean.FALSE);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        cj.a aVar = this.f10668b;
        if (aVar.z()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            hVar.c(Boolean.FALSE);
            rVarA = e5.u(Boolean.TRUE);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            Log.isLoggable("FirebaseCrashlytics", 2);
            hVar.c(Boolean.TRUE);
            synchronized (aVar.f3975g) {
                rVar2 = ((dd.h) aVar.f3976r).f7294a;
            }
            df.c cVar = new df.c();
            rVar2.getClass();
            dd.p pVar = dd.i.f7295a;
            dd.r rVar3 = new dd.r();
            rVar2.f7319b.o(new dd.m(pVar, cVar, rVar3));
            rVar2.q();
            Log.isLoggable("FirebaseCrashlytics", 3);
            rVarA = jf.a.a(rVar3, this.f10680p.f7294a);
        }
        rVarA.k(this.f10671e.f13707a, new io.sentry.internal.debugmeta.c(25, this, rVar, false));
    }
}
