package je;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27591a;

    /* renamed from: b, reason: collision with root package name */
    public final t f27592b;

    /* renamed from: c, reason: collision with root package name */
    public final y4.a f27593c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27594d;

    /* renamed from: e, reason: collision with root package name */
    public yb.i f27595e;

    /* renamed from: f, reason: collision with root package name */
    public yb.i f27596f;
    public m g;

    /* renamed from: h, reason: collision with root package name */
    public final x f27597h;

    /* renamed from: i, reason: collision with root package name */
    public final pe.c f27598i;
    public final fe.a j;

    /* renamed from: k, reason: collision with root package name */
    public final fe.a f27599k;

    /* renamed from: l, reason: collision with root package name */
    public final j f27600l;

    /* renamed from: m, reason: collision with root package name */
    public final ge.b f27601m;

    /* renamed from: n, reason: collision with root package name */
    public final o7.c f27602n;

    /* renamed from: o, reason: collision with root package name */
    public final ke.c f27603o;

    public q(wd.f fVar, x xVar, ge.b bVar, t tVar, fe.a aVar, fe.a aVar2, pe.c cVar, j jVar, o7.c cVar2, ke.c cVar3) {
        this.f27592b = tVar;
        fVar.a();
        this.f27591a = fVar.f36614a;
        this.f27597h = xVar;
        this.f27601m = bVar;
        this.j = aVar;
        this.f27599k = aVar2;
        this.f27598i = cVar;
        this.f27600l = jVar;
        this.f27602n = cVar2;
        this.f27603o = cVar3;
        this.f27594d = System.currentTimeMillis();
        this.f27593c = new y4.a(28);
    }

    public final void a(com.google.android.gms.internal.consent_sdk.d dVar) {
        ke.c.a();
        ke.c.a();
        this.f27595e.m();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.b(new o(this));
                this.g.g();
                if (!dVar.b().f32925b.f12633a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(dVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(((TaskCompletionSource) ((AtomicReference) dVar.f19302i).get()).getTask());
                c();
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e2);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(com.google.android.gms.internal.consent_sdk.d dVar) {
        Future<?> futureSubmit = this.f27603o.f28258a.f28255a.submit(new n(this, dVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        ke.c.a();
        try {
            yb.i iVar = this.f27595e;
            pe.c cVar = (pe.c) iVar.f37517c;
            String str = (String) iVar.f37516b;
            cVar.getClass();
            if (new File((File) cVar.f31752d, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e2) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e2);
        }
    }
}
