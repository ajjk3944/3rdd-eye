package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.j;
import io.sentry.k;
import p.m1;
import p.z2;
import u3.i0;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public float B;
    public boolean D;
    public int[] E;
    public int[] F;
    public Drawable G;
    public int H;
    public int I;
    public int J;
    public int K;

    /* renamed from: a, reason: collision with root package name */
    public boolean f979a;

    /* renamed from: d, reason: collision with root package name */
    public int f980d;

    /* renamed from: g, reason: collision with root package name */
    public int f981g;

    /* renamed from: r, reason: collision with root package name */
    public int f982r;

    /* renamed from: x, reason: collision with root package name */
    public int f983x;

    /* renamed from: y, reason: collision with root package name */
    public int f984y;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m1;
    }

    public final void d(Canvas canvas, int i10) {
        this.G.setBounds(getPaddingLeft() + this.K, i10, (getWidth() - getPaddingRight()) - this.K, this.I + i10);
        this.G.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.G.setBounds(i10, getPaddingTop() + this.K, this.H + i10, (getHeight() - getPaddingBottom()) - this.K);
        this.G.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public m1 generateDefaultLayoutParams() {
        int i10 = this.f982r;
        if (i10 == 0) {
            return new m1(-2, -2);
        }
        if (i10 == 1) {
            return new m1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public m1 generateLayoutParams(AttributeSet attributeSet) {
        return new m1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f980d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f980d;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f980d == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f981g;
        if (this.f982r == 1 && (i10 = this.f983x & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f984y) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f984y;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((m1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f980d;
    }

    public Drawable getDividerDrawable() {
        return this.G;
    }

    public int getDividerPadding() {
        return this.K;
    }

    public int getDividerWidth() {
        return this.H;
    }

    public int getGravity() {
        return this.f983x;
    }

    public int getOrientation() {
        return this.f982r;
    }

    public int getShowDividers() {
        return this.J;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public m1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m1 ? new m1((m1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m1((ViewGroup.MarginLayoutParams) layoutParams) : new m1(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            return (this.J & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.J & 4) != 0;
        }
        if ((this.J & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.G == null) {
            return;
        }
        int i11 = 0;
        if (this.f982r == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && i(i11)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((m1) childAt.getLayoutParams())).topMargin) - this.I);
                }
                i11++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.I : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((m1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = z2.f20220a;
        boolean z11 = getLayoutDirection() == 1;
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i11)) {
                m1 m1Var = (m1) childAt3.getLayoutParams();
                e(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) m1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) m1Var).leftMargin) - this.H);
            }
            i11++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                m1 m1Var2 = (m1) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) m1Var2).leftMargin;
                    i10 = this.H;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) m1Var2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.H;
                right = left - i10;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f979a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f980d = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.G) {
            return;
        }
        this.G = drawable;
        if (drawable != null) {
            this.H = drawable.getIntrinsicWidth();
            this.I = drawable.getIntrinsicHeight();
        } else {
            this.H = 0;
            this.I = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.K = i10;
    }

    public void setGravity(int i10) {
        if (this.f983x != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f983x = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f983x;
        if ((8388615 & i12) != i11) {
            this.f983x = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.D = z10;
    }

    public void setOrientation(int i10) {
        if (this.f982r != i10) {
            this.f982r = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.J) {
            requestLayout();
        }
        this.J = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f983x;
        if ((i12 & 112) != i11) {
            this.f983x = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.B = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f979a = true;
        this.f980d = -1;
        this.f981g = 0;
        this.f983x = 8388659;
        k kVarH0 = k.h0(context, attributeSet, j.LinearLayoutCompat, 0);
        i0.m(this, context, j.LinearLayoutCompat, attributeSet, (TypedArray) kVarH0.f12398g, 0, 0);
        int i11 = j.LinearLayoutCompat_android_orientation;
        TypedArray typedArray = (TypedArray) kVarH0.f12398g;
        int i12 = typedArray.getInt(i11, -1);
        if (i12 >= 0) {
            setOrientation(i12);
        }
        int i13 = typedArray.getInt(j.LinearLayoutCompat_android_gravity, -1);
        if (i13 >= 0) {
            setGravity(i13);
        }
        boolean z10 = typedArray.getBoolean(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.B = typedArray.getFloat(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f980d = typedArray.getInt(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.D = typedArray.getBoolean(j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(kVarH0.U(j.LinearLayoutCompat_divider));
        this.J = typedArray.getInt(j.LinearLayoutCompat_showDividers, 0);
        this.K = typedArray.getDimensionPixelSize(j.LinearLayoutCompat_dividerPadding, 0);
        kVarH0.l0();
    }
}
