package K6;

import android.bluetooth.BluetoothGatt;
import hg.InterfaceC6043c;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import mg.AbstractC6822a;

/* loaded from: classes3.dex */
class n0 {

    /* renamed from: a, reason: collision with root package name */
    final O6.d f10427a;

    /* renamed from: b, reason: collision with root package name */
    final BluetoothGatt f10428b;

    /* renamed from: c, reason: collision with root package name */
    final M6.k f10429c;

    /* renamed from: d, reason: collision with root package name */
    private gg.z f10430d;

    /* renamed from: e, reason: collision with root package name */
    final Hg.d f10431e = Hg.a.k1().i1();

    /* renamed from: f, reason: collision with root package name */
    boolean f10432f = false;

    class a implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TimeUnit f10434b;

        a(long j10, TimeUnit timeUnit) {
            this.f10433a = j10;
            this.f10434b = timeUnit;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(InterfaceC6043c interfaceC6043c) {
            n0.this.f10431e.h(new M6.x(this.f10433a, this.f10434b, Gg.a.a()));
        }
    }

    class b implements InterfaceC6464a {
        b() {
        }

        @Override // kg.InterfaceC6464a
        public void run() {
            n0.this.f10432f = true;
        }
    }

    class c implements InterfaceC6464a {
        c() {
        }

        @Override // kg.InterfaceC6464a
        public void run() {
            n0.this.d();
        }
    }

    class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G6.P apply(List list) {
            return new G6.P(list);
        }
    }

    class e implements kg.p {
        e() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(List list) {
            return list.size() > 0;
        }
    }

    class f implements Callable {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            return n0.this.f10428b.getServices();
        }
    }

    class g implements kg.n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.z apply(M6.x xVar) {
            return n0.this.f10427a.a(n0.this.f10429c.e(xVar.f12751a, xVar.f12752b)).P();
        }
    }

    n0(O6.d dVar, BluetoothGatt bluetoothGatt, M6.k kVar) {
        this.f10427a = dVar;
        this.f10428b = bluetoothGatt;
        this.f10429c = kVar;
        d();
    }

    private gg.n b() {
        return gg.z.x(new f()).r(new e());
    }

    private gg.z c() {
        return this.f10431e.P();
    }

    private kg.n e() {
        return new g();
    }

    private static kg.n f() {
        return new d();
    }

    gg.z a(long j10, TimeUnit timeUnit) {
        return this.f10432f ? this.f10430d : this.f10430d.n(new a(j10, timeUnit));
    }

    void d() {
        this.f10432f = false;
        this.f10430d = b().p(f()).x(c().s(e())).o(AbstractC6822a.a(new b())).m(AbstractC6822a.a(new c())).e();
    }
}
