package Dc;

import Dc.t;
import Ec.t;
import Yg.J;
import Zg.AbstractC3689v;
import gg.C;
import gg.InterfaceC5910A;
import gg.y;
import gg.z;
import hg.InterfaceC6043c;
import inet.ipaddr.ipv4.C6180b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public abstract class t implements Ec.t {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3262c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Set f3263a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f3264b = Yg.n.b(new InterfaceC6824a() { // from class: Dc.s
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return t.o(this.f3261a);
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f3265a;

        b(List list) {
            this.f3265a = list;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(Object it) {
            List listI1;
            AbstractC6492s.i(it, "it");
            List list = this.f3265a;
            synchronized (list) {
                listI1 = AbstractC3689v.i1(list);
            }
            return listI1;
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f3266a;

        c(List list) {
            this.f3266a = list;
        }

        @Override // kg.InterfaceC6469f
        public final void accept(Object it) {
            AbstractC6492s.i(it, "it");
            List list = this.f3266a;
            synchronized (list) {
                list.add(it);
                J j10 = J.f24997a;
            }
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3267a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(k it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f3268a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(Map it) {
            AbstractC6492s.i(it, "it");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = it.entrySet().iterator();
            while (it2.hasNext()) {
                inet.ipaddr.g gVar = (inet.ipaddr.g) ((Map.Entry) it2.next()).getKey();
                if (gVar instanceof C6180b) {
                    linkedHashSet.add(gVar);
                }
            }
            return linkedHashSet;
        }
    }

    static final class f implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f3270a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List apply(List it) {
                AbstractC6492s.i(it, "it");
                ArrayList arrayList = new ArrayList();
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    t.b bVar = (t.b) ((C6556a) it2.next()).b();
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ inet.ipaddr.g f3271a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f3272b;

            b(inet.ipaddr.g gVar, t tVar) {
                this.f3271a = gVar;
                this.f3272b = tVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Z7.b.g("Stream[" + this.f3271a + "] SUBSCRIBED", this.f3272b.i());
            }
        }

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(inet.ipaddr.g gVar, t tVar) {
            Z7.b.g("Stream[" + gVar + "] Finished", tVar.i());
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Set allDiscoveredIpAddresses) {
            ArrayList arrayList;
            z zVarL;
            z zVarN;
            AbstractC6492s.i(allDiscoveredIpAddresses, "allDiscoveredIpAddresses");
            Set set = t.this.f3263a;
            final t tVar = t.this;
            synchronized (set) {
                try {
                    arrayList = new ArrayList();
                    Iterator it = allDiscoveredIpAddresses.iterator();
                    while (it.hasNext()) {
                        final inet.ipaddr.g gVar = (inet.ipaddr.g) it.next();
                        z zVarN2 = tVar.n(gVar);
                        if (zVarN2 == null || (zVarN = zVarN2.n(new b(gVar, tVar))) == null || (zVarL = zVarN.l(new InterfaceC6464a() { // from class: Dc.u
                            @Override // kg.InterfaceC6464a
                            public final void run() {
                                t.f.c(gVar, tVar);
                            }
                        })) == null) {
                            zVarL = null;
                        } else if (tVar.k() != null) {
                            y yVarK = tVar.k();
                            AbstractC6492s.f(yVarK);
                            zVarL = zVarL.O(yVarK);
                        }
                        if (zVarL != null) {
                            arrayList.add(zVarL);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return t.this.l(arrayList).N0(a.f3270a);
        }
    }

    static final class g implements InterfaceC6469f {
        g() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("Discovery engine " + t.this.i() + " emitted: " + it.size(), t.this.i());
        }
    }

    static final class h implements InterfaceC6469f {
        h() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("SUBSCRIBED", t.this.i());
        }
    }

    static final class i implements InterfaceC6469f {
        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.c("Error", it, t.this.i());
        }
    }

    public static final class j implements C {
        public j() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(t.this.h());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    private final gg.i j() {
        return (gg.i) this.f3264b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i l(Collection collection) {
        ArrayList arrayList = new ArrayList();
        gg.i iVarI2 = z.C(collection).f0(new c(arrayList)).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        gg.i iVarN0 = iVarI2.O(500L, TimeUnit.MILLISECONDS).e1().V0(iVarI2.n0()).N0(new b(arrayList));
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z n(inet.ipaddr.g gVar) {
        if (this.f3263a.contains(gVar)) {
            return null;
        }
        this.f3263a.add(gVar);
        return m(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i o(final t tVar) {
        z zVarI = z.i(tVar.new j());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarZ = zVarI.w(d.f3267a).e1().X0(Gg.a.a()).N0(e.f3268a).W().p0(tVar.new f()).W().f0(tVar.new g()).o1(1).i2().g0(tVar.new h()).d0(tVar.new i()).Z(new InterfaceC6464a() { // from class: Dc.r
            @Override // kg.InterfaceC6464a
            public final void run() {
                t.p(this.f3260a);
            }
        });
        AbstractC6492s.h(iVarZ, "doFinally(...)");
        return iVarZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(t tVar) {
        Z7.b.g("Finished", tVar.i());
    }

    @Override // Ec.t
    public gg.i b() {
        return j();
    }

    public abstract k h();

    protected abstract String i();

    protected abstract y k();

    protected abstract z m(inet.ipaddr.g gVar);
}
