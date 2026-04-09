package D8;

import Li.N;
import Zg.AbstractC3689v;
import b8.AbstractC4074a;
import com.ui.wifiman.model.ubiquiti.uisp.UispController;
import df.AbstractC5369c;
import df.C5367a;
import df.EnumC5368b;
import ec.AbstractC5452a;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import kd.C6455e;
import kd.InterfaceC6454d;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.c;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class a extends AbstractC5369c {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ th.l[] f2898p = {O.h(new F(a.class, "uispController", "getUispController()Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;", 0)), O.h(new F(a.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), O.h(new F(a.class, "publicIPService", "getPublicIPService()Lcom/ui/wifiman/model/publicip/PublicIP$Service;", 0)), O.h(new F(a.class, "internetAvailability", "getInternetAvailability()Lcom/ui/wifiman/model/network/connection/InternetAvailabilityService;", 0))};

    /* renamed from: q, reason: collision with root package name */
    public static final int f2899q = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f2900g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f2901h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f2902i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f2903j;

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f2904k;

    /* renamed from: l, reason: collision with root package name */
    private final N f2905l;

    /* renamed from: m, reason: collision with root package name */
    private final N f2906m;

    /* renamed from: n, reason: collision with root package name */
    private final N f2907n;

    /* renamed from: o, reason: collision with root package name */
    private final N f2908o;

    /* renamed from: D8.a$a, reason: collision with other inner class name */
    static final class C0142a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0142a f2909a = new C0142a();

        C0142a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5367a apply(AbstractC4074a it) {
            AbstractC6492s.i(it, "it");
            return new C5367a(it);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2910a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ci.c apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            UispController.a aVar = (UispController.a) bVar.a();
            List listC = AbstractC3689v.c();
            String strB = aVar != null ? aVar.b() : null;
            if (strB != null && !kotlin.text.t.m0(strB)) {
                listC.add(EnumC5368b.PHONE_CALL);
            }
            String strA = aVar != null ? aVar.a() : null;
            if (strA != null && !kotlin.text.t.m0(strA)) {
                listC.add(EnumC5368b.EMAIL);
            }
            String strE = aVar != null ? aVar.e() : null;
            if (strE != null && !kotlin.text.t.m0(strE)) {
                listC.add(EnumC5368b.WEBSITE);
            }
            return Ci.a.h(AbstractC3689v.a(listC));
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f2911a = new c();

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b publicIPState, Wc.b uispInfoFetch) throws URISyntaxException {
            c.b bVar;
            URL urlA;
            String strC;
            URI uriA;
            AbstractC6492s.i(publicIPState, "publicIPState");
            AbstractC6492s.i(uispInfoFetch, "uispInfoFetch");
            UispController.a aVar = (UispController.a) uispInfoFetch.b();
            if (aVar == null || (strC = aVar.c()) == null || (uriA = L8.j.f11266a.a(strC)) == null) {
                C6455e c6455e = (C6455e) publicIPState.b();
                if (c6455e == null || (urlA = c6455e.a()) == null) {
                    bVar = null;
                } else {
                    URI uri = urlA.toURI();
                    AbstractC6492s.h(uri, "toURI(...)");
                    bVar = new c.b(uri, null, null, null, 14, null);
                }
            } else {
                bVar = new c.b(uriA, null, null, null, 14, null);
            }
            return new C6556a(bVar);
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f2912a = new d();

        d() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Wc.b publicIPState, Wc.b uispInfoFetch) {
            d.c cVar;
            String strB;
            String strD;
            AbstractC6492s.i(publicIPState, "publicIPState");
            AbstractC6492s.i(uispInfoFetch, "uispInfoFetch");
            UispController.a aVar = (UispController.a) uispInfoFetch.b();
            if (aVar == null || (strD = aVar.d()) == null) {
                C6455e c6455e = (C6455e) publicIPState.b();
                cVar = (c6455e == null || (strB = c6455e.b()) == null) ? null : new d.c(strB);
            } else {
                cVar = new d.c(strD);
            }
            return new C6556a(cVar);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC5368b f2913a;

        /* renamed from: D8.a$e$a, reason: collision with other inner class name */
        public /* synthetic */ class C0143a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2914a;

            static {
                int[] iArr = new int[EnumC5368b.values().length];
                try {
                    iArr[EnumC5368b.EMAIL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5368b.PHONE_CALL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5368b.WEBSITE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2914a = iArr;
            }
        }

        public static final class b implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumC5368b f2915a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UispController.a f2916b;

            public b(EnumC5368b enumC5368b, UispController.a aVar) {
                this.f2915a = enumC5368b;
                this.f2916b = aVar;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                String strA;
                String strB;
                String strE;
                try {
                    int i10 = C0143a.f2914a[this.f2915a.ordinal()];
                    Object dVar = null;
                    if (i10 == 1) {
                        UispController.a aVar = this.f2916b;
                        if (aVar != null && (strA = aVar.a()) != null) {
                            dVar = new InterfaceC6084a.b.D.d(new AbstractC5452a.b(strA), null, null, null, 8, null);
                        }
                    } else if (i10 == 2) {
                        UispController.a aVar2 = this.f2916b;
                        if (aVar2 != null && (strB = aVar2.b()) != null) {
                            dVar = new InterfaceC6084a.b.D.c(strB);
                        }
                    } else {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        UispController.a aVar3 = this.f2916b;
                        if (aVar3 != null && (strE = aVar3.e()) != null) {
                            dVar = new InterfaceC6084a.b.o(strE);
                        }
                    }
                    if (dVar != null) {
                        oVar.onSuccess(dVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        e(EnumC5368b enumC5368b) {
            this.f2913a = enumC5368b;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Wc.b bVar) {
            AbstractC6492s.i(bVar, "<destruct>");
            gg.n nVarC = gg.n.c(new b(this.f2913a, (UispController.a) bVar.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class f implements kg.n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC6084a.b viewRequest) {
            AbstractC6492s.i(viewRequest, "viewRequest");
            return a.this.w0().a(viewRequest);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends org.kodein.type.o<UispController> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends org.kodein.type.o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends org.kodein.type.o<InterfaceC6454d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends org.kodein.type.o<Zc.a> {
    }

    public a(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f2900g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, UispController.class), null);
        th.l[] lVarArr = f2898p;
        this.f2901h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2902i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new i().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2903j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC6454d.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f2904k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Zc.a.class), null).a(this, lVarArr[3]);
        gg.i iVarW = gg.i.v(u0().a(), v0().a(), c.f2911a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f2905l = AbstractC8661g.h0(this, iVarW, null, null, 2, null);
        gg.i iVarW2 = gg.i.v(u0().a(), v0().a(), d.f2912a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f2906m = AbstractC8661g.h0(this, iVarW2, null, null, 2, null);
        gg.i iVarW3 = t0().a().N0(C0142a.f2909a).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f2907n = AbstractC8661g.d0(this, iVarW3, new C5367a(AbstractC4074a.b.f33000a), false, null, 6, null);
        gg.i iVarW4 = v0().a().N0(b.f2910a).W();
        AbstractC6492s.h(iVarW4, "distinctUntilChanged(...)");
        this.f2908o = AbstractC8661g.d0(this, iVarW4, Ci.a.a(), false, null, 6, null);
    }

    private final Zc.a t0() {
        return (Zc.a) this.f2904k.getValue();
    }

    private final InterfaceC6454d u0() {
        return (InterfaceC6454d) this.f2903j.getValue();
    }

    private final UispController v0() {
        return (UispController) this.f2901h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a w0() {
        return (InterfaceC6084a) this.f2902i.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f2900g;
    }

    @Override // df.AbstractC5369c
    public N n0() {
        return this.f2907n;
    }

    @Override // df.AbstractC5369c
    public N o0() {
        return this.f2908o;
    }

    @Override // df.AbstractC5369c
    public N p0() {
        return this.f2905l;
    }

    @Override // df.AbstractC5369c
    public N q0() {
        return this.f2906m;
    }

    @Override // df.AbstractC5369c
    public void r0(EnumC5368b type) {
        AbstractC6492s.i(type, "type");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = v0().a().o0().u(new e(type)).k(new f());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }
}
