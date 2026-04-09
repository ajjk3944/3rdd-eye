package C;

import N7.B8;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import g0.C4356c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: UseCase.java */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: d, reason: collision with root package name */
    public T0<?> f751d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f752e;

    /* renamed from: f, reason: collision with root package name */
    public T0<?> f753f;

    /* renamed from: g, reason: collision with root package name */
    public L0 f754g;

    /* renamed from: h, reason: collision with root package name */
    public T0<?> f755h;
    public Rect i;

    /* renamed from: k, reason: collision with root package name */
    public androidx.camera.core.impl.J f757k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.camera.core.impl.J f758l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0627n f759m;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f748a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Object f749b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public a f750c = a.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    public Matrix f756j = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    public H0 f760n = H0.a();

    /* renamed from: o, reason: collision with root package name */
    public H0 f761o = H0.a();

    /* compiled from: UseCase.java */
    public enum a {
        ACTIVE,
        INACTIVE
    }

    /* compiled from: UseCase.java */
    public interface b {
        void c(m0 m0Var);

        void h(m0 m0Var);

        void o(m0 m0Var);

        void p(m0 m0Var);
    }

    public m0(T0<?> t02) {
        this.f752e = t02;
        this.f753f = t02;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.camera.core.impl.T0<?>, java.lang.Object] */
    public final void A(androidx.camera.core.impl.J j4) {
        x();
        synchronized (this.f749b) {
            try {
                androidx.camera.core.impl.J j10 = this.f757k;
                if (j4 == j10) {
                    this.f748a.remove(j10);
                    this.f757k = null;
                }
                androidx.camera.core.impl.J j11 = this.f758l;
                if (j4 == j11) {
                    this.f748a.remove(j11);
                    this.f758l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f754g = null;
        this.i = null;
        this.f753f = this.f752e;
        this.f751d = null;
        this.f755h = null;
    }

    public final void B(List<H0> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f760n = list.get(0);
        if (list.size() > 1) {
            this.f761o = list.get(1);
        }
        Iterator<H0> it = list.iterator();
        while (it.hasNext()) {
            for (androidx.camera.core.impl.X x10 : it.next().b()) {
                if (x10.f14995j == null) {
                    x10.f14995j = getClass();
                }
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void a(androidx.camera.core.impl.J j4, androidx.camera.core.impl.J j10, T0<?> t02, T0<?> t03) {
        synchronized (this.f749b) {
            this.f757k = j4;
            this.f758l = j10;
            this.f748a.add(j4);
            if (j10 != null) {
                this.f748a.add(j10);
            }
        }
        this.f751d = t02;
        this.f755h = t03;
        this.f753f = m(j4.n(), this.f751d, this.f755h);
        q();
    }

    public final androidx.camera.core.impl.J b() {
        androidx.camera.core.impl.J j4;
        synchronized (this.f749b) {
            j4 = this.f757k;
        }
        return j4;
    }

    public final androidx.camera.core.impl.F c() {
        synchronized (this.f749b) {
            try {
                androidx.camera.core.impl.J j4 = this.f757k;
                if (j4 == null) {
                    return androidx.camera.core.impl.F.f14874a;
                }
                return j4.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d() {
        androidx.camera.core.impl.J jB = b();
        A2.l.p(jB, "No camera attached to use case: " + this);
        return jB.n().d();
    }

    public abstract T0<?> e(boolean z10, U0 u02);

    public final String f() {
        String strU = this.f753f.u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strU);
        return strU;
    }

    public final int g(androidx.camera.core.impl.J j4, boolean z10) {
        int iJ = j4.n().j(((InterfaceC1698k0) this.f753f).y());
        return (j4.l() || !z10) ? iJ : G.o.h(-iJ);
    }

    public final androidx.camera.core.impl.J h() {
        androidx.camera.core.impl.J j4;
        synchronized (this.f749b) {
            j4 = this.f758l;
        }
        return j4;
    }

    public Set<Integer> i() {
        return Collections.EMPTY_SET;
    }

    public abstract T0.a<?, ?, ?> j(androidx.camera.core.impl.U u8);

    public final boolean k(int i) {
        Iterator<Integer> it = i().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(androidx.camera.core.impl.J j4) {
        int i = ((InterfaceC1698k0) this.f753f).i();
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j4.b();
        }
        throw new AssertionError(C4356c.h(i, "Unknown mirrorMode: "));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.camera.core.impl.U, java.lang.Object] */
    public final T0<?> m(androidx.camera.core.impl.I i, T0<?> t02, T0<?> t03) {
        C1710q0 c1710q0K;
        if (t03 != null) {
            c1710q0K = C1710q0.L(t03);
            c1710q0K.f15118G.remove(J.l.f2690b);
        } else {
            c1710q0K = C1710q0.K();
        }
        C1683d c1683d = InterfaceC1698k0.f15074l;
        ?? r12 = this.f752e;
        boolean zF = r12.f(c1683d);
        TreeMap<U.a<?>, Map<U.b, Object>> treeMap = c1710q0K.f15118G;
        if (zF || r12.f(InterfaceC1698k0.f15078p)) {
            C1683d c1683d2 = InterfaceC1698k0.f15082t;
            if (treeMap.containsKey(c1683d2)) {
                treeMap.remove(c1683d2);
            }
        }
        C1683d c1683d3 = InterfaceC1698k0.f15082t;
        if (r12.f(c1683d3)) {
            C1683d c1683d4 = InterfaceC1698k0.f15080r;
            if (treeMap.containsKey(c1683d4) && ((Q.b) r12.b(c1683d3)).f10851b != null) {
                treeMap.remove(c1683d4);
            }
        }
        Iterator<U.a<?>> it = r12.l().iterator();
        while (it.hasNext()) {
            B8.n(c1710q0K, c1710q0K, r12, it.next());
        }
        if (t02 != null) {
            for (U.a<?> aVar : t02.l()) {
                if (!aVar.b().equals(J.l.f2690b.f15010a)) {
                    B8.n(c1710q0K, c1710q0K, t02, aVar);
                }
            }
        }
        if (treeMap.containsKey(InterfaceC1698k0.f15078p)) {
            C1683d c1683d5 = InterfaceC1698k0.f15074l;
            if (treeMap.containsKey(c1683d5)) {
                treeMap.remove(c1683d5);
            }
        }
        C1683d c1683d6 = InterfaceC1698k0.f15082t;
        if (treeMap.containsKey(c1683d6)) {
            ((Q.b) c1710q0K.b(c1683d6)).getClass();
        }
        return s(i, j(c1710q0K));
    }

    public final void n() {
        this.f750c = a.ACTIVE;
        p();
    }

    public final void o() {
        Iterator it = this.f748a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).c(this);
        }
    }

    public final void p() {
        int iOrdinal = this.f750c.ordinal();
        HashSet hashSet = this.f748a;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((b) it.next()).o(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).h(this);
            }
        }
    }

    public T0<?> s(androidx.camera.core.impl.I i, T0.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    public C1701m v(androidx.camera.core.impl.U u8) {
        L0 l02 = this.f754g;
        if (l02 == null) {
            throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
        }
        C1701m.a aVarF = l02.f();
        aVarF.f15093d = u8;
        return aVarF.a();
    }

    public void y(Matrix matrix) {
        this.f756j = new Matrix(matrix);
    }

    public void z(Rect rect) {
        this.i = rect;
    }

    public void q() {
    }

    public void r() {
    }

    public void t() {
    }

    public void u() {
    }

    public void x() {
    }

    public L0 w(L0 l02, L0 l03) {
        return l02;
    }
}
