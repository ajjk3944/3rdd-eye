package com.google.firebase.crashlytics.internal.common;

import N4.F;
import N4.G;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.E;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.internal.common.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5115q {

    /* renamed from: t, reason: collision with root package name */
    static final FilenameFilter f38801t = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.p
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C5115q.K(file, str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f38802a;

    /* renamed from: b, reason: collision with root package name */
    private final G f38803b;

    /* renamed from: c, reason: collision with root package name */
    private final B f38804c;

    /* renamed from: d, reason: collision with root package name */
    private final M4.o f38805d;

    /* renamed from: e, reason: collision with root package name */
    private final L4.f f38806e;

    /* renamed from: f, reason: collision with root package name */
    private final L f38807f;

    /* renamed from: g, reason: collision with root package name */
    private final Q4.g f38808g;

    /* renamed from: h, reason: collision with root package name */
    private final C5099a f38809h;

    /* renamed from: i, reason: collision with root package name */
    private final M4.f f38810i;

    /* renamed from: j, reason: collision with root package name */
    private final I4.a f38811j;

    /* renamed from: k, reason: collision with root package name */
    private final J4.a f38812k;

    /* renamed from: l, reason: collision with root package name */
    private final C5111m f38813l;

    /* renamed from: m, reason: collision with root package name */
    private final f0 f38814m;

    /* renamed from: n, reason: collision with root package name */
    private E f38815n;

    /* renamed from: o, reason: collision with root package name */
    private S4.j f38816o = null;

    /* renamed from: p, reason: collision with root package name */
    final TaskCompletionSource f38817p = new TaskCompletionSource();

    /* renamed from: q, reason: collision with root package name */
    final TaskCompletionSource f38818q = new TaskCompletionSource();

    /* renamed from: r, reason: collision with root package name */
    final TaskCompletionSource f38819r = new TaskCompletionSource();

    /* renamed from: s, reason: collision with root package name */
    final AtomicBoolean f38820s = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.q$a */
    class a implements E.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.E.a
        public void a(S4.j jVar, Thread thread, Throwable th2) {
            C5115q.this.G(jVar, thread, th2);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.q$b */
    class b implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f38822a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f38823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Thread f38824c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ S4.j f38825d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f38826e;

        /* renamed from: com.google.firebase.crashlytics.internal.common.q$b$a */
        class a implements SuccessContinuation {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f38828a;

            a(String str) {
                this.f38828a = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task then(S4.d dVar) {
                if (dVar != null) {
                    return Tasks.whenAll((Task<?>[]) new Task[]{C5115q.this.N(), C5115q.this.f38814m.B(C5115q.this.f38806e.f11229a, b.this.f38826e ? this.f38828a : null)});
                }
                I4.g.f().k("Received null app settings, cannot send reports at crash time.");
                return Tasks.forResult(null);
            }
        }

        b(long j10, Throwable th2, Thread thread, S4.j jVar, boolean z10) {
            this.f38822a = j10;
            this.f38823b = th2;
            this.f38824c = thread;
            this.f38825d = jVar;
            this.f38826e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() throws IOException {
            long jE = C5115q.E(this.f38822a);
            String strA = C5115q.this.A();
            if (strA == null) {
                I4.g.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            C5115q.this.f38804c.a();
            C5115q.this.f38814m.w(this.f38823b, this.f38824c, strA, jE);
            C5115q.this.v(this.f38822a);
            C5115q.this.s(this.f38825d);
            C5115q.this.u(new C5106h().c(), Boolean.valueOf(this.f38826e));
            return !C5115q.this.f38803b.d() ? Tasks.forResult(null) : this.f38825d.a().onSuccessTask(C5115q.this.f38806e.f11229a, new a(strA));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.q$c */
    class c implements SuccessContinuation {
        c() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Void r12) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.q$d */
    class d implements SuccessContinuation {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Task f38831a;

        /* renamed from: com.google.firebase.crashlytics.internal.common.q$d$a */
        class a implements SuccessContinuation {
            a() {
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Task then(S4.d dVar) {
                if (dVar == null) {
                    I4.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.forResult(null);
                }
                C5115q.this.N();
                C5115q.this.f38814m.A(C5115q.this.f38806e.f11229a);
                C5115q.this.f38819r.trySetResult(null);
                return Tasks.forResult(null);
            }
        }

        d(Task task) {
            this.f38831a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Boolean bool) {
            if (bool.booleanValue()) {
                I4.g.f().b("Sending cached crash reports...");
                C5115q.this.f38803b.c(bool.booleanValue());
                return this.f38831a.onSuccessTask(C5115q.this.f38806e.f11229a, new a());
            }
            I4.g.f().i("Deleting cached crash reports...");
            C5115q.q(C5115q.this.L());
            C5115q.this.f38814m.z();
            C5115q.this.f38819r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.common.q$e */
    class e implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f38834a;

        e(long j10) {
            this.f38834a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f38834a);
            C5115q.this.f38812k.a("_ae", bundle);
            return null;
        }
    }

    C5115q(Context context, L l10, G g10, Q4.g gVar, B b10, C5099a c5099a, M4.o oVar, M4.f fVar, f0 f0Var, I4.a aVar, J4.a aVar2, C5111m c5111m, L4.f fVar2) {
        this.f38802a = context;
        this.f38807f = l10;
        this.f38803b = g10;
        this.f38808g = gVar;
        this.f38804c = b10;
        this.f38809h = c5099a;
        this.f38805d = oVar;
        this.f38810i = fVar;
        this.f38811j = aVar;
        this.f38812k = aVar2;
        this.f38813l = c5111m;
        this.f38814m = f0Var;
        this.f38806e = fVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A() {
        SortedSet sortedSetS = this.f38814m.s();
        if (sortedSetS.isEmpty()) {
            return null;
        }
        return (String) sortedSetS.first();
    }

    private static long B() {
        return E(System.currentTimeMillis());
    }

    static List C(I4.h hVar, String str, Q4.g gVar, byte[] bArr) {
        File fileQ = gVar.q(str, "user-data");
        File fileQ2 = gVar.q(str, "keys");
        File fileQ3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5105g("logs_file", "logs", bArr));
        arrayList.add(new J("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new J("session_meta_file", "session", hVar.f()));
        arrayList.add(new J("app_meta_file", "app", hVar.a()));
        arrayList.add(new J("device_meta_file", "device", hVar.c()));
        arrayList.add(new J("os_meta_file", "os", hVar.b()));
        arrayList.add(P(hVar));
        arrayList.add(new J("user_meta_file", "user", fileQ));
        arrayList.add(new J("keys_file", "keys", fileQ2));
        arrayList.add(new J("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    private InputStream D(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            I4.g.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        I4.g.f().g("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long E(long j10) {
        return j10 / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) {
        u(str, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean K(File file, String str) {
        return str.startsWith(".ae");
    }

    private Task M(long j10) {
        if (z()) {
            I4.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        I4.g.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                I4.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private static boolean O(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            I4.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            I4.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    private static O P(I4.h hVar) {
        File fileE = hVar.e();
        return (fileE == null || !fileE.exists()) ? new C5105g("minidump_file", "minidump", new byte[]{0}) : new J("minidump_file", "minidump", fileE);
    }

    private static byte[] R(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private Task X() {
        if (this.f38803b.d()) {
            I4.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f38817p.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        I4.g.f().b("Automatic data collection is disabled.");
        I4.g.f().i("Notifying that unsent reports are available.");
        this.f38817p.trySetResult(Boolean.TRUE);
        Task taskOnSuccessTask = this.f38803b.j().onSuccessTask(new c());
        I4.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return L4.b.c(taskOnSuccessTask, this.f38818q.getTask());
    }

    private void Y(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            I4.g.f().i("ANR feature enabled, but device is API " + i10);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f38802a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f38814m.y(str, historicalProcessExitReasons, new M4.f(this.f38808g, str), M4.o.k(str, this.f38808g, this.f38806e));
        } else {
            I4.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static G.a n(L l10, C5099a c5099a) {
        return G.a.b(l10.f(), c5099a.f38757f, c5099a.f38758g, l10.a().c(), H.determineFrom(c5099a.f38755d).getId(), c5099a.f38759h);
    }

    private static G.b o(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(AbstractC5107i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC5107i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC5107i.w(), AbstractC5107i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static G.c p() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC5107i.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(boolean z10, S4.j jVar, boolean z11) throws IOException {
        String str;
        L4.f.c();
        ArrayList arrayList = new ArrayList(this.f38814m.s());
        if (arrayList.size() <= z10) {
            I4.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && jVar.b().f20251b.f20259b) {
            Y(str2);
        } else {
            I4.g.f().i("ANR feature disabled.");
        }
        if (z11 && this.f38811j.c(str2)) {
            x(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f38813l.e(null);
            str = null;
        }
        this.f38814m.m(B(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(String str, Boolean bool) {
        long jB = B();
        I4.g.f().b("Opening a new session with ID " + str);
        this.f38811j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", A.n()), jB, N4.G.b(n(this.f38807f, this.f38809h), p(), o(this.f38802a)));
        if (bool.booleanValue() && str != null) {
            this.f38805d.p(str);
        }
        this.f38810i.e(str);
        this.f38813l.e(str);
        this.f38814m.t(str, jB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(long j10) throws IOException {
        try {
            if (this.f38808g.g(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            I4.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    private void x(String str) throws IOException {
        I4.g.f().i("Finalizing native report for session " + str);
        I4.h hVarA = this.f38811j.a(str);
        File fileE = hVarA.e();
        F.a aVarD = hVarA.d();
        if (O(str, fileE, aVarD)) {
            I4.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileE.lastModified();
        M4.f fVar = new M4.f(this.f38808g, str);
        File fileK = this.f38808g.k(str);
        if (!fileK.isDirectory()) {
            I4.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        v(jLastModified);
        List listC = C(hVarA, str, this.f38808g, fVar.b());
        P.b(fileK, listC);
        I4.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f38814m.l(str, listC, aVarD);
        fVar.a();
    }

    private static boolean z() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    String F() {
        InputStream inputStreamD = D("META-INF/version-control-info.textproto");
        if (inputStreamD == null) {
            return null;
        }
        I4.g.f().b("Read version control info");
        return Base64.encodeToString(R(inputStreamD), 0);
    }

    void G(S4.j jVar, Thread thread, Throwable th2) {
        H(jVar, thread, th2, false);
    }

    synchronized void H(S4.j jVar, Thread thread, Throwable th2, boolean z10) {
        I4.g.f().b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        Task taskH = this.f38806e.f11229a.h(new b(System.currentTimeMillis(), th2, thread, jVar, z10));
        if (!z10) {
            try {
                try {
                    i0.b(taskH);
                } catch (Exception e10) {
                    I4.g.f().e("Error handling uncaught exception", e10);
                }
            } catch (TimeoutException unused) {
                I4.g.f().d("Cannot send reports. Timed out while fetching settings.");
            }
        }
    }

    boolean I() {
        E e10 = this.f38815n;
        return e10 != null && e10.a();
    }

    List L() {
        return this.f38808g.h(f38801t);
    }

    void Q(final String str) {
        this.f38806e.f11229a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f38799a.J(str);
            }
        });
    }

    void S() {
        try {
            String strF = F();
            if (strF != null) {
                U("com.crashlytics.version-control-info", strF);
                I4.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            I4.g.f().l("Unable to save version control info", e10);
        }
    }

    void T(String str, String str2) {
        try {
            this.f38805d.n(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f38802a;
            if (context != null && AbstractC5107i.u(context)) {
                throw e10;
            }
            I4.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void U(String str, String str2) {
        try {
            this.f38805d.o(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f38802a;
            if (context != null && AbstractC5107i.u(context)) {
                throw e10;
            }
            I4.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void V(String str) {
        this.f38805d.q(str);
    }

    void W(Task task) {
        if (this.f38814m.p()) {
            I4.g.f().i("Crash reports are available to be sent.");
            X().onSuccessTask(this.f38806e.f11229a, new d(task));
        } else {
            I4.g.f().i("No crash reports are available to be sent.");
            this.f38817p.trySetResult(Boolean.FALSE);
        }
    }

    void Z(Thread thread, Throwable th2, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (I()) {
            return;
        }
        long jE = E(jCurrentTimeMillis);
        String strA = A();
        if (strA == null) {
            I4.g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f38814m.x(th2, thread, new M4.c(strA, jE, map));
        }
    }

    void a0(long j10, String str) {
        if (I()) {
            return;
        }
        this.f38810i.g(j10, str);
    }

    boolean r() {
        L4.f.c();
        if (!this.f38804c.c()) {
            String strA = A();
            return strA != null && this.f38811j.c(strA);
        }
        I4.g.f().i("Found previous crash marker.");
        this.f38804c.d();
        return true;
    }

    void s(S4.j jVar) throws IOException {
        t(false, jVar, false);
    }

    void w(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, S4.j jVar) {
        this.f38816o = jVar;
        Q(str);
        E e10 = new E(new a(), jVar, uncaughtExceptionHandler, this.f38811j);
        this.f38815n = e10;
        Thread.setDefaultUncaughtExceptionHandler(e10);
    }

    boolean y(S4.j jVar) {
        L4.f.c();
        if (I()) {
            I4.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        I4.g.f().i("Finalizing previously open sessions.");
        try {
            t(true, jVar, true);
            I4.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            I4.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }
}
