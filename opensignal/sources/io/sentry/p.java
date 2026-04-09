package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class p implements l {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12485d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12486e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12487f;

    /* renamed from: g, reason: collision with root package name */
    public final x5 f12488g;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f12482a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    public volatile Timer f12483b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f12484c = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f12489h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public long f12490i = 0;

    public p(SentryAndroidOptions sentryAndroidOptions) {
        boolean z10 = false;
        ir.f0.T(sentryAndroidOptions, "The options object is required.");
        this.f12488g = sentryAndroidOptions;
        this.f12485d = new ArrayList();
        this.f12486e = new ArrayList();
        for (w0 w0Var : sentryAndroidOptions.getPerformanceCollectors()) {
            if (w0Var instanceof y0) {
                this.f12485d.add((y0) w0Var);
            }
            if (w0Var instanceof x0) {
                this.f12486e.add((x0) w0Var);
            }
        }
        if (this.f12485d.isEmpty() && this.f12486e.isEmpty()) {
            z10 = true;
        }
        this.f12487f = z10;
    }

    @Override // io.sentry.l
    public final void a(String str) {
        if (this.f12487f) {
            this.f12488g.getLogger().m(b5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f12484c.containsKey(str)) {
            this.f12484c.put(str, new o(this, null));
        }
        if (this.f12489h.getAndSet(true)) {
            return;
        }
        q qVarA = this.f12482a.a();
        try {
            if (this.f12483b == null) {
                this.f12483b = new Timer(true);
            }
            this.f12483b.schedule(new ih.f(1, this), 0L);
            this.f12483b.scheduleAtFixedRate(new fm.b(this, new ArrayList(), 2), 100L, 100L);
            qVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.l
    public final void b(j6 j6Var) throws Throwable {
        Iterator it = this.f12486e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.z0) ((x0) it.next())).e(j6Var);
        }
    }

    @Override // io.sentry.l
    public final List c(String str) {
        ConcurrentHashMap concurrentHashMap = this.f12484c;
        o oVar = (o) concurrentHashMap.remove(str);
        this.f12488g.getLogger().m(b5.DEBUG, c7.a.p("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (oVar != null) {
            return oVar.f12452a;
        }
        return null;
    }

    @Override // io.sentry.l
    public final void close() {
        this.f12488g.getLogger().m(b5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f12484c.clear();
        Iterator it = this.f12486e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.z0) ((x0) it.next())).d();
        }
        if (this.f12489h.getAndSet(false)) {
            q qVarA = this.f12482a.a();
            try {
                if (this.f12483b != null) {
                    this.f12483b.cancel();
                    this.f12483b = null;
                }
                qVarA.close();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.l
    public final void d(j6 j6Var) {
        Iterator it = this.f12486e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.z0) ((x0) it.next())).f(j6Var);
        }
    }

    @Override // io.sentry.l
    public final void e(g6 g6Var) {
        if (this.f12487f) {
            this.f12488g.getLogger().m(b5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f12486e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.z0) ((x0) it.next())).f(g6Var);
        }
        String string = g6Var.f12275a.toString();
        ConcurrentHashMap concurrentHashMap = this.f12484c;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(string, new o(this, g6Var));
        }
        a(string);
    }

    @Override // io.sentry.l
    public final List f(k1 k1Var) {
        this.f12488g.getLogger().m(b5.DEBUG, "stop collecting performance info for transactions %s (%s)", k1Var.getName(), k1Var.t().f12412a.toString());
        Iterator it = this.f12486e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.z0) ((x0) it.next())).e(k1Var);
        }
        return c(k1Var.p().toString());
    }
}
