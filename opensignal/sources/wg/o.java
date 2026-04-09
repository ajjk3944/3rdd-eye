package wg;

import java.util.concurrent.atomic.AtomicReference;
import tg.e1;
import wt.w;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f24522a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.g f24523b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f24524c;

    public o(pq.h hVar, e1 e1Var, d4.g gVar) {
        br.l.e(hVar, "backgroundDispatcher");
        br.l.e(e1Var, "timeProvider");
        br.l.e(gVar, "sessionConfigsDataStore");
        this.f24522a = e1Var;
        this.f24523b = gVar;
        this.f24524c = new AtomicReference();
        w.s(w.b(hVar), null, null, new m(this, null, 0), 3);
    }

    public final h a() throws Throwable {
        AtomicReference atomicReference = this.f24524c;
        if (atomicReference.get() == null) {
            Object objW = w.w(pq.i.f20621a, new m(this, null, 1));
            while (!atomicReference.compareAndSet(null, objW) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        br.l.d(obj, "get(...)");
        return (h) obj;
    }

    public final boolean b() {
        Long l10 = a().f24508e;
        Integer num = a().f24507d;
        return l10 == null || num == null || this.f24522a.a().f22762c - l10.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(wg.h r7, rq.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wg.n
            if (r0 == 0) goto L13
            r0 = r8
            wg.n r0 = (wg.n) r0
            int r1 = r0.f24521y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24521y = r1
            goto L18
        L13:
            wg.n r0 = new wg.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f24519r
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f24521y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            lf.t1.G(r8)     // Catch: java.io.IOException -> L27
            goto L59
        L27:
            r7 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            lf.t1.G(r8)
            d4.g r8 = r6.f24523b     // Catch: java.io.IOException -> L27
            d8.e r2 = new d8.e     // Catch: java.io.IOException -> L27
            r4 = 0
            r5 = 4
            r2.<init>(r7, r4, r5)     // Catch: java.io.IOException -> L27
            r0.f24521y = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r7 = r8.b(r2, r0)     // Catch: java.io.IOException -> L27
            if (r7 != r1) goto L59
            return r1
        L46:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "FirebaseSessions"
            io.sentry.android.core.e0.p(r8, r7)
        L59:
            lq.b0 r7 = lq.b0.f15562a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.o.c(wg.h, rq.c):java.lang.Object");
    }
}
