package r7;

import Q9.C1553s;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import g0.C4356c;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.x;

/* compiled from: FrameContainerLayout.kt */
/* loaded from: classes.dex */
public class g extends AbstractC5534e implements X6.e {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w9.i<Object>[] f45784m;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f45785d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f45786e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f45787f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f45788g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f45789h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f45790j;

    /* renamed from: k, reason: collision with root package name */
    public int f45791k;

    /* renamed from: l, reason: collision with root package name */
    public final C1553s f45792l;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(g.class, "aspectRatio", "getAspectRatio()F");
        x.f43661a.getClass();
        f45784m = new w9.i[]{nVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
        this.f45785d = new Rect();
        this.f45787f = new LinkedHashSet();
        this.f45788g = new LinkedHashSet();
        this.f45789h = new LinkedHashSet();
        this.f45792l = new C1553s(Float.valueOf(0.0f), X6.d.f13581g);
    }

    private final int getHorizontalPadding() {
        return getPaddingLeftWithForeground() + getPaddingRightWithForeground();
    }

    private final int getPaddingBottomWithForeground() {
        return Math.max(getPaddingBottom(), this.f45785d.bottom);
    }

    private final int getPaddingLeftWithForeground() {
        return Math.max(getPaddingLeft(), this.f45785d.left);
    }

    private final int getPaddingRightWithForeground() {
        return Math.max(getPaddingRight(), this.f45785d.right);
    }

    private final int getPaddingTopWithForeground() {
        return Math.max(getPaddingTop(), this.f45785d.top);
    }

    private final boolean getUseAspect() {
        return !(getAspectRatio() == 0.0f);
    }

    private final int getVerticalPadding() {
        return getPaddingTopWithForeground() + getPaddingBottomWithForeground();
    }

    @Override // r7.AbstractC5534e, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5533d(-1, -1);
    }

    public float getAspectRatio() {
        return ((Number) this.f45792l.a(this, f45784m[0])).floatValue();
    }

    public final boolean getMeasureAllChildren() {
        return this.f45786e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (right - left) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        int paddingBottomWithForeground = (bottom - top) - getPaddingBottomWithForeground();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                C5533d c5533d = (C5533d) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int absoluteGravity = Gravity.getAbsoluteGravity(c5533d.f45758a, getLayoutDirection());
                int i14 = c5533d.f45758a & 112;
                int i15 = absoluteGravity & 7;
                int iC = i15 != 1 ? i15 != 5 ? ((ViewGroup.MarginLayoutParams) c5533d).leftMargin + paddingLeftWithForeground : (paddingRightWithForeground - measuredWidth) - ((ViewGroup.MarginLayoutParams) c5533d).rightMargin : C4356c.c(((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) + ((ViewGroup.MarginLayoutParams) c5533d).leftMargin, ((ViewGroup.MarginLayoutParams) c5533d).rightMargin, 2, paddingLeftWithForeground);
                int iC2 = i14 != 16 ? i14 != 80 ? ((ViewGroup.MarginLayoutParams) c5533d).topMargin + paddingTopWithForeground : (paddingBottomWithForeground - measuredHeight) - ((ViewGroup.MarginLayoutParams) c5533d).bottomMargin : C4356c.c(((paddingBottomWithForeground - paddingTopWithForeground) - measuredHeight) + ((ViewGroup.MarginLayoutParams) c5533d).topMargin, ((ViewGroup.MarginLayoutParams) c5533d).bottomMargin, 2, paddingTopWithForeground);
                childAt.layout(iC, iC2, measuredWidth + iC, measuredHeight + iC2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0111 A[PHI: r2
  0x0111: PHI (r2v17 int) = (r2v2 int), (r2v8 int), (r2v2 int) binds: [B:68:0x010f, B:210:0x0111, B:72:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.g.onMeasure(int, int):void");
    }

    @Override // X6.e
    public void setAspectRatio(float f10) {
        this.f45792l.e(this, f45784m[0], Float.valueOf(f10));
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (getForegroundGravity() == i) {
            return;
        }
        super.setForegroundGravity(i);
        int foregroundGravity = getForegroundGravity();
        Rect rect = this.f45785d;
        if (foregroundGravity != 119 || getForeground() == null) {
            rect.setEmpty();
        } else {
            getForeground().getPadding(rect);
        }
        requestLayout();
    }

    public final void setMeasureAllChildren(boolean z10) {
        this.f45786e = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static /* synthetic */ void getMeasureAllChildren$annotations() {
    }
}
