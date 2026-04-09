package j3;

import A3.p;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.apm.insight.R;
import java.util.ArrayList;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2562b extends p {

    /* renamed from: p0, reason: collision with root package name */
    public final int f21370p0;

    /* renamed from: q0, reason: collision with root package name */
    public final int f21371q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f21372r0;

    /* renamed from: s0, reason: collision with root package name */
    public final int f21373s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f21374t0;

    /* renamed from: u0, reason: collision with root package name */
    public final ArrayList f21375u0;

    public C2562b(Context context) {
        super(context);
        this.f21375u0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f21370p0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f21371q0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f21372r0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f21373s0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int childCount = getChildCount();
        int i8 = i6 - i;
        int i9 = i7 - i3;
        int measuredWidth = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i11 = i8 - measuredWidth;
                    childAt.layout(i11 - childAt.getMeasuredWidth(), 0, i11, i9);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i9);
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
        throw new UnsupportedOperationException("Method not decompiled: j3.C2562b.onMeasure(int, int):void");
    }

    public void setItemHorizontalTranslationEnabled(boolean z6) {
        this.f21374t0 = z6;
    }
}
