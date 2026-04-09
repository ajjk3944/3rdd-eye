package bg;

import ag.AbstractC3844b;
import ag.l;
import dg.InterfaceC5374d;
import inet.ipaddr.PrefixLenException;

/* loaded from: classes4.dex */
public abstract class e extends AbstractC4109b implements l {

    /* renamed from: p, reason: collision with root package name */
    private final Integer f33331p;

    /* renamed from: q, reason: collision with root package name */
    protected transient String f33332q;

    /* renamed from: r, reason: collision with root package name */
    private transient Boolean f33333r;

    protected e() {
        this(null);
    }

    @Override // ag.InterfaceC3849g
    public boolean B0(int i10) {
        return p2(W1(), a2(), i10);
    }

    @Override // ag.AbstractC3844b
    protected void D1(int i10, boolean z10, StringBuilder sb2) {
        AbstractC3844b.H1(a2() & n2(g().intValue()), i10, 0, z10, sb2);
    }

    @Override // ag.AbstractC3844b
    public String E1() {
        String strZ1 = this.f26207a;
        if (strZ1 == null) {
            synchronized (this) {
                try {
                    strZ1 = this.f26207a;
                    if (strZ1 == null) {
                        if (!i() || !A0()) {
                            strZ1 = z1();
                        } else if (!w() || (strZ1 = a1()) == null) {
                            strZ1 = U1();
                        }
                        this.f26207a = strZ1;
                    }
                } finally {
                }
            }
        }
        return strZ1;
    }

    @Override // ag.AbstractC3844b
    protected String Y0() {
        String strT1 = this.f33332q;
        if (strT1 == null) {
            synchronized (this) {
                try {
                    strT1 = this.f33332q;
                    if (strT1 == null) {
                        strT1 = T1();
                        this.f33332q = strT1;
                    }
                } finally {
                }
            }
        }
        return strT1;
    }

    @Override // cg.InterfaceC4259c
    public Integer g() {
        return this.f33331p;
    }

    @Override // ag.l
    public boolean i() {
        return this.f33331p != null;
    }

    public Integer l2(boolean z10) {
        int iO2 = o2(z10);
        if (((z10 ? (~W1()) & X1() : W1()) >>> iO2) == 0) {
            return d.s(f() - iO2);
        }
        return null;
    }

    protected abstract long m2(int i10);

    protected abstract long n2(int i10);

    public int o2(boolean z10) {
        return z10 ? Long.numberOfTrailingZeros(W1() | ((-1) << f())) : Long.numberOfTrailingZeros(~W1());
    }

    protected boolean p2(long j10, long j11, int i10) {
        return i10 == 0 ? j10 == 0 && j11 == X1() : AbstractC4109b.g2(j10, j11, j11, n2(i10), m2(i10));
    }

    boolean q2(long j10, int i10) {
        return r2(j10, a2(), i10);
    }

    protected boolean r2(long j10, long j11, int i10) {
        return i10 == 0 ? j10 == 0 && j11 == X1() : AbstractC4109b.g2(j10, j10, j11, n2(i10), m2(i10));
    }

    public boolean s2(long j10, Integer num) {
        if (num == null) {
            return e2(j10);
        }
        long jN2 = n2(num.intValue());
        long j11 = j10 & jN2;
        return j11 == (W1() & jN2) && j11 == (jN2 & a2());
    }

    @Override // cg.InterfaceC4259c
    public boolean u() {
        if (this.f33333r == null) {
            this.f33333r = Boolean.valueOf(i() && u0(g().intValue()));
        }
        return this.f33333r.booleanValue();
    }

    @Override // ag.InterfaceC3849g
    public boolean u0(int i10) {
        return r2(W1(), a2(), i10);
    }

    public boolean x() {
        return i() && B0(g().intValue());
    }

    @Override // ag.AbstractC3844b, cg.InterfaceC4259c
    public int y(int i10, InterfaceC5374d interfaceC5374d, StringBuilder sb2) {
        return super.y(i10, interfaceC5374d, sb2);
    }

    @Override // ag.AbstractC3844b
    public String z1() {
        String strT1 = this.f33332q;
        if (strT1 == null) {
            synchronized (this) {
                try {
                    strT1 = this.f33332q;
                    if (strT1 == null) {
                        if (u() || !A0()) {
                            strT1 = T1();
                        } else if (!w() || (strT1 = a1()) == null) {
                            long jA2 = a2();
                            if (x()) {
                                jA2 &= n2(g().intValue());
                            }
                            strT1 = V1(W1(), jA2, b1());
                        }
                        this.f33332q = strT1;
                    }
                } finally {
                }
            }
        }
        return strT1;
    }

    protected e(Integer num) {
        if (num != null && num.intValue() < 0) {
            throw new PrefixLenException(num.intValue());
        }
        this.f33331p = num;
    }
}
