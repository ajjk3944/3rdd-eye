package C;

import C.m0;
import N7.B8;
import N7.G8;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.InterfaceC1708p0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* compiled from: Preview.java */
/* loaded from: classes.dex */
public final class W extends m0 {

    /* renamed from: w, reason: collision with root package name */
    public static final b f659w = new b();

    /* renamed from: x, reason: collision with root package name */
    public static final H.c f660x = E.u.H();

    /* renamed from: p, reason: collision with root package name */
    public c f661p;

    /* renamed from: q, reason: collision with root package name */
    public H.c f662q;

    /* renamed from: r, reason: collision with root package name */
    public H0.b f663r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f664s;

    /* renamed from: t, reason: collision with root package name */
    public N.s f665t;

    /* renamed from: u, reason: collision with root package name */
    public k0 f666u;

    /* renamed from: v, reason: collision with root package name */
    public H0.c f667v;

    /* compiled from: Preview.java */
    public static final class a implements T0.a<W, x0, a> {

        /* renamed from: a, reason: collision with root package name */
        public final C1710q0 f668a;

        public a() {
            this(C1710q0.K());
        }

        @Override // C.D
        public final InterfaceC1708p0 a() {
            return this.f668a;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0 b() {
            return new x0(C1717u0.J(this.f668a));
        }

        public a(C1710q0 c1710q0) {
            Object objB;
            this.f668a = c1710q0;
            Object objB2 = null;
            try {
                objB = c1710q0.b(J.l.f2691c);
            } catch (IllegalArgumentException unused) {
                objB = null;
            }
            Class cls = (Class) objB;
            if (cls != null && !cls.equals(W.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f668a.N(T0.f14968D, U0.b.PREVIEW);
            C1683d c1683d = J.l.f2691c;
            C1710q0 c1710q02 = this.f668a;
            c1710q02.N(c1683d, W.class);
            try {
                objB2 = c1710q02.b(J.l.f2690b);
            } catch (IllegalArgumentException unused2) {
            }
            if (objB2 == null) {
                this.f668a.N(J.l.f2690b, W.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            Object objB3 = -1;
            try {
                objB3 = c1710q0.b(InterfaceC1698k0.f15077o);
            } catch (IllegalArgumentException unused3) {
            }
            if (((Integer) objB3).intValue() == -1) {
                c1710q0.N(InterfaceC1698k0.f15077o, 2);
            }
        }
    }

    /* compiled from: Preview.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final x0 f669a;

        static {
            Q.b bVar = new Q.b(Q.a.f10849a, Q.c.f10852c);
            C c10 = C.f615c;
            a aVar = new a();
            C1683d c1683d = T0.f14975z;
            C1710q0 c1710q0 = aVar.f668a;
            c1710q0.N(c1683d, 2);
            c1710q0.N(InterfaceC1698k0.f15074l, 0);
            c1710q0.N(InterfaceC1698k0.f15082t, bVar);
            c1710q0.N(InterfaceC1694i0.f15058k, c10);
            f669a = new x0(C1717u0.J(c1710q0));
        }
    }

    /* compiled from: Preview.java */
    public interface c {
        void c(k0 k0Var);
    }

    public final void C() {
        H0.c cVar = this.f667v;
        if (cVar != null) {
            cVar.b();
            this.f667v = null;
        }
        i0 i0Var = this.f664s;
        if (i0Var != null) {
            i0Var.a();
            this.f664s = null;
        }
        N.s sVar = this.f665t;
        if (sVar != null) {
            sVar.c();
            this.f665t = null;
        }
        this.f666u = null;
    }

    public final void D(c cVar) {
        G.n.a();
        if (cVar == null) {
            this.f661p = null;
            this.f750c = m0.a.INACTIVE;
            p();
            return;
        }
        this.f661p = cVar;
        this.f662q = f660x;
        L0 l02 = this.f754g;
        if ((l02 != null ? l02.d() : null) != null) {
            E((x0) this.f753f, this.f754g);
            o();
        }
        n();
    }

    public final void E(x0 x0Var, L0 l02) {
        Rect rect;
        int i = 0;
        int i10 = 1;
        G.n.a();
        androidx.camera.core.impl.J jB = b();
        Objects.requireNonNull(jB);
        C();
        A2.l.q(null, this.f665t == null);
        Matrix matrix = this.f756j;
        boolean zL = jB.l();
        Size sizeD = l02.d();
        Rect rect2 = this.i;
        if (rect2 != null) {
            rect = rect2;
        } else if (sizeD != null) {
            rect2 = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
            rect = rect2;
        } else {
            rect = null;
        }
        Objects.requireNonNull(rect);
        N.s sVar = new N.s(1, 34, l02, matrix, zL, rect, g(jB, l(jB)), ((InterfaceC1698k0) this.f753f).I(), jB.l() && l(jB));
        this.f665t = sVar;
        if (this.f759m != null) {
            throw null;
        }
        sVar.a(new V(this, i));
        k0 k0VarD = this.f665t.d(jB, true);
        this.f666u = k0VarD;
        this.f664s = k0VarD.f741l;
        if (this.f661p != null) {
            androidx.camera.core.impl.J jB2 = b();
            N.s sVar2 = this.f665t;
            if (jB2 != null && sVar2 != null) {
                G.n.c(new N.q(sVar2, g(jB2, l(jB2)), ((InterfaceC1698k0) this.f753f).I()));
            }
            c cVar = this.f661p;
            cVar.getClass();
            k0 k0Var = this.f666u;
            k0Var.getClass();
            this.f662q.execute(new E(i10, cVar, k0Var));
        }
        H0.b bVarE = H0.b.e(x0Var, l02.d());
        Range<Integer> rangeB = l02.b();
        S.a aVar = bVarE.f14887b;
        aVar.getClass();
        aVar.f14949b.N(androidx.camera.core.impl.S.f14939k, rangeB);
        int i11 = G8.i(x0Var);
        if (i11 != 0) {
            aVar.getClass();
            if (i11 != 0) {
                aVar.f14949b.N(T0.f14969E, Integer.valueOf(i11));
            }
        }
        if (l02.c() != null) {
            bVarE.b(l02.c());
        }
        if (this.f661p != null) {
            bVarE.c(this.f664s, l02.a(), ((InterfaceC1698k0) this.f753f).i());
        }
        H0.c cVar2 = this.f667v;
        if (cVar2 != null) {
            cVar2.b();
        }
        H0.c cVar3 = new H0.c(new F(this, i10));
        this.f667v = cVar3;
        bVarE.f14891f = cVar3;
        this.f663r = bVarE;
        Object[] objArr = {bVarE.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
    }

    @Override // C.m0
    public final T0<?> e(boolean z10, U0 u02) {
        f659w.getClass();
        x0 x0Var = b.f669a;
        x0Var.getClass();
        androidx.camera.core.impl.U uA = u02.a(G8.d(x0Var), 1);
        if (z10) {
            uA = B8.m(uA, x0Var);
        }
        if (uA == null) {
            return null;
        }
        return new x0(C1717u0.J(((a) j(uA)).f668a));
    }

    @Override // C.m0
    public final Set<Integer> i() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // C.m0
    public final T0.a<?, ?, ?> j(androidx.camera.core.impl.U u8) {
        return new a(C1710q0.L(u8));
    }

    @Override // C.m0
    public final T0<?> s(androidx.camera.core.impl.I i, T0.a<?, ?, ?> aVar) {
        ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15057j, 34);
        return aVar.b();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    @Override // C.m0
    public final C1701m v(androidx.camera.core.impl.U u8) {
        this.f663r.f14887b.c(u8);
        Object[] objArr = {this.f663r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        C1701m.a aVarF = this.f754g.f();
        aVarF.f15093d = u8;
        return aVarF.a();
    }

    @Override // C.m0
    public final L0 w(L0 l02, L0 l03) {
        E((x0) this.f753f, l02);
        return l02;
    }

    @Override // C.m0
    public final void x() {
        C();
    }

    @Override // C.m0
    public final void z(Rect rect) {
        this.i = rect;
        androidx.camera.core.impl.J jB = b();
        N.s sVar = this.f665t;
        if (jB == null || sVar == null) {
            return;
        }
        G.n.c(new N.q(sVar, g(jB, l(jB)), ((InterfaceC1698k0) this.f753f).I()));
    }
}
