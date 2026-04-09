package Kc;

import Kc.a;
import Zg.AbstractC3689v;
import Zg.Q;
import ee.AbstractC5456b;
import ee.C5455a;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.h;
import gg.i;
import gg.y;
import gg.z;
import hg.InterfaceC6043c;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import sh.C7974i;

/* loaded from: classes4.dex */
public final class e implements Kc.a {

    /* renamed from: p, reason: collision with root package name */
    public static final a f10613p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final a.C0426a f10614a;

    /* renamed from: b, reason: collision with root package name */
    private final y f10615b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10616c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10617d;

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f10618e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicInteger f10619f;

    /* renamed from: g, reason: collision with root package name */
    private final long f10620g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f10621h;

    /* renamed from: i, reason: collision with root package name */
    private AtomicLong f10622i;

    /* renamed from: j, reason: collision with root package name */
    private final Fg.a f10623j;

    /* renamed from: k, reason: collision with root package name */
    private final Fg.a f10624k;

    /* renamed from: l, reason: collision with root package name */
    private final i f10625l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC5912b f10626m;

    /* renamed from: n, reason: collision with root package name */
    private final i f10627n;

    /* renamed from: o, reason: collision with root package name */
    private final i f10628o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10629a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(Long it) {
            AbstractC6492s.i(it, "it");
            return C5455a.f46379a.e(it.longValue());
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f10630a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(String it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("IP to scan generated - " + it, null, 2, null);
        }
    }

    public static final class d implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f10632b;

        public d(String str, e eVar) {
            this.f10631a = str;
            this.f10632b = eVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            C6556a c6556a;
            try {
                InetAddress byName = InetAddress.getByName(this.f10631a);
                if (byName.isReachable((int) this.f10632b.f10614a.b())) {
                    AbstractC6492s.f(byName);
                    c6556a = new C6556a(new a.b(AbstractC5456b.a(byName), System.currentTimeMillis()));
                } else {
                    c6556a = new C6556a(null);
                }
                interfaceC5910A.onSuccess(c6556a);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: Kc.e$e, reason: collision with other inner class name */
    static final class C0427e implements n {
        C0427e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(String it) {
            AbstractC6492s.i(it, "it");
            return e.this.s(it);
        }
    }

    static final class f implements n {

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f10635a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f10636b;

            public a(List list, e eVar) {
                this.f10635a = list;
                this.f10636b = eVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    AbstractC6492s.f(this.f10635a);
                    List list = this.f10635a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a.b bVar = (a.b) ((C6556a) it.next()).b();
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        this.f10636b.f10621h.addAll(arrayList);
                        this.f10636b.m();
                    }
                    this.f10636b.q(this.f10635a.size());
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(List results) {
            AbstractC6492s.i(results, "results");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(results, e.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class g implements InterfaceC6469f {
        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            e.this.v(true);
            Z7.b.h("ICMP Subnet scan " + System.identityHashCode(e.this.f10614a) + " (pool size: " + e.this.f10620g + ") SUBSCRIBED", null, 2, null);
        }
    }

    public e(a.C0426a params, y scheduler) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(scheduler, "scheduler");
        this.f10614a = params;
        this.f10615b = scheduler;
        C5455a c5455a = C5455a.f46379a;
        long jC = c5455a.c(params.a());
        this.f10616c = jC;
        long jA = c5455a.a(params.a());
        this.f10617d = jA;
        this.f10618e = new AtomicBoolean(false);
        this.f10619f = new AtomicInteger(0);
        this.f10620g = Math.min((jA - jC) - 1, 1024L);
        this.f10621h = new LinkedHashSet();
        this.f10622i = new AtomicLong(jC + 1);
        Fg.a aVarK2 = Fg.a.k2(o());
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f10623j = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(AbstractC3689v.l());
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f10624k = aVarK22;
        i iVarF0 = i.C0(new InterfaceC6469f() { // from class: Kc.c
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                e.r(this.f10611a, (h) obj);
            }
        }).N0(b.f10629a).f0(c.f10630a);
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        this.f10625l = iVarF0;
        C7974i c7974i = new C7974i(0, params.c());
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974i, 10));
        Iterator it = c7974i.iterator();
        while (it.hasNext()) {
            ((Q) it).d();
            arrayList.add(this.f10625l.x0(new C0427e()).F1(this.f10615b));
        }
        AbstractC5912b abstractC5912bY = i.S0(arrayList).d(500L, TimeUnit.MILLISECONDS).a1().t0(new f()).B(new g()).y(new InterfaceC6464a() { // from class: Kc.d
            @Override // kg.InterfaceC6464a
            public final void run() {
                e.u(this.f10612a);
            }
        });
        AbstractC6492s.h(abstractC5912bY, "doOnDispose(...)");
        this.f10626m = abstractC5912bY;
        i iVarI2 = this.f10623j.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f10627n = iVarI2;
        i iVarI22 = this.f10624k.U0(abstractC5912bY).e1().X0(Gg.a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f10628o = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.f10624k.h(AbstractC3689v.i1(this.f10621h));
    }

    private final void n() {
        this.f10623j.h(o());
    }

    private final a.c o() {
        return new a.c(this.f10618e.get(), p(), this.f10619f.get(), this.f10620g);
    }

    private final boolean p() {
        return ((long) this.f10619f.get()) >= this.f10620g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(int i10) {
        this.f10619f.addAndGet(i10);
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(e eVar, h emitter) {
        AbstractC6492s.i(emitter, "emitter");
        long andIncrement = eVar.f10622i.getAndIncrement();
        if (andIncrement <= eVar.f10617d) {
            emitter.h(Long.valueOf(andIncrement));
        } else {
            emitter.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z s(String str) {
        z zVarI = z.i(new d(str, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarG = zVarI.G(new n() { // from class: Kc.b
            @Override // kg.n
            public final Object apply(Object obj) {
                return e.t((Throwable) obj);
            }
        });
        AbstractC6492s.h(zVarG, "onErrorReturn(...)");
        return zVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6556a t(Throwable it) {
        AbstractC6492s.i(it, "it");
        return new C6556a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(e eVar) {
        eVar.v(false);
        Z7.b.h("ICMP Subnet scan " + System.identityHashCode(eVar.f10614a) + " DISPOSED", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(boolean z10) {
        this.f10618e.set(z10);
        n();
    }

    @Override // Kc.a
    public i a() {
        return this.f10627n;
    }

    @Override // Ec.t
    public i b() {
        return this.f10628o;
    }
}
