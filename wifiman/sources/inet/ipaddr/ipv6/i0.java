package inet.ipaddr.ipv6;

import dg.InterfaceC5371a;
import inet.ipaddr.NetworkMismatchException;
import inet.ipaddr.ipv6.C6208e;
import inet.ipaddr.j;
import inet.ipaddr.m;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

/* loaded from: classes4.dex */
public class i0 extends inet.ipaddr.m implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    private static final BigInteger f49697f = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: g, reason: collision with root package name */
    private static final i0[] f49698g = new i0[0];

    i0(C6205b c6205b, C6205b c6205b2, boolean z10) {
        super(c6205b, c6205b2, z10);
    }

    private C6208e.a m1() {
        return q0().B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator p1(V v10, int i10) {
        return v10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean q1(C6205b c6205b, C6205b c6205b2, int i10) {
        return c6205b.q(i10).Q() == c6205b2.q(i10).Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6205b r1(C6205b c6205b) {
        return c6205b.t1().Y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i0 s1(C6208e.a aVar, V[] vArr, V[] vArr2) {
        return new i0(aVar.S(vArr), aVar.S(vArr2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean t1(final C6208e.a aVar, int i10, int i11, m.d dVar) {
        i0 i0Var = (i0) dVar.a();
        return inet.ipaddr.m.b1(dVar, new BiFunction() { // from class: inet.ipaddr.ipv6.Y
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return i0.s1(aVar, (V[]) obj, (V[]) obj2);
            }
        }, aVar, i0Var.q0().v().e2(), i0Var.K0().v().e2(), i10, i11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator u1(boolean z10, boolean z11, i0 i0Var) {
        return i0Var.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v1(i0 i0Var) {
        return i0Var.getCount().compareTo(f49697f) <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long w1(i0 i0Var) {
        return i0Var.getCount().longValue();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        C6205b c6205bQ0 = q0();
        C6205b c6205bK0 = K0();
        C6208e.a aVarM1 = m1();
        if (!A0()) {
            return inet.ipaddr.m.U0(c6205bQ0, aVarM1);
        }
        int iZ = c6205bQ0.Z();
        return inet.ipaddr.m.V0(c6205bQ0, c6205bK0, aVarM1, new j.e() { // from class: inet.ipaddr.ipv6.g0
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i10) {
                return ((C6205b) obj).q(i10);
            }
        }, new j.e() { // from class: inet.ipaddr.ipv6.h0
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i10) {
                return i0.p1((V) obj, i10);
            }
        }, new m.e() { // from class: inet.ipaddr.ipv6.X
            @Override // inet.ipaddr.m.e
            public final boolean a(Object obj, Object obj2, int i10) {
                return i0.q1((C6205b) obj, (C6205b) obj2, i10);
            }
        }, iZ - 1, iZ, null);
    }

    @Override // inet.ipaddr.m
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public C6205b q0() {
        return (C6205b) super.q0();
    }

    @Override // inet.ipaddr.m
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C6205b K0() {
        return (C6205b) super.K0();
    }

    @Override // java.lang.Iterable
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371a spliterator() {
        final int iZ = q0().Z();
        final C6208e.a aVarM1 = m1();
        final int i10 = iZ - 1;
        return inet.ipaddr.m.J(this, new Predicate() { // from class: inet.ipaddr.ipv6.W
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i0.t1(aVarM1, i10, iZ, (m.d) obj);
            }
        }, new m.c() { // from class: inet.ipaddr.ipv6.Z
            @Override // ag.AbstractC3846d.InterfaceC1014d
            public final Iterator a(boolean z10, boolean z11, Object obj) {
                return i0.u1(z10, z11, (i0) obj);
            }
        }, new Function() { // from class: inet.ipaddr.ipv6.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i0) obj).getCount();
            }
        }, new Predicate() { // from class: inet.ipaddr.ipv6.b0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return i0.v1((i0) obj);
            }
        }, new ToLongFunction() { // from class: inet.ipaddr.ipv6.c0
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return i0.w1((i0) obj);
            }
        });
    }

    public i0(C6205b c6205b, C6205b c6205b2) {
        super(c6205b, c6205b2, new UnaryOperator() { // from class: inet.ipaddr.ipv6.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C6205b) obj).Y0();
            }
        }, new UnaryOperator() { // from class: inet.ipaddr.ipv6.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C6205b) obj).K1();
            }
        }, new UnaryOperator() { // from class: inet.ipaddr.ipv6.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return i0.r1((C6205b) obj);
            }
        });
        if (!c6205b.e().b0(c6205b2.e())) {
            throw new NetworkMismatchException(c6205b, c6205b2);
        }
    }
}
