package androidx.compose.runtime.snapshots;

import T.AbstractC3517c;
import T.B0;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.runtime.snapshots.g;
import d0.InterfaceC5270b;
import d0.InterfaceC5279k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.I;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f28632e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f28633f = 8;

    /* renamed from: a, reason: collision with root package name */
    private i f28634a;

    /* renamed from: b, reason: collision with root package name */
    private int f28635b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28636c;

    /* renamed from: d, reason: collision with root package name */
    private int f28637d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(InterfaceC6839p interfaceC6839p) {
            synchronized (j.I()) {
                j.f28659h = AbstractC3689v.J0(j.f28659h, interfaceC6839p);
                J j10 = J.f24997a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC6835l interfaceC6835l) {
            synchronized (j.I()) {
                j.f28660i = AbstractC3689v.J0(j.f28660i, interfaceC6835l);
                J j10 = J.f24997a;
            }
            j.B();
        }

        public final g c() {
            return j.H();
        }

        public final g d() {
            return (g) j.f28653b.a();
        }

        public final boolean e() {
            return j.f28653b.a() != null;
        }

        public final g f(g gVar) {
            if (gVar instanceof p) {
                p pVar = (p) gVar;
                if (pVar.U() == AbstractC3517c.a()) {
                    pVar.X(null);
                    return gVar;
                }
            }
            if (gVar instanceof q) {
                q qVar = (q) gVar;
                if (qVar.C() == AbstractC3517c.a()) {
                    qVar.F(null);
                    return gVar;
                }
            }
            g gVarE = j.E(gVar, null, false, 6, null);
            gVarE.l();
            return gVarE;
        }

        public final void g() {
            j.H().o();
        }

        public final Object h(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6824a interfaceC6824a) {
            g pVar;
            if (interfaceC6835l == null && interfaceC6835l2 == null) {
                return interfaceC6824a.invoke();
            }
            g gVar = (g) j.f28653b.a();
            if (gVar instanceof p) {
                p pVar2 = (p) gVar;
                if (pVar2.U() == AbstractC3517c.a()) {
                    InterfaceC6835l interfaceC6835lH = pVar2.h();
                    InterfaceC6835l interfaceC6835lK = pVar2.k();
                    try {
                        ((p) gVar).X(j.L(interfaceC6835l, interfaceC6835lH, false, 4, null));
                        ((p) gVar).Y(j.M(interfaceC6835l2, interfaceC6835lK));
                        return interfaceC6824a.invoke();
                    } finally {
                        pVar2.X(interfaceC6835lH);
                        pVar2.Y(interfaceC6835lK);
                    }
                }
            }
            if (gVar == null || (gVar instanceof b)) {
                pVar = new p(gVar instanceof b ? (b) gVar : null, interfaceC6835l, interfaceC6835l2, true, false);
            } else {
                if (interfaceC6835l == null) {
                    return interfaceC6824a.invoke();
                }
                pVar = gVar.x(interfaceC6835l);
            }
            try {
                g gVarL = pVar.l();
                try {
                    return interfaceC6824a.invoke();
                } finally {
                    pVar.s(gVarL);
                }
            } finally {
                pVar.d();
            }
        }

        public final InterfaceC5270b i(final InterfaceC6839p interfaceC6839p) {
            j.A(j.f28652a);
            synchronized (j.I()) {
                j.f28659h = AbstractC3689v.N0(j.f28659h, interfaceC6839p);
                J j10 = J.f24997a;
            }
            return new InterfaceC5270b() { // from class: d0.c
                @Override // d0.InterfaceC5270b
                public final void dispose() {
                    g.a.j(interfaceC6839p);
                }
            };
        }

        public final InterfaceC5270b k(final InterfaceC6835l interfaceC6835l) {
            synchronized (j.I()) {
                j.f28660i = AbstractC3689v.N0(j.f28660i, interfaceC6835l);
                J j10 = J.f24997a;
            }
            j.B();
            return new InterfaceC5270b() { // from class: d0.d
                @Override // d0.InterfaceC5270b
                public final void dispose() {
                    g.a.l(interfaceC6835l);
                }
            };
        }

        public final void m(g gVar, g gVar2, InterfaceC6835l interfaceC6835l) {
            if (gVar != gVar2) {
                gVar2.s(gVar);
                gVar2.d();
            } else if (gVar instanceof p) {
                ((p) gVar).X(interfaceC6835l);
            } else {
                if (gVar instanceof q) {
                    ((q) gVar).F(interfaceC6835l);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
            }
        }

        public final void n() {
            boolean z10;
            synchronized (j.I()) {
                I iE = ((androidx.compose.runtime.snapshots.a) j.f28661j.get()).E();
                z10 = false;
                if (iE != null) {
                    if (iE.e()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                j.B();
            }
        }

        public final b o(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            b bVarQ;
            g gVarH = j.H();
            b bVar = gVarH instanceof b ? (b) gVarH : null;
            if (bVar == null || (bVarQ = bVar.Q(interfaceC6835l, interfaceC6835l2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return bVarQ;
        }

        public final g p(InterfaceC6835l interfaceC6835l) {
            return j.H().x(interfaceC6835l);
        }

        private a() {
        }
    }

    public /* synthetic */ g(int i10, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, iVar);
    }

    public final void b() {
        synchronized (j.I()) {
            c();
            r();
            J j10 = J.f24997a;
        }
    }

    public void c() {
        j.f28655d = j.f28655d.k(f());
    }

    public void d() {
        this.f28636c = true;
        synchronized (j.I()) {
            q();
            J j10 = J.f24997a;
        }
    }

    public final boolean e() {
        return this.f28636c;
    }

    public int f() {
        return this.f28635b;
    }

    public i g() {
        return this.f28634a;
    }

    public abstract InterfaceC6835l h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract InterfaceC6835l k();

    public g l() {
        g gVar = (g) j.f28653b.a();
        j.f28653b.b(this);
        return gVar;
    }

    public abstract void m(g gVar);

    public abstract void n(g gVar);

    public abstract void o();

    public abstract void p(InterfaceC5279k interfaceC5279k);

    public final void q() {
        int i10 = this.f28637d;
        if (i10 >= 0) {
            j.Y(i10);
            this.f28637d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(g gVar) {
        j.f28653b.b(gVar);
    }

    public final void t(boolean z10) {
        this.f28636c = z10;
    }

    public void u(int i10) {
        this.f28635b = i10;
    }

    public void v(i iVar) {
        this.f28634a = iVar;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g x(InterfaceC6835l interfaceC6835l);

    public final int y() {
        int i10 = this.f28637d;
        this.f28637d = -1;
        return i10;
    }

    public final void z() {
        if (this.f28636c) {
            B0.a("Cannot use a disposed snapshot");
        }
    }

    private g(int i10, i iVar) {
        this.f28634a = iVar;
        this.f28635b = i10;
        this.f28637d = i10 != 0 ? j.c0(i10, g()) : -1;
    }
}
