package inet.ipaddr;

import inet.ipaddr.b;
import inet.ipaddr.ipv4.C6183e;
import inet.ipaddr.ipv6.C6208e;
import java.math.BigInteger;
import java.util.function.Function;

/* loaded from: classes4.dex */
public abstract class a implements Zf.e {

    /* renamed from: c, reason: collision with root package name */
    public static final String f49277c = String.valueOf('-');

    /* renamed from: d, reason: collision with root package name */
    public static final String f49278d = String.valueOf((char) 187);

    /* renamed from: e, reason: collision with root package name */
    public static final String f49279e = String.valueOf('*');

    /* renamed from: f, reason: collision with root package name */
    public static final String f49280f = String.valueOf('%');

    /* renamed from: g, reason: collision with root package name */
    public static final String f49281g = String.valueOf('_');

    /* renamed from: h, reason: collision with root package name */
    public static final b f49282h = new b.a(true);

    /* renamed from: i, reason: collision with root package name */
    public static final b f49283i = new b.C1856b(true, false);

    /* renamed from: j, reason: collision with root package name */
    public static final b f49284j = new b.C1856b(true, true);

    /* renamed from: k, reason: collision with root package name */
    private static C6208e f49285k;

    /* renamed from: l, reason: collision with root package name */
    private static C6183e f49286l;

    /* renamed from: a, reason: collision with root package name */
    final Zf.c f49287a;

    /* renamed from: b, reason: collision with root package name */
    protected Zf.f f49288b;

    /* renamed from: inet.ipaddr.a$a, reason: collision with other inner class name */
    public interface InterfaceC1855a {
        int a(int i10);
    }

    protected a(Zf.c cVar) {
        this.f49287a = cVar;
        if (!e().g(cVar.e())) {
            throw new NetworkMismatchException(cVar);
        }
    }

    public static C6183e j() {
        if (f49286l == null) {
            synchronized (a.class) {
                try {
                    if (f49286l == null) {
                        f49286l = new C6183e();
                    }
                } finally {
                }
            }
        }
        return f49286l;
    }

    public static C6208e s() {
        if (f49285k == null) {
            synchronized (a.class) {
                try {
                    if (f49285k == null) {
                        f49285k = new C6208e();
                    }
                } finally {
                }
            }
        }
        return f49285k;
    }

    @Override // ag.InterfaceC3847e
    public Integer A() {
        return v().A();
    }

    @Override // ag.InterfaceC3849g
    public boolean A0() {
        return v().A0();
    }

    public boolean C(a aVar) {
        return aVar == this || v().equals(aVar.v());
    }

    @Override // cg.InterfaceC4258b
    public int H() {
        return v().H();
    }

    @Override // ag.InterfaceC3849g
    public boolean H0() {
        return v().H0();
    }

    @Override // ag.InterfaceC3849g
    public boolean L() {
        return v().L();
    }

    @Override // ag.InterfaceC3849g
    public boolean O() {
        return v().O();
    }

    @Override // ag.InterfaceC3849g
    public BigInteger R() {
        return v().R();
    }

    @Override // Zf.e
    public String Y() {
        return v().Y();
    }

    @Override // Zf.e
    public abstract int Z();

    @Override // Zf.b
    public String a0() {
        return v().a0();
    }

    @Override // ag.InterfaceC3849g
    public boolean c0() {
        return v().c0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (y(aVar.f49288b)) {
            return true;
        }
        return C(aVar);
    }

    @Override // ag.InterfaceC3847e, ag.InterfaceC3849g
    public abstract int f();

    public boolean g(a aVar) {
        if (aVar == this) {
            return true;
        }
        return v().x0(aVar.v());
    }

    @Override // ag.InterfaceC3847e, ag.InterfaceC3849g
    public BigInteger getCount() {
        return v().getCount();
    }

    @Override // ag.InterfaceC3849g
    public BigInteger getValue() {
        return v().getValue();
    }

    public int hashCode() {
        return v().hashCode();
    }

    @Override // ag.InterfaceC3847e
    public boolean i() {
        return v().i();
    }

    public String toString() {
        return Y();
    }

    @Override // ag.InterfaceC3847e
    public boolean u() {
        return v().u();
    }

    public Zf.c v() {
        return this.f49287a;
    }

    @Override // ag.InterfaceC3847e, cg.d
    public boolean x() {
        return v().x();
    }

    protected abstract boolean y(Zf.f fVar);

    protected a(Function function) {
        Zf.c cVar = (Zf.c) function.apply(this);
        this.f49287a = cVar;
        if (!e().g(cVar.e())) {
            throw new NetworkMismatchException(cVar);
        }
    }
}
