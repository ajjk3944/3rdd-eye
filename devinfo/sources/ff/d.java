package ff;

import df.j;
import ec.z;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f24032d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f24033e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f24034a;

    /* renamed from: b, reason: collision with root package name */
    public long f24035b;

    /* renamed from: c, reason: collision with root package name */
    public int f24036c;

    public d() {
        if (z.f23236x == null) {
            Pattern pattern = j.f22248c;
            z.f23236x = new z(27);
        }
        z zVar = z.f23236x;
        if (j.f22249d == null) {
            j.f22249d = new j(zVar);
        }
        this.f24034a = j.f22249d;
    }

    public final synchronized long a(int i4) {
        if (!(i4 == 429 || (i4 >= 500 && i4 < 600))) {
            return f24032d;
        }
        double dPow = Math.pow(2.0d, this.f24036c);
        this.f24034a.getClass();
        return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f24033e);
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
            int r0 = r4.f24036c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            df.j r0 = r4.f24034a     // Catch: java.lang.Throwable -> L19
            ec.z r0 = r0.f22250a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f24035b     // Catch: java.lang.Throwable -> L19
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
        throw new UnsupportedOperationException("Method not decompiled: ff.d.b():boolean");
    }

    public final synchronized void c() {
        this.f24036c = 0;
    }

    public final synchronized void d(int i4) {
        if ((i4 >= 200 && i4 < 300) || i4 == 401 || i4 == 404) {
            c();
            return;
        }
        this.f24036c++;
        long jA = a(i4);
        this.f24034a.f22250a.getClass();
        this.f24035b = System.currentTimeMillis() + jA;
    }
}
