package n0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o1 extends s {

    /* renamed from: x, reason: collision with root package name */
    public static final zt.o0 f17231x = zt.f0.a(t0.b.f22376r);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReference f17232y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final e f17233a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17234b;

    /* renamed from: c, reason: collision with root package name */
    public wt.t0 f17235c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f17236d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f17237e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17238f;

    /* renamed from: g, reason: collision with root package name */
    public u.b0 f17239g;

    /* renamed from: h, reason: collision with root package name */
    public final p0.e f17240h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f17241i;
    public final ArrayList j;
    public final u.a0 k;

    /* renamed from: l, reason: collision with root package name */
    public final i4.b f17242l;

    /* renamed from: m, reason: collision with root package name */
    public final u.a0 f17243m;

    /* renamed from: n, reason: collision with root package name */
    public final u.a0 f17244n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f17245o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashSet f17246p;

    /* renamed from: q, reason: collision with root package name */
    public wt.g f17247q;

    /* renamed from: r, reason: collision with root package name */
    public h7.h0 f17248r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17249s;

    /* renamed from: t, reason: collision with root package name */
    public final zt.o0 f17250t;

    /* renamed from: u, reason: collision with root package name */
    public final wt.v0 f17251u;

    /* renamed from: v, reason: collision with root package name */
    public final pq.h f17252v;

    /* renamed from: w, reason: collision with root package name */
    public final t0 f17253w;

    public o1(pq.h hVar) {
        e eVar = new e(new androidx.lifecycle.p0(13, this));
        this.f17233a = eVar;
        this.f17234b = new Object();
        this.f17237e = new ArrayList();
        this.f17239g = new u.b0();
        this.f17240h = new p0.e(new v[16]);
        this.f17241i = new ArrayList();
        this.j = new ArrayList();
        this.k = new u.a0();
        this.f17242l = new i4.b(23, false);
        this.f17243m = new u.a0();
        this.f17244n = new u.a0();
        this.f17250t = zt.f0.a(l1.Inactive);
        new qm.c(9);
        wt.v0 v0Var = new wt.v0((wt.t0) hVar.Y(wt.r.f24653d));
        v0Var.R(new cg.j(11, this));
        this.f17251u = v0Var;
        this.f17252v = hVar.i0(eVar).i0(v0Var);
        this.f17253w = new t0(7);
    }

    public static void q(x0.b bVar) {
        try {
            if (bVar.w() instanceof x0.g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            bVar.c();
        }
    }

    public static final void w(ArrayList arrayList, o1 o1Var, v vVar) {
        arrayList.clear();
        synchronized (o1Var.f17234b) {
            Iterator it = o1Var.j.iterator();
            if (it.hasNext()) {
                ((w0) it.next()).getClass();
                throw null;
            }
        }
    }

    public final boolean A() {
        synchronized (this.f17234b) {
            boolean z10 = true;
            if (this.f17239g.g()) {
                if (this.f17240h.f20232g == 0 && !t() && this.k.f23041e == 0) {
                    z10 = false;
                }
                return z10;
            }
            List listV = v();
            p0.h hVar = new p0.h(this.f17239g);
            this.f17239g = new u.b0();
            try {
                int size = listV.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((v) listV.get(i10)).t(hVar);
                    if (((l1) this.f17250t.getValue()).compareTo(l1.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f17234b) {
                    if (s() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f17240h.f20232g == 0 && !t() && this.k.f23041e == 0) {
                        z10 = false;
                    }
                }
                return z10;
            } catch (Throwable th2) {
                synchronized (this.f17234b) {
                    u.b0 b0Var = this.f17239g;
                    b0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        b0Var.i(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public final void B(v vVar) {
        ArrayList arrayList = this.f17245o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f17245o = arrayList;
        }
        if (!arrayList.contains(vVar)) {
            arrayList.add(vVar);
        }
        if (this.f17237e.remove(vVar)) {
            this.f17238f = null;
        }
    }

    @Override // n0.s
    public final void a(v vVar, ar.n nVar) throws Throwable {
        l1 l1Var;
        boolean zContains;
        x0.b bVarC;
        boolean z10 = vVar.P.F;
        synchronized (this.f17234b) {
            l1 l1Var2 = (l1) this.f17250t.getValue();
            l1Var = l1.ShuttingDown;
            zContains = l1Var2.compareTo(l1Var) > 0 ? true ^ v().contains(vVar) : true;
        }
        try {
            cg.j jVar = new cg.j(10, vVar);
            c0.s sVar = new c0.s(vVar, 4, null);
            x0.f fVarK = x0.l.k();
            x0.b bVar = fVarK instanceof x0.b ? (x0.b) fVarK : null;
            if (bVar == null || (bVarC = bVar.C(jVar, sVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                x0.f fVarJ = bVarC.j();
                try {
                    vVar.i(nVar);
                    synchronized (this.f17234b) {
                        if (((l1) this.f17250t.getValue()).compareTo(l1Var) > 0 && !v().contains(vVar)) {
                            this.f17237e.add(vVar);
                            this.f17238f = null;
                        }
                    }
                    if (!z10) {
                        x0.l.k().m();
                    }
                    try {
                        synchronized (this.f17234b) {
                            ArrayList arrayList = this.j;
                            if (arrayList.size() > 0) {
                                ((w0) arrayList.get(0)).getClass();
                                throw null;
                            }
                        }
                        try {
                            vVar.d();
                            vVar.f();
                            if (z10) {
                                return;
                            }
                            x0.l.k().m();
                        } catch (Throwable th2) {
                            z(th2, null);
                        }
                    } catch (Throwable th3) {
                        z(th3, vVar);
                    }
                } finally {
                    x0.f.q(fVarJ);
                }
            } finally {
                q(bVarC);
            }
        } catch (Throwable th4) {
            if (zContains) {
                synchronized (this.f17234b) {
                }
            }
            z(th4, vVar);
        }
    }

    @Override // n0.s
    public final boolean c() {
        return ((Boolean) f17232y.get()).booleanValue();
    }

    @Override // n0.s
    public final boolean d() {
        return false;
    }

    @Override // n0.s
    public final boolean e() {
        return false;
    }

    @Override // n0.s
    public final long f() {
        return 1000;
    }

    @Override // n0.s
    public final r g() {
        return null;
    }

    @Override // n0.s
    public final pq.h h() {
        return this.f17252v;
    }

    @Override // n0.s
    public final void i(v vVar) {
        wt.f fVarS;
        synchronized (this.f17234b) {
            if (this.f17240h.h(vVar)) {
                fVarS = null;
            } else {
                this.f17240h.b(vVar);
                fVarS = s();
            }
        }
        if (fVarS != null) {
            ((wt.g) fVarS).g(lq.b0.f15562a);
        }
    }

    @Override // n0.s
    public final v0 j(w0 w0Var) {
        v0 v0Var;
        synchronized (this.f17234b) {
            v0Var = (v0) this.f17243m.j(w0Var);
        }
        return v0Var;
    }

    @Override // n0.s
    public final void m(v vVar) {
        synchronized (this.f17234b) {
            try {
                LinkedHashSet linkedHashSet = this.f17246p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f17246p = linkedHashSet;
                }
                linkedHashSet.add(vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.s
    public final void p(v vVar) {
        synchronized (this.f17234b) {
            if (this.f17237e.remove(vVar)) {
                this.f17238f = null;
            }
            this.f17240h.j(vVar);
            this.f17241i.remove(vVar);
        }
    }

    public final void r() {
        synchronized (this.f17234b) {
            if (((l1) this.f17250t.getValue()).compareTo(l1.Idle) >= 0) {
                this.f17250t.g(l1.ShuttingDown);
            }
        }
        this.f17251u.h(null);
    }

    public final wt.f s() {
        l1 l1Var;
        zt.o0 o0Var = this.f17250t;
        int iCompareTo = ((l1) o0Var.getValue()).compareTo(l1.ShuttingDown);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.f17241i;
        p0.e eVar = this.f17240h;
        if (iCompareTo > 0) {
            if (this.f17248r != null) {
                l1Var = l1.Inactive;
            } else if (this.f17235c == null) {
                this.f17239g = new u.b0();
                eVar.g();
                l1Var = t() ? l1.InactivePendingWork : l1.Inactive;
            } else {
                l1Var = (eVar.f20232g == 0 && !this.f17239g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !t() && this.k.f23041e == 0) ? l1.Idle : l1.PendingWork;
            }
            o0Var.g(l1Var);
            if (l1Var != l1.PendingWork) {
                return null;
            }
            wt.g gVar = this.f17247q;
            this.f17247q = null;
            return gVar;
        }
        for (v vVar : v()) {
        }
        this.f17237e.clear();
        this.f17238f = mq.w.f16945a;
        this.f17239g = new u.b0();
        eVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.f17245o = null;
        wt.g gVar2 = this.f17247q;
        if (gVar2 != null) {
            gVar2.q(null);
        }
        this.f17247q = null;
        this.f17248r = null;
        return null;
    }

    public final boolean t() {
        return !this.f17249s && (this.f17233a.f17156r.get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f17234b
            monitor-enter(r0)
            u.b0 r1 = r2.f17239g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            p0.e r1 = r2.f17240h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f20232g     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.t()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.o1.u():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List v() {
        ?? r02 = this.f17238f;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f17237e;
        List arrayList2 = arrayList.isEmpty() ? mq.w.f16945a : new ArrayList(arrayList);
        this.f17238f = arrayList2;
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (((lq.l) r10.get(r4)).f15572d == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014e, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        if (r8 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
    
        r11 = (lq.l) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        if (r11.f15572d != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016b, code lost:
    
        r11 = (n0.w0) r11.f15571a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0172, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        r4 = r17.f17234b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0177, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
    
        mq.t.d0(r17.j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017e, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        if (r8 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        if (((lq.l) r11).f15572d == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0199, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019f, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List x(java.util.List r18, u.b0 r19) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.o1.x(java.util.List, u.b0):java.util.List");
    }

    public final v y(v vVar, u.b0 b0Var) {
        x0.b bVarC;
        if (vVar.P.F || vVar.Q == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f17246p;
        if (linkedHashSet == null || !linkedHashSet.contains(vVar)) {
            cg.j jVar = new cg.j(10, vVar);
            c0.s sVar = new c0.s(vVar, 4, b0Var);
            x0.f fVarK = x0.l.k();
            x0.b bVar = fVarK instanceof x0.b ? (x0.b) fVarK : null;
            if (bVar == null || (bVarC = bVar.C(jVar, sVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                x0.f fVarJ = bVarC.j();
                if (b0Var != null) {
                    try {
                        if (b0Var.h()) {
                            c8.x xVar = new c8.x(b0Var, 4, vVar);
                            p pVar = vVar.P;
                            if (pVar.F) {
                                q.c("Preparing a composition while composing is not supported");
                            }
                            pVar.F = true;
                            try {
                                xVar.c();
                                pVar.F = false;
                            } catch (Throwable th2) {
                                pVar.F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        x0.f.q(fVarJ);
                        throw th3;
                    }
                }
                boolean zS = vVar.s();
                x0.f.q(fVarJ);
                if (zS) {
                    return vVar;
                }
            } finally {
                q(bVarC);
            }
        }
        return null;
    }

    public final void z(Throwable th2, v vVar) throws Throwable {
        if (!((Boolean) f17232y.get()).booleanValue() || (th2 instanceof i)) {
            synchronized (this.f17234b) {
                h7.h0 h0Var = this.f17248r;
                if (h0Var != null) {
                    throw ((Throwable) h0Var.f10078a);
                }
                this.f17248r = new h7.h0(th2);
            }
            throw th2;
        }
        synchronized (this.f17234b) {
            try {
                io.sentry.android.core.e0.c("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.f17241i.clear();
                this.f17240h.g();
                this.f17239g = new u.b0();
                this.j.clear();
                this.k.a();
                this.f17243m.a();
                this.f17248r = new h7.h0(th2);
                if (vVar != null) {
                    B(vVar);
                }
                s();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // n0.s
    public final void k(Set set) {
    }
}
