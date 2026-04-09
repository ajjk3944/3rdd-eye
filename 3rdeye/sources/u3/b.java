package U3;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: ChipGroup.java */
/* loaded from: classes2.dex */
public final class b extends d4.c {

    /* renamed from: f, reason: collision with root package name */
    public int f12465f;

    /* renamed from: g, reason: collision with root package name */
    public int f12466g;

    /* compiled from: ChipGroup.java */
    public class a implements d {
    }

    /* compiled from: ChipGroup.java */
    /* renamed from: U3.b$b, reason: collision with other inner class name */
    public static class C0174b extends ViewGroup.MarginLayoutParams {
    }

    /* compiled from: ChipGroup.java */
    @Deprecated
    public interface c {
    }

    /* compiled from: ChipGroup.java */
    public interface d {
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof Chip) && getChildAt(i10).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // d4.c
    public final boolean a() {
        return this.f37488d;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0174b);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0174b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0174b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f12465f;
    }

    public int getChipSpacingVertical() {
        return this.f12466g;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f37488d) {
            getVisibleChipCount();
        }
        getRowCount();
        throw null;
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f12465f != i) {
            this.f12465f = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f12466g != i) {
            this.f12466g = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a());
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw null;
    }

    public void setSelectionRequired(boolean z10) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // d4.c
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        throw null;
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0174b(layoutParams);
    }

    public void setOnCheckedStateChangeListener(d dVar) {
    }
}
