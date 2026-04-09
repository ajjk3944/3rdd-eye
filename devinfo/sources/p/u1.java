package p;

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
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class u1 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30877a;

    /* renamed from: b, reason: collision with root package name */
    public int f30878b;

    /* renamed from: c, reason: collision with root package name */
    public int f30879c;

    /* renamed from: d, reason: collision with root package name */
    public int f30880d;

    /* renamed from: e, reason: collision with root package name */
    public int f30881e;

    /* renamed from: f, reason: collision with root package name */
    public int f30882f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30883h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f30884i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f30885k;

    /* renamed from: l, reason: collision with root package name */
    public int f30886l;

    /* renamed from: m, reason: collision with root package name */
    public int f30887m;

    /* renamed from: n, reason: collision with root package name */
    public int f30888n;

    /* renamed from: o, reason: collision with root package name */
    public int f30889o;

    public u1(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f30877a = true;
        this.f30878b = -1;
        this.f30879c = 0;
        this.f30881e = 8388659;
        int[] iArr = h.a.f24787n;
        i0.f fVarJ = i0.f.J(context, attributeSet, iArr, i4);
        e4.v0.n(this, context, iArr, attributeSet, (TypedArray) fVarJ.f25417c, i4);
        TypedArray typedArray = (TypedArray) fVarJ.f25417c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.g = typedArray.getFloat(4, -1.0f);
        this.f30878b = typedArray.getInt(3, -1);
        this.f30883h = typedArray.getBoolean(7, false);
        setDividerDrawable(fVarJ.A(5));
        this.f30888n = typedArray.getInt(8, 0);
        this.f30889o = typedArray.getDimensionPixelSize(6, 0);
        fVarJ.M();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t1;
    }

    public final void d(Canvas canvas, int i4) {
        this.f30885k.setBounds(getPaddingLeft() + this.f30889o, i4, (getWidth() - getPaddingRight()) - this.f30889o, this.f30887m + i4);
        this.f30885k.draw(canvas);
    }

    public final void e(Canvas canvas, int i4) {
        this.f30885k.setBounds(i4, getPaddingTop() + this.f30889o, this.f30886l + i4, (getHeight() - getPaddingBottom()) - this.f30889o);
        this.f30885k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t1 generateDefaultLayoutParams() {
        int i4 = this.f30880d;
        if (i4 == 0) {
            return new t1(-2, -2);
        }
        if (i4 == 1) {
            return new t1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public t1 generateLayoutParams(AttributeSet attributeSet) {
        return new t1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f30878b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f30878b;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f30878b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f30879c;
        if (this.f30880d == 1 && (i4 = this.f30881e & AppLovinMediationAdapter.ERROR_CHILD_USER) != 48) {
            if (i4 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f30882f) / 2;
            } else if (i4 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f30882f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f30878b;
    }

    public Drawable getDividerDrawable() {
        return this.f30885k;
    }

    public int getDividerPadding() {
        return this.f30889o;
    }

    public int getDividerWidth() {
        return this.f30886l;
    }

    public int getGravity() {
        return this.f30881e;
    }

    public int getOrientation() {
        return this.f30880d;
    }

    public int getShowDividers() {
        return this.f30888n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t1 ? new t1((t1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new t1((ViewGroup.MarginLayoutParams) layoutParams) : new t1(layoutParams);
    }

    public final boolean i(int i4) {
        if (i4 == 0) {
            return (this.f30888n & 1) != 0;
        }
        if (i4 == getChildCount()) {
            return (this.f30888n & 4) != 0;
        }
        if ((this.f30888n & 2) != 0) {
            for (int i10 = i4 - 1; i10 >= 0; i10--) {
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
        int i4;
        if (this.f30885k == null) {
            return;
        }
        int i10 = 0;
        if (this.f30880d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin) - this.f30887m);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f30887m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((t1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z3 = v3.f30896a;
        boolean z10 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                t1 t1Var = (t1) childAt3.getLayoutParams();
                e(canvas, z10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) t1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) t1Var).leftMargin) - this.f30886l);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                t1 t1Var2 = (t1) childAt4.getLayoutParams();
                if (z10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                    i4 = this.f30886l;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) t1Var2).rightMargin;
                }
            } else if (z10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f30886l;
                right = left - i4;
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
        throw new UnsupportedOperationException("Method not decompiled: p.u1.onLayout(boolean, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: p.u1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f30877a = z3;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f30878b = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f30885k) {
            return;
        }
        this.f30885k = drawable;
        if (drawable != null) {
            this.f30886l = drawable.getIntrinsicWidth();
            this.f30887m = drawable.getIntrinsicHeight();
        } else {
            this.f30886l = 0;
            this.f30887m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f30889o = i4;
    }

    public void setGravity(int i4) {
        if (this.f30881e != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & AppLovinMediationAdapter.ERROR_CHILD_USER) == 0) {
                i4 |= 48;
            }
            this.f30881e = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i10 = i4 & 8388615;
        int i11 = this.f30881e;
        if ((8388615 & i11) != i10) {
            this.f30881e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f30883h = z3;
    }

    public void setOrientation(int i4) {
        if (this.f30880d != i4) {
            this.f30880d = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f30888n) {
            requestLayout();
        }
        this.f30888n = i4;
    }

    public void setVerticalGravity(int i4) {
        int i10 = i4 & AppLovinMediationAdapter.ERROR_CHILD_USER;
        int i11 = this.f30881e;
        if ((i11 & AppLovinMediationAdapter.ERROR_CHILD_USER) != i10) {
            this.f30881e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
