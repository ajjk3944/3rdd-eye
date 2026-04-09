package androidx.compose.ui.viewinterop;

import E0.AbstractC2633k;
import E0.AbstractC2635m;
import E0.e0;
import E0.m0;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.focus.s;
import k0.q;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class g extends e.c implements k0.h, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    private View f29853n;

    /* synthetic */ class a extends C6490p implements InterfaceC6835l {
        a(Object obj) {
            super(1, obj, g.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final o a(int i10) {
            return ((g) this.receiver).E2(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.focus.d) obj).o());
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6835l {
        b(Object obj) {
            super(1, obj, g.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final o a(int i10) {
            return ((g) this.receiver).F2(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.focus.d) obj).o());
        }
    }

    private final FocusTargetNode D2() {
        int iA = e0.a(1024);
        if (!h1().k2()) {
            B0.a.b("visitLocalDescendants called on an unattached node");
        }
        e.c cVarH1 = h1();
        if ((cVarH1.a2() & iA) != 0) {
            boolean z10 = false;
            for (e.c cVarB2 = cVarH1.b2(); cVarB2 != null; cVarB2 = cVarB2.b2()) {
                if ((cVarB2.f2() & iA) != 0) {
                    e.c cVarG = cVarB2;
                    V.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                            int i10 = 0;
                            for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                if ((cVarE2.f2() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarG = cVarE2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new V.b(new e.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            bVar.b(cVarG);
                                            cVarG = null;
                                        }
                                        bVar.b(cVarE2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarG = AbstractC2633k.g(bVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public final o E2(int i10) {
        View viewG = f.g(this);
        if (viewG.isFocused() || viewG.hasFocus()) {
            return o.f28853b.b();
        }
        k0.g focusOwner = AbstractC2633k.n(this).getFocusOwner();
        Object objN = AbstractC2633k.n(this);
        AbstractC6492s.g(objN, "null cannot be cast to non-null type android.view.View");
        return androidx.compose.ui.focus.h.b(viewG, androidx.compose.ui.focus.h.c(i10), f.f(focusOwner, (View) objN, viewG)) ? o.f28853b.b() : o.f28853b.a();
    }

    public final o F2(int i10) {
        View viewG = f.g(this);
        if (!viewG.hasFocus()) {
            return o.f28853b.b();
        }
        k0.g focusOwner = AbstractC2633k.n(this).getFocusOwner();
        Object objN = AbstractC2633k.n(this);
        AbstractC6492s.g(objN, "null cannot be cast to non-null type android.view.View");
        View view = (View) objN;
        if (!(viewG instanceof ViewGroup)) {
            if (view.requestFocus()) {
                return o.f28853b.b();
            }
            throw new IllegalStateException("host view did not take focus");
        }
        Rect rectF = f.f(focusOwner, view, viewG);
        Integer numC = androidx.compose.ui.focus.h.c(i10);
        int iIntValue = numC != null ? numC.intValue() : 130;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view2 = this.f29853n;
        View viewFindNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, rectF, iIntValue);
        if (viewFindNextFocus != null && f.d(viewG, viewFindNextFocus)) {
            viewFindNextFocus.requestFocus(iIntValue, rectF);
            return o.f28853b.a();
        }
        if (view.requestFocus()) {
            return o.f28853b.b();
        }
        throw new IllegalStateException("host view did not take focus");
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        super.n2();
        f.g(this).addOnAttachStateChangeListener(this);
    }

    @Override // k0.h
    public void o0(k kVar) {
        kVar.w(false);
        kVar.p(new a(this));
        kVar.q(new b(this));
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        f.g(this).removeOnAttachStateChangeListener(this);
        this.f29853n = null;
        super.o2();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC2633k.m(this).n0() == null) {
            return;
        }
        View viewG = f.g(this);
        k0.g focusOwner = AbstractC2633k.n(this).getFocusOwner();
        m0 m0VarN = AbstractC2633k.n(this);
        boolean z10 = (view == null || AbstractC6492s.d(view, m0VarN) || !f.d(viewG, view)) ? false : true;
        boolean z11 = (view2 == null || AbstractC6492s.d(view2, m0VarN) || !f.d(viewG, view2)) ? false : true;
        if (z10 && z11) {
            this.f29853n = view2;
            return;
        }
        if (!z11) {
            if (!z10) {
                this.f29853n = null;
                return;
            }
            this.f29853n = null;
            if (D2().K2().isFocused()) {
                focusOwner.e(false, true, false, androidx.compose.ui.focus.d.f28823b.c());
                return;
            }
            return;
        }
        this.f29853n = view2;
        FocusTargetNode focusTargetNodeD2 = D2();
        if (focusTargetNodeD2.K2().getHasFocus()) {
            return;
        }
        q qVarG = focusOwner.g();
        try {
            if (qVarG.f51016c) {
                qVarG.g();
            }
            qVarG.f();
            s.i(focusTargetNodeD2);
            qVarG.h();
        } catch (Throwable th2) {
            qVarG.h();
            throw th2;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
