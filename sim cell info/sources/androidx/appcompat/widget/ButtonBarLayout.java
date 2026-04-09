package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    private boolean f756b;

    /* renamed from: c, reason: collision with root package name */
    private int f757c;

    /* renamed from: d, reason: collision with root package name */
    private int f758d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f757c = -1;
        this.f758d = 0;
        int[] iArr = a.j.O0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        this.f756b = typedArrayObtainStyledAttributes.getBoolean(a.j.P0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z2) {
        setOrientation(z2 ? 1 : 0);
        setGravity(z2 ? 5 : 80);
        View viewFindViewById = findViewById(a.f.G);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z2 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f758d, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (this.f756b) {
            if (size > this.f757c && b()) {
                setStacked(false);
            }
            this.f757c = size;
        }
        if (b() || View.MeasureSpec.getMode(i2) != 1073741824) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.f756b && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (a0.s.u(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f756b != z2) {
            this.f756b = z2;
            if (!z2 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
