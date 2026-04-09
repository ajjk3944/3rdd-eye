package mi;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29382a;

    /* renamed from: b, reason: collision with root package name */
    public int f29383b;

    /* renamed from: c, reason: collision with root package name */
    public int f29384c;

    /* renamed from: d, reason: collision with root package name */
    public float f29385d;

    /* renamed from: e, reason: collision with root package name */
    public float f29386e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29387f;
    public ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f29388h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f29389i;

    public static float a(int i4, int i10, int i11, int i12) {
        if (i4 != -65536) {
            return i4;
        }
        if (i12 > 1) {
            return (i10 - i11) / (i12 - 1);
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getChildSpacing() {
        return this.f29383b;
    }

    public int getChildSpacingForLastRow() {
        return this.f29384c;
    }

    public float getRowSpacing() {
        return this.f29385d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        ArrayList arrayList = this.f29389i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        boolean z11 = this.f29387f;
        int width = z11 ? getWidth() - paddingRight : paddingLeft;
        int size = arrayList.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size) {
            int iIntValue = ((Integer) arrayList.get(i21)).intValue();
            int iIntValue2 = ((Integer) this.f29388h.get(i21)).intValue();
            float fFloatValue = ((Float) this.g.get(i21)).floatValue();
            int i23 = 0;
            while (i23 < iIntValue && i22 < getChildCount()) {
                int i24 = i22 + 1;
                View childAt = getChildAt(i22);
                ArrayList arrayList2 = arrayList;
                if (childAt.getVisibility() == 8) {
                    arrayList = arrayList2;
                    i22 = i24;
                } else {
                    i23++;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i16 = marginLayoutParams.leftMargin;
                        i13 = paddingLeft;
                        i15 = marginLayoutParams.rightMargin;
                        i14 = marginLayoutParams.topMargin;
                    } else {
                        i13 = paddingLeft;
                        i14 = 0;
                        i15 = 0;
                        i16 = 0;
                    }
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        i17 = paddingRight;
                        int i25 = width - i15;
                        z10 = z11;
                        i18 = size;
                        int i26 = paddingTop + i14;
                        i19 = i21;
                        childAt.layout(i25 - measuredWidth, i26, i25, i26 + measuredHeight);
                        i20 = (int) (width - (((measuredWidth + fFloatValue) + i16) + i15));
                    } else {
                        i17 = paddingRight;
                        z10 = z11;
                        i18 = size;
                        i19 = i21;
                        int i27 = width + i16;
                        int i28 = paddingTop + i14;
                        childAt.layout(i27, i28, i27 + measuredWidth, i28 + measuredHeight);
                        i20 = (int) (measuredWidth + fFloatValue + i16 + i15 + width);
                    }
                    width = i20;
                    arrayList = arrayList2;
                    paddingLeft = i13;
                    paddingRight = i17;
                    i22 = i24;
                    z11 = z10;
                    size = i18;
                    i21 = i19;
                }
            }
            ArrayList arrayList3 = arrayList;
            int i29 = paddingLeft;
            int i30 = paddingRight;
            boolean z12 = z11;
            int i31 = size;
            int i32 = i21;
            width = z12 ? getWidth() - i30 : i29;
            paddingTop = (int) (iIntValue2 + this.f29386e + paddingTop);
            i21 = i32 + 1;
            arrayList = arrayList3;
            paddingLeft = i29;
            paddingRight = i30;
            z11 = z12;
            size = i31;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0201  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.a.onMeasure(int, int):void");
    }

    public void setChildSpacing(int i4) {
        this.f29383b = i4;
        requestLayout();
    }

    public void setChildSpacingForLastRow(int i4) {
        this.f29384c = i4;
        requestLayout();
    }

    public void setFlow(boolean z3) {
        this.f29382a = z3;
        requestLayout();
    }

    public void setRowSpacing(float f10) {
        this.f29385d = f10;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
