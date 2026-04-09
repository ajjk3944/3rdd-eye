package s4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.a;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.i;
import j4.k;
import j4.l;
import java.util.List;
import java.util.Set;
import s0.x;

/* loaded from: classes2.dex */
public class c extends i {

    /* renamed from: k, reason: collision with root package name */
    public static final int f24287k = k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: e, reason: collision with root package name */
    public int f24288e;

    /* renamed from: f, reason: collision with root package name */
    public int f24289f;

    /* renamed from: g, reason: collision with root package name */
    public e f24290g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.material.internal.a f24291h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24292i;

    /* renamed from: j, reason: collision with root package name */
    public final f f24293j;

    public class a implements a.b {
        public a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set set) {
            if (c.this.f24290g != null) {
                e eVar = c.this.f24290g;
                c cVar = c.this;
                eVar.a(cVar, cVar.f24291h.j(c.this));
            }
        }
    }

    public class b implements e {
        public b(d dVar) {
        }

        @Override // s4.c.e
        public void a(c cVar, List list) {
            if (c.this.f24291h.l()) {
                c.this.getCheckedChipId();
                throw null;
            }
        }
    }

    /* renamed from: s4.c$c, reason: collision with other inner class name */
    public static class C0478c extends ViewGroup.MarginLayoutParams {
        public C0478c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0478c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0478c(int i10, int i11) {
            super(i10, i11);
        }
    }

    public interface d {
    }

    public interface e {
        void a(c cVar, List list);
    }

    public class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f24296a;

        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == c.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(View.generateViewId());
                }
                c.this.f24291h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24296a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            c cVar = c.this;
            if (view == cVar && (view2 instanceof Chip)) {
                cVar.f24291h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24296a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ f(c cVar, a aVar) {
            this();
        }
    }

    public c(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && h(i11)) {
                i10++;
            }
        }
        return i10;
    }

    @Override // com.google.android.material.internal.i
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0478c);
    }

    public int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && h(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0478c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0478c(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f24291h.k();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f24291h.j(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f24288e;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f24289f;
    }

    public final boolean h(int i10) {
        return getChildAt(i10).getVisibility() == 0;
    }

    public boolean i() {
        return this.f24291h.l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f24292i;
        if (i10 != -1) {
            this.f24291h.f(i10);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.R0(accessibilityNodeInfo).o0(x.e.b(getRowCount(), c() ? getVisibleChipCount() : -1, false, i() ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(@Dimension int i10) {
        if (this.f24288e != i10) {
            this.f24288e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(@DimenRes int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(@Dimension int i10) {
        if (this.f24289f != i10) {
            this.f24289f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable e eVar) {
        this.f24290g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24293j.f24296a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f24291h.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.i
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f24291h.q(z10);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0478c(layoutParams);
    }

    public void setSingleLine(@BoolRes int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(@BoolRes int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f24287k;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a();
        this.f24291h = aVar;
        f fVar = new f(this, null);
        this.f24293j = fVar;
        TypedArray typedArrayI = a0.i(getContext(), attributeSet, l.ChipGroup, i10, i11, new int[0]);
        int dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayI.getDimensionPixelOffset(l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayI.getDimensionPixelOffset(l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayI.getBoolean(l.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayI.getBoolean(l.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayI.getBoolean(l.ChipGroup_selectionRequired, false));
        this.f24292i = typedArrayI.getResourceId(l.ChipGroup_checkedChip, -1);
        typedArrayI.recycle();
        aVar.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        setImportantForAccessibility(1);
    }
}
