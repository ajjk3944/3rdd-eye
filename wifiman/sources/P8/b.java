package P8;

import If.AbstractC3025e;
import If.C3023c;
import If.C3024d;
import Li.N;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.product.r;
import com.ubnt.usurvey.product.s;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.model.wmw.d;
import gg.AbstractC5912b;
import gg.o;
import gg.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import s9.c;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class b extends AbstractC3025e {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18210k = {O.h(new F(b.class, "wizard", "getWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0)), O.h(new F(b.class, "discovery", "getDiscovery()Lcom/ui/wifiman/model/wmw/WifimanWizardDiscovery;", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final int f18211l = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18212g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18213h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f18214i;

    /* renamed from: j, reason: collision with root package name */
    private final N f18215j;

    static final class a implements n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3024d apply(Set devices) {
            AbstractC6492s.i(devices, "devices");
            Set<d.a> set = devices;
            b bVar = b.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(set, 10));
            for (d.a aVar : set) {
                String strS0 = bVar.s0(aVar);
                r rVarA = s.a(com.ubnt.usurvey.product.l.WM_W_d64);
                AbstractC6492s.f(rVarA);
                arrayList.add(new C3023c(strS0, new c.a(rVarA.a(), null, 2, null), Q8.a.f19239a.a(aVar.b())));
            }
            return new C3024d(arrayList);
        }
    }

    /* renamed from: P8.b$b, reason: collision with other inner class name */
    static final class C0641b implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3023c f18218b;

        /* renamed from: P8.b$b$a */
        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f18219a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f18220b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3023c f18221c;

            public a(Set set, b bVar, C3023c c3023c) {
                this.f18219a = set;
                this.f18220b = bVar;
                this.f18221c = c3023c;
            }

            @Override // gg.q
            public final void a(o oVar) {
                Object next;
                try {
                    AbstractC6492s.f(this.f18219a);
                    Iterator it = this.f18219a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (AbstractC6492s.d(this.f18220b.s0((d.a) next), this.f18221c.a())) {
                            break;
                        }
                    }
                    d.a aVar = (d.a) next;
                    if (aVar != null) {
                        oVar.onSuccess(aVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        C0641b(C3023c c3023c) {
            this.f18218b = c3023c;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Set devices) {
            AbstractC6492s.i(devices, "devices");
            gg.n nVarC = gg.n.c(new a(devices, b.this, this.f18218b));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(d.a result) {
            AbstractC6492s.i(result, "result");
            return b.this.t0().b(result.b());
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<WifimanWizard> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<com.ui.wifiman.model.wmw.d> {
    }

    public b(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18212g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, WifimanWizard.class), null);
        th.l[] lVarArr = f18210k;
        this.f18213h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18214i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.wmw.d.class), null).a(this, lVarArr[1]);
        gg.i iVarN0 = r0().a().N0(new a());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f18215j = AbstractC8661g.d0(this, iVarN0, new C3024d(AbstractC3689v.l()), false, null, 6, null);
    }

    private final com.ui.wifiman.model.wmw.d r0() {
        return (com.ui.wifiman.model.wmw.d) this.f18214i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s0(d.a aVar) {
        return aVar.b().d("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifimanWizard t0() {
        return (WifimanWizard) this.f18213h.getValue();
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f18212g;
    }

    @Override // If.AbstractC3025e
    public N n0() {
        return this.f18215j;
    }

    @Override // If.AbstractC3025e
    public void o0(C3023c device) {
        AbstractC6492s.i(device, "device");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = r0().a().o0().u(new C0641b(device)).k(new c());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }
}
