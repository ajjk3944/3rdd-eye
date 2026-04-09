package y0;

import E0.A0;
import E0.AbstractC2631i;
import E0.B0;
import E0.InterfaceC2630h;
import E0.s0;
import E0.z0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import y0.AbstractC8596q;

/* renamed from: y0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8598s extends e.c implements A0, s0, InterfaceC2630h {

    /* renamed from: n, reason: collision with root package name */
    private final String f66315n = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC8599t f66316o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f66317p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f66318q;

    /* renamed from: y0.s$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f66319a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.N n10) {
            super(1);
            this.f66319a = n10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C8598s c8598s) {
            if (this.f66319a.f51689a == null && c8598s.f66318q) {
                this.f66319a.f51689a = c8598s;
            } else if (this.f66319a.f51689a != null && c8598s.L2() && c8598s.f66318q) {
                this.f66319a.f51689a = c8598s;
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: y0.s$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f66320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.J j10) {
            super(1);
            this.f66320a = j10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C8598s c8598s) {
            if (!c8598s.f66318q) {
                return z0.ContinueTraversal;
            }
            this.f66320a.f51685a = false;
            return z0.CancelTraversal;
        }
    }

    /* renamed from: y0.s$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f66321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.jvm.internal.N n10) {
            super(1);
            this.f66321a = n10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C8598s c8598s) {
            z0 z0Var = z0.ContinueTraversal;
            if (!c8598s.f66318q) {
                return z0Var;
            }
            this.f66321a.f51689a = c8598s;
            return c8598s.L2() ? z0.SkipSubtreeAndContinueTraversal : z0Var;
        }
    }

    /* renamed from: y0.s$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f66322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.N n10) {
            super(1);
            this.f66322a = n10;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C8598s c8598s) {
            if (c8598s.L2() && c8598s.f66318q) {
                this.f66322a.f51689a = c8598s;
            }
            return Boolean.TRUE;
        }
    }

    public C8598s(InterfaceC8599t interfaceC8599t, boolean z10) {
        this.f66316o = interfaceC8599t;
        this.f66317p = z10;
    }

    private final void E2() {
        InterfaceC8601v interfaceC8601vM2 = M2();
        if (interfaceC8601vM2 != null) {
            interfaceC8601vM2.a(null);
        }
    }

    private final void F2() {
        InterfaceC8599t interfaceC8599t;
        C8598s c8598sK2 = K2();
        if (c8598sK2 == null || (interfaceC8599t = c8598sK2.f66316o) == null) {
            interfaceC8599t = this.f66316o;
        }
        InterfaceC8601v interfaceC8601vM2 = M2();
        if (interfaceC8601vM2 != null) {
            interfaceC8601vM2.a(interfaceC8599t);
        }
    }

    private final void G2() {
        Yg.J j10;
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        B0.d(this, new a(n10));
        C8598s c8598s = (C8598s) n10.f51689a;
        if (c8598s != null) {
            c8598s.F2();
            j10 = Yg.J.f24997a;
        } else {
            j10 = null;
        }
        if (j10 == null) {
            E2();
        }
    }

    private final void H2() {
        C8598s c8598sJ2;
        if (this.f66318q) {
            if (this.f66317p || (c8598sJ2 = J2()) == null) {
                c8598sJ2 = this;
            }
            c8598sJ2.F2();
        }
    }

    private final void I2() {
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        j10.f51685a = true;
        if (!this.f66317p) {
            B0.f(this, new b(j10));
        }
        if (j10.f51685a) {
            F2();
        }
    }

    private final C8598s J2() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        B0.f(this, new c(n10));
        return (C8598s) n10.f51689a;
    }

    private final C8598s K2() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        B0.d(this, new d(n10));
        return (C8598s) n10.f51689a;
    }

    private final InterfaceC8601v M2() {
        return (InterfaceC8601v) AbstractC2631i.a(this, AbstractC3932k0.n());
    }

    private final void O2() {
        this.f66318q = true;
        I2();
    }

    private final void P2() {
        if (this.f66318q) {
            this.f66318q = false;
            if (k2()) {
                G2();
            }
        }
    }

    @Override // E0.s0
    public void C0() {
        P2();
    }

    public final boolean L2() {
        return this.f66317p;
    }

    @Override // E0.A0
    /* renamed from: N2, reason: merged with bridge method [inline-methods] */
    public String W() {
        return this.f66315n;
    }

    public final void Q2(InterfaceC8599t interfaceC8599t) {
        if (AbstractC6492s.d(this.f66316o, interfaceC8599t)) {
            return;
        }
        this.f66316o = interfaceC8599t;
        if (this.f66318q) {
            I2();
        }
    }

    public final void R2(boolean z10) {
        if (this.f66317p != z10) {
            this.f66317p = z10;
            if (z10) {
                if (this.f66318q) {
                    F2();
                }
            } else if (this.f66318q) {
                H2();
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        P2();
        super.o2();
    }

    @Override // E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        if (enumC8595p == EnumC8595p.Main) {
            int iF = c8593n.f();
            AbstractC8596q.a aVar = AbstractC8596q.f66307a;
            if (AbstractC8596q.i(iF, aVar.a())) {
                O2();
            } else if (AbstractC8596q.i(c8593n.f(), aVar.b())) {
                P2();
            }
        }
    }
}
