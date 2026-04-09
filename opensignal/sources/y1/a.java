package y1;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public boolean B;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f25620a;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f25621d;

    /* renamed from: g, reason: collision with root package name */
    public i2 f25622g;

    /* renamed from: r, reason: collision with root package name */
    public n0.s f25623r;

    /* renamed from: x, reason: collision with root package name */
    public ar.a f25624x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25625y;

    private final void setParentContext(n0.s sVar) {
        if (this.f25623r != sVar) {
            this.f25623r = sVar;
            if (sVar != null) {
                this.f25620a = null;
            }
            i2 i2Var = this.f25622g;
            if (i2Var != null) {
                i2Var.a();
                this.f25622g = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f25621d != iBinder) {
            this.f25621d = iBinder;
            this.f25620a = null;
        }
    }

    public abstract void a(int i10, n0.p pVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.B) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f25622g == null) {
            try {
                this.B = true;
                this.f25622g = j2.a(this, d(), new v0.d(new gv.a(6, this), -656146368, true));
            } finally {
                this.B = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n0.s d() {
        n0.o1 o1Var;
        pq.h hVar;
        n0.b1 b1Var;
        n0.s sVarB = this.f25623r;
        if (sVarB == null) {
            sVarB = f2.b(this);
            if (sVarB == null) {
                Object parent = getParent();
                while (sVarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    sVarB = f2.b(view);
                    parent = view.getParent();
                }
            }
            if (sVarB != null) {
                n0.s sVar = (!(sVarB instanceof n0.o1) || ((n0.l1) ((n0.o1) sVarB).f17250t.getValue()).compareTo(n0.l1.ShuttingDown) > 0) ? sVarB : null;
                if (sVar != null) {
                    this.f25620a = new WeakReference(sVar);
                }
            } else {
                sVarB = null;
            }
            if (sVarB == null) {
                WeakReference weakReference = this.f25620a;
                if (weakReference == null || (sVarB = (n0.s) weakReference.get()) == null || ((sVarB instanceof n0.o1) && ((n0.l1) ((n0.o1) sVarB).f17250t.getValue()).compareTo(n0.l1.ShuttingDown) <= 0)) {
                    sVarB = null;
                }
                if (sVarB == null) {
                    if (!isAttachedToWindow()) {
                        u1.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    n0.s sVarB2 = f2.b(view2);
                    if (sVarB2 == null) {
                        ((b2) c2.f25659a.get()).getClass();
                        pq.i iVar = pq.i.f20621a;
                        lq.q qVar = n0.I;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (pq.h) n0.I.getValue();
                        } else {
                            hVar = (pq.h) n0.J.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        pq.h hVarI0 = hVar.i0(iVar);
                        n0.u0 u0Var = (n0.u0) hVarI0.Y(n0.t0.f17317d);
                        if (u0Var != null) {
                            n0.b1 b1Var2 = new n0.b1(u0Var);
                            d8.a aVar = (d8.a) b1Var2.f17136g;
                            synchronized (aVar.f7149c) {
                                aVar.f7148b = false;
                                b1Var = b1Var2;
                            }
                        } else {
                            b1Var = 0;
                        }
                        br.w wVar = new br.w();
                        m1 m1Var = (m1) hVarI0.Y(z0.b.I);
                        if (m1Var == null) {
                            m1Var = new m1();
                            wVar.f2917a = m1Var;
                        }
                        if (b1Var != 0) {
                            iVar = b1Var;
                        }
                        pq.h hVarI02 = hVarI0.i0(iVar).i0(m1Var);
                        n0.o1 o1Var2 = new n0.o1(hVarI02);
                        synchronized (o1Var2.f17234b) {
                            o1Var2.f17249s = true;
                        }
                        bu.c cVarB = wt.w.b(hVarI02);
                        androidx.lifecycle.v vVarC = androidx.lifecycle.o0.c(view2);
                        androidx.lifecycle.o oVarH = vVarC != null ? vVarC.h() : null;
                        if (oVarH == null) {
                            u1.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new bf.n();
                        }
                        view2.addOnAttachStateChangeListener(new o4.z(2, view2, o1Var2));
                        oVarH.V0(new e2(cVarB, b1Var, o1Var2, wVar, view2));
                        view2.setTag(z0.n.androidx_compose_ui_view_composition_context, o1Var2);
                        wt.n0 n0Var = wt.n0.f24641a;
                        Handler handler = view2.getHandler();
                        int i10 = xt.d.f25528a;
                        view2.addOnAttachStateChangeListener(new g1.e(10, wt.w.s(n0Var, new xt.c(handler, "windowRecomposer cleanup", false).f25527y, null, new a8.h(o1Var2, view2, cVar, 23), 2)));
                        o1Var = o1Var2;
                    } else {
                        if (!(sVarB2 instanceof n0.o1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        o1Var = (n0.o1) sVarB2;
                    }
                    cVar = ((n0.l1) o1Var.f17250t.getValue()).compareTo(n0.l1.ShuttingDown) > 0 ? o1Var : null;
                    if (cVar != null) {
                        this.f25620a = new WeakReference(cVar);
                    }
                    return o1Var;
                }
            }
        }
        return sVarB;
    }

    public final boolean getHasComposition() {
        return this.f25622g != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f25625y;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.D || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(n0.s sVar) {
        setParentContext(sVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f25625y = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.D = true;
    }

    public final void setViewCompositionStrategy(w1 w1Var) {
        ar.a aVar = this.f25624x;
        if (aVar != null) {
            aVar.c();
        }
        this.f25624x = w1Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
