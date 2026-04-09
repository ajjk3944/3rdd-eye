package je;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b5.i0;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.dc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import me.a0;
import me.b0;
import me.h1;
import me.j0;
import me.k0;
import me.k1;
import me.l1;
import me.m0;
import me.m1;
import me.m2;
import me.n1;
import me.n2;
import p.r3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: r, reason: collision with root package name */
    public static final h f27566r = new h(1);

    /* renamed from: s, reason: collision with root package name */
    public static final Charset f27567s = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f27568a;

    /* renamed from: b, reason: collision with root package name */
    public final t f27569b;

    /* renamed from: c, reason: collision with root package name */
    public final yb.i f27570c;

    /* renamed from: d, reason: collision with root package name */
    public final r3 f27571d;

    /* renamed from: e, reason: collision with root package name */
    public final ke.c f27572e;

    /* renamed from: f, reason: collision with root package name */
    public final x f27573f;
    public final pe.c g;

    /* renamed from: h, reason: collision with root package name */
    public final a f27574h;

    /* renamed from: i, reason: collision with root package name */
    public final le.f f27575i;
    public final ge.b j;

    /* renamed from: k, reason: collision with root package name */
    public final he.a f27576k;

    /* renamed from: l, reason: collision with root package name */
    public final j f27577l;

    /* renamed from: m, reason: collision with root package name */
    public final r3 f27578m;

    /* renamed from: n, reason: collision with root package name */
    public s f27579n;

    /* renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f27580o = new TaskCompletionSource();

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f27581p = new TaskCompletionSource();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f27582q = new TaskCompletionSource();

    public m(Context context, x xVar, t tVar, pe.c cVar, yb.i iVar, a aVar, r3 r3Var, le.f fVar, r3 r3Var2, ge.b bVar, he.a aVar2, j jVar, ke.c cVar2) {
        new AtomicBoolean(false);
        this.f27568a = context;
        this.f27573f = xVar;
        this.f27569b = tVar;
        this.g = cVar;
        this.f27570c = iVar;
        this.f27574h = aVar;
        this.f27571d = r3Var;
        this.f27575i = fVar;
        this.j = bVar;
        this.f27576k = aVar2;
        this.f27577l = jVar;
        this.f27578m = r3Var2;
        this.f27572e = cVar2;
    }

    public static Task a(m mVar) {
        Task taskCall;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : pe.c.k(((File) mVar.g.f31752d).listFiles(f27566r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new l(mVar, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e4 A[LOOP:2: B:153:0x04e4->B:158:0x0501, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Type inference failed for: r0v6, types: [je.j] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r33, com.google.android.gms.internal.consent_sdk.d r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.m.b(boolean, com.google.android.gms.internal.consent_sdk.d, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i4;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strT = u.t("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strT, null);
        }
        Locale locale = Locale.US;
        x xVar = this.f27573f;
        a aVar = this.f27574h;
        l1 l1Var = new l1(xVar.f27629c, aVar.f27533f, aVar.g, xVar.c().f27538a, u.i(aVar.f27531d != null ? 4 : 1), aVar.f27534h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        n1 n1Var = new n1(g.g());
        Context context = this.f27568a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f27547a;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            f fVar2 = (f) f.f27548b.get(str8.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = fVar.ordinal();
        String str9 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new k1(l1Var, n1Var, new m1(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i4 = 4;
        } else {
            r3 r3Var = this.f27571d;
            synchronized (((String) r3Var.f30846c)) {
                r3Var.f30846c = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i4 = 4;
                ((ke.c) r3Var.f30845b).f28259b.a(new ci.a(20, r3Var, ((le.e) ((AtomicMarkableReference) ((i0) r3Var.f30847d).f1821b).getReference()).a(), ((dc) r3Var.f30849f).a(), str));
            }
        }
        le.f fVar3 = this.f27575i;
        ((le.d) fVar3.f28716b).a();
        fVar3.f28716b = le.f.f28714c;
        if (str != null) {
            fVar3.f28716b = new le.m(((pe.c) fVar3.f28715a).b(str, "userlog"));
        }
        this.f27577l.a(str);
        r3 r3Var2 = this.f27578m;
        r rVar = (r) r3Var2.f30844a;
        Charset charset = n2.f29256a;
        a0 a0Var = new a0();
        a0Var.f29037a = "20.0.3";
        a aVar2 = rVar.f27607c;
        String str12 = aVar2.f27528a;
        if (str12 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        a0Var.f29038b = str12;
        x xVar2 = rVar.f27606b;
        String str13 = xVar2.c().f27538a;
        if (str13 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        a0Var.f29040d = str13;
        a0Var.f29041e = xVar2.c().f27539b;
        a0Var.f29042f = xVar2.c().f27540c;
        String str14 = aVar2.f27533f;
        if (str14 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        a0Var.f29043h = str14;
        String str15 = aVar2.g;
        if (str15 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        a0Var.f29044i = str15;
        a0Var.f29039c = i4;
        a0Var.f29047m = (byte) (a0Var.f29047m | 1);
        me.i0 i0Var = new me.i0();
        i0Var.f29162f = false;
        byte b10 = (byte) (i0Var.f29167m | 2);
        i0Var.f29160d = jCurrentTimeMillis;
        i0Var.f29167m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        i0Var.f29158b = str;
        String str16 = r.g;
        if (str16 == null) {
            throw new NullPointerException("Null generator");
        }
        i0Var.f29157a = str16;
        String str17 = xVar2.f27629c;
        if (str17 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str18 = xVar2.c().f27538a;
        yb.i iVar = aVar2.f27534h;
        if (((ge.d) iVar.f37517c) == null) {
            iVar.f37517c = new ge.d(iVar);
        }
        ge.d dVar = (ge.d) iVar.f37517c;
        String str19 = dVar.f24697b;
        if (dVar == null) {
            iVar.f37517c = new ge.d(iVar);
        }
        i0Var.g = new k0(str17, str14, str15, str18, str19, ((ge.d) iVar.f37517c).f24698c);
        h1 h1Var = new h1();
        h1Var.f29144a = 3;
        h1Var.f29148e = (byte) (h1Var.f29148e | 1);
        if (str6 == null) {
            throw new NullPointerException("Null version");
        }
        h1Var.f29145b = str6;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        h1Var.f29146c = str2;
        h1Var.f29147d = g.g();
        h1Var.f29148e = (byte) (h1Var.f29148e | 2);
        i0Var.f29164i = h1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) r.f27604f.get(str8.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(rVar.f27605a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean zF2 = g.f();
        int iC2 = g.c();
        m0 m0Var = new m0();
        m0Var.f29227a = iIntValue;
        byte b11 = (byte) (m0Var.j | 1);
        m0Var.j = b11;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        m0Var.f29228b = str5;
        m0Var.f29229c = iAvailableProcessors2;
        m0Var.f29230d = jA2;
        m0Var.f29231e = blockCount2;
        m0Var.f29232f = zF2;
        m0Var.g = iC2;
        m0Var.j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        m0Var.f29233h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        m0Var.f29234i = str21;
        i0Var.j = m0Var.a();
        i0Var.f29166l = 3;
        i0Var.f29167m = (byte) (i0Var.f29167m | 4);
        a0Var.j = i0Var.a();
        b0 b0VarA = a0Var.a();
        pe.c cVar = ((pe.a) r3Var2.f30845b).f31745b;
        m2 m2Var = b0VarA.f29069k;
        if (m2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((j0) m2Var).f29184b;
        try {
            pe.a.g.getClass();
            pe.a.f(cVar.b(str22, "report"), ne.a.f29941a.n(b0VarA));
            File fileB = cVar.b(str22, "start-time");
            long j = ((j0) m2Var).f29186d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), pe.a.f31740e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e2) {
            String strT2 = u.t("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strT2, e2);
            }
        }
    }

    public final boolean d(com.google.android.gms.internal.consent_sdk.d dVar) throws Throwable {
        ke.c.a();
        s sVar = this.f27579n;
        if (sVar != null && sVar.f27614e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, dVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e2) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((pe.a) this.f27578m.f30845b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws Resources.NotFoundException, IOException {
        InputStream resourceAsStream;
        Context context = this.f27568a;
        int iD = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f27567s), 0);
        }
        ClassLoader classLoader = m.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                while (true) {
                    int i4 = resourceAsStream.read(bArr);
                    if (i4 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
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

    public final void g() throws Resources.NotFoundException {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.f27571d.i(strF);
                } catch (IllegalArgumentException e2) {
                    Context context = this.f27568a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e2;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final void h(Task task) {
        Task task2;
        Task taskA;
        TaskCompletionSource taskCompletionSource = this.f27580o;
        pe.c cVar = ((pe.a) this.f27578m.f30845b).f31745b;
        if (pe.c.k(((File) cVar.f31754f).listFiles()).isEmpty() && pe.c.k(((File) cVar.g).listFiles()).isEmpty() && pe.c.k(((File) cVar.f31755h).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        ge.e eVar = ge.e.f24699a;
        eVar.c("Crash reports are available to be sent.");
        t tVar = this.f27569b;
        if (tVar.f()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            eVar.b("Automatic data collection is disabled.");
            eVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tVar.f27619e) {
                task2 = ((TaskCompletionSource) tVar.f27620f).getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new ja.c());
            eVar.b("Waiting for send/deleteUnsentReports to be called.");
            taskA = ke.a.a(taskOnSuccessTask, this.f27581p.getTask());
        }
        taskA.onSuccessTask(this.f27572e.f28258a, new y4.a(false, this, task));
    }
}
