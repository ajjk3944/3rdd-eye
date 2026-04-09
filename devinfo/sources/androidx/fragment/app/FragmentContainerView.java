package androidx.fragment.app;

import a5.a;
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
import b5.b1;
import b5.d0;
import b5.k0;
import b5.u0;
import b5.z;
import com.liuzh.deviceinfo.R;
import d.h;
import e4.c2;
import e4.v0;
import i.g;
import java.util.ArrayList;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1092a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1093b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1094c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        k.e(context, "context");
        this.f1092a = new ArrayList();
        this.f1093b = new ArrayList();
        this.f1095d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f201b, 0, 0);
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
        if (this.f1093b.contains(view)) {
            this.f1092a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        k.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof z ? (z) tag : null) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        c2 c2VarJ;
        k.e(windowInsets, "insets");
        c2 c2VarH = c2.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1094c;
        if (onApplyWindowInsetsListener != null) {
            k.b(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            k.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c2VarJ = c2.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            c2VarJ = v0.j(this, c2VarH);
        }
        k.d(c2VarJ, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c2VarJ.f22315a.o()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                v0.c(getChildAt(i4), c2VarJ);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k.e(canvas, "canvas");
        if (this.f1095d) {
            ArrayList arrayList = this.f1092a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        k.e(canvas, "canvas");
        k.e(view, "child");
        if (this.f1095d) {
            ArrayList arrayList = this.f1092a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        k.e(view, "view");
        this.f1093b.remove(view);
        if (this.f1092a.remove(view)) {
            this.f1095d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends z> F getFragment() {
        g gVar;
        z zVar;
        u0 u0VarS;
        View view = this;
        while (true) {
            gVar = null;
            if (view == null) {
                zVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            zVar = tag instanceof z ? (z) tag : null;
            if (zVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (zVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof g) {
                    gVar = (g) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (gVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            u0VarS = gVar.s();
        } else {
            if (!zVar.y()) {
                throw new IllegalStateException("The Fragment " + zVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            u0VarS = zVar.o();
        }
        return (F) u0VarS.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k.e(windowInsets, "insets");
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
                k.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        k.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        View childAt = getChildAt(i4);
        k.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        k.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i4, int i10) {
        int i11 = i4 + i10;
        for (int i12 = i4; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            k.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i4, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i4, int i10) {
        int i11 = i4 + i10;
        for (int i12 = i4; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            k.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i4, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f1095d = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1094c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        k.e(view, "view");
        if (view.getParent() == this) {
            this.f1093b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, u0 u0Var) {
        View view;
        super(context, attributeSet);
        k.e(context, "context");
        k.e(attributeSet, "attrs");
        this.f1092a = new ArrayList();
        this.f1093b = new ArrayList();
        this.f1095d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i4 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f201b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        z zVarC = u0Var.C(id2);
        if (classAttribute != null && zVarC == null) {
            if (id2 == -1) {
                throw new IllegalStateException(h.t("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            k0 k0VarH = u0Var.H();
            context.getClassLoader();
            z zVarA = k0VarH.a(classAttribute);
            k.d(zVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            zVarA.f1951y = id2;
            zVarA.f1952z = id2;
            zVarA.A = string;
            zVarA.f1947u = u0Var;
            d0 d0Var = u0Var.f1898x;
            zVarA.f1948v = d0Var;
            zVarA.F = true;
            if ((d0Var == null ? null : d0Var.f1765a) != null) {
                zVarA.F = true;
            }
            b5.a aVar = new b5.a(u0Var);
            aVar.f1722q = true;
            zVarA.G = this;
            zVarA.f1943q = true;
            aVar.h(getId(), zVarA, string, 1);
            if (!aVar.f1715i) {
                aVar.f1724s.A(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListZ = u0Var.f1879c.z();
        int size = arrayListZ.size();
        while (i4 < size) {
            Object obj = arrayListZ.get(i4);
            i4++;
            b1 b1Var = (b1) obj;
            z zVar = b1Var.f1747c;
            if (zVar.f1952z == getId() && (view = zVar.H) != null && view.getParent() == null) {
                zVar.G = this;
                b1Var.b();
                b1Var.k();
            }
        }
    }
}
