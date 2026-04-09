package b5;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.liuzh.deviceinfo.R;
import j2.l2;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1730b;

    public /* synthetic */ a1(int i4, Object obj) {
        this.f1729a = i4;
        this.f1730b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.f1729a;
        Object obj = this.f1730b;
        switch (i4) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = e4.v0.f22405a;
                e4.k0.c(view2);
                break;
            case 1:
            case 2:
                break;
            case 3:
                kd.o oVar = (kd.o) obj;
                AccessibilityManager accessibilityManager = oVar.f28192t;
                if (oVar.f28193u != null && accessibilityManager != null && oVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(oVar.f28193u);
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                p1.f fVar = (p1.f) obj;
                Context context = view.getContext();
                if (!fVar.f30960d) {
                    context.getApplicationContext().registerComponentCallbacks(fVar.f30961e);
                    fVar.f30960d = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z3;
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f1729a) {
            case 0:
                break;
            case 1:
                j2.a aVar = (j2.a) this.f1730b;
                ViewParent parent = aVar.getParent();
                Iterator it = (parent == null ? uk.d.f35519a : new uk.e(new a6.e(25, parent), e4.z0.f22424i)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            nk.k.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    l2 l2Var = aVar.f27062c;
                    if (l2Var != null) {
                        l2Var.a();
                    }
                    aVar.f27062c = null;
                    aVar.requestLayout();
                    break;
                }
                break;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((xk.a0) this.f1730b).e(null);
                break;
            case 3:
                kd.o oVar = (kd.o) this.f1730b;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = oVar.f28193u;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = oVar.f28192t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f1730b;
                mc.a aVar2 = hideBottomViewOnScrollBehavior.f20332h;
                if (aVar2 != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideBottomViewOnScrollBehavior.f20332h = null;
                    break;
                }
                break;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f1730b;
                mc.a aVar3 = hideViewOnScrollBehavior.f20337c;
                if (aVar3 != null && (accessibilityManager3 = hideViewOnScrollBehavior.f20336b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(aVar3);
                    hideViewOnScrollBehavior.f20337c = null;
                    break;
                }
                break;
            case 6:
                o.g gVar = (o.g) this.f1730b;
                ViewTreeObserver viewTreeObserver = gVar.f30220x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f30220x = view.getViewTreeObserver();
                    }
                    gVar.f30220x.removeGlobalOnLayoutListener(gVar.f30206i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 7:
                o.d0 d0Var = (o.d0) this.f1730b;
                ViewTreeObserver viewTreeObserver2 = d0Var.f30188o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f30188o = view.getViewTreeObserver();
                    }
                    d0Var.f30188o.removeGlobalOnLayoutListener(d0Var.f30183i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                p1.f fVar = (p1.f) this.f1730b;
                Context context = view.getContext();
                if (fVar.f30960d) {
                    context.getApplicationContext().unregisterComponentCallbacks(fVar.f30961e);
                    fVar.f30960d = false;
                    break;
                }
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
