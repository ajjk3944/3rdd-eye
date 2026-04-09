package I;

import I.N0;
import R0.C3465s;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.platform.w1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import oh.AbstractC7137b;

/* loaded from: classes.dex */
public final class P0 implements androidx.compose.ui.platform.L0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f8062a;

    /* renamed from: b, reason: collision with root package name */
    private final I0 f8063b;

    /* renamed from: e, reason: collision with root package name */
    private F.E f8066e;

    /* renamed from: f, reason: collision with root package name */
    private M.G f8067f;

    /* renamed from: g, reason: collision with root package name */
    private w1 f8068g;

    /* renamed from: l, reason: collision with root package name */
    private Rect f8073l;

    /* renamed from: m, reason: collision with root package name */
    private final M0 f8074m;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6835l f8064c = c.f8077a;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6835l f8065d = d.f8078a;

    /* renamed from: h, reason: collision with root package name */
    private R0.Q f8069h = new R0.Q("", L0.S.f11103b.a(), (L0.S) null, 4, (DefaultConstructorMarker) null);

    /* renamed from: i, reason: collision with root package name */
    private C3465s f8070i = C3465s.f19509g.a();

    /* renamed from: j, reason: collision with root package name */
    private List f8071j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private final Yg.m f8072k = Yg.n.a(Yg.q.NONE, new a());

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(P0.this.i(), false);
        }
    }

    public static final class b implements H0 {
        b() {
        }

        @Override // I.H0
        public void b(int i10) {
            P0.this.f8065d.invoke(R0.r.j(i10));
        }

        @Override // I.H0
        public void c(KeyEvent keyEvent) {
            P0.this.h().sendKeyEvent(keyEvent);
        }

        @Override // I.H0
        public void d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            P0.this.f8074m.b(z10, z11, z12, z13, z14, z15);
        }

        @Override // I.H0
        public void e(List list) {
            P0.this.f8064c.invoke(list);
        }

        @Override // I.H0
        public void f(V0 v02) {
            int size = P0.this.f8071j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC6492s.d(((WeakReference) P0.this.f8071j.get(i10)).get(), v02)) {
                    P0.this.f8071j.remove(i10);
                    return;
                }
            }
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f8077a = new c();

        c() {
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

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f8078a = new d();

        d() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((R0.r) obj).p());
            return Yg.J.f24997a;
        }
    }

    public P0(View view, InterfaceC6835l interfaceC6835l, I0 i02) {
        this.f8062a = view;
        this.f8063b = i02;
        this.f8074m = new M0(interfaceC6835l, i02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection h() {
        return (BaseInputConnection) this.f8072k.getValue();
    }

    private final void k() {
        this.f8063b.b();
    }

    @Override // androidx.compose.ui.platform.L0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public V0 a(EditorInfo editorInfo) {
        V.c(editorInfo, this.f8069h.i(), this.f8069h.h(), this.f8070i, null, 8, null);
        O0.d(editorInfo);
        V0 v02 = new V0(this.f8069h, new b(), this.f8070i.b(), this.f8066e, this.f8067f, this.f8068g);
        this.f8071j.add(new WeakReference(v02));
        return v02;
    }

    public final View i() {
        return this.f8062a;
    }

    public final void j(C6533i c6533i) {
        Rect rect;
        this.f8073l = new Rect(AbstractC7137b.e(c6533i.k()), AbstractC7137b.e(c6533i.n()), AbstractC7137b.e(c6533i.l()), AbstractC7137b.e(c6533i.e()));
        if (!this.f8071j.isEmpty() || (rect = this.f8073l) == null) {
            return;
        }
        this.f8062a.requestRectangleOnScreen(new Rect(rect));
    }

    public final void l(R0.Q q10, N0.a aVar, C3465s c3465s, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        this.f8069h = q10;
        this.f8070i = c3465s;
        this.f8064c = interfaceC6835l;
        this.f8065d = interfaceC6835l2;
        this.f8066e = aVar != null ? aVar.O1() : null;
        this.f8067f = aVar != null ? aVar.A0() : null;
        this.f8068g = aVar != null ? aVar.getViewConfiguration() : null;
    }

    public final void m(R0.Q q10, R0.Q q11) {
        boolean z10 = (L0.S.g(this.f8069h.h(), q11.h()) && AbstractC6492s.d(this.f8069h.g(), q11.g())) ? false : true;
        this.f8069h = q11;
        int size = this.f8071j.size();
        for (int i10 = 0; i10 < size; i10++) {
            V0 v02 = (V0) ((WeakReference) this.f8071j.get(i10)).get();
            if (v02 != null) {
                v02.g(q11);
            }
        }
        this.f8074m.a();
        if (AbstractC6492s.d(q10, q11)) {
            if (z10) {
                I0 i02 = this.f8063b;
                int iL = L0.S.l(q11.h());
                int iK = L0.S.k(q11.h());
                L0.S sG = this.f8069h.g();
                int iL2 = sG != null ? L0.S.l(sG.r()) : -1;
                L0.S sG2 = this.f8069h.g();
                i02.a(iL, iK, iL2, sG2 != null ? L0.S.k(sG2.r()) : -1);
                return;
            }
            return;
        }
        if (q10 != null && (!AbstractC6492s.d(q10.i(), q11.i()) || (L0.S.g(q10.h(), q11.h()) && !AbstractC6492s.d(q10.g(), q11.g())))) {
            k();
            return;
        }
        int size2 = this.f8071j.size();
        for (int i11 = 0; i11 < size2; i11++) {
            V0 v03 = (V0) ((WeakReference) this.f8071j.get(i11)).get();
            if (v03 != null) {
                v03.h(this.f8069h, this.f8063b);
            }
        }
    }

    public final void n(R0.Q q10, R0.H h10, L0.M m10, C6533i c6533i, C6533i c6533i2) {
        this.f8074m.d(q10, h10, m10, c6533i, c6533i2);
    }
}
