package L6;

import android.view.View;
import android.view.ViewGroup;
import r7.C5533d;

/* compiled from: DivGalleryItemLayout.kt */
/* loaded from: classes.dex */
public final class g extends X6.g {
    @Override // X6.g, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, 0, layoutParams);
        if (getLayoutParams() == null) {
            if ((view != null ? view.getLayoutParams() : null) != null) {
                setLayoutParams(view.getLayoutParams());
            }
        }
    }

    @Override // r7.AbstractC5534e, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null || !layoutParams.equals(getLayoutParams());
    }

    @Override // r7.g, r7.AbstractC5534e, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams instanceof C5533d ? layoutParams : layoutParams == null ? new C5533d(-2, -2) : super.generateLayoutParams(layoutParams);
    }

    @Override // r7.AbstractC5534e, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        h.a(layoutParamsGenerateDefaultLayoutParams, layoutParams);
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override // r7.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        View child = getChild();
        if (child != null) {
            child.layout(0, 0, i11 - i, i12 - i10);
        }
    }

    @Override // r7.g, android.view.View
    public final void onMeasure(int i, int i10) {
        View child = getChild();
        if (child != null) {
            child.measure(i, i10);
            setMeasuredDimension(child.getMeasuredWidthAndState(), child.getMeasuredHeightAndState());
            return;
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), i, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), i10, 0));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        View child = getChild();
        if (child == null) {
            super.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams != null) {
            h.a(layoutParams, child.getLayoutParams());
        }
        super.setLayoutParams(layoutParams);
        child.setLayoutParams(layoutParams);
    }
}
