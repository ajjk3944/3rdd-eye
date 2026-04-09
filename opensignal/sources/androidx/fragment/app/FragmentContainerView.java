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
import br.l;
import g4.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import o4.e0;
import u3.h1;
import u3.i0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Llq/b0;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/b;", "F", "getFragment", "()Landroidx/fragment/app/b;", "fragment_release"}, k = 1, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1387a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1388d;

    /* renamed from: g, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1389g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1390r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        l.e(context, "context");
        this.f1387a = new ArrayList();
        this.f1388d = new ArrayList();
        this.f1390r = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = n4.c.FragmentContainerView;
            l.d(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(n4.c.FragmentContainerView_android_name);
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
        if (this.f1388d.contains(view)) {
            this.f1387a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        l.e(view, "child");
        Object tag = view.getTag(n4.b.fragment_container_view_tag);
        if ((tag instanceof b ? (b) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h1 h1VarI;
        l.e(windowInsets, "insets");
        h1 h1VarG = h1.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1389g;
        if (onApplyWindowInsetsListener != null) {
            l.b(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            l.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            h1VarI = h1.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            h1VarI = i0.i(this, h1VarG);
        }
        l.d(h1VarI, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!h1VarI.f23176a.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                i0.b(getChildAt(i10), h1VarI);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        if (this.f1390r) {
            Iterator it = this.f1387a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        l.e(canvas, "canvas");
        l.e(view, "child");
        if (this.f1390r) {
            ArrayList arrayList = this.f1387a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        l.e(view, "view");
        this.f1388d.remove(view);
        if (this.f1387a.remove(view)) {
            this.f1390r = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends b> F getFragment() {
        i.j jVar;
        b bVar;
        d dVarO;
        View view = this;
        while (true) {
            jVar = null;
            if (view == null) {
                bVar = null;
                break;
            }
            Object tag = view.getTag(n4.b.fragment_container_view_tag);
            bVar = tag instanceof b ? (b) tag : null;
            if (bVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (bVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof i.j) {
                    jVar = (i.j) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (jVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            dVarO = jVar.o();
        } else {
            if (!bVar.w()) {
                throw new IllegalStateException("The Fragment " + bVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            dVarO = bVar.m();
        }
        return (F) dVarO.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l.e(windowInsets, "insets");
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
                l.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        l.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        l.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        l.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            l.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            l.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f1390r = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.f1389g = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        l.e(view, "view");
        if (view.getParent() == this) {
            this.f1388d.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, d dVar) {
        View view;
        super(context, attributeSet);
        l.e(context, "context");
        l.e(attributeSet, "attrs");
        this.f1387a = new ArrayList();
        this.f1388d = new ArrayList();
        this.f1390r = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = n4.c.FragmentContainerView;
        l.d(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(n4.c.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(n4.c.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        b bVarD = dVar.D(id2);
        if (classAttribute != null && bVarD == null) {
            if (id2 == -1) {
                throw new IllegalStateException(h0.b.o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            e0 e0VarI = dVar.I();
            context.getClassLoader();
            b bVarA = e0VarI.a(classAttribute);
            l.d(bVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            bVarA.U = id2;
            bVarA.V = id2;
            bVarA.W = string;
            bVarA.Q = dVar;
            bVarA.R = dVar.f1456w;
            bVarA.L(attributeSet, null);
            o4.a aVar = new o4.a(dVar);
            aVar.f18770o = true;
            bVarA.f1412d0 = this;
            bVarA.M = true;
            aVar.g(getId(), bVarA, string, 1);
            if (!aVar.f18764g) {
                aVar.f18772q.B(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = dVar.f1438c.W().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            b bVar = eVar.f1462c;
            if (bVar.V == getId() && (view = bVar.f1413e0) != null && view.getParent() == null) {
                bVar.f1412d0 = this;
                eVar.b();
                eVar.k();
            }
        }
    }
}
