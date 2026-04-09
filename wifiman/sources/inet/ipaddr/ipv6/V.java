package inet.ipaddr.ipv6;

import ag.AbstractC3844b;
import bg.AbstractC4109b;
import dg.InterfaceC5372b;
import inet.ipaddr.AddressValueException;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.PrefixLenException;
import inet.ipaddr.c;
import inet.ipaddr.g;
import inet.ipaddr.ipv6.C6208e;
import java.util.Iterator;
import java.util.function.Supplier;

/* loaded from: classes4.dex */
public class V extends inet.ipaddr.k implements Iterable {
    public V(int i10) {
        super(i10);
        if (i10 > 65535) {
            throw new AddressValueException(i10);
        }
    }

    protected static StringBuilder X2(int i10, int i11, StringBuilder sb2) {
        return inet.ipaddr.k.X2(i10, i11, sb2);
    }

    protected static int Y2(int i10, int i11) {
        return inet.ipaddr.k.Y2(i10, i11);
    }

    private void f3(Zf.d[] dVarArr, int i10, c.a aVar) {
        Integer numA2 = A2();
        int iQ = Q();
        int iW0 = w0();
        int iF2 = inet.ipaddr.k.F2(iQ);
        int iF22 = inet.ipaddr.k.F2(iW0);
        int iM2 = inet.ipaddr.k.M2(iQ);
        int iM22 = inet.ipaddr.k.M2(iW0);
        boolean z10 = iF2 != iF22;
        if (z10 && (iM2 != 0 || iM22 != 255)) {
            throw new IncompatibleAddressException(this, "ipaddress.error.splitSeg");
        }
        if (i10 >= 0 && i10 < dVarArr.length) {
            Integer numB2 = inet.ipaddr.k.B2(8, numA2, 0);
            if (z10) {
                dVarArr[i10] = aVar.c(iF2, iF22, numB2);
            } else {
                dVarArr[i10] = aVar.g(iF2, numB2);
            }
        }
        int i11 = i10 + 1;
        if (i11 < 0 || i11 >= dVarArr.length) {
            return;
        }
        Integer numB22 = inet.ipaddr.k.B2(8, numA2, 1);
        if (iM2 == iM22) {
            dVarArr[i11] = aVar.g(iM2, numB22);
        } else {
            dVarArr[i11] = aVar.c(iM2, iM22, numB22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator i3(int i10, C6208e.a aVar, Integer num, boolean z10, boolean z11, int i11, int i12) {
        return AbstractC4109b.b2(null, i11, i12, i10, aVar, num, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ V j3(C6208e.a aVar, Integer num, int i10, int i11) {
        return aVar.c(i10, i11, num);
    }

    @Override // Zf.d
    public int I0() {
        return inet.ipaddr.k.x2(g.a.IPV6);
    }

    @Override // Zf.d
    public boolean L0(Zf.d dVar) {
        return this == dVar || (t2(dVar) && (dVar instanceof V));
    }

    @Override // ag.AbstractC3844b
    protected byte[] X0(boolean z10) {
        int iQ = z10 ? Q() : w0();
        return new byte[]{(byte) (iQ >>> 8), (byte) (iQ & 255)};
    }

    @Override // inet.ipaddr.k, bg.AbstractC4109b
    public long X1() {
        return 65535L;
    }

    @Override // bg.AbstractC4109b
    protected int Z1() {
        int iY1 = Y1();
        int iF = f();
        if (iY1 < iF && u0(iY1) && iY1 % 4 == 0) {
            return (iF - iY1) / 4;
        }
        return 0;
    }

    @Override // ag.AbstractC3844b
    public int b1() {
        return 16;
    }

    public V b3() {
        return (V) inet.ipaddr.k.w2(this, d3(), true);
    }

    @Override // inet.ipaddr.k, Zf.b, cg.d
    /* renamed from: c3, reason: merged with bridge method [inline-methods] */
    public C6208e e() {
        return inet.ipaddr.a.s();
    }

    protected C6208e.a d3() {
        return e().m();
    }

    public void e3(Zf.d[] dVarArr, int i10, c.a aVar) {
        if (A0()) {
            f3(dVarArr, i10, aVar);
            return;
        }
        Integer numA2 = A2();
        Integer numB2 = inet.ipaddr.k.B2(8, numA2, 0);
        Integer numB22 = inet.ipaddr.k.B2(8, numA2, 1);
        if (i10 >= 0 && i10 < dVarArr.length) {
            dVarArr[i10] = aVar.g(E2(), numB2);
        }
        int i11 = i10 + 1;
        if (i11 < 0 || i11 >= dVarArr.length) {
            return;
        }
        dVarArr[i11] = aVar.g(L2(), numB22);
    }

    @Override // ag.AbstractC3844b
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof V) && ((V) obj).K2(this));
    }

    @Override // ag.InterfaceC3849g
    public int f() {
        return 16;
    }

    public V g3() {
        return (V) inet.ipaddr.k.w2(this, d3(), false);
    }

    Iterator h3(boolean z10) {
        return AbstractC4109b.c2((z10 || !i() || A0()) ? this : p3(), d3(), z10 ? A2() : null, false, false);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return h3(!e().d().allPrefixedAddressesAreSubnets());
    }

    @Override // ag.AbstractC3844b
    public int k1() {
        return 4;
    }

    @Override // java.lang.Iterable
    /* renamed from: k3, reason: merged with bridge method [inline-methods] */
    public InterfaceC5372b spliterator() {
        final C6208e.a aVarD3 = d3();
        final Integer numA2 = e().d().allPrefixedAddressesAreSubnets() ? null : A2();
        final int iF = f();
        return AbstractC3844b.U0(this, Q(), w0(), new Supplier() { // from class: inet.ipaddr.ipv6.S
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f49655a.iterator();
            }
        }, new AbstractC3844b.a() { // from class: inet.ipaddr.ipv6.T
            @Override // ag.AbstractC3844b.a
            public final Iterator a(boolean z10, boolean z11, int i10, int i11) {
                return V.i3(iF, aVarD3, numA2, z10, z11, i10, i11);
            }
        }, new AbstractC3844b.InterfaceC1013b() { // from class: inet.ipaddr.ipv6.U
            @Override // ag.AbstractC3844b.InterfaceC1013b
            public final Zf.d a(int i10, int i11) {
                return V.j3(aVarD3, numA2, i10, i11);
            }
        });
    }

    public V l3(Integer num) {
        return m3(num, true);
    }

    public V m3(Integer num, boolean z10) {
        return I2(num, z10) ? (V) super.V2(num, z10, d3()) : this;
    }

    protected V n3() {
        return d3().c(Q(), w0(), Q.s(f()));
    }

    protected V o3(Integer num) {
        return H2(num, e().d().allPrefixedAddressesAreSubnets()) ? (V) super.W2(num, d3()) : this;
    }

    public V p3() {
        return (V) inet.ipaddr.k.Q2(this, false, d3());
    }

    @Override // ag.InterfaceC3849g
    public int v0() {
        return 2;
    }

    @Override // inet.ipaddr.k
    protected int y2(int i10) {
        return e().B(i10);
    }

    @Override // inet.ipaddr.k
    protected int z2(int i10) {
        return e().C(i10);
    }

    public V(int i10, Integer num) {
        super(i10, num);
        if (i10 <= 65535) {
            if (num != null && num.intValue() > 128) {
                throw new PrefixLenException(num.intValue());
            }
            return;
        }
        throw new AddressValueException(i10);
    }

    public V(int i10, int i11, Integer num) {
        super(i10, i11, num);
        if (w0() <= 65535) {
            if (num != null && num.intValue() > 128) {
                throw new PrefixLenException(num.intValue());
            }
            return;
        }
        throw new AddressValueException(w0());
    }
}
