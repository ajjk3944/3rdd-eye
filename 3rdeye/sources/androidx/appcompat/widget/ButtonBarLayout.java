package androidx.appcompat.widget;

import L0.I;
import L0.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14618b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14619c;

    /* renamed from: d, reason: collision with root package name */
    public int f14620d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14620d = -1;
        int[] iArr = C4353a.f37885k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        I.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f14618b = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f14618b);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f14619c != z10) {
            if (!z10 || this.f14618b) {
                this.f14619c = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int iMakeMeasureSpec;
        boolean z10;
        int i11;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f14618b) {
            if (size > this.f14620d && this.f14619c) {
                setStacked(false);
            }
            this.f14620d = size;
        }
        if (this.f14619c || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i10);
        if (this.f14618b && !this.f14619c && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i, i10);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i11 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f14619c) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i13).getVisibility() == 0) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
                paddingBottom = i11 >= 0 ? getChildAt(i11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i10 == 0) {
                super.onMeasure(i, i10);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f14618b != z10) {
            this.f14618b = z10;
            if (!z10 && this.f14619c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
