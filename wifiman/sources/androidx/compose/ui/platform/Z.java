package androidx.compose.ui.platform;

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
public final class Z extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f29320a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f29321b;

    public Z(Context context) {
        super(context);
        setClipChildren(false);
        this.f29320a = new HashMap();
        this.f29321b = new HashMap();
    }

    public final void a(androidx.compose.ui.viewinterop.c cVar, Canvas canvas) {
        cVar.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<androidx.compose.ui.viewinterop.c, E0.G> getHolderToLayoutNode() {
        return this.f29320a;
    }

    public final HashMap<E0.G, androidx.compose.ui.viewinterop.c> getLayoutNodeToHolder() {
        return this.f29321b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (androidx.compose.ui.viewinterop.c cVar : this.f29320a.keySet()) {
            cVar.layout(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            B0.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            B0.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Iterator it = this.f29320a.keySet().iterator();
        while (it.hasNext()) {
            ((androidx.compose.ui.viewinterop.c) it.next()).v();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            E0.G g10 = (E0.G) this.f29320a.get(childAt);
            if (childAt.isLayoutRequested() && g10 != null) {
                E0.G.w1(g10, false, false, false, 7, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
