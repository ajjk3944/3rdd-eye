package androidx.appcompat.widget;

import L0.I;
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
import g.C4353a;
import g0.C4356c;
import o.X;
import o.f0;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14628b;

    /* renamed from: c, reason: collision with root package name */
    public int f14629c;

    /* renamed from: d, reason: collision with root package name */
    public int f14630d;

    /* renamed from: e, reason: collision with root package name */
    public int f14631e;

    /* renamed from: f, reason: collision with root package name */
    public int f14632f;

    /* renamed from: g, reason: collision with root package name */
    public int f14633g;

    /* renamed from: h, reason: collision with root package name */
    public float f14634h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f14635j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f14636k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f14637l;

    /* renamed from: m, reason: collision with root package name */
    public int f14638m;

    /* renamed from: n, reason: collision with root package name */
    public int f14639n;

    /* renamed from: o, reason: collision with root package name */
    public int f14640o;

    /* renamed from: p, reason: collision with root package name */
    public int f14641p;

    public static class a extends LinearLayout.LayoutParams {
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i) {
        this.f14637l.setBounds(getPaddingLeft() + this.f14641p, i, (getWidth() - getPaddingRight()) - this.f14641p, this.f14639n + i);
        this.f14637l.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f14637l.setBounds(i, getPaddingTop() + this.f14641p, this.f14638m + i, (getHeight() - getPaddingBottom()) - this.f14641p);
        this.f14637l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.f14631e;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f14629c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f14629c;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14629c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iC = this.f14630d;
        if (this.f14631e == 1 && (i = this.f14632f & 112) != 48) {
            if (i == 16) {
                iC = C4356c.c(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f14633g, 2, iC);
            } else if (i == 80) {
                iC = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14633g;
            }
        }
        return iC + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14629c;
    }

    public Drawable getDividerDrawable() {
        return this.f14637l;
    }

    public int getDividerPadding() {
        return this.f14641p;
    }

    public int getDividerWidth() {
        return this.f14638m;
    }

    public int getGravity() {
        return this.f14632f;
    }

    public int getOrientation() {
        return this.f14631e;
    }

    public int getShowDividers() {
        return this.f14640o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14634h;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return (this.f14640o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f14640o & 4) != 0;
        }
        if ((this.f14640o & 2) != 0) {
            for (int i10 = i - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
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
        int i;
        if (this.f14637l == null) {
            return;
        }
        int i10 = 0;
        if (this.f14631e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && k(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f14639n);
                }
                i10++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f14639n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = f0.f44665a;
        boolean z11 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i10)) {
                a aVar = (a) childAt3.getLayoutParams();
                e(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f14638m);
            }
            i10++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i = this.f14638m;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f14638m;
                right = left - i;
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

    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f14628b = z10;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f14629c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14637l) {
            return;
        }
        this.f14637l = drawable;
        if (drawable != null) {
            this.f14638m = drawable.getIntrinsicWidth();
            this.f14639n = drawable.getIntrinsicHeight();
        } else {
            this.f14638m = 0;
            this.f14639n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f14641p = i;
    }

    public void setGravity(int i) {
        if (this.f14632f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f14632f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i10 = i & 8388615;
        int i11 = this.f14632f;
        if ((8388615 & i11) != i10) {
            this.f14632f = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.i = z10;
    }

    public void setOrientation(int i) {
        if (this.f14631e != i) {
            this.f14631e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f14640o) {
            requestLayout();
        }
        this.f14640o = i;
    }

    public void setVerticalGravity(int i) {
        int i10 = i & 112;
        int i11 = this.f14632f;
        if ((i11 & 112) != i10) {
            this.f14632f = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f14634h = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f14628b = true;
        this.f14629c = -1;
        this.f14630d = 0;
        this.f14632f = 8388659;
        int[] iArr = C4353a.f37888n;
        X xE = X.e(context, attributeSet, iArr, 0);
        I.n(this, context, iArr, attributeSet, xE.f44608b, 0);
        TypedArray typedArray = xE.f44608b;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f14634h = typedArray.getFloat(4, -1.0f);
        this.f14629c = typedArray.getInt(3, -1);
        this.i = typedArray.getBoolean(7, false);
        setDividerDrawable(xE.b(5));
        this.f14640o = typedArray.getInt(8, 0);
        this.f14641p = typedArray.getDimensionPixelSize(6, 0);
        xE.f();
    }
}
