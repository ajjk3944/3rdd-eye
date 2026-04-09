package androidx.fragment.app;

import A.f;
import R.D;
import R.O;
import R.r0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.apm.insight.R;
import h.AbstractActivityC2349g;
import j0.AbstractC2541a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2597a;
import k0.E;
import k0.K;
import k0.P;
import q5.i;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5166a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5167b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f5168c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5169d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f5166a = new ArrayList();
        this.f5167b = new ArrayList();
        this.f5169d = true;
    }

    public final void a(View view) {
        if (this.f5167b.contains(view)) {
            this.f5166a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC2617v ? (AbstractComponentCallbacksC2617v) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        r0 r0VarG;
        i.e(windowInsets, "insets");
        r0 r0VarG2 = r0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5168c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            i.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            r0VarG = r0.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = O.f3270a;
            WindowInsets windowInsetsF = r0VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = D.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    r0VarG2 = r0.g(this, windowInsetsB);
                }
            }
            r0VarG = r0VarG2;
        }
        if (!r0VarG.f3359a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                O.b(getChildAt(i), r0VarG);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        if (this.f5169d) {
            ArrayList arrayList = this.f5166a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        i.e(canvas, "canvas");
        i.e(view, "child");
        if (this.f5169d) {
            ArrayList arrayList = this.f5166a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i.e(view, "view");
        this.f5167b.remove(view);
        if (this.f5166a.remove(view)) {
            this.f5169d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC2617v> F getFragment() {
        AbstractActivityC2349g abstractActivityC2349g;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v;
        K kS;
        View view = this;
        while (true) {
            abstractActivityC2349g = null;
            if (view == null) {
                abstractComponentCallbacksC2617v = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC2617v = tag instanceof AbstractComponentCallbacksC2617v ? (AbstractComponentCallbacksC2617v) tag : null;
            if (abstractComponentCallbacksC2617v != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC2617v == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC2349g) {
                    abstractActivityC2349g = (AbstractActivityC2349g) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC2349g == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            kS = abstractActivityC2349g.s();
        } else {
            if (!abstractComponentCallbacksC2617v.v()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC2617v + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            kS = abstractComponentCallbacksC2617v.l();
        }
        return (F) kS.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i.e(windowInsets, "insets");
        return windowInsets;
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
                View childAt = getChildAt(childCount);
                i.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        i.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i3) {
        int i6 = i + i3;
        for (int i7 = i; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            i.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i3) {
        int i6 = i + i3;
        for (int i7 = i; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            i.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f5169d = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        i.e(onApplyWindowInsetsListener, "listener");
        this.f5168c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i.e(view, "view");
        if (view.getParent() == this) {
            this.f5167b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        i.e(context, "context");
        this.f5166a = new ArrayList();
        this.f5167b = new ArrayList();
        this.f5169d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2541a.f21293b, 0, 0);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, K k6) {
        View view;
        super(context, attributeSet);
        i.e(context, "context");
        i.e(attributeSet, "attrs");
        this.f5166a = new ArrayList();
        this.f5167b = new ArrayList();
        this.f5169d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2541a.f21293b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vB = k6.B(id);
        if (classAttribute != null && abstractComponentCallbacksC2617vB == null) {
            if (id == -1) {
                throw new IllegalStateException(f.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            E E6 = k6.E();
            context.getClassLoader();
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vA = E6.a(classAttribute);
            i.d(abstractComponentCallbacksC2617vA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC2617vA.G(context, attributeSet, null);
            C2597a c2597a = new C2597a(k6);
            c2597a.f21600p = true;
            abstractComponentCallbacksC2617vA.f21695S = this;
            c2597a.f(getId(), abstractComponentCallbacksC2617vA, string, 1);
            if (!c2597a.f21592g) {
                c2597a.f21593h = false;
                c2597a.f21601q.y(c2597a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListQ = k6.f21505c.q();
        int size = arrayListQ.size();
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            P p6 = (P) obj;
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
            if (abstractComponentCallbacksC2617v.f21689L == getId() && (view = abstractComponentCallbacksC2617v.f21696T) != null && view.getParent() == null) {
                abstractComponentCallbacksC2617v.f21695S = this;
                p6.b();
            }
        }
    }
}
