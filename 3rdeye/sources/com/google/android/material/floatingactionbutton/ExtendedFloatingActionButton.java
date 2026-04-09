package com.google.android.material.floatingactionbutton;

import L0.I;
import L0.S;
import L3.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import g0.C4356c;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().width = f10.intValue();
            view2.requestLayout();
        }
    }

    public class b extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().height = f10.intValue();
            view2.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            int iIntValue = f10.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view2.setPaddingRelative(iIntValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    public class d extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f10.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a(Float.class, "width");
        new b(Float.class, "height");
        new c(Float.class, "paddingStart");
        new d(Float.class, "paddingEnd");
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(C4356c.h(i, "Unknown strategy type: "));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(g.b(getContext(), i));
    }

    public void setExtended(boolean z10) {
        if (z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(g.b(getContext(), i));
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(g.b(getContext(), i));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(g.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f22898a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f22899b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22900c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f22899b = false;
            this.f22900c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f15475h == 0) {
                fVar.f15475h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f15468a instanceof BottomSheetBehavior : false) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListE = coordinatorLayout.e(extendedFloatingActionButton);
            int size = arrayListE.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = (View) arrayListE.get(i10);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f15468a instanceof BottomSheetBehavior : false) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.r(i, extendedFloatingActionButton);
            return true;
        }

        public final void s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f22899b || this.f22900c) && fVar.f15473f == appBarLayout.getId()) {
                if (this.f22898a == null) {
                    this.f22898a = new Rect();
                }
                Rect rect = this.f22898a;
                d4.b.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.f22900c ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.f22900c ? 3 : 0);
                throw null;
            }
        }

        public final void t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f22899b || this.f22900c) && fVar.f15473f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.f22900c ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.f22900c ? 3 : 0);
                throw null;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3120g);
            this.f22899b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f22900c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
    }
}
