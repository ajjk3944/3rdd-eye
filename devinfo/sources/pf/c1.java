package pf;

import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final sf.j f31781a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f31782b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f31783c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f31784d;

    /* renamed from: e, reason: collision with root package name */
    public final p4.g f31785e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f31786f;
    public final ck.h g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f31787h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31788i;
    public String j;

    public c1(sf.j jVar, u0 u0Var, q0 q0Var, g1 g1Var, p4.g gVar, d0 d0Var, ck.h hVar) {
        nk.k.e(jVar, "sessionsSettings");
        nk.k.e(u0Var, "sessionGenerator");
        nk.k.e(q0Var, "sessionFirelogPublisher");
        nk.k.e(g1Var, "timeProvider");
        nk.k.e(gVar, "sessionDataStore");
        nk.k.e(d0Var, "processDataManager");
        nk.k.e(hVar, "backgroundDispatcher");
        this.f31781a = jVar;
        this.f31782b = u0Var;
        this.f31783c = q0Var;
        this.f31784d = g1Var;
        this.f31785e = gVar;
        this.f31786f = d0Var;
        this.g = hVar;
        this.j = "";
        xk.x.v(xk.x.b(hVar), null, null, new y0(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(pf.c1 r4, java.lang.String r5, pf.z0 r6, ck.c r7) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.c1.a(pf.c1, java.lang.String, pf.z0, ck.c):java.lang.Object");
    }

    public final void b() {
        this.f31788i = false;
        if (this.f31787h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f31786f.a());
        xk.x.v(xk.x.b(this.g), null, null, new y0(this, null, 1), 3);
    }

    public final boolean c(j0 j0Var) {
        Map map = j0Var.f31857c;
        boolean z3 = true;
        d0 d0Var = this.f31786f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + d0Var.a());
            return true;
        }
        d0Var.getClass();
        b0 b0Var = (b0) map.get(d0Var.a());
        if (b0Var != null && b0Var.f31766a == d0Var.f31797c && nk.k.a(b0Var.f31767b, (String) d0Var.f31798d.getValue())) {
            z3 = false;
        }
        if (z3) {
            Log.d("FirebaseSessions", "Process " + d0Var.a() + " is stale");
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(pf.j0 r12) {
        /*
            r11 = this;
            pf.f1 r0 = r12.f31856b
            pf.n0 r12 = r12.f31855a
            java.lang.String r1 = "Session "
            java.lang.String r2 = "FirebaseSessions"
            r3 = 0
            if (r0 == 0) goto L74
            pf.g1 r4 = r11.f31784d
            pf.f1 r4 = r4.a()
            int r5 = wk.a.f36814d
            long r4 = r4.f31818a
            long r6 = r0.f31818a
            long r4 = r4 - r6
            wk.c r0 = wk.c.MILLISECONDS
            long r4 = com.bumptech.glide.d.E(r4, r0)
            sf.j r0 = r11.f31781a
            sf.o r6 = r0.f33587a
            wk.a r6 = r6.c()
            r7 = 0
            if (r6 == 0) goto L37
            long r9 = r6.f36815a
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L37
            boolean r6 = wk.a.d(r9)
            if (r6 != 0) goto L37
            goto L54
        L37:
            sf.o r0 = r0.f33588b
            wk.a r0 = r0.c()
            if (r0 == 0) goto L4c
            long r9 = r0.f36815a
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4c
            boolean r0 = wk.a.d(r9)
            if (r0 != 0) goto L4c
            goto L54
        L4c:
            r0 = 30
            wk.c r6 = wk.c.MINUTES
            long r9 = com.bumptech.glide.d.D(r0, r6)
        L54:
            int r0 = wk.a.c(r4, r9)
            if (r0 <= 0) goto L5b
            r3 = 1
        L5b:
            if (r3 == 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f31871a
            r0.append(r12)
            java.lang.String r12 = " is expired"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
        L73:
            return r3
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r12 = r12.f31871a
            r0.append(r12)
            java.lang.String r12 = " has not backgrounded yet"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.d(r2, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.c1.d(pf.j0):boolean");
    }
}
