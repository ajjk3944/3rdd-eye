package androidx.appcompat.widget;

import R.O;
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
import g.AbstractC2327a;
import o.C2739t0;
import o.a1;
import o.q1;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: C, reason: collision with root package name */
    public int f4884C;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4885a;

    /* renamed from: b, reason: collision with root package name */
    public int f4886b;

    /* renamed from: c, reason: collision with root package name */
    public int f4887c;

    /* renamed from: d, reason: collision with root package name */
    public int f4888d;

    /* renamed from: e, reason: collision with root package name */
    public int f4889e;

    /* renamed from: f, reason: collision with root package name */
    public int f4890f;

    /* renamed from: g, reason: collision with root package name */
    public float f4891g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4892h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4893j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f4894k;

    /* renamed from: l, reason: collision with root package name */
    public int f4895l;

    /* renamed from: m, reason: collision with root package name */
    public int f4896m;

    /* renamed from: n, reason: collision with root package name */
    public int f4897n;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2739t0;
    }

    public final void d(Canvas canvas, int i) {
        this.f4894k.setBounds(getPaddingLeft() + this.f4884C, i, (getWidth() - getPaddingRight()) - this.f4884C, this.f4896m + i);
        this.f4894k.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.f4894k.setBounds(i, getPaddingTop() + this.f4884C, this.f4895l + i, (getHeight() - getPaddingBottom()) - this.f4884C);
        this.f4894k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2739t0 generateDefaultLayoutParams() {
        int i = this.f4888d;
        if (i == 0) {
            return new C2739t0(-2, -2);
        }
        if (i == 1) {
            return new C2739t0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2739t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C2739t0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f4886b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f4886b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4886b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f4887c;
        if (this.f4888d == 1 && (i = this.f4889e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4890f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4890f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C2739t0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4886b;
    }

    public Drawable getDividerDrawable() {
        return this.f4894k;
    }

    public int getDividerPadding() {
        return this.f4884C;
    }

    public int getDividerWidth() {
        return this.f4895l;
    }

    public int getGravity() {
        return this.f4889e;
    }

    public int getOrientation() {
        return this.f4888d;
    }

    public int getShowDividers() {
        return this.f4897n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4891g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2739t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2739t0 ? new C2739t0((C2739t0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2739t0((ViewGroup.MarginLayoutParams) layoutParams) : new C2739t0(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.f4897n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f4897n & 4) != 0;
        }
        if ((this.f4897n & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
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
        if (this.f4894k == null) {
            return;
        }
        int i3 = 0;
        if (this.f4888d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && i(i3)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C2739t0) childAt.getLayoutParams())).topMargin) - this.f4896m);
                }
                i3++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4896m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C2739t0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z6 = q1.f22618a;
        boolean z7 = getLayoutDirection() == 1;
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i3)) {
                C2739t0 c2739t0 = (C2739t0) childAt3.getLayoutParams();
                e(canvas, z7 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c2739t0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c2739t0).leftMargin) - this.f4895l);
            }
            i3++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C2739t0 c2739t02 = (C2739t0) childAt4.getLayoutParams();
                if (z7) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c2739t02).leftMargin;
                    i = this.f4895l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c2739t02).rightMargin;
                }
            } else if (z7) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f4895l;
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

    public void setBaselineAligned(boolean z6) {
        this.f4885a = z6;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f4886b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4894k) {
            return;
        }
        this.f4894k = drawable;
        if (drawable != null) {
            this.f4895l = drawable.getIntrinsicWidth();
            this.f4896m = drawable.getIntrinsicHeight();
        } else {
            this.f4895l = 0;
            this.f4896m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f4884C = i;
    }

    public void setGravity(int i) {
        if (this.f4889e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4889e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i3 = i & 8388615;
        int i6 = this.f4889e;
        if ((8388615 & i6) != i3) {
            this.f4889e = i3 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f4892h = z6;
    }

    public void setOrientation(int i) {
        if (this.f4888d != i) {
            this.f4888d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4897n) {
            requestLayout();
        }
        this.f4897n = i;
    }

    public void setVerticalGravity(int i) {
        int i3 = i & 112;
        int i6 = this.f4889e;
        if ((i6 & 112) != i3) {
            this.f4889e = i3 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f4891g = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4885a = true;
        this.f4886b = -1;
        this.f4887c = 0;
        this.f4889e = 8388659;
        int[] iArr = AbstractC2327a.f20127o;
        a1 a1VarI = a1.i(context, attributeSet, iArr, i);
        O.l(this, context, iArr, attributeSet, (TypedArray) a1VarI.f22480c, i);
        TypedArray typedArray = (TypedArray) a1VarI.f22480c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z6 = typedArray.getBoolean(2, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f4891g = typedArray.getFloat(4, -1.0f);
        this.f4886b = typedArray.getInt(3, -1);
        this.f4892h = typedArray.getBoolean(7, false);
        setDividerDrawable(a1VarI.d(5));
        this.f4897n = typedArray.getInt(8, 0);
        this.f4884C = typedArray.getDimensionPixelSize(6, 0);
        a1VarI.j();
    }
}
