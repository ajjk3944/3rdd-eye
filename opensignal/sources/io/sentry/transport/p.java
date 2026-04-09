package io.sentry.transport;

import io.sentry.x5;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class p implements Closeable {
    public Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12775a;

    /* renamed from: d, reason: collision with root package name */
    public Object f12776d;

    /* renamed from: g, reason: collision with root package name */
    public Object f12777g;

    /* renamed from: r, reason: collision with root package name */
    public Object f12778r;

    /* renamed from: x, reason: collision with root package name */
    public Object f12779x;

    /* renamed from: y, reason: collision with root package name */
    public Object f12780y;

    public void b(io.sentry.m mVar, Date date) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12778r;
        Date date2 = (Date) concurrentHashMap.get(mVar);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(mVar, date);
            Iterator it = ((CopyOnWriteArrayList) this.f12779x).iterator();
            while (it.hasNext()) {
                ((o) it.next()).q(this);
            }
            io.sentry.q qVarA = ((io.sentry.util.a) this.B).a();
            try {
                if (((Timer) this.f12780y) == null) {
                    this.f12780y = new Timer(true);
                }
                ((Timer) this.f12780y).schedule(new ih.f(3, this), date);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f12775a) {
            case 0:
                io.sentry.q qVarA = ((io.sentry.util.a) this.B).a();
                try {
                    Timer timer = (Timer) this.f12780y;
                    if (timer != null) {
                        timer.cancel();
                        this.f12780y = null;
                    }
                    qVarA.close();
                    ((CopyOnWriteArrayList) this.f12779x).clear();
                    return;
                } catch (Throwable th2) {
                    try {
                        qVarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                ((t9.h) ((t9.d) ((kq.a) this.f12780y).get())).close();
                return;
        }
    }

    public boolean f(io.sentry.m mVar) {
        Date date;
        ((d) this.f12776d).getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12778r;
        Date date3 = (Date) concurrentHashMap.get(io.sentry.m.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.m.Unknown.equals(mVar) || (date = (Date) concurrentHashMap.get(mVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public p(x5 x5Var) {
        this.f12775a = 0;
        this.f12778r = new ConcurrentHashMap();
        this.f12779x = new CopyOnWriteArrayList();
        this.f12780y = null;
        this.B = new io.sentry.util.a();
        this.f12776d = d.f12759a;
        this.f12777g = x5Var;
    }
}
