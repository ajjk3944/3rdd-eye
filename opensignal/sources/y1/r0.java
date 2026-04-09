package y1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25769a;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f25770d;

    public r0(Context context) {
        super(context);
        setClipChildren(false);
        this.f25769a = new HashMap();
        this.f25770d = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, x1.f0> getHolderToLayoutNode() {
        return this.f25769a;
    }

    public final HashMap<x1.f0, Object> getLayoutNodeToHolder() {
        return this.f25770d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Iterator it = this.f25769a.keySet().iterator();
        if (it.hasNext()) {
            throw w.g.d(it);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            u1.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            u1.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Iterator it = this.f25769a.keySet().iterator();
        if (it.hasNext()) {
            throw w.g.d(it);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            x1.f0 f0Var = (x1.f0) this.f25769a.get(childAt);
            if (childAt.isLayoutRequested() && f0Var != null) {
                x1.f0.n0(f0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
