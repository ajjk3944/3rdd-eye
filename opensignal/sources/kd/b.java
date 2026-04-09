package kd;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import zd.i;

/* loaded from: classes.dex */
public final class b extends i {
    public final int A0;
    public boolean B0;
    public final ArrayList C0;

    /* renamed from: x0, reason: collision with root package name */
    public final int f14290x0;

    /* renamed from: y0, reason: collision with root package name */
    public final int f14291y0;

    /* renamed from: z0, reason: collision with root package name */
    public final int f14292z0;

    public b(Context context) {
        super(context);
        this.C0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f14290x0 = resources.getDimensionPixelSize(ed.d.design_bottom_navigation_item_max_width);
        this.f14291y0 = resources.getDimensionPixelSize(ed.d.design_bottom_navigation_item_min_width);
        this.f14292z0 = resources.getDimensionPixelSize(ed.d.design_bottom_navigation_active_item_max_width);
        this.A0 = resources.getDimensionPixelSize(ed.d.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.b.onMeasure(int, int):void");
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.B0 = z10;
    }
}
