package C8;

import Li.N;
import P7.c;
import Yg.m;
import Zg.AbstractC3689v;
import com.ui.wifiman.ui.signal.w;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.text.t;
import nd.InterfaceC6935g;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import th.l;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class a extends w {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ l[] f2317p = {O.h(new F(a.class, "placesManager", "getPlacesManager()Lcom/ui/wifiman/model/signalmapper/SignalMapperPlacesManager;", 0)), O.h(new F(a.class, "analytics", "getAnalytics()Lcom/ubnt/usurvey/analytics/Analytics;", 0)), O.h(new F(a.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final int f2318q = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f2319g;

    /* renamed from: h, reason: collision with root package name */
    private final m f2320h;

    /* renamed from: i, reason: collision with root package name */
    private final m f2321i;

    /* renamed from: j, reason: collision with root package name */
    private final m f2322j;

    /* renamed from: k, reason: collision with root package name */
    private final Fg.a f2323k;

    /* renamed from: l, reason: collision with root package name */
    private final i f2324l;

    /* renamed from: m, reason: collision with root package name */
    private final i f2325m;

    /* renamed from: n, reason: collision with root package name */
    private final N f2326n;

    /* renamed from: o, reason: collision with root package name */
    private final N f2327o;

    /* renamed from: C8.a$a, reason: collision with other inner class name */
    static final class C0102a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0102a f2328a = new C0102a();

        C0102a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(String it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(!t.m0(it));
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2329a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            List list = it;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new d.c((String) it2.next()));
            }
            return arrayList;
        }
    }

    static final class c implements n {

        /* renamed from: C8.a$c$a, reason: collision with other inner class name */
        static final class C0103a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f2331a;

            C0103a(a aVar) {
                this.f2331a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(String nameString) {
                AbstractC6492s.i(nameString, "nameString");
                return this.f2331a.u0(nameString);
            }
        }

        public static final class b implements InterfaceC5915e {
            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.h("Can't create place with invalid name", null, 2, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean valid) {
            AbstractC6492s.i(valid, "valid");
            if (valid.booleanValue()) {
                return a.this.f2324l.o0().t(new C0103a(a.this));
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b());
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<InterfaceC6935g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends o<InterfaceC6084a> {
    }

    public a(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f2319g = di2;
        org.kodein.type.i iVarE = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6935g.class), null);
        l[] lVarArr = f2317p;
        this.f2320h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2321i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, P7.a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2322j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6084a.class), null).a(this, lVarArr[2]);
        Fg.a aVarK2 = Fg.a.k2("");
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f2323k = aVarK2;
        i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f2324l = iVarI2;
        i iVarI22 = iVarI2.N0(C0102a.f2328a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f2325m = iVarI22;
        this.f2326n = AbstractC8661g.d0(this, iVarI22, Boolean.FALSE, false, null, 6, null);
        i iVarN0 = w0().f().O1(1L).N0(b.f2329a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f2327o = AbstractC8661g.d0(this, iVarN0, AbstractC3689v.l(), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b u0(String str) {
        AbstractC5912b abstractC5912bG = w0().b(str).y().g(v0().d(new c.f.a())).g(x0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        return abstractC5912bG;
    }

    private final P7.a v0() {
        return (P7.a) this.f2321i.getValue();
    }

    private final InterfaceC6935g w0() {
        return (InterfaceC6935g) this.f2320h.getValue();
    }

    private final InterfaceC6084a x0() {
        return (InterfaceC6084a) this.f2322j.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f2319g;
    }

    @Override // com.ui.wifiman.ui.signal.w
    public N n0() {
        return this.f2327o;
    }

    @Override // com.ui.wifiman.ui.signal.w
    public N o0() {
        return this.f2326n;
    }

    @Override // com.ui.wifiman.ui.signal.w
    public void p0(String name) {
        AbstractC6492s.i(name, "name");
        C8658d.f66727a.d(u0(name), this);
    }

    @Override // com.ui.wifiman.ui.signal.w
    public void q0(String name) {
        AbstractC6492s.i(name, "name");
        this.f2323k.h(name);
    }

    @Override // com.ui.wifiman.ui.signal.w
    public void r0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT0 = this.f2325m.t0(new c());
        AbstractC6492s.h(abstractC5912bT0, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT0, this);
    }
}
