package inet.ipaddr.ipv4;

import ag.AbstractC3844b;
import bg.AbstractC4109b;
import dg.InterfaceC5372b;
import inet.ipaddr.AddressValueException;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.PrefixLenException;
import inet.ipaddr.g;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.ipv6.C6208e;
import java.util.Iterator;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public class M extends inet.ipaddr.k implements Iterable {
    public M(int i10) {
        super(i10);
        if (i10 > 255) {
            throw new AddressValueException(i10);
        }
    }

    static Integer b3(int i10, Integer num, Integer num2) {
        if (num2 == null) {
            return null;
        }
        return num2.intValue() == 0 ? num : I.s(num2.intValue() + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator i3(int i10, C6183e.a aVar, Integer num, boolean z10, boolean z11, int i11, int i12) {
        return AbstractC4109b.b2(null, i11, i12, i10, aVar, num, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ M j3(C6183e.a aVar, Integer num, int i10, int i11) {
        return aVar.c(i10, i11, num);
    }

    @Override // Zf.d
    public int I0() {
        return inet.ipaddr.k.x2(g.a.IPV4);
    }

    @Override // Zf.d
    public boolean L0(Zf.d dVar) {
        return this == dVar || (t2(dVar) && (dVar instanceof M));
    }

    @Override // ag.AbstractC3844b
    protected byte[] X0(boolean z10) {
        return new byte[]{(byte) (z10 ? Q() : w0())};
    }

    @Override // inet.ipaddr.k, bg.AbstractC4109b
    public long X1() {
        return 255L;
    }

    @Override // ag.AbstractC3844b
    public int b1() {
        return 10;
    }

    public M c3() {
        return (M) inet.ipaddr.k.w2(this, e3(), true);
    }

    @Override // inet.ipaddr.k, Zf.b, cg.d
    /* renamed from: d3, reason: merged with bridge method [inline-methods] */
    public C6183e e() {
        return inet.ipaddr.a.j();
    }

    public C6183e.a e3() {
        return e().a();
    }

    @Override // ag.AbstractC3844b
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof M) && ((M) obj).K2(this));
    }

    @Override // ag.InterfaceC3849g
    public int f() {
        return 8;
    }

    public M f3() {
        return (M) inet.ipaddr.k.w2(this, e3(), false);
    }

    Iterator g3(boolean z10) {
        return AbstractC4109b.c2((z10 || !i() || A0()) ? this : p3(), e3(), z10 ? A2() : null, false, false);
    }

    public inet.ipaddr.ipv6.V h3(C6208e.a aVar, M m10) {
        Integer numB3 = b3(8, A2(), m10.A2());
        if (A0() && !m10.w()) {
            throw new IncompatibleAddressException(this, m10, "ipaddress.error.invalidMixedRange");
        }
        return aVar.c((Q() << 8) | m10.Q(), m10.w0() | (w0() << 8), numB3);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return g3(!e().d().allPrefixedAddressesAreSubnets());
    }

    @Override // ag.AbstractC3844b
    public int k1() {
        return 3;
    }

    @Override // java.lang.Iterable
    /* renamed from: k3, reason: merged with bridge method [inline-methods] */
    public InterfaceC5372b spliterator() {
        final C6183e.a aVarE3 = e3();
        final Integer numA2 = e().d().allPrefixedAddressesAreSubnets() ? null : A2();
        final int iF = f();
        return AbstractC3844b.U0(this, Q(), w0(), new Supplier() { // from class: inet.ipaddr.ipv4.J
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f49519a.iterator();
            }
        }, new AbstractC3844b.a() { // from class: inet.ipaddr.ipv4.K
            @Override // ag.AbstractC3844b.a
            public final Iterator a(boolean z10, boolean z11, int i10, int i11) {
                return M.i3(iF, aVarE3, numA2, z10, z11, i10, i11);
            }
        }, new AbstractC3844b.InterfaceC1013b() { // from class: inet.ipaddr.ipv4.L
            @Override // ag.AbstractC3844b.InterfaceC1013b
            public final Zf.d a(int i10, int i11) {
                return M.j3(aVarE3, numA2, i10, i11);
            }
        });
    }

    public M l3(Integer num) {
        return m3(num, true);
    }

    public M m3(Integer num, boolean z10) {
        return I2(num, z10) ? (M) super.V2(num, z10, e3()) : this;
    }

    protected M n3() {
        return e3().c(Q(), w0(), I.s(f()));
    }

    protected M o3(Integer num) {
        return H2(num, e().d().allPrefixedAddressesAreSubnets()) ? (M) super.W2(num, e3()) : this;
    }

    public M p3() {
        return (M) inet.ipaddr.k.Q2(this, false, e3());
    }

    @Override // ag.InterfaceC3849g
    public int v0() {
        return 1;
    }

    @Override // inet.ipaddr.k
    protected int y2(int i10) {
        return e().B(i10);
    }

    @Override // inet.ipaddr.k
    protected int z2(int i10) {
        return e().C(i10);
    }

    public M(int i10, Integer num) {
        super(i10, num);
        if (i10 <= 255) {
            if (num != null && num.intValue() > 32) {
                throw new PrefixLenException(num.intValue());
            }
            return;
        }
        throw new AddressValueException(i10);
    }

    public M(int i10, int i11, Integer num) {
        super(i10, i11, num);
        if (w0() <= 255) {
            if (num != null && num.intValue() > 32) {
                throw new PrefixLenException(num.intValue());
            }
            return;
        }
        throw new AddressValueException(w0());
    }
}
