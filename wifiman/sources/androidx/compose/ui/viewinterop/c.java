package androidx.compose.ui.viewinterop;

import C0.C;
import C0.InterfaceC2535o;
import E0.G;
import E0.m0;
import E0.n0;
import E0.o0;
import F1.D;
import F1.E;
import Ii.AbstractC3063k;
import Ii.N;
import J0.w;
import T.AbstractC3550q;
import T.InterfaceC3538k;
import Y0.y;
import Y0.z;
import Yg.J;
import Yg.v;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.J0;
import androidx.compose.ui.platform.J1;
import androidx.compose.ui.platform.r;
import androidx.compose.ui.viewinterop.c;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.T;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import m0.AbstractC6670H;
import m0.InterfaceC6717n0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7039f;
import org.snmp4j.mp.PduHandle;
import q2.AbstractC7419g;
import q2.InterfaceC7418f;
import sh.AbstractC7978m;
import x0.C8413b;
import y0.AbstractC8569I;

/* loaded from: classes.dex */
public abstract class c extends ViewGroup implements D, InterfaceC3538k, n0 {

    /* renamed from: x, reason: collision with root package name */
    public static final b f29765x = new b(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f29766y = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final InterfaceC6835l f29767z = a.f29791a;

    /* renamed from: a, reason: collision with root package name */
    private final int f29768a;

    /* renamed from: b, reason: collision with root package name */
    private final C8413b f29769b;

    /* renamed from: c, reason: collision with root package name */
    private final View f29770c;

    /* renamed from: d, reason: collision with root package name */
    private final m0 f29771d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6824a f29772e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29773f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6824a f29774g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC6824a f29775h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.compose.ui.e f29776i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6835l f29777j;

    /* renamed from: k, reason: collision with root package name */
    private Y0.d f29778k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC6835l f29779l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC4017o f29780m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC7418f f29781n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC6824a f29782o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC6824a f29783p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC6835l f29784q;

    /* renamed from: r, reason: collision with root package name */
    private final int[] f29785r;

    /* renamed from: s, reason: collision with root package name */
    private int f29786s;

    /* renamed from: t, reason: collision with root package name */
    private int f29787t;

    /* renamed from: u, reason: collision with root package name */
    private final E f29788u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f29789v;

    /* renamed from: w, reason: collision with root package name */
    private final G f29790w;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29791a = new a();

        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(InterfaceC6824a interfaceC6824a) {
            interfaceC6824a.invoke();
        }

        public final void c(c cVar) {
            Handler handler = cVar.getHandler();
            final InterfaceC6824a interfaceC6824a = cVar.f29782o;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.a.h(interfaceC6824a);
                }
            });
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((c) obj);
            return J.f24997a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: androidx.compose.ui.viewinterop.c$c, reason: collision with other inner class name */
    static final class C1080c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f29792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f29793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1080c(G g10, androidx.compose.ui.e eVar) {
            super(1);
            this.f29792a = g10;
            this.f29793b = eVar;
        }

        public final void a(androidx.compose.ui.e eVar) {
            this.f29792a.g(eVar.b0(this.f29793b));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.e) obj);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f29794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(G g10) {
            super(1);
            this.f29794a = g10;
        }

        public final void a(Y0.d dVar) {
            this.f29794a.a(dVar);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Y0.d) obj);
            return J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f29796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(G g10) {
            super(1);
            this.f29796b = g10;
        }

        public final void a(m0 m0Var) {
            r rVar = m0Var instanceof r ? (r) m0Var : null;
            if (rVar != null) {
                rVar.b0(c.this, this.f29796b);
            }
            ViewParent parent = c.this.getView().getParent();
            c cVar = c.this;
            if (parent != cVar) {
                cVar.addView(cVar.getView());
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m0) obj);
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {
        f() {
            super(1);
        }

        public final void a(m0 m0Var) {
            r rVar = m0Var instanceof r ? (r) m0Var : null;
            if (rVar != null) {
                rVar.K0(c.this);
            }
            c.this.removeAllViewsInLayout();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m0) obj);
            return J.f24997a;
        }
    }

    public static final class g implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f29799b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29800a = new a();

            a() {
                super(1);
            }

            public final void a(t.a aVar) {
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f29801a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f29802b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c cVar, G g10) {
                super(1);
                this.f29801a = cVar;
                this.f29802b = g10;
            }

            public final void a(t.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f29801a, this.f29802b);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        g(G g10) {
            this.f29799b = g10;
        }

        private final int a(int i10) {
            c cVar = c.this;
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            AbstractC6492s.f(layoutParams);
            cVar.measure(cVar.u(0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return c.this.getMeasuredHeight();
        }

        private final int d(int i10) {
            c cVar = c.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c cVar2 = c.this;
            ViewGroup.LayoutParams layoutParams = cVar2.getLayoutParams();
            AbstractC6492s.f(layoutParams);
            cVar.measure(iMakeMeasureSpec, cVar2.u(0, i10, layoutParams.height));
            return c.this.getMeasuredWidth();
        }

        @Override // C0.C
        public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            if (c.this.getChildCount() == 0) {
                return androidx.compose.ui.layout.m.x0(mVar, Y0.b.n(j10), Y0.b.m(j10), null, a.f29800a, 4, null);
            }
            if (Y0.b.n(j10) != 0) {
                c.this.getChildAt(0).setMinimumWidth(Y0.b.n(j10));
            }
            if (Y0.b.m(j10) != 0) {
                c.this.getChildAt(0).setMinimumHeight(Y0.b.m(j10));
            }
            c cVar = c.this;
            int iN = Y0.b.n(j10);
            int iL = Y0.b.l(j10);
            ViewGroup.LayoutParams layoutParams = c.this.getLayoutParams();
            AbstractC6492s.f(layoutParams);
            int iU = cVar.u(iN, iL, layoutParams.width);
            c cVar2 = c.this;
            int iM = Y0.b.m(j10);
            int iK = Y0.b.k(j10);
            ViewGroup.LayoutParams layoutParams2 = c.this.getLayoutParams();
            AbstractC6492s.f(layoutParams2);
            cVar.measure(iU, cVar2.u(iM, iK, layoutParams2.height));
            return androidx.compose.ui.layout.m.x0(mVar, c.this.getMeasuredWidth(), c.this.getMeasuredHeight(), null, new b(c.this, this.f29799b), 4, null);
        }

        @Override // C0.C
        public int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return a(i10);
        }

        @Override // C0.C
        public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return d(i10);
        }

        @Override // C0.C
        public int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return d(i10);
        }

        @Override // C0.C
        public int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
            return a(i10);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f29803a = new h();

        h() {
            super(1);
        }

        public final void a(w wVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((w) obj);
            return J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f29805b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f29806c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(G g10, c cVar) {
            super(1);
            this.f29805b = g10;
            this.f29806c = cVar;
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            c cVar = c.this;
            G g10 = this.f29805b;
            c cVar2 = this.f29806c;
            InterfaceC6717n0 interfaceC6717n0D = interfaceC7039f.k1().d();
            if (cVar.getView().getVisibility() != 8) {
                cVar.f29789v = true;
                m0 m0VarN0 = g10.n0();
                r rVar = m0VarN0 instanceof r ? (r) m0VarN0 : null;
                if (rVar != null) {
                    rVar.k0(cVar2, AbstractC6670H.d(interfaceC6717n0D));
                }
                cVar.f29789v = false;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return J.f24997a;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f29808b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(G g10) {
            super(1);
            this.f29808b = g10;
        }

        public final void a(C0.r rVar) {
            androidx.compose.ui.viewinterop.d.f(c.this, this.f29808b);
            c.this.f29771d.l(c.this);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C0.r) obj);
            return J.f24997a;
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f29809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f29811c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f29812d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, c cVar, long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f29810b = z10;
            this.f29811c = cVar;
            this.f29812d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new k(this.f29810b, this.f29811c, this.f29812d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f29809a;
            if (i10 == 0) {
                v.b(obj);
                if (this.f29810b) {
                    C8413b c8413b = this.f29811c.f29769b;
                    long j10 = this.f29812d;
                    long jA = y.f24558b.a();
                    this.f29809a = 2;
                    if (c8413b.a(j10, jA, this) == objG) {
                        return objG;
                    }
                } else {
                    C8413b c8413b2 = this.f29811c.f29769b;
                    long jA2 = y.f24558b.a();
                    long j11 = this.f29812d;
                    this.f29809a = 1;
                    if (c8413b2.a(jA2, j11, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((k) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f29813a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f29815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f29815c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return c.this.new l(this.f29815c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f29813a;
            if (i10 == 0) {
                v.b(obj);
                C8413b c8413b = c.this.f29769b;
                long j10 = this.f29815c;
                this.f29813a = 1;
                if (c8413b.c(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((l) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f29816a = new m();

        m() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f29817a = new n();

        n() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class o extends AbstractC6494u implements InterfaceC6824a {
        o() {
            super(0);
        }

        public final void a() {
            c.this.getLayoutNode().D0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class p extends AbstractC6494u implements InterfaceC6824a {
        p() {
            super(0);
        }

        public final void a() {
            if (c.this.f29773f && c.this.isAttachedToWindow()) {
                ViewParent parent = c.this.getView().getParent();
                c cVar = c.this;
                if (parent == cVar) {
                    cVar.getSnapshotObserver().i(c.this, c.f29767z, c.this.getUpdate());
                }
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class q extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final q f29820a = new q();

        q() {
            super(0);
        }

        public final void a() {
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public c(Context context, AbstractC3550q abstractC3550q, int i10, C8413b c8413b, View view, m0 m0Var) {
        super(context);
        this.f29768a = i10;
        this.f29769b = c8413b;
        this.f29770c = view;
        this.f29771d = m0Var;
        if (abstractC3550q != null) {
            J1.i(this, abstractC3550q);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f29772e = q.f29820a;
        this.f29774g = n.f29817a;
        this.f29775h = m.f29816a;
        e.a aVar = androidx.compose.ui.e.f28771b0;
        this.f29776i = aVar;
        this.f29778k = Y0.f.b(1.0f, 0.0f, 2, null);
        this.f29782o = new p();
        this.f29783p = new o();
        this.f29785r = new int[2];
        this.f29786s = PduHandle.NONE;
        this.f29787t = PduHandle.NONE;
        this.f29788u = new E(this);
        G g10 = new G(false, 0, 3, null);
        g10.C1(this);
        androidx.compose.ui.e eVarA = androidx.compose.ui.layout.o.a(androidx.compose.ui.draw.b.b(AbstractC8569I.b(J0.m.b(androidx.compose.ui.input.nestedscroll.a.a(aVar, androidx.compose.ui.viewinterop.d.f29821a, c8413b), true, h.f29803a), this), new i(g10, this)), new j(g10));
        g10.e(i10);
        g10.g(this.f29776i.b0(eVarA));
        this.f29777j = new C1080c(g10, eVarA);
        g10.a(this.f29778k);
        this.f29779l = new d(g10);
        g10.G1(new e(g10));
        g10.H1(new f());
        g10.i(new g(g10));
        this.f29790w = g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            B0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f29771d.getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(InterfaceC6824a interfaceC6824a) {
        interfaceC6824a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int u(int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(AbstractC7978m.k(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, PduHandle.NONE);
    }

    @Override // T.InterfaceC3538k
    public void f() {
        this.f29775h.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f29785r);
        int[] iArr = this.f29785r;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f29785r[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Y0.d getDensity() {
        return this.f29778k;
    }

    public final View getInteropView() {
        return this.f29770c;
    }

    public final G getLayoutNode() {
        return this.f29790w;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f29770c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC4017o getLifecycleOwner() {
        return this.f29780m;
    }

    public final androidx.compose.ui.e getModifier() {
        return this.f29776i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f29788u.a();
    }

    public final InterfaceC6835l getOnDensityChanged$ui_release() {
        return this.f29779l;
    }

    public final InterfaceC6835l getOnModifierChanged$ui_release() {
        return this.f29777j;
    }

    public final InterfaceC6835l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f29784q;
    }

    public final InterfaceC6824a getRelease() {
        return this.f29775h;
    }

    public final InterfaceC6824a getReset() {
        return this.f29774g;
    }

    public final InterfaceC7418f getSavedStateRegistryOwner() {
        return this.f29781n;
    }

    public final InterfaceC6824a getUpdate() {
        return this.f29772e;
    }

    public final View getView() {
        return this.f29770c;
    }

    @Override // T.InterfaceC3538k
    public void h() {
        this.f29774g.invoke();
        removeAllViewsInLayout();
    }

    @Override // E0.n0
    public boolean h0() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        s();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f29770c.isNestedScrollingEnabled();
    }

    @Override // F1.D
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long jB = this.f29769b.b(AbstractC6532h.a(androidx.compose.ui.viewinterop.d.g(i10), androidx.compose.ui.viewinterop.d.g(i11)), AbstractC6532h.a(androidx.compose.ui.viewinterop.d.g(i12), androidx.compose.ui.viewinterop.d.g(i13)), androidx.compose.ui.viewinterop.d.i(i14));
            iArr[0] = J0.b(C6531g.m(jB));
            iArr[1] = J0.b(C6531g.n(jB));
        }
    }

    @Override // F1.C
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            this.f29769b.b(AbstractC6532h.a(androidx.compose.ui.viewinterop.d.g(i10), androidx.compose.ui.viewinterop.d.g(i11)), AbstractC6532h.a(androidx.compose.ui.viewinterop.d.g(i12), androidx.compose.ui.viewinterop.d.g(i13)), androidx.compose.ui.viewinterop.d.i(i14));
        }
    }

    @Override // F1.C
    public boolean l(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // F1.C
    public void m(View view, View view2, int i10, int i11) {
        this.f29788u.c(view, view2, i10, i11);
    }

    @Override // F1.C
    public void n(View view, int i10) {
        this.f29788u.d(view, i10);
    }

    @Override // F1.C
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            long jD = this.f29769b.d(AbstractC6532h.a(androidx.compose.ui.viewinterop.d.g(i10), androidx.compose.ui.viewinterop.d.g(i11)), androidx.compose.ui.viewinterop.d.i(i12));
            iArr[0] = J0.b(C6531g.m(jD));
            iArr[1] = J0.b(C6531g.n(jD));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29782o.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f29770c.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f29770c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (this.f29770c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f29770c.measure(i10, i11);
        setMeasuredDimension(this.f29770c.getMeasuredWidth(), this.f29770c.getMeasuredHeight());
        this.f29786s = i10;
        this.f29787t = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3063k.d(this.f29769b.e(), null, null, new k(z10, this, z.a(androidx.compose.ui.viewinterop.d.h(f10), androidx.compose.ui.viewinterop.d.h(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3063k.d(this.f29769b.e(), null, null, new l(z.a(androidx.compose.ui.viewinterop.d.h(f10), androidx.compose.ui.viewinterop.d.h(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // T.InterfaceC3538k
    public void p() {
        if (this.f29770c.getParent() != this) {
            addView(this.f29770c);
        } else {
            this.f29774g.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        InterfaceC6835l interfaceC6835l = this.f29784q;
        if (interfaceC6835l != null) {
            interfaceC6835l.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void s() {
        if (!this.f29789v) {
            this.f29790w.D0();
            return;
        }
        View view = this.f29770c;
        final InterfaceC6824a interfaceC6824a = this.f29783p;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                c.t(interfaceC6824a);
            }
        });
    }

    public final void setDensity(Y0.d dVar) {
        if (dVar != this.f29778k) {
            this.f29778k = dVar;
            InterfaceC6835l interfaceC6835l = this.f29779l;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC4017o interfaceC4017o) {
        if (interfaceC4017o != this.f29780m) {
            this.f29780m = interfaceC4017o;
            T.b(this, interfaceC4017o);
        }
    }

    public final void setModifier(androidx.compose.ui.e eVar) {
        if (eVar != this.f29776i) {
            this.f29776i = eVar;
            InterfaceC6835l interfaceC6835l = this.f29777j;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(eVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC6835l interfaceC6835l) {
        this.f29779l = interfaceC6835l;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC6835l interfaceC6835l) {
        this.f29777j = interfaceC6835l;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC6835l interfaceC6835l) {
        this.f29784q = interfaceC6835l;
    }

    protected final void setRelease(InterfaceC6824a interfaceC6824a) {
        this.f29775h = interfaceC6824a;
    }

    protected final void setReset(InterfaceC6824a interfaceC6824a) {
        this.f29774g = interfaceC6824a;
    }

    public final void setSavedStateRegistryOwner(InterfaceC7418f interfaceC7418f) {
        if (interfaceC7418f != this.f29781n) {
            this.f29781n = interfaceC7418f;
            AbstractC7419g.b(this, interfaceC7418f);
        }
    }

    protected final void setUpdate(InterfaceC6824a interfaceC6824a) {
        this.f29772e = interfaceC6824a;
        this.f29773f = true;
        this.f29782o.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void v() {
        int i10;
        int i11 = this.f29786s;
        if (i11 == Integer.MIN_VALUE || (i10 = this.f29787t) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }
}
