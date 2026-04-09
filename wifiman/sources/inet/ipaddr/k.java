package inet.ipaddr;

import ag.AbstractC3844b;
import bg.AbstractC4109b;
import inet.ipaddr.c;
import inet.ipaddr.format.validate.r;
import inet.ipaddr.g;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class k extends bg.e implements Zf.d {

    /* renamed from: s, reason: collision with root package name */
    private final int f49761s;

    /* renamed from: t, reason: collision with root package name */
    private final int f49762t;

    protected k(int i10) {
        if (i10 < 0) {
            throw new AddressValueException(i10);
        }
        this.f49762t = i10;
        this.f49761s = i10;
    }

    protected static Integer B2(int i10, Integer num, int i11) {
        return j.s1(i10, num, i11);
    }

    static int D2(int i10, int i11, int i12) {
        return i10 | (i11 << i12);
    }

    protected static int F2(int i10) {
        return i10 >> 8;
    }

    protected static int M2(int i10) {
        return i10 & 255;
    }

    protected static k Q2(k kVar, boolean z10, c.a aVar) {
        if (!kVar.i()) {
            return kVar;
        }
        int iQ = kVar.Q();
        int iW0 = kVar.w0();
        if (!z10) {
            return (k) aVar.c(iQ, iW0, null);
        }
        int iZ2 = kVar.z2(kVar.A2().intValue());
        long j10 = iZ2;
        r.j jVarD2 = d2(kVar.W1(), kVar.a2(), j10, kVar.X1());
        if (jVarD2.d()) {
            return (k) aVar.c((int) jVarD2.a(iQ, j10), (int) jVarD2.c(iW0, j10), null);
        }
        throw new IncompatibleAddressException(kVar, iZ2, "ipaddress.error.maskMismatch");
    }

    protected static StringBuilder X2(int i10, int i11, StringBuilder sb2) {
        return AbstractC3844b.H1(i10, i11, 0, false, sb2);
    }

    protected static int Y2(int i10, int i11) {
        return AbstractC3844b.K1(i10, i11);
    }

    protected static r.j d2(long j10, long j11, long j12, long j13) {
        return AbstractC4109b.d2(j10, j11, j12, j13);
    }

    public static int u2(g.a aVar) {
        return aVar.isIPv4() ? 8 : 16;
    }

    public static int v2(g.a aVar) {
        return aVar.isIPv4() ? 1 : 2;
    }

    protected static k w2(k kVar, c.a aVar, boolean z10) {
        boolean zAllPrefixedAddressesAreSubnets = kVar.e().d().allPrefixedAddressesAreSubnets();
        if (kVar.A0() || (zAllPrefixedAddressesAreSubnets && kVar.i())) {
            return (k) aVar.g(z10 ? kVar.Q() : kVar.w0(), zAllPrefixedAddressesAreSubnets ? null : kVar.A2());
        }
        return kVar;
    }

    public static int x2(g.a aVar) {
        return aVar.isIPv4() ? 255 : 65535;
    }

    @Override // bg.AbstractC4109b, ag.InterfaceC3849g
    public boolean A0() {
        return Q() != w0();
    }

    public Integer A2() {
        return g();
    }

    public int C2() {
        return (w0() - Q()) + 1;
    }

    protected int E2() {
        return F2(Q());
    }

    protected boolean G2(int i10, int i11, Integer num) {
        return (Q() == i10 && w0() == i11 && (!i() ? num != null : !A2().equals(num))) ? false : true;
    }

    protected boolean H2(Integer num, boolean z10) {
        boolean z11 = num != null;
        if (z11 && (num.intValue() < 0 || num.intValue() > f())) {
            throw new PrefixLenException(this, num.intValue());
        }
        if (z10) {
            if (i()) {
                return z11 && num.intValue() < A2().intValue();
            }
        } else if (i()) {
            return (z11 && num.intValue() == A2().intValue()) ? false : true;
        }
        return z11;
    }

    protected boolean I2(Integer num, boolean z10) {
        boolean z11 = num != null;
        if (z11 && (num.intValue() < 0 || num.intValue() > f())) {
            throw new PrefixLenException(this, num.intValue());
        }
        if ((z10 & z11) == i() && z11 && num == g()) {
            return !B0(num.intValue());
        }
        return true;
    }

    protected boolean J2(int i10) {
        return (i() && i10 == g().intValue() && B0(i10)) ? false : true;
    }

    protected boolean K2(Zf.d dVar) {
        return Q() == dVar.Q() && w0() == dVar.w0();
    }

    @Override // bg.AbstractC4109b, ag.InterfaceC3849g
    public boolean L() {
        return Q() == 0;
    }

    protected int L2() {
        return M2(Q());
    }

    public boolean N2(int i10) {
        return super.e2(i10);
    }

    @Override // bg.AbstractC4109b, ag.InterfaceC3849g
    public boolean O() {
        return w0() == I0();
    }

    public boolean O2(int i10, int i11) {
        return super.f2(i10, i11);
    }

    public boolean P2(int i10, Integer num) {
        return super.s2(i10, num);
    }

    @Override // Zf.d
    public int Q() {
        return this.f49761s;
    }

    void R2(CharSequence charSequence, boolean z10, int i10, int i11, int i12) {
        if (this.f33332q == null && z10 && i12 == W1()) {
            this.f33332q = charSequence.subSequence(i10, i11).toString();
        }
    }

    void S2(CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, int i12, int i13, int i14) {
        if (this.f33332q == null) {
            if (u()) {
                if (z10 && i13 == W1()) {
                    this.f33332q = charSequence.subSequence(i10, i11).toString();
                    return;
                }
                return;
            }
            if (w()) {
                this.f33332q = a.f49279e;
                return;
            }
            if (z11 && i13 == W1()) {
                long jA2 = a2();
                if (i()) {
                    jA2 &= n2(g().intValue());
                }
                if (i14 == jA2) {
                    this.f33332q = charSequence.subSequence(i10, i12).toString();
                }
            }
        }
    }

    void T2(CharSequence charSequence, boolean z10, int i10, int i11, int i12) {
        if (this.f26207a == null && z10) {
            long j10 = i12;
            if (j10 == W1() && j10 == a2()) {
                this.f26207a = charSequence.subSequence(i10, i11).toString();
            }
        }
    }

    void U2(CharSequence charSequence, boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f26207a == null) {
            if (w()) {
                this.f26207a = a.f49279e;
            } else if (z10 && i12 == W1() && i13 == a2()) {
                this.f26207a = charSequence.subSequence(i10, i11).toString();
            }
        }
    }

    protected k V2(Integer num, boolean z10, c.a aVar) {
        int iQ = Q();
        int iW0 = w0();
        boolean z11 = false;
        boolean z12 = num != null;
        if (z12) {
            iQ &= z2(num.intValue());
            iW0 |= y2(num.intValue());
        }
        if (z10 && z12) {
            z11 = true;
        }
        if (iQ != iW0) {
            return !z11 ? (k) aVar.c(iQ, iW0, null) : (k) aVar.c(iQ, iW0, num);
        }
        return (k) (z11 ? aVar.g(iQ, num) : aVar.a(iQ));
    }

    @Override // bg.AbstractC4109b
    public long W1() {
        return Q();
    }

    protected k W2(Integer num, c.a aVar) {
        int iQ = Q();
        int iW0 = w0();
        boolean z10 = num != null;
        if (iQ != iW0) {
            return !z10 ? (k) aVar.c(iQ, iW0, null) : (k) aVar.c(iQ, iW0, num);
        }
        return (k) (z10 ? aVar.g(iQ, num) : aVar.a(iQ));
    }

    @Override // bg.AbstractC4109b
    public abstract long X1();

    @Override // bg.AbstractC4109b
    public int Y1() {
        if (e().d().allPrefixedAddressesAreSubnets() && i() && A2().intValue() == 0) {
            return 0;
        }
        return super.Y1();
    }

    @Override // ag.AbstractC3844b
    protected String a1() {
        return a.f49279e;
    }

    @Override // bg.AbstractC4109b
    public long a2() {
        return w0();
    }

    public abstract i e();

    @Override // ag.InterfaceC3849g
    public BigInteger getCount() {
        return BigInteger.valueOf(C2());
    }

    public int hashCode() {
        return D2(Q(), w0(), f());
    }

    @Override // bg.e
    protected long m2(int i10) {
        return y2(i10);
    }

    @Override // bg.e
    protected long n2(int i10) {
        return z2(i10);
    }

    protected boolean t2(Zf.d dVar) {
        return dVar.Q() >= Q() && dVar.w0() <= w0();
    }

    @Override // Zf.d
    public int w0() {
        return this.f49762t;
    }

    @Override // bg.e
    public boolean x() {
        return (i() && e().d().allPrefixedAddressesAreSubnets()) || super.x();
    }

    protected abstract int y2(int i10);

    protected abstract int z2(int i10);

    protected k(int i10, Integer num) {
        this(i10, i10, num);
    }

    protected k(int i10, int i11, Integer num) {
        super(num);
        if (i10 >= 0 && i11 >= 0) {
            if (i10 > i11) {
                i11 = i10;
                i10 = i11;
            }
            Integer numA2 = A2();
            if (numA2 != null && numA2.intValue() < f() && e().d().allPrefixedAddressesAreSubnets()) {
                this.f49761s = i10 & z2(numA2.intValue());
                this.f49762t = y2(numA2.intValue()) | i11;
                return;
            } else {
                this.f49761s = i10;
                this.f49762t = i11;
                return;
            }
        }
        throw new AddressValueException(i10 < 0 ? i10 : i11);
    }
}
