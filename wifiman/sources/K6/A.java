package K6;

import G6.E;
import com.polidea.rxandroidble3.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.polidea.rxandroidble3.exceptions.BleGattException;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;

/* loaded from: classes3.dex */
class A implements B {

    /* renamed from: a, reason: collision with root package name */
    private final J5.b f10275a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.s f10276b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.s f10277c;

    class a implements InterfaceC6469f {
        a() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            I6.q.e(th2, "Failed to monitor adapter state.", new Object[0]);
        }
    }

    class b implements InterfaceC6469f {
        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(BleException bleException) {
            I6.q.p("An exception received, indicating that the adapter has became unusable.", new Object[0]);
        }
    }

    class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10280a;

        c(String str) {
            this.f10280a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BleException apply(Boolean bool) {
            return BleDisconnectedException.a(this.f10280a);
        }
    }

    class d implements InterfaceC6464a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6043c f10282a;

        d(InterfaceC6043c interfaceC6043c) {
            this.f10282a = interfaceC6043c;
        }

        @Override // kg.InterfaceC6464a
        public void run() {
            this.f10282a.dispose();
        }
    }

    class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.v apply(BleException bleException) {
            return gg.s.L(bleException);
        }
    }

    class f implements kg.p {
        f() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    class g implements kg.n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(E.b bVar) {
            return Boolean.valueOf(bVar.a());
        }
    }

    A(String str, P6.G g10, gg.s sVar) {
        J5.b bVarL1 = J5.b.l1();
        this.f10275a = bVarL1;
        gg.s sVarI1 = bVarL1.O().B().H(new d(c(g10, sVar).i0(new c(str)).F(new b()).J0(bVarL1, new a()))).w0().i1(0);
        this.f10276b = sVarI1;
        this.f10277c = sVarI1.Q(new e());
    }

    private static gg.s c(P6.G g10, gg.s sVar) {
        return sVar.i0(new g()).I0(Boolean.valueOf(g10.c())).N(new f());
    }

    @Override // K6.B
    public gg.s a() {
        return this.f10276b;
    }

    public gg.s b() {
        return this.f10277c;
    }

    public void d(BleDisconnectedException bleDisconnectedException) {
        this.f10275a.accept(bleDisconnectedException);
    }

    public void e(BleGattException bleGattException) {
        this.f10275a.accept(bleGattException);
    }
}
