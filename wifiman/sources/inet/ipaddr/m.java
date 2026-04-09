package inet.ipaddr;

import ag.InterfaceC3843a;
import bg.AbstractC4108a;
import dg.InterfaceC5371a;
import inet.ipaddr.j;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

/* loaded from: classes4.dex */
public abstract class m implements InterfaceC3843a {

    /* renamed from: e, reason: collision with root package name */
    private static final m[] f49763e = new m[0];

    /* renamed from: a, reason: collision with root package name */
    protected final g f49764a;

    /* renamed from: b, reason: collision with root package name */
    protected final g f49765b;

    /* renamed from: c, reason: collision with root package name */
    private transient BigInteger f49766c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f49767d;

    class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f49768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f49769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f49770c;

        a(Iterator it, boolean[] zArr, int i10) {
            this.f49768a = it;
            this.f49769b = zArr;
            this.f49770c = i10;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k next() {
            k kVar = (k) this.f49768a.next();
            if (!this.f49768a.hasNext()) {
                this.f49769b[this.f49770c + 1] = true;
            }
            return kVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f49768a.hasNext();
        }
    }

    class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f49771a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f49772b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f49773c;

        b(Iterator it, boolean[] zArr, int i10) {
            this.f49771a = it;
            this.f49772b = zArr;
            this.f49773c = i10;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k next() {
            k kVar = (k) this.f49771a.next();
            if (!this.f49771a.hasNext()) {
                this.f49772b[this.f49773c + 1] = true;
            }
            return kVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f49771a.hasNext();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface c extends j.f {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        Object a();

        void b(Object obj, Object obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface e {
        boolean a(Object obj, Object obj2, int i10);
    }

    protected m(g gVar, g gVar2, boolean z10) {
        this.f49764a = gVar;
        this.f49765b = gVar2;
    }

    private static int C(g gVar, g gVar2) {
        return g.T(gVar, gVar2);
    }

    protected static InterfaceC5371a J(InterfaceC3843a interfaceC3843a, Predicate predicate, c cVar, Function function, Predicate predicate2, ToLongFunction toLongFunction) {
        return new j.a(interfaceC3843a, predicate, cVar, function, predicate2, toLongFunction);
    }

    protected static InterfaceC5371a T(InterfaceC3843a interfaceC3843a, Predicate predicate, c cVar, ToLongFunction toLongFunction) {
        return new j.a(interfaceC3843a, predicate, cVar, toLongFunction);
    }

    protected static Iterator U0(inet.ipaddr.a aVar, AbstractC4108a abstractC4108a) {
        return j.q2(aVar, abstractC4108a, null);
    }

    protected static Iterator V0(g gVar, g gVar2, AbstractC4108a abstractC4108a, j.e eVar, j.e eVar2, e eVar3, int i10, int i11, j.e eVar4) {
        j.e eVar5;
        final j.e eVar6;
        int i12;
        int i13;
        int iZ = gVar.Z();
        final ArrayList arrayList = new ArrayList(iZ);
        final boolean[] zArr = new boolean[iZ + 1];
        int i14 = 0;
        boolean z10 = true;
        zArr[0] = true;
        final int i15 = 0;
        boolean zA = true;
        k kVar = null;
        while (i15 < iZ) {
            if (eVar4 == null || i15 < i10) {
                eVar5 = eVar;
                eVar6 = eVar2;
            } else {
                eVar5 = eVar;
                eVar6 = eVar4;
            }
            k kVar2 = (k) eVar5.a(gVar, i15);
            if (zA) {
                zA = eVar3.a(gVar, gVar2, i15);
                if (zA) {
                    zArr[i15 + 1] = z10;
                    final Iterator it = (Iterator) eVar6.a(kVar2, i15);
                    arrayList.add(new Supplier() { // from class: Zf.n
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return inet.ipaddr.m.W0(it);
                        }
                    });
                } else {
                    final a aVar = new a((Iterator) eVar6.a((k) abstractC4108a.c(kVar2.Q(), gVar2.q(i15).Q(), null), i15), zArr, i15);
                    arrayList.add(new Supplier() { // from class: Zf.o
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return inet.ipaddr.m.X0(aVar);
                        }
                    });
                }
                i13 = i14;
            } else {
                final Iterator it2 = (Iterator) eVar6.a((k) abstractC4108a.c(kVar2.Q(), gVar.I0(), null), i15);
                final b bVar = new b((Iterator) eVar6.a((k) abstractC4108a.c(i14, gVar2.q(i15).Q(), null), i15), zArr, i15);
                if (kVar == null) {
                    i12 = 0;
                    kVar = (k) abstractC4108a.c(0, gVar.I0(), null);
                } else {
                    i12 = 0;
                }
                final k kVar3 = kVar;
                i13 = i12;
                final int i16 = i15;
                final Supplier supplier = new Supplier() { // from class: Zf.p
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return inet.ipaddr.m.Y0(zArr, i16, bVar, eVar6, kVar3);
                    }
                };
                arrayList.add(new Supplier() { // from class: Zf.q
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return inet.ipaddr.m.Z0(arrayList, i15, supplier, it2);
                    }
                });
                kVar = kVar3;
            }
            i15++;
            i14 = i13;
            z10 = true;
        }
        IntFunction intFunction = new IntFunction() { // from class: Zf.r
            @Override // java.util.function.IntFunction
            public final Object apply(int i17) {
                return inet.ipaddr.m.a1(arrayList, i17);
            }
        };
        return j.q2(null, abstractC4108a, j.p2(gVar.Z(), abstractC4108a, intFunction, i10, i11, intFunction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator W0(Iterator it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator X0(Iterator it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator Y0(boolean[] zArr, int i10, Iterator it, j.e eVar, k kVar) {
        return zArr[i10] ? it : (Iterator) eVar.a(kVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator Z0(ArrayList arrayList, int i10, Supplier supplier, Iterator it) {
        arrayList.set(i10, supplier);
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator a1(ArrayList arrayList, int i10) {
        return (Iterator) ((Supplier) arrayList.get(i10)).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static boolean b1(inet.ipaddr.m.d r7, java.util.function.BiFunction r8, inet.ipaddr.c.a r9, Zf.d[] r10, Zf.d[] r11, int r12, int r13, java.lang.Integer r14) {
        /*
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            if (r1 >= r13) goto L25
            r3 = r10[r1]
            r4 = r11[r1]
            int r3 = r3.Q()
            int r4 = r4.Q()
            if (r3 == r4) goto L22
            int r4 = r4 - r3
            int r13 = r4 >>> 1
            int r3 = r3 + r13
            Zf.d r13 = r9.a(r3)
            int r3 = r3 + r2
            Zf.d r3 = r9.a(r3)
            r4 = r2
            goto L28
        L22:
            int r1 = r1 + 1
            goto L2
        L25:
            r13 = 0
            r3 = r13
            r4 = r0
        L28:
            if (r1 != r12) goto L5f
            if (r4 != 0) goto L5f
            r12 = r10[r1]
            r5 = r11[r1]
            int r6 = r12.f()
            java.lang.Integer r14 = inet.ipaddr.j.s1(r6, r14, r1)
            int r14 = r14.intValue()
            int r6 = r6 - r14
            int r12 = r12.Q()
            int r14 = r5.Q()
            int r12 = r12 >>> r6
            int r14 = r14 >>> r6
            if (r12 == r14) goto L5f
            int r14 = r14 - r12
            int r13 = r14 >>> 1
            int r12 = r12 + r13
            int r13 = r12 + 1
            int r12 = r12 << r6
            r14 = -1
            int r14 = r14 << r6
            int r14 = ~r14
            r12 = r12 | r14
            int r13 = r13 << r6
            Zf.d r12 = r9.a(r12)
            Zf.d r3 = r9.a(r13)
            r13 = r12
            goto L60
        L5f:
            r2 = r4
        L60:
            if (r2 == 0) goto L9a
            int r12 = r10.length
            Zf.d[] r14 = r9.d(r12)
            Zf.d[] r12 = r9.d(r12)
            java.lang.System.arraycopy(r10, r0, r14, r0, r1)
            java.lang.System.arraycopy(r10, r0, r12, r0, r1)
            int r4 = r1 + 1
            r14[r1] = r13
            r12[r1] = r3
            int r1 = r14.length
            int r13 = r13.I0()
            Zf.d r13 = r9.a(r13)
            java.util.Arrays.fill(r14, r4, r1, r13)
            int r13 = r12.length
            Zf.d r9 = r9.a(r0)
            java.util.Arrays.fill(r12, r4, r13, r9)
            java.lang.Object r9 = r8.apply(r10, r14)
            inet.ipaddr.m r9 = (inet.ipaddr.m) r9
            java.lang.Object r8 = r8.apply(r12, r11)
            inet.ipaddr.m r8 = (inet.ipaddr.m) r8
            r7.b(r9, r8)
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.m.b1(inet.ipaddr.m$d, java.util.function.BiFunction, inet.ipaddr.c$a, Zf.d[], Zf.d[], int, int, java.lang.Integer):boolean");
    }

    @Override // ag.InterfaceC3849g
    public boolean A0() {
        return this.f49766c == null ? !q0().equals(K0()) : super.A0();
    }

    public g K0() {
        return this.f49765b;
    }

    @Override // ag.InterfaceC3849g
    public boolean L() {
        return q0().c0();
    }

    @Override // ag.InterfaceC3849g
    public boolean O() {
        return K0().H0();
    }

    @Override // ag.InterfaceC3849g
    public BigInteger R() {
        return K0().getValue();
    }

    public String Y() {
        return c1(" -> ");
    }

    protected BigInteger b0() {
        return super.getCount();
    }

    public String c1(String str) {
        Function function = new Function() { // from class: Zf.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((inet.ipaddr.g) obj).Y();
            }
        };
        return d1(function, str, function);
    }

    public String d1(Function function, String str, Function function2) {
        return ((String) function.apply(q0())) + str + ((String) function2.apply(K0()));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return q0().equals(mVar.q0()) && K0().equals(mVar.K0());
    }

    @Override // ag.InterfaceC3849g
    public int f() {
        return q0().f();
    }

    @Override // ag.InterfaceC3849g
    public BigInteger getCount() {
        BigInteger bigInteger = this.f49766c;
        if (bigInteger != null) {
            return bigInteger;
        }
        BigInteger bigIntegerB0 = b0();
        this.f49766c = bigIntegerB0;
        return bigIntegerB0;
    }

    @Override // ag.InterfaceC3849g
    public BigInteger getValue() {
        return q0().getValue();
    }

    public int hashCode() {
        int i10 = this.f49767d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (q0().hashCode() * 31) + K0().hashCode();
        this.f49767d = iHashCode;
        return iHashCode;
    }

    public g q0() {
        return this.f49764a;
    }

    public String toString() {
        return Y();
    }

    protected m(g gVar, g gVar2, UnaryOperator unaryOperator, UnaryOperator unaryOperator2, UnaryOperator unaryOperator3) {
        boolean zB0 = gVar.b0(gVar2);
        if (!zB0 && !gVar2.b0(gVar)) {
            g gVar3 = (g) unaryOperator.apply(gVar);
            g gVar4 = (g) unaryOperator.apply(gVar2);
            g gVar5 = (g) unaryOperator2.apply(gVar);
            g gVar6 = (g) unaryOperator2.apply(gVar2);
            gVar3 = C(gVar3, gVar4) > 0 ? gVar4 : gVar3;
            gVar5 = C(gVar5, gVar6) < 0 ? gVar6 : gVar5;
            this.f49764a = (g) unaryOperator3.apply(gVar3);
            this.f49765b = (g) unaryOperator3.apply(gVar5);
            return;
        }
        g gVar7 = (g) (zB0 ? unaryOperator3.apply(gVar) : unaryOperator3.apply(gVar2));
        this.f49764a = (g) unaryOperator.apply(gVar7);
        this.f49765b = (g) unaryOperator2.apply(gVar7);
    }
}
