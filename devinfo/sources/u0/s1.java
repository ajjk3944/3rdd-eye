package u0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s1 extends t {

    /* renamed from: a, reason: collision with root package name */
    public final j2.l0 f34963a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.f f34964b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34965c;

    /* renamed from: d, reason: collision with root package name */
    public xk.y0 f34966d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f34967e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f34968f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public x.f0 f34969h;

    /* renamed from: i, reason: collision with root package name */
    public final w0.e f34970i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f34971k;

    /* renamed from: l, reason: collision with root package name */
    public final x.e0 f34972l;

    /* renamed from: m, reason: collision with root package name */
    public final km.n f34973m;

    /* renamed from: n, reason: collision with root package name */
    public final x.e0 f34974n;

    /* renamed from: o, reason: collision with root package name */
    public final x.e0 f34975o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f34976p;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashSet f34977q;

    /* renamed from: r, reason: collision with root package name */
    public xk.h f34978r;

    /* renamed from: s, reason: collision with root package name */
    public o.e f34979s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f34980t;

    /* renamed from: u, reason: collision with root package name */
    public final al.i1 f34981u;

    /* renamed from: v, reason: collision with root package name */
    public final yb.e f34982v;

    /* renamed from: w, reason: collision with root package name */
    public final xk.a1 f34983w;

    /* renamed from: x, reason: collision with root package name */
    public final ck.h f34984x;

    /* renamed from: y, reason: collision with root package name */
    public final e f34985y;

    /* renamed from: z, reason: collision with root package name */
    public static final al.i1 f34962z = al.z0.b(a1.b.f154d);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public s1(ck.h hVar) {
        j2.l0 l0Var = new j2.l0(new n1(this, 0));
        this.f34963a = l0Var;
        this.f34964b = new i0.f(new n1(this, 1));
        this.f34965c = new Object();
        this.f34968f = new ArrayList();
        this.f34969h = new x.f0();
        this.f34970i = new w0.e(new w[16]);
        this.j = new ArrayList();
        this.f34971k = new ArrayList();
        this.f34972l = new x.e0();
        this.f34973m = new km.n((byte) 0, 22);
        this.f34974n = new x.e0();
        this.f34975o = new x.e0();
        this.f34981u = al.z0.b(o1.f34894c);
        this.f34982v = new yb.e(5);
        xk.a1 a1Var = new xk.a1((xk.y0) hVar.O(xk.s.f37235b));
        a1Var.m(new b7.u(21, this));
        this.f34983w = a1Var;
        this.f34984x = hVar.y(l0Var).y(a1Var);
        this.f34985y = new e(9);
    }

    public static final void A(s1 s1Var, xk.y0 y0Var) {
        synchronized (s1Var.f34965c) {
            Throwable th2 = s1Var.f34967e;
            if (th2 != null) {
                throw th2;
            }
            if (((o1) s1Var.f34981u.getValue()).compareTo(o1.f34893b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (s1Var.f34966d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            s1Var.f34966d = y0Var;
            s1Var.D();
        }
    }

    public static void B(g1.c cVar) {
        try {
            if (cVar.w() instanceof g1.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.c();
        }
    }

    public static final void M(ArrayList arrayList, s1 s1Var, w wVar) {
        arrayList.clear();
        synchronized (s1Var.f34965c) {
            Iterator it = s1Var.f34971k.iterator();
            if (it.hasNext()) {
                ((t0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static final Object w(s1 s1Var, r1 r1Var) {
        xk.h hVar;
        if (s1Var.H()) {
            return yj.u.f37649a;
        }
        xk.h hVar2 = new xk.h(1, a.a.r(r1Var));
        hVar2.s();
        synchronized (s1Var.f34965c) {
            if (s1Var.H()) {
                hVar = hVar2;
            } else {
                s1Var.f34978r = hVar2;
                hVar = null;
            }
        }
        if (hVar != null) {
            hVar.resumeWith(yj.u.f37649a);
        }
        Object objR = hVar2.r();
        return objR == dk.a.f22275a ? objR : yj.u.f37649a;
    }

    public static final void x(s1 s1Var) {
        int i4;
        x.a0 a0Var;
        synchronized (s1Var.f34965c) {
            try {
                if (s1Var.f34972l.j()) {
                    x.a0 a0VarB = w0.a.b(s1Var.f34972l);
                    s1Var.f34972l.a();
                    km.n nVar = s1Var.f34973m;
                    ((x.e0) nVar.f28442b).a();
                    ((x.e0) nVar.f28443c).a();
                    s1Var.f34975o.a();
                    a0Var = new x.a0(a0VarB.f36847b);
                    Object[] objArr = a0VarB.f36846a;
                    int i10 = a0VarB.f36847b;
                    for (int i11 = 0; i11 < i10; i11++) {
                        t0 t0Var = (t0) objArr[i11];
                        a0Var.a(new yj.i(t0Var, s1Var.f34974n.g(t0Var)));
                    }
                    s1Var.f34974n.a();
                } else {
                    a0Var = x.j0.f36910b;
                    nk.k.c(a0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = a0Var.f36846a;
        int i12 = a0Var.f36847b;
        for (i4 = 0; i4 < i12; i4++) {
            yj.i iVar = (yj.i) objArr2[i4];
        }
    }

    public static final boolean y(s1 s1Var) {
        boolean zE;
        synchronized (s1Var.f34965c) {
            zE = s1Var.E();
        }
        return zE;
    }

    public static final List z(s1 s1Var) {
        List listI;
        synchronized (s1Var.f34965c) {
            listI = s1Var.I();
        }
        return listI;
    }

    public final void C() {
        synchronized (this.f34965c) {
            if (((o1) this.f34981u.getValue()).compareTo(o1.f34896e) >= 0) {
                al.i1 i1Var = this.f34981u;
                o1 o1Var = o1.f34893b;
                i1Var.getClass();
                i1Var.j(null, o1Var);
            }
        }
        this.f34983w.e(null);
    }

    public final xk.g D() {
        al.i1 i1Var = this.f34981u;
        int iCompareTo = ((o1) i1Var.getValue()).compareTo(o1.f34893b);
        ArrayList arrayList = this.f34971k;
        ArrayList arrayList2 = this.j;
        w0.e eVar = this.f34970i;
        if (iCompareTo > 0) {
            o.e eVar2 = this.f34979s;
            o1 o1Var = o1.f34897f;
            o1 o1Var2 = o1.f34894c;
            if (eVar2 == null) {
                if (this.f34966d == null) {
                    this.f34969h = new x.f0();
                    eVar.h();
                    if (E() || G()) {
                        o1Var2 = o1.f34895d;
                    }
                } else {
                    o1Var2 = (eVar.f36399c != 0 || this.f34969h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || E() || G() || this.f34972l.j()) ? o1Var : o1.f34896e;
                }
            }
            i1Var.getClass();
            i1Var.j(null, o1Var2);
            if (o1Var2 != o1Var) {
                return null;
            }
            xk.h hVar = this.f34978r;
            this.f34978r = null;
            return hVar;
        }
        List listI = I();
        int size = listI.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
        this.f34968f.clear();
        this.g = zj.s.f38317a;
        this.f34969h = new x.f0();
        eVar.h();
        arrayList2.clear();
        arrayList.clear();
        this.f34976p = null;
        xk.h hVar2 = this.f34978r;
        if (hVar2 != null) {
            hVar2.i(null);
        }
        this.f34978r = null;
        this.f34979s = null;
        return null;
    }

    public final boolean E() {
        return !this.f34980t && (((c1.a) ((androidx.lifecycle.f1) this.f34963a.f27220c).f1136d).get() & 134217727) > 0;
    }

    public final boolean F() {
        return this.f34970i.f36399c != 0 || E() || G() || this.f34972l.j();
    }

    public final boolean G() {
        return !this.f34980t && (((c1.a) ((androidx.lifecycle.f1) this.f34964b.f25417c).f1136d).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f34965c
            monitor-enter(r0)
            x.f0 r1 = r2.f34969h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            w0.e r1 = r2.f34970i     // Catch: java.lang.Throwable -> L21
            int r1 = r1.f36399c     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.E()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r1 = r2.G()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            goto L23
        L1f:
            r1 = 0
            goto L24
        L21:
            r1 = move-exception
            goto L26
        L23:
            r1 = 1
        L24:
            monitor-exit(r0)
            return r1
        L26:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.s1.H():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List I() {
        ?? r02 = this.g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f34968f;
        List arrayList2 = arrayList.isEmpty() ? zj.s.f38317a : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void J() {
        xk.g gVarD;
        synchronized (this.f34965c) {
            gVarD = D();
            if (((o1) this.f34981u.getValue()).compareTo(o1.f34893b) <= 0) {
                Throwable th2 = this.f34967e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th2);
                throw cancellationException;
            }
        }
        if (gVarD != null) {
            ((xk.h) gVarD).resumeWith(yj.u.f37649a);
        }
    }

    public final void K() {
        synchronized (this.f34965c) {
            this.f34980t = true;
        }
    }

    public final void L(w wVar) {
        synchronized (this.f34965c) {
            ArrayList arrayList = this.f34971k;
            if (arrayList.size() > 0) {
                ((t0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        if (((yj.i) r10.get(r4)).f37639b == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        if (r8 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        r11 = (yj.i) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        if (r11.f37639b != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        r11 = (u0.t0) r11.f37638a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0170, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        r4 = r17.f34965c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        zj.n.W(r17.f34971k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        if (((yj.i) r11).f37639b == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List N(java.util.List r18, x.f0 r19) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.s1.N(java.util.List, x.f0):java.util.List");
    }

    public final w O(w wVar, x.f0 f0Var) {
        g1.c cVarD;
        if (wVar.f35011v.F || wVar.f35012w == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f34977q;
        if (linkedHashSet == null || !linkedHashSet.contains(wVar)) {
            b7.u uVar = new b7.u(20, wVar);
            b7.b bVar = new b7.b(23, wVar, f0Var);
            g1.g gVarJ = g1.m.j();
            g1.c cVar = gVarJ instanceof g1.c ? (g1.c) gVarJ : null;
            if (cVar == null || (cVarD = cVar.D(uVar, bVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                g1.g gVarJ2 = cVarD.j();
                if (f0Var != null) {
                    try {
                        if (f0Var.h()) {
                            c0.p pVar = new c0.p(10, f0Var, wVar);
                            p pVar2 = wVar.f35011v;
                            if (pVar2.F) {
                                r.a("Preparing a composition while composing is not supported");
                            }
                            pVar2.F = true;
                            try {
                                pVar.invoke();
                                pVar2.F = false;
                            } catch (Throwable th2) {
                                pVar2.F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        g1.g.q(gVarJ2);
                        throw th3;
                    }
                }
                boolean zX = wVar.x();
                g1.g.q(gVarJ2);
                if (zX) {
                    return wVar;
                }
            } finally {
                B(cVarD);
            }
        }
        return null;
    }

    public final void P(Throwable th2, w wVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th2 instanceof k)) {
            synchronized (this.f34965c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th2);
                o.e eVar = this.f34979s;
                if (eVar != null) {
                    throw ((Throwable) eVar.f30195b);
                }
                this.f34979s = new o.e(19, th2);
            }
            throw th2;
        }
        synchronized (this.f34965c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.j.clear();
                this.f34970i.h();
                this.f34969h = new x.f0();
                this.f34971k.clear();
                this.f34972l.a();
                this.f34974n.a();
                this.f34979s = new o.e(19, th2);
                if (wVar != null) {
                    R(wVar);
                }
                D();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean Q() {
        boolean zF;
        synchronized (this.f34965c) {
            if (this.f34969h.g()) {
                return F();
            }
            List listI = I();
            w0.h hVar = new w0.h(this.f34969h);
            this.f34969h = new x.f0();
            try {
                int size = listI.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((w) listI.get(i4)).y(hVar);
                    if (((o1) this.f34981u.getValue()).compareTo(o1.f34893b) <= 0) {
                        break;
                    }
                }
                synchronized (this.f34965c) {
                    if (D() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zF = F();
                }
                return zF;
            } catch (Throwable th2) {
                synchronized (this.f34965c) {
                    x.f0 f0Var = this.f34969h;
                    f0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        f0Var.j(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public final void R(w wVar) {
        ArrayList arrayList = this.f34976p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f34976p = arrayList;
        }
        if (!arrayList.contains(wVar)) {
            arrayList.add(wVar);
        }
        if (this.f34968f.remove(wVar)) {
            this.g = null;
        }
    }

    public final void S() {
        xk.g gVarD;
        synchronized (this.f34965c) {
            if (this.f34980t) {
                this.f34980t = false;
                gVarD = D();
            } else {
                gVarD = null;
            }
        }
        if (gVarD != null) {
            ((xk.h) gVarD).resumeWith(yj.u.f37649a);
        }
    }

    @Override // u0.t
    public final void a(w wVar, mk.e eVar) throws Throwable {
        o1 o1Var;
        boolean zContains;
        g1.c cVarD;
        boolean z3 = wVar.f35011v.F;
        synchronized (this.f34965c) {
            o1 o1Var2 = (o1) this.f34981u.getValue();
            o1Var = o1.f34893b;
            zContains = o1Var2.compareTo(o1Var) > 0 ? true ^ I().contains(wVar) : true;
        }
        try {
            b7.u uVar = new b7.u(20, wVar);
            b7.b bVar = new b7.b(23, wVar, null);
            g1.g gVarJ = g1.m.j();
            g1.c cVar = gVarJ instanceof g1.c ? (g1.c) gVarJ : null;
            if (cVar == null || (cVarD = cVar.D(uVar, bVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                g1.g gVarJ2 = cVarD.j();
                try {
                    wVar.j(eVar);
                    synchronized (this.f34965c) {
                        if (((o1) this.f34981u.getValue()).compareTo(o1Var) > 0 && !I().contains(wVar)) {
                            this.f34968f.add(wVar);
                            this.g = null;
                        }
                    }
                    if (!z3) {
                        g1.m.j().m();
                    }
                    try {
                        L(wVar);
                        try {
                            wVar.d();
                            wVar.f();
                            if (z3) {
                                return;
                            }
                            g1.m.j().m();
                        } catch (Throwable th2) {
                            P(th2, null);
                        }
                    } catch (Throwable th3) {
                        P(th3, wVar);
                    }
                } finally {
                    g1.g.q(gVarJ2);
                }
            } finally {
                B(cVarD);
            }
        } catch (Throwable th4) {
            if (zContains) {
                synchronized (this.f34965c) {
                }
            }
            P(th4, wVar);
        }
    }

    @Override // u0.t
    public final x.f0 b(w wVar, z1 z1Var, mk.e eVar) {
        yb.e eVar2 = this.f34982v;
        try {
            z1 z1Var2 = wVar.f35005p;
            wVar.f35005p = z1Var;
            try {
                a(wVar, eVar);
                x.f0 f0Var = (x.f0) eVar2.get();
                if (f0Var == null) {
                    f0Var = x.m0.f36916a;
                    nk.k.c(f0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return f0Var;
            } finally {
                wVar.f35005p = z1Var2;
            }
        } finally {
            eVar2.u(null);
        }
    }

    @Override // u0.t
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // u0.t
    public final boolean e() {
        return false;
    }

    @Override // u0.t
    public final boolean f() {
        return false;
    }

    @Override // u0.t
    public final long g() {
        return 1000;
    }

    @Override // u0.t
    public final s h() {
        return null;
    }

    @Override // u0.t
    public final ck.h j() {
        return this.f34984x;
    }

    @Override // u0.t
    public final boolean k() {
        return false;
    }

    @Override // u0.t
    public final void l(w wVar) {
        xk.g gVarD;
        synchronized (this.f34965c) {
            if (this.f34970i.i(wVar)) {
                gVarD = null;
            } else {
                this.f34970i.b(wVar);
                gVarD = D();
            }
        }
        if (gVarD != null) {
            ((xk.h) gVarD).resumeWith(yj.u.f37649a);
        }
    }

    @Override // u0.t
    public final s0 m(t0 t0Var) {
        s0 s0Var;
        synchronized (this.f34965c) {
            s0Var = (s0) this.f34974n.k(t0Var);
        }
        return s0Var;
    }

    @Override // u0.t
    public final x.f0 n(w wVar, z1 z1Var, x.f0 f0Var) {
        yb.e eVar = this.f34982v;
        try {
            Q();
            wVar.y(new w0.h(f0Var));
            z1 z1Var2 = wVar.f35005p;
            wVar.f35005p = z1Var;
            try {
                w wVarO = O(wVar, null);
                if (wVarO != null) {
                    L(wVar);
                    wVarO.d();
                    wVarO.f();
                }
                x.f0 f0Var2 = (x.f0) eVar.get();
                if (f0Var2 == null) {
                    f0Var2 = x.m0.f36916a;
                    nk.k.c(f0Var2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return f0Var2;
            } finally {
                wVar.f35005p = z1Var2;
            }
        } finally {
            eVar.u(null);
        }
    }

    @Override // u0.t
    public final void q(m1 m1Var) {
        yb.e eVar = this.f34982v;
        x.f0 f0Var = (x.f0) eVar.get();
        if (f0Var == null) {
            x.f0 f0Var2 = x.m0.f36916a;
            f0Var = new x.f0();
            eVar.u(f0Var);
        }
        f0Var.a(m1Var);
    }

    @Override // u0.t
    public final void r(w wVar) {
        synchronized (this.f34965c) {
            try {
                LinkedHashSet linkedHashSet = this.f34977q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f34977q = linkedHashSet;
                }
                linkedHashSet.add(wVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u0.t
    public final f s(b2.b bVar) {
        i0.f fVar = this.f34964b;
        androidx.lifecycle.f1 f1Var = (androidx.lifecycle.f1) fVar.f25417c;
        w0 w0Var = new w0();
        w0Var.f35013a = bVar;
        return f1Var.o(w0Var, (c0.p) fVar.f25418d);
    }

    @Override // u0.t
    public final void v(w wVar) {
        synchronized (this.f34965c) {
            if (this.f34968f.remove(wVar)) {
                this.g = null;
            }
            this.f34970i.k(wVar);
            this.j.remove(wVar);
        }
    }

    @Override // u0.t
    public final void o(Set set) {
    }
}
