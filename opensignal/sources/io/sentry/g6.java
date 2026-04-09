package io.sentry;

import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g6 implements k1 {

    /* renamed from: b, reason: collision with root package name */
    public final j6 f12276b;

    /* renamed from: d, reason: collision with root package name */
    public final u3 f12278d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12279e;

    /* renamed from: g, reason: collision with root package name */
    public volatile e6 f12281g;

    /* renamed from: h, reason: collision with root package name */
    public volatile e6 f12282h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Timer f12283i;
    public final io.sentry.util.a j;
    public final io.sentry.util.a k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f12284l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f12285m;

    /* renamed from: n, reason: collision with root package name */
    public final io.sentry.protocol.c0 f12286n;

    /* renamed from: o, reason: collision with root package name */
    public final p1 f12287o;

    /* renamed from: p, reason: collision with root package name */
    public final io.sentry.protocol.c f12288p;

    /* renamed from: q, reason: collision with root package name */
    public final l f12289q;

    /* renamed from: r, reason: collision with root package name */
    public final t6 f12290r;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.t f12275a = new io.sentry.protocol.t();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f12277c = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public f6 f12280f = f6.f12252c;

    public g6(s6 s6Var, u3 u3Var, t6 t6Var, l lVar) {
        this.f12283i = null;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.j = aVar;
        this.k = new io.sentry.util.a();
        this.f12284l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f12285m = atomicBoolean;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        this.f12288p = cVar;
        j6 j6Var = new j6(s6Var, this, u3Var, t6Var);
        this.f12276b = j6Var;
        this.f12279e = s6Var.K;
        this.f12287o = s6Var.H;
        this.f12278d = u3Var;
        Boolean bool = Boolean.TRUE;
        lVar = bool.equals(G()) ? lVar : null;
        this.f12289q = lVar;
        this.f12286n = s6Var.L;
        this.f12290r = t6Var;
        H(j6Var);
        io.sentry.protocol.t tVarF = F();
        if (!tVarF.equals(io.sentry.protocol.t.f12636d) && bool.equals(G())) {
            cVar.j(new e3(tVarF), "profile");
        }
        if (lVar != null) {
            lVar.e(this);
        }
        if (t6Var.f12743g == null && t6Var.f12744h == null) {
            return;
        }
        boolean z10 = true;
        this.f12283i = new Timer(true);
        Long l10 = t6Var.f12744h;
        if (l10 != null) {
            q qVarA = aVar.a();
            try {
                if (this.f12283i != null) {
                    B();
                    atomicBoolean.set(true);
                    this.f12282h = new e6(this, 1);
                    try {
                        this.f12283i.schedule(this.f12282h, l10.longValue());
                    } catch (Throwable th2) {
                        this.f12278d.k().getLogger().g(b5.WARNING, "Failed to schedule finish timer", th2);
                        o6 o6VarU = u();
                        if (o6VarU == null) {
                            o6VarU = o6.DEADLINE_EXCEEDED;
                        }
                        if (this.f12290r.f12743g == null) {
                            z10 = false;
                        }
                        e(o6VarU, z10, null);
                        this.f12285m.set(false);
                    }
                }
                qVarA.close();
            } catch (Throwable th3) {
                try {
                    qVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        r();
    }

    @Override // io.sentry.i1
    public final k4 A() {
        return this.f12276b.f12386a;
    }

    public final void B() {
        q qVarA = this.j.a();
        try {
            if (this.f12282h != null) {
                this.f12282h.cancel();
                this.f12285m.set(false);
                this.f12282h = null;
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

    public final void C() {
        q qVarA = this.j.a();
        try {
            if (this.f12281g != null) {
                this.f12281g.cancel();
                this.f12284l.set(false);
                this.f12281g = null;
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

    public final i1 D(k6 k6Var, d8.a aVar) {
        boolean z10 = this.f12276b.f12392g;
        t2 t2Var = t2.f12740a;
        if (!z10 && this.f12287o.equals(k6Var.H)) {
            u3 u3Var = this.f12278d;
            if (!io.sentry.util.j.a((String) aVar.f7150d, u3Var.k().getIgnoredSpanOrigins())) {
                n6 n6Var = k6Var.f12414g;
                String str = k6Var.f12416x;
                String str2 = k6Var.f12417y;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f12277c;
                if (copyOnWriteArrayList.size() >= u3Var.k().getMaxSpans()) {
                    u3Var.k().getLogger().m(b5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return t2Var;
                }
                ir.f0.T(n6Var, "parentSpanId is required");
                ir.f0.T(str, "operation is required");
                C();
                j6 j6Var = new j6(this, this.f12278d, k6Var, aVar, new bf.a(21, this));
                H(j6Var);
                copyOnWriteArrayList.add(j6Var);
                l lVar = this.f12289q;
                if (lVar != null) {
                    lVar.d(j6Var);
                }
                return j6Var;
            }
        }
        return t2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(io.sentry.o6 r5, io.sentry.k4 r6, boolean r7, io.sentry.h0 r8) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.g6.E(io.sentry.o6, io.sentry.k4, boolean, io.sentry.h0):void");
    }

    public final io.sentry.protocol.t F() {
        j6 j6Var = this.f12276b;
        return !j6Var.f12388c.J.equals(io.sentry.protocol.t.f12636d) ? j6Var.f12388c.J : this.f12278d.k().getContinuousProfiler().s();
    }

    public final Boolean G() {
        cj.a aVar = this.f12276b.f12388c.f12415r;
        if (aVar == null) {
            return null;
        }
        return (Boolean) aVar.f3974d;
    }

    public final void H(j6 j6Var) {
        io.sentry.util.thread.a threadChecker = this.f12278d.k().getThreadChecker();
        io.sentry.protocol.t tVarF = F();
        if (!tVarF.equals(io.sentry.protocol.t.f12636d)) {
            Boolean bool = Boolean.TRUE;
            cj.a aVar = j6Var.f12388c.f12415r;
            if (bool.equals(aVar == null ? null : (Boolean) aVar.f3974d)) {
                j6Var.l(tVarF.toString(), "profiler_id");
            }
        }
        j6Var.l(String.valueOf(threadChecker.b()), "thread.id");
        j6Var.l(threadChecker.a(), "thread.name");
    }

    public final void I(c cVar) {
        j6 j6Var = this.f12276b;
        u3 u3Var = this.f12278d;
        q qVarA = this.k.a();
        try {
            if (cVar.f12097f) {
                AtomicReference atomicReference = new AtomicReference();
                if (u3Var.isEnabled()) {
                    try {
                        atomicReference.set(u3Var.f12793e.Z(null).i());
                    } catch (Throwable th2) {
                        u3Var.k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th2);
                    }
                } else {
                    u3Var.k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                }
                cVar.d(j6Var.f12388c.f12412a, (io.sentry.protocol.t) atomicReference.get(), u3Var.k(), j6Var.f12388c.f12415r, this.f12279e, this.f12286n);
                cVar.f12097f = false;
            }
            qVarA.close();
        } finally {
        }
    }

    @Override // io.sentry.i1
    public final void a(o6 o6Var) {
        j6 j6Var = this.f12276b;
        if (j6Var.f12392g) {
            this.f12278d.k().getLogger().m(b5.DEBUG, "The transaction is already finished. Status %s cannot be set", o6Var == null ? "null" : o6Var.name());
        } else {
            j6Var.f12388c.B = o6Var;
        }
    }

    @Override // io.sentry.i1
    public final q6 b() {
        c cVar;
        if (!this.f12278d.k().isTraceSampling() || (cVar = this.f12276b.f12388c.I) == null) {
            return null;
        }
        I(cVar);
        return cVar.e();
    }

    @Override // io.sentry.i1
    public final d6 c() {
        return this.f12276b.c();
    }

    @Override // io.sentry.i1
    public final boolean d() {
        return this.f12276b.f12392g;
    }

    @Override // io.sentry.k1
    public final void e(o6 o6Var, boolean z10, h0 h0Var) {
        if (this.f12276b.f12392g) {
            return;
        }
        k4 k4VarA = this.f12278d.k().getDateProvider().a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f12277c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            j6 j6Var = (j6) listIterator.previous();
            j6Var.j = null;
            j6Var.x(o6Var, k4VarA);
        }
        E(o6Var, k4VarA, z10, h0Var);
    }

    @Override // io.sentry.i1
    public final void f(Throwable th2) {
        j6 j6Var = this.f12276b;
        if (j6Var.f12392g) {
            this.f12278d.k().getLogger().m(b5.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            j6Var.f12390e = th2;
        }
    }

    @Override // io.sentry.i1
    public final void g(o6 o6Var) {
        x(o6Var, null);
    }

    @Override // io.sentry.i1
    public final String getDescription() {
        return this.f12276b.f12388c.f12417y;
    }

    @Override // io.sentry.k1
    public final String getName() {
        return this.f12279e;
    }

    @Override // io.sentry.i1
    public final bu.t h(List list) {
        c cVar;
        if (!this.f12278d.k().isTraceSampling() || (cVar = this.f12276b.f12388c.I) == null) {
            return null;
        }
        I(cVar);
        return bu.t.j(cVar, list);
    }

    @Override // io.sentry.i1
    public final boolean i() {
        return false;
    }

    @Override // io.sentry.i1
    public final i1 j(String str, String str2, k4 k4Var, p1 p1Var) {
        return y(str, str2, k4Var, p1Var, new d8.a(2, false));
    }

    @Override // io.sentry.i1
    public final void k() {
        x(u(), null);
    }

    @Override // io.sentry.i1
    public final void l(Object obj, String str) {
        j6 j6Var = this.f12276b;
        if (j6Var.f12392g) {
            this.f12278d.k().getLogger().m(b5.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            j6Var.l(obj, str);
        }
    }

    @Override // io.sentry.i1
    public final void m() {
        u3 u3Var = this.f12278d;
        if (!u3Var.isEnabled()) {
            u3Var.k().getLogger().m(b5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            u3Var.f12793e.Z(null).I(this);
        } catch (Throwable th2) {
            u3Var.k().getLogger().g(b5.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.k1
    public final i1 n() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f12277c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            j6 j6Var = (j6) listIterator.previous();
            if (!j6Var.f12392g) {
                return j6Var;
            }
        }
        return null;
    }

    @Override // io.sentry.i1
    public final void o(String str) {
        j6 j6Var = this.f12276b;
        if (j6Var.f12392g) {
            this.f12278d.k().getLogger().m(b5.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            j6Var.f12388c.f12417y = str;
        }
    }

    @Override // io.sentry.k1
    public final io.sentry.protocol.t p() {
        return this.f12275a;
    }

    @Override // io.sentry.i1
    public final i1 q(String str) {
        return z(str, null);
    }

    @Override // io.sentry.k1
    public final void r() {
        Long l10;
        q qVarA = this.j.a();
        try {
            if (this.f12283i != null && (l10 = this.f12290r.f12743g) != null) {
                C();
                this.f12284l.set(true);
                this.f12281g = new e6(this, 0);
                try {
                    this.f12283i.schedule(this.f12281g, l10.longValue());
                } catch (Throwable th2) {
                    this.f12278d.k().getLogger().g(b5.WARNING, "Failed to schedule finish timer", th2);
                    o6 o6VarU = u();
                    if (o6VarU == null) {
                        o6VarU = o6.OK;
                    }
                    x(o6VarU, null);
                    this.f12284l.set(false);
                }
            }
            qVarA.close();
        } catch (Throwable th3) {
            try {
                qVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.i1
    public final void s(String str, Long l10, g2 g2Var) {
        this.f12276b.s(str, l10, g2Var);
    }

    @Override // io.sentry.i1
    public final k6 t() {
        return this.f12276b.f12388c;
    }

    @Override // io.sentry.i1
    public final o6 u() {
        return this.f12276b.f12388c.B;
    }

    @Override // io.sentry.i1
    public final k4 v() {
        return this.f12276b.f12387b;
    }

    @Override // io.sentry.i1
    public final void w(String str, Number number) {
        this.f12276b.w(str, number);
    }

    @Override // io.sentry.i1
    public final void x(o6 o6Var, k4 k4Var) {
        E(o6Var, k4Var, true, null);
    }

    @Override // io.sentry.i1
    public final i1 y(String str, String str2, k4 k4Var, p1 p1Var, d8.a aVar) {
        boolean z10 = this.f12276b.f12392g;
        t2 t2Var = t2.f12740a;
        if (z10 || !this.f12287o.equals(p1Var)) {
            return t2Var;
        }
        int size = this.f12277c.size();
        u3 u3Var = this.f12278d;
        if (size < u3Var.k().getMaxSpans()) {
            return this.f12276b.y(str, str2, k4Var, p1Var, aVar);
        }
        u3Var.k().getLogger().m(b5.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return t2Var;
    }

    @Override // io.sentry.i1
    public final i1 z(String str, String str2) {
        return y(str, str2, null, p1.SENTRY, new d8.a(2, false));
    }
}
