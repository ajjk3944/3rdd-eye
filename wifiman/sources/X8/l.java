package x8;

import Li.N;
import Yg.m;
import com.ui.wifiman.ui.signal.AbstractC5232e;
import com.ui.wifiman.ui.signal.EnumC5231d;
import de.y;
import de.z;
import gc.EnumC5894a;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class l extends AbstractC5232e {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f65435k = {O.h(new F(l.class, "screenConfig", "getScreenConfig()Lcom/ui/wifiman/model/ui/SignalTabConfigManager;", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final int f65436l = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f65437g;

    /* renamed from: h, reason: collision with root package name */
    private final m f65438h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f65439i;

    /* renamed from: j, reason: collision with root package name */
    private final N f65440j;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65441a;

        static {
            int[] iArr = new int[EnumC5231d.values().length];
            try {
                iArr[EnumC5231d.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5231d.FLOORPLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65441a = iArr;
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f65442a = new b();

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f65443a;

            static {
                int[] iArr = new int[EnumC5894a.values().length];
                try {
                    iArr[EnumC5894a.SIGNAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5894a.FLOORPLAN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f65443a = iArr;
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC5231d apply(y it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f65443a[it.d().ordinal()];
            if (i10 == 1) {
                return EnumC5231d.SIGNAL;
            }
            if (i10 == 2) {
                return EnumC5231d.FLOORPLAN;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<z> {
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f65444a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(EnumC5231d it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(it);
        }
    }

    public l(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f65437g = di2;
        org.kodein.type.i iVarE = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f65438h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, z.class), null).a(this, f65435k[0]);
        gg.i iVarI2 = q0().b().N0(b.f65442a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f65439i = iVarI2;
        gg.i iVarN0 = iVarI2.N0(d.f65444a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f65440j = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
    }

    private final z q0() {
        return (z) this.f65438h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y r0(EnumC5231d enumC5231d, y it) {
        EnumC5894a enumC5894a;
        AbstractC6492s.i(it, "it");
        int i10 = a.f65441a[enumC5231d.ordinal()];
        if (i10 == 1) {
            enumC5894a = EnumC5894a.SIGNAL;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC5894a = EnumC5894a.FLOORPLAN;
        }
        return y.b(it, enumC5894a, null, null, 6, null);
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f65437g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        super.l0();
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5232e
    public N n0() {
        return this.f65440j;
    }

    @Override // com.ui.wifiman.ui.signal.AbstractC5232e
    public void o0(final EnumC5231d tab) {
        AbstractC6492s.i(tab, "tab");
        C8658d.f66727a.d(q0().a(new InterfaceC6835l() { // from class: x8.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return l.r0(tab, (y) obj);
            }
        }), this);
    }
}
