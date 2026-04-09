package H8;

import Fd.D;
import Li.N;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.ubiquiti.console.e;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import i8.InterfaceC6084a;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.AbstractC6561f;
import l9.C6556a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class b extends com.ui.wifiman.ui.teleport.consoles.c {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ th.l[] f7647m = {O.h(new F(b.class, "teleportManager", "getTeleportManager()Lcom/ui/wifiman/model/teleport/TeleportManager;", 0)), O.h(new F(b.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final int f7648n = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f7649g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f7650h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f7651i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f7652j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f7653k;

    /* renamed from: l, reason: collision with root package name */
    private final N f7654l;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(com.ui.wifiman.model.teleport.n it) {
            AbstractC6492s.i(it, "it");
            return b.this.s0().g(it.a().c().b());
        }
    }

    /* renamed from: H8.b$b, reason: collision with other inner class name */
    public static final class C0311b implements gg.k {
        public C0311b() {
        }

        @Override // gg.k
        public final void a(gg.j it) {
            AbstractC6492s.i(it, "it");
            try {
                it.h(b.this.n0());
            } catch (Throwable th2) {
                it.onError(th2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends org.kodein.type.o<D> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<InterfaceC6084a> {
    }

    static final class e implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7657a = new e();

        e() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(com.ui.wifiman.ui.teleport.consoles.b bVar, List teleports) {
            Object next;
            AbstractC6492s.i(bVar, "<destruct>");
            AbstractC6492s.i(teleports, "teleports");
            String strD = e.b.d(bVar.a());
            Iterator it = teleports.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (e.b.h(((com.ui.wifiman.model.teleport.n) next).a().c().b(), strD)) {
                    break;
                }
            }
            return new C6556a(next);
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f7658a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9.d apply(com.ui.wifiman.model.teleport.n it) {
            AbstractC6492s.i(it, "it");
            return new d.b(R.string.teleport_console_remove_title_format, AbstractC3689v.e(it.a().c().g()));
        }
    }

    public b(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f7649g = di2;
        org.kodein.type.i iVarE = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, D.class), null);
        th.l[] lVarArr = f7647m;
        this.f7650h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f7651i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        gg.i iVarI2 = gg.i.N(new C0311b(), EnumC5911a.LATEST).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f7652j = iVarI2;
        gg.i iVarV = gg.i.v(iVarI2, s0().getAll(), e.f7657a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        gg.i iVarI22 = AbstractC6561f.e(n9.c.c(iVarV, new InterfaceC6835l() { // from class: H8.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return b.u0(this.f7646a, (C6556a) obj);
            }
        })).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f7653k = iVarI22;
        gg.i iVarW = iVarI22.N0(f.f7658a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f7654l = AbstractC8661g.d0(this, iVarW, new d.c(""), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D s0() {
        return (D) this.f7650h.getValue();
    }

    private final InterfaceC6084a t0() {
        return (InterfaceC6084a) this.f7651i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5912b u0(b bVar, C6556a c6556a) {
        AbstractC6492s.i(c6556a, "<destruct>");
        if (((com.ui.wifiman.model.teleport.n) c6556a.a()) == null) {
            return bVar.t0().a(InterfaceC6084a.b.n.f48939a);
        }
        AbstractC5912b abstractC5912bM = AbstractC5912b.m();
        AbstractC6492s.f(abstractC5912bM);
        return abstractC5912bM;
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f7649g;
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.c
    public N getTitle() {
        return this.f7654l;
    }

    @Override // com.ui.wifiman.ui.teleport.consoles.c
    public void o0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f7653k.o0().t(new a());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }
}
