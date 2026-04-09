package I;

import E0.AbstractC2631i;
import E0.InterfaceC2630h;
import E0.InterfaceC2641t;
import I.N0;
import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import T.InterfaceC3551q0;
import T.t1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.w1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class K0 extends e.c implements androidx.compose.ui.platform.M0, InterfaceC2630h, InterfaceC2641t, N0.a {

    /* renamed from: n, reason: collision with root package name */
    private N0 f8035n;

    /* renamed from: o, reason: collision with root package name */
    private F.E f8036o;

    /* renamed from: p, reason: collision with root package name */
    private M.G f8037p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3551q0 f8038q = t1.d(null, null, 2, null);

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8039a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f8041c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f8041c = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return K0.this.new a(this.f8041c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8039a;
            if (i10 == 0) {
                Yg.v.b(obj);
                K0 k02 = K0.this;
                InterfaceC6839p interfaceC6839p = this.f8041c;
                this.f8039a = 1;
                if (androidx.compose.ui.platform.N0.b(k02, interfaceC6839p, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public K0(N0 n02, F.E e10, M.G g10) {
        this.f8035n = n02;
        this.f8036o = e10;
        this.f8037p = g10;
    }

    private void D2(C0.r rVar) {
        this.f8038q.setValue(rVar);
    }

    @Override // I.N0.a
    public M.G A0() {
        return this.f8037p;
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        D2(rVar);
    }

    public void E2(F.E e10) {
        this.f8036o = e10;
    }

    public final void F2(N0 n02) {
        if (k2()) {
            this.f8035n.d();
            this.f8035n.l(this);
        }
        this.f8035n = n02;
        if (k2()) {
            this.f8035n.j(this);
        }
    }

    public void G2(M.G g10) {
        this.f8037p = g10;
    }

    @Override // I.N0.a
    public F.E O1() {
        return this.f8036o;
    }

    @Override // I.N0.a
    public InterfaceC3091y0 U0(InterfaceC6839p interfaceC6839p) {
        if (k2()) {
            return AbstractC3063k.d(d2(), null, Ii.P.UNDISPATCHED, new a(interfaceC6839p, null), 1, null);
        }
        return null;
    }

    @Override // I.N0.a
    public androidx.compose.ui.platform.n1 getSoftwareKeyboardController() {
        return (androidx.compose.ui.platform.n1) AbstractC2631i.a(this, AbstractC3932k0.q());
    }

    @Override // I.N0.a
    public w1 getViewConfiguration() {
        return (w1) AbstractC2631i.a(this, AbstractC3932k0.t());
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        this.f8035n.j(this);
    }

    @Override // I.N0.a
    public C0.r o1() {
        return (C0.r) this.f8038q.getValue();
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        this.f8035n.l(this);
    }
}
