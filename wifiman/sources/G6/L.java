package G6;

import G6.E;
import G6.G;
import G6.InterfaceC2891a;
import P6.C3415c;
import P6.C3422j;
import com.polidea.rxandroidble3.exceptions.BleScanException;
import java.util.HashMap;
import java.util.Map;
import kg.InterfaceC6469f;
import x2.InterfaceC8419a;

/* loaded from: classes3.dex */
class L extends G {

    /* renamed from: a, reason: collision with root package name */
    final O6.a f7003a;

    /* renamed from: b, reason: collision with root package name */
    private final P6.I f7004b;

    /* renamed from: c, reason: collision with root package name */
    private final I6.o f7005c;

    /* renamed from: d, reason: collision with root package name */
    final N6.B f7006d;

    /* renamed from: e, reason: collision with root package name */
    final N6.q f7007e;

    /* renamed from: f, reason: collision with root package name */
    final kg.n f7008f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC2891a.b f7009g;

    /* renamed from: h, reason: collision with root package name */
    final gg.y f7010h;

    /* renamed from: i, reason: collision with root package name */
    final Map f7011i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final C3415c f7012j;

    /* renamed from: k, reason: collision with root package name */
    private final P6.G f7013k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.s f7014l;

    /* renamed from: m, reason: collision with root package name */
    private final P6.x f7015m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC8419a f7016n;

    /* renamed from: o, reason: collision with root package name */
    private final Q6.a f7017o;

    /* renamed from: p, reason: collision with root package name */
    private final P6.q f7018p;

    /* renamed from: q, reason: collision with root package name */
    private final C3422j f7019q;

    L(C3415c c3415c, P6.G g10, O6.a aVar, gg.s sVar, P6.I i10, P6.x xVar, InterfaceC8419a interfaceC8419a, I6.o oVar, N6.B b10, N6.q qVar, kg.n nVar, gg.y yVar, InterfaceC2891a.b bVar, Q6.a aVar2, P6.q qVar2, C3422j c3422j) {
        this.f7003a = aVar;
        this.f7012j = c3415c;
        this.f7013k = g10;
        this.f7014l = sVar;
        this.f7004b = i10;
        this.f7015m = xVar;
        this.f7016n = interfaceC8419a;
        this.f7005c = oVar;
        this.f7006d = b10;
        this.f7007e = qVar;
        this.f7008f = nVar;
        this.f7010h = yVar;
        this.f7009g = bVar;
        this.f7017o = aVar2;
        this.f7018p = qVar2;
        this.f7019q = c3422j;
    }

    private void k() {
        if (!this.f7013k.b()) {
            throw new UnsupportedOperationException("RxAndroidBle library needs a BluetoothAdapter to be available in the system to work. If this is a test on an emulator then you can use 'https://github.com/Polidea/RxAndroidBle/tree/master/mockrxandroidble'");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean l(E.b bVar) {
        return bVar != E.b.f6993c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gg.r m(E.b bVar) {
        return gg.n.i(new BleScanException(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Q6.f fVar) {
        if (I6.q.i()) {
            I6.q.k("%s", fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ gg.v o(Q6.g gVar, Q6.d[] dVarArr) {
        this.f7007e.a(gVar.h());
        N6.A a10 = this.f7006d.a(gVar, dVarArr);
        return this.f7003a.a(a10.f15317a).e1(this.f7010h).g(a10.f15318b).i0(this.f7008f).F(new InterfaceC6469f() { // from class: G6.I
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                L.n((Q6.f) obj);
            }
        }).m0(j());
    }

    @Override // G6.G
    public O b(String str) {
        k();
        return this.f7005c.a(str);
    }

    @Override // G6.G
    public G.a c() {
        return !this.f7013k.b() ? G.a.BLUETOOTH_NOT_AVAILABLE : !this.f7015m.b() ? G.a.LOCATION_PERMISSION_NOT_GRANTED : !this.f7013k.c() ? G.a.BLUETOOTH_NOT_ENABLED : !this.f7015m.a() ? G.a.LOCATION_SERVICES_NOT_ENABLED : G.a.READY;
    }

    @Override // G6.G
    public gg.s d() {
        return (gg.s) this.f7016n.get();
    }

    @Override // G6.G
    public gg.s e(final Q6.g gVar, final Q6.d... dVarArr) {
        return gg.s.r(new kg.q() { // from class: G6.H
            @Override // kg.q
            public final Object get() {
                return this.f7000a.o(gVar, dVarArr);
            }
        });
    }

    protected void finalize() throws Throwable {
        this.f7009g.a();
        super.finalize();
    }

    gg.s j() {
        return this.f7014l.N(new kg.p() { // from class: G6.J
            @Override // kg.p
            public final boolean test(Object obj) {
                return L.l((E.b) obj);
            }
        }).O().j(new kg.n() { // from class: G6.K
            @Override // kg.n
            public final Object apply(Object obj) {
                return L.m((E.b) obj);
            }
        }).B();
    }
}
