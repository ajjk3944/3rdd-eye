package k5;

import h5.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: RequestLimiter.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f43404d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f43405e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f43406a;

    /* renamed from: b, reason: collision with root package name */
    public long f43407b;

    /* renamed from: c, reason: collision with root package name */
    public int f43408c;

    public e() {
        if (B7.d.f579c == null) {
            Pattern pattern = j.f38266c;
            B7.d.f579c = new B7.d(23);
        }
        B7.d dVar = B7.d.f579c;
        if (j.f38267d == null) {
            j.f38267d = new j(dVar);
        }
        this.f43406a = j.f38267d;
    }

    public final synchronized long a(int i) {
        if (!(i == 429 || (i >= 500 && i < 600))) {
            return f43404d;
        }
        double dPow = Math.pow(2.0d, this.f43408c);
        this.f43406a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f43405e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f43408c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            h5.j r0 = r4.f43406a     // Catch: java.lang.Throwable -> L19
            B7.d r0 = r0.f38268a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f43407b     // Catch: java.lang.Throwable -> L19
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
        throw new UnsupportedOperationException("Method not decompiled: k5.e.b():boolean");
    }

    public final synchronized void c() {
        this.f43408c = 0;
    }

    public final synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            c();
            return;
        }
        this.f43408c++;
        long jA = a(i);
        this.f43406a.f38268a.getClass();
        this.f43407b = System.currentTimeMillis() + jA;
    }
}
