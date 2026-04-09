package J;

import C.AbstractC0627n;
import C.C;
import C.InterfaceC0625l;
import C.J;
import C.Q;
import C.S;
import C.W;
import C.m0;
import C.r;
import E.u;
import G.o;
import N7.G8;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.AbstractC1688f0;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C1679b;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1692h0;
import androidx.camera.core.impl.C1696j0;
import androidx.camera.core.impl.C1703n;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.x0;
import androidx.work.s;
import c9.C2099t;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.C5645F;
import v.n0;

/* compiled from: CameraUseCaseAdapter.java */
/* loaded from: classes.dex */
public final class e implements InterfaceC0625l {

    /* renamed from: b, reason: collision with root package name */
    public final J f2655b;

    /* renamed from: c, reason: collision with root package name */
    public final J f2656c;

    /* renamed from: d, reason: collision with root package name */
    public final G f2657d;

    /* renamed from: e, reason: collision with root package name */
    public final U0 f2658e;

    /* renamed from: f, reason: collision with root package name */
    public final J.a f2659f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2660g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2661h;
    public final D.a i;

    /* renamed from: j, reason: collision with root package name */
    public List<AbstractC0627n> f2662j;

    /* renamed from: k, reason: collision with root package name */
    public final B f2663k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2664l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2665m;

    /* renamed from: n, reason: collision with root package name */
    public U f2666n;

    /* renamed from: o, reason: collision with root package name */
    public m0 f2667o;

    /* renamed from: p, reason: collision with root package name */
    public R.c f2668p;

    /* renamed from: q, reason: collision with root package name */
    public final F0 f2669q;

    /* renamed from: r, reason: collision with root package name */
    public final F0 f2670r;

    /* renamed from: s, reason: collision with root package name */
    public final Q f2671s;

    /* renamed from: t, reason: collision with root package name */
    public final Q f2672t;

    /* compiled from: CameraUseCaseAdapter.java */
    public static final class a extends Exception {
    }

    /* compiled from: CameraUseCaseAdapter.java */
    public static abstract class b {
        public abstract AbstractC1688f0 a();

        public abstract String b();
    }

    /* compiled from: CameraUseCaseAdapter.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public T0<?> f2673a;

        /* renamed from: b, reason: collision with root package name */
        public T0<?> f2674b;

        public c() {
            throw null;
        }
    }

    public e(J j4, J j10, F0 f02, F0 f03, D.a aVar, G g10, U0 u02) {
        Q q10 = Q.f652a;
        this.f2660g = new ArrayList();
        this.f2661h = new ArrayList();
        this.f2662j = Collections.EMPTY_LIST;
        this.f2664l = new Object();
        this.f2665m = true;
        this.f2666n = null;
        this.f2655b = j4;
        this.f2656c = j10;
        this.f2671s = q10;
        this.f2672t = q10;
        this.i = aVar;
        this.f2657d = g10;
        this.f2658e = u02;
        B b10 = f02.f14877d;
        this.f2663k = b10;
        ((D.a) b10).J();
        this.f2669q = f02;
        this.f2670r = f03;
        this.f2659f = w(f02, f03);
    }

    public static boolean C(L0 l02, H0 h02) {
        U uC = l02.c();
        C1717u0 c1717u0 = h02.f14884g.f14941b;
        if (uC.l().size() != h02.f14884g.f14941b.l().size()) {
            return true;
        }
        for (U.a<?> aVar : uC.l()) {
            if (!c1717u0.f15118G.containsKey(aVar) || !Objects.equals(c1717u0.b(aVar), uC.b(aVar))) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (m0Var instanceof C.J) {
                T0<?> t02 = m0Var.f753f;
                C1683d c1683d = C1692h0.f15046L;
                if (t02.f(c1683d)) {
                    Integer num = (Integer) t02.b(c1683d);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public static boolean E(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (m0Var != null) {
                if (!m0Var.f753f.f(T0.f14968D)) {
                    Log.e("CameraUseCaseAdapter", m0Var + " UseCase does not have capture type.");
                } else if (m0Var.f753f.A() == U0.b.VIDEO_CAPTURE) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList J(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            m0Var.getClass();
            m0Var.f759m = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC0627n abstractC0627n = (AbstractC0627n) it2.next();
                abstractC0627n.getClass();
                if (m0Var.k(0)) {
                    A2.l.q(m0Var + " already has effect" + m0Var.f759m, m0Var.f759m == null);
                    A2.l.l(m0Var.k(0));
                    m0Var.f759m = abstractC0627n;
                    arrayList2.remove(abstractC0627n);
                }
            }
        }
        return arrayList2;
    }

    public static Matrix q(Rect rect, Size size) {
        A2.l.k("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static C.J t() {
        Object objB;
        Object objB2;
        Object objB3;
        J.b bVar = new J.b();
        C1683d c1683d = l.f2690b;
        C1710q0 c1710q0 = bVar.f648a;
        c1710q0.N(c1683d, "ImageCapture-Extra");
        C1683d c1683d2 = C1692h0.f15045K;
        c1710q0.getClass();
        Object objB4 = null;
        try {
            objB = c1710q0.b(c1683d2);
        } catch (IllegalArgumentException unused) {
            objB = null;
        }
        Integer num = (Integer) objB;
        if (num != null) {
            c1710q0.N(InterfaceC1694i0.f15057j, num);
        } else {
            J.c cVar = C.J.f636z;
            try {
                objB2 = c1710q0.b(C1692h0.f15046L);
            } catch (IllegalArgumentException unused2) {
                objB2 = null;
            }
            if (Objects.equals(objB2, 1)) {
                c1710q0.N(InterfaceC1694i0.f15057j, 4101);
                c1710q0.N(InterfaceC1694i0.f15058k, C.f615c);
            } else {
                c1710q0.N(InterfaceC1694i0.f15057j, 256);
            }
        }
        C1692h0 c1692h0 = new C1692h0(C1717u0.J(c1710q0));
        C1696j0.f(c1692h0);
        C.J j4 = new C.J(c1692h0);
        try {
            objB3 = c1710q0.b(InterfaceC1698k0.f15078p);
        } catch (IllegalArgumentException unused3) {
            objB3 = null;
        }
        Size size = (Size) objB3;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        C1683d c1683d3 = g.f2675a;
        Object objF = u.F();
        try {
            objF = c1710q0.b(c1683d3);
        } catch (IllegalArgumentException unused4) {
        }
        A2.l.p((Executor) objF, "The IO executor can't be null");
        C1683d c1683d4 = C1692h0.f15043I;
        if (c1710q0.f15118G.containsKey(c1683d4)) {
            Integer num2 = (Integer) c1710q0.b(c1683d4);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objB4 = c1710q0.b(C1692h0.f15050P);
                } catch (IllegalArgumentException unused5) {
                }
                if (objB4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return j4;
    }

    public static J.a w(F0 f02, F0 f03) {
        StringBuilder sb = new StringBuilder();
        sb.append(f02.f15020a.d());
        sb.append(f03 == null ? "" : f03.f15020a.d());
        return new J.a(sb.toString(), ((D.a) f02.f14877d).f14873G);
    }

    public static HashMap y(ArrayList arrayList, U0 u02, U0 u03) {
        T0 t0E;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (m0Var instanceof R.c) {
                R.c cVar = (R.c) m0Var;
                x0 x0Var = new x0(C1717u0.J(new W.a().f668a));
                C1696j0.f(x0Var);
                W w10 = new W(x0Var);
                w10.f662q = W.f660x;
                T0<?> t0E2 = w10.e(false, u02);
                if (t0E2 == null) {
                    t0E = null;
                } else {
                    C1710q0 c1710q0L = C1710q0.L(t0E2);
                    c1710q0L.f15118G.remove(l.f2691c);
                    t0E = ((R.d) cVar.j(c1710q0L)).b();
                }
            } else {
                t0E = m0Var.e(false, u02);
            }
            T0<?> t0E3 = m0Var.e(true, u03);
            c cVar2 = new c();
            cVar2.f2673a = t0E;
            cVar2.f2674b = t0E3;
            map.put(m0Var, cVar2);
        }
        return map;
    }

    public final List<m0> A() {
        ArrayList arrayList;
        synchronized (this.f2664l) {
            arrayList = new ArrayList(this.f2660g);
        }
        return arrayList;
    }

    public final boolean B() {
        boolean z10;
        synchronized (this.f2664l) {
            z10 = ((D.a) this.f2663k).J() != null;
        }
        return z10;
    }

    public final boolean F() {
        boolean z10;
        synchronized (this.f2664l) {
            D.a aVar = (D.a) this.f2663k;
            aVar.getClass();
            z10 = ((Integer) ((C1717u0) aVar.getConfig()).o(B.f14868f, 0)).intValue() == 1;
        }
        return z10;
    }

    public final void G(ArrayList arrayList) {
        synchronized (this.f2664l) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f2660g);
            linkedHashSet.removeAll(arrayList);
            L(linkedHashSet, this.f2656c != null);
        }
    }

    public final void H() {
        synchronized (this.f2664l) {
            try {
                if (this.f2666n != null) {
                    this.f2655b.f().c(this.f2666n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I() {
        C2099t c2099t = C2099t.f18581b;
        synchronized (this.f2664l) {
            this.f2662j = c2099t;
        }
    }

    public final void K() {
        synchronized (this.f2664l) {
        }
    }

    public final void L(LinkedHashSet linkedHashSet, boolean z10) {
        L0 l02;
        U uC;
        synchronized (this.f2664l) {
            try {
                s(linkedHashSet);
                if (!z10 && B() && E(linkedHashSet)) {
                    L(linkedHashSet, true);
                    return;
                }
                R.c cVarU = u(linkedHashSet, z10);
                m0 m0VarP = p(linkedHashSet, cVarU);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (m0VarP != null) {
                    arrayList.add(m0VarP);
                }
                if (cVarU != null) {
                    arrayList.add(cVarU);
                    arrayList.removeAll(cVarU.f11566q.f11584b);
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.f2661h);
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.f2661h);
                ArrayList arrayList4 = new ArrayList(this.f2661h);
                arrayList4.removeAll(arrayList);
                D.a aVar = (D.a) this.f2663k;
                aVar.getClass();
                HashMap mapY = y(arrayList2, (U0) ((C1717u0) aVar.getConfig()).o(B.f14867e, U0.f14976a), this.f2658e);
                Map mapR = Collections.EMPTY_MAP;
                try {
                    HashMap mapR2 = r(x(), this.f2655b.n(), arrayList2, arrayList3, mapY);
                    if (this.f2656c != null) {
                        int iX = x();
                        androidx.camera.core.impl.J j4 = this.f2656c;
                        Objects.requireNonNull(j4);
                        mapR = r(iX, j4.n(), arrayList2, arrayList3, mapY);
                    }
                    M(mapR2, arrayList);
                    ArrayList arrayListJ = J(this.f2662j, arrayList);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListJ2 = J(arrayListJ, arrayList5);
                    if (arrayListJ2.size() > 0) {
                        S.g("CameraUseCaseAdapter", "Unused effects: " + arrayListJ2);
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((m0) it.next()).A(this.f2655b);
                    }
                    this.f2655b.j(arrayList4);
                    if (this.f2656c != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            m0 m0Var = (m0) it2.next();
                            androidx.camera.core.impl.J j10 = this.f2656c;
                            Objects.requireNonNull(j10);
                            m0Var.A(j10);
                        }
                        androidx.camera.core.impl.J j11 = this.f2656c;
                        Objects.requireNonNull(j11);
                        j11.j(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            m0 m0Var2 = (m0) it3.next();
                            if (mapR2.containsKey(m0Var2) && (uC = (l02 = (L0) mapR2.get(m0Var2)).c()) != null && C(l02, m0Var2.f760n)) {
                                m0Var2.f754g = m0Var2.v(uC);
                                if (this.f2665m) {
                                    this.f2655b.p(m0Var2);
                                    androidx.camera.core.impl.J j12 = this.f2656c;
                                    if (j12 != null) {
                                        j12.p(m0Var2);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        m0 m0Var3 = (m0) it4.next();
                        c cVar = (c) mapY.get(m0Var3);
                        Objects.requireNonNull(cVar);
                        androidx.camera.core.impl.J j13 = this.f2656c;
                        if (j13 != null) {
                            m0Var3.a(this.f2655b, j13, cVar.f2673a, cVar.f2674b);
                            L0 l03 = (L0) mapR2.get(m0Var3);
                            l03.getClass();
                            m0Var3.f754g = m0Var3.w(l03, (L0) mapR.get(m0Var3));
                        } else {
                            m0Var3.a(this.f2655b, null, cVar.f2673a, cVar.f2674b);
                            L0 l04 = (L0) mapR2.get(m0Var3);
                            l04.getClass();
                            m0Var3.f754g = m0Var3.w(l04, null);
                        }
                    }
                    if (this.f2665m) {
                        this.f2655b.k(arrayList2);
                        androidx.camera.core.impl.J j14 = this.f2656c;
                        if (j14 != null) {
                            j14.k(arrayList2);
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ((m0) it5.next()).p();
                    }
                    this.f2660g.clear();
                    this.f2660g.addAll(linkedHashSet);
                    this.f2661h.clear();
                    this.f2661h.addAll(arrayList);
                    this.f2667o = m0VarP;
                    this.f2668p = cVarU;
                } catch (IllegalArgumentException e4) {
                    if (z10 || B() || ((A.a) this.i).f4e == 2) {
                        throw e4;
                    }
                    L(linkedHashSet, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void M(HashMap map, ArrayList arrayList) {
        synchronized (this.f2664l) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    Rect rectD = this.f2655b.f().d();
                    L0 l02 = (L0) map.get(m0Var);
                    l02.getClass();
                    m0Var.y(q(rectD, l02.d()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // C.InterfaceC0625l
    public final r a() {
        return this.f2669q;
    }

    public final void c(Collection<m0> collection) throws a {
        synchronized (this.f2664l) {
            try {
                this.f2655b.d(this.f2663k);
                androidx.camera.core.impl.J j4 = this.f2656c;
                if (j4 != null) {
                    j4.d(this.f2663k);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f2660g);
                linkedHashSet.addAll(collection);
                try {
                    L(linkedHashSet, this.f2656c != null);
                } catch (IllegalArgumentException e4) {
                    throw new a(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f2664l) {
            try {
                if (!this.f2665m) {
                    if (!this.f2661h.isEmpty()) {
                        this.f2655b.d(this.f2663k);
                        androidx.camera.core.impl.J j4 = this.f2656c;
                        if (j4 != null) {
                            j4.d(this.f2663k);
                        }
                    }
                    this.f2655b.k(this.f2661h);
                    androidx.camera.core.impl.J j10 = this.f2656c;
                    if (j10 != null) {
                        j10.k(this.f2661h);
                    }
                    H();
                    Iterator it = this.f2661h.iterator();
                    while (it.hasNext()) {
                        ((m0) it.next()).p();
                    }
                    this.f2665m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        synchronized (this.f2664l) {
            F f10 = this.f2655b.f();
            this.f2666n = f10.i();
            f10.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final C.m0 p(java.util.LinkedHashSet r8, R.c r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2664l
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L18
            r1.add(r9)     // Catch: java.lang.Throwable -> L15
            R.h r8 = r9.f11566q     // Catch: java.lang.Throwable -> L15
            java.util.HashSet r8 = r8.f11584b     // Catch: java.lang.Throwable -> L15
            r1.removeAll(r8)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r8 = move-exception
            goto Lb2
        L18:
            boolean r8 = r7.F()     // Catch: java.lang.Throwable -> L15
            if (r8 == 0) goto Laf
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L15
            r9 = 0
            r2 = r9
            r3 = r2
        L25:
            boolean r4 = r8.hasNext()     // Catch: java.lang.Throwable -> L15
            r5 = 1
            if (r4 == 0) goto L43
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L15
            C.m0 r4 = (C.m0) r4     // Catch: java.lang.Throwable -> L15
            boolean r6 = r4 instanceof C.W     // Catch: java.lang.Throwable -> L15
            if (r6 != 0) goto L41
            boolean r6 = r4 instanceof R.c     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L3b
            goto L41
        L3b:
            boolean r4 = r4 instanceof C.J     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L25
            r2 = r5
            goto L25
        L41:
            r3 = r5
            goto L25
        L43:
            if (r2 == 0) goto L7d
            if (r3 != 0) goto L7d
            C.m0 r8 = r7.f2667o     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof C.W     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto L4e
            goto Lb0
        L4e:
            C.W$a r8 = new C.W$a     // Catch: java.lang.Throwable -> L15
            r8.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r9 = "Preview-Extra"
            androidx.camera.core.impl.d r1 = J.l.f2690b     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.q0 r2 = r8.f668a     // Catch: java.lang.Throwable -> L15
            r2.N(r1, r9)     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.x0 r9 = new androidx.camera.core.impl.x0     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.q0 r8 = r8.f668a     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.u0 r8 = androidx.camera.core.impl.C1717u0.J(r8)     // Catch: java.lang.Throwable -> L15
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L15
            androidx.camera.core.impl.C1696j0.f(r9)     // Catch: java.lang.Throwable -> L15
            C.W r8 = new C.W     // Catch: java.lang.Throwable -> L15
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L15
            H.c r9 = C.W.f660x     // Catch: java.lang.Throwable -> L15
            r8.f662q = r9     // Catch: java.lang.Throwable -> L15
            B4.g r9 = new B4.g     // Catch: java.lang.Throwable -> L15
            r1 = 3
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r8.D(r9)     // Catch: java.lang.Throwable -> L15
            goto Lb0
        L7d:
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L15
            r1 = r9
        L82:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L15
            C.m0 r2 = (C.m0) r2     // Catch: java.lang.Throwable -> L15
            boolean r3 = r2 instanceof C.W     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L9d
            boolean r3 = r2 instanceof R.c     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L97
            goto L9d
        L97:
            boolean r2 = r2 instanceof C.J     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L82
            r1 = r5
            goto L82
        L9d:
            r9 = r5
            goto L82
        L9f:
            if (r9 == 0) goto Laf
            if (r1 != 0) goto Laf
            C.m0 r8 = r7.f2667o     // Catch: java.lang.Throwable -> L15
            boolean r9 = r8 instanceof C.J     // Catch: java.lang.Throwable -> L15
            if (r9 == 0) goto Laa
            goto Lb0
        Laa:
            C.J r8 = t()     // Catch: java.lang.Throwable -> L15
            goto Lb0
        Laf:
            r8 = 0
        Lb0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r8
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J.e.p(java.util.LinkedHashSet, R.c):C.m0");
    }

    public final HashMap r(int i, I i10, ArrayList arrayList, ArrayList arrayList2, HashMap map) throws NumberFormatException {
        G g10;
        Rect rectD;
        ArrayList arrayList3 = new ArrayList();
        String strD = i10.d();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            g10 = this.f2657d;
            if (!zHasNext) {
                break;
            }
            m0 m0Var = (m0) it.next();
            int iH = m0Var.f753f.h();
            L0 l02 = m0Var.f754g;
            Size sizeD = l02 != null ? l02.d() : null;
            n0 n0Var = (n0) ((C5645F) g10).f46613a.get(strD);
            C1703n c1703nF = n0Var != null ? N0.f(i, iH, sizeD, n0Var.i(iH)) : null;
            int iH2 = m0Var.f753f.h();
            L0 l03 = m0Var.f754g;
            if (l03 != null) {
                sizeD = l03.d();
            }
            Size size = sizeD;
            L0 l04 = m0Var.f754g;
            l04.getClass();
            C1679b c1679b = new C1679b(c1703nF, iH2, size, l04.a(), R.c.G(m0Var), m0Var.f754g.c(), m0Var.f753f.e());
            arrayList3.add(c1679b);
            map3.put(c1679b, m0Var);
            map2.put(m0Var, m0Var.f754g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectD = this.f2655b.f().d();
            } catch (NullPointerException unused) {
                rectD = null;
            }
            j jVar = new j(i10, rectD != null ? o.e(rectD) : null);
            Iterator it2 = arrayList.iterator();
            boolean z10 = false;
            while (it2.hasNext()) {
                m0 m0Var2 = (m0) it2.next();
                c cVar = (c) map.get(m0Var2);
                T0<?> t0M = m0Var2.m(i10, cVar.f2673a, cVar.f2674b);
                map4.put(t0M, m0Var2);
                map5.put(t0M, jVar.b(t0M));
                T0<?> t02 = m0Var2.f753f;
                if (t02 instanceof x0) {
                    x0 x0Var = (x0) t02;
                    x0Var.getClass();
                    z10 = G8.i(x0Var) == 2;
                }
            }
            boolean zE = E(arrayList);
            C5645F c5645f = (C5645F) g10;
            c5645f.getClass();
            A2.l.k("No new use cases to be bound.", !map5.isEmpty());
            n0 n0Var2 = (n0) c5645f.f46613a.get(strD);
            if (n0Var2 == null) {
                throw new IllegalArgumentException(s.d("No such camera id in supported combination list: ", strD));
            }
            Pair pairG = n0Var2.g(i, arrayList3, map5, z10, zE);
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((m0) entry.getValue(), (L0) ((Map) pairG.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairG.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((m0) map3.get(entry2.getKey()), (L0) entry2.getValue());
                }
            }
        }
        return map2;
    }

    public final void s(LinkedHashSet linkedHashSet) throws IllegalArgumentException {
        if (B()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C cA = ((m0) it.next()).f753f.a();
                boolean z10 = false;
                boolean z11 = cA.f622b == 10;
                int i = cA.f621a;
                if (i != 1 && i != 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
                }
            }
            if (D(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f2664l) {
            try {
                if (!this.f2662j.isEmpty() && D(linkedHashSet)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    public final R.c u(LinkedHashSet linkedHashSet, boolean z10) {
        synchronized (this.f2664l) {
            try {
                HashSet hashSetZ = z(linkedHashSet, z10);
                if (hashSetZ.size() < 2 && (!B() || !E(hashSetZ))) {
                    return null;
                }
                R.c cVar = this.f2668p;
                if (cVar != null && cVar.f11566q.f11584b.equals(hashSetZ)) {
                    R.c cVar2 = this.f2668p;
                    Objects.requireNonNull(cVar2);
                    return cVar2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = hashSetZ.iterator();
                while (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    for (int i = 0; i < 3; i++) {
                        int i10 = iArr[i];
                        if (m0Var.k(i10)) {
                            if (hashSet.contains(Integer.valueOf(i10))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i10));
                        }
                    }
                }
                return new R.c(this.f2655b, this.f2656c, this.f2671s, this.f2672t, hashSetZ, this.f2658e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        synchronized (this.f2664l) {
            try {
                if (this.f2665m) {
                    this.f2655b.j(new ArrayList(this.f2661h));
                    androidx.camera.core.impl.J j4 = this.f2656c;
                    if (j4 != null) {
                        j4.j(new ArrayList(this.f2661h));
                    }
                    o();
                    this.f2665m = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int x() {
        synchronized (this.f2664l) {
            try {
                return ((A.a) this.i).f4e == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet z(LinkedHashSet linkedHashSet, boolean z10) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f2664l) {
            try {
                Iterator<AbstractC0627n> it = this.f2662j.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                i = z10 ? 3 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            m0 m0Var = (m0) it2.next();
            A2.l.k("Only support one level of sharing for now.", !(m0Var instanceof R.c));
            if (m0Var.k(i)) {
                hashSet.add(m0Var);
            }
        }
        return hashSet;
    }
}
