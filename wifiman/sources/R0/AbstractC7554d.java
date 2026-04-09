package r0;

import Y0.t;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6534j;
import l0.AbstractC6538n;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;
import m0.AbstractC6682S;
import m0.AbstractC6735w0;
import m0.InterfaceC6717n0;
import m0.S0;
import mh.InterfaceC6835l;
import o0.InterfaceC7039f;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7554d {

    /* renamed from: a, reason: collision with root package name */
    private S0 f59948a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59949b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC6735w0 f59950c;

    /* renamed from: d, reason: collision with root package name */
    private float f59951d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private t f59952e = t.Ltr;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6835l f59953f = new a();

    /* renamed from: r0.d$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            AbstractC7554d.this.n(interfaceC7039f);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return J.f24997a;
        }
    }

    private final void g(float f10) {
        if (this.f59951d == f10) {
            return;
        }
        if (!a(f10)) {
            if (f10 == 1.0f) {
                S0 s02 = this.f59948a;
                if (s02 != null) {
                    s02.a(f10);
                }
                this.f59949b = false;
            } else {
                m().a(f10);
                this.f59949b = true;
            }
        }
        this.f59951d = f10;
    }

    private final void h(AbstractC6735w0 abstractC6735w0) {
        if (AbstractC6492s.d(this.f59950c, abstractC6735w0)) {
            return;
        }
        if (!e(abstractC6735w0)) {
            if (abstractC6735w0 == null) {
                S0 s02 = this.f59948a;
                if (s02 != null) {
                    s02.D(null);
                }
                this.f59949b = false;
            } else {
                m().D(abstractC6735w0);
                this.f59949b = true;
            }
        }
        this.f59950c = abstractC6735w0;
    }

    private final void i(t tVar) {
        if (this.f59952e != tVar) {
            f(tVar);
            this.f59952e = tVar;
        }
    }

    public static /* synthetic */ void k(AbstractC7554d abstractC7554d, InterfaceC7039f interfaceC7039f, long j10, float f10, AbstractC6735w0 abstractC6735w0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            abstractC6735w0 = null;
        }
        abstractC7554d.j(interfaceC7039f, j10, f11, abstractC6735w0);
    }

    private final S0 m() {
        S0 s02 = this.f59948a;
        if (s02 != null) {
            return s02;
        }
        S0 s0A = AbstractC6682S.a();
        this.f59948a = s0A;
        return s0A;
    }

    protected abstract boolean a(float f10);

    protected abstract boolean e(AbstractC6735w0 abstractC6735w0);

    protected boolean f(t tVar) {
        return false;
    }

    public final void j(InterfaceC7039f interfaceC7039f, long j10, float f10, AbstractC6735w0 abstractC6735w0) {
        g(f10);
        h(abstractC6735w0);
        i(interfaceC7039f.getLayoutDirection());
        float fI = C6537m.i(interfaceC7039f.c()) - C6537m.i(j10);
        float fG = C6537m.g(interfaceC7039f.c()) - C6537m.g(j10);
        interfaceC7039f.k1().e().g(0.0f, 0.0f, fI, fG);
        if (f10 > 0.0f) {
            try {
                if (C6537m.i(j10) > 0.0f && C6537m.g(j10) > 0.0f) {
                    if (this.f59949b) {
                        C6533i c6533iB = AbstractC6534j.b(C6531g.f52335b.c(), AbstractC6538n.a(C6537m.i(j10), C6537m.g(j10)));
                        InterfaceC6717n0 interfaceC6717n0D = interfaceC7039f.k1().d();
                        try {
                            interfaceC6717n0D.l(c6533iB, m());
                            n(interfaceC7039f);
                            interfaceC6717n0D.r();
                        } catch (Throwable th2) {
                            interfaceC6717n0D.r();
                            throw th2;
                        }
                    } else {
                        n(interfaceC7039f);
                    }
                }
            } catch (Throwable th3) {
                interfaceC7039f.k1().e().g(-0.0f, -0.0f, -fI, -fG);
                throw th3;
            }
        }
        interfaceC7039f.k1().e().g(-0.0f, -0.0f, -fI, -fG);
    }

    public abstract long l();

    protected abstract void n(InterfaceC7039f interfaceC7039f);
}
