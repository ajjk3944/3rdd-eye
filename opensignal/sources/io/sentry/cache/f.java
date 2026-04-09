package io.sentry.cache;

import androidx.lifecycle.f0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.k6;
import io.sentry.p3;
import io.sentry.protocol.t;
import io.sentry.s3;
import io.sentry.x5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class f extends s3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f12132c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12133a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.e f12134b = new io.sentry.util.e(new io.sentry.android.replay.capture.e(3, this));

    public f(SentryAndroidOptions sentryAndroidOptions) {
        this.f12133a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.f12133a, ".scope-cache", str);
    }

    public final Object c(x5 x5Var, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return a.c(x5Var, ".scope-cache", str, cls);
        }
        try {
            io.sentry.cache.tape.f fVar = (io.sentry.cache.tape.f) this.f12134b.a();
            int iMin = Math.min(fVar.size(), fVar.size());
            ArrayList arrayList = new ArrayList(iMin);
            Iterator it = fVar.iterator();
            for (int i10 = 0; i10 < iMin; i10++) {
                arrayList.add(it.next());
            }
            return cls.cast(Collections.unmodifiableList(arrayList));
        } catch (IOException unused) {
            x5Var.getLogger().m(b5.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public final void d(Runnable runnable) {
        x5 x5Var = this.f12133a;
        if (x5Var.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    x5Var.getLogger().g(b5.ERROR, "Serialization task failed", th2);
                    return;
                }
            }
            try {
                x5Var.getExecutorService().submit(new e(this, 5, runnable));
            } catch (Throwable th3) {
                x5Var.getLogger().g(b5.ERROR, "Serialization task could not be scheduled", th3);
            }
        }
    }

    public final void e(Object obj, String str) {
        a.d(this.f12133a, obj, ".scope-cache", str);
    }

    @Override // io.sentry.s3, io.sentry.a1
    public final void j(t tVar) {
        d(new e(this, 3, tVar));
    }

    @Override // io.sentry.a1
    public final void m(io.sentry.e eVar) {
        d(new e(this, 1, eVar));
    }

    @Override // io.sentry.s3, io.sentry.a1
    public final void n(Collection collection) {
        if (collection.isEmpty()) {
            d(new f0(27, this));
        }
    }

    @Override // io.sentry.s3, io.sentry.a1
    public final void o(ConcurrentHashMap concurrentHashMap) {
        d(new e(this, 0, concurrentHashMap));
    }

    @Override // io.sentry.a1
    public final void p(k6 k6Var, p3 p3Var) {
        d(new ch.a(this, k6Var, p3Var, 9));
    }

    @Override // io.sentry.s3, io.sentry.a1
    public final void q(io.sentry.protocol.c cVar) {
        d(new e(this, 2, cVar));
    }

    @Override // io.sentry.s3, io.sentry.a1
    public final void r(String str) {
        d(new e(this, 4, str));
    }
}
