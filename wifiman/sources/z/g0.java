package z;

import F1.C2780w0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: A, reason: collision with root package name */
    private static boolean f66877A;

    /* renamed from: x, reason: collision with root package name */
    public static final a f66878x = new a(null);

    /* renamed from: y, reason: collision with root package name */
    public static final int f66879y = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final WeakHashMap f66880z = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final C8679b f66881a;

    /* renamed from: b, reason: collision with root package name */
    private final C8679b f66882b;

    /* renamed from: c, reason: collision with root package name */
    private final C8679b f66883c;

    /* renamed from: d, reason: collision with root package name */
    private final C8679b f66884d;

    /* renamed from: e, reason: collision with root package name */
    private final C8679b f66885e;

    /* renamed from: f, reason: collision with root package name */
    private final C8679b f66886f;

    /* renamed from: g, reason: collision with root package name */
    private final C8679b f66887g;

    /* renamed from: h, reason: collision with root package name */
    private final C8679b f66888h;

    /* renamed from: i, reason: collision with root package name */
    private final C8679b f66889i;

    /* renamed from: j, reason: collision with root package name */
    private final d0 f66890j;

    /* renamed from: k, reason: collision with root package name */
    private final f0 f66891k;

    /* renamed from: l, reason: collision with root package name */
    private final f0 f66892l;

    /* renamed from: m, reason: collision with root package name */
    private final f0 f66893m;

    /* renamed from: n, reason: collision with root package name */
    private final d0 f66894n;

    /* renamed from: o, reason: collision with root package name */
    private final d0 f66895o;

    /* renamed from: p, reason: collision with root package name */
    private final d0 f66896p;

    /* renamed from: q, reason: collision with root package name */
    private final d0 f66897q;

    /* renamed from: r, reason: collision with root package name */
    private final d0 f66898r;

    /* renamed from: s, reason: collision with root package name */
    private final d0 f66899s;

    /* renamed from: t, reason: collision with root package name */
    private final d0 f66900t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f66901u;

    /* renamed from: v, reason: collision with root package name */
    private int f66902v;

    /* renamed from: w, reason: collision with root package name */
    private final E f66903w;

    public static final class a {

        /* renamed from: z.g0$a$a, reason: collision with other inner class name */
        static final class C2377a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g0 f66904a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f66905b;

            /* renamed from: z.g0$a$a$a, reason: collision with other inner class name */
            public static final class C2378a implements T.K {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g0 f66906a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f66907b;

                public C2378a(g0 g0Var, View view) {
                    this.f66906a = g0Var;
                    this.f66907b = view;
                }

                @Override // T.K
                public void dispose() {
                    this.f66906a.b(this.f66907b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2377a(g0 g0Var, View view) {
                super(1);
                this.f66904a = g0Var;
                this.f66905b = view;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T.K invoke(T.L l10) {
                this.f66904a.h(this.f66905b);
                return new C2378a(this.f66904a, this.f66905b);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final g0 d(View view) {
            g0 g0Var;
            synchronized (g0.f66880z) {
                try {
                    WeakHashMap weakHashMap = g0.f66880z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        g0 g0Var2 = new g0(null, view, false ? 1 : 0);
                        weakHashMap.put(view, g0Var2);
                        obj2 = g0Var2;
                    }
                    g0Var = (g0) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return g0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C8679b e(C2780w0 c2780w0, int i10, String str) {
            C8679b c8679b = new C8679b(i10, str);
            if (c2780w0 != null) {
                c8679b.h(c2780w0, i10);
            }
            return c8679b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d0 f(C2780w0 c2780w0, int i10, String str) {
            w1.f fVarG;
            if (c2780w0 == null || (fVarG = c2780w0.g(i10)) == null) {
                fVarG = w1.f.f64335e;
            }
            return k0.a(fVarG, str);
        }

        public final g0 c(InterfaceC3540l interfaceC3540l, int i10) {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) interfaceC3540l.t(AndroidCompositionLocals_androidKt.k());
            g0 g0VarD = d(view);
            boolean zL = interfaceC3540l.l(g0VarD) | interfaceC3540l.l(view);
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C2377a(g0VarD, view);
                interfaceC3540l.K(objF);
            }
            T.O.c(g0VarD, (InterfaceC6835l) objF, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            return g0VarD;
        }

        private a() {
        }
    }

    public /* synthetic */ g0(C2780w0 c2780w0, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2780w0, view);
    }

    public static /* synthetic */ void j(g0 g0Var, C2780w0 c2780w0, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        g0Var.i(c2780w0, i10);
    }

    public final void b(View view) {
        int i10 = this.f66902v - 1;
        this.f66902v = i10;
        if (i10 == 0) {
            F1.W.y0(view, null);
            F1.W.D0(view, null);
            view.removeOnAttachStateChangeListener(this.f66903w);
        }
    }

    public final boolean c() {
        return this.f66901u;
    }

    public final C8679b d() {
        return this.f66883c;
    }

    public final C8679b e() {
        return this.f66885e;
    }

    public final C8679b f() {
        return this.f66886f;
    }

    public final C8679b g() {
        return this.f66887g;
    }

    public final void h(View view) {
        if (this.f66902v == 0) {
            F1.W.y0(view, this.f66903w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f66903w);
            F1.W.D0(view, this.f66903w);
        }
        this.f66902v++;
    }

    public final void i(C2780w0 c2780w0, int i10) {
        if (f66877A) {
            WindowInsets windowInsetsV = c2780w0.v();
            AbstractC6492s.f(windowInsetsV);
            c2780w0 = C2780w0.w(windowInsetsV);
        }
        this.f66881a.h(c2780w0, i10);
        this.f66883c.h(c2780w0, i10);
        this.f66882b.h(c2780w0, i10);
        this.f66885e.h(c2780w0, i10);
        this.f66886f.h(c2780w0, i10);
        this.f66887g.h(c2780w0, i10);
        this.f66888h.h(c2780w0, i10);
        this.f66889i.h(c2780w0, i10);
        this.f66884d.h(c2780w0, i10);
        if (i10 == 0) {
            this.f66894n.f(k0.d(c2780w0.g(C2780w0.l.a())));
            this.f66895o.f(k0.d(c2780w0.g(C2780w0.l.f())));
            this.f66896p.f(k0.d(c2780w0.g(C2780w0.l.g())));
            this.f66897q.f(k0.d(c2780w0.g(C2780w0.l.h())));
            this.f66898r.f(k0.d(c2780w0.g(C2780w0.l.j())));
            F1.r rVarE = c2780w0.e();
            if (rVarE != null) {
                this.f66890j.f(k0.d(rVarE.e()));
            }
        }
        androidx.compose.runtime.snapshots.g.f28632e.n();
    }

    public final void k(C2780w0 c2780w0) {
        this.f66900t.f(k0.d(c2780w0.f(C2780w0.l.c())));
    }

    public final void l(C2780w0 c2780w0) {
        this.f66899s.f(k0.d(c2780w0.f(C2780w0.l.c())));
    }

    private g0(C2780w0 c2780w0, View view) {
        F1.r rVarE;
        w1.f fVarE;
        a aVar = f66878x;
        this.f66881a = aVar.e(c2780w0, C2780w0.l.a(), "captionBar");
        C8679b c8679bE = aVar.e(c2780w0, C2780w0.l.b(), "displayCutout");
        this.f66882b = c8679bE;
        C8679b c8679bE2 = aVar.e(c2780w0, C2780w0.l.c(), "ime");
        this.f66883c = c8679bE2;
        C8679b c8679bE3 = aVar.e(c2780w0, C2780w0.l.e(), "mandatorySystemGestures");
        this.f66884d = c8679bE3;
        this.f66885e = aVar.e(c2780w0, C2780w0.l.f(), "navigationBars");
        this.f66886f = aVar.e(c2780w0, C2780w0.l.g(), "statusBars");
        C8679b c8679bE4 = aVar.e(c2780w0, C2780w0.l.h(), "systemBars");
        this.f66887g = c8679bE4;
        C8679b c8679bE5 = aVar.e(c2780w0, C2780w0.l.i(), "systemGestures");
        this.f66888h = c8679bE5;
        C8679b c8679bE6 = aVar.e(c2780w0, C2780w0.l.j(), "tappableElement");
        this.f66889i = c8679bE6;
        d0 d0VarA = k0.a((c2780w0 == null || (rVarE = c2780w0.e()) == null || (fVarE = rVarE.e()) == null) ? w1.f.f64335e : fVarE, "waterfall");
        this.f66890j = d0VarA;
        f0 f0VarH = h0.h(h0.h(c8679bE4, c8679bE2), c8679bE);
        this.f66891k = f0VarH;
        f0 f0VarH2 = h0.h(h0.h(h0.h(c8679bE6, c8679bE3), c8679bE5), d0VarA);
        this.f66892l = f0VarH2;
        this.f66893m = h0.h(f0VarH, f0VarH2);
        this.f66894n = aVar.f(c2780w0, C2780w0.l.a(), "captionBarIgnoringVisibility");
        this.f66895o = aVar.f(c2780w0, C2780w0.l.f(), "navigationBarsIgnoringVisibility");
        this.f66896p = aVar.f(c2780w0, C2780w0.l.g(), "statusBarsIgnoringVisibility");
        this.f66897q = aVar.f(c2780w0, C2780w0.l.h(), "systemBarsIgnoringVisibility");
        this.f66898r = aVar.f(c2780w0, C2780w0.l.j(), "tappableElementIgnoringVisibility");
        this.f66899s = aVar.f(c2780w0, C2780w0.l.c(), "imeAnimationTarget");
        this.f66900t = aVar.f(c2780w0, C2780w0.l.c(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(f0.h.f46608I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f66901u = bool != null ? bool.booleanValue() : true;
        this.f66903w = new E(this);
    }
}
