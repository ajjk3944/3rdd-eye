package O4;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10234a;

    /* renamed from: b, reason: collision with root package name */
    public final J f10235b;

    /* renamed from: c, reason: collision with root package name */
    public final C1471q f10236c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10237d;

    /* renamed from: e, reason: collision with root package name */
    public E7.b f10238e;

    /* renamed from: f, reason: collision with root package name */
    public E7.b f10239f;

    /* renamed from: g, reason: collision with root package name */
    public v f10240g;

    /* renamed from: h, reason: collision with root package name */
    public final P f10241h;
    public final T4.e i;

    /* renamed from: j, reason: collision with root package name */
    public final D7.c f10242j;

    /* renamed from: k, reason: collision with root package name */
    public final B.f f10243k;

    /* renamed from: l, reason: collision with root package name */
    public final ExecutorService f10244l;

    /* renamed from: m, reason: collision with root package name */
    public final E3.m f10245m;

    /* renamed from: n, reason: collision with root package name */
    public final C1465k f10246n;

    /* renamed from: o, reason: collision with root package name */
    public final L4.b f10247o;

    /* renamed from: p, reason: collision with root package name */
    public final L4.i f10248p;

    public F(B4.e eVar, P p10, L4.b bVar, J j4, D7.c cVar, B.f fVar, T4.e eVar2, ExecutorService executorService, C1465k c1465k, L4.i iVar) {
        this.f10235b = j4;
        eVar.a();
        this.f10234a = eVar.f487a;
        this.f10241h = p10;
        this.f10247o = bVar;
        this.f10242j = cVar;
        this.f10243k = fVar;
        this.f10244l = executorService;
        this.i = eVar2;
        this.f10245m = new E3.m(executorService);
        this.f10246n = c1465k;
        this.f10248p = iVar;
        this.f10237d = System.currentTimeMillis();
        this.f10236c = new C1471q();
    }

    public static Task a(final F f10, V4.h hVar) {
        Task<Void> taskH;
        D d10;
        E3.m mVar = f10.f10245m;
        E3.m mVar2 = f10.f10245m;
        if (!Boolean.TRUE.equals(((ThreadLocal) mVar.f1419e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        f10.f10238e.i();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                f10.f10242j.e(new N4.a() { // from class: O4.A
                    @Override // N4.a
                    public final void a(String str) {
                        F f11 = this.f10226a;
                        f11.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - f11.f10237d;
                        v vVar = f11.f10240g;
                        vVar.getClass();
                        vVar.f10338e.a(new w(vVar, jCurrentTimeMillis, str));
                    }
                });
                f10.f10240g.g();
                V4.e eVar = (V4.e) hVar;
                if (eVar.b().f12922b.f12927a) {
                    if (!f10.f10240g.d(eVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    taskH = f10.f10240g.h(eVar.i.get().getTask());
                    d10 = new D(f10);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    taskH = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    d10 = new D(f10);
                }
                mVar2.a(d10);
                return taskH;
            } catch (Exception e4) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e4);
                Task taskForException = Tasks.forException(e4);
                mVar2.a(new D(f10));
                return taskForException;
            }
        } catch (Throwable th) {
            mVar2.a(new D(f10));
            throw th;
        }
    }

    public final void b(V4.e eVar) {
        Future<?> futureSubmit = this.f10244l.submit(new C(0, this, eVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e4);
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }
}
