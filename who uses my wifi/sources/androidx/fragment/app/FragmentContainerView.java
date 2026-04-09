package androidx.fragment.app;

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
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.cn0;
import defpackage.e61;
import defpackage.ex;
import defpackage.ex0;
import defpackage.g9;
import defpackage.i30;
import defpackage.i5;
import defpackage.iw;
import defpackage.kw;
import defpackage.o91;
import defpackage.r51;
import defpackage.sw;
import defpackage.xw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList f;
    public final ArrayList g;
    public View.OnApplyWindowInsetsListener h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        i30.m(context, "context");
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cn0.b, 0, 0);
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
        if (this.g.contains(view)) {
            this.f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i30.m(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof iw ? (iw) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        o91 o91VarG;
        i30.m(windowInsets, "insets");
        o91 o91VarG2 = o91.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            i30.l(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            o91VarG = o91.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = e61.a;
            WindowInsets windowInsetsF = o91VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = r51.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    o91VarG2 = o91.g(this, windowInsetsB);
                }
            }
            o91VarG = o91VarG2;
        }
        if (!o91VarG.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = e61.a;
                WindowInsets windowInsetsF2 = o91VarG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = r51.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        o91.g(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i30.m(canvas, "canvas");
        if (this.i) {
            ArrayList arrayList = this.f;
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
    public final boolean drawChild(Canvas canvas, View view, long j) {
        i30.m(canvas, "canvas");
        i30.m(view, "child");
        if (this.i) {
            ArrayList arrayList = this.f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i30.m(view, "view");
        this.g.remove(view);
        if (this.f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends iw> F getFragment() {
        i5 i5Var;
        iw iwVar;
        xw xwVarO;
        View view = this;
        while (true) {
            i5Var = null;
            if (view == null) {
                iwVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            iwVar = tag instanceof iw ? (iw) tag : null;
            if (iwVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (iwVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof i5) {
                    i5Var = (i5) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (i5Var == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            xwVarO = i5Var.o();
        } else {
            if (iwVar.x == null || !iwVar.p) {
                throw new IllegalStateException("The Fragment " + iwVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            xwVarO = iwVar.h();
        }
        return (F) xwVarO.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i30.m(windowInsets, "insets");
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
                i30.l(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i30.m(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        i30.l(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i30.m(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            i30.l(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            i30.l(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.i = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        i30.m(onApplyWindowInsetsListener, "listener");
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i30.m(view, "view");
        if (view.getParent() == this) {
            this.g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, xw xwVar) {
        View view;
        super(context, attributeSet);
        i30.m(context, "context");
        i30.m(attributeSet, "attrs");
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cn0.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        iw iwVarA = xwVar.A(id);
        if (classAttribute != null && iwVarA == null) {
            if (id == -1) {
                throw new IllegalStateException(ex0.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            sw swVarD = xwVar.D();
            context.getClassLoader();
            iw iwVarA2 = swVarD.a(classAttribute);
            i30.l(iwVarA2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            iwVarA2.H = true;
            kw kwVar = iwVarA2.x;
            if ((kwVar == null ? null : kwVar.w) != null) {
                iwVarA2.H = true;
            }
            g9 g9Var = new g9(xwVar);
            g9Var.p = true;
            iwVarA2.I = this;
            g9Var.e(getId(), iwVarA2, string, 1);
            if (!g9Var.g) {
                g9Var.h = false;
                xw xwVar2 = g9Var.q;
                if (xwVar2.t != null && !xwVar2.G) {
                    xwVar2.x(true);
                    g9Var.a(xwVar2.I, xwVar2.J);
                    xwVar2.b = true;
                    try {
                        xwVar2.Q(xwVar2.I, xwVar2.J);
                        xwVar2.d();
                        xwVar2.a0();
                        xwVar2.u();
                        ((HashMap) xwVar2.c.g).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        xwVar2.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListL = xwVar.c.l();
        int size = arrayListL.size();
        while (i < size) {
            Object obj = arrayListL.get(i);
            i++;
            ex exVar = (ex) obj;
            iw iwVar = exVar.c;
            if (iwVar.B == getId() && (view = iwVar.J) != null && view.getParent() == null) {
                iwVar.I = this;
                exVar.b();
            }
        }
    }
}
