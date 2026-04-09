package androidx.fragment.app;

import L0.X;
import N7.C1154e9;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f1.C4330a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FragmentContainerView.kt */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15776b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15777c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f15778d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        kotlin.jvm.internal.l.f(context, "context");
        this.f15776b = new ArrayList();
        this.f15777c = new ArrayList();
        this.f15779e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4330a.f37811b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f15777c.contains(view)) {
            this.f15776b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC1759l ? (ComponentCallbacksC1759l) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        X xJ;
        kotlin.jvm.internal.l.f(insets, "insets");
        X xH = X.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f15778d;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.l.c(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.l.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            xJ = X.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            xJ = L0.I.j(this, xH);
        }
        kotlin.jvm.internal.l.e(xJ, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!xJ.f3850a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                L0.I.b(getChildAt(i), xJ);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (this.f15779e) {
            Iterator it = this.f15776b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j4) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        kotlin.jvm.internal.l.f(child, "child");
        if (this.f15779e) {
            ArrayList arrayList = this.f15776b;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f15777c.remove(view);
        if (this.f15776b.remove(view)) {
            this.f15779e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends ComponentCallbacksC1759l> F getFragment() {
        ActivityC1762o activityC1762o;
        ComponentCallbacksC1759l componentCallbacksC1759l;
        x supportFragmentManager;
        View view = this;
        while (true) {
            activityC1762o = null;
            if (view == null) {
                componentCallbacksC1759l = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            componentCallbacksC1759l = tag instanceof ComponentCallbacksC1759l ? (ComponentCallbacksC1759l) tag : null;
            if (componentCallbacksC1759l != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (componentCallbacksC1759l == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof ActivityC1762o) {
                    activityC1762o = (ActivityC1762o) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activityC1762o == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = activityC1762o.getSupportFragmentManager();
        } else {
            if (!componentCallbacksC1759l.isAdded()) {
                throw new IllegalStateException("The Fragment " + componentCallbacksC1759l + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = componentCallbacksC1759l.getChildFragmentManager();
        }
        return (F) supportFragmentManager.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.l.f(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.l.e(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        kotlin.jvm.internal.l.e(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i10) {
        int i11 = i + i10;
        for (int i12 = i; i12 < i11; i12++) {
            View view = getChildAt(i12);
            kotlin.jvm.internal.l.e(view, "view");
            a(view);
        }
        super.removeViews(i, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i10) {
        int i11 = i + i10;
        for (int i12 = i; i12 < i11; i12++) {
            View view = getChildAt(i12);
            kotlin.jvm.internal.l.e(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f15779e = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f15778d = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        if (view.getParent() == this) {
            this.f15777c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, x fm) {
        View view;
        super(context, attrs);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(attrs, "attrs");
        kotlin.jvm.internal.l.f(fm, "fm");
        this.f15776b = new ArrayList();
        this.f15777c = new ArrayList();
        this.f15779e = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C4330a.f37811b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC1759l componentCallbacksC1759lA = fm.A(id);
        if (classAttribute != null && componentCallbacksC1759lA == null) {
            if (id == -1) {
                throw new IllegalStateException(C1154e9.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C1765s c1765sD = fm.D();
            context.getClassLoader();
            ComponentCallbacksC1759l componentCallbacksC1759lA2 = c1765sD.a(classAttribute);
            kotlin.jvm.internal.l.e(componentCallbacksC1759lA2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC1759lA2.mFragmentId = id;
            componentCallbacksC1759lA2.mContainerId = id;
            componentCallbacksC1759lA2.mTag = string;
            componentCallbacksC1759lA2.mFragmentManager = fm;
            componentCallbacksC1759lA2.mHost = fm.f15995u;
            componentCallbacksC1759lA2.onInflate(context, attrs, (Bundle) null);
            C1748a c1748a = new C1748a(fm);
            c1748a.f15798p = true;
            componentCallbacksC1759lA2.mContainer = this;
            c1748a.c(getId(), componentCallbacksC1759lA2, string, 1);
            if (!c1748a.f15790g) {
                c1748a.f15791h = false;
                c1748a.f15849q.y(c1748a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm.f15978c.d().iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            ComponentCallbacksC1759l componentCallbacksC1759l = f10.f15771c;
            if (componentCallbacksC1759l.mContainerId == getId() && (view = componentCallbacksC1759l.mView) != null && view.getParent() == null) {
                componentCallbacksC1759l.mContainer = this;
                f10.b();
            }
        }
    }
}
