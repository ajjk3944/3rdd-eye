package g1;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.WeakHashMap;
import y1.i2;

/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9205a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9206d;

    public /* synthetic */ e(int i10, Object obj) {
        this.f9205a = i10;
        this.f9206d = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f9205a;
        Object obj = this.f9206d;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                Context context = view.getContext();
                if (!fVar.f9208a) {
                    context.getApplicationContext().registerComponentCallbacks((d) fVar.f9212x);
                    fVar.f9208a = true;
                    break;
                }
                break;
            case 3:
                view.getViewTreeObserver().addOnDrawListener((io.sentry.android.core.internal.util.j) obj);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                je.m mVar = (je.m) obj;
                AccessibilityManager accessibilityManager = mVar.P;
                if (mVar.Q != null && accessibilityManager != null && mVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(mVar.Q);
                    break;
                }
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = u3.i0.f23177a;
                u3.x.c(view2);
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                y1.x xVar = (y1.x) obj;
                AccessibilityManager accessibilityManager2 = xVar.f25795g;
                xVar.k = accessibilityManager2.getEnabledAccessibilityServiceList(-1);
                accessibilityManager2.addAccessibilityStateChangeListener(xVar.f25797i);
                accessibilityManager2.addTouchExplorationStateChangeListener(xVar.j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i10 = this.f9205a;
        boolean z10 = false;
        Object obj = this.f9206d;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                Context context = view.getContext();
                if (fVar.f9208a) {
                    context.getApplicationContext().unregisterComponentCallbacks((d) fVar.f9212x);
                    fVar.f9208a = false;
                    break;
                }
                break;
            case 1:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                id.a aVar = hideBottomViewOnScrollBehavior.f5486h;
                if (aVar != null && (accessibilityManager = hideBottomViewOnScrollBehavior.f5485g) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f5486h = null;
                    break;
                }
                break;
            case 2:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                id.a aVar2 = hideViewOnScrollBehavior.f5493c;
                if (aVar2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.f5492b) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.f5493c = null;
                    break;
                }
                break;
            case 3:
                view.removeOnAttachStateChangeListener(this);
                break;
            case 4:
                je.m mVar = (je.m) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = mVar.Q;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = mVar.P) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                o.g gVar = (o.g) obj;
                ViewTreeObserver viewTreeObserver = gVar.T;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.T = view.getViewTreeObserver();
                    }
                    gVar.T.removeGlobalOnLayoutListener(gVar.E);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                o.d0 d0Var = (o.d0) obj;
                ViewTreeObserver viewTreeObserver2 = d0Var.K;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.K = view.getViewTreeObserver();
                    }
                    d0Var.K.removeGlobalOnLayoutListener(d0Var.E);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                y1.x xVar = (y1.x) obj;
                xVar.f25798l.removeCallbacks(xVar.K);
                AccessibilityManager accessibilityManager4 = xVar.f25795g;
                accessibilityManager4.removeAccessibilityStateChangeListener(xVar.f25797i);
                accessibilityManager4.removeTouchExplorationStateChangeListener(xVar.j);
                break;
            case 9:
                y1.a aVar3 = (y1.a) obj;
                int i11 = z3.a.f26622a;
                Iterator it = st.l.a0(aVar3.getParent(), u3.k0.E).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            br.l.e(view2, "<this>");
                            Object tag = view2.getTag(z3.a.f26623b);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z10 = true;
                            }
                        }
                    }
                }
                if (!z10) {
                    i2 i2Var = aVar3.f25622g;
                    if (i2Var != null) {
                        i2Var.a();
                    }
                    aVar3.f25622g = null;
                    aVar3.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((wt.z) obj).h(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}
