package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24271a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f24272b = new Object();

    public static final void a(int i4, int i10) {
        if (i4 < 0 || i4 >= i10) {
            throw new IndexOutOfBoundsException("index (" + i4 + ") is out of bound of [0, " + i10 + ')');
        }
    }

    public static final boolean b(w wVar, int i4, y0.b bVar, boolean z3) {
        boolean z10;
        synchronized (f24271a) {
            try {
                int i10 = wVar.f24296d;
                if (i10 == i4) {
                    wVar.f24295c = bVar;
                    z10 = true;
                    if (z3) {
                        wVar.f24297e++;
                    }
                    wVar.f24296d = i10 + 1;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static final boolean c(b0 b0Var, int i4, a1.b bVar) {
        boolean z3;
        synchronized (f24272b) {
            int i10 = b0Var.f24206d;
            if (i10 == i4) {
                b0Var.f24205c = bVar;
                z3 = true;
                b0Var.f24206d = i10 + 1;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public static final int d(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i10 = (i4 + length) >>> 1;
            long j8 = jArr[i10];
            if (j > j8) {
                i4 = i10 + 1;
            } else {
                if (j >= j8) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static g f() {
        return (g) m.f24259b.get();
    }

    public static final int g(v vVar) {
        b0 b0Var = vVar.f24294a;
        nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((b0) m.h(b0Var)).f24206d;
    }

    public static final w h(q qVar) {
        w wVar = qVar.f24270a;
        nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (w) m.u(wVar, qVar);
    }

    public static final b0 i(v vVar) {
        b0 b0Var = vVar.f24294a;
        nk.k.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (b0) m.u(b0Var, vVar);
    }

    public static final int j(q qVar) {
        w wVar = qVar.f24270a;
        nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((w) m.h(wVar)).f24297e;
    }

    public static g k(g gVar) {
        if (gVar instanceof e0) {
            e0 e0Var = (e0) gVar;
            if (e0Var.f24231t == c1.n.b()) {
                e0Var.f24229r = null;
                return gVar;
            }
        }
        if (gVar instanceof f0) {
            f0 f0Var = (f0) gVar;
            if (f0Var.f24237i == c1.n.b()) {
                f0Var.f24236h = null;
                return gVar;
            }
        }
        g gVarG = m.g(gVar, null, false);
        gVarG.j();
        return gVarG;
    }

    public static final boolean l(q qVar, mk.c cVar) {
        int i4;
        y0.b bVar;
        Object objInvoke;
        g gVarJ;
        boolean zB;
        do {
            synchronized (f24271a) {
                w wVar = qVar.f24270a;
                nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                w wVar2 = (w) m.h(wVar);
                i4 = wVar2.f24296d;
                bVar = wVar2.f24295c;
            }
            nk.k.b(bVar);
            y0.e eVarF = bVar.f();
            objInvoke = cVar.invoke(eVarF);
            y0.b bVarD = eVarF.d();
            if (nk.k.a(bVarD, bVar)) {
                break;
            }
            w wVar3 = qVar.f24270a;
            nk.k.c(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f24260c) {
                gVarJ = m.j();
                zB = b((w) m.x(wVar3, qVar, gVarJ), i4, bVarD, true);
            }
            m.o(gVarJ, qVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static Object m(g0.n nVar, mk.a aVar) {
        g e0Var;
        g gVar = (g) m.f24259b.get();
        if (gVar instanceof e0) {
            e0 e0Var2 = (e0) gVar;
            if (e0Var2.f24231t == c1.n.b()) {
                mk.c cVar = e0Var2.f24229r;
                mk.c cVar2 = e0Var2.f24230s;
                try {
                    ((e0) gVar).f24229r = m.k(nVar, cVar, true);
                    ((e0) gVar).f24230s = cVar2;
                    return aVar.invoke();
                } finally {
                    e0Var2.f24229r = cVar;
                    e0Var2.f24230s = cVar2;
                }
            }
        }
        if (gVar == null || (gVar instanceof c)) {
            e0Var = new e0(gVar instanceof c ? (c) gVar : null, nVar, null, true, false);
        } else {
            e0Var = gVar.u(nVar);
        }
        try {
            g gVarJ = e0Var.j();
            try {
                Object objInvoke = aVar.invoke();
                g.q(gVarJ);
                e0Var.c();
                return objInvoke;
            } catch (Throwable th2) {
                g.q(gVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            e0Var.c();
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    public static ca.b n(bl.z zVar) {
        m.e(m.f24258a);
        synchronized (m.f24260c) {
            m.f24264h = zj.n.k0(m.f24264h, zVar);
        }
        return new ca.b(11, zVar);
    }

    public static void o(g gVar, g gVar2, mk.c cVar) {
        if (gVar != gVar2) {
            gVar2.getClass();
            g.q(gVar);
            gVar2.c();
        } else if (gVar instanceof e0) {
            ((e0) gVar).f24229r = cVar;
        } else if (gVar instanceof f0) {
            ((f0) gVar).f24236h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
        }
    }

    public static void p() {
        boolean z3;
        synchronized (m.f24260c) {
            x.f0 f0Var = m.j.f24210h;
            z3 = false;
            if (f0Var != null) {
                if (f0Var.h()) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            m.a();
        }
    }

    public static final void q() {
        throw new UnsupportedOperationException();
    }

    public abstract void e();
}
