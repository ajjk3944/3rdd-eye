package hf;

import android.content.Context;
import android.util.Log;
import io.sentry.android.core.e0;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10692a;

    /* renamed from: b, reason: collision with root package name */
    public final cj.a f10693b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f10694c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10695d;

    /* renamed from: e, reason: collision with root package name */
    public bm.e f10696e;

    /* renamed from: f, reason: collision with root package name */
    public bm.e f10697f;

    /* renamed from: g, reason: collision with root package name */
    public l f10698g;

    /* renamed from: h, reason: collision with root package name */
    public final x f10699h;

    /* renamed from: i, reason: collision with root package name */
    public final of.b f10700i;
    public final df.a j;
    public final df.a k;

    /* renamed from: l, reason: collision with root package name */
    public final i f10701l;

    /* renamed from: m, reason: collision with root package name */
    public final ef.a f10702m;

    /* renamed from: n, reason: collision with root package name */
    public final a2.g f10703n;

    /* renamed from: o, reason: collision with root package name */
    public final jf.d f10704o;

    public q(se.f fVar, x xVar, ef.a aVar, cj.a aVar2, df.a aVar3, df.a aVar4, of.b bVar, i iVar, a2.g gVar, jf.d dVar) {
        this.f10693b = aVar2;
        fVar.a();
        this.f10692a = fVar.f22007a;
        this.f10699h = xVar;
        this.f10702m = aVar;
        this.j = aVar3;
        this.k = aVar4;
        this.f10700i = bVar;
        this.f10701l = iVar;
        this.f10703n = gVar;
        this.f10704o = dVar;
        this.f10695d = System.currentTimeMillis();
        this.f10694c = new io.sentry.internal.debugmeta.c(26);
    }

    public final void a(al.b bVar) throws IOException {
        jf.d.a();
        jf.d.a();
        this.f10696e.u();
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            try {
                this.j.c(new o(this));
                this.f10698g.f();
                if (!bVar.h().f20888b.f20884a) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f10698g.d(bVar)) {
                    e0.q("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f10698g.g(((dd.h) ((AtomicReference) bVar.f817i).get()).f7294a);
                c();
            } catch (Exception e4) {
                e0.c("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e4);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(al.b bVar) {
        Future<?> futureSubmit = this.f10704o.f13707a.f13703a.submit(new m(this, bVar, 1));
        Log.isLoggable("FirebaseCrashlytics", 3);
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            e0.c("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e4);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            e0.c("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            e0.c("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        jf.d.a();
        try {
            bm.e eVar = this.f10696e;
            of.b bVar = (of.b) eVar.f2831g;
            String str = (String) eVar.f2830d;
            bVar.getClass();
            if (new File((File) bVar.f19423g, str).delete()) {
                return;
            }
            e0.q("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e4) {
            e0.c("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e4);
        }
    }
}
