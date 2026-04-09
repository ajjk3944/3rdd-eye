package sf;

import java.util.concurrent.atomic.AtomicReference;
import pf.g1;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f33596a;

    /* renamed from: b, reason: collision with root package name */
    public final p4.g f33597b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f33598c;

    public n(ck.h hVar, g1 g1Var, p4.g gVar) {
        nk.k.e(hVar, "backgroundDispatcher");
        nk.k.e(g1Var, "timeProvider");
        nk.k.e(gVar, "sessionConfigsDataStore");
        this.f33596a = g1Var;
        this.f33597b = gVar;
        this.f33598c = new AtomicReference();
        x.v(x.b(hVar), null, null, new l(this, null, 0), 3);
    }

    public final g a() throws Throwable {
        AtomicReference atomicReference = this.f33598c;
        if (atomicReference.get() == null) {
            Object objZ = x.z(ck.i.f2898a, new l(this, null, 1));
            while (!atomicReference.compareAndSet(null, objZ) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        nk.k.d(obj, "get(...)");
        return (g) obj;
    }

    public final boolean b() {
        Long l10 = a().f33580e;
        Integer num = a().f33579d;
        return l10 == null || num == null || this.f33596a.a().f31820c - l10.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(sf.g r6, ek.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sf.m
            if (r0 == 0) goto L13
            r0 = r7
            sf.m r0 = (sf.m) r0
            int r1 = r0.f33595c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33595c = r1
            goto L18
        L13:
            sf.m r0 = new sf.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f33593a
            int r1 = r0.f33595c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            ci.b.D(r7)     // Catch: java.io.IOException -> L25
            goto L59
        L25:
            r6 = move-exception
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            ci.b.D(r7)
            p4.g r7 = r5.f33597b     // Catch: java.io.IOException -> L25
            dh.d r1 = new dh.d     // Catch: java.io.IOException -> L25
            r3 = 0
            r4 = 5
            r1.<init>(r6, r3, r4)     // Catch: java.io.IOException -> L25
            r0.f33595c = r2     // Catch: java.io.IOException -> L25
            java.lang.Object r6 = r7.a(r1, r0)     // Catch: java.io.IOException -> L25
            dk.a r7 = dk.a.f22275a
            if (r6 != r7) goto L59
            return r7
        L46:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L59:
            yj.u r6 = yj.u.f37649a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.n.c(sf.g, ek.c):java.lang.Object");
    }
}
