package P8;

import Ce.a;
import If.U;
import Li.N;
import gg.C;
import gg.InterfaceC5910A;
import gg.o;
import gg.q;
import gg.r;
import gg.z;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import org.kodein.di.DI;
import org.kodein.type.s;
import ua.InterfaceC8153a;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import ye.AbstractC8661g;

/* loaded from: classes3.dex */
public class c extends U {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18223j = {O.h(new F(c.class, "productCatalog", "getProductCatalog()Lcom/ui/product/catalog/uidb/UiDBProductCatalogRx3;", 0))};

    /* renamed from: k, reason: collision with root package name */
    public static final int f18224k = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18225g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18226h;

    /* renamed from: i, reason: collision with root package name */
    private final N f18227i;

    static final class a implements n {

        /* renamed from: P8.c$a$a, reason: collision with other inner class name */
        static final class C0642a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f18229a;

            C0642a(String str) {
                this.f18229a = str;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(InterfaceC8290a browser) {
                AbstractC6492s.i(browser, "browser");
                return new C6556a(browser.c(this.f18229a));
            }
        }

        a() {
        }

        public final Dj.a a(String productId) {
            AbstractC6492s.i(productId, "productId");
            return c.this.r0().b().N0(new C0642a(productId));
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((InterfaceC8153a.C2195a) obj).l());
        }
    }

    static final class b implements n {

        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8439a.d f18231a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f18232b;

            public a(InterfaceC8439a.d dVar, c cVar) {
                this.f18231a = dVar;
                this.f18232b = cVar;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    InterfaceC8439a.d dVar = this.f18231a;
                    Ce.a aVarQ0 = dVar != null ? this.f18232b.q0(dVar) : null;
                    if (aVarQ0 != null) {
                        oVar.onSuccess(aVarQ0);
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
        public final r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((InterfaceC8439a.d) c6556a.a(), c.this));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: P8.c$c, reason: collision with other inner class name */
    public static final class C0643c extends org.kodein.type.o<xa.o> {
    }

    public static final class d implements C {
        public d() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(InterfaceC8153a.C2195a.a(c.this.s0()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public c(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18225g = di2;
        org.kodein.type.i iVarE = s.e(new C0643c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18226h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, xa.o.class), null).a(this, f18223j[0]);
        z zVarI = z.i(new d());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarW = zVarI.w(new a()).v0(new b()).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f18227i = AbstractC8661g.d0(this, iVarW, new Ce.a(new a.d("", "https://www.ui.com/compliance/"), null, null, null, null, 30, null), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Ce.a q0(ua.InterfaceC8153a r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P8.c.q0(ua.a):Ce.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xa.o r0() {
        return (xa.o) this.f18226h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s0() {
        return com.ubnt.usurvey.product.l.WM_W_d64.m16getId2jxHnRY();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18225g;
    }

    @Override // Ce.b
    public N z() {
        return this.f18227i;
    }
}
