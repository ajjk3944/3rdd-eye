package R0;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;
import y0.InterfaceC8573M;

/* loaded from: classes.dex */
public final class V implements L {

    /* renamed from: a, reason: collision with root package name */
    private final View f19425a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3467u f19426b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f19427c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19428d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6835l f19429e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6835l f19430f;

    /* renamed from: g, reason: collision with root package name */
    private Q f19431g;

    /* renamed from: h, reason: collision with root package name */
    private C3465s f19432h;

    /* renamed from: i, reason: collision with root package name */
    private List f19433i;

    /* renamed from: j, reason: collision with root package name */
    private final Yg.m f19434j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f19435k;

    /* renamed from: l, reason: collision with root package name */
    private final C3452e f19436l;

    /* renamed from: m, reason: collision with root package name */
    private final V.b f19437m;

    /* renamed from: n, reason: collision with root package name */
    private Runnable f19438n;

    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19439a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19439a = iArr;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {
        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(V.this.q(), false);
        }
    }

    public static final class d implements InterfaceC3466t {
        d() {
        }

        @Override // R0.InterfaceC3466t
        public void a(M m10) {
            int size = V.this.f19433i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC6492s.d(((WeakReference) V.this.f19433i.get(i10)).get(), m10)) {
                    V.this.f19433i.remove(i10);
                    return;
                }
            }
        }

        @Override // R0.InterfaceC3466t
        public void b(int i10) {
            V.this.f19430f.invoke(r.j(i10));
        }

        @Override // R0.InterfaceC3466t
        public void c(KeyEvent keyEvent) {
            V.this.p().sendKeyEvent(keyEvent);
        }

        @Override // R0.InterfaceC3466t
        public void d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            V.this.f19436l.b(z10, z11, z12, z13, z14, z15);
        }

        @Override // R0.InterfaceC3466t
        public void e(List list) {
            V.this.f19429e.invoke(list);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f19442a = new e();

        e() {
            super(1);
        }

        public final void a(List list) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f19443a = new f();

        f() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return Yg.J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final g f19444a = new g();

        g() {
            super(1);
        }

        public final void a(List list) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return Yg.J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f19445a = new h();

        h() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return Yg.J.f24997a;
        }
    }

    public V(View view, InterfaceC8573M interfaceC8573M, InterfaceC3467u interfaceC3467u, Executor executor) {
        this.f19425a = view;
        this.f19426b = interfaceC3467u;
        this.f19427c = executor;
        this.f19429e = e.f19442a;
        this.f19430f = f.f19443a;
        this.f19431g = new Q("", L0.S.f11103b.a(), (L0.S) null, 4, (DefaultConstructorMarker) null);
        this.f19432h = C3465s.f19509g.a();
        this.f19433i = new ArrayList();
        this.f19434j = Yg.n.a(Yg.q.NONE, new c());
        this.f19436l = new C3452e(interfaceC8573M, interfaceC3467u);
        this.f19437m = new V.b(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.f19434j.getValue();
    }

    private final void s() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        kotlin.jvm.internal.N n11 = new kotlin.jvm.internal.N();
        V.b bVar = this.f19437m;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                t((a) objArrM[i10], n10, n11);
                i10++;
            } while (i10 < iO);
        }
        this.f19437m.h();
        if (AbstractC6492s.d(n10.f51689a, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) n11.f51689a;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (AbstractC6492s.d(n10.f51689a, Boolean.FALSE)) {
            u();
        }
    }

    private static final void t(a aVar, kotlin.jvm.internal.N n10, kotlin.jvm.internal.N n11) {
        int i10 = b.f19439a[aVar.ordinal()];
        if (i10 == 1) {
            Boolean bool = Boolean.TRUE;
            n10.f51689a = bool;
            n11.f51689a = bool;
        } else if (i10 == 2) {
            Boolean bool2 = Boolean.FALSE;
            n10.f51689a = bool2;
            n11.f51689a = bool2;
        } else if ((i10 == 3 || i10 == 4) && !AbstractC6492s.d(n10.f51689a, Boolean.FALSE)) {
            n11.f51689a = Boolean.valueOf(aVar == a.ShowKeyboard);
        }
    }

    private final void u() {
        this.f19426b.b();
    }

    private final void v(a aVar) {
        this.f19437m.b(aVar);
        if (this.f19438n == null) {
            Runnable runnable = new Runnable() { // from class: R0.U
                @Override // java.lang.Runnable
                public final void run() {
                    V.w(this.f19424a);
                }
            };
            this.f19427c.execute(runnable);
            this.f19438n = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(V v10) {
        v10.f19438n = null;
        v10.s();
    }

    private final void x(boolean z10) {
        if (z10) {
            this.f19426b.f();
        } else {
            this.f19426b.e();
        }
    }

    @Override // R0.L
    public void a(Q q10, C3465s c3465s, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        this.f19428d = true;
        this.f19431g = q10;
        this.f19432h = c3465s;
        this.f19429e = interfaceC6835l;
        this.f19430f = interfaceC6835l2;
        v(a.StartInput);
    }

    @Override // R0.L
    public void b() {
        v(a.StartInput);
    }

    @Override // R0.L
    public void c() {
        v(a.ShowKeyboard);
    }

    @Override // R0.L
    public void d() {
        this.f19428d = false;
        this.f19429e = g.f19444a;
        this.f19430f = h.f19445a;
        this.f19435k = null;
        v(a.StopInput);
    }

    @Override // R0.L
    public void e(Q q10, H h10, L0.M m10, InterfaceC6835l interfaceC6835l, C6533i c6533i, C6533i c6533i2) {
        this.f19436l.d(q10, h10, m10, interfaceC6835l, c6533i, c6533i2);
    }

    @Override // R0.L
    public void f(Q q10, Q q11) {
        boolean z10 = (L0.S.g(this.f19431g.h(), q11.h()) && AbstractC6492s.d(this.f19431g.g(), q11.g())) ? false : true;
        this.f19431g = q11;
        int size = this.f19433i.size();
        for (int i10 = 0; i10 < size; i10++) {
            M m10 = (M) ((WeakReference) this.f19433i.get(i10)).get();
            if (m10 != null) {
                m10.f(q11);
            }
        }
        this.f19436l.a();
        if (AbstractC6492s.d(q10, q11)) {
            if (z10) {
                InterfaceC3467u interfaceC3467u = this.f19426b;
                int iL = L0.S.l(q11.h());
                int iK = L0.S.k(q11.h());
                L0.S sG = this.f19431g.g();
                int iL2 = sG != null ? L0.S.l(sG.r()) : -1;
                L0.S sG2 = this.f19431g.g();
                interfaceC3467u.a(iL, iK, iL2, sG2 != null ? L0.S.k(sG2.r()) : -1);
                return;
            }
            return;
        }
        if (q10 != null && (!AbstractC6492s.d(q10.i(), q11.i()) || (L0.S.g(q10.h(), q11.h()) && !AbstractC6492s.d(q10.g(), q11.g())))) {
            u();
            return;
        }
        int size2 = this.f19433i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            M m11 = (M) ((WeakReference) this.f19433i.get(i11)).get();
            if (m11 != null) {
                m11.g(this.f19431g, this.f19426b);
            }
        }
    }

    @Override // R0.L
    public void g() {
        v(a.HideKeyboard);
    }

    @Override // R0.L
    public void h(C6533i c6533i) {
        Rect rect;
        this.f19435k = new Rect(AbstractC7137b.e(c6533i.k()), AbstractC7137b.e(c6533i.n()), AbstractC7137b.e(c6533i.l()), AbstractC7137b.e(c6533i.e()));
        if (!this.f19433i.isEmpty() || (rect = this.f19435k) == null) {
            return;
        }
        this.f19425a.requestRectangleOnScreen(new Rect(rect));
    }

    public final InputConnection o(EditorInfo editorInfo) {
        if (!this.f19428d) {
            return null;
        }
        Y.h(editorInfo, this.f19432h, this.f19431g);
        Y.i(editorInfo);
        M m10 = new M(this.f19431g, new d(), this.f19432h.b());
        this.f19433i.add(new WeakReference(m10));
        return m10;
    }

    public final View q() {
        return this.f19425a;
    }

    public final boolean r() {
        return this.f19428d;
    }

    public /* synthetic */ V(View view, InterfaceC8573M interfaceC8573M, InterfaceC3467u interfaceC3467u, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, interfaceC8573M, interfaceC3467u, (i10 & 8) != 0 ? Y.d(Choreographer.getInstance()) : executor);
    }

    public V(View view, InterfaceC8573M interfaceC8573M) {
        this(view, interfaceC8573M, new C3468v(view), null, 8, null);
    }
}
