package zc;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f38207a;

    /* renamed from: b, reason: collision with root package name */
    public int f38208b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38209c;

    /* renamed from: d, reason: collision with root package name */
    public int f38210d;

    public int getItemSpacing() {
        return this.f38208b;
    }

    public int getLineSpacing() {
        return this.f38207a;
    }

    public int getRowCount() {
        return this.f38210d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        int marginEnd;
        int marginStart;
        boolean z10;
        int i13 = 0;
        if (getChildCount() == 0) {
            this.f38210d = 0;
            return;
        }
        boolean z11 = true;
        this.f38210d = 1;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z12 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = 0;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        while (i14 < getChildCount()) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z10 = z11;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i13;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i16 = i11 - i4;
                z10 = z11;
                int i17 = i16 - paddingLeft;
                if (!this.f38209c && measuredWidth2 > i17) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingRight + marginStart;
                    i15 = paddingTop + this.f38207a;
                    this.f38210d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f38210d - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z12) {
                    childAt.layout(i16 - measuredWidth2, i15, (i16 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i15, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f38208b;
                paddingTop = measuredHeight;
            }
            i14++;
            z11 = z10;
            i13 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = i12;
                if (childAt.getMeasuredWidth() + paddingLeft + i13 > paddingRight && !((ChipGroup) this).f38209c) {
                    paddingLeft = getPaddingLeft();
                    i15 = paddingTop + this.f38207a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i13 + i18 + this.f38208b + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i18;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i11 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i11 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i11) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i4) {
        this.f38208b = i4;
    }

    public void setLineSpacing(int i4) {
        this.f38207a = i4;
    }

    public void setSingleLine(boolean z3) {
        this.f38209c = z3;
    }
}
