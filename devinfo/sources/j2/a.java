package j2;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.liuzh.deviceinfo.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f27060a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f27061b;

    /* renamed from: c, reason: collision with root package name */
    public l2 f27062c;

    /* renamed from: d, reason: collision with root package name */
    public u0.t f27063d;

    /* renamed from: e, reason: collision with root package name */
    public w1 f27064e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27065f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27066h;

    private final void setParentContext(u0.t tVar) {
        if (this.f27063d != tVar) {
            this.f27063d = tVar;
            if (tVar != null) {
                this.f27060a = null;
            }
            l2 l2Var = this.f27062c;
            if (l2Var != null) {
                l2Var.a();
                this.f27062c = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f27061b != iBinder) {
            this.f27061b = iBinder;
            this.f27060a = null;
        }
    }

    public abstract void a(int i4, u0.p pVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i4, layoutParams);
    }

    public final void b() {
        if (this.g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f27062c == null) {
            try {
                this.g = true;
                this.f27062c = o2.a(this, d(), new c1.h(-656146368, true, new i1.j(1, this)));
            } finally {
                this.g = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u0.t d() {
        u0.s1 s1Var;
        ck.h hVar;
        l0 l0Var;
        u0.t tVarB = this.f27063d;
        if (tVarB == null) {
            tVarB = i2.b(this);
            if (tVarB == null) {
                Object parent = getParent();
                while (tVarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    tVarB = i2.b(view);
                    parent = com.bumptech.glide.e.D(view);
                }
            }
            if (tVarB != null) {
                u0.t tVar = (!(tVarB instanceof u0.s1) || ((u0.o1) ((u0.s1) tVarB).f34981u.getValue()).compareTo(u0.o1.f34893b) > 0) ? tVarB : null;
                if (tVar != null) {
                    this.f27060a = new WeakReference(tVar);
                }
            } else {
                tVarB = null;
            }
            if (tVarB == null) {
                WeakReference weakReference = this.f27060a;
                if (weakReference == null || (tVarB = (u0.t) weakReference.get()) == null || ((tVarB instanceof u0.s1) && ((u0.o1) ((u0.s1) tVarB).f34981u.getValue()).compareTo(u0.o1.f34893b) <= 0)) {
                    tVarB = null;
                }
                if (tVarB == null) {
                    if (!isAttachedToWindow()) {
                        f2.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
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
                    u0.t tVarB2 = i2.b(view2);
                    if (tVarB2 == null) {
                        ((d2) e2.f27137a.get()).getClass();
                        ck.i iVar = ck.i.f2898a;
                        yj.n nVar = j0.f27189m;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (ck.h) j0.f27189m.getValue();
                        } else {
                            hVar = (ck.h) j0.f27190n.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        ck.h hVarY = hVar.y(iVar);
                        l0 l0Var2 = (l0) hVarY.O(u0.e.f34768c);
                        if (l0Var2 != null) {
                            l0 l0Var3 = new l0(l0Var2);
                            b5.i0 i0Var = (b5.i0) l0Var3.f27220c;
                            synchronized (i0Var.f1822c) {
                                i0Var.f1820a = false;
                                l0Var = l0Var3;
                            }
                        } else {
                            l0Var = 0;
                        }
                        nk.u uVar = new nk.u();
                        ck.h o1Var = (i1.o) hVarY.O(i1.b.f25541m);
                        if (o1Var == null) {
                            o1Var = new o1();
                            uVar.f29986a = o1Var;
                        }
                        if (l0Var != 0) {
                            iVar = l0Var;
                        }
                        ck.h hVarY2 = hVarY.y(iVar).y(o1Var);
                        u0.s1 s1Var2 = new u0.s1(hVarY2);
                        s1Var2.K();
                        cl.d dVarB = xk.x.b(hVarY2);
                        androidx.lifecycle.a0 a0VarE = androidx.lifecycle.y0.e(view2);
                        androidx.lifecycle.c0 c0VarJ = a0VarE != null ? a0VarE.j() : null;
                        if (c0VarJ == null) {
                            f2.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new ac.m();
                        }
                        view2.addOnAttachStateChangeListener(new b5.f0(view2, s1Var2));
                        c0VarJ.a(new g2(dVarB, l0Var, s1Var2, uVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, s1Var2);
                        xk.t0 t0Var = xk.t0.f37238a;
                        Handler handler = view2.getHandler();
                        int i4 = yk.e.f37659a;
                        view2.addOnAttachStateChangeListener(new b5.a1(2, xk.x.v(t0Var, new yk.d(handler, "windowRecomposer cleanup", false).f37658f, null, new al.p(s1Var2, view2, cVar, 20), 2)));
                        s1Var = s1Var2;
                    } else {
                        if (!(tVarB2 instanceof u0.s1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        s1Var = (u0.s1) tVarB2;
                    }
                    cVar = ((u0.o1) s1Var.f34981u.getValue()).compareTo(u0.o1.f34893b) > 0 ? s1Var : null;
                    if (cVar != null) {
                        this.f27060a = new WeakReference(cVar);
                    }
                    return s1Var;
                }
            }
        }
        return tVarB;
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m183getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        r0 r0Var = tag instanceof r0 ? (r0) tag : null;
        if (r0Var != null) {
            return r0Var.f27302a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.f27062c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f27065f;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f27066h || super.isTransitionGroup();
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
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i4) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i4, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i4)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i4);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m184setAutoClearFocusBehavior17tfJxM(int i4) {
        setTag(R.id.auto_clear_focus_behavior_tag, new r0(i4));
    }

    public final void setParentCompositionContext(u0.t tVar) {
        setParentContext(tVar);
    }

    public final void setShowLayoutBounds(boolean z3) {
        this.f27065f = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((r) ((i2.m1) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.f27066h = true;
    }

    public final void setViewCompositionStrategy(x1 x1Var) {
        w1 w1Var = this.f27064e;
        if (w1Var != null) {
            w1Var.invoke();
        }
        ((d0) x1Var).getClass();
        b5.a1 a1Var = new b5.a1(1, this);
        addOnAttachStateChangeListener(a1Var);
        v1 v1Var = new v1(this);
        pd.b.k(this).f28588a.add(v1Var);
        this.f27064e = new w1(this, a1Var, v1Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        b();
        super.addView(view, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z3) {
        b();
        return super.addViewInLayout(view, i4, layoutParams, z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, int i10) {
        b();
        super.addView(view, i4, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i4, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
