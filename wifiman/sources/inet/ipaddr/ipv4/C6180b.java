package inet.ipaddr.ipv4;

import dg.InterfaceC5372b;
import inet.ipaddr.AddressConversionException;
import inet.ipaddr.AddressValueException;
import inet.ipaddr.c;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.ipv4.I;
import inet.ipaddr.ipv6.C6205b;
import inet.ipaddr.ipv6.C6208e;
import inet.ipaddr.o;
import java.net.Inet4Address;
import java.util.Iterator;
import java.util.function.Function;

/* renamed from: inet.ipaddr.ipv4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6180b extends inet.ipaddr.g implements Iterable {

    /* renamed from: p, reason: collision with root package name */
    transient I.b f49545p;

    /* renamed from: inet.ipaddr.ipv4.b$a */
    public interface a {
        C6180b a(inet.ipaddr.g gVar);
    }

    /* renamed from: inet.ipaddr.ipv4.b$b, reason: collision with other inner class name */
    public enum EnumC1859b {
        OCTAL,
        HEX,
        DECIMAL;

        int getRadix() {
            if (this == OCTAL) {
                return 8;
            }
            return this == HEX ? 16 : 10;
        }

        String getSegmentStrPrefix() {
            if (this == OCTAL) {
                return "0";
            }
            if (this == HEX) {
                return "0x";
            }
            return null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this == OCTAL ? "octal" : this == HEX ? "hexadecimal" : "decimal";
        }
    }

    public C6180b(I i10) {
        super(i10);
        if (i10.Z() != 4) {
            throw new AddressValueException("ipaddress.error.ipv4.invalid.segment.count", i10.Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Zf.c J1(byte[] bArr, Integer num, inet.ipaddr.a aVar) {
        return ((C6180b) aVar).y1().X0(bArr, 0, bArr.length, 4, num);
    }

    private C6180b w1(I i10) {
        return i10 == b1() ? this : y1().E(i10);
    }

    public C6205b A1() {
        C6208e.a aVarM = C1().m();
        inet.ipaddr.ipv6.V vA = aVarM.a(0);
        inet.ipaddr.ipv6.V[] vArrD = aVarM.d(6);
        vArrD[4] = vA;
        vArrD[3] = vA;
        vArrD[2] = vA;
        vArrD[1] = vA;
        vArrD[0] = vA;
        vArrD[5] = aVarM.a(65535);
        return B1(vArrD);
    }

    public C6205b B1(inet.ipaddr.ipv6.V[] vArr) {
        C6208e.a aVarM = C1().m();
        return aVarM.E(inet.ipaddr.ipv6.Q.o3(aVarM, vArr, this));
    }

    public C6208e C1() {
        return inet.ipaddr.a.s();
    }

    @Override // inet.ipaddr.g
    /* renamed from: D1, reason: merged with bridge method [inline-methods] */
    public C6180b Y0() {
        return b1().n3(this, true, false);
    }

    @Override // inet.ipaddr.g, Zf.b, cg.d
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public C6183e e() {
        return inet.ipaddr.a.j();
    }

    @Override // inet.ipaddr.a
    /* renamed from: F1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public I v() {
        return (I) super.v();
    }

    @Override // Zf.e
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public M q(int i10) {
        return b1().q(i10);
    }

    public C6180b H1() {
        return b1().n3(this, false, false);
    }

    public boolean I1() {
        return q(0).P2(224, 4);
    }

    public long K1() {
        return b1().Y3();
    }

    @Override // inet.ipaddr.g
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public C6180b i1(inet.ipaddr.g gVar) {
        return M1(gVar, false);
    }

    public C6180b M1(inet.ipaddr.g gVar, boolean z10) {
        return w1(b1().Z3(x1(gVar).b1(), z10));
    }

    public C6180b N1(boolean z10) {
        return w1(b1().a4(z10));
    }

    @Override // inet.ipaddr.g
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public Y j1(inet.ipaddr.g gVar) {
        return S1(gVar);
    }

    @Override // java.lang.Iterable
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public InterfaceC5372b spliterator() {
        return b1().e4(this, y1(), false);
    }

    @Override // inet.ipaddr.g
    /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public Inet4Address p1() {
        return (Inet4Address) super.p1();
    }

    @Override // inet.ipaddr.g
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public Y r1() {
        C6180b c6180bT1 = t1();
        return new Y(c6180bT1.Y0(), c6180bT1.H1(), true);
    }

    public Y S1(inet.ipaddr.g gVar) {
        return new Y(this, x1(gVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // inet.ipaddr.g
    /* renamed from: T1, reason: merged with bridge method [inline-methods] */
    public C6180b s1(boolean z10) {
        if (i()) {
            return (d1() && h1()) ? Y0() : w1(b1().g3(z10));
        }
        C6183e c6183eE = e();
        c.b bVarD = c6183eE.d();
        C6180b c6180b = (C6180b) c6183eE.s(0, !bVarD.allPrefixedAddressesAreSubnets());
        return bVarD.zeroHostsAreSubnets() ? c6180b.Y0() : c6180b;
    }

    @Override // inet.ipaddr.g
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public C6180b t1() {
        return N1(false);
    }

    @Override // inet.ipaddr.a, Zf.e
    public int Z() {
        return 4;
    }

    @Override // inet.ipaddr.g
    public boolean e1() {
        return true;
    }

    @Override // inet.ipaddr.a, ag.InterfaceC3847e, ag.InterfaceC3849g
    public int f() {
        return 32;
    }

    @Override // inet.ipaddr.g
    public boolean g1() {
        return I1() ? q(0).N2(224) && q(1).c0() && q(2).c0() && q(3).N2(252) : q(0).N2(169) && q(1).N2(254);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return b1().z3(this, y1(), null);
    }

    @Override // inet.ipaddr.g
    public C6180b n1() {
        return this;
    }

    @Override // inet.ipaddr.g
    public C6205b o1() {
        return inet.ipaddr.g.f49482o.b(this);
    }

    @Override // inet.ipaddr.g
    protected inet.ipaddr.o q0() {
        return new o.a().t().q(e()).f().u().v(C1()).f().v();
    }

    @Override // ag.InterfaceC3849g
    public int v0() {
        return 4;
    }

    void v1(C6180b c6180b, C6180b c6180b2) {
        b1().d3(this, c6180b, c6180b2);
    }

    protected C6180b x1(inet.ipaddr.g gVar) {
        C6180b c6180bN1 = gVar.n1();
        if (c6180bN1 != null) {
            return c6180bN1;
        }
        throw new AddressConversionException(this, gVar);
    }

    C6183e.a y1() {
        return e().a();
    }

    @Override // cg.d
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public M m1(int i10) {
        return q(i10);
    }

    public C6180b(Inet4Address inet4Address) {
        this(inet4Address, inet4Address.getAddress(), null);
    }

    private C6180b(Inet4Address inet4Address, final byte[] bArr, final Integer num) {
        super(new Function() { // from class: inet.ipaddr.ipv4.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C6180b.J1(bArr, num, (inet.ipaddr.a) obj);
            }
        });
        b1().g1(inet4Address);
    }
}
