package inet.ipaddr.ipv4;

import dg.InterfaceC5371a;
import inet.ipaddr.NetworkMismatchException;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.j;
import inet.ipaddr.m;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

/* loaded from: classes4.dex */
public class Y extends inet.ipaddr.m implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    private static final Y[] f49529f = new Y[0];

    Y(C6180b c6180b, C6180b c6180b2, boolean z10) {
        super(c6180b, c6180b2, z10);
    }

    private C6183e.a j1() {
        return q0().e().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator n1(M m10, int i10) {
        return m10.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o1(C6180b c6180b, C6180b c6180b2, int i10) {
        return c6180b.q(i10).Q() == c6180b2.q(i10).Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Y p1(C6183e.a aVar, M[] mArr, M[] mArr2) {
        return new Y(aVar.S(mArr), aVar.S(mArr2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean q1(final C6183e.a aVar, int i10, int i11, m.d dVar) {
        Y y10 = (Y) dVar.a();
        return inet.ipaddr.m.b1(dVar, new BiFunction() { // from class: inet.ipaddr.ipv4.X
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Y.p1(aVar, (M[]) obj, (M[]) obj2);
            }
        }, aVar, y10.q0().b1().e2(), y10.K0().b1().e2(), i10, i11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator r1(boolean z10, boolean z11, Y y10) {
        return y10.iterator();
    }

    @Override // inet.ipaddr.m
    protected BigInteger b0() {
        return BigInteger.valueOf(k1());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        C6180b c6180bQ0 = q0();
        C6180b c6180bK0 = K0();
        C6183e.a aVarJ1 = j1();
        if (!A0()) {
            return inet.ipaddr.m.U0(c6180bQ0, aVarJ1);
        }
        int iZ = c6180bQ0.Z();
        return inet.ipaddr.m.V0(c6180bQ0, c6180bK0, aVarJ1, new j.e() { // from class: inet.ipaddr.ipv4.U
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i10) {
                return ((C6180b) obj).q(i10);
            }
        }, new j.e() { // from class: inet.ipaddr.ipv4.V
            @Override // inet.ipaddr.j.e
            public final Object a(Object obj, int i10) {
                return Y.n1((M) obj, i10);
            }
        }, new m.e() { // from class: inet.ipaddr.ipv4.W
            @Override // inet.ipaddr.m.e
            public final boolean a(Object obj, Object obj2, int i10) {
                return Y.o1((C6180b) obj, (C6180b) obj2, i10);
            }
        }, iZ - 1, iZ, null);
    }

    public long k1() {
        return (K0().K1() - q0().K1()) + 1;
    }

    @Override // inet.ipaddr.m
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public C6180b q0() {
        return (C6180b) super.q0();
    }

    @Override // inet.ipaddr.m
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public C6180b K0() {
        return (C6180b) super.K0();
    }

    @Override // java.lang.Iterable
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371a spliterator() {
        final int iZ = q0().Z();
        final C6183e.a aVarJ1 = j1();
        final int i10 = iZ - 1;
        return inet.ipaddr.m.T(this, new Predicate() { // from class: inet.ipaddr.ipv4.N
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Y.q1(aVarJ1, i10, iZ, (m.d) obj);
            }
        }, new m.c() { // from class: inet.ipaddr.ipv4.O
            @Override // ag.AbstractC3846d.InterfaceC1014d
            public final Iterator a(boolean z10, boolean z11, Object obj) {
                return Y.r1(z10, z11, (Y) obj);
            }
        }, new ToLongFunction() { // from class: inet.ipaddr.ipv4.P
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((Y) obj).k1();
            }
        });
    }

    public Y(C6180b c6180b, C6180b c6180b2) {
        super(c6180b, c6180b2, new UnaryOperator() { // from class: inet.ipaddr.ipv4.Q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C6180b) obj).Y0();
            }
        }, new UnaryOperator() { // from class: inet.ipaddr.ipv4.S
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C6180b) obj).H1();
            }
        }, new UnaryOperator() { // from class: inet.ipaddr.ipv4.T
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((C6180b) obj).t1();
            }
        });
        if (!c6180b.e().f0(c6180b2.e())) {
            throw new NetworkMismatchException(c6180b, c6180b2);
        }
    }
}
