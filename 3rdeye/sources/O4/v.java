package O4;

import L4.d;
import O4.C1461g;
import Q4.A;
import Q4.G;
import Q4.J;
import Q4.Z;
import Q4.b0;
import Q4.c0;
import Q4.d0;
import Q4.e0;
import Q4.f0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: r, reason: collision with root package name */
    public static final C1469o f10333r = new C1469o(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f10334a;

    /* renamed from: b, reason: collision with root package name */
    public final J f10335b;

    /* renamed from: c, reason: collision with root package name */
    public final E7.b f10336c;

    /* renamed from: d, reason: collision with root package name */
    public final P4.o f10337d;

    /* renamed from: e, reason: collision with root package name */
    public final E3.m f10338e;

    /* renamed from: f, reason: collision with root package name */
    public final P f10339f;

    /* renamed from: g, reason: collision with root package name */
    public final T4.e f10340g;

    /* renamed from: h, reason: collision with root package name */
    public final C1455a f10341h;
    public final P4.e i;

    /* renamed from: j, reason: collision with root package name */
    public final L4.b f10342j;

    /* renamed from: k, reason: collision with root package name */
    public final B.f f10343k;

    /* renamed from: l, reason: collision with root package name */
    public final C1465k f10344l;

    /* renamed from: m, reason: collision with root package name */
    public final T f10345m;

    /* renamed from: n, reason: collision with root package name */
    public I f10346n;

    /* renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f10347o = new TaskCompletionSource<>();

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f10348p = new TaskCompletionSource<>();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource<Void> f10349q = new TaskCompletionSource<>();

    /* compiled from: CrashlyticsController.java */
    public class a implements SuccessContinuation<Boolean, Void> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Task f10350b;

        public a(Task task) {
            this.f10350b = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Void> then(Boolean bool) throws Exception {
            return v.this.f10338e.b(new CallableC1474u(this, bool));
        }
    }

    public v(Context context, E3.m mVar, P p10, J j4, T4.e eVar, E7.b bVar, C1455a c1455a, P4.o oVar, P4.e eVar2, T t10, L4.b bVar2, B.f fVar, C1465k c1465k) {
        new AtomicBoolean(false);
        this.f10334a = context;
        this.f10338e = mVar;
        this.f10339f = p10;
        this.f10335b = j4;
        this.f10340g = eVar;
        this.f10336c = bVar;
        this.f10341h = c1455a;
        this.f10337d = oVar;
        this.i = eVar2;
        this.f10342j = bVar2;
        this.f10343k = fVar;
        this.f10344l = c1465k;
        this.f10345m = t10;
    }

    public static void a(v vVar, String str, Boolean bool) throws IOException {
        Integer num;
        vVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strD = androidx.work.s.d("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strD, null);
        }
        Locale locale = Locale.US;
        P p10 = vVar.f10339f;
        C1455a c1455a = vVar.f10341h;
        c0 c0Var = new c0(p10.f10278c, c1455a.f10295f, c1455a.f10296g, ((C1457c) p10.c()).f10301a, K.determineFrom(c1455a.f10293d).getId(), c1455a.f10297h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e0 e0Var = new e0(C1461g.g());
        Context context = vVar.f10334a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iOrdinal = C1461g.a.getValue().ordinal();
        String str4 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = C1461g.a(context);
        boolean zF = C1461g.f();
        int iC = C1461g.c();
        String str5 = Build.MANUFACTURER;
        String str6 = Build.PRODUCT;
        vVar.f10342j.d(str, jCurrentTimeMillis, new b0(c0Var, e0Var, new d0(iOrdinal, iAvailableProcessors, jA, statFs.getBlockCount() * statFs.getBlockSize(), zF, iC)));
        if (bool.booleanValue() && str != null) {
            P4.o oVar = vVar.f10337d;
            synchronized (oVar.f10645c) {
                try {
                    oVar.f10645c = str;
                    Map<String, String> mapA = oVar.f10646d.f10650a.getReference().a();
                    List<P4.k> listA = oVar.f10648f.a();
                    if (oVar.f10649g.getReference() != null) {
                        oVar.f10643a.i(str, oVar.f10649g.getReference());
                    }
                    if (!mapA.isEmpty()) {
                        oVar.f10643a.g(str, mapA, false);
                    }
                    if (!listA.isEmpty()) {
                        oVar.f10643a.h(str, listA);
                    }
                } finally {
                }
            }
        }
        P4.e eVar = vVar.i;
        eVar.f10611b.a();
        eVar.f10611b = P4.e.f10609c;
        if (str != null) {
            eVar.f10611b = new P4.j(eVar.f10610a.b(str, "userlog"));
        }
        vVar.f10344l.d(str);
        T t10 = vVar.f10345m;
        G g10 = t10.f10283a;
        Charset charset = f0.f11202a;
        A.a aVar = new A.a();
        aVar.f10960a = "19.0.3";
        C1455a c1455a2 = g10.f10253c;
        String str7 = c1455a2.f10290a;
        if (str7 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        aVar.f10961b = str7;
        P p11 = g10.f10252b;
        String str8 = ((C1457c) p11.c()).f10301a;
        if (str8 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        aVar.f10963d = str8;
        aVar.f10964e = ((C1457c) p11.c()).f10302b;
        aVar.f10965f = ((C1457c) p11.c()).f10303c;
        String str9 = c1455a2.f10295f;
        if (str9 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar.f10967h = str9;
        String str10 = c1455a2.f10296g;
        if (str10 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        aVar.i = str10;
        aVar.f10962c = 4;
        aVar.f10971m = (byte) (aVar.f10971m | 1);
        G.a aVar2 = new G.a();
        aVar2.f11014f = false;
        byte b10 = (byte) (aVar2.f11020m | 2);
        aVar2.f11012d = jCurrentTimeMillis;
        aVar2.f11020m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        aVar2.f11010b = str;
        String str11 = G.f10250g;
        if (str11 == null) {
            throw new NullPointerException("Null generator");
        }
        aVar2.f11009a = str11;
        String str12 = p11.f10278c;
        if (str12 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str13 = ((C1457c) p11.c()).f10301a;
        L4.d dVar = c1455a2.f10297h;
        if (dVar.f4058b == null) {
            dVar.f4058b = new d.a(dVar);
        }
        d.a aVar3 = dVar.f4058b;
        String str14 = aVar3.f4059a;
        if (aVar3 == null) {
            dVar.f4058b = new d.a(dVar);
        }
        aVar2.f11015g = new Q4.H(str12, str9, str10, str13, str14, dVar.f4058b.f4060b);
        Z.a aVar4 = new Z.a();
        aVar4.f11142a = 3;
        aVar4.f11146e = (byte) (aVar4.f11146e | 1);
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        aVar4.f11143b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar4.f11144c = str3;
        aVar4.f11145d = C1461g.g();
        aVar4.f11146e = (byte) (aVar4.f11146e | 2);
        aVar2.i = aVar4.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str15 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str15) && (num = (Integer) G.f10249f.get(str15.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = C1461g.a(g10.f10251a);
        long blockSize = statFs2.getBlockSize() * statFs2.getBlockCount();
        boolean zF2 = C1461g.f();
        int iC2 = C1461g.c();
        J.a aVar5 = new J.a();
        aVar5.f11035a = iIntValue;
        byte b11 = (byte) (aVar5.f11043j | 1);
        aVar5.f11043j = b11;
        if (str4 == null) {
            throw new NullPointerException("Null model");
        }
        aVar5.f11036b = str4;
        aVar5.f11037c = iAvailableProcessors2;
        aVar5.f11038d = jA2;
        aVar5.f11039e = blockSize;
        aVar5.f11040f = zF2;
        aVar5.f11041g = iC2;
        aVar5.f11043j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str5 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        aVar5.f11042h = str5;
        if (str6 == null) {
            throw new NullPointerException("Null modelClass");
        }
        aVar5.i = str6;
        aVar2.f11017j = aVar5.a();
        aVar2.f11019l = 3;
        aVar2.f11020m = (byte) (aVar2.f11020m | 4);
        aVar.f10968j = aVar2.a();
        Q4.A a10 = aVar.a();
        T4.e eVar2 = t10.f10284b.f12279b;
        f0.e eVar3 = a10.f10957k;
        if (eVar3 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strH = eVar3.h();
        try {
            T4.c.f12276g.getClass();
            T4.c.f(eVar2.b(strH, "report"), R4.a.f11730a.a(a10));
            File fileB = eVar2.b(strH, "start-time");
            long j4 = eVar3.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), T4.c.f12274e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j4 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e4) {
            String strD2 = androidx.work.s.d("Could not persist report for session ", strH);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strD2, e4);
            }
        }
    }

    public static Task b(v vVar) throws NumberFormatException, ClassNotFoundException {
        Task taskCall;
        vVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : T4.e.e(vVar.f10340g.f12285c.listFiles(f10333r))) {
            try {
                long j4 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new z(vVar, j4));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f() throws java.io.IOException {
        /*
            java.lang.Class<O4.v> r0 = O4.v.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L12
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r2, r0, r1)
        L10:
            r0 = r1
            goto L20
        L12:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r2, r0, r1)
            goto L10
        L20:
            if (r0 != 0) goto L23
            return r1
        L23:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r2, r3, r1)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L44
            r1.write(r2, r5, r3)
            goto L38
        L44:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.v.f():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0497 A[LOOP:2: B:152:0x0497->B:157:0x04b4, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a2  */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41, types: [int] */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r30, V4.e r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.v.c(boolean, V4.e):void");
    }

    public final boolean d(V4.e eVar) throws Throwable {
        if (!Boolean.TRUE.equals(((ThreadLocal) this.f10338e.f1419e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        I i = this.f10346n;
        if (i != null && i.f10260e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, eVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e4) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e4);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = this.f10345m.f10284b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.f10337d.a(strF);
                } catch (IllegalArgumentException e4) {
                    Context context = this.f10334a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e4;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> h(Task<V4.b> task) {
        Task<Void> task2;
        Task task3;
        T4.e eVar = this.f10345m.f10284b.f12279b;
        boolean zIsEmpty = T4.e.e(eVar.f12287e.listFiles()).isEmpty();
        TaskCompletionSource<Boolean> taskCompletionSource = this.f10347o;
        if (zIsEmpty && T4.e.e(eVar.f12288f.listFiles()).isEmpty() && T4.e.e(eVar.f12289g.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        L4.e eVar2 = L4.e.f4061a;
        eVar2.c("Crash reports are available to be sent.");
        J j4 = this.f10335b;
        if (j4.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            eVar2.b("Automatic data collection is disabled.");
            eVar2.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (j4.f10262b) {
                task2 = j4.f10263c.getTask();
            }
            Task<TContinuationResult> taskOnSuccessTask = task2.onSuccessTask(new C1472s());
            eVar2.b("Waiting for send/deleteUnsentReports to be called.");
            Task<Boolean> task4 = this.f10348p.getTask();
            ExecutorService executorService = U.f10289a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            B.d dVar = new B.d(taskCompletionSource2, 11);
            taskOnSuccessTask.continueWith(dVar);
            task4.continueWith(dVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new a(task));
    }
}
