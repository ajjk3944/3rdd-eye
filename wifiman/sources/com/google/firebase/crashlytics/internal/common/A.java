package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38687a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f38688b;

    /* renamed from: c, reason: collision with root package name */
    private final G f38689c;

    /* renamed from: f, reason: collision with root package name */
    private B f38692f;

    /* renamed from: g, reason: collision with root package name */
    private B f38693g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38694h;

    /* renamed from: i, reason: collision with root package name */
    private C5115q f38695i;

    /* renamed from: j, reason: collision with root package name */
    private final L f38696j;

    /* renamed from: k, reason: collision with root package name */
    private final Q4.g f38697k;

    /* renamed from: l, reason: collision with root package name */
    public final K4.b f38698l;

    /* renamed from: m, reason: collision with root package name */
    private final J4.a f38699m;

    /* renamed from: n, reason: collision with root package name */
    private final C5111m f38700n;

    /* renamed from: o, reason: collision with root package name */
    private final I4.a f38701o;

    /* renamed from: p, reason: collision with root package name */
    private final I4.l f38702p;

    /* renamed from: q, reason: collision with root package name */
    private final L4.f f38703q;

    /* renamed from: e, reason: collision with root package name */
    private final long f38691e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final Q f38690d = new Q();

    public A(com.google.firebase.f fVar, L l10, I4.a aVar, G g10, K4.b bVar, J4.a aVar2, Q4.g gVar, C5111m c5111m, I4.l lVar, L4.f fVar2) {
        this.f38688b = fVar;
        this.f38689c = g10;
        this.f38687a = fVar.k();
        this.f38696j = l10;
        this.f38701o = aVar;
        this.f38698l = bVar;
        this.f38699m = aVar2;
        this.f38697k = gVar;
        this.f38700n = c5111m;
        this.f38702p = lVar;
        this.f38703q = fVar2;
    }

    private void i() {
        try {
            this.f38694h = Boolean.TRUE.equals((Boolean) this.f38703q.f11229a.c().submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f38838a.p();
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f38694h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void r(S4.j jVar) {
        L4.f.c();
        A();
        try {
            try {
                this.f38698l.a(new K4.a() { // from class: com.google.firebase.crashlytics.internal.common.u
                    @Override // K4.a
                    public final void a(String str) {
                        this.f38841a.x(str);
                    }
                });
                this.f38695i.S();
            } catch (Exception e10) {
                I4.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            }
            if (!jVar.b().f20251b.f20258a) {
                I4.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f38695i.y(jVar)) {
                I4.g.f().k("Previous sessions could not be finalized.");
            }
            this.f38695i.W(jVar.a());
            z();
        } catch (Throwable th2) {
            z();
            throw th2;
        }
    }

    private void m(final S4.j jVar) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f38703q.f11229a.c().submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f38839a.r(jVar);
            }
        });
        I4.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            I4.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            I4.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            I4.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String n() {
        return "19.4.1";
    }

    static boolean o(String str, boolean z10) {
        if (!z10) {
            I4.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean p() {
        return Boolean.valueOf(this.f38695i.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(long j10, String str) {
        this.f38695i.a0(j10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final long j10, final String str) {
        this.f38703q.f11230b.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f38850a.s(j10, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Throwable th2, Map map) {
        this.f38695i.Z(Thread.currentThread(), th2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str, String str2) {
        this.f38695i.T(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(String str) {
        this.f38695i.V(str);
    }

    void A() {
        L4.f.c();
        this.f38692f.a();
        I4.g.f().i("Initialization marker file was created.");
    }

    public boolean B(C5099a c5099a, S4.j jVar) {
        if (!o(c5099a.f38753b, AbstractC5107i.i(this.f38687a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C5106h().c();
        try {
            this.f38693g = new B("crash_marker", this.f38697k);
            this.f38692f = new B("initialization_marker", this.f38697k);
            M4.o oVar = new M4.o(strC, this.f38697k, this.f38703q);
            M4.f fVar = new M4.f(this.f38697k);
            T4.a aVar = new T4.a(1024, new T4.c(10));
            this.f38702p.c(oVar);
            this.f38695i = new C5115q(this.f38687a, this.f38696j, this.f38689c, this.f38697k, this.f38693g, c5099a, oVar, fVar, f0.j(this.f38687a, this.f38696j, this.f38697k, c5099a, fVar, oVar, aVar, jVar, this.f38690d, this.f38700n, this.f38703q), this.f38701o, this.f38699m, this.f38700n, this.f38703q);
            boolean zJ = j();
            i();
            this.f38695i.w(strC, Thread.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zJ || !AbstractC5107i.d(this.f38687a)) {
                I4.g.f().b("Successfully configured exception handler.");
                return true;
            }
            I4.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m(jVar);
            return false;
        } catch (Exception e10) {
            I4.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f38695i = null;
            return false;
        }
    }

    public void C(Boolean bool) {
        this.f38689c.h(bool);
    }

    public void D(final String str, final String str2) {
        this.f38703q.f11229a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f38847a.v(str, str2);
            }
        });
    }

    public void E(final String str) {
        this.f38703q.f11229a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f38845a.w(str);
            }
        });
    }

    boolean j() {
        return this.f38692f.c();
    }

    public Task l(final S4.j jVar) {
        return this.f38703q.f11229a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f38836a.q(jVar);
            }
        });
    }

    public void x(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f38691e;
        this.f38703q.f11229a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f38842a.t(jCurrentTimeMillis, str);
            }
        });
    }

    public void y(final Throwable th2, final Map map) {
        this.f38703q.f11229a.f(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f38853a.u(th2, map);
            }
        });
    }

    void z() {
        L4.f.c();
        try {
            if (this.f38692f.d()) {
                return;
            }
            I4.g.f().k("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            I4.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
