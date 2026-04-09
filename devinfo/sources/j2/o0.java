package j2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27243a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f27244b;

    public o0(Context context) {
        super(context);
        setClipChildren(false);
        this.f27243a = new HashMap();
        this.f27244b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<g3.j, i2.e0> getHolderToLayoutNode() {
        return this.f27243a;
    }

    public final HashMap<i2.e0, g3.j> getLayoutNodeToHolder() {
        return this.f27244b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        for (g3.j jVar : this.f27243a.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        int i11;
        if (!(View.MeasureSpec.getMode(i4) == 1073741824)) {
            f2.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            f2.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i10));
        for (g3.j jVar : this.f27243a.keySet()) {
            int i12 = jVar.f24497v;
            if (i12 != Integer.MIN_VALUE && (i11 = jVar.f24498w) != Integer.MIN_VALUE) {
                jVar.measure(i12, i11);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            i2.e0 e0Var = (i2.e0) this.f27243a.get(childAt);
            if (childAt.isLayoutRequested() && e0Var != null) {
                i2.e0.V(e0Var, false, 7);
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
