package cd;

import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import b4.e;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f3683n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f3684o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f3685p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3686a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f3687b;

    /* renamed from: c, reason: collision with root package name */
    public int f3688c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f3689d;

    /* renamed from: e, reason: collision with root package name */
    public long f3690e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f3691f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3692g;

    /* renamed from: h, reason: collision with root package name */
    public rc.a f3693h;

    /* renamed from: i, reason: collision with root package name */
    public final gc.a f3694i;
    public final String j;
    public final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f3695l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f3696m;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r8) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.a.<init>(android.content.Context):void");
    }

    public final void a(long j) {
        this.f3695l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f3683n), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f3686a) {
            try {
                if (!b()) {
                    this.f3693h = rc.a.f21528a;
                    this.f3687b.acquire();
                    this.f3694i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f3688c++;
                if (this.f3692g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.k.put(null, bVar);
                }
                bVar.f3697a++;
                this.f3694i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j7 > this.f3690e) {
                    this.f3690e = j7;
                    ScheduledFuture scheduledFuture = this.f3689d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f3689d = this.f3696m.schedule(new e(5, this), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f3686a) {
            z10 = this.f3688c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f3695l.decrementAndGet() < 0) {
            e0.d("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f3686a) {
            try {
                if (this.f3692g) {
                    TextUtils.isEmpty(null);
                }
                if (this.k.containsKey(null)) {
                    b bVar = (b) this.k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f3697a - 1;
                        bVar.f3697a = i10;
                        if (i10 == 0) {
                            this.k.remove(null);
                        }
                    }
                } else {
                    e0.p("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f3691f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() > 0) {
            throw h0.b.e(0, arrayList);
        }
    }

    public final void e() {
        synchronized (this.f3686a) {
            try {
                if (b()) {
                    if (this.f3692g) {
                        int i10 = this.f3688c - 1;
                        this.f3688c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f3688c = 0;
                    }
                    d();
                    Iterator it = this.k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f3697a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture = this.f3689d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f3689d = null;
                        this.f3690e = 0L;
                    }
                    if (this.f3687b.isHeld()) {
                        try {
                            try {
                                this.f3687b.release();
                                if (this.f3693h != null) {
                                    this.f3693h = null;
                                }
                            } catch (RuntimeException e4) {
                                if (!e4.getClass().equals(RuntimeException.class)) {
                                    throw e4;
                                }
                                e0.c("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e4);
                                if (this.f3693h != null) {
                                    this.f3693h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f3693h != null) {
                                this.f3693h = null;
                            }
                            throw th2;
                        }
                    } else {
                        e0.d("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
