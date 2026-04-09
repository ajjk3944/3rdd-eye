package M8;

import Li.N;
import Zg.AbstractC3689v;
import com.ui.wifiman.ui.wifi.scan.prefs.quality.c;
import de.C5354E;
import de.InterfaceC5355F;
import gg.AbstractC5912b;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7810x2;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class x extends com.ui.wifiman.ui.wifi.scan.prefs.quality.d {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ th.l[] f13039l = {O.h(new kotlin.jvm.internal.F(x.class, "screenConfig", "getScreenConfig()Lcom/ui/wifiman/model/ui/WifiScanHomeConfigManager;", 0)), O.h(new kotlin.jvm.internal.F(x.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0))};

    /* renamed from: m, reason: collision with root package name */
    public static final int f13040m = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f13041g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f13042h;

    /* renamed from: i, reason: collision with root package name */
    private final Yg.m f13043i;

    /* renamed from: j, reason: collision with root package name */
    private final List f13044j;

    /* renamed from: k, reason: collision with root package name */
    private final N f13045k;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13046a;

        static {
            int[] iArr = new int[ic.c.values().length];
            try {
                iArr[ic.c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ic.c.HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13046a = iArr;
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13047a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ic.c apply(C5354E it) {
            AbstractC6492s.i(it, "it");
            return it.e();
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Ci.c apply(ic.c selected) {
            AbstractC6492s.i(selected, "selected");
            return x.this.s0(selected);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends org.kodein.type.o<InterfaceC5355F> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends org.kodein.type.o<InterfaceC6084a> {
    }

    public x(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f13041g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC5355F.class), null);
        th.l[] lVarArr = f13039l;
        this.f13042h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new e().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f13043i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        List listO = AbstractC3689v.o(ic.c.NUMBER, ic.c.HEALTH);
        this.f13044j = listO;
        gg.i iVarN0 = r0().b().N0(b.f13047a).W().N0(new c());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f13045k = AbstractC8661g.d0(this, iVarN0, s0((ic.c) AbstractC3689v.q0(listO)), false, null, 6, null);
    }

    private final InterfaceC5355F r0() {
        return (InterfaceC5355F) this.f13042h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ci.c s0(ic.c cVar) {
        com.ui.wifiman.ui.wifi.scan.prefs.quality.c aVar;
        List list = this.f13044j;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i10 = a.f13046a[((ic.c) it.next()).ordinal()];
            if (i10 == 1) {
                aVar = new c.a(cVar == ic.c.NUMBER);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new c.b(cVar == ic.c.HEALTH);
            }
            arrayList.add(aVar);
        }
        return Ci.a.h(arrayList);
    }

    private final InterfaceC6084a t0() {
        return (InterfaceC6084a) this.f13043i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5354E u0(com.ui.wifiman.ui.wifi.scan.prefs.quality.c cVar, C5354E it) {
        ic.c cVar2;
        AbstractC6492s.i(it, "it");
        if (cVar instanceof c.a) {
            cVar2 = ic.c.NUMBER;
        } else {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar2 = ic.c.HEALTH;
        }
        return C5354E.b(it, null, null, cVar2, null, 11, null);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f13041g;
    }

    @Override // com.ui.wifiman.ui.wifi.scan.prefs.quality.d
    public N n0() {
        return this.f13045k;
    }

    @Override // com.ui.wifiman.ui.wifi.scan.prefs.quality.d
    public void o0(final com.ui.wifiman.ui.wifi.scan.prefs.quality.c type) {
        AbstractC6492s.i(type, "type");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bG = r0().a(new InterfaceC6835l() { // from class: M8.w
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return x.u0(type, (C5354E) obj);
            }
        }).g(t0().a(InterfaceC6084a.b.n.f48939a));
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        c8658d.d(abstractC5912bG, this);
    }
}
