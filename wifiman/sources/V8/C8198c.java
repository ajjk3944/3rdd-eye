package v8;

import Li.N;
import Sd.d;
import Yg.m;
import gg.AbstractC5912b;
import gg.o;
import gg.q;
import gg.r;
import inet.ipaddr.g;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.i;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import th.l;
import uf.AbstractC8163a;
import ye.AbstractC8661g;
import ye.C8658d;

/* renamed from: v8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8198c extends AbstractC8163a {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ l[] f63514l = {O.h(new F(C8198c.class, "localConsoleService", "getLocalConsoleService()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleService;", 0)), O.h(new F(C8198c.class, "certificateManager", "getCertificateManager()Lcom/ui/wifiman/model/ubiquiti/console/local/UnifiLocalConsoleCertificateManager;", 0)), O.h(new F(C8198c.class, "popupController", "getPopupController()Lcom/ubnt/usurvey/ui/popup/console/DirectConsoleConnectionPopupController;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f63515m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f63516g;

    /* renamed from: h, reason: collision with root package name */
    private final m f63517h;

    /* renamed from: i, reason: collision with root package name */
    private final m f63518i;

    /* renamed from: j, reason: collision with root package name */
    private final m f63519j;

    /* renamed from: k, reason: collision with root package name */
    private final N f63520k;

    /* renamed from: v8.c$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63521a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(C6556a c6556a) {
            g gVarB;
            String strA;
            AbstractC6492s.i(c6556a, "<destruct>");
            d.b bVar = (d.b) c6556a.a();
            return (bVar == null || (gVarB = bVar.b()) == null || (strA = L8.f.a(gVarB)) == null) ? "" : strA;
        }
    }

    /* renamed from: v8.c$b */
    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f63522a = new b();

        /* renamed from: v8.c$b$a */
        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d.a f63523a;

            public a(d.a aVar) {
                this.f63523a = aVar;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    d.a aVar = this.f63523a;
                    d.a.AbstractC0739a.C0740a c0740a = aVar instanceof d.a.AbstractC0739a.C0740a ? (d.a.AbstractC0739a.C0740a) aVar : null;
                    if (c0740a != null) {
                        oVar.onSuccess(c0740a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(d.a it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: v8.c$c, reason: collision with other inner class name */
    static final class C2252c implements n {
        C2252c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(d.a.AbstractC0739a.C0740a c0740a) {
            AbstractC6492s.i(c0740a, "<destruct>");
            return C8198c.this.r0().a(c0740a.a(), c0740a.b());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v8.c$d */
    public static final class d extends org.kodein.type.o<Sd.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v8.c$e */
    public static final class e extends org.kodein.type.o<Sd.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v8.c$f */
    public static final class f extends org.kodein.type.o<InterfaceC8196a> {
    }

    public C8198c(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f63516g = di2;
        i iVarE = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Sd.d.class), null);
        l[] lVarArr = f63514l;
        this.f63517h = interfaceC7810x2A.a(this, lVarArr[0]);
        i iVarE2 = s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f63518i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, Sd.a.class), null).a(this, lVarArr[1]);
        i iVarE3 = s.e(new f().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f63519j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC8196a.class), null).a(this, lVarArr[2]);
        gg.i iVarN0 = s0().c().N0(a.f63521a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f63520k = AbstractC8661g.d0(this, iVarN0, "", false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sd.a r0() {
        return (Sd.a) this.f63518i.getValue();
    }

    private final Sd.d s0() {
        return (Sd.d) this.f63517h.getValue();
    }

    private final InterfaceC8196a t0() {
        return (InterfaceC8196a) this.f63519j.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f63516g;
    }

    @Override // uf.AbstractC8163a
    public N n0() {
        return this.f63520k;
    }

    @Override // uf.AbstractC8163a
    public void o0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = s0().a().o0().u(b.f63522a).k(new C2252c());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // uf.AbstractC8163a
    public void p0() {
        C8658d.f66727a.d(t0().dismiss(), this);
    }
}
