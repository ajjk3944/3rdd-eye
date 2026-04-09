package hg;

import fg.l;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f10746d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f10747e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final l f10748a;

    /* renamed from: b, reason: collision with root package name */
    public long f10749b;

    /* renamed from: c, reason: collision with root package name */
    public int f10750c;

    public e() {
        if (sm.f.f22129x == null) {
            Pattern pattern = l.f8862c;
            sm.f.f22129x = new sm.f(9);
        }
        sm.f fVar = sm.f.f22129x;
        if (l.f8863d == null) {
            l.f8863d = new l(fVar);
        }
        this.f10748a = l.f8863d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f10750c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            fg.l r0 = r4.f10748a     // Catch: java.lang.Throwable -> L19
            sm.f r0 = r0.f8864a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f10749b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.e.a():boolean");
    }

    public final synchronized void b(int i10) {
        long jMin;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f10750c = 0;
            }
            return;
        }
        this.f10750c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                double dPow = Math.pow(2.0d, this.f10750c);
                this.f10748a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f10747e);
            } else {
                jMin = f10746d;
            }
            this.f10748a.f8864a.getClass();
            this.f10749b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
