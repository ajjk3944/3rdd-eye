package E0;

import C0.AbstractC2521a;
import C0.AbstractC2522b;
import C0.C2533m;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6835l;

/* renamed from: E0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2619a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2621b f3814a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3815b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3816c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3817d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3818e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3819f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3820g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC2621b f3821h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f3822i;

    /* renamed from: E0.a$a, reason: collision with other inner class name */
    static final class C0168a extends AbstractC6494u implements InterfaceC6835l {
        C0168a() {
            super(1);
        }

        public final void a(InterfaceC2621b interfaceC2621b) {
            if (interfaceC2621b.q()) {
                if (interfaceC2621b.p().g()) {
                    interfaceC2621b.g0();
                }
                Map map = interfaceC2621b.p().f3822i;
                AbstractC2619a abstractC2619a = AbstractC2619a.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC2619a.c((AbstractC2521a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC2621b.B());
                }
                AbstractC2624c0 abstractC2624c0I2 = interfaceC2621b.B().I2();
                AbstractC6492s.f(abstractC2624c0I2);
                while (!AbstractC6492s.d(abstractC2624c0I2, AbstractC2619a.this.f().B())) {
                    Set<AbstractC2521a> setKeySet = AbstractC2619a.this.e(abstractC2624c0I2).keySet();
                    AbstractC2619a abstractC2619a2 = AbstractC2619a.this;
                    for (AbstractC2521a abstractC2521a : setKeySet) {
                        abstractC2619a2.c(abstractC2521a, abstractC2619a2.i(abstractC2624c0I2, abstractC2521a), abstractC2624c0I2);
                    }
                    abstractC2624c0I2 = abstractC2624c0I2.I2();
                    AbstractC6492s.f(abstractC2624c0I2);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC2621b) obj);
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ AbstractC2619a(InterfaceC2621b interfaceC2621b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2621b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC2521a abstractC2521a, int i10, AbstractC2624c0 abstractC2624c0) {
        float f10 = i10;
        long jA = AbstractC6532h.a(f10, f10);
        while (true) {
            jA = d(abstractC2624c0, jA);
            abstractC2624c0 = abstractC2624c0.I2();
            AbstractC6492s.f(abstractC2624c0);
            if (AbstractC6492s.d(abstractC2624c0, this.f3814a.B())) {
                break;
            } else if (e(abstractC2624c0).containsKey(abstractC2521a)) {
                float fI = i(abstractC2624c0, abstractC2521a);
                jA = AbstractC6532h.a(fI, fI);
            }
        }
        int iRound = Math.round(abstractC2521a instanceof C2533m ? C6531g.n(jA) : C6531g.m(jA));
        Map map = this.f3822i;
        if (map.containsKey(abstractC2521a)) {
            iRound = AbstractC2522b.c(abstractC2521a, ((Number) Zg.U.i(this.f3822i, abstractC2521a)).intValue(), iRound);
        }
        map.put(abstractC2521a, Integer.valueOf(iRound));
    }

    protected abstract long d(AbstractC2624c0 abstractC2624c0, long j10);

    protected abstract Map e(AbstractC2624c0 abstractC2624c0);

    public final InterfaceC2621b f() {
        return this.f3814a;
    }

    public final boolean g() {
        return this.f3815b;
    }

    public final Map h() {
        return this.f3822i;
    }

    protected abstract int i(AbstractC2624c0 abstractC2624c0, AbstractC2521a abstractC2521a);

    public final boolean j() {
        return this.f3816c || this.f3818e || this.f3819f || this.f3820g;
    }

    public final boolean k() {
        o();
        return this.f3821h != null;
    }

    public final boolean l() {
        return this.f3817d;
    }

    public final void m() {
        this.f3815b = true;
        InterfaceC2621b interfaceC2621bL = this.f3814a.L();
        if (interfaceC2621bL == null) {
            return;
        }
        if (this.f3816c) {
            interfaceC2621bL.r0();
        } else if (this.f3818e || this.f3817d) {
            interfaceC2621bL.requestLayout();
        }
        if (this.f3819f) {
            this.f3814a.r0();
        }
        if (this.f3820g) {
            this.f3814a.requestLayout();
        }
        interfaceC2621bL.p().m();
    }

    public final void n() {
        this.f3822i.clear();
        this.f3814a.Q(new C0168a());
        this.f3822i.putAll(e(this.f3814a.B()));
        this.f3815b = false;
    }

    public final void o() {
        InterfaceC2621b interfaceC2621b;
        AbstractC2619a abstractC2619aP;
        AbstractC2619a abstractC2619aP2;
        if (j()) {
            interfaceC2621b = this.f3814a;
        } else {
            InterfaceC2621b interfaceC2621bL = this.f3814a.L();
            if (interfaceC2621bL == null) {
                return;
            }
            interfaceC2621b = interfaceC2621bL.p().f3821h;
            if (interfaceC2621b == null || !interfaceC2621b.p().j()) {
                InterfaceC2621b interfaceC2621b2 = this.f3821h;
                if (interfaceC2621b2 == null || interfaceC2621b2.p().j()) {
                    return;
                }
                InterfaceC2621b interfaceC2621bL2 = interfaceC2621b2.L();
                if (interfaceC2621bL2 != null && (abstractC2619aP2 = interfaceC2621bL2.p()) != null) {
                    abstractC2619aP2.o();
                }
                InterfaceC2621b interfaceC2621bL3 = interfaceC2621b2.L();
                interfaceC2621b = (interfaceC2621bL3 == null || (abstractC2619aP = interfaceC2621bL3.p()) == null) ? null : abstractC2619aP.f3821h;
            }
        }
        this.f3821h = interfaceC2621b;
    }

    public final void p() {
        this.f3815b = true;
        this.f3816c = false;
        this.f3818e = false;
        this.f3817d = false;
        this.f3819f = false;
        this.f3820g = false;
        this.f3821h = null;
    }

    public final void q(boolean z10) {
        this.f3818e = z10;
    }

    public final void r(boolean z10) {
        this.f3820g = z10;
    }

    public final void s(boolean z10) {
        this.f3819f = z10;
    }

    public final void t(boolean z10) {
        this.f3817d = z10;
    }

    public final void u(boolean z10) {
        this.f3816c = z10;
    }

    private AbstractC2619a(InterfaceC2621b interfaceC2621b) {
        this.f3814a = interfaceC2621b;
        this.f3815b = true;
        this.f3822i = new HashMap();
    }
}
