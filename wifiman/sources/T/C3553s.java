package T;

import T.H;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import d0.AbstractC5280l;
import d0.InterfaceC5279k;
import dh.InterfaceC5384i;
import e0.InterfaceC5410c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import o.C7009H;
import o.C7033y;
import org.snmp4j.mp.PduHandle;

/* renamed from: T.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3553s implements E, U0, M0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3550q f21217a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3526f f21218b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f21219c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21220d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f21221e;

    /* renamed from: f, reason: collision with root package name */
    private final C3516b1 f21222f;

    /* renamed from: g, reason: collision with root package name */
    private final V.f f21223g;

    /* renamed from: h, reason: collision with root package name */
    private final o.I f21224h;

    /* renamed from: i, reason: collision with root package name */
    private final o.I f21225i;

    /* renamed from: j, reason: collision with root package name */
    private final V.f f21226j;

    /* renamed from: k, reason: collision with root package name */
    private final U.a f21227k;

    /* renamed from: l, reason: collision with root package name */
    private final U.a f21228l;

    /* renamed from: m, reason: collision with root package name */
    private final V.f f21229m;

    /* renamed from: n, reason: collision with root package name */
    private V.f f21230n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21231o;

    /* renamed from: p, reason: collision with root package name */
    private C3553s f21232p;

    /* renamed from: q, reason: collision with root package name */
    private int f21233q;

    /* renamed from: r, reason: collision with root package name */
    private final C3567z f21234r;

    /* renamed from: s, reason: collision with root package name */
    private final C3542m f21235s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC5384i f21236t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f21237u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21238v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC6839p f21239w;

    /* renamed from: T.s$a */
    private static final class a implements R0 {

        /* renamed from: a, reason: collision with root package name */
        private final Set f21240a;

        /* renamed from: e, reason: collision with root package name */
        private o.I f21244e;

        /* renamed from: b, reason: collision with root package name */
        private final List f21241b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f21242c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private final List f21243d = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List f21245f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private final C7033y f21246g = new C7033y(0, 1, null);

        /* renamed from: h, reason: collision with root package name */
        private final C7033y f21247h = new C7033y(0, 1, null);

        public a(Set set) {
            this.f21240a = set;
        }

        private final void i(int i10) {
            if (this.f21245f.isEmpty()) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            List listR = null;
            C7033y c7033y = null;
            C7033y c7033y2 = null;
            while (i12 < this.f21247h.b()) {
                if (i10 <= this.f21247h.a(i12)) {
                    Object objRemove = this.f21245f.remove(i12);
                    int iL = this.f21247h.l(i12);
                    int iL2 = this.f21246g.l(i12);
                    if (listR == null) {
                        listR = AbstractC3689v.r(objRemove);
                        c7033y2 = new C7033y(0, 1, null);
                        c7033y2.h(iL);
                        c7033y = new C7033y(0, 1, null);
                        c7033y.h(iL2);
                    } else {
                        AbstractC6492s.g(c7033y, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        AbstractC6492s.g(c7033y2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        listR.add(objRemove);
                        c7033y2.h(iL);
                        c7033y.h(iL2);
                    }
                } else {
                    i12++;
                }
            }
            if (listR != null) {
                AbstractC6492s.g(c7033y, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                AbstractC6492s.g(c7033y2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = listR.size() - 1;
                while (i11 < size) {
                    int i13 = i11 + 1;
                    int size2 = listR.size();
                    for (int i14 = i13; i14 < size2; i14++) {
                        int iA = c7033y2.a(i11);
                        int iA2 = c7033y2.a(i14);
                        if (iA < iA2 || (iA2 == iA && c7033y.a(i11) < c7033y.a(i14))) {
                            AbstractC3555t.f(listR, i11, i14);
                            AbstractC3555t.g(c7033y, i11, i14);
                            AbstractC3555t.g(c7033y2, i11, i14);
                        }
                    }
                    i11 = i13;
                }
                this.f21242c.addAll(listR);
            }
        }

        private final void j(Object obj, int i10, int i11, int i12) {
            i(i10);
            if (i12 < 0 || i12 >= i10) {
                this.f21242c.add(obj);
                return;
            }
            this.f21245f.add(obj);
            this.f21246g.h(i11);
            this.f21247h.h(i12);
        }

        @Override // T.R0
        public void a(InterfaceC3538k interfaceC3538k, int i10, int i11, int i12) {
            j(interfaceC3538k, i10, i11, i12);
        }

        @Override // T.R0
        public void b(InterfaceC3538k interfaceC3538k, int i10, int i11, int i12) {
            o.I iA = this.f21244e;
            if (iA == null) {
                iA = o.U.a();
                this.f21244e = iA;
            }
            iA.v(interfaceC3538k);
            j(interfaceC3538k, i10, i11, i12);
        }

        @Override // T.R0
        public void c(S0 s02, int i10, int i11, int i12) {
            j(s02, i10, i11, i12);
        }

        @Override // T.R0
        public void d(InterfaceC6824a interfaceC6824a) {
            this.f21243d.add(interfaceC6824a);
        }

        @Override // T.R0
        public void e(S0 s02) {
            this.f21241b.add(s02);
        }

        public final void f() {
            if (this.f21240a.isEmpty()) {
                return;
            }
            Object objA = D1.f20843a.a("Compose:abandons");
            try {
                Iterator it = this.f21240a.iterator();
                while (it.hasNext()) {
                    S0 s02 = (S0) it.next();
                    it.remove();
                    s02.b();
                }
                Yg.J j10 = Yg.J.f24997a;
                D1.f20843a.b(objA);
            } catch (Throwable th2) {
                D1.f20843a.b(objA);
                throw th2;
            }
        }

        public final void g() {
            Object objA;
            i(PduHandle.NONE);
            if (!this.f21242c.isEmpty()) {
                objA = D1.f20843a.a("Compose:onForgotten");
                try {
                    o.I i10 = this.f21244e;
                    for (int size = this.f21242c.size() - 1; -1 < size; size--) {
                        Object obj = this.f21242c.get(size);
                        if (obj instanceof S0) {
                            this.f21240a.remove(obj);
                            ((S0) obj).c();
                        }
                        if (obj instanceof InterfaceC3538k) {
                            if (i10 == null || !i10.a(obj)) {
                                ((InterfaceC3538k) obj).h();
                            } else {
                                ((InterfaceC3538k) obj).f();
                            }
                        }
                    }
                    Yg.J j10 = Yg.J.f24997a;
                    D1.f20843a.b(objA);
                } finally {
                }
            }
            if (this.f21241b.isEmpty()) {
                return;
            }
            objA = D1.f20843a.a("Compose:onRemembered");
            try {
                List list = this.f21241b;
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    S0 s02 = (S0) list.get(i11);
                    this.f21240a.remove(s02);
                    s02.d();
                }
                Yg.J j11 = Yg.J.f24997a;
                D1.f20843a.b(objA);
            } finally {
            }
        }

        public final void h() {
            if (this.f21243d.isEmpty()) {
                return;
            }
            Object objA = D1.f20843a.a("Compose:sideeffects");
            try {
                List list = this.f21243d;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC6824a) list.get(i10)).invoke();
                }
                this.f21243d.clear();
                Yg.J j10 = Yg.J.f24997a;
                D1.f20843a.b(objA);
            } catch (Throwable th2) {
                D1.f20843a.b(objA);
                throw th2;
            }
        }
    }

    public C3553s(AbstractC3550q abstractC3550q, InterfaceC3526f interfaceC3526f, InterfaceC5384i interfaceC5384i) {
        this.f21217a = abstractC3550q;
        this.f21218b = interfaceC3526f;
        this.f21219c = new AtomicReference(null);
        this.f21220d = new Object();
        Set setL = new o.I(0, 1, null).l();
        this.f21221e = setL;
        C3516b1 c3516b1 = new C3516b1();
        if (abstractC3550q.c()) {
            c3516b1.i();
        }
        if (abstractC3550q.e()) {
            c3516b1.j();
        }
        this.f21222f = c3516b1;
        this.f21223g = new V.f();
        this.f21224h = new o.I(0, 1, null);
        this.f21225i = new o.I(0, 1, null);
        this.f21226j = new V.f();
        U.a aVar = new U.a();
        this.f21227k = aVar;
        U.a aVar2 = new U.a();
        this.f21228l = aVar2;
        this.f21229m = new V.f();
        this.f21230n = new V.f();
        this.f21234r = new C3567z(null, false, 3, null);
        C3542m c3542m = new C3542m(interfaceC3526f, abstractC3550q, c3516b1, setL, aVar, aVar2, this);
        abstractC3550q.n(c3542m);
        this.f21235s = c3542m;
        this.f21236t = interfaceC5384i;
        this.f21237u = abstractC3550q instanceof N0;
        this.f21239w = C3534i.f21089a.a();
    }

    private final void A(InterfaceC6839p interfaceC6839p) {
        if (this.f21238v) {
            B0.b("The composition is disposed");
        }
        this.f21239w = interfaceC6839p;
        this.f21217a.a(this, interfaceC6839p);
    }

    private final void B() {
        Object andSet = this.f21219c.getAndSet(AbstractC3555t.f21251a);
        if (andSet != null) {
            if (AbstractC6492s.d(andSet, AbstractC3555t.f21251a)) {
                AbstractC3546o.s("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                x((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC3546o.s("corrupt pendingModifications drain: " + this.f21219c);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                x(set, true);
            }
        }
    }

    private final void C() {
        Object andSet = this.f21219c.getAndSet(null);
        if (AbstractC6492s.d(andSet, AbstractC3555t.f21251a)) {
            return;
        }
        if (andSet instanceof Set) {
            x((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                x(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC3546o.s("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        AbstractC3546o.s("corrupt pendingModifications drain: " + this.f21219c);
        throw new KotlinNothingValueException();
    }

    private final boolean D() {
        return this.f21235s.E0();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: all -> 0x001e, EDGE_INSN: B:65:0x00ab->B:51:0x00ab BREAK  A[LOOP:0: B:32:0x0064->B:47:0x00a3], EDGE_INSN: B:66:0x00ab->B:51:0x00ab BREAK  A[LOOP:0: B:32:0x0064->B:47:0x00a3], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0054, B:29:0x0058, B:32:0x0064, B:34:0x0074, B:36:0x0080, B:38:0x008a, B:43:0x0099, B:47:0x00a3, B:48:0x00a6, B:51:0x00ab), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final T.Y F(T.K0 r21, T.C3520d r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3553s.F(T.K0, T.d, java.lang.Object):T.Y");
    }

    private final void G(Object obj) {
        Object objC = this.f21223g.d().c(obj);
        if (objC == null) {
            return;
        }
        if (!(objC instanceof o.I)) {
            K0 k02 = (K0) objC;
            if (k02.s(obj) == Y.IMMINENT) {
                this.f21229m.a(obj, k02);
                return;
            }
            return;
        }
        o.I i10 = (o.I) objC;
        Object[] objArr = i10.f54929b;
        long[] jArr = i10.f54928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        K0 k03 = (K0) objArr[(i11 << 3) + i13];
                        if (k03.s(obj) == Y.IMMINENT) {
                            this.f21229m.a(obj, k03);
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    private final InterfaceC5410c H() {
        C3567z c3567z = this.f21234r;
        if (c3567z.b()) {
            c3567z.a();
        } else {
            C3567z c3567zI = this.f21217a.i();
            if (c3567zI != null) {
                c3567zI.a();
            }
            c3567z.a();
            if (!AbstractC6492s.d(null, null)) {
                c3567z.c(null);
            }
        }
        return null;
    }

    private final V.f K() {
        V.f fVar = this.f21230n;
        this.f21230n = new V.f();
        return fVar;
    }

    private final boolean L(K0 k02, Object obj) {
        return l() && this.f21235s.s1(k02, obj);
    }

    private final void p(Object obj, boolean z10) {
        Object objC = this.f21223g.d().c(obj);
        if (objC == null) {
            return;
        }
        if (!(objC instanceof o.I)) {
            K0 k02 = (K0) objC;
            if (this.f21229m.f(obj, k02) || k02.s(obj) == Y.IGNORED) {
                return;
            }
            if (!k02.t() || z10) {
                this.f21224h.h(k02);
                return;
            } else {
                this.f21225i.h(k02);
                return;
            }
        }
        o.I i10 = (o.I) objC;
        Object[] objArr = i10.f54929b;
        long[] jArr = i10.f54928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        K0 k03 = (K0) objArr[(i11 << 3) + i13];
                        if (!this.f21229m.f(obj, k03) && k03.s(obj) != Y.IGNORED) {
                            if (!k03.t() || z10) {
                                this.f21224h.h(k03);
                            } else {
                                this.f21225i.h(k03);
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180 A[EDGE_INSN: B:69:0x0180->B:221:0x0111 BREAK  A[LOOP:13: B:59:0x0146->B:70:0x0182]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x(java.util.Set r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3553s.x(java.util.Set, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y(U.a r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3553s.y(U.a):void");
    }

    private final void z() {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        boolean zD;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        C7009H c7009hD = this.f21226j.d();
        long[] jArr5 = c7009hD.f54921a;
        int length = jArr5.length - 2;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j11 = jArr5[i15];
                if ((((~j11) << c10) & j11 & j10) != j10) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = c7009hD.f54922b[i18];
                            Object obj2 = c7009hD.f54923c[i18];
                            if (obj2 instanceof o.I) {
                                AbstractC6492s.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                o.I i19 = (o.I) obj2;
                                Object[] objArr2 = i19.f54929b;
                                long[] jArr6 = i19.f54928a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i11 = length;
                                if (length2 >= 0) {
                                    int i20 = 0;
                                    while (true) {
                                        long j12 = jArr6[i20];
                                        i12 = i15;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                            int i22 = 0;
                                            while (i22 < i21) {
                                                int i23 = i22;
                                                Object[] objArr4 = objArr3;
                                                if ((j12 & 255) < 128) {
                                                    int i24 = (i20 << 3) + i23;
                                                    jArr4 = jArr6;
                                                    if (!this.f21223g.c((H) objArr4[i24])) {
                                                        i19.y(i24);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j12 >>= 8;
                                                i22 = i23 + 1;
                                                jArr6 = jArr4;
                                                objArr3 = objArr4;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i21 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i20 == length2) {
                                            break;
                                        }
                                        i20++;
                                        jArr6 = jArr3;
                                        objArr2 = objArr;
                                        i15 = i12;
                                        c10 = 7;
                                    }
                                } else {
                                    i12 = i15;
                                }
                                zD = i19.d();
                            } else {
                                jArr2 = jArr5;
                                i11 = length;
                                i12 = i15;
                                AbstractC6492s.g(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                zD = !this.f21223g.c((H) obj2);
                            }
                            if (zD) {
                                c7009hD.q(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i11 = length;
                            i12 = i15;
                            i13 = i14;
                        }
                        j11 >>= i13;
                        i17++;
                        i14 = i13;
                        jArr5 = jArr2;
                        length = i11;
                        i15 = i12;
                        c10 = 7;
                    }
                    jArr = jArr5;
                    int i25 = length;
                    int i26 = i15;
                    if (i16 != i14) {
                        break;
                    }
                    length = i25;
                    i10 = i26;
                } else {
                    jArr = jArr5;
                    i10 = i15;
                }
                if (i10 == length) {
                    break;
                }
                i15 = i10 + 1;
                jArr5 = jArr;
                c10 = 7;
                j10 = -9187201950435737472L;
                i14 = 8;
            }
        }
        if (!this.f21225i.e()) {
            return;
        }
        o.I i27 = this.f21225i;
        Object[] objArr5 = i27.f54929b;
        long[] jArr7 = i27.f54928a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i28 = 0;
        while (true) {
            long j13 = jArr7[i28];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i29 = 8 - ((~(i28 - length3)) >>> 31);
                for (int i30 = 0; i30 < i29; i30++) {
                    if ((j13 & 255) < 128) {
                        int i31 = (i28 << 3) + i30;
                        if (!((K0) objArr5[i31]).t()) {
                            i27.y(i31);
                        }
                    }
                    j13 >>= 8;
                }
                if (i29 != 8) {
                    return;
                }
            }
            if (i28 == length3) {
                return;
            } else {
                i28++;
            }
        }
    }

    public final C3567z E() {
        return this.f21234r;
    }

    public final void I(H h10) {
        if (this.f21223g.c(h10)) {
            return;
        }
        this.f21226j.g(h10);
    }

    public final void J(Object obj, K0 k02) {
        this.f21223g.f(obj, k02);
    }

    @Override // T.E, T.M0
    public void a(Object obj) {
        K0 k0G0;
        long[] jArr;
        long[] jArr2;
        int i10;
        if (D() || (k0G0 = this.f21235s.G0()) == null) {
            return;
        }
        k0G0.H(true);
        if (k0G0.w(obj)) {
            return;
        }
        if (obj instanceof AbstractC5280l) {
            ((AbstractC5280l) obj).q(androidx.compose.runtime.snapshots.e.a(1));
        }
        this.f21223g.a(obj, k0G0);
        if (obj instanceof H) {
            H h10 = (H) obj;
            H.a aVarO = h10.o();
            this.f21226j.g(obj);
            o.K kB = aVarO.b();
            Object[] objArr = kB.f54905b;
            long[] jArr3 = kB.f54904a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr3[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                InterfaceC5279k interfaceC5279k = (InterfaceC5279k) objArr[(i11 << 3) + i14];
                                if (interfaceC5279k instanceof AbstractC5280l) {
                                    jArr2 = jArr3;
                                    ((AbstractC5280l) interfaceC5279k).q(androidx.compose.runtime.snapshots.e.a(1));
                                } else {
                                    jArr2 = jArr3;
                                }
                                this.f21226j.a(interfaceC5279k, obj);
                                i10 = 8;
                            } else {
                                jArr2 = jArr3;
                                i10 = i12;
                            }
                            j10 >>= i10;
                            i14++;
                            i12 = i10;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    jArr3 = jArr;
                }
            }
            k0G0.v(h10, aVarO.a());
        }
    }

    @Override // T.E
    public void b(InterfaceC6824a interfaceC6824a) {
        this.f21235s.U0(interfaceC6824a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // T.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(java.util.Set r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof V.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            V.d r15 = (V.d) r15
            o.T r15 = r15.b()
            java.lang.Object[] r0 = r15.f54929b
            long[] r15 = r15.f54928a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            V.f r11 = r14.f21223g
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L50
            V.f r11 = r14.f21226j
            boolean r10 = r11.c(r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            V.f r3 = r14.f21223g
            boolean r3 = r3.c(r0)
            if (r3 != 0) goto L7c
            V.f r3 = r14.f21226j
            boolean r0 = r3.c(r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3553s.c(java.util.Set):boolean");
    }

    @Override // T.E
    public void d() {
        synchronized (this.f21220d) {
            try {
                if (this.f21228l.d()) {
                    y(this.f21228l);
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f21221e.isEmpty()) {
                            new a(this.f21221e).f();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        s();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // T.U0
    public void deactivate() {
        synchronized (this.f21220d) {
            try {
                boolean z10 = this.f21222f.v() > 0;
                if (z10 || !this.f21221e.isEmpty()) {
                    D1 d12 = D1.f20843a;
                    Object objA = d12.a("Compose:deactivate");
                    try {
                        a aVar = new a(this.f21221e);
                        if (z10) {
                            this.f21218b.e();
                            C3525e1 c3525e1G = this.f21222f.G();
                            try {
                                AbstractC3546o.t(c3525e1G, aVar);
                                Yg.J j10 = Yg.J.f24997a;
                                c3525e1G.L(true);
                                this.f21218b.i();
                                aVar.g();
                            } catch (Throwable th2) {
                                c3525e1G.L(false);
                                throw th2;
                            }
                        }
                        aVar.f();
                        Yg.J j11 = Yg.J.f24997a;
                        d12.b(objA);
                    } catch (Throwable th3) {
                        D1.f20843a.b(objA);
                        throw th3;
                    }
                }
                this.f21223g.b();
                this.f21226j.b();
                this.f21230n.b();
                this.f21227k.a();
                this.f21228l.a();
                this.f21235s.r0();
                Yg.J j12 = Yg.J.f24997a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // T.InterfaceC3548p
    public void dispose() {
        synchronized (this.f21220d) {
            try {
                if (this.f21235s.P0()) {
                    B0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f21238v) {
                    this.f21238v = true;
                    this.f21239w = C3534i.f21089a.b();
                    U.a aVarH0 = this.f21235s.H0();
                    if (aVarH0 != null) {
                        y(aVarH0);
                    }
                    boolean z10 = this.f21222f.v() > 0;
                    if (z10 || !this.f21221e.isEmpty()) {
                        a aVar = new a(this.f21221e);
                        if (z10) {
                            this.f21218b.e();
                            C3525e1 c3525e1G = this.f21222f.G();
                            try {
                                AbstractC3546o.K(c3525e1G, aVar);
                                Yg.J j10 = Yg.J.f24997a;
                                c3525e1G.L(true);
                                this.f21218b.clear();
                                this.f21218b.i();
                                aVar.g();
                            } catch (Throwable th2) {
                                c3525e1G.L(false);
                                throw th2;
                            }
                        }
                        aVar.f();
                    }
                    this.f21235s.s0();
                }
                Yg.J j11 = Yg.J.f24997a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f21217a.r(this);
    }

    @Override // T.InterfaceC3548p
    public void e(InterfaceC6839p interfaceC6839p) {
        A(interfaceC6839p);
    }

    @Override // T.E
    public Object f(E e10, int i10, InterfaceC6824a interfaceC6824a) {
        if (e10 == null || AbstractC6492s.d(e10, this) || i10 < 0) {
            return interfaceC6824a.invoke();
        }
        this.f21232p = (C3553s) e10;
        this.f21233q = i10;
        try {
            return interfaceC6824a.invoke();
        } finally {
            this.f21232p = null;
            this.f21233q = 0;
        }
    }

    @Override // T.M0
    public void g(K0 k02) {
        this.f21231o = true;
    }

    @Override // T.M0
    public Y h(K0 k02, Object obj) {
        C3553s c3553s;
        if (k02.k()) {
            k02.C(true);
        }
        C3520d c3520dI = k02.i();
        if (c3520dI == null || !c3520dI.b()) {
            return Y.IGNORED;
        }
        if (this.f21222f.H(c3520dI)) {
            return !k02.j() ? Y.IGNORED : F(k02, c3520dI, obj);
        }
        synchronized (this.f21220d) {
            c3553s = this.f21232p;
        }
        return (c3553s == null || !c3553s.L(k02, obj)) ? Y.IGNORED : Y.IMMINENT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // T.E
    public void i(Set set) {
        Object obj;
        Set setD;
        do {
            obj = this.f21219c.get();
            if (obj == null ? true : AbstractC6492s.d(obj, AbstractC3555t.f21251a)) {
                setD = set;
            } else if (obj instanceof Set) {
                setD = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f21219c).toString());
                }
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setD = AbstractC3682n.D((Set[]) obj, set);
            }
        } while (!r.Y.a(this.f21219c, obj, setD));
        if (obj == null) {
            synchronized (this.f21220d) {
                C();
                Yg.J j10 = Yg.J.f24997a;
            }
        }
    }

    @Override // T.InterfaceC3548p
    public boolean isDisposed() {
        return this.f21238v;
    }

    @Override // T.E
    public void k() {
        synchronized (this.f21220d) {
            try {
                y(this.f21227k);
                C();
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f21221e.isEmpty()) {
                            new a(this.f21221e).f();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        s();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // T.E
    public boolean l() {
        return this.f21235s.P0();
    }

    @Override // T.E
    public void m(List list) {
        boolean z10 = true;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (!AbstractC6492s.d(((C3541l0) ((Yg.s) list.get(i10)).h()).b(), this)) {
                z10 = false;
                break;
            }
            i10++;
        }
        AbstractC3546o.O(z10);
        try {
            this.f21235s.M0(list);
            Yg.J j10 = Yg.J.f24997a;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // T.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f21220d
            monitor-enter(r0)
            r14.G(r15)     // Catch: java.lang.Throwable -> L53
            V.f r1 = r14.f21226j     // Catch: java.lang.Throwable -> L53
            o.H r1 = r1.d()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r1.c(r15)     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L65
            boolean r1 = r15 instanceof o.I     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L60
            o.I r15 = (o.I) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r1 = r15.f54929b     // Catch: java.lang.Throwable -> L53
            long[] r15 = r15.f54928a     // Catch: java.lang.Throwable -> L53
            int r2 = r15.length     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L23:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L53
            long r7 = ~r5     // Catch: java.lang.Throwable -> L53
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L53
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3d:
            if (r9 >= r7) goto L59
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L53
            T.H r10 = (T.H) r10     // Catch: java.lang.Throwable -> L53
            r14.G(r10)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r15 = move-exception
            goto L69
        L55:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3d
        L59:
            if (r7 != r8) goto L65
        L5b:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L23
        L60:
            T.H r15 = (T.H) r15     // Catch: java.lang.Throwable -> L53
            r14.G(r15)     // Catch: java.lang.Throwable -> L53
        L65:
            Yg.J r15 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)
            return
        L69:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C3553s.n(java.lang.Object):void");
    }

    @Override // T.InterfaceC3548p
    public boolean o() {
        boolean z10;
        synchronized (this.f21220d) {
            z10 = this.f21230n.e() > 0;
        }
        return z10;
    }

    @Override // T.E
    public void q(AbstractC3539k0 abstractC3539k0) {
        a aVar = new a(this.f21221e);
        C3525e1 c3525e1G = abstractC3539k0.a().G();
        try {
            AbstractC3546o.K(c3525e1G, aVar);
            Yg.J j10 = Yg.J.f24997a;
            c3525e1G.L(true);
            aVar.g();
        } catch (Throwable th2) {
            c3525e1G.L(false);
            throw th2;
        }
    }

    @Override // T.E
    public void r(InterfaceC6839p interfaceC6839p) {
        try {
            synchronized (this.f21220d) {
                B();
                V.f fVarK = K();
                try {
                    H();
                    this.f21235s.m0(fVarK, interfaceC6839p);
                } catch (Exception e10) {
                    this.f21230n = fVarK;
                    throw e10;
                }
            }
        } finally {
        }
    }

    @Override // T.E
    public void s() {
        this.f21219c.set(null);
        this.f21227k.a();
        this.f21228l.a();
        if (this.f21221e.isEmpty()) {
            return;
        }
        new a(this.f21221e).f();
    }

    @Override // T.E
    public void t() {
        synchronized (this.f21220d) {
            try {
                this.f21235s.j0();
                if (!this.f21221e.isEmpty()) {
                    new a(this.f21221e).f();
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f21221e.isEmpty()) {
                            new a(this.f21221e).f();
                        }
                        throw th2;
                    } catch (Exception e10) {
                        s();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // T.E
    public boolean u() {
        boolean zW0;
        synchronized (this.f21220d) {
            try {
                B();
                try {
                    V.f fVarK = K();
                    try {
                        H();
                        zW0 = this.f21235s.W0(fVarK);
                        if (!zW0) {
                            C();
                        }
                    } catch (Exception e10) {
                        this.f21230n = fVarK;
                        throw e10;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zW0;
    }

    @Override // T.U0
    public void v(InterfaceC6839p interfaceC6839p) {
        this.f21235s.q1();
        A(interfaceC6839p);
        this.f21235s.x0();
    }

    @Override // T.E
    public void w() {
        synchronized (this.f21220d) {
            try {
                for (Object obj : this.f21222f.w()) {
                    K0 k02 = obj instanceof K0 ? (K0) obj : null;
                    if (k02 != null) {
                        k02.invalidate();
                    }
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ C3553s(AbstractC3550q abstractC3550q, InterfaceC3526f interfaceC3526f, InterfaceC5384i interfaceC5384i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3550q, interfaceC3526f, (i10 & 4) != 0 ? null : interfaceC5384i);
    }
}
