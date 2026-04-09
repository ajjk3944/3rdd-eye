package T0;

import T.z1;
import W0.k;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6682S;
import m0.AbstractC6697d0;
import m0.AbstractC6713l0;
import m0.AbstractC6737x0;
import m0.S0;
import m0.T0;
import m0.e1;
import m0.g1;
import mh.InterfaceC6824a;
import o0.AbstractC7040g;
import o0.C7043j;
import o0.C7044k;
import o0.InterfaceC7039f;

/* loaded from: classes.dex */
public final class g extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    private S0 f21313a;

    /* renamed from: b, reason: collision with root package name */
    private W0.k f21314b;

    /* renamed from: c, reason: collision with root package name */
    private int f21315c;

    /* renamed from: d, reason: collision with root package name */
    private g1 f21316d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC6713l0 f21317e;

    /* renamed from: f, reason: collision with root package name */
    private z1 f21318f;

    /* renamed from: g, reason: collision with root package name */
    private C6537m f21319g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC7040g f21320h;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6713l0 f21321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC6713l0 abstractC6713l0, long j10) {
            super(0);
            this.f21321a = abstractC6713l0;
            this.f21322b = j10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            return ((e1) this.f21321a).b(this.f21322b);
        }
    }

    public g(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f21314b = W0.k.f23532b.c();
        this.f21315c = InterfaceC7039f.f55034d1.a();
        this.f21316d = g1.f52914d.a();
    }

    private final void a() {
        this.f21318f = null;
        this.f21317e = null;
        this.f21319g = null;
        setShader(null);
    }

    private final S0 c() {
        S0 s02 = this.f21313a;
        if (s02 != null) {
            return s02;
        }
        S0 s0B = AbstractC6682S.b(this);
        this.f21313a = s0B;
        return s0B;
    }

    public final int b() {
        return this.f21315c;
    }

    public final void d(int i10) {
        if (AbstractC6697d0.E(i10, this.f21315c)) {
            return;
        }
        c().v(i10);
        this.f21315c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(m0.AbstractC6713l0 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.a()
            goto L6a
        L6:
            boolean r0 = r5 instanceof m0.j1
            if (r0 == 0) goto L18
            m0.j1 r5 = (m0.j1) r5
            long r5 = r5.b()
            long r5 = W0.m.c(r5, r8)
            r4.f(r5)
            goto L6a
        L18:
            boolean r0 = r5 instanceof m0.e1
            if (r0 == 0) goto L6a
            m0.l0 r0 = r4.f21317e
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            l0.m r0 = r4.f21319g
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.m()
            boolean r0 = l0.C6537m.f(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.f21317e = r5
            l0.m r0 = l0.C6537m.c(r6)
            r4.f21319g = r0
            T0.g$a r0 = new T0.g$a
            r0.<init>(r5, r6)
            T.z1 r5 = T.o1.e(r0)
            r4.f21318f = r5
        L54:
            m0.S0 r5 = r4.c()
            T.z1 r6 = r4.f21318f
            if (r6 == 0) goto L63
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L64
        L63:
            r6 = 0
        L64:
            r5.y(r6)
            T0.h.a(r4, r8)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.g.e(m0.l0, long, float):void");
    }

    public final void f(long j10) {
        if (j10 != 16) {
            setColor(AbstractC6737x0.j(j10));
            a();
        }
    }

    public final void g(AbstractC7040g abstractC7040g) {
        if (abstractC7040g == null || AbstractC6492s.d(this.f21320h, abstractC7040g)) {
            return;
        }
        this.f21320h = abstractC7040g;
        if (AbstractC6492s.d(abstractC7040g, C7043j.f55038a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC7040g instanceof C7044k) {
            c().H(T0.f52853a.b());
            C7044k c7044k = (C7044k) abstractC7040g;
            c().K(c7044k.f());
            c().A(c7044k.d());
            c().G(c7044k.c());
            c().u(c7044k.b());
            c().B(c7044k.e());
        }
    }

    public final void h(g1 g1Var) {
        if (g1Var == null || AbstractC6492s.d(this.f21316d, g1Var)) {
            return;
        }
        this.f21316d = g1Var;
        if (AbstractC6492s.d(g1Var, g1.f52914d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(U0.d.b(this.f21316d.b()), C6531g.m(this.f21316d.d()), C6531g.n(this.f21316d.d()), AbstractC6737x0.j(this.f21316d.c()));
        }
    }

    public final void i(W0.k kVar) {
        if (kVar == null || AbstractC6492s.d(this.f21314b, kVar)) {
            return;
        }
        this.f21314b = kVar;
        k.a aVar = W0.k.f23532b;
        setUnderlineText(kVar.d(aVar.d()));
        setStrikeThruText(this.f21314b.d(aVar.b()));
    }
}
