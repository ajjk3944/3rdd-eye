package J0;

import L0.C3174d;
import L0.S;
import Yg.J;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ th.l[] f9718a = {O.f(new z(t.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.f(new z(t.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), O.f(new z(t.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.f(new z(t.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(t.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(t.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(t.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(t.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), O.f(new z(t.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(t.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), O.f(new z(t.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), O.f(new z(t.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), O.f(new z(t.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(t.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.f(new z(t.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), O.f(new z(t.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(t.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), O.f(new z(t.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), O.f(new z(t.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(t.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(t.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), O.f(new z(t.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), O.f(new z(t.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), O.f(new z(t.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(t.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(t.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f9719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f9719a = interfaceC6824a;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            boolean z10;
            Float f10 = (Float) this.f9719a.invoke();
            if (f10 == null) {
                z10 = false;
            } else {
                list.add(f10);
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static {
        q qVar = q.f9676a;
        qVar.B();
        qVar.x();
        qVar.v();
        qVar.t();
        qVar.i();
        qVar.s();
        qVar.s();
        qVar.e();
        qVar.c();
        qVar.H();
        qVar.k();
        qVar.I();
        qVar.y();
        qVar.C();
        qVar.F();
        qVar.r();
        qVar.g();
        qVar.E();
        qVar.l();
        qVar.A();
        qVar.a();
        qVar.b();
        qVar.G();
        qVar.p();
        qVar.u();
        i.f9619a.d();
    }

    public static /* synthetic */ void A(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        z(wVar, str, interfaceC6824a);
    }

    public static final void B(w wVar, int i10, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(q.f9676a.l(), R0.r.j(i10));
        wVar.b(i.f9619a.l(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void C(w wVar, int i10, String str, InterfaceC6824a interfaceC6824a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        B(wVar, i10, str, interfaceC6824a);
    }

    public static final void D(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.m(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void E(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        D(wVar, str, interfaceC6824a);
    }

    public static final void F(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.n(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void G(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        F(wVar, str, interfaceC6824a);
    }

    public static final void H(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.o(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void I(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        H(wVar, str, interfaceC6824a);
    }

    public static final void J(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.p(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void K(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        J(wVar, str, interfaceC6824a);
    }

    public static final void L(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.q(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void M(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        L(wVar, str, interfaceC6824a);
    }

    public static final void N(w wVar) {
        wVar.b(q.f9676a.w(), J.f24997a);
    }

    public static final void O(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.r(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void P(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        O(wVar, str, interfaceC6824a);
    }

    public static final void Q(w wVar) {
        wVar.b(q.f9676a.q(), J.f24997a);
    }

    public static final void R(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.s(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void S(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        R(wVar, str, interfaceC6824a);
    }

    public static final void T(w wVar, String str, InterfaceC6839p interfaceC6839p) {
        wVar.b(i.f9619a.t(), new J0.a(str, interfaceC6839p));
    }

    public static /* synthetic */ void U(w wVar, String str, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        T(wVar, str, interfaceC6839p);
    }

    public static final void V(w wVar, InterfaceC6839p interfaceC6839p) {
        wVar.b(i.f9619a.u(), interfaceC6839p);
    }

    public static final void W(w wVar, String str, InterfaceC6835l interfaceC6835l) {
        wVar.b(i.f9619a.v(), new J0.a(str, interfaceC6835l));
    }

    public static /* synthetic */ void X(w wVar, String str, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        W(wVar, str, interfaceC6835l);
    }

    public static final void Y(w wVar, b bVar) {
        q.f9676a.a().d(wVar, f9718a[20], bVar);
    }

    public static final void Z(w wVar, boolean z10) {
        q.f9676a.s().d(wVar, f9718a[5], Boolean.valueOf(z10));
    }

    public static final v a(String str) {
        return new v(str, true);
    }

    public static final void a0(w wVar, String str) {
        wVar.b(q.f9676a.d(), AbstractC3689v.e(str));
    }

    public static final v b(String str, InterfaceC6839p interfaceC6839p) {
        return new v(str, true, interfaceC6839p);
    }

    public static final void b0(w wVar, boolean z10) {
        q.f9676a.p().d(wVar, f9718a[23], Boolean.valueOf(z10));
    }

    public static final void c(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.a(), new J0.a(str, interfaceC6824a));
    }

    public static final void c0(w wVar, C3174d c3174d) {
        q.f9676a.g().d(wVar, f9718a[16], c3174d);
    }

    public static /* synthetic */ void d(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c(wVar, str, interfaceC6824a);
    }

    public static final void d0(w wVar, boolean z10) {
        q.f9676a.i().d(wVar, f9718a[4], Boolean.valueOf(z10));
    }

    public static final void e(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.b(), new J0.a(str, interfaceC6824a));
    }

    public static final void e0(w wVar, h hVar) {
        q.f9676a.k().d(wVar, f9718a[10], hVar);
    }

    public static /* synthetic */ void f(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e(wVar, str, interfaceC6824a);
    }

    public static final void f0(w wVar, int i10) {
        q.f9676a.t().d(wVar, f9718a[3], e.c(i10));
    }

    public static final void g(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.c(), new J0.a(str, interfaceC6824a));
    }

    public static final void g0(w wVar, String str) {
        q.f9676a.v().d(wVar, f9718a[2], str);
    }

    public static /* synthetic */ void h(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g(wVar, str, interfaceC6824a);
    }

    public static final void h0(w wVar, f fVar) {
        q.f9676a.x().d(wVar, f9718a[1], fVar);
    }

    public static final void i(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.e(), new J0.a(str, interfaceC6824a));
    }

    public static final void i0(w wVar, int i10) {
        q.f9676a.y().d(wVar, f9718a[12], g.h(i10));
    }

    public static /* synthetic */ void j(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        i(wVar, str, interfaceC6824a);
    }

    public static final void j0(w wVar, boolean z10) {
        q.f9676a.A().d(wVar, f9718a[19], Boolean.valueOf(z10));
    }

    public static final void k(w wVar) {
        wVar.b(q.f9676a.o(), J.f24997a);
    }

    public static final void k0(w wVar, String str, mh.q qVar) {
        wVar.b(i.f9619a.x(), new J0.a(str, qVar));
    }

    public static final void l(w wVar) {
        wVar.b(q.f9676a.f(), J.f24997a);
    }

    public static /* synthetic */ void l0(w wVar, String str, mh.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        k0(wVar, str, qVar);
    }

    public static final void m(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.f(), new J0.a(str, interfaceC6824a));
    }

    public static final void m0(w wVar, boolean z10) {
        q.f9676a.r().d(wVar, f9718a[15], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void n(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        m(wVar, str, interfaceC6824a);
    }

    public static final void n0(w wVar, String str) {
        q.f9676a.C().d(wVar, f9718a[13], str);
    }

    public static final void o(w wVar, String str) {
        wVar.b(q.f9676a.h(), str);
    }

    public static final void o0(w wVar, C3174d c3174d) {
        wVar.b(q.f9676a.D(), AbstractC3689v.e(c3174d));
    }

    public static final void p(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.g(), new J0.a(str, interfaceC6824a));
    }

    public static final void p0(w wVar, String str, InterfaceC6835l interfaceC6835l) {
        wVar.b(i.f9619a.y(), new J0.a(str, interfaceC6835l));
    }

    public static /* synthetic */ void q(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        p(wVar, str, interfaceC6824a);
    }

    public static /* synthetic */ void q0(w wVar, String str, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        p0(wVar, str, interfaceC6835l);
    }

    public static final void r(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.h(), new J0.a(str, new a(interfaceC6824a)));
    }

    public static final void r0(w wVar, long j10) {
        q.f9676a.E().d(wVar, f9718a[17], S.b(j10));
    }

    public static /* synthetic */ void s(w wVar, String str, InterfaceC6824a interfaceC6824a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r(wVar, str, interfaceC6824a);
    }

    public static final void s0(w wVar, C3174d c3174d) {
        q.f9676a.F().d(wVar, f9718a[14], c3174d);
    }

    public static final void t(w wVar, String str, InterfaceC6835l interfaceC6835l) {
        wVar.b(i.f9619a.i(), new J0.a(str, interfaceC6835l));
    }

    public static final void t0(w wVar, String str, InterfaceC6835l interfaceC6835l) {
        wVar.b(i.f9619a.z(), new J0.a(str, interfaceC6835l));
    }

    public static /* synthetic */ void u(w wVar, String str, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        t(wVar, str, interfaceC6835l);
    }

    public static /* synthetic */ void u0(w wVar, String str, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        t0(wVar, str, interfaceC6835l);
    }

    public static final void v(w wVar, InterfaceC6835l interfaceC6835l) {
        wVar.b(q.f9676a.m(), interfaceC6835l);
    }

    public static final void v0(w wVar, K0.a aVar) {
        q.f9676a.G().d(wVar, f9718a[22], aVar);
    }

    public static final void w(w wVar, String str, InterfaceC6835l interfaceC6835l) {
        wVar.b(i.f9619a.j(), new J0.a(str, interfaceC6835l));
    }

    public static final void w0(w wVar, boolean z10) {
        q.f9676a.s().d(wVar, f9718a[6], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void x(w wVar, String str, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        w(wVar, str, interfaceC6835l);
    }

    public static final void x0(w wVar, h hVar) {
        q.f9676a.I().d(wVar, f9718a[11], hVar);
    }

    public static final void y(w wVar) {
        wVar.b(q.f9676a.n(), J.f24997a);
    }

    public static final void y0(w wVar, String str, InterfaceC6835l interfaceC6835l) {
        wVar.b(i.f9619a.A(), new J0.a(str, interfaceC6835l));
    }

    public static final void z(w wVar, String str, InterfaceC6824a interfaceC6824a) {
        wVar.b(i.f9619a.k(), new J0.a(str, interfaceC6824a));
    }

    public static /* synthetic */ void z0(w wVar, String str, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        y0(wVar, str, interfaceC6835l);
    }
}
